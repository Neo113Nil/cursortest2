package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import io.agora.base.ColorSpace;
import io.agora.base.JavaI010Buffer;
import io.agora.base.JavaI420Buffer;
import io.agora.base.NV12Buffer;
import io.agora.base.NV21Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EncodedImage;
import io.agora.base.internal.video.HdrUtil;
import io.agora.base.internal.video.VideoDecoder;
import io.agora.base.internal.video.VideoDecoderUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import lb.C5444x;

@TargetApi(16)
/* loaded from: classes2.dex */
class HardwareVideoDecoder implements VideoDecoder, VideoSink {
    private static final boolean DEBUG = false;
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_HIGH_LATENCY_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final String FEATURE_LowLatency = "low-latency";
    private static final int INVALID_PRESENTATIO_LIMIT = 3;
    private static final int MAX_DECODER_Q_SIZE = 5;
    private static final int MAX_DECODER_Q_WAIT_TIMEOUT_MS = 2000;
    private static final int MAX_DECODE_HIGH_LATENCY_TIME_MS = 300;
    private static final int MAX_DECODE_TIME_MS = 2000;
    private static final int MAX_DEQUEUED_OUTPUTBUFFERS = 3;
    private static final int MAX_HIGH_LATENCY_DECODE_LIMIT = 8;
    private static final int MAX_TEXTURE_BUFFER_COUNT = 16;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final String MEDIA_FORMAT_KEY_CROP_BOTTOM = "crop-bottom";
    private static final String MEDIA_FORMAT_KEY_CROP_LEFT = "crop-left";
    private static final String MEDIA_FORMAT_KEY_CROP_RIGHT = "crop-right";
    private static final String MEDIA_FORMAT_KEY_CROP_TOP = "crop-top";
    private static final String MEDIA_FORMAT_KEY_SLICE_HEIGHT = "slice-height";
    private static final String MEDIA_FORMAT_KEY_STRIDE = "stride";
    private static final String TAG = "HardwareVideoDecoder";
    private static Map<String, Boolean> codecUnavailableMap = new ConcurrentHashMap();
    private VideoDecoder.Callback callback;
    private final String codecName;
    private final VideoCodecType codecType;
    private Integer colorFormat;
    private String customConfigJson;
    private int deliveredCount;
    private boolean deliveredVideoFrame;
    private int dequeueOutputTimeUs;
    private Surface directSurface;
    private boolean fallbackByCodecError;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean highLatencyTrigger;
    private final MediaCodecInfo info;
    private boolean keyFrameRequired;
    private long lastPresentationTimestampUs;
    private int maxDecodeTimeMs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private ThreadUtils.ThreadChecker outputThreadChecker;
    private final Map<String, String> params;
    private Handler proxyThreadHandler;
    private DecodedTextureMetadata renderedTextureMetadata;
    private VideoDecoder.Settings settings;
    private EglBase.Context sharedContext;
    private boolean shouldResetCodec;
    private int sliceHeight;
    private int stride;
    private volatile VideoDecoderUtils.SupportCodecInfo supportCodecInfo;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;
    private long firstDecoderQueueFullMs = -1;
    private long firstInvalidPresentationMs = -1;
    private int invalidPresentationCount = 0;
    private final Queue<TimeStamps> decodeTimeStamps = new ConcurrentLinkedQueue();
    private volatile boolean running = false;
    private volatile Exception shutdownException = null;
    private final Object dimensionLock = new Object();
    private int maxSupportedWidth = 0;
    private int minSupportedWidth = 0;
    private int maxSupportedHeight = 0;
    private int minSupportedHeight = 0;
    private boolean isHisiCodec = false;
    private boolean textureCopy = true;
    private Surface surface = null;
    private final Object textureMetadataLock = new Object();
    private final Queue<DecodedTextureMetadata> dequeuedSurfaceOutputBuffers = new LinkedList();
    private MediaCodecWrapper codec = null;
    private Map<Long, CodecSpecificInfo> codecSpecificInfoMap = new ConcurrentHashMap();
    private Map<Long, FrameExtraInfo> bframeExtraInfoMap = new ConcurrentHashMap();

    public static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final int delaySize;
        final int height;
        private final long infoPresentationTimeUs;
        final int outputBufferIndex;
        final long presentationTimestampUs;
        final long prevElapsedRealtime;
        final int rotation;
        final int width;

