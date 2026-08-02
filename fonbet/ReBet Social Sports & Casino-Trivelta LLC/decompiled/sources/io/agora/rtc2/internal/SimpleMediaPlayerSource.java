package io.agora.rtc2.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.ContextUtils;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.utils2.NetUtil;
import io.agora.utils2.internal.Logging;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class SimpleMediaPlayerSource {
    private static final int DEQUEUE_OR_DECODE_TIMEOUT_US = 1000;
    private static final int EXTRACTOR_TIMEOUT_MS = 2000;
    private static final List<String> HW_EXCEPTION_MODELS = Arrays.asList("Lenovo S90-u", "CHM-CL00", "CHM-TL00H", "CHM-UL00", "E6533", "HUAWEI CRR-UL00", "HUAWEI MT7-TL00", "HONOR H30-L01", "GN3001", "SCH-I869", "SM-G7509");
    private static final List<String> HW_UNSUPPORTED_MIMES = Arrays.asList("audio/x-ms-wma");
    private static final boolean IS_DEBUG = false;
    private static final String PREFIX_ASSETS = "/assets/";
    private static final String PREFIX_DOCUMENT = "content://";
    private static final String TAG = "SMPS";
    private MediaCodec mAudioDecoder;
    final int mAudioFrameSendInterval;
    ByteBuffer mByteBuffer;
    private MediaExtractorWrapper mExtractor;
    private volatile boolean mIsExtractorEndOfStream;
    ByteBuffer mJitterByteBuffer;
    private final SparseArray<MediaStreamInfoWrapper> mMediaStreamInfoMap = new SparseArray<>();
    private int mBytesPerSample = -1;
    private int mAudioSampleRate = -1;
    private int mAudioChannels = -1;
    private long mDurationMs = -1;
    private long mPlayPositionInMicroseconds = -1;

    public static class MediaExtractorWrapper {
        private final Handler mHandler;
        private final MediaExtractor mMediaExtractor;
        private volatile boolean mPrepared;
        private final String threadName;

        public MediaExtractorWrapper() {
            String str = "MediaExtractor-" + new Random().nextInt();
            this.threadName = str;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
            this.mMediaExtractor = new MediaExtractor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean setDataSource(final String str) {
            Logging.d(SimpleMediaPlayerSource.TAG, "setDataSource()");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final boolean startsWith = str.startsWith("/assets/");
            final boolean startsWith2 = str.startsWith("content://");
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.SimpleMediaPlayerSource.MediaExtractorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(SimpleMediaPlayerSource.TAG, "setDataSource in thread " + MediaExtractorWrapper.this.threadName + "  url: " + str);
                    try {
                        Context applicationContext = ContextUtils.getApplicationContext();
                        if (startsWith && applicationContext != null) {
                            AssetFileDescriptor openFd = applicationContext.getAssets().openFd(str.substring(8));
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        } else if (!startsWith2 || applicationContext == null) {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(str);
                        } else {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(applicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r").getFileDescriptor());
                        }
                        MediaExtractorWrapper.this.mPrepared = true;
                    } catch (Exception e10) {
                        Logging.w(SimpleMediaPlayerSource.TAG, "setDataSource fail: " + e10.toString());
                    }
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            Logging.d(SimpleMediaPlayerSource.TAG, "setDataSource complete");
            return this.mPrepared;
        }

        public void advance() {
            checkPrepared();
            this.mMediaExtractor.advance();
        }

        public void checkPrepared() {
            if (!this.mPrepared) {
                throw new IllegalStateException("mMediaExtractor hasn't prepared");
            }
        }

        public long getSampleTime() {
            checkPrepared();
            return this.mMediaExtractor.getSampleTime();
        }

        public int getTrackCount() {
            checkPrepared();
            return this.mMediaExtractor.getTrackCount();
        }

        public MediaFormat getTrackFormat(int i10) {
            checkPrepared();
            return this.mMediaExtractor.getTrackFormat(i10);
        }

        public int readSampleData(ByteBuffer byteBuffer, int i10) {
            checkPrepared();
            return this.mMediaExtractor.readSampleData(byteBuffer, i10);
        }

        public void release() {
            Logging.d(SimpleMediaPlayerSource.TAG, "release()");
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.SimpleMediaPlayerSource.MediaExtractorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (MediaExtractorWrapper.this.mMediaExtractor != null) {
                            MediaExtractorWrapper.this.mMediaExtractor.release();
                        }
                    } catch (Exception e10) {
                        Logging.e(SimpleMediaPlayerSource.TAG, "release media extractor exception.", e10);
                    }
                    MediaExtractorWrapper.this.mHandler.getLooper().quit();
                    Logging.d(SimpleMediaPlayerSource.TAG, "mediaExtractor released in thread " + MediaExtractorWrapper.this.threadName);
                }
            });
        }

        public void seekTo(long j10, int i10) {
            checkPrepared();
            this.mMediaExtractor.seekTo(j10, i10);
        }

        public void selectTrack(int i10) {
            checkPrepared();
            this.mMediaExtractor.selectTrack(i10);
        }

        public void unselectTrack(int i10) {
            checkPrepared();
            this.mMediaExtractor.unselectTrack(i10);
        }
    }

    public static class MediaStreamInfoWrapper extends MediaStreamInfo {

        @NonNull
        private MediaFormat format;

        public MediaStreamInfoWrapper(@NonNull MediaFormat mediaFormat) {
            this.format = mediaFormat;
        }

        @NonNull
        public MediaFormat getFormat() {
            return this.format;
        }
    }

    public @interface PlayerError {
        public static final int PLAYER_REASON_CODEC_NOT_SUPPORTED = -7;
        public static final int PLAYER_REASON_INTERNAL = -2;
        public static final int PLAYER_REASON_INTERRUPTED = -13;
        public static final int PLAYER_REASON_INVALID_ARGUMENTS = -1;
        public static final int PLAYER_REASON_INVALID_CONNECTION_STATE = -11;
        public static final int PLAYER_REASON_INVALID_MEDIA_SOURCE = -4;
        public static final int PLAYER_REASON_INVALID_STATE = -9;
        public static final int PLAYER_REASON_NONE = 0;
        public static final int PLAYER_REASON_NO_RESOURCE = -3;
        public static final int PLAYER_REASON_OBJ_NOT_INITIALIZED = -6;
        public static final int PLAYER_REASON_SRC_BUFFER_UNDERFLOW = -12;
        public static final int PLAYER_REASON_UNKNOWN_STREAM_TYPE = -5;
        public static final int PLAYER_REASON_URL_NOT_FOUND = -10;
        public static final int PLAYER_REASON_VIDEO_RENDER_FAILED = -8;
    }

    public static class SMPSIntervalData {
        private ByteBuffer byteBuffer = null;
        private boolean isEndOfStream = false;
        private boolean isError = false;

        @CalledByNative("SMPSIntervalData")
        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        @CalledByNative("SMPSIntervalData")
        public boolean isEndOfStream() {
            return this.isEndOfStream;
        }

        @CalledByNative("SMPSIntervalData")
        public boolean isError() {
            return this.isError;
        }
    }

    @CalledByNative
    public SimpleMediaPlayerSource(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("interval illegal");
        }
        this.mAudioFrameSendInterval = i10;
        reset();
    }

    private boolean acquireFrames(@NonNull ByteBuffer byteBuffer) {
        String str;
        if (!this.mIsExtractorEndOfStream) {
            int dequeueInputBuffer = this.mAudioDecoder.dequeueInputBuffer(1000L);
            if (dequeueInputBuffer < 0) {
                Logging.w(TAG, "wait for next available input buffer timeout");
            } else {
                int readSampleData = this.mExtractor.readSampleData(this.mAudioDecoder.getInputBuffers()[dequeueInputBuffer], 0);
                if (readSampleData < 0) {
                    Logging.w(TAG, "no more samples are available");
                    this.mAudioDecoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    this.mIsExtractorEndOfStream = true;
                } else {
                    long sampleTime = this.mExtractor.getSampleTime();
                    this.mPlayPositionInMicroseconds = sampleTime;
                    this.mAudioDecoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                    this.mExtractor.advance();
                }
            }
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = this.mAudioDecoder.dequeueOutputBuffer(bufferInfo, 1000L);
        if (dequeueOutputBuffer < 0) {
            if (dequeueOutputBuffer == -3) {
                str = "output buffers changed";
            } else {
                if (dequeueOutputBuffer != -2) {
                    if (dequeueOutputBuffer == -1) {
                        str = "info try again later";
                    }
                    return true;
                }
                str = "output format changed";
            }
            Logging.d(TAG, str);
            return true;
        }
        ByteBuffer byteBuffer2 = this.mAudioDecoder.getOutputBuffers()[dequeueOutputBuffer];
        byteBuffer2.position(bufferInfo.offset);
        byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.put(byteBuffer2);
        this.mAudioDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
        if ((bufferInfo.flags & 4) == 0) {
            return true;
        }
        Logging.w(TAG, "OutputBuffer BUFFER_FLAG_END_OF_STREAM");
        return false;
    }

    private boolean checkMimeTypeSupported(@NonNull MediaExtractorWrapper mediaExtractorWrapper) {
        int trackCount = mediaExtractorWrapper.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            String string = mediaExtractorWrapper.getTrackFormat(i10).getString("mime");
            if (string.startsWith("audio") && HW_UNSUPPORTED_MIMES.contains(string)) {
                return false;
            }
        }
        return true;
    }

    private static int findAudioTrackAndFillStreamInfo(@NonNull SparseArray<MediaStreamInfoWrapper> sparseArray, @NonNull MediaExtractorWrapper mediaExtractorWrapper, @NonNull String str) {
        int i10;
        MediaStreamInfoWrapper mediaStreamInfoWrapper;
        int trackCount = mediaExtractorWrapper.getTrackCount();
        Logging.d(TAG, "track count : " + trackCount);
        int i11 = -1;
        for (int i12 = 0; i12 < trackCount; i12++) {
            MediaFormat trackFormat = mediaExtractorWrapper.getTrackFormat(i12);
            String string = trackFormat.getString("mime");
            Logging.d(TAG, "track : " + i12 + " type : " + string);
            if (string.startsWith("audio")) {
                mediaStreamInfoWrapper = getAudioTrackInfo(trackFormat);
                i10 = i12;
            } else if (string.startsWith("video")) {
                MediaStreamInfoWrapper videoTrackInfo = getVideoTrackInfo(trackFormat);
                i10 = i11;
                mediaStreamInfoWrapper = videoTrackInfo;
            }
            if (mediaStreamInfoWrapper.getDuration() == 0 && !str.startsWith("http")) {
                mediaStreamInfoWrapper.setDuration(getLocalFileDuration(str));
            }
            sparseArray.put(i12, mediaStreamInfoWrapper);
            i11 = i10;
        }
        return i11;
    }

    @NonNull
    public static MediaStreamInfoWrapper getAudioTrackInfo(@NonNull MediaFormat mediaFormat) {
        MediaStreamInfoWrapper mediaStreamInfoWrapper = new MediaStreamInfoWrapper(mediaFormat);
        mediaStreamInfoWrapper.setMediaStreamType(Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_AUDIO));
        if (mediaFormat.containsKey("mime")) {
            mediaStreamInfoWrapper.setCodecName(mediaFormat.getString("mime"));
        }
        if (mediaFormat.containsKey("language")) {
            mediaStreamInfoWrapper.setLanguage(mediaFormat.getString("language"));
        }
        if (mediaFormat.containsKey("sample-rate")) {
            int integer = mediaFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = 11000;
            }
            mediaStreamInfoWrapper.setAudioSampleRate(integer);
        }
        if (mediaFormat.containsKey("channel-count")) {
            mediaStreamInfoWrapper.setAudioChannels(mediaFormat.getInteger("channel-count"));
        }
        if (mediaFormat.containsKey("durationUs")) {
            mediaStreamInfoWrapper.setDuration(mediaFormat.getLong("durationUs") / 1000);
        }
        int integer2 = mediaFormat.containsKey("pcm-encoding") ? mediaFormat.getInteger("pcm-encoding") : 2;
        if (integer2 == 2) {
            mediaStreamInfoWrapper.setAudioBytesPerSample(2);
            return mediaStreamInfoWrapper;
        }
        if (integer2 == 3) {
            mediaStreamInfoWrapper.setAudioBytesPerSample(1);
            return mediaStreamInfoWrapper;
        }
        if (integer2 != 4) {
            return mediaStreamInfoWrapper;
        }
        mediaStreamInfoWrapper.setAudioBytesPerSample(4);
        return mediaStreamInfoWrapper;
    }

    private static long getLocalFileDuration(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0L;
        }
    }

    private static int getMaxOutputBufferSize(@NonNull MediaCodec mediaCodec) {
        int i10 = 0;
        for (ByteBuffer byteBuffer : mediaCodec.getOutputBuffers()) {
            i10 = Math.max(byteBuffer.capacity(), i10);
        }
        return i10;
    }

    @NonNull
    private static MediaStreamInfoWrapper getVideoTrackInfo(@NonNull MediaFormat mediaFormat) {
        MediaStreamInfoWrapper mediaStreamInfoWrapper = new MediaStreamInfoWrapper(mediaFormat);
        mediaStreamInfoWrapper.setMediaStreamType(Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_VIDEO));
        if (mediaFormat.containsKey("mime")) {
            mediaStreamInfoWrapper.setCodecName(mediaFormat.getString("mime"));
        }
        if (mediaFormat.containsKey("language")) {
            mediaStreamInfoWrapper.setLanguage(mediaFormat.getString("language"));
        }
        if (mediaFormat.containsKey("height")) {
            mediaStreamInfoWrapper.setVideoHeight(mediaFormat.getInteger("height"));
        }
        if (mediaFormat.containsKey("width")) {
            mediaStreamInfoWrapper.setVideoWidth(mediaFormat.getInteger("width"));
        }
        if (mediaFormat.containsKey("durationUs")) {
            mediaStreamInfoWrapper.setDuration(mediaFormat.getLong("durationUs") / 1000);
        }
        return mediaStreamInfoWrapper;
    }

    private int openImpl(@NonNull String str, long j10) {
        String str2;
        MediaExtractorWrapper mediaExtractorWrapper = new MediaExtractorWrapper();
        this.mExtractor = mediaExtractorWrapper;
        if (mediaExtractorWrapper.setDataSource(str) && checkMimeTypeSupported(this.mExtractor)) {
            this.mMediaStreamInfoMap.clear();
            int findAudioTrackAndFillStreamInfo = findAudioTrackAndFillStreamInfo(this.mMediaStreamInfoMap, this.mExtractor, str);
            MediaStreamInfoWrapper mediaStreamInfoWrapper = this.mMediaStreamInfoMap.get(findAudioTrackAndFillStreamInfo);
            if (mediaStreamInfoWrapper == null) {
                str2 = "Failed to find audio track";
            } else {
                MediaFormat format = mediaStreamInfoWrapper.getFormat();
                this.mDurationMs = mediaStreamInfoWrapper.getDuration();
                this.mAudioChannels = mediaStreamInfoWrapper.getAudioChannels();
                this.mAudioSampleRate = mediaStreamInfoWrapper.getAudioSampleRate();
                this.mBytesPerSample = mediaStreamInfoWrapper.getAudioBytesPerSample();
                Logging.d(TAG, "DurationMs: " + this.mDurationMs + ", AudioChannels: " + this.mAudioChannels + ", AudioSampleRate: " + this.mAudioSampleRate + ", BytesPerSample: " + this.mBytesPerSample);
                if (this.mBytesPerSample == 0) {
                    str2 = "Failed to check bytesPerSample";
                } else {
                    this.mExtractor.selectTrack(findAudioTrackAndFillStreamInfo);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(format.getString("mime"));
                    this.mAudioDecoder = createDecoderByType;
                    createDecoderByType.configure(format, (Surface) null, (MediaCrypto) null, 0);
                    this.mAudioDecoder.start();
                    ByteBuffer allocate = ByteBuffer.allocate(getMaxOutputBufferSize(this.mAudioDecoder) * 2);
                    this.mJitterByteBuffer = allocate;
                    allocate.flip();
                    int i10 = this.mAudioSampleRate / (1000 / this.mAudioFrameSendInterval);
                    int i11 = this.mBytesPerSample * i10 * this.mAudioChannels;
                    this.mByteBuffer = ByteBuffer.allocateDirect(i11);
                    Logging.d(TAG, " samplesPerChannel: " + i10 + ", bytesPerInterval: " + i11);
                    if (this.mByteBuffer.hasArray()) {
                        if (j10 > 0) {
                            this.mExtractor.seekTo(j10 * 1000, 2);
                        }
                        return 0;
                    }
                    str2 = "ByteBuffer does not have backing array.";
                }
            }
            Logging.e(TAG, str2);
        } else {
            Logging.w(TAG, "Failed to setDataSource");
        }
        reset();
        return -2;
    }

    private void reset() {
        Logging.d(TAG, "reset()");
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper != null) {
            mediaExtractorWrapper.release();
            this.mExtractor = null;
        }
        MediaCodec mediaCodec = this.mAudioDecoder;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e10) {
                Logging.e(TAG, "Media decoder stop failed", e10);
            }
            try {
                this.mAudioDecoder.release();
            } catch (Exception e11) {
                Logging.e(TAG, "Media decoder release failed", e11);
            }
            this.mAudioDecoder = null;
        }
        ByteBuffer byteBuffer = this.mJitterByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.mJitterByteBuffer = null;
        }
        ByteBuffer byteBuffer2 = this.mByteBuffer;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.mByteBuffer = null;
        }
        this.mMediaStreamInfoMap.clear();
        this.mAudioSampleRate = -1;
        this.mAudioChannels = -1;
        this.mBytesPerSample = -1;
        this.mDurationMs = -1L;
        this.mIsExtractorEndOfStream = false;
    }

    private int selectAudioTrackWithPos(int i10, long j10) {
        String str;
        int trackCount = this.mExtractor.getTrackCount();
        Logging.i(TAG, "selectAudioTrackWithPos audioTrackIndex: " + i10 + ", startPos: " + j10 + " ms, TrackCount: " + trackCount);
        MediaStreamInfoWrapper mediaStreamInfoWrapper = this.mMediaStreamInfoMap.get(i10);
        if (mediaStreamInfoWrapper == null || mediaStreamInfoWrapper.getMediaStreamType() != Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_AUDIO)) {
            str = "Failed to find audio track";
        } else {
            for (int i11 = 0; i11 < trackCount; i11++) {
                this.mExtractor.unselectTrack(i11);
            }
            this.mDurationMs = mediaStreamInfoWrapper.getDuration();
            this.mAudioChannels = mediaStreamInfoWrapper.getAudioChannels();
            this.mAudioSampleRate = mediaStreamInfoWrapper.getAudioSampleRate();
            this.mBytesPerSample = mediaStreamInfoWrapper.getAudioBytesPerSample();
            Logging.i(TAG, "DurationMs: " + this.mDurationMs + ", AudioChannels: " + this.mAudioChannels + ", AudioSampleRate: " + this.mAudioSampleRate + ", BytesPerSample: " + this.mBytesPerSample);
            if (this.mBytesPerSample != 0) {
                this.mExtractor.selectTrack(i10);
                if (j10 > 0) {
                    this.mExtractor.seekTo(j10 * 1000, 2);
                }
                return 0;
            }
            str = "Failed to check bytesPerSample";
        }
        Logging.e(TAG, str);
        reset();
        return -2;
    }

    @NonNull
    @CalledByNative
    public SMPSIntervalData acquireIntervalData() {
        SMPSIntervalData sMPSIntervalData = new SMPSIntervalData();
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer == null) {
            Logging.d(TAG, "Failed to acquireIntervalData, invalidate frame buffer");
        } else {
            try {
                byteBuffer.clear();
                int capacity = this.mByteBuffer.capacity();
                if (this.mJitterByteBuffer.remaining() < capacity) {
                    this.mJitterByteBuffer.compact();
                    sMPSIntervalData.isEndOfStream = !acquireFrames(this.mJitterByteBuffer);
                    this.mJitterByteBuffer.flip();
                }
                if (this.mJitterByteBuffer.remaining() >= capacity) {
                    this.mByteBuffer.put(this.mJitterByteBuffer.array(), this.mJitterByteBuffer.arrayOffset() + this.mJitterByteBuffer.position(), capacity);
                    this.mByteBuffer.flip();
                    ByteBuffer byteBuffer2 = this.mJitterByteBuffer;
                    byteBuffer2.position(byteBuffer2.position() + capacity);
                    sMPSIntervalData.byteBuffer = this.mByteBuffer;
                }
                return sMPSIntervalData;
            } catch (Throwable th2) {
                Logging.e(TAG, "Failed to acquireIntervalData", th2);
            }
        }
        sMPSIntervalData.isError = true;
        return sMPSIntervalData;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:3:0x0001, B:6:0x001a, B:8:0x0024, B:12:0x002e, B:14:0x0036, B:15:0x003c), top: B:2:0x0001 }] */
    @CalledByNative
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean checkFormatInfoChanged() {
        boolean z10 = false;
        try {
            MediaFormat outputFormat = this.mAudioDecoder.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = 11000;
            }
            int integer2 = outputFormat.getInteger("channel-count");
            if (this.mAudioSampleRate == integer) {
                if (this.mAudioChannels != integer2) {
                }
                if (z10) {
                    this.mAudioSampleRate = integer;
                    this.mAudioChannels = integer2;
                    ByteBuffer byteBuffer = this.mByteBuffer;
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                        this.mByteBuffer = null;
                    }
                    this.mByteBuffer = ByteBuffer.allocateDirect((this.mAudioSampleRate / (1000 / this.mAudioFrameSendInterval)) * this.mBytesPerSample * this.mAudioChannels);
                }
                return z10;
            }
            z10 = true;
            if (z10) {
            }
            return z10;
        } catch (Exception e10) {
            Logging.e(TAG, "Error when checking file's new format");
            e10.printStackTrace();
            return z10;
        }
    }

    @CalledByNative
    public void dispose() {
        reset();
    }

    @CalledByNative
    public int getAudioChannels() {
        return this.mAudioChannels;
    }

    @CalledByNative
    public int getAudioSampleRate() {
        return this.mAudioSampleRate;
    }

    @CalledByNative
    public int getBytesPerSample() {
        return this.mBytesPerSample;
    }

    @CalledByNative
    public long getDuration() {
        return this.mDurationMs;
    }

    @CalledByNative
    public long getPlayPosition() {
        if (this.mExtractor != null) {
            return this.mPlayPositionInMicroseconds / 1000;
        }
        return -1L;
    }

    @CalledByNative
    public int getStreamCount() {
        return this.mMediaStreamInfoMap.size();
    }

    @CalledByNative
    public MediaStreamInfo getStreamInfo(int i10) {
        return this.mMediaStreamInfoMap.get(i10);
    }

    @CalledByNative
    public int open(String str, long j10) {
        String str2;
        Logging.d(TAG, "open() url, startPos: " + j10);
        List<String> list = HW_EXCEPTION_MODELS;
        String str3 = Build.MODEL;
        if (list.contains(str3)) {
            str2 = "Not support for " + str3;
        } else {
            if (!TextUtils.isEmpty(str)) {
                reset();
                if (URLUtil.isNetworkUrl(str) && ((str = NetUtil.getEncodedUrl(str)) == null || !NetUtil.testNetworkUrlAvailable(str))) {
                    Logging.w(TAG, "Fail to open, 404 for url");
                    return -2;
                }
                try {
                    return openImpl(str, j10);
                } catch (Throwable unused) {
                    Logging.w(TAG, "Failed to open");
                    reset();
                    return -2;
                }
            }
            str2 = "Fail to open, empty url";
        }
        Logging.w(TAG, str2);
        return -1;
    }

    @CalledByNative
    public int seek(long j10) {
        Logging.d(TAG, "seek() " + j10);
        long duration = getDuration();
        if (j10 >= duration) {
            j10 = duration;
        }
        long j11 = 1000 * j10;
        this.mPlayPositionInMicroseconds = j11;
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper == null) {
            return -1;
        }
        mediaExtractorWrapper.seekTo(j11, 1);
        if (this.mAudioDecoder != null && j10 == 0 && this.mIsExtractorEndOfStream) {
            this.mIsExtractorEndOfStream = false;
            this.mAudioDecoder.flush();
        }
        return 0;
    }

    @CalledByNative
    public int selectAudioTrack(int i10) {
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper == null) {
            Logging.e(TAG, "null extractor");
            return -1;
        }
        try {
            return selectAudioTrackWithPos(i10, mediaExtractorWrapper.getSampleTime() / 1000);
        } catch (Exception e10) {
            Logging.e(TAG, "selectAudioTrackWithPos failed:", e10);
            return -1;
        }
    }
}
