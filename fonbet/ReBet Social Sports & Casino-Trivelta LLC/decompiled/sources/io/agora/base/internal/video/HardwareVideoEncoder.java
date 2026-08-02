package io.agora.base.internal.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import com.facebook.hermes.intl.Constants;
import io.agora.base.ColorSpace;
import io.agora.base.JavaI010Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.base.internal.video.EncodedImage;
import io.agora.base.internal.video.HdrUtil;
import io.agora.base.internal.video.VideoEncoder;
import io.agora.base.internal.video.VideoEncoderUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import lb.C5444x;

@TargetApi(19)
/* loaded from: classes2.dex */
public class HardwareVideoEncoder implements VideoEncoder {
    private static final int DEFAULT_10BIT_HEIDHT_ALIGNMENT = 32;
    private static final int DEFAULT_10BIT_WIDTH_ALIGNMENT = 64;
    private static final int DEFAULT_HEIGHT_ALIGNMENT = 4;
    private static final int DEFAULT_WIDTH_ALIGNMENT = 16;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEWAIT_US = 0;
    private static final int INT_INTERVAL_UPPER_LIMIT = 100;
    private static final int INT_PERIODIC_I_FRAME_INTERVAL_VALUE = 2;
    private static final int INT_SETTING_INTERVAL_VALUE = 10;
    private static final String KEY_AV_ENC_VIDEO_ADJUSTMENT_RESET = "av_enc_video_adjustment_reset";
    private static final String KEY_AV_ENC_VIDEO_ENABLE_DEQUEUE_TIMEWAIT = "av_enc_video_enable_dequeue_timewait";
    private static final String KEY_AV_ENC_VIDEO_FORCE_ALIGNMENT = "av_enc_video_force_alignment";
    private static final String KEY_AV_ENC_VIDEO_HDR_HEIGHT_ALIGNMENT = "av_enc_video_hdr_height_alignment";
    private static final String KEY_AV_ENC_VIDEO_HDR_WIDTH_ALIGNMENT = "av_enc_video_hdr_width_alignment";
    private static final String KEY_AV_ENC_VIDEO_HEIGHT_ALIGNMENT = "av_enc_video_height_alignment";
    private static final String KEY_AV_ENC_VIDEO_WIDTH_ALIGNMENT = "av_enc_video_width_alignment";
    private static final String KEY_BITRATE_MODE = "bitrate-mode";
    private static final int MAX_ENCODER_Q_SIZE = 5;
    private static final int MAX_ENCODER_Q_WAIT_TIMEOUT_MS = 2000;
    private static final int MAX_ENCODE_TIME_MS = 2000;
    private static final int MAX_NO_INPUT_LIMIT = 5;
    private static final int MAX_VIDEO_FRAMERATE = 60;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int MIN_VIDEO_FRAMERATE = 2;
    private static final String TAG = "HardwareVideoEncoder";
    private static final int VIDEO_AVC_LEVEL_3_1 = 512;
    private static final int VIDEO_AVC_PROFILE_HIGH = 8;
    private static final int VIDEO_ControlQualityConstant = 0;
    private static final int VIDEO_ControlRateConstant = 2;
    private static final int VIDEO_ControlRateVariable = 1;
    private static final int VIDEO_HEVC_MAINLEVEL_31 = 256;
    private static final int VIDEO_HEVC_PROFILE_MAIN = 1;
    private static final boolean debug = false;
    private static final int kMaxVuiSpsIncrease = 64;
    private int adjustedBitrate;
    private int alignedHeight;
    private int alignedWidth;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private int bitrateAdjustment;
    private int bitrateMode;
    private VideoEncoder.Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private Map<Long, CodecSpecificInfo> codecSpecificInfoMap;
    private final VideoCodecType codecType;
    private ColorSpace colorSpace;
    private Condition condition;
    private ByteBuffer configBuffer;
    private String cpuName;
    private String customConfigJson;
    private boolean deliveredVideoFrame;
    private final Queue<TimeStamps> encodeTimeStamps;
    private VideoEncoder.EncoderStyle encoderStyle;
    private long firstEncoderQueueFullMs;
    private final long forcedKeyFrameNs;
    private int height;
    private final MediaCodecInfo info;
    private int inputDropCount;
    private int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private long lastPresentationTimestampUs;
    private ReentrantLock lock;
    private int lumaBitDepth;
    private int maxFramerate;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    private final Map<String, String> params;
    private Handler proxyThreadHandler;
    private volatile boolean running;
    private EglBase.Context sharedContext;
    private boolean shouldFallbackSoftware;
    private boolean shouldResetCodec;
    private boolean shouldUseBaseline;
    private volatile Exception shutdownException;
    private volatile VideoEncoderUtils.SupportCodecInfo supportCodecInfo;
    private Integer surfaceColorFormat;
    private EglBase textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private int width;
    private Integer yuvColorFormat;
    private Integer yuvColorFormatOf8bit;
    private YuvFormat yuvFormat;
    private static Map<String, Boolean> codecUnavailableMap = new ConcurrentHashMap();
    private static boolean mockEncoderQueueFull = false;
    private static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "P6-C00", "HM 2A", "XT105", "XT109", "XT1060"};
    private static final String[] INTERVAL_HW_EXCEPTION_MODELS = {"vivo X21A", "MI 8", "MI 6", "MI 8 Lite", "Redmi Note 7"};
    private int maxSupportedWidth = 32768;
    private int maxSupportedHeight = 32768;
    private int minSupportedWidth = 2;
    private int minSupportedHeight = 2;
    private int maxSupportedBitrate = 0;
    private int minSupportedBitrate = 0;
    private int widthAlignment = 16;
    private int heightAlignment = 4;
    private boolean forceAlignment = true;
    private volatile boolean forceDequeueTimeWait = false;
    private String profileLevelId = "";
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private final BlockingDeque<EncodedImage.Builder> outputBuilders = new LinkedBlockingDeque();

    public static class TimeStamps {
        private final long encodecStartTimeMs;
        private final long presentationTimeStampUs;

        public TimeStamps(long j10, long j11) {
            this.encodecStartTimeMs = j10;
            this.presentationTimeStampUs = j11;
        }
    }

    public enum YuvFormat {
        I420 { // from class: io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat.1
            @Override // io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, int i10, int i11, VideoFrame.Buffer buffer) {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                int i12 = (i10 + 1) / 2;
                int i13 = i10 * i11;
                int i14 = ((i11 + 1) / 2) * i12;
                int i15 = (i14 * 2) + i13;
                if (byteBuffer.capacity() < i15) {
                    throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i15 + " was " + byteBuffer.capacity());
                }
                byteBuffer.position(0);
                ByteBuffer slice = byteBuffer.slice();
                byteBuffer.position(i13);
                ByteBuffer slice2 = byteBuffer.slice();
                byteBuffer.position(i14 + i13);
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), slice, i10, slice2, i12, byteBuffer.slice(), i12, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        P010 { // from class: io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat.2
            @Override // io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, int i10, int i11, VideoFrame.Buffer buffer) {
                if (!(buffer instanceof JavaI010Buffer)) {
                    throw new IllegalArgumentException("fillBuffer Error, buffer not instanceof I010!");
                }
                JavaI010Buffer javaI010Buffer = (JavaI010Buffer) buffer;
                int i12 = (i10 + 1) / 2;
                int i13 = i10 * i11;
                int i14 = ((((i11 + 1) / 2) * i12 * 2) + i13) * 2;
                if (byteBuffer.capacity() >= i14) {
                    byteBuffer.position(0);
                    ByteBuffer slice = byteBuffer.slice();
                    byteBuffer.position(i13 * 2);
                    YuvHelper.I010ToP010(javaI010Buffer.getDataY(), javaI010Buffer.getStrideY(), javaI010Buffer.getDataU(), javaI010Buffer.getStrideU(), javaI010Buffer.getDataV(), javaI010Buffer.getStrideV(), slice, i10, byteBuffer.slice(), i12 * 2, javaI010Buffer.getWidth(), javaI010Buffer.getHeight());
                    return;
                }
                throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i14 + " was " + byteBuffer.capacity());
            }
        },
        NV12 { // from class: io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat.3
            @Override // io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, int i10, int i11, VideoFrame.Buffer buffer) {
                YuvFormat.fillNV12Buffer(byteBuffer, i10, i11, buffer, false);
            }
        },
        NV21 { // from class: io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat.4
            @Override // io.agora.base.internal.video.HardwareVideoEncoder.YuvFormat
            public void fillBuffer(ByteBuffer byteBuffer, int i10, int i11, VideoFrame.Buffer buffer) {
                YuvFormat.fillNV12Buffer(byteBuffer, i10, i11, buffer, true);
            }
        };

        public static void fillNV12Buffer(ByteBuffer byteBuffer, int i10, int i11, VideoFrame.Buffer buffer, boolean z10) {
            VideoFrame.I420Buffer i420 = buffer.toI420();
            int i12 = (i10 + 1) / 2;
            int i13 = i10 * i11;
            int i14 = (((i11 + 1) / 2) * i12 * 2) + i13;
            if (byteBuffer.capacity() < i14) {
                throw new IllegalArgumentException("Expected destination buffer capacity to be at least " + i14 + " was " + byteBuffer.capacity());
            }
            byteBuffer.position(0);
            ByteBuffer slice = byteBuffer.slice();
            byteBuffer.position(i13);
            YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), z10 ? i420.getDataV() : i420.getDataU(), z10 ? i420.getStrideV() : i420.getStrideU(), z10 ? i420.getDataU() : i420.getDataV(), z10 ? i420.getStrideU() : i420.getStrideV(), slice, i10, byteBuffer.slice(), i12 * 2, i420.getWidth(), i420.getHeight());
            i420.release();
        }

        public abstract void fillBuffer(ByteBuffer byteBuffer, int i10, int i11, VideoFrame.Buffer buffer);

        public static YuvFormat valueOf(int i10, boolean z10) {
            Logging.i(HardwareVideoEncoder.TAG, "YuvFormat valueOf " + i10);
            if (i10 == 19) {
                return I420;
            }
            if (i10 != 21) {
                if (i10 == 54) {
                    return P010;
                }
                if (i10 != 2141391872 && i10 != 2141391876) {
                    throw new IllegalArgumentException("Unsupported colorFormat: " + i10);
                }
            }
            return z10 ? NV21 : NV12;
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory, String str, VideoCodecType videoCodecType, MediaCodecInfo mediaCodecInfo, Map<String, String> map, int i10, int i11, BitrateAdjuster bitrateAdjuster, EglBase.Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
        this.lastPresentationTimestampUs = 0L;
        this.encodeTimeStamps = new ConcurrentLinkedQueue();
        this.configBuffer = null;
        this.running = false;
        this.shutdownException = null;
        this.codecSpecificInfoMap = new ConcurrentHashMap();
        this.firstEncoderQueueFullMs = -1L;
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory;
        this.codecName = str;
        this.codecType = videoCodecType;
        this.params = map;
        this.keyFrameIntervalSec = i10;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos(i11);
        this.bitrateAdjuster = bitrateAdjuster;
        this.sharedContext = context;
        this.info = mediaCodecInfo;
    }

    public static /* synthetic */ int access$1108(HardwareVideoEncoder hardwareVideoEncoder) {
        int i10 = hardwareVideoEncoder.inputDropCount;
        hardwareVideoEncoder.inputDropCount = i10 + 1;
        return i10;
    }

    public static /* synthetic */ long access$1704(HardwareVideoEncoder hardwareVideoEncoder) {
        long j10 = hardwareVideoEncoder.lastPresentationTimestampUs + 1;
        hardwareVideoEncoder.lastPresentationTimestampUs = j10;
        return j10;
    }

    private boolean canUseSurface(EglBase.Context context) {
        return (context == null || this.surfaceColorFormat == null) ? false : true;
    }

    private Thread createOutputThread() {
        return new Thread() { // from class: io.agora.base.internal.video.HardwareVideoEncoder.9
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
            }
        };
    }

    private VideoCodecStatus encodeByteBuffer(final VideoFrame videoFrame, final VideoFrame.Buffer buffer, final int i10, final CodecSpecificInfo codecSpecificInfo) {
        if (this.proxyThreadHandler == null) {
            return VideoCodecStatus.ERROR;
        }
        if (!this.running) {
            Logging.e(TAG, "encodeByteBuffer fail, encoder is not initialized!");
            return VideoCodecStatus.ERROR;
        }
        final int i11 = this.alignedWidth;
        final int i12 = this.alignedHeight;
        try {
            VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoEncoder.7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() {
                    long timestampNs = (videoFrame.getTimestampNs() + 500) / 1000;
                    if (HardwareVideoEncoder.this.lastPresentationTimestampUs == timestampNs) {
                        timestampNs = HardwareVideoEncoder.access$1704(HardwareVideoEncoder.this);
                    } else {
                        HardwareVideoEncoder.this.lastPresentationTimestampUs = timestampNs;
                    }
                    long j10 = timestampNs;
                    try {
                        int dequeueInputBuffer = HardwareVideoEncoder.this.codec.dequeueInputBuffer(0L);
                        if (dequeueInputBuffer == -1) {
                            HardwareVideoEncoder.access$1108(HardwareVideoEncoder.this);
                            Logging.i(HardwareVideoEncoder.TAG, "Dropped frame, no input buffers available");
                            return VideoCodecStatus.NO_OUTPUT;
                        }
                        HardwareVideoEncoder.this.inputDropCount = 0;
                        try {
                            HardwareVideoEncoder.this.fillInputBuffer(HardwareVideoEncoder.this.codec.getInputBuffers()[dequeueInputBuffer], i11, i12, buffer);
                            TimeStamps timeStamps = new TimeStamps(SystemClock.elapsedRealtime(), j10);
                            try {
                                if (codecSpecificInfo != null) {
                                    HardwareVideoEncoder.this.codecSpecificInfoMap.put(Long.valueOf(j10), codecSpecificInfo);
                                }
                                HardwareVideoEncoder.this.codec.queueInputBuffer(dequeueInputBuffer, 0, i10, j10, 0);
                                HardwareVideoEncoder.this.encodeTimeStamps.add(timeStamps);
                                return VideoCodecStatus.OK;
                            } catch (RuntimeException e10) {
                                Logging.e(HardwareVideoEncoder.TAG, "queueInputBuffer failed", e10);
                                HardwareVideoEncoder.this.codecSpecificInfoMap.remove(Long.valueOf(j10));
                                HardwareVideoEncoder.this.encodeTimeStamps.remove(timeStamps);
                                return !HardwareVideoEncoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e10);
                            }
                        } catch (IllegalStateException e11) {
                            Logging.e(HardwareVideoEncoder.TAG, "getInputBuffers failed", e11);
                            return !HardwareVideoEncoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e11);
                        }
                    } catch (IllegalStateException e12) {
                        Logging.e(HardwareVideoEncoder.TAG, "dequeueInputBuffer failed", e12);
                        return !HardwareVideoEncoder.this.deliveredVideoFrame ? VideoCodecStatus.FALLBACK_SOFTWARE : MediaCodecUtils.isMediaCodecException(e12);
                    }
                }
            });
            return videoCodecStatus != null ? videoCodecStatus : VideoCodecStatus.FALLBACK_SOFTWARE;
        } catch (Exception unused) {
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    private VideoCodecStatus encodeTextureBuffer(final VideoFrame videoFrame, final CodecSpecificInfo codecSpecificInfo) {
        if (this.proxyThreadHandler == null) {
            return VideoCodecStatus.ERROR;
        }
        if (!this.running) {
            Logging.e(TAG, "encodeTextureBuffer fail, encoder is not initialized!");
            return VideoCodecStatus.ERROR;
        }
        final int i10 = this.alignedWidth;
        final int i11 = this.alignedHeight;
        try {
            VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoEncoder.6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() {
                    int i12;
                    int i13;
                    long timestampNs = (videoFrame.getTimestampNs() + 500) / 1000;
                    TimeStamps timeStamps = new TimeStamps(SystemClock.elapsedRealtime(), timestampNs);
                    HardwareVideoEncoder.this.encodeTimeStamps.add(timeStamps);
                    try {
                        if (codecSpecificInfo != null) {
                            HardwareVideoEncoder.this.codecSpecificInfoMap.put(Long.valueOf(timestampNs), codecSpecificInfo);
                        }
                        GLES20.glClear(16384);
                        VideoFrame videoFrame2 = new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs(), videoFrame.getColorSpace(), null, 0L, 1.0f, VideoFrame.SourceType.kUnspecified.ordinal(), System.currentTimeMillis());
                        int rotatedWidth = videoFrame2.getRotatedWidth();
                        int rotatedHeight = videoFrame2.getRotatedHeight();
                        int i14 = i10;
                        if (i14 != rotatedWidth || i11 != rotatedHeight) {
                            if (i14 >= rotatedWidth && (i12 = i11) >= rotatedHeight) {
                                i13 = i12 - rotatedHeight;
                                HardwareVideoEncoder.this.videoFrameDrawer.drawFrame(videoFrame2, HardwareVideoEncoder.this.textureDrawer, null, 0, i13, rotatedWidth, rotatedHeight, false);
                                HardwareVideoEncoder.this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
                                return VideoCodecStatus.OK;
                            }
                            Logging.e(HardwareVideoEncoder.TAG, "Invalid alignment: aligned(" + i10 + C5444x.f55808b + i11 + ") < frame(" + rotatedWidth + C5444x.f55808b + rotatedHeight + "), rendering without offset");
                        }
                        i13 = 0;
                        HardwareVideoEncoder.this.videoFrameDrawer.drawFrame(videoFrame2, HardwareVideoEncoder.this.textureDrawer, null, 0, i13, rotatedWidth, rotatedHeight, false);
                        HardwareVideoEncoder.this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
                        return VideoCodecStatus.OK;
                    } catch (RuntimeException e10) {
                        Logging.e(HardwareVideoEncoder.TAG, "encodeTexture failed", e10);
                        HardwareVideoEncoder.this.codecSpecificInfoMap.remove(Long.valueOf(timestampNs));
                        HardwareVideoEncoder.this.encodeTimeStamps.remove(timeStamps);
                        return VideoCodecStatus.ERROR;
                    }
                }
            });
            return videoCodecStatus != null ? videoCodecStatus : VideoCodecStatus.ERROR;
        } catch (Exception unused) {
            return VideoCodecStatus.ERROR;
        }
    }

    private VideoCodecStatus initEncodeInternal() {
        Logging.i(TAG, "initEncodeInternal");
        if (this.outputThread != null) {
            Logging.e(TAG, "initEncodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        if (this.proxyThreadHandler == null) {
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        Boolean bool = codecUnavailableMap.get(this.codecName);
        if (bool != null && bool.booleanValue()) {
            Logging.e(TAG, "initEncodeInternal failed, by createByCodecName.");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.lastKeyFrameNs = -1L;
        this.firstEncoderQueueFullMs = -1L;
        try {
            VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoEncoder.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() {
                    VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.OK;
                    HardwareVideoEncoder.this.lock.lock();
                    try {
                        try {
                            HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                            hardwareVideoEncoder.codec = hardwareVideoEncoder.mediaCodecWrapperFactory.createByCodecName(HardwareVideoEncoder.this.codecName);
                        } catch (Exception unused) {
                            Logging.e(HardwareVideoEncoder.TAG, "Cannot create media encoder " + HardwareVideoEncoder.this.codecName);
                            videoCodecStatus2 = VideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                        return videoCodecStatus2;
                    } finally {
                        HardwareVideoEncoder.this.lock.unlock();
                    }
                }
            });
            if (videoCodecStatus == null) {
                codecUnavailableMap.put(this.codecName, Boolean.TRUE);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.OK;
            if (videoCodecStatus != videoCodecStatus2) {
                codecUnavailableMap.put(this.codecName, Boolean.TRUE);
                return videoCodecStatus;
            }
            getEncoderStyle();
            readVideoCapabilities();
            parseTimeWaitFromParam();
            resolutionAlignmentChecker();
            int i10 = this.alignedHeight;
            int i11 = this.alignedWidth;
            if (i10 * i11 > this.maxSupportedHeight * this.maxSupportedWidth || Math.max(i11, i10) > Math.max(this.maxSupportedHeight, this.maxSupportedWidth)) {
                Logging.w(TAG, "initEncode: Not supported size " + this.alignedHeight + C5444x.f55808b + this.alignedWidth);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            int i12 = this.alignedHeight;
            int i13 = this.alignedWidth;
            if (i12 * i13 < this.minSupportedHeight * this.minSupportedWidth || Math.min(i13, i12) < Math.min(this.minSupportedHeight, this.minSupportedWidth)) {
                Logging.w(TAG, "initEncode: Not supported size " + this.alignedHeight + C5444x.f55808b + this.alignedWidth);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            int intValue = (this.useSurfaceMode ? this.surfaceColorFormat : this.yuvColorFormat).intValue();
            int codecConfigFramerate = this.bitrateAdjustment == 2 ? this.bitrateAdjuster.getCodecConfigFramerate() : this.maxFramerate;
            final MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), this.alignedWidth, this.alignedHeight);
            if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
            }
            createVideoFormat.setInteger("bitrate", Math.max(this.adjustedBitrate, this.minSupportedBitrate));
            createVideoFormat.setInteger(KEY_BITRATE_MODE, this.bitrateMode);
            createVideoFormat.setInteger("color-format", intValue);
            createVideoFormat.setInteger("frame-rate", codecConfigFramerate);
            createVideoFormat.setInteger("i-frame-interval", this.keyFrameIntervalSec);
            int i14 = this.lumaBitDepth;
            HdrUtil.LumaBitDepth lumaBitDepth = HdrUtil.LumaBitDepth.LUMA10BIT;
            if (i14 == lumaBitDepth.depth()) {
                ColorSpace colorSpace = this.colorSpace;
                createVideoFormat.setInteger("color-transfer", (colorSpace == null || colorSpace.getTransfer() != ColorSpace.Transfer.ARIB_STD_B67) ? 6 : 7);
                createVideoFormat.setInteger("color-standard", 6);
                ColorSpace colorSpace2 = this.colorSpace;
                createVideoFormat.setInteger("color-range", (colorSpace2 == null || colorSpace2.getRange() != ColorSpace.Range.Full) ? 2 : 1);
                createVideoFormat.setFeatureEnabled("hdr-editing", true);
                createVideoFormat.setByteBuffer("hdr-static-info", MediaCodecUtils.getHdrStaticInfo());
            }
            VideoCodecType videoCodecType = this.codecType;
            if (videoCodecType == VideoCodecType.H264) {
                if (this.lumaBitDepth == lumaBitDepth.depth()) {
                    Logging.w(TAG, "initEncode: error, H264 not support HDR");
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                this.profileLevelId = this.params.get("profile-level-id");
                String str = this.params.get(VideoCodecInfo.H264_IS_HIGH_PROFILE_SUPPORTED);
                if (this.profileLevelId != null) {
                    Logging.i(TAG, "h264_profile:" + this.profileLevelId);
                }
                if (str != null) {
                    Logging.i(TAG, "is-highprofile-supported:" + str);
                }
                if (this.profileLevelId == null || str == null || str.equals(Constants.CASEFIRST_FALSE) || this.shouldUseBaseline) {
                    this.profileLevelId = "";
                }
                if ("640c1f".equals(this.profileLevelId)) {
                    createVideoFormat.setInteger("profile", 8);
                    createVideoFormat.setInteger("level", 512);
                } else if (VideoCodecInfo.H264_CONSTRAINED_MAIN_3_1.equals(this.profileLevelId)) {
                    createVideoFormat.setInteger("profile", 2);
                } else if ("42e01f".equals(this.profileLevelId)) {
                    createVideoFormat.setInteger("profile", 1);
                } else {
                    Logging.w(TAG, "Unknown profile level id: " + this.profileLevelId);
                }
            } else if (videoCodecType == VideoCodecType.H265) {
                if (this.lumaBitDepth == lumaBitDepth.depth()) {
                    createVideoFormat.setInteger("profile", 2);
                } else {
                    createVideoFormat.setInteger("profile", 1);
                }
                createVideoFormat.setInteger("level", 256);
                createVideoFormat.setInteger(KEY_BITRATE_MODE, this.bitrateMode);
            } else if (videoCodecType == VideoCodecType.AV1) {
                if (this.lumaBitDepth == lumaBitDepth.depth()) {
                    createVideoFormat.setInteger("profile", 2);
                } else {
                    createVideoFormat.setInteger("profile", 1);
                }
                createVideoFormat.setInteger("level", 32);
                createVideoFormat.setInteger(KEY_BITRATE_MODE, this.bitrateMode);
            }
            String str2 = this.params.get(VideoCodecInfo.KEY_AV_ENC_VIDEO_HWENC_CONFIG);
            this.customConfigJson = str2;
            MediaCodecUtils.applyCustomConfig(createVideoFormat, str2);
            Logging.w(TAG, "Format: " + createVideoFormat);
            final String str3 = this.profileLevelId;
            try {
                VideoCodecStatus videoCodecStatus3 = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoEncoder.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public VideoCodecStatus call() {
                        try {
                            HardwareVideoEncoder.this.codec.configure(createVideoFormat, null, null, 1);
                            if (HardwareVideoEncoder.this.useSurfaceMode) {
                                if (HardwareVideoEncoder.this.sharedContext instanceof EglBase10.Context) {
                                    Logging.w(HardwareVideoEncoder.TAG, "Encoders will use EglBase10");
                                    if (HardwareVideoEncoder.this.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
                                        HardwareVideoEncoder hardwareVideoEncoder = HardwareVideoEncoder.this;
                                        hardwareVideoEncoder.textureEglBase = new EglBase10((EglBase10.Context) hardwareVideoEncoder.sharedContext, ColorSpace.Transfer.SMPTEST2084.getTransfer(), false, EglBase.EglConfigType.CONFIG_RECORDABLE_TYPE);
                                    } else {
                                        HardwareVideoEncoder hardwareVideoEncoder2 = HardwareVideoEncoder.this;
                                        hardwareVideoEncoder2.textureEglBase = new EglBase10((EglBase10.Context) hardwareVideoEncoder2.sharedContext, EglBase.CONFIG_RECORDABLE);
                                    }
                                } else {
                                    Logging.w(HardwareVideoEncoder.TAG, "Encoders will use EglBase14");
                                    if (HardwareVideoEncoder.this.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
                                        HardwareVideoEncoder.this.textureEglBase = new EglBase14((EglBase14.Context) HardwareVideoEncoder.this.sharedContext, ColorSpace.Transfer.SMPTEST2084.getTransfer(), false, EglBase.EglConfigType.CONFIG_RECORDABLE_TYPE);
                                    } else {
                                        HardwareVideoEncoder.this.textureEglBase = new EglBase14((EglBase14.Context) HardwareVideoEncoder.this.sharedContext, EglBase.CONFIG_RECORDABLE);
                                    }
                                }
                                HardwareVideoEncoder hardwareVideoEncoder3 = HardwareVideoEncoder.this;
                                hardwareVideoEncoder3.textureInputSurface = hardwareVideoEncoder3.codec.createInputSurface();
                                HardwareVideoEncoder.this.textureEglBase.createSurface(HardwareVideoEncoder.this.textureInputSurface);
                                HardwareVideoEncoder.this.textureEglBase.makeCurrent();
                            }
                            HardwareVideoEncoder.this.codec.start();
                            Logging.i(HardwareVideoEncoder.TAG, "media encoder started");
                            return VideoCodecStatus.OK;
                        } catch (Throwable th2) {
                            Logging.e(HardwareVideoEncoder.TAG, "initEncodeInternal failed. " + th2.getMessage());
                            HardwareVideoEncoder.this.release();
                            return ((th2 instanceof RuntimeException) && !TextUtils.isEmpty(str3) && MediaCodecUtils.isMediaCodecException(th2) == VideoCodecStatus.ERROR) ? VideoCodecStatus.FALLBACK_DEFAULT_PROFILE : VideoCodecStatus.FALLBACK_SOFTWARE;
                        }
                    }
                });
                if (videoCodecStatus3 == null) {
                    return VideoCodecStatus.FALLBACK_SOFTWARE;
                }
                if (videoCodecStatus3 != videoCodecStatus2) {
                    return videoCodecStatus3;
                }
                this.supportCodecInfo = VideoEncoderUtils.getSupportedEncoders();
                this.running = true;
                Thread createOutputThread = createOutputThread();
                this.outputThread = createOutputThread;
                createOutputThread.start();
                return videoCodecStatus3;
            } catch (Exception unused) {
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (Exception unused2) {
            codecUnavailableMap.put(this.codecName, Boolean.TRUE);
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public static boolean objectsEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    private boolean parse10BitAlignmentFromParam() {
        try {
            String str = this.params.get(KEY_AV_ENC_VIDEO_HDR_WIDTH_ALIGNMENT);
            String str2 = this.params.get(KEY_AV_ENC_VIDEO_HDR_HEIGHT_ALIGNMENT);
            if (str != null) {
                this.widthAlignment = Integer.parseInt(str);
            }
            if (str2 != null) {
                this.heightAlignment = Integer.parseInt(str2);
            }
            Logging.i(TAG, "parse from param, hdr widthAlignment: " + this.widthAlignment + " ,hdr heightAlignment: " + this.heightAlignment);
            return (str == null && str2 == null) ? false : true;
        } catch (Exception unused) {
            Logging.i(TAG, "fail to convert alignment");
            return false;
        }
    }

    private boolean parseAdjustmentRebootScheme() {
        try {
            String str = this.params.get(KEY_AV_ENC_VIDEO_ADJUSTMENT_RESET);
            if (str == null) {
                return false;
            }
            boolean parseBoolean = Boolean.parseBoolean(str);
            Logging.i(TAG, "parse from param, bitrate adjustment rebootScheme: " + parseBoolean);
            return parseBoolean;
        } catch (Exception unused) {
            Logging.i(TAG, "fail to convert adjustment rebootScheme.");
            return false;
        }
    }

    private int parseAdjustmentTypeFromParam() {
        int parseInt;
        try {
            String str = this.params.get(VideoCodecInfo.KEY_AV_DEC_VIDEO_BITRATE_ADJUSTMENT_TYPE);
            if (str == null || (parseInt = Integer.parseInt(str)) < 0 || parseInt > 4) {
                return -1;
            }
            Logging.i(TAG, "parse from param, bitrate adjustment type: " + str);
            return parseInt;
        } catch (Exception unused) {
            Logging.i(TAG, "fail to convert adjustmentType.");
            return -1;
        }
    }

    private boolean parseAlignmentFromParam() {
        try {
            String str = this.params.get(KEY_AV_ENC_VIDEO_WIDTH_ALIGNMENT);
            String str2 = this.params.get(KEY_AV_ENC_VIDEO_HEIGHT_ALIGNMENT);
            String str3 = this.params.get(KEY_AV_ENC_VIDEO_FORCE_ALIGNMENT);
            if (str != null) {
                this.widthAlignment = Integer.parseInt(str);
            }
            if (str2 != null) {
                this.heightAlignment = Integer.parseInt(str2);
            }
            if (str3 != null) {
                this.forceAlignment = Boolean.parseBoolean(str3);
            }
            return (str == null || str2 == null) ? false : true;
        } catch (Exception unused) {
            Logging.i(TAG, "fail to convert alignment");
            return false;
        }
    }

    private void parseTimeWaitFromParam() {
        try {
            String str = this.params.get(KEY_AV_ENC_VIDEO_ENABLE_DEQUEUE_TIMEWAIT);
            Boolean valueOf = str != null ? Boolean.valueOf(Boolean.parseBoolean(str)) : null;
            this.forceDequeueTimeWait = valueOf != null && valueOf.booleanValue();
            Logging.i(TAG, "parse timeWaitFromParam success, value : " + this.forceDequeueTimeWait);
        } catch (Exception unused) {
            Logging.i(TAG, "fail to convert timeAwaitMode");
        }
    }

    private void readVideoCapabilities() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean parse10BitAlignmentFromParam = this.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth() ? parse10BitAlignmentFromParam() : parseAlignmentFromParam();
        if (parse10BitAlignmentFromParam) {
            Logging.w(TAG, "parse from param, align size: " + this.widthAlignment + C5444x.f55808b + this.heightAlignment + " ");
        }
        try {
            codecCapabilities = this.codec.getCodecInfo(this.codecType.mimeType());
        } catch (Exception unused) {
            Logging.e(TAG, "Cannot get CodecInfo " + this.codecName);
            codecCapabilities = null;
        }
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return;
        }
        if (!parse10BitAlignmentFromParam) {
            if (this.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
                this.widthAlignment = 64;
                this.heightAlignment = 32;
            }
            this.widthAlignment = Math.max(videoCapabilities.getWidthAlignment(), this.widthAlignment);
            this.heightAlignment = Math.max(videoCapabilities.getHeightAlignment(), this.heightAlignment);
        }
        Range<Integer> supportedWidths = videoCapabilities.getSupportedWidths();
        if (supportedWidths != null) {
            this.maxSupportedWidth = supportedWidths.getUpper().intValue();
            this.minSupportedWidth = supportedWidths.getLower().intValue();
        }
        Range<Integer> supportedHeights = videoCapabilities.getSupportedHeights();
        if (supportedHeights != null) {
            this.maxSupportedHeight = supportedHeights.getUpper().intValue();
            this.minSupportedHeight = supportedHeights.getLower().intValue();
        }
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        if (bitrateRange != null) {
            this.maxSupportedBitrate = bitrateRange.getUpper().intValue();
            this.minSupportedBitrate = bitrateRange.getLower().intValue();
        }
        Logging.w(TAG, this.codecType.mimeType() + "  max supported size:" + this.maxSupportedWidth + C5444x.f55808b + this.maxSupportedHeight + " min supported size:" + this.minSupportedWidth + C5444x.f55808b + this.minSupportedHeight + " align size: " + this.widthAlignment + C5444x.f55808b + this.heightAlignment + " bitrate range: " + this.maxSupportedBitrate + " -> " + this.minSupportedBitrate);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("max supported instance: ");
        sb2.append(codecCapabilities.getMaxSupportedInstances());
        Logging.w(TAG, sb2.toString());
    }

    private VideoCodecStatus releaseInternal() {
        Logging.i(TAG, "releaseInternal");
        if (this.proxyThreadHandler == null) {
            return VideoCodecStatus.ERROR;
        }
        if (!this.running) {
            Logging.w(TAG, "release: encoder is not running.");
            return VideoCodecStatus.NO_OUTPUT;
        }
        if (this.outputThread == null) {
            Logging.w(TAG, "release: encoder outputThread null");
            return VideoCodecStatus.NO_OUTPUT;
        }
        this.running = false;
        try {
            VideoCodecStatus videoCodecStatus = (VideoCodecStatus) ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 5000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoEncoder.5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() {
                    HardwareVideoEncoder.this.lock.lock();
                    try {
                        try {
                            Logging.i(HardwareVideoEncoder.TAG, "stop media encoder...");
                            HardwareVideoEncoder.this.codec.stop();
                            Logging.i(HardwareVideoEncoder.TAG, "release media encoder...");
                            HardwareVideoEncoder.this.codec.release();
                            Logging.i(HardwareVideoEncoder.TAG, "stop media finally...");
                            HardwareVideoEncoder.this.textureDrawer.release();
                            HardwareVideoEncoder.this.videoFrameDrawer.release();
                            if (HardwareVideoEncoder.this.textureEglBase != null) {
                                HardwareVideoEncoder.this.textureEglBase.detachCurrent();
                                HardwareVideoEncoder.this.textureEglBase.release();
                                HardwareVideoEncoder.this.textureEglBase = null;
                            }
                            if (HardwareVideoEncoder.this.textureInputSurface != null) {
                                HardwareVideoEncoder.this.textureInputSurface.release();
                                HardwareVideoEncoder.this.textureInputSurface = null;
                            }
                            HardwareVideoEncoder.this.codec = null;
                            HardwareVideoEncoder.this.inputDropCount = 0;
                            HardwareVideoEncoder.this.outputThread = null;
                            HardwareVideoEncoder.this.configBuffer = null;
                            HardwareVideoEncoder.this.outputBuilders.clear();
                            HardwareVideoEncoder.this.encodeTimeStamps.clear();
                            HardwareVideoEncoder.this.codecSpecificInfoMap.clear();
                            HardwareVideoEncoder.this.lock.unlock();
                            Logging.i(HardwareVideoEncoder.TAG, "release media encoder done");
                            return VideoCodecStatus.OK;
                        } catch (Exception e10) {
                            Logging.e(HardwareVideoEncoder.TAG, "Media encoder release failed", e10);
                            VideoCodecStatus videoCodecStatus2 = VideoCodecStatus.ERROR;
                            Logging.i(HardwareVideoEncoder.TAG, "stop media finally...");
                            HardwareVideoEncoder.this.textureDrawer.release();
                            HardwareVideoEncoder.this.videoFrameDrawer.release();
                            if (HardwareVideoEncoder.this.textureEglBase != null) {
                                HardwareVideoEncoder.this.textureEglBase.detachCurrent();
                                HardwareVideoEncoder.this.textureEglBase.release();
                                HardwareVideoEncoder.this.textureEglBase = null;
                            }
                            if (HardwareVideoEncoder.this.textureInputSurface != null) {
                                HardwareVideoEncoder.this.textureInputSurface.release();
                                HardwareVideoEncoder.this.textureInputSurface = null;
                            }
                            HardwareVideoEncoder.this.codec = null;
                            HardwareVideoEncoder.this.inputDropCount = 0;
                            HardwareVideoEncoder.this.outputThread = null;
                            HardwareVideoEncoder.this.configBuffer = null;
                            HardwareVideoEncoder.this.outputBuilders.clear();
                            HardwareVideoEncoder.this.encodeTimeStamps.clear();
                            HardwareVideoEncoder.this.codecSpecificInfoMap.clear();
                            HardwareVideoEncoder.this.lock.unlock();
                            return videoCodecStatus2;
                        }
                    } catch (Throwable th2) {
                        Logging.i(HardwareVideoEncoder.TAG, "stop media finally...");
                        HardwareVideoEncoder.this.textureDrawer.release();
                        HardwareVideoEncoder.this.videoFrameDrawer.release();
                        if (HardwareVideoEncoder.this.textureEglBase != null) {
                            HardwareVideoEncoder.this.textureEglBase.detachCurrent();
                            HardwareVideoEncoder.this.textureEglBase.release();
                            HardwareVideoEncoder.this.textureEglBase = null;
                        }
                        if (HardwareVideoEncoder.this.textureInputSurface != null) {
                            HardwareVideoEncoder.this.textureInputSurface.release();
                            HardwareVideoEncoder.this.textureInputSurface = null;
                        }
                        HardwareVideoEncoder.this.codec = null;
                        HardwareVideoEncoder.this.inputDropCount = 0;
                        HardwareVideoEncoder.this.outputThread = null;
                        HardwareVideoEncoder.this.configBuffer = null;
                        HardwareVideoEncoder.this.outputBuilders.clear();
                        HardwareVideoEncoder.this.encodeTimeStamps.clear();
                        HardwareVideoEncoder.this.codecSpecificInfoMap.clear();
                        HardwareVideoEncoder.this.lock.unlock();
                        throw th2;
                    }
                }
            });
            return videoCodecStatus != null ? videoCodecStatus : VideoCodecStatus.ERROR;
        } catch (Exception unused) {
            return VideoCodecStatus.ERROR;
        }
    }

    private void requestKeyFrame(final long j10) {
        if (this.proxyThreadHandler == null) {
            return;
        }
        if (!this.running) {
            Logging.e(TAG, "requestKeyFrame fail, encoder is not initialized!");
            return;
        }
        try {
            ThreadUtils.invokeAtFrontUninterruptibly(this.proxyThreadHandler, 2000L, new Callable<VideoCodecStatus>() { // from class: io.agora.base.internal.video.HardwareVideoEncoder.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public VideoCodecStatus call() {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putInt("request-sync", 0);
                        HardwareVideoEncoder.this.codec.setParameters(bundle);
                        HardwareVideoEncoder.this.lastKeyFrameNs = j10;
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e10) {
                        Logging.e(HardwareVideoEncoder.TAG, "requestKeyFrame failed", e10);
                        return VideoCodecStatus.ERROR;
                    }
                }
            });
        } catch (Exception e10) {
            Logging.e(TAG, "requestKeyFrame failed", e10);
        }
    }

    private VideoCodecStatus resetCodec(int i10, int i11, boolean z10, boolean z11, EglBase.Context context, int i12, ColorSpace colorSpace) {
        VideoCodecStatus releaseInternal = releaseInternal();
        VideoEncoder.Callback callback = this.callback;
        if (callback != null) {
            callback.onEncodeReset();
        }
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        this.width = i10;
        this.height = i11;
        this.colorSpace = colorSpace;
        this.sharedContext = context;
        this.useSurfaceMode = z10;
        this.shouldUseBaseline = z11;
        this.lumaBitDepth = i12;
        if (i12 == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
            this.yuvColorFormat = 54;
        } else {
            this.yuvColorFormat = this.yuvColorFormatOf8bit;
        }
        this.yuvFormat = YuvFormat.valueOf(this.yuvColorFormat.intValue(), MediaCodecUtils.yuv420spPreferNV21(this.codecName));
        if (this.sharedContext != null) {
            Logging.w(TAG, "resetCodec. contains shared EglBase.Context. Encoders will use texture mode.");
        } else {
            Logging.w(TAG, "resetCodec. No shared EglBase.Context. Encoders will not use texture mode.");
        }
        return initEncodeInternal();
    }

    private void resolutionAlignmentChecker() {
        if (this.useSurfaceMode) {
            if (!this.forceAlignment) {
                return;
            } else {
                Logging.w(TAG, "force resolution alignment in surface mode");
            }
        }
        int i10 = this.width;
        int i11 = this.widthAlignment;
        this.alignedWidth = (((i10 + i11) - 1) / i11) * i11;
        int i12 = this.height;
        int i13 = this.heightAlignment;
        this.alignedHeight = (((i12 + i13) - 1) / i13) * i13;
        Logging.i(TAG, "resolutionAlignmentChecker, alignedWidth : " + this.alignedWidth + ", alignedHeight: " + this.alignedHeight);
    }

    public static void setMockEncoderQueueFull(boolean z10) {
        mockEncoderQueueFull = z10;
    }

    private boolean shouldForceKeyFrame(long j10) {
        long j11 = this.forcedKeyFrameNs;
        return j11 > 0 && j10 > this.lastKeyFrameNs + j11;
    }

    private VideoCodecStatus updateBitrate() {
        if (!this.running) {
            Logging.e(TAG, "update bitrate fail, encoder is not initialized!");
            return VideoCodecStatus.NO_OUTPUT;
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "updateBitrate failed", e10);
            return MediaCodecUtils.isMediaCodecException(e10);
        }
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus attachProxyThread() {
        if (this.proxyThreadHandler == null) {
            Logging.i(TAG, "attach encoder proxyThread");
            try {
                HandlerThread handlerThread = new HandlerThread("proxyThread-Encoder");
                handlerThread.start();
                this.proxyThreadHandler = new Handler(handlerThread.getLooper());
            } catch (Exception e10) {
                Logging.w(TAG, "attach encoder proxyThread fail!, " + e10.getMessage());
            }
        }
        return VideoCodecStatus.OK;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public long createNativeVideoEncoder() {
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x021a, code lost:
    
        io.agora.base.internal.Logging.e(io.agora.base.internal.video.HardwareVideoEncoder.TAG, "HW encodeTimeStamps empty. cannot find: " + r0.presentationTimeUs);
        r0 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025f A[Catch: all -> 0x00c5, Exception -> 0x00c8, IllegalStateException -> 0x00cb, TryCatch #1 {Exception -> 0x00c8, blocks: (B:32:0x008e, B:35:0x009f, B:37:0x00a6, B:41:0x00d6, B:43:0x00f2, B:44:0x027b, B:48:0x011f, B:50:0x0130, B:51:0x0133, B:55:0x013d, B:57:0x0144, B:59:0x014a, B:61:0x014e, B:63:0x01a0, B:64:0x01a5, B:66:0x01b8, B:67:0x01bb, B:69:0x01cb, B:70:0x01d0, B:71:0x01d9, B:73:0x01e1, B:75:0x01eb, B:77:0x01f5, B:80:0x021a, B:82:0x025b, B:84:0x025f, B:85:0x0268, B:87:0x026c, B:89:0x0233, B:91:0x0241, B:94:0x01a3, B:95:0x019a), top: B:31:0x008e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x026c A[Catch: all -> 0x00c5, Exception -> 0x00c8, IllegalStateException -> 0x00cb, TryCatch #1 {Exception -> 0x00c8, blocks: (B:32:0x008e, B:35:0x009f, B:37:0x00a6, B:41:0x00d6, B:43:0x00f2, B:44:0x027b, B:48:0x011f, B:50:0x0130, B:51:0x0133, B:55:0x013d, B:57:0x0144, B:59:0x014a, B:61:0x014e, B:63:0x01a0, B:64:0x01a5, B:66:0x01b8, B:67:0x01bb, B:69:0x01cb, B:70:0x01d0, B:71:0x01d9, B:73:0x01e1, B:75:0x01eb, B:77:0x01f5, B:80:0x021a, B:82:0x025b, B:84:0x025f, B:85:0x0268, B:87:0x026c, B:89:0x0233, B:91:0x0241, B:94:0x01a3, B:95:0x019a), top: B:31:0x008e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void deliverEncodedImage() {
        ReentrantLock reentrantLock;
        MediaCodec.BufferInfo bufferInfo;
        int dequeueOutputBuffer;
        ByteBuffer slice;
        int i10;
        VideoCodecType videoCodecType;
        if (this.forceDequeueTimeWait) {
            this.lock.lock();
            if (!this.running || this.codec == null) {
                Logging.e(TAG, "[HWS] deliverEncodedImage fail, encoder is not initialized! codec " + this.codecName);
                return;
            }
            while (this.running && this.outputBuilders.size() == 0) {
                try {
                    this.condition.await(1000 / Math.min(90, Math.max(10, this.maxFramerate)), TimeUnit.MILLISECONDS);
                } catch (Exception e10) {
                    Logging.e(TAG, "codec = " + this.codecName + " deliverOutput failed " + e10);
                }
            }
            this.lock.unlock();
        }
        this.lock.lock();
        if (!this.running || this.codec == null) {
            Logging.e(TAG, "[HWS] deliverEncodedImage fail, encoder is not initialized! codec " + this.codecName);
            return;
        }
        try {
            try {
                try {
                    bufferInfo = new MediaCodec.BufferInfo();
                    dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, this.forceDequeueTimeWait ? 0L : 100000L);
                    if (dequeueOutputBuffer == -2) {
                        Logging.w(TAG, "Encoder output format changed: " + this.codec.getOutputFormat().toString());
                    }
                } catch (Exception e11) {
                    Logging.e(TAG, "codec = " + this.codecName + " deliverOutput error " + e11);
                    this.shouldFallbackSoftware = true;
                }
            } catch (IllegalStateException e12) {
                Logging.e(TAG, "codec = " + this.codecName + " deliverOutput failed " + e12);
                if (!this.deliveredVideoFrame) {
                    this.shouldFallbackSoftware = true;
                } else if (MediaCodecUtils.isMediaCodecException(e12) != VideoCodecStatus.ERROR) {
                    this.shouldFallbackSoftware = true;
                } else {
                    this.shouldResetCodec = true;
                }
            }
            if (dequeueOutputBuffer < 0) {
                return;
            }
            ByteBuffer byteBuffer = this.codec.getOutputBuffers()[dequeueOutputBuffer];
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            if ((bufferInfo.flags & 2) != 0) {
                Logging.i(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                this.configBuffer = allocateDirect;
                allocateDirect.put(byteBuffer);
            } else {
                this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
                if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                    updateBitrate();
                }
                boolean z10 = (bufferInfo.flags & 1) != 0;
                if (z10) {
                    Logging.i(TAG, "Sync frame generated");
                }
                if (z10 && ((videoCodecType = this.codecType) == VideoCodecType.H264 || videoCodecType == VideoCodecType.H265)) {
                    Logging.i(TAG, "Prepending config frame of size " + this.configBuffer.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
                    slice = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                    this.configBuffer.rewind();
                    slice.put(this.configBuffer);
                    slice.put(byteBuffer);
                    slice.flip();
                } else {
                    slice = byteBuffer.slice();
                }
                EncodedImage.FrameType frameType = z10 ? EncodedImage.FrameType.VideoFrameKey : EncodedImage.FrameType.VideoFrameDelta;
                EncodedImage.Builder poll = this.outputBuilders.poll();
                poll.setBuffer(slice).setFrameType(frameType);
                if (this.useSurfaceMode) {
                    poll.setShouldSkipColorSpaceOverride(true);
                }
                CodecSpecificInfo remove = this.codecSpecificInfoMap.remove(Long.valueOf(bufferInfo.presentationTimeUs));
                if (remove == null) {
                    remove = new CodecSpecificInfo();
                }
                CodecSpecificInfo codecSpecificInfo = remove;
                int size = this.encodeTimeStamps.size();
                TimeStamps timeStamps = null;
                while (!this.encodeTimeStamps.isEmpty() && (timeStamps = this.encodeTimeStamps.poll()) != null && timeStamps.presentationTimeStampUs != bufferInfo.presentationTimeUs) {
                    Logging.i(TAG, "HW encodeTimeStamps. cannot find: " + timeStamps.presentationTimeStampUs + "  presentationTimeUs: " + bufferInfo.presentationTimeUs);
                }
                int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - timeStamps.encodecStartTimeMs);
                if (elapsedRealtime > 2000) {
                    Logging.w(TAG, "Very high encode time: " + elapsedRealtime + "ms.");
                    i10 = 2000;
                    int supportCodecs = this.supportCodecInfo == null ? this.supportCodecInfo.getSupportCodecs() : 0;
                    if (this.running) {
                        this.callback.onEncodedFrame(poll.createEncodedImage(), i10, size, supportCodecs, this.bitrateMode, this.bitrateAdjustment, codecSpecificInfo);
                    }
                }
                i10 = elapsedRealtime;
                if (this.supportCodecInfo == null) {
                }
                if (this.running) {
                }
            }
            this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            this.deliveredVideoFrame = true;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus detachProxyThread() {
        Handler handler = this.proxyThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.proxyThreadHandler.getLooper().quitSafely();
            this.proxyThreadHandler = null;
            Logging.i(TAG, "detach encoder proxyThread");
        }
        return VideoCodecStatus.OK;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus encode(VideoFrame videoFrame, VideoEncoder.EncodeInfo encodeInfo, CodecSpecificInfo codecSpecificInfo) {
        boolean z10;
        if (this.codec == null || this.callback == null || this.proxyThreadHandler == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("encode uninitalized, codec: ");
            sb2.append(this.codec != null);
            sb2.append(", callback: ");
            sb2.append(this.callback);
            Logging.i(TAG, sb2.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        if (videoFrame.getBuffer() == null) {
            Logging.e(TAG, "encode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        }
        VideoFrame.Buffer buffer = videoFrame.getBuffer();
        boolean z11 = buffer instanceof VideoFrame.TextureBuffer;
        EglBase.Context eglBaseContext = z11 ? ((VideoFrame.TextureBuffer) buffer).getEglBaseContext() : null;
        int width = videoFrame.getBuffer().getWidth();
        int height = videoFrame.getBuffer().getHeight();
        boolean z12 = z11 && canUseSurface(eglBaseContext);
        boolean z13 = z12 && !objectsEquals(this.sharedContext, eglBaseContext);
        boolean shouldUseBaseline = VideoEncoderWrapper.shouldUseBaseline();
        int depth = ((buffer instanceof VideoFrame.I010Buffer) || (buffer instanceof VideoFrame.P010Buffer) || (z11 && ((VideoFrame.TextureBuffer) videoFrame.getBuffer()).is10BitTexture())) ? HdrUtil.LumaBitDepth.LUMA10BIT.depth() : HdrUtil.LumaBitDepth.LUMA8BIT.depth();
        if (width != this.width || height != this.height || z12 != this.useSurfaceMode || z13 || this.shouldUseBaseline != shouldUseBaseline || this.shouldResetCodec || this.lumaBitDepth != depth) {
            Logging.w(TAG, "[HWS] profile changed new profile : " + width + " " + height + " " + z12 + " " + z13 + " " + shouldUseBaseline + " " + this.shouldResetCodec);
            Logging.w(TAG, "[HWS] profile changed old profile : " + this.width + " " + this.height + " " + this.useSurfaceMode + " " + z13 + " " + this.shouldUseBaseline + " " + this.shouldResetCodec);
            VideoCodecStatus resetCodec = resetCodec(width, height, z12, shouldUseBaseline, eglBaseContext, depth, videoFrame.getColorSpace());
            if (resetCodec != VideoCodecStatus.OK) {
                Logging.w(TAG, "Failed to reset the codec: " + resetCodec);
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        }
        if (this.shouldFallbackSoftware) {
            release();
            Logging.w(TAG, "Fallback to software encoder");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        if (this.inputDropCount > 5) {
            release();
            Logging.w(TAG, "Fallback to software, no input buffers available");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        long j10 = 0;
        if (this.outputBuilders.size() > 5 || mockEncoderQueueFull) {
            Logging.e(TAG, "Dropped frame, encoder queue full");
            long currentTimeMillis = System.currentTimeMillis();
            if (this.firstEncoderQueueFullMs < 0) {
                this.firstEncoderQueueFullMs = currentTimeMillis;
            }
            if (currentTimeMillis - this.firstEncoderQueueFullMs > 2000) {
                Logging.e(TAG, "Fallback to software, encoder queue full");
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
            VideoEncoder.Callback callback = this.callback;
            if (callback != null && codecSpecificInfo != null) {
                callback.onEncodeBufferPrepared(codecSpecificInfo.opaque);
            }
            return VideoCodecStatus.NO_OUTPUT;
        }
        if (this.forceDequeueTimeWait && this.outputBuilders.size() != 0) {
            this.lock.lock();
            this.condition.signalAll();
            this.lock.unlock();
        }
        this.firstEncoderQueueFullMs = -1L;
        EncodedImage.FrameType[] frameTypeArr = encodeInfo.frameTypes;
        int length = frameTypeArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            }
            if (frameTypeArr[i10] == EncodedImage.FrameType.VideoFrameKey) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean shouldForceKeyFrame = shouldForceKeyFrame(videoFrame.getTimestampNs());
        if (z10 || shouldForceKeyFrame) {
            Logging.i(TAG, "request KeyFrame: " + z10 + ". shouldForce KeyFrame: " + shouldForceKeyFrame);
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int i11 = ((this.alignedWidth * this.alignedHeight) * 3) / 2;
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setCompleteFrame(true).setEncodedWidth(this.width).setEncodedHeight(this.height).setRotation(videoFrame.getRotation()));
        if (this.callback != null) {
            if (codecSpecificInfo != null) {
                j10 = codecSpecificInfo.opaque;
            } else {
                Logging.w(TAG, "onEncodeBufferPrepared fail, cannot get opaque.");
            }
            this.callback.onEncodeBufferPrepared(j10);
        }
        VideoCodecStatus encodeTextureBuffer = this.useSurfaceMode ? encodeTextureBuffer(videoFrame, codecSpecificInfo) : encodeByteBuffer(videoFrame, buffer, i11, codecSpecificInfo);
        if (encodeTextureBuffer != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        if (this.forceDequeueTimeWait && this.outputBuilders.size() != 0) {
            this.lock.lock();
            this.condition.signalAll();
            this.lock.unlock();
        }
        return encodeTextureBuffer;
    }

    public void fillInputBuffer(ByteBuffer byteBuffer, int i10, int i11, VideoFrame.Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, i10, i11, buffer);
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus flush() {
        if (this.codec == null || this.callback == null || this.proxyThreadHandler == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[HWS] encode uninitalized, codec: ");
            sb2.append(this.codec != null);
            sb2.append(", callback: ");
            sb2.append(this.callback);
            Logging.i(TAG, sb2.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        Logging.e(TAG, "[HWS] signalEndOfInputStream " + this.codecName + " useSurfaceMode = " + this.useSurfaceMode);
        if (this.useSurfaceMode) {
        } else {
            try {
                Logging.e(TAG, "[HWS] dequeueInputBuffer for flush");
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(0L);
                if (dequeueInputBuffer < 0) {
                    Logging.e(TAG, "[HWS] inputIndex < 0");
                    return VideoCodecStatus.ERROR;
                }
                try {
                    Logging.e(TAG, "[HWS] set end of stream flag");
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                } catch (Exception e10) {
                    Logging.e(TAG, "[HWS] queueInputBuffer failed", e10);
                    return VideoCodecStatus.ERROR;
                }
            } catch (Exception e11) {
                Logging.e(TAG, "[HWS] dequeueInputBuffer failed", e11);
                return VideoCodecStatus.ERROR;
            }
        }
        return VideoCodecStatus.OK;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    @SuppressLint({"DefaultLocale"})
    public VideoEncoder.EncoderStyle getEncoderStyle() {
        VideoEncoder.EncoderStyle encoderStyle = this.encoderStyle;
        if (encoderStyle != null) {
            return encoderStyle;
        }
        String str = this.cpuName;
        int parseAdjustmentTypeFromParam = parseAdjustmentTypeFromParam();
        VideoEncoder.EncoderStyle encoderStyle2 = BitrateAdjusterHelper.getEncoderStyle(this.codecName, str, parseAdjustmentRebootScheme());
        this.encoderStyle = encoderStyle2;
        if (parseAdjustmentTypeFromParam >= 0) {
            encoderStyle2.bitrateAdjustment = parseAdjustmentTypeFromParam;
        }
        Logging.i(TAG, "encoderStyle: " + this.encoderStyle + " cpuName: " + str);
        BitrateAdjuster bitrateAdjuster = this.bitrateAdjuster;
        if (bitrateAdjuster instanceof FactorBitrateAdjuster) {
            VideoEncoder.EncoderStyle encoderStyle3 = this.encoderStyle;
            encoderStyle3.bitrateAdjustNumerator = FactorBitrateAdjuster.FACTOR_LEVEL1;
            encoderStyle3.bitrateAdjustDenominator = 1000;
        }
        VideoEncoder.EncoderStyle encoderStyle4 = this.encoderStyle;
        this.bitrateAdjustment = encoderStyle4.bitrateAdjustment;
        return encoderStyle4;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public String getImplementationName() {
        return "HWEncoder";
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public long getResetCoolDownTimeMs() {
        return 10000L;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoEncoder.ScalingSettings getScalingSettings() {
        if (this.automaticResizeOn) {
            VideoCodecType videoCodecType = this.codecType;
            if (videoCodecType == VideoCodecType.VP8) {
                return new VideoEncoder.ScalingSettings(29, 95);
            }
            if (videoCodecType == VideoCodecType.H264) {
                return new VideoEncoder.ScalingSettings(28, 35);
            }
            if (videoCodecType == VideoCodecType.H265) {
                return new VideoEncoder.ScalingSettings(28, 35);
            }
        }
        return VideoEncoder.ScalingSettings.OFF;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoEncoder.VideoHWCodecSpec getVideoHWCodecSpec() {
        int i10;
        String codecNames = this.supportCodecInfo != null ? this.supportCodecInfo.getCodecNames() : "";
        String str = this.profileLevelId;
        int i11 = 0;
        if (str == null) {
            return new VideoEncoder.VideoHWCodecSpec(this.codecName, this.maxSupportedWidth + C5444x.f55808b + this.maxSupportedHeight, this.bitrateMode, this.useSurfaceMode ? 1 : 0, 0, this.minSupportedBitrate, codecNames);
        }
        if ("640c1f".equals(str)) {
            i11 = 3;
        } else if (VideoCodecInfo.H264_CONSTRAINED_MAIN_3_1.equals(this.profileLevelId)) {
            i11 = 2;
        } else if ("42e01f".equals(this.profileLevelId)) {
            i10 = 1;
            i11 = 1;
            return new VideoEncoder.VideoHWCodecSpec(this.codecName, this.maxSupportedWidth + C5444x.f55808b + this.maxSupportedHeight, this.bitrateMode, (this.useSurfaceMode ? 1 : 0) ^ i10, i11, this.minSupportedBitrate, codecNames);
        }
        i10 = 1;
        return new VideoEncoder.VideoHWCodecSpec(this.codecName, this.maxSupportedWidth + C5444x.f55808b + this.maxSupportedHeight, this.bitrateMode, (this.useSurfaceMode ? 1 : 0) ^ i10, i11, this.minSupportedBitrate, codecNames);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    @Override // io.agora.base.internal.video.VideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VideoCodecStatus initEncode(VideoEncoder.Settings settings, VideoEncoder.Callback callback) {
        Integer num;
        int i10;
        int i11;
        int i12;
        List asList;
        String str;
        int i13;
        Integer num2 = 0;
        if (this.running) {
            Logging.w(TAG, "already initialized!");
            return VideoCodecStatus.OK;
        }
        String name = this.info.getName();
        try {
            num = MediaCodecUtils.selectColorFormat(MediaCodecUtils.TEXTURE_COLOR_FORMATS, this.info.getCapabilitiesForType(this.codecType.mimeType()));
            try {
                num2 = MediaCodecUtils.selectColorFormat(MediaCodecUtils.encoderColorFormats(this.info.getName()), this.info.getCapabilitiesForType(this.codecType.mimeType()));
            } catch (IllegalArgumentException e10) {
                e = e10;
                Logging.e(TAG, "getCapabilitiesForType:", e);
                this.surfaceColorFormat = num;
                this.yuvColorFormatOf8bit = num2;
                this.yuvColorFormat = num2;
                this.yuvFormat = YuvFormat.valueOf(num2.intValue(), MediaCodecUtils.yuv420spPreferNV21(name));
                this.callback = callback;
                this.automaticResizeOn = settings.automaticResizeOn;
                int i14 = settings.width;
                this.width = i14;
                int i15 = settings.height;
                this.height = i15;
                this.alignedWidth = i14;
                this.alignedHeight = i15;
                this.encodeTimeStamps.clear();
                this.maxFramerate = settings.maxFramerate;
                this.colorSpace = settings.colorSpace;
                this.lumaBitDepth = settings.lumaBitDepth;
                i10 = settings.rateControlMode;
                if (i10 < 0) {
                }
                this.useSurfaceMode = !canUseSurface(this.sharedContext) && settings.expectTexture;
                this.shouldUseBaseline = VideoEncoderWrapper.shouldUseBaseline();
                this.shouldFallbackSoftware = false;
                this.shouldResetCodec = false;
                this.deliveredVideoFrame = false;
                i11 = settings.startBitrate;
                if (i11 != 0) {
                    this.bitrateAdjuster.setTargets(i11 * 1000, i13);
                }
                this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
                i12 = settings.keyFrameInterval;
                if (i12 != 0) {
                    this.keyFrameIntervalSec = i12;
                }
                if (settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
                }
                asList = Arrays.asList(INTERVAL_HW_EXCEPTION_MODELS);
                str = Build.MODEL;
                if (asList.contains(str)) {
                    Logging.i(TAG, "Model: " + str + " , need to modify interval. original keyInterval: " + this.keyFrameIntervalSec);
                    this.keyFrameIntervalSec = 10;
                }
                this.cpuName = settings.cpuName;
                if (!this.useSurfaceMode) {
                    Logging.i(TAG, "yuv colorFomat, need to modify interval. original keyInterval: " + this.keyFrameIntervalSec);
                    this.keyFrameIntervalSec = 2;
                }
                Logging.w(TAG, "initEncode: " + this.width + " x " + this.height + ". @ " + settings.startBitrate + "kbps. Fps: " + settings.maxFramerate + " Use surface mode: " + this.useSurfaceMode + " keyFrameIntervalSec: " + this.keyFrameIntervalSec + " bitrateMode: " + this.bitrateMode + " cpuName: " + this.cpuName);
                return initEncodeInternal();
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
            num = num2;
        }
        this.surfaceColorFormat = num;
        this.yuvColorFormatOf8bit = num2;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue(), MediaCodecUtils.yuv420spPreferNV21(name));
        this.callback = callback;
        this.automaticResizeOn = settings.automaticResizeOn;
        int i142 = settings.width;
        this.width = i142;
        int i152 = settings.height;
        this.height = i152;
        this.alignedWidth = i142;
        this.alignedHeight = i152;
        this.encodeTimeStamps.clear();
        this.maxFramerate = settings.maxFramerate;
        this.colorSpace = settings.colorSpace;
        this.lumaBitDepth = settings.lumaBitDepth;
        i10 = settings.rateControlMode;
        if (i10 < 0) {
            this.bitrateMode = i10;
        } else {
            this.bitrateMode = 1;
        }
        this.useSurfaceMode = !canUseSurface(this.sharedContext) && settings.expectTexture;
        this.shouldUseBaseline = VideoEncoderWrapper.shouldUseBaseline();
        this.shouldFallbackSoftware = false;
        this.shouldResetCodec = false;
        this.deliveredVideoFrame = false;
        i11 = settings.startBitrate;
        if (i11 != 0 && (i13 = settings.maxFramerate) != 0) {
            this.bitrateAdjuster.setTargets(i11 * 1000, i13);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        i12 = settings.keyFrameInterval;
        if (i12 != 0 && settings.maxFramerate != 0) {
            this.keyFrameIntervalSec = i12;
        }
        if (settings.lumaBitDepth == HdrUtil.LumaBitDepth.LUMA10BIT.depth()) {
            Integer num3 = 54;
            this.yuvColorFormat = num3;
            this.yuvFormat = YuvFormat.valueOf(num3.intValue(), MediaCodecUtils.yuv420spPreferNV21(name));
        }
        asList = Arrays.asList(INTERVAL_HW_EXCEPTION_MODELS);
        str = Build.MODEL;
        if (asList.contains(str) && this.keyFrameIntervalSec >= 100) {
            Logging.i(TAG, "Model: " + str + " , need to modify interval. original keyInterval: " + this.keyFrameIntervalSec);
            this.keyFrameIntervalSec = 10;
        }
        this.cpuName = settings.cpuName;
        if (!this.useSurfaceMode && this.codecType == VideoCodecType.AV1) {
            Logging.i(TAG, "yuv colorFomat, need to modify interval. original keyInterval: " + this.keyFrameIntervalSec);
            this.keyFrameIntervalSec = 2;
        }
        Logging.w(TAG, "initEncode: " + this.width + " x " + this.height + ". @ " + settings.startBitrate + "kbps. Fps: " + settings.maxFramerate + " Use surface mode: " + this.useSurfaceMode + " keyFrameIntervalSec: " + this.keyFrameIntervalSec + " bitrateMode: " + this.bitrateMode + " cpuName: " + this.cpuName);
        return initEncodeInternal();
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public boolean isHardwareEncoder() {
        return true;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public boolean isQcomHardware() {
        Logging.w(TAG, "[qualcom hardware] codecName:" + this.codecName);
        return this.codecName.startsWith("OMX.qcom") || this.codecName.startsWith("c2.qti.");
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus release() {
        Logging.i(TAG, "release encoder...");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        this.inputDropCount = 0;
        this.outputBuilders.clear();
        this.encodeTimeStamps.clear();
        this.codecSpecificInfoMap.clear();
        this.shouldFallbackSoftware = false;
        this.shouldResetCodec = false;
        this.deliveredVideoFrame = false;
        Logging.i(TAG, "release encoder done");
        return releaseInternal;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus resume() {
        if (this.codec == null || this.callback == null || this.proxyThreadHandler == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[HWS] encode uninitalized, codec: ");
            sb2.append(this.codec != null);
            sb2.append(", callback: ");
            sb2.append(this.callback);
            Logging.i(TAG, sb2.toString());
            return VideoCodecStatus.UNINITIALIZED;
        }
        Logging.e(TAG, "[HWS] Resume " + this.codecName + " useSurfaceMode = " + this.useSurfaceMode);
        if (this.useSurfaceMode) {
        } else {
            try {
                this.codec.flush();
            } catch (Throwable th2) {
                Logging.e(TAG, "[HWS] flush failed", th2);
                return VideoCodecStatus.ERROR;
            }
        }
        return VideoCodecStatus.OK;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus setChannelParameters(short s10, long j10) {
        return VideoCodecStatus.OK;
    }

    @Override // io.agora.base.internal.video.VideoEncoder
    public VideoCodecStatus setRates(int i10, int i11) {
        if (i11 > 60) {
            i11 = 60;
        }
        if (i11 <= 2) {
            i11 = 2;
        }
        int i12 = i10 * 1000;
        Logging.i(TAG, "setRates, bitrate:" + i12 + " ,framerate: " + i11 + " ,maxFramerate: " + this.maxFramerate + " adjustBitrate: " + i12);
        this.bitrateAdjuster.setTargets(Math.max(i12, this.minSupportedBitrate), i11);
        return VideoCodecStatus.OK;
    }
}