        public DecodedTextureMetadata(int i10, int i11, int i12, int i13, long j10, Integer num, int i14, long j11, long j12) {
            this.outputBufferIndex = i10;
            this.width = i11;
            this.height = i12;
            this.rotation = i13;
            this.presentationTimestampUs = j10;
            this.decodeTimeMs = num;
            this.delaySize = i14;
            this.prevElapsedRealtime = j11;
            this.infoPresentationTimeUs = j12;
        }
    }

    public static class TimeStamps {
        private final long presentationTimeStampUs;
        private final long prevElapsedRealtime;
        private final int rotation;

        public TimeStamps(long j10, long j11, int i10) {
            this.prevElapsedRealtime = j10;
            this.presentationTimeStampUs = j11;
            this.rotation = i10;
        }
    }

    public HardwareVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecType videoCodecType, Map<String, String> map, MediaCodecInfo mediaCodecInfo, EglBase.Context context, Surface surface) {
        this.dequeueOutputTimeUs = DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US;
        this.maxDecodeTimeMs = 2000;
        if (MediaCodecUtils.useHighLatencyStrategy()) {
            this.dequeueOutputTimeUs = 500000;
            this.maxDecodeTimeMs = 300;
        }
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecType;
        this.params = map;
        this.sharedContext = context;
        this.directSurface = surface;
        this.info = mediaCodecInfo;
    }

    public static /* synthetic */ long access$604(HardwareVideoDecoder hardwareVideoDecoder) {
        long j10 = hardwareVideoDecoder.lastPresentationTimestampUs + 1;
        hardwareVideoDecoder.lastPresentationTimestampUs = j10;
        return j10;
    }

    private VideoFrame.Buffer copyI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        if (i10 % 2 != 0) {
            throw new AssertionError("Stride is not divisible by two: " + i10);
        }
        int i14 = (i12 + 1) / 2;
        int i15 = i11 % 2;
        int i16 = i15 == 0 ? (i13 + 1) / 2 : i13 / 2;
        int i17 = i10 / 2;
        int i18 = i10 * i11;
        int i19 = i17 * i16;
        int i20 = i18 + ((i17 * i11) / 2);
        int i21 = i20 + i19;
        VideoFrame.I420Buffer allocateI420Buffer = allocateI420Buffer(i12, i13);
        byteBuffer.limit(i10 * i13);
        byteBuffer.position(0);
        copyPlane(byteBuffer.slice(), i10, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i12, i13);
        byteBuffer.limit(i18 + i19);
        byteBuffer.position(i18);
        copyPlane(byteBuffer.slice(), i17, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i14, i16);
        if (i15 == 1) {
            byteBuffer.position(i18 + (i17 * (i16 - 1)));
            ByteBuffer dataU = allocateI420Buffer.getDataU();
            dataU.position(allocateI420Buffer.getStrideU() * i16);
            dataU.put(byteBuffer);
        }
        byteBuffer.limit(i21);
        byteBuffer.position(i20);
        copyPlane(byteBuffer.slice(), i17, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i14, i16);
        if (i15 == 1) {
            byteBuffer.position(i20 + (i17 * (i16 - 1)));
            ByteBuffer dataV = allocateI420Buffer.getDataV();
            dataV.position(allocateI420Buffer.getStrideV() * i16);
            dataV.put(byteBuffer);
        }
        return allocateI420Buffer;
    }

    private VideoFrame.Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        return new NV12Buffer(i12, i13, i10, i11, byteBuffer, null).toI420();
    }

    private VideoFrame.Buffer copyNV21ToI420Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        return new NV21Buffer(i12, i13, i10, i11, byteBuffer, null).toI420();
    }

    private VideoFrame.Buffer copyP010ToIo10Buffer(ByteBuffer byteBuffer, int i10, int i11, int i12, int i13) {
        byteBuffer.position(0);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i10 * i11 * 2);
        ByteBuffer slice2 = byteBuffer.slice();
        JavaI010Buffer allocate = JavaI010Buffer.allocate(i12, i13);
        YuvHelper.P010ToI010(slice, i10, slice2, i10, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i12, i13);
        return allocate;
    }

    private Thread createOutputThread() {
        return new Thread("HardwareVideoDecoder.outputThread") { // from class: io.agora.base.internal.video.HardwareVideoDecoder.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                HardwareVideoDecoder.this.outputThreadChecker = new ThreadUtils.ThreadChecker();
                while (HardwareVideoDecoder.this.running) {
                    HardwareVideoDecoder.this.deliverDecodedFrame();
                }
                HardwareVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void debug_log(String str) {
    }

    /* JADX WARN: Finally extract failed */
    private void deliverByteFrame(int i10, MediaCodec.BufferInfo bufferInfo) {
        int i11;
        int i12;
        int i13;
        int i14;
        ByteBuffer byteBuffer;
        HardwareVideoDecoder hardwareVideoDecoder;
        VideoFrame.Buffer copyNV12ToI420Buffer;
        VideoFrame videoFrame;
        synchronized (this.dimensionLock) {
            try {
                i11 = this.width;
                i12 = this.height;
                i13 = this.stride;
                i14 = this.sliceHeight;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        if (this.settings.lumaBitDepth != HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
            int i15 = bufferInfo.size;
            if (i15 < ((i11 * i12) * 3) / 2) {
                Logging.e(TAG, "Insufficient output buffer size: " + bufferInfo.size);
                return;
            }
            if (i15 < ((i13 * i12) * 3) / 2 && i14 == i12 && i13 > i11) {
                i13 = (i15 * 2) / (i12 * 3);
            }
        }
        int i16 = i13;
        try {
            byteBuffer = this.codec.getOutputBuffers()[i10];
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "getOutputBuffers failed", e10);
            byteBuffer = null;
        }
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat.intValue() == 19) {
            hardwareVideoDecoder = this;
            copyNV12ToI420Buffer = hardwareVideoDecoder.copyI420Buffer(slice, i16, i14, i11, i12);
        } else {
            hardwareVideoDecoder = this;
            if (hardwareVideoDecoder.colorFormat.intValue() == 54) {
                copyNV12ToI420Buffer = hardwareVideoDecoder.copyP010ToIo10Buffer(slice, i16, i14, i11, i12);
            } else if (hardwareVideoDecoder.isHisiCodec && hardwareVideoDecoder.colorFormat.intValue() == 39) {
                copyNV12ToI420Buffer = hardwareVideoDecoder.copyNV21ToI420Buffer(slice, i16, i14, i11, i12);
                hardwareVideoDecoder = this;
            } else {
                hardwareVideoDecoder = this;
                copyNV12ToI420Buffer = hardwareVideoDecoder.copyNV12ToI420Buffer(slice, i16, i14, i11, i12);
            }
        }
        VideoFrame.Buffer buffer = copyNV12ToI420Buffer;
        try {
            hardwareVideoDecoder.codec.releaseOutputBuffer(i10, false);
        } catch (IllegalStateException e11) {
            Logging.e(TAG, "deliverByteFrame failed", e11);
        } catch (Exception e12) {
            Logging.e(TAG, "deliverByteFrame error", e12);
        }
        int size = hardwareVideoDecoder.decodeTimeStamps.size();
        TimeStamps poll = hardwareVideoDecoder.decodeTimeStamps.poll();
        if (poll == null) {
            Logging.e(TAG, "deliverByteFrame cannot find presentationTimeUs.");
            return;
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - poll.prevElapsedRealtime);
        long j10 = bufferInfo.presentationTimeUs;
        if (j10 == 0) {
            j10 = poll.presentationTimeStampUs;
        }
        VideoFrame videoFrame2 = new VideoFrame(buffer, poll.rotation, 1000 * j10);
        CodecSpecificInfo remove = hardwareVideoDecoder.codecSpecificInfoMap.remove(Long.valueOf(j10));
        FrameExtraInfo remove2 = hardwareVideoDecoder.bframeExtraInfoMap.remove(Long.valueOf(j10));
        if (remove2 == null) {
            Logging.e(TAG, "HW frameExtraInfo empty. cannot find: " + j10);
            hardwareVideoDecoder.fallbackByCodecError = true;
            videoFrame2.release();
            return;
        }
        if (remove == null) {
            Logging.e(TAG, "HW decodeTimeStamps empty. cannot find: " + j10);
        }
        int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - poll.prevElapsedRealtime);
        if (elapsedRealtime2 > hardwareVideoDecoder.maxDecodeTimeMs) {
            if (MediaCodecUtils.useHighLatencyStrategy() && hardwareVideoDecoder.deliveredCount >= 8) {
                hardwareVideoDecoder.highLatencyTrigger = true;
                hardwareVideoDecoder.deliveredCount = 0;
            }
            Logging.w(TAG, "Very high decode time: " + elapsedRealtime2 + "ms.");
            elapsedRealtime2 = hardwareVideoDecoder.maxDecodeTimeMs;
        }
        int i17 = elapsedRealtime2;
        int supportCodecs = hardwareVideoDecoder.supportCodecInfo != null ? hardwareVideoDecoder.supportCodecInfo.getSupportCodecs() : 0;
        if (hardwareVideoDecoder.running) {
            videoFrame = videoFrame2;
            hardwareVideoDecoder.callback.onDecodedFrame(videoFrame, Integer.valueOf(elapsedRealtime), null, i17, size, supportCodecs, remove, remove2);
        } else {
            videoFrame = videoFrame2;
        }
        videoFrame.release();
        debug_log("frame delivered to native, pts_us: " + poll.presentationTimeStampUs + "decode delay time: " + i17 + "ms, deliveredCount: " + hardwareVideoDecoder.deliveredCount + " decodecDelayFrames: " + size);
        hardwareVideoDecoder.deliveredCount = hardwareVideoDecoder.deliveredCount + 1;
    }

    private void deliverTextureFrame(int i10, MediaCodec.BufferInfo bufferInfo) {
        int i11;
        int i12;
        synchronized (this.dimensionLock) {
            i11 = this.width;
            i12 = this.height;
        }
        int size = this.decodeTimeStamps.size();
        TimeStamps poll = this.decodeTimeStamps.poll();
        if (poll == null) {
            Logging.e(TAG, "deliverTextureFrame cannot find presentationTimeUs.");
            return;
        }
        DecodedTextureMetadata decodedTextureMetadata = new DecodedTextureMetadata(i10, i11, i12, poll.rotation, poll.presentationTimeStampUs, Integer.valueOf((int) (SystemClock.elapsedRealtime() - poll.prevElapsedRealtime)), size, poll.prevElapsedRealtime, bufferInfo.presentationTimeUs);
        synchronized (this.textureMetadataLock) {
            this.dequeuedSurfaceOutputBuffers.offer(decodedTextureMetadata);
            maybeRenderDecodedTextureBuffer();
            if (this.dequeuedSurfaceOutputBuffers.size() >= 3) {
                DecodedTextureMetadata poll2 = this.dequeuedSurfaceOutputBuffers.poll();
                debug_log("drop the oldest output frame in cache, pts_us: " + poll2.presentationTimestampUs);
                try {
                    this.codec.releaseOutputBuffer(poll2.outputBufferIndex, false);
                } catch (IllegalStateException e10) {
                    Logging.e(TAG, "deliverTextureFrame failed", e10);
                }
            }
        }
    }

    private void deliverToDirectSurface(int i10, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.codec.releaseOutputBuffer(i10, true);
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverToDirectSurface failed", e10);
        }
    }

    private VideoCodecStatus initDecodeInternal(VideoDecoder.Settings settings) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        String str;
        Logging.i(TAG, "initDecodeInternal. settings: enableResetCropping=" + settings.enableResetCropping);
        if (this.proxyThreadHandler == null) {
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        if (this.outputThread != null) {
            Logging.e(TAG, "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        Boolean bool = codecUnavailableMap.get(this.codecName);
        if (bool != null && bool.booleanValue()) {
            Logging.e(TAG, "initDecodeInternal failed, by createByCodecName.");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        int i10 = settings.width;
        this.width = i10;
        int i11 = settings.height;
        this.height = i11;
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            try {
                surfaceTextureHelper.setTextureSize(i10, i11);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "setTextureSize:", e10);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        this.stride = this.width;
        this.sliceHeight = this.height;
        this.hasDecodedFirstFrame = false;
        this.deliveredCount = 0;
        this.highLatencyTrigger = false;
        this.keyFrameRequired = true;
        this.deliveredVideoFrame = false;
        this.shouldResetCodec = false;
        this.fallbackByCodecError = false;
        this.firstDecoderQueueFullMs = -1L;
        this.firstInvalidPresentationMs = -1L;
        this.invalidPresentationCount = 0;
        String str2 = this.codecName;
        if (str2 == null || (str = Build.HARDWARE) == null || !str2.startsWith("OMX.hisi.") || !str.startsWith("bigfish")) {
            this.isHisiCodec = false;
        } else {
            this.isHisiCodec = true;
            Logging.i(TAG, " bigfish isHisiCodec: " + this.isHisiCodec);
        }
        try {
            VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoDecoder.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() {
                    VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.OK;
                    try {
                        HardwareVideoDecoder hardwareVideoDecoder = HardwareVideoDecoder.this;
                        hardwareVideoDecoder.codec = hardwareVideoDecoder.mediaCodecWrapperFactory.createByCodecName(HardwareVideoDecoder.this.codecName);
                        return videoCodecStatus2;
                    } catch (Exception unused) {
                        Logging.e(HardwareVideoDecoder.TAG, "Cannot create media decoder " + HardwareVideoDecoder.this.codecName);
                        return VideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                }
            });
            if (videoCodecStatus == null) {
                codecUnavailableMap.put(this.codecName, Boolean.TRUE);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            if (videoCodecStatus != VideoCodecStatus.OK) {
                codecUnavailableMap.put(this.codecName, Boolean.TRUE);
                return videoCodecStatus;
            }
            try {
                codecCapabilities = this.codec.getCodecInfo(this.codecType.mimeType());
            } catch (Exception unused) {
                Logging.e(TAG, "Cannot get CodecInfo " + this.codecName);
                codecCapabilities = null;
            }
            readVideoCapabilities(codecCapabilities);
            final MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.width, this.height);
            if (this.sharedContext == null && this.directSurface == null) {
                if (settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
                    if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS_HDR, codecCapabilities) == null) {
                        Logging.w(TAG, "selectColorFormat is null");
                        return VideoCodecStatus.FALLBACK_SOFTWARE;
                    }
                    this.colorFormat = 54;
                }
                createVideoFormat.setInteger("color-format", this.colorFormat.intValue());
            }
            if (Build.VERSION.SDK_INT >= 30 && isSupportedLowLatency(codecCapabilities)) {
                createVideoFormat.setInteger(FEATURE_LowLatency, 1);
            }
            if (settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
                createVideoFormat.setByteBuffer("hdr-static-info", MediaCodecUtils.getHdrStaticInfo());
            }
            String str3 = this.params.get(VideoCodecInfo.KEY_AV_DEC_VIDEO_HWDEC_CONFIG);
            this.customConfigJson = str3;
            MediaCodecUtils.applyCustomConfig(createVideoFormat, str3);
            Logging.w(TAG, "Format: " + createVideoFormat);
            try {
                VideoCodecStatus videoCodecStatus2 = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoDecoder.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public VideoCodecStatus call() {
                        try {
                            HardwareVideoDecoder.this.codec.configure(createVideoFormat, HardwareVideoDecoder.this.surface, null, MediaCodecUtils.applyCustomFlags(HardwareVideoDecoder.this.customConfigJson));
                            HardwareVideoDecoder.this.codec.start();
                            return VideoCodecStatus.OK;
                        } catch (Throwable th2) {
                            Logging.e(HardwareVideoDecoder.TAG, "initDecode failed" + th2.getMessage());
                            HardwareVideoDecoder.this.release();
                            return VideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                    }
                });
                if (videoCodecStatus2 == null) {
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                VideoCodecStatus videoCodecStatus3 = VideoCodecStatus.OK;
                if (videoCodecStatus2 != videoCodecStatus3) {
                    return videoCodecStatus2;
                }
                synchronized (this.textureMetadataLock) {
                    this.dequeuedSurfaceOutputBuffers.clear();
                }
                this.supportCodecInfo = VideoDecoderUtils.getSupportedDecoders();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                Logging.i(TAG, "initDecodeInternal " + this.codecType.mimeType() + " done, format: " + createVideoFormat);
                return videoCodecStatus3;
            } catch (Exception unused2) {
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception unused3) {
            codecUnavailableMap.put(this.codecName, Boolean.TRUE);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private boolean isSupportedColorFormat(int i10) {
        for (int i11 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private boolean isSupportedLowLatency(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (codecCapabilities == null) {
            return false;
        }
        try {
            return codecCapabilities.isFeatureSupported(FEATURE_LowLatency);
        } catch (Exception e10) {
            Logging.e(TAG, "Cannot get LowLatency: " + e10.getMessage());
            return false;
        }
    }

    private void maybeRenderDecodedTextureBuffer() {
        if (this.renderedTextureMetadata != null) {
            return;
        }
        if (!this.running) {
            Logging.i(TAG, "RenderTexture: Decoder is not running.");
            return;
        }
        DecodedTextureMetadata poll = this.dequeuedSurfaceOutputBuffers.poll();
        if (poll == null) {
            return;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            try {
                surfaceTextureHelper.setTextureSize(poll.width, poll.height);
                this.surfaceTextureHelper.setFrameRotation(poll.rotation);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "setTextureSize:", e10);
            }
        }
        this.renderedTextureMetadata = poll;
        debug_log("render output buffer to surface, pts_us: " + poll.presentationTimestampUs);
        try {
            this.codec.releaseOutputBuffer(poll.outputBufferIndex, true);
        } catch (IllegalStateException e11) {
            Logging.e(TAG, "deliverToDirectSurface failed", e11);
        } catch (Exception e12) {
            Logging.e(TAG, "deliverToDirectSurface error", e12);
        }
    }

    private boolean parse10bitYUVFromParam() {
        boolean z10;
        try {
            String str = this.params.get(VideoCodecInfo.KEY_AV_DEC_VIDEO_DECODER_OUT_10BYTE_FRAME);
            Boolean valueOf = str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
            z10 = valueOf != null ? valueOf.booleanValue() : true;
        } catch (Exception unused) {
            Logging.i(TAG, "fail to convert hwdec textureCopy");
            z10 = false;
        }
        if (z10) {
            Logging.i(TAG, "parse hwdec force yuv out success, value : " + this.textureCopy);
        }
        return z10;
    }

    private void parseTextureCopyFromParam() {
        try {
            String str = this.params.get(VideoCodecInfo.KEY_AV_DEC_VIDEO_TEXTURE_COPY_ENABLE);
            Boolean valueOf = str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
            if (valueOf != null) {
                this.textureCopy = valueOf.booleanValue();
            }
            Logging.i(TAG, "parse hwdec textureCopy success, value : " + this.textureCopy);
        } catch (Exception unused) {
            Logging.i(TAG, "fail to convert hwdec textureCopy");
        }
    }

    private void readVideoCapabilities(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        int i12;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return;
        }
        Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        int i13 = 0;
        if (supportedWidths != null) {
            i11 = supportedWidths.getUpper().intValue();
            i10 = supportedWidths.getLower().intValue();
        } else {
            i10 = 0;
            i11 = 0;
        }
        Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedHeights != null) {
            i13 = supportedHeights.getUpper().intValue();
            i12 = supportedHeights.getLower().intValue();
        } else {
            i12 = 0;
        }
        Logging.i(TAG, this.codecType.mimeType() + "  max supported size:" + i11 + C5444x.f55808b + i13 + " min supported size:" + i10 + C5444x.f55808b + i12);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("max supported instance: ");
        sb2.append(codecCapabilities.getMaxSupportedInstances());
        Logging.i(TAG, sb2.toString());
    }

    private void reformat(MediaFormat mediaFormat) {
        int integer;
        int integer2;
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.i(TAG, "Decoder format changed: " + mediaFormat.toString());
        if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_LEFT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_RIGHT) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_BOTTOM) && mediaFormat.containsKey(MEDIA_FORMAT_KEY_CROP_TOP)) {
            integer = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_RIGHT) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_LEFT);
            integer2 = (mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_BOTTOM) + 1) - mediaFormat.getInteger(MEDIA_FORMAT_KEY_CROP_TOP);
        } else {
            integer = mediaFormat.getInteger("width");
            integer2 = mediaFormat.getInteger("height");
        }
        synchronized (this.dimensionLock) {
            try {
                if (this.hasDecodedFirstFrame) {
                    if (this.width == integer) {
                        if (this.height != integer2) {
                        }
                    }
                    Logging.w(TAG, "Configured size change, " + this.width + "*" + this.height + ". New " + integer + "*" + integer2);
                }
                this.width = integer;
                this.height = integer2;
            } finally {
            }
        }
        if (this.surfaceTextureHelper == null && this.directSurface == null && mediaFormat.containsKey("color-format")) {
            int integer3 = mediaFormat.getInteger("color-format");
            Logging.i(TAG, "reformat, Color: 0x" + Integer.toHexString(integer3));
            if (this.isHisiCodec && integer3 == 47) {
                this.colorFormat = 39;
            } else {
                this.colorFormat = Integer.valueOf(integer3);
            }
            if (!isSupportedColorFormat(this.colorFormat.intValue()) && !MediaCodecUtils.isSupportedColorFormatHDR(this.colorFormat.intValue())) {
                stopOnOutputThread(new IllegalStateException("Unsupported color format: " + this.colorFormat));
                return;
            }
        }
        synchronized (this.dimensionLock) {
            try {
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_STRIDE)) {
                    this.stride = mediaFormat.getInteger(MEDIA_FORMAT_KEY_STRIDE);
                }
                if (mediaFormat.containsKey(MEDIA_FORMAT_KEY_SLICE_HEIGHT)) {
                    this.sliceHeight = mediaFormat.getInteger(MEDIA_FORMAT_KEY_SLICE_HEIGHT);
                }
                Logging.i(TAG, "Frame stride and slice height: " + this.stride + " x " + this.sliceHeight);
                this.stride = Math.max(this.width, this.stride);
                this.sliceHeight = Math.max(this.height, this.sliceHeight);
            } finally {
            }
        }
    }

    private VideoCodecStatus reinitDecode(int i10, int i11, FrameCropWindow frameCropWindow) {
        VideoCodecStatus releaseInternal = releaseInternal();
        VideoDecoder.Callback callback = this.callback;
        if (callback != null) {
            callback.onDecodeReset();
        }
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        VideoDecoder.Settings settings = this.settings;
        settings.width = i10;
        settings.height = i11;
        settings.frameCropWindow = frameCropWindow;
        return initDecodeInternal(settings);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.i(TAG, "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e10) {
            Logging.e(TAG, "Media decoder stop failed", e10);
        }
        try {
            this.codec.release();
        } catch (Exception e11) {
            Logging.e(TAG, "Media decoder release failed", e11);
            this.shutdownException = e11;
        }
        synchronized (this.textureMetadataLock) {
            this.dequeuedSurfaceOutputBuffers.clear();
        }
        Logging.i(TAG, "Release on output thread done");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.i(TAG, "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, 5000L)) {
                Logging.e(TAG, "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            }
            if (this.shutdownException != null) {
                Logging.e(TAG, "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                return VideoCodecStatus.ERROR;
            }
            this.codec = null;
            this.outputThread = null;
            return VideoCodecStatus.OK;
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    public VideoFrame.I420Buffer allocateI420Buffer(int i10, int i11) {
        return JavaI420Buffer.allocate(i10, i11);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus attachProxyThread() {
        if (this.proxyThreadHandler == null) {
            Logging.i(TAG, "attach decoder proxyThread");
            try {
                HandlerThread handlerThread = new HandlerThread("proxyThread-Decoder");
                handlerThread.start();
                this.proxyThreadHandler = new Handler(handlerThread.getLooper());
            } catch (Exception e10) {
                Logging.w(TAG, "attach decoder proxyThread fail!, " + e10.getMessage());
            }
        }
        return VideoCodecStatus.OK;
    }

    public void copyPlane(ByteBuffer byteBuffer, int i10, ByteBuffer byteBuffer2, int i11, int i12, int i13) {
        YuvHelper.copyPlane(byteBuffer, i10, byteBuffer2, i11, i12, i13);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public long createNativeVideoDecoder() {
        return 0L;
    }

    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext, 16, ColorSpace.Transfer.SMPTEST2084.getTransfer());
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x009e, code lost:
    
        if (r10.shouldResetCodec != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        if (r1 == r3.height) goto L44;
     */
    @Override // io.agora.base.internal.video.VideoDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoCodecStatus decode(final EncodedImage encodedImage, VideoDecoder.DecodeInfo decodeInfo, final CodecSpecificInfo codecSpecificInfo, final FrameExtraInfo frameExtraInfo) {
        int i10;
        int i11;
        int i12;
        FrameCropWindow frameCropWindow;
        FrameCropWindow frameCropWindow2;
        int i13 = 0;
        if (this.codec == null || this.callback == null || this.proxyThreadHandler == null || !this.running) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("decode uninitalized, codec: ");
            sb2.append(this.codec != null);
            sb2.append(", callback: ");
            sb2.append(this.callback);
            Logging.i(TAG, sb2.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        ByteBuffer byteBuffer = encodedImage.buffer;
        if (byteBuffer == null) {
            Logging.e(TAG, "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        final int remaining = byteBuffer.remaining();
        if (remaining == 0) {
            Logging.e(TAG, "decode() - input buffer empty");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        synchronized (this.dimensionLock) {
            try {
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        int i14 = codecSpecificInfo.lumaBitDepth;
        if (i14 != 0 && i14 != this.settings.lumaBitDepth) {
            Logging.e(TAG, "decode() - lumaBitDepth change: " + codecSpecificInfo.lumaBitDepth + " should reset codec.");
            VideoCodecStatus reinitDecode = reinitDecode(codecSpecificInfo.lumaBitDepth);
            return reinitDecode != VideoCodecStatus.OK ? reinitDecode : VideoCodecStatus.CODEC_RESET_DECODER;
        }
        if (this.highLatencyTrigger) {
            Logging.e(TAG, "decode() - codec high delay trigger, should reset codec.");
            this.highLatencyTrigger = false;
            VideoCodecStatus reinitDecode2 = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.frameCropWindow);
            return reinitDecode2 != VideoCodecStatus.OK ? reinitDecode2 : VideoCodecStatus.CODEC_RESET_DECODER;
        }
        int i15 = encodedImage.encodedWidth;
        int i16 = encodedImage.encodedHeight;
        if (i15 * i16 > 0) {
            VideoDecoder.Settings settings = this.settings;
            if (i15 == settings.width) {
            }
            Logging.w(TAG, "decode() - reinitDecode.");
            VideoCodecStatus reinitDecode3 = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight, encodedImage.frameCropWindow);
            if (reinitDecode3 != VideoCodecStatus.OK) {
                return reinitDecode3;
            }
            VideoDecoder.Settings settings2 = this.settings;
            if (settings2.enableResetCropping) {
                int i17 = encodedImage.encodedWidth;
                int i18 = encodedImage.encodedHeight;
                if (i17 * i18 <= 0 || (frameCropWindow2 = encodedImage.frameCropWindow) == null) {
                    i10 = 0;
                    i11 = 0;
                } else {
                    i10 = frameCropWindow2.left_offset + i17 + frameCropWindow2.right_offset;
                    i11 = frameCropWindow2.top_offset + i18 + frameCropWindow2.bottom_offset;
                }
                int i19 = settings2.width;
                int i20 = settings2.height;
                if (i19 * i20 <= 0 || (frameCropWindow = settings2.frameCropWindow) == null) {
                    i12 = 0;
                } else {
                    i13 = frameCropWindow.right_offset + i19 + frameCropWindow.left_offset;
                    i12 = frameCropWindow.bottom_offset + i20 + frameCropWindow.top_offset;
                }
                if (i17 * i18 > 0 && (i10 != i13 || i11 != i12)) {
                    Logging.w(TAG, "decode() - resolution before cropping changed, should reset codec. frame:" + i10 + C5444x.f55808b + i11 + " setting:" + i13 + C5444x.f55808b + i12 + " frameType:" + encodedImage.frameType + " completeFrame:" + encodedImage.completeFrame);
                    VideoDecoder.Settings settings3 = this.settings;
                    FrameCropWindow frameCropWindow3 = encodedImage.frameCropWindow;
                    settings3.frameCropWindow = frameCropWindow3;
                    VideoCodecStatus reinitDecode4 = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight, frameCropWindow3);
                    if (reinitDecode4 != VideoCodecStatus.OK) {
                        return reinitDecode4;
                    }
                }
            }
            if (this.invalidPresentationCount > 3) {
                Logging.e(TAG, "invalid PresentationTimeUs over limit counts.");
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            if (this.decodeTimeStamps.size() > 5) {
                long currentTimeMillis = System.currentTimeMillis();
                if (this.firstDecoderQueueFullMs < 0) {
                    this.firstDecoderQueueFullMs = currentTimeMillis;
                }
                if (currentTimeMillis - this.firstDecoderQueueFullMs > 2000) {
                    Logging.e(TAG, "Fallback to software, decoder queue full");
                    release();
                    return VideoCodecStatus.ERROR_CODEC_OUTPUT_FAILURE;
                }
            }
            if (this.fallbackByCodecError) {
                Logging.e(TAG, "decode() FALLBACK_SOFTWARE");
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            VideoDecoder.Callback callback = this.callback;
            if (callback != null) {
                callback.onDecodeBufferPrepared(codecSpecificInfo.opaque);
            }
            if (this.keyFrameRequired) {
                if (encodedImage.frameType != EncodedImage.FrameType.VideoFrameKey) {
                    Logging.e(TAG, "decode() - key frame required first");
                    return VideoCodecStatus.NO_OUTPUT;
                }
                if (!encodedImage.completeFrame) {
                    Logging.e(TAG, "decode() - complete frame required first");
                    return VideoCodecStatus.NO_OUTPUT;
                }
            }
            try {
                VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoDecoder.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public VideoCodecStatus call() {
                        long j10;
                        try {
                            int dequeueInputBuffer = HardwareVideoDecoder.this.codec.dequeueInputBuffer(500000L);
                            if (dequeueInputBuffer < 0) {
                                Logging.e(HardwareVideoDecoder.TAG, "decode() - no HW buffers available; decoder falling behind");
                                return VideoCodecStatus.ERROR;
                            }
                            try {
                                ByteBuffer byteBuffer2 = HardwareVideoDecoder.this.codec.getInputBuffers()[dequeueInputBuffer];
                                if (byteBuffer2.capacity() < remaining) {
                                    Logging.e(HardwareVideoDecoder.TAG, "decode() - HW buffer too small");
                                    return VideoCodecStatus.ERROR;
                                }
                                byteBuffer2.put(encodedImage.buffer);
                                long micros = TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs);
                                if (HardwareVideoDecoder.this.lastPresentationTimestampUs == micros) {
                                    micros = HardwareVideoDecoder.access$604(HardwareVideoDecoder.this);
                                } else {
                                    HardwareVideoDecoder.this.lastPresentationTimestampUs = micros;
                                }
                                long j11 = micros;
                                TimeStamps timeStamps = null;
                                try {
                                    CodecSpecificInfo codecSpecificInfo2 = codecSpecificInfo;
                                    if (codecSpecificInfo2 != null) {
                                        codecSpecificInfo2.elapsedRealtime = SystemClock.elapsedRealtime();
                                        HardwareVideoDecoder.this.codecSpecificInfoMap.put(Long.valueOf(j11), codecSpecificInfo);
                                    } else {
                                        HardwareVideoDecoder.this.codecSpecificInfoMap.put(Long.valueOf(j11), new CodecSpecificInfo((ByteBuffer) null, SystemClock.elapsedRealtime()));
                                    }
                                    j10 = j11;
                                } catch (RuntimeException e10) {
                                    e = e10;
                                    j10 = j11;
                                }
                                try {
                                    timeStamps = new TimeStamps(SystemClock.elapsedRealtime(), j10, encodedImage.rotation);
                                    HardwareVideoDecoder.this.decodeTimeStamps.add(timeStamps);
                                    HardwareVideoDecoder.this.bframeExtraInfoMap.put(Long.valueOf(j10), frameExtraInfo);
                                    HardwareVideoDecoder.debug_log("queue input buffer, pts_us: " + j10);
                                    j11 = j10;
                                    HardwareVideoDecoder.this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, j11, 0);
                                    if (HardwareVideoDecoder.this.keyFrameRequired) {
                                        HardwareVideoDecoder.this.keyFrameRequired = false;
                                    }
                                    return VideoCodecStatus.OK;
                                } catch (RuntimeException e11) {
                                    e = e11;
                                    Logging.e(HardwareVideoDecoder.TAG, "queueInputBuffer failed", e);
                                    HardwareVideoDecoder.this.codecSpecificInfoMap.remove(Long.valueOf(j10));
                                    HardwareVideoDecoder.this.bframeExtraInfoMap.remove(Long.valueOf(j10));
                                    HardwareVideoDecoder.this.decodeTimeStamps.remove(timeStamps);
                                    return !HardwareVideoDecoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e);
                                }
                            } catch (IllegalStateException e12) {
                                Logging.e(HardwareVideoDecoder.TAG, "getInputBuffers failed", e12);
                                return !HardwareVideoDecoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e12);
                            }
                        } catch (IllegalStateException e13) {
                            Logging.e(HardwareVideoDecoder.TAG, "dequeueInputBuffer failed", e13);
                            return !HardwareVideoDecoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e13);
                        }
                    }
                });
                return videoCodecStatus == null ? VideoCodecStatus.FALLBACK_SOFTWARE : videoCodecStatus;
            } catch (Exception unused) {
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
    }

    public void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.dequeueOutputTimeUs);
            debug_log("dequeue output buffer, pts_us: " + bufferInfo.presentationTimeUs + " result: " + dequeueOutputBuffer);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
                return;
            }
            if (dequeueOutputBuffer < 0) {
                return;
            }
            if (bufferInfo.presentationTimeUs == 0) {
                if (System.currentTimeMillis() - this.firstInvalidPresentationMs > 2000) {
                    this.invalidPresentationCount = 0;
                    this.firstInvalidPresentationMs = System.currentTimeMillis();
                }
                this.invalidPresentationCount++;
                Logging.i(TAG, "dequeueOutputBuffer fail, presentationTimeUs is 0.");
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, this.directSurface != null);
                return;
            }
            this.hasDecodedFirstFrame = true;
            this.firstDecoderQueueFullMs = -1L;
            if (this.directSurface != null) {
                deliverToDirectSurface(dequeueOutputBuffer, bufferInfo);
            } else if (this.surfaceTextureHelper != null) {
                deliverTextureFrame(dequeueOutputBuffer, bufferInfo);
            } else {
                deliverByteFrame(dequeueOutputBuffer, bufferInfo);
            }
            this.deliveredVideoFrame = true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "deliverDecodedFrame failed", e10);
            if (!this.deliveredVideoFrame) {
                this.fallbackByCodecError = true;
            } else if (MediaCodecUtils.isMediaCodecException(e10) != VideoCodecStatus.ERROR) {
                this.fallbackByCodecError = true;
            } else {
                this.shouldResetCodec = true;
            }
        } catch (Exception e11) {
            this.fallbackByCodecError = true;
            Logging.e(TAG, "deliverDecodedFrame error", e11);
        }
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus detachProxyThread() {
        Handler handler = this.proxyThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.proxyThreadHandler.getLooper().quitSafely();
            this.proxyThreadHandler = null;
            Logging.i(TAG, "detach decoder proxyThread");
        }
        return VideoCodecStatus.OK;
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public String getImplementationName() {
        return "HWDecoder";
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoDecoder.VideoHWCodecSpec getVideoHWCodecSpec() {
        String codecNames = this.supportCodecInfo != null ? this.supportCodecInfo.getCodecNames() : "";
        return new VideoDecoder.VideoHWCodecSpec(this.codecName, this.maxSupportedWidth + C5444x.f55808b + this.maxSupportedHeight, -1, this.sharedContext != null ? 1 : 0, -1, -1, codecNames);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus initDecode(VideoDecoder.Settings settings, VideoDecoder.Callback callback) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (this.running) {
            Logging.w(TAG, "already initialized!");
            return VideoCodecStatus.OK;
        }
        this.callback = callback;
        this.settings = settings;
        if (this.colorFormat == null) {
            try {
                codecCapabilities = this.info.getCapabilitiesForType(this.codecType.mimeType());
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
                codecCapabilities = null;
            }
            if (codecCapabilities != null && codecCapabilities.colorFormats != null) {
                Logging.i(TAG, "supportedColorFormat : " + Arrays.toString(codecCapabilities.colorFormats));
            }
            Integer selectColorFormat = MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, codecCapabilities);
            if (selectColorFormat == null && this.sharedContext == null) {
                Logging.w(TAG, "Unsupported color format!");
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            Logging.i(TAG, "select color format: " + selectColorFormat);
            this.colorFormat = selectColorFormat;
        }
        parseTextureCopyFromParam();
        if (settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth() && parse10bitYUVFromParam()) {
            Logging.i(TAG, "force use yuv out in 10bit.");
            this.sharedContext = null;
        }
        Surface surface = this.directSurface;
        if (surface != null) {
            this.surface = surface;
        } else if (this.sharedContext != null) {
            SurfaceTextureHelper createSurfaceTextureHelper = createSurfaceTextureHelper();
            this.surfaceTextureHelper = createSurfaceTextureHelper;
            if (createSurfaceTextureHelper == null) {
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
            this.surfaceTextureHelper.setLumaBitDepth(settings.lumaBitDepth);
        }
        return initDecodeInternal(settings);
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public boolean isHardwareDecoder() {
        return true;
    }

    @Override // io.agora.base.internal.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        long j10;
        long j11;
        Integer num;
        long j12;
        CodecSpecificInfo remove;
        int i10;
        int size = this.codecSpecificInfoMap.size();
        synchronized (this.textureMetadataLock) {
            DecodedTextureMetadata decodedTextureMetadata = this.renderedTextureMetadata;
            if (decodedTextureMetadata == null) {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
            j10 = decodedTextureMetadata.infoPresentationTimeUs;
            DecodedTextureMetadata decodedTextureMetadata2 = this.renderedTextureMetadata;
            j11 = decodedTextureMetadata2.presentationTimestampUs;
            num = decodedTextureMetadata2.decodeTimeMs;
            num.intValue();
            DecodedTextureMetadata decodedTextureMetadata3 = this.renderedTextureMetadata;
            j12 = decodedTextureMetadata3.prevElapsedRealtime;
            int i11 = decodedTextureMetadata3.delaySize;
            remove = this.codecSpecificInfoMap.remove(Long.valueOf(decodedTextureMetadata3.presentationTimestampUs));
            this.renderedTextureMetadata = null;
            maybeRenderDecodedTextureBuffer();
        }
        long j13 = j10 == 0 ? j11 : j10;
        VideoFrame videoFrame2 = new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j11 * 1000);
        FrameExtraInfo remove2 = this.bframeExtraInfoMap.remove(Long.valueOf(j13));
        if (remove2 == null) {
            Logging.e(TAG, "HW frameExtraInfo empty. cannot find: " + j13);
            this.fallbackByCodecError = true;
            return;
        }
        if (remove == null) {
            Logging.e(TAG, "HW decodeTimeStamps empty. cannot find: " + j13);
        }
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j12);
        if (elapsedRealtime > this.maxDecodeTimeMs) {
            if (MediaCodecUtils.useHighLatencyStrategy() && this.deliveredCount >= 8) {
                this.highLatencyTrigger = true;
                this.deliveredCount = 0;
            }
            Logging.w(TAG, "Very high decode time: " + elapsedRealtime + "ms.");
            elapsedRealtime = this.maxDecodeTimeMs;
        }
        boolean z10 = (remove != null && remove.getVideoCodecType() == VideoCodecType.H265 && (remove.getVideoCodecProfile() == VideoCodecProfile.HEVCMain10 || remove.getVideoCodecProfile() == VideoCodecProfile.HEVCMain10HDR10 || remove.getVideoCodecProfile() == VideoCodecProfile.HEVCMain10HDR10Plus)) || this.settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth();
        if (this.deliveredCount == 0) {
            Logging.i(TAG, "directOes: " + z10 + " is10BitLumaDepth:  textureCopy: " + this.textureCopy);
        }
        int supportCodecs = this.supportCodecInfo != null ? this.supportCodecInfo.getSupportCodecs() : 0;
        if (z10 || !this.textureCopy) {
            int i12 = supportCodecs;
            int i13 = elapsedRealtime;
            VideoFrame videoFrame3 = new VideoFrame(videoFrame2.getBuffer(), videoFrame2.getRotation(), videoFrame2.getTimestampNs());
            if (this.running) {
                this.callback.onDecodedFrame(videoFrame3, num, null, i13, size, i12, remove, remove2);
            }
            debug_log("frame delivered to native by direct oes, pts_us: " + j13);
            this.deliveredCount = this.deliveredCount + 1;
            return;
        }
        VideoFrame.TextureBuffer textureCopy = this.surfaceTextureHelper.textureCopy((VideoFrame.TextureBuffer) videoFrame2.getBuffer());
        if (textureCopy == null) {
            Logging.i(TAG, "failed to copy texture buffer, drop frame");
            return;
        }
        VideoFrame videoFrame4 = new VideoFrame(textureCopy, videoFrame2.getRotation(), videoFrame2.getTimestampNs());
        if (this.running) {
            int i14 = supportCodecs;
            i10 = elapsedRealtime;
            this.callback.onDecodedFrame(videoFrame4, num, null, i10, size, i14, remove, remove2);
        } else {
            i10 = elapsedRealtime;
        }
        videoFrame4.release();
        debug_log("frame delivered to native, pts_us: " + j13 + "decode delay time: " + i10 + " ms, deliveredCount: " + this.deliveredCount);
        this.deliveredCount = this.deliveredCount + 1;
    }

    @Override // io.agora.base.internal.video.VideoDecoder
    public VideoCodecStatus release() {
        Logging.i(TAG, "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null && this.directSurface == null) {
            releaseSurface();
            this.surface = null;
            SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.stopListening();
                this.surfaceTextureHelper.dispose();
                this.surfaceTextureHelper = null;
            }
        }
        synchronized (this.textureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.deliveredVideoFrame = false;
        this.shouldResetCodec = false;
        this.fallbackByCodecError = false;
        this.codecSpecificInfoMap.clear();
        this.decodeTimeStamps.clear();
        this.deliveredCount = 0;
        this.highLatencyTrigger = false;
        this.firstDecoderQueueFullMs = -1L;
        this.firstInvalidPresentationMs = -1L;
        this.invalidPresentationCount = 0;
        return releaseInternal;
    }

    public void releaseSurface() {
        this.surface.release();
    }

    private VideoCodecStatus reinitDecode(int i10) {
        VideoCodecStatus releaseInternal = releaseInternal();
        VideoDecoder.Callback callback = this.callback;
        if (callback != null) {
            callback.onDecodeReset();
        }
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        this.settings.lumaBitDepth = i10;
        if (this.surface != null && this.directSurface == null) {
            releaseSurface();
            this.surface = null;
        }
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.textureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.codecSpecificInfoMap.clear();
        return initDecode(this.settings, this.callback);
    }
}
