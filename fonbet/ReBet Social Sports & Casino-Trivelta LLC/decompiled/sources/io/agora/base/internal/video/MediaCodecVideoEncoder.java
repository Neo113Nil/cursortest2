package io.agora.base.internal.video;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.CalledByNativeUnchecked;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.EglBase14;
import io.agora.base.internal.video.VideoEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;

@TargetApi(19)
@Deprecated
/* loaded from: classes2.dex */
public class MediaCodecVideoEncoder {
    private static final int BITRATE_ADJUSTMENT_FPS = 30;
    private static final double BITRATE_CORRECTION_MAX_SCALE = 4.0d;
    private static final double BITRATE_CORRECTION_SEC = 3.0d;
    private static final int BITRATE_CORRECTION_STEPS = 20;
    private static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    private static final int DEQUEUE_TIMEOUT = 0;
    private static final String[] H264_HW_EXCEPTION_MODELS;
    private static final String H264_MIME_TYPE = "video/avc";
    private static final int MAXIMUM_INITIAL_FPS = 30;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final long QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "MediaCodecVideoEncoder";
    private static final int VIDEO_AVCLevel3 = 256;
    private static final int VIDEO_AVCProfileHigh = 8;
    private static final int VIDEO_ControlRateConstant = 2;
    private static final String VP8_MIME_TYPE = "video/x-vnd.on2.vp8";
    private static final String VP9_MIME_TYPE = "video/x-vnd.on2.vp9";
    private static int codecErrors;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HighProfileHwProperties;
    private static final MediaCodecProperties exynosH264HwProperties;
    private static final MediaCodecProperties exynosVp8HwProperties;
    private static final MediaCodecProperties exynosVp9HwProperties;
    private static final MediaCodecProperties[] h264HighProfileHwList;
    private static final MediaCodecProperties intelVp8HwProperties;
    private static final MediaCodecProperties mediatekH264HwProperties;
    private static final MediaCodecProperties qcomH264HwProperties;
    private static final MediaCodecProperties qcomVp8HwProperties;
    private static final MediaCodecProperties qcomVp9HwProperties;
    private static MediaCodecVideoEncoder runningInstance;
    private static EglBase staticEglBase;
    private static final int[] supportedColorList;
    private static final int[] supportedSurfaceColorList;
    private static final MediaCodecProperties[] vp9HwList;
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private double bitrateObservationTimeMs;
    private int colorFormat;
    private GlRectDrawer drawer;
    private EglBase14 eglBase;
    private long forcedKeyFrameMs;
    private int height;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    private MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int profile;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static String CodecOMXName = "";
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private ByteBuffer configData = null;

    /* renamed from: io.agora.base.internal.video.MediaCodecVideoEncoder$1CaughtException, reason: invalid class name */
    public class C1CaughtException {

        /* renamed from: e, reason: collision with root package name */
        Exception f49157e;

        public C1CaughtException() {
        }
    }

    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    public static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;

        public EncoderProperties(String str, int i10, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecName = str;
            this.colorFormat = i10;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public enum H264Profile {
        CONSTRAINED_BASELINE(0),
        BASELINE(1),
        MAIN(2),
        CONSTRAINED_HIGH(3),
        HIGH(4);

        private final int value;

        H264Profile(int i10) {
            this.value = i10;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static class HwEncoderFactory implements VideoEncoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoEncoder.isVp8HwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "VP8 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoEncoder.isVp9HwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "VP9 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "H.264 High Profile HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoEncoder.isH264HwSupported()) {
                Logging.d(MediaCodecVideoEncoder.TAG, "H.264 HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC);
            }
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
        }

        private static boolean isCodecSupported(VideoCodecInfo[] videoCodecInfoArr, VideoCodecInfo videoCodecInfo) {
            for (VideoCodecInfo videoCodecInfo2 : videoCodecInfoArr) {
                if (isSameCodec(videoCodecInfo2, videoCodecInfo)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSameCodec(VideoCodecInfo videoCodecInfo, VideoCodecInfo videoCodecInfo2) {
            if (!videoCodecInfo.name.equalsIgnoreCase(videoCodecInfo2.name)) {
                return false;
            }
            if (videoCodecInfo.name.equalsIgnoreCase("H264")) {
                return H264Utils.isSameH264Profile(videoCodecInfo.params, videoCodecInfo2.params);
            }
            return true;
        }

        @Override // io.agora.base.internal.video.VideoEncoderFactory
        public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z10, boolean z11) {
            return createEncoder(videoCodecInfo, z10);
        }

        @Override // io.agora.base.internal.video.VideoEncoderFactory
        public VideoCodecInfo[] getSupportedCodecs(boolean z10) {
            return this.supportedHardwareCodecs;
        }

        @Override // io.agora.base.internal.video.VideoEncoderFactory
        public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo, boolean z10) {
            if (isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                Logging.d(MediaCodecVideoEncoder.TAG, "Create HW video encoder for " + videoCodecInfo.name);
                return new WrappedNativeVideoEncoder() { // from class: io.agora.base.internal.video.MediaCodecVideoEncoder.HwEncoderFactory.1
                    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
                    public long createNativeVideoEncoder() {
                        return MediaCodecVideoEncoder.nativeCreateEncoder(videoCodecInfo, MediaCodecVideoEncoder.staticEglBase instanceof EglBase14);
                    }

                    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
                    public VideoEncoder.EncoderStyle getEncoderStyle() {
                        return null;
                    }

                    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
                    public long getResetCoolDownTimeMs() {
                        return 0L;
                    }

                    @Override // io.agora.base.internal.video.VideoEncoder
                    public VideoEncoder.VideoHWCodecSpec getVideoHWCodecSpec() {
                        return null;
                    }

                    @Override // io.agora.base.internal.video.WrappedNativeVideoEncoder, io.agora.base.internal.video.VideoEncoder
                    public boolean isHardwareEncoder() {
                        return true;
                    }
                };
            }
            Logging.d(MediaCodecVideoEncoder.TAG, "No HW video encoder for codec " + videoCodecInfo.name);
            return null;
        }
    }

    public static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        public MediaCodecProperties(String str, int i10, BitrateAdjustmentType bitrateAdjustmentType) {
            this.codecPrefix = str;
            this.minSdk = i10;
            this.bitrateAdjustmentType = bitrateAdjustmentType;
        }
    }

    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i10);
    }

    public static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        public OutputBufferInfo(int i10, ByteBuffer byteBuffer, boolean z10, long j10) {
            this.index = i10;
            this.buffer = byteBuffer;
            this.isKeyFrame = z10;
            this.presentationTimestampUs = j10;
        }

        @CalledByNative("OutputBufferInfo")
        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        @CalledByNative("OutputBufferInfo")
        public int getIndex() {
            return this.index;
        }

        @CalledByNative("OutputBufferInfo")
        public long getPresentationTimestampUs() {
            return this.presentationTimestampUs;
        }

        @CalledByNative("OutputBufferInfo")
        public boolean isKeyFrame() {
            return this.isKeyFrame;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_UNKNOWN,
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264;

        @CalledByNative("VideoCodecType")
        public static VideoCodecType fromNativeIndex(int i10) {
            return values()[i10];
        }
    }

    static {
        BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
        qcomVp8HwProperties = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        exynosVp8HwProperties = new MediaCodecProperties("OMX.Exynos.", 23, BitrateAdjustmentType.DYNAMIC_ADJUSTMENT);
        intelVp8HwProperties = new MediaCodecProperties("OMX.Intel.", 21, bitrateAdjustmentType);
        MediaCodecProperties mediaCodecProperties = new MediaCodecProperties("OMX.qcom.", 24, bitrateAdjustmentType);
        qcomVp9HwProperties = mediaCodecProperties;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.FRAMERATE_ADJUSTMENT;
        MediaCodecProperties mediaCodecProperties2 = new MediaCodecProperties("OMX.Exynos.", 24, bitrateAdjustmentType2);
        exynosVp9HwProperties = mediaCodecProperties2;
        vp9HwList = new MediaCodecProperties[]{mediaCodecProperties, mediaCodecProperties2};
        qcomH264HwProperties = new MediaCodecProperties("OMX.qcom.", 19, bitrateAdjustmentType);
        exynosH264HwProperties = new MediaCodecProperties("OMX.Exynos.", 21, bitrateAdjustmentType2);
        mediatekH264HwProperties = new MediaCodecProperties("OMX.MTK.", 27, bitrateAdjustmentType2);
        MediaCodecProperties mediaCodecProperties3 = new MediaCodecProperties("OMX.Exynos.", 23, bitrateAdjustmentType2);
        exynosH264HighProfileHwProperties = mediaCodecProperties3;
        h264HighProfileHwList = new MediaCodecProperties[]{mediaCodecProperties3};
        H264_HW_EXCEPTION_MODELS = new String[]{"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
        supportedColorList = new int[]{19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
        supportedSurfaceColorList = new int[]{2130708361};
    }

    @CalledByNative
    public MediaCodecVideoEncoder() {
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() == Thread.currentThread().getId()) {
            return;
        }
        throw new RuntimeException("MediaCodecVideoEncoder previously operated on " + this.mediaCodecThread + " but is now called on " + Thread.currentThread());
    }

    public static MediaCodec createByCodecName(String str) {
        try {
            CodecOMXName = str;
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void disableH264HwCodec() {
        Logging.w(TAG, "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(H264_MIME_TYPE);
    }

    public static void disableVp8HwCodec() {
        Logging.w(TAG, "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP8_MIME_TYPE);
    }

    public static void disableVp9HwCodec() {
        Logging.w(TAG, "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add(VP9_MIME_TYPE);
    }

    public static void disposeEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase != null) {
            eglBase.release();
            staticEglBase = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo mediaCodecInfo;
        EncoderProperties encoderProperties;
        String str2;
        boolean z10;
        EncoderProperties encoderProperties2 = null;
        if (str.equals(H264_MIME_TYPE)) {
            List asList = Arrays.asList(H264_HW_EXCEPTION_MODELS);
            String str3 = Build.MODEL;
            if (asList.contains(str3)) {
                Logging.w(TAG, "Model: " + str3 + " has black listed H.264 encoder.");
                return null;
            }
        }
        int i10 = 0;
        while (i10 < MediaCodecList.getCodecCount()) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i10);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "Cannot retrieve encoder codec info", e10);
                mediaCodecInfo = encoderProperties2;
            }
            if (mediaCodecInfo != 0 && mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        str2 = encoderProperties2;
                        break;
                    }
                    if (supportedTypes[i11].equals(str)) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    }
                    i11++;
                }
                if (str2 != 0) {
                    Logging.v(TAG, "Found candidate encoder " + str2);
                    BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
                    int length2 = mediaCodecPropertiesArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length2) {
                            z10 = false;
                            break;
                        }
                        MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr[i12];
                        if (str2.startsWith(mediaCodecProperties.codecPrefix)) {
                            int i13 = Build.VERSION.SDK_INT;
                            if (i13 < mediaCodecProperties.minSdk) {
                                Logging.w(TAG, "Codec " + str2 + " is disabled due to SDK version " + i13);
                            } else {
                                BitrateAdjustmentType bitrateAdjustmentType2 = mediaCodecProperties.bitrateAdjustmentType;
                                if (bitrateAdjustmentType2 != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                    Logging.w(TAG, "Codec " + str2 + " requires bitrate adjustment: " + bitrateAdjustmentType2);
                                    bitrateAdjustmentType = bitrateAdjustmentType2;
                                }
                                z10 = true;
                            }
                        }
                        i12++;
                    }
                    if (z10) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            for (int i14 : capabilitiesForType.colorFormats) {
                                Logging.v(TAG, "   Color: 0x" + Integer.toHexString(i14));
                            }
                            for (int i15 : iArr) {
                                int[] iArr2 = capabilitiesForType.colorFormats;
                                int length3 = iArr2.length;
                                int i16 = 0;
                                while (i16 < length3) {
                                    EncoderProperties encoderProperties3 = encoderProperties2;
                                    int i17 = iArr2[i16];
                                    if (i17 == i15) {
                                        Logging.d(TAG, "Found target encoder for mime " + str + " : " + str2 + ". Color: 0x" + Integer.toHexString(i17) + ". Bitrate adjustment: " + bitrateAdjustmentType);
                                        return new EncoderProperties(str2, i17, bitrateAdjustmentType);
                                    }
                                    i16++;
                                    encoderProperties2 = encoderProperties3;
                                }
                            }
                        } catch (IllegalArgumentException e11) {
                            encoderProperties = encoderProperties2;
                            Logging.e(TAG, "Cannot retrieve encoder capabilities", e11);
                        }
                    }
                }
            }
            encoderProperties = encoderProperties2;
            i10++;
            encoderProperties2 = encoderProperties;
        }
        return encoderProperties2;
    }

    private double getBitrateScale(int i10) {
        return Math.pow(BITRATE_CORRECTION_MAX_SCALE, i10 / 20.0d);
    }

    public static EglBase.Context getEglContext() {
        EglBase eglBase = staticEglBase;
        if (eglBase == null) {
            return null;
        }
        return eglBase.getEglBaseContext();
    }

    private static final MediaCodecProperties[] h264HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH264HwProperties);
        arrayList.add(exynosH264HwProperties);
        if (FieldTrialsFullNameFinder.findFieldTrialsFullName("WebRTC-MediaTekH264").equals("Enabled")) {
            arrayList.add(mediatekH264HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    public static boolean isH264HighProfileHwSupported() {
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HighProfileHwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupported() {
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(H264_MIME_TYPE) || findHwEncoder(H264_MIME_TYPE, h264HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    @CalledByNative
    public static boolean isTextureBuffer(VideoFrame.Buffer buffer) {
        return buffer instanceof VideoFrame.TextureBuffer;
    }

    public static boolean isVp8HwSupported() {
        return (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE) || findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedColorList) == null) ? false : true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE) || findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedSurfaceColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupported() {
        return (hwEncoderDisabledTypes.contains(VP9_MIME_TYPE) || findHwEncoder(VP9_MIME_TYPE, vp9HwList, supportedColorList) == null) ? false : true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        return (hwEncoderDisabledTypes.contains(VP9_MIME_TYPE) || findHwEncoder(VP9_MIME_TYPE, vp9HwList, supportedSurfaceColorList) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeCreateEncoder(VideoCodecInfo videoCodecInfo, boolean z10);

    private static native void nativeFillInputBuffer(long j10, int i10, ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13);

    public static void printStackTrace() {
        Thread thread;
        MediaCodecVideoEncoder mediaCodecVideoEncoder = runningInstance;
        if (mediaCodecVideoEncoder == null || (thread = mediaCodecVideoEncoder.mediaCodecThread) == null) {
            return;
        }
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace.length > 0) {
            Logging.d(TAG, "MediaCodecVideoEncoder stacks trace:");
            for (StackTraceElement stackTraceElement : stackTrace) {
                Logging.d(TAG, stackTraceElement.toString());
            }
        }
    }

    private void reportEncodedFrame(int i10) {
        int i11 = this.targetFps;
        if (i11 == 0 || this.bitrateAdjustmentType != BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            return;
        }
        double d10 = this.bitrateAccumulator + (i10 - (this.targetBitrateBps / (i11 * 8.0d)));
        this.bitrateAccumulator = d10;
        this.bitrateObservationTimeMs += 1000.0d / i11;
        double d11 = this.bitrateAccumulatorMax * BITRATE_CORRECTION_SEC;
        double min = Math.min(d10, d11);
        this.bitrateAccumulator = min;
        this.bitrateAccumulator = Math.max(min, -d11);
        if (this.bitrateObservationTimeMs > 3000.0d) {
            Logging.d(TAG, "Acc: " + ((int) this.bitrateAccumulator) + ". Max: " + ((int) this.bitrateAccumulatorMax) + ". ExpScale: " + this.bitrateAdjustmentScaleExp);
            double d12 = this.bitrateAccumulator;
            double d13 = this.bitrateAccumulatorMax;
            if (d12 <= d13) {
                if (d12 < (-d13)) {
                    this.bitrateAdjustmentScaleExp += (int) (((-d12) / d13) + 0.5d);
                    this.bitrateAccumulator = -d13;
                }
                this.bitrateObservationTimeMs = 0.0d;
            }
            this.bitrateAdjustmentScaleExp -= (int) ((d12 / d13) + 0.5d);
            this.bitrateAccumulator = d13;
            int min2 = Math.min(this.bitrateAdjustmentScaleExp, 20);
            this.bitrateAdjustmentScaleExp = min2;
            this.bitrateAdjustmentScaleExp = Math.max(min2, -20);
            Logging.d(TAG, "Adjusting bitrate scale to " + this.bitrateAdjustmentScaleExp + ". Value: " + getBitrateScale(this.bitrateAdjustmentScaleExp));
            setRates(this.targetBitrateBps / 1000, this.targetFps);
            this.bitrateObservationTimeMs = 0.0d;
        }
    }

    public static void setEglContext(EglBase.Context context) {
        if (staticEglBase != null) {
            Logging.w(TAG, "Egl context already set.");
            staticEglBase.release();
        }
        staticEglBase = EglBaseFactory.create(context);
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        Logging.d(TAG, "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    @CalledByNativeUnchecked
    private boolean setRates(int i10, int i11) {
        checkOnMediaCodecThread();
        int i12 = i10 * 1000;
        BitrateAdjustmentType bitrateAdjustmentType = this.bitrateAdjustmentType;
        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.DYNAMIC_ADJUSTMENT;
        if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            double d10 = i12;
            this.bitrateAccumulatorMax = d10 / 8.0d;
            int i13 = this.targetBitrateBps;
            if (i13 > 0 && i12 < i13) {
                this.bitrateAccumulator = (this.bitrateAccumulator * d10) / i13;
            }
        }
        this.targetBitrateBps = i12;
        this.targetFps = i11;
        if (bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && i11 > 0) {
            i12 = (i10 * 30000) / i11;
            Logging.v(TAG, "setRates: " + i10 + " -> " + (i12 / 1000) + " kbps. Fps: " + this.targetFps);
        } else if (bitrateAdjustmentType == bitrateAdjustmentType2) {
            Logging.v(TAG, "setRates: " + i10 + " kbps. Fps: " + this.targetFps + ". ExpScale: " + this.bitrateAdjustmentScaleExp);
            int i14 = this.bitrateAdjustmentScaleExp;
            if (i14 != 0) {
                i12 = (int) (i12 * getBitrateScale(i14));
            }
        } else {
            Logging.v(TAG, "setRates: " + i10 + " kbps. Fps: " + this.targetFps);
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i12);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "setRates failed", e10);
            return false;
        }
    }

    public static EncoderProperties vp8HwEncoderProperties() {
        if (hwEncoderDisabledTypes.contains(VP8_MIME_TYPE)) {
            return null;
        }
        return findHwEncoder(VP8_MIME_TYPE, vp8HwList(), supportedColorList);
    }

    private static MediaCodecProperties[] vp8HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomVp8HwProperties);
        arrayList.add(exynosVp8HwProperties);
        if (FieldTrialsFullNameFinder.findFieldTrialsFullName("WebRTC-IntelVP8").equals("Enabled")) {
            arrayList.add(intelVp8HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkKeyFrameRequired(boolean z10, long j10) {
        boolean z11;
        long j11 = (j10 + 500) / 1000;
        if (this.lastKeyFrameMs < 0) {
            this.lastKeyFrameMs = j11;
        }
        if (!z10) {
            long j12 = this.forcedKeyFrameMs;
            if (j12 > 0 && j11 > this.lastKeyFrameMs + j12) {
                z11 = true;
                if (!z10 || z11) {
                    if (z10) {
                        Logging.d(TAG, "Sync frame forced");
                    } else {
                        Logging.d(TAG, "Sync frame request");
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("request-sync", 0);
                    this.mediaCodec.setParameters(bundle);
                    this.lastKeyFrameMs = j11;
                }
                return;
            }
        }
        z11 = false;
        if (z10) {
        }
        if (z10) {
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("request-sync", 0);
        this.mediaCodec.setParameters(bundle2);
        this.lastKeyFrameMs = j11;
    }

    @CalledByNativeUnchecked
    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0L);
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "dequeueIntputBuffer failed", e10);
            return -2;
        }
    }

    @CalledByNativeUnchecked
    public OutputBufferInfo dequeueOutputBuffer() {
        checkOnMediaCodecThread();
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer >= 0 && (bufferInfo.flags & 2) != 0) {
                Logging.d(TAG, "Config frame generated. Offset: " + bufferInfo.offset + ". Size: " + bufferInfo.size);
                this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                this.outputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
                this.outputBuffers[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                this.configData.put(this.outputBuffers[dequeueOutputBuffer]);
                String str = "";
                int i10 = 0;
                while (true) {
                    int i11 = bufferInfo.size;
                    if (i11 >= 8) {
                        i11 = 8;
                    }
                    if (i10 >= i11) {
                        break;
                    }
                    str = str + Integer.toHexString(this.configData.get(i10) & UByte.MAX_VALUE) + " ";
                    i10++;
                }
                Logging.d(TAG, str);
                this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            }
            int i12 = dequeueOutputBuffer;
            if (i12 < 0) {
                if (i12 == -3) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    return dequeueOutputBuffer();
                }
                if (i12 == -2) {
                    return dequeueOutputBuffer();
                }
                if (i12 == -1) {
                    return null;
                }
                throw new RuntimeException("dequeueOutputBuffer: " + i12);
            }
            ByteBuffer duplicate = this.outputBuffers[i12].duplicate();
            duplicate.position(bufferInfo.offset);
            duplicate.limit(bufferInfo.offset + bufferInfo.size);
            reportEncodedFrame(bufferInfo.size);
            boolean z10 = true;
            if ((bufferInfo.flags & 1) == 0) {
                z10 = false;
            }
            if (z10) {
                Logging.d(TAG, "Sync frame generated");
            }
            if (!z10 || this.type != VideoCodecType.VIDEO_CODEC_H264) {
                return new OutputBufferInfo(i12, duplicate.slice(), z10, bufferInfo.presentationTimeUs);
            }
            Logging.d(TAG, "Appending config frame of size " + this.configData.capacity() + " to output buffer with offset " + bufferInfo.offset + ", size " + bufferInfo.size);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
            this.configData.rewind();
            allocateDirect.put(this.configData);
            allocateDirect.put(duplicate);
            allocateDirect.position(0);
            return new OutputBufferInfo(i12, allocateDirect, z10, bufferInfo.presentationTimeUs);
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "dequeueOutputBuffer failed", e10);
            return new OutputBufferInfo(-1, null, false, -1L);
        }
    }

    @CalledByNativeUnchecked
    public boolean encodeBuffer(boolean z10, int i10, int i11, long j10) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z10, j10);
            this.mediaCodec.queueInputBuffer(i10, 0, i11, j10, 0);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "encodeBuffer failed", e10);
            return false;
        }
    }

    @CalledByNativeUnchecked
    public boolean encodeFrame(long j10, boolean z10, VideoFrame videoFrame, int i10, long j11) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z10, j11);
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (buffer instanceof VideoFrame.TextureBuffer) {
                this.eglBase.makeCurrent();
                GLES20.glClear(16384);
                GlRectDrawer glRectDrawer = this.drawer;
                Matrix matrix = new Matrix();
                int i11 = this.width;
                int i12 = this.height;
                VideoFrameDrawer.drawTexture(glRectDrawer, (VideoFrame.TextureBuffer) buffer, 0, matrix, i11, i12, 0, 0, i11, i12, 0);
                this.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j11));
            } else {
                VideoFrame.I420Buffer i420 = buffer.toI420();
                int i13 = (this.height + 1) / 2;
                ByteBuffer dataY = i420.getDataY();
                ByteBuffer dataU = i420.getDataU();
                ByteBuffer dataV = i420.getDataV();
                int strideY = i420.getStrideY();
                int strideU = i420.getStrideU();
                int strideV = i420.getStrideV();
                if (dataY.capacity() < this.height * strideY) {
                    throw new RuntimeException("Y-plane buffer size too small.");
                }
                if (dataU.capacity() < strideU * i13) {
                    throw new RuntimeException("U-plane buffer size too small.");
                }
                if (dataV.capacity() < i13 * strideV) {
                    throw new RuntimeException("V-plane buffer size too small.");
                }
                nativeFillInputBuffer(j10, i10, dataY, strideY, dataU, strideU, dataV, strideV);
                i420.release();
                this.mediaCodec.queueInputBuffer(i10, 0, ((this.width * this.height) * 3) / 2, j11, 0);
            }
            return true;
        } catch (RuntimeException e10) {
            Logging.e(TAG, "encodeFrame failed", e10);
            return false;
        }
    }

    @CalledByNative
    public int getColorFormat() {
        return this.colorFormat;
    }

    @CalledByNativeUnchecked
    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        Logging.d(TAG, "Input buffers: " + inputBuffers.length);
        return inputBuffers;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x020b  */
    @CalledByNativeUnchecked
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean initEncode(VideoCodecType videoCodecType, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        String str;
        boolean z11;
        int i15;
        boolean z12;
        EncoderProperties encoderProperties;
        Logging.d(TAG, "Java initEncode: " + videoCodecType + ". Profile: " + i10 + " : " + i11 + " x " + i12 + ". @ " + i13 + " kbps. Fps: " + i14 + ". Encode from texture : " + z10);
        this.profile = i10;
        this.width = i11;
        this.height = i12;
        if (this.mediaCodecThread != null) {
            throw new RuntimeException("Forgot to release()?");
        }
        VideoCodecType videoCodecType2 = VideoCodecType.VIDEO_CODEC_VP8;
        if (videoCodecType == videoCodecType2) {
            MediaCodecProperties[] vp8HwList = vp8HwList();
            int[] iArr = z10 ? supportedSurfaceColorList : supportedColorList;
            str = VP8_MIME_TYPE;
            encoderProperties = findHwEncoder(VP8_MIME_TYPE, vp8HwList, iArr);
        } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
            MediaCodecProperties[] mediaCodecPropertiesArr = vp9HwList;
            int[] iArr2 = z10 ? supportedSurfaceColorList : supportedColorList;
            str = VP9_MIME_TYPE;
            encoderProperties = findHwEncoder(VP9_MIME_TYPE, mediaCodecPropertiesArr, iArr2);
        } else {
            if (videoCodecType != VideoCodecType.VIDEO_CODEC_H264) {
                throw new RuntimeException("initEncode: Non-supported codec " + videoCodecType);
            }
            MediaCodecProperties[] h264HwList = h264HwList();
            int[] iArr3 = z10 ? supportedSurfaceColorList : supportedColorList;
            str = H264_MIME_TYPE;
            EncoderProperties findHwEncoder = findHwEncoder(H264_MIME_TYPE, h264HwList, iArr3);
            if (i10 == H264Profile.CONSTRAINED_HIGH.getValue()) {
                if (findHwEncoder(H264_MIME_TYPE, h264HighProfileHwList, z10 ? supportedSurfaceColorList : supportedColorList) != null) {
                    Logging.d(TAG, "High profile H.264 encoder supported.");
                    z11 = true;
                    i15 = 20;
                    z12 = z11;
                    encoderProperties = findHwEncoder;
                    if (encoderProperties == null) {
                        throw new RuntimeException("Can not find HW encoder for " + videoCodecType);
                    }
                    runningInstance = this;
                    this.colorFormat = encoderProperties.colorFormat;
                    BitrateAdjustmentType bitrateAdjustmentType = encoderProperties.bitrateAdjustmentType;
                    this.bitrateAdjustmentType = bitrateAdjustmentType;
                    int min = bitrateAdjustmentType != BitrateAdjustmentType.FRAMERATE_ADJUSTMENT ? Math.min(i14, 30) : 30;
                    this.forcedKeyFrameMs = 0L;
                    this.lastKeyFrameMs = -1L;
                    if (videoCodecType == videoCodecType2 && encoderProperties.codecName.startsWith(qcomVp8HwProperties.codecPrefix)) {
                        this.forcedKeyFrameMs = 15000L;
                    }
                    Logging.d(TAG, "Color format: " + this.colorFormat + ". Bitrate adjustment: " + this.bitrateAdjustmentType + ". Key frame interval: " + this.forcedKeyFrameMs + " . Initial fps: " + min);
                    int i16 = i13 * 1000;
                    this.targetBitrateBps = i16;
                    this.targetFps = min;
                    this.bitrateAccumulatorMax = ((double) i16) / 8.0d;
                    this.bitrateAccumulator = 0.0d;
                    this.bitrateObservationTimeMs = 0.0d;
                    this.bitrateAdjustmentScaleExp = 0;
                    this.mediaCodecThread = Thread.currentThread();
                    try {
                        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i11, i12);
                        createVideoFormat.setInteger("bitrate", this.targetBitrateBps);
                        createVideoFormat.setInteger("bitrate-mode", 2);
                        createVideoFormat.setInteger("color-format", encoderProperties.colorFormat);
                        createVideoFormat.setInteger("frame-rate", this.targetFps);
                        createVideoFormat.setInteger("i-frame-interval", i15);
                        if (z12) {
                            createVideoFormat.setInteger("profile", 8);
                            createVideoFormat.setInteger("level", 256);
                        }
                        Logging.d(TAG, "  Format: " + createVideoFormat);
                        MediaCodec createByCodecName = createByCodecName(encoderProperties.codecName);
                        this.mediaCodec = createByCodecName;
                        this.type = videoCodecType;
                        if (createByCodecName == null) {
                            Logging.e(TAG, "Can not create media encoder");
                            release();
                            return false;
                        }
                        createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                        if (z10) {
                            this.eglBase = new EglBase14((EglBase14.Context) getEglContext(), EglBase.CONFIG_RECORDABLE);
                            Surface createInputSurface = this.mediaCodec.createInputSurface();
                            this.inputSurface = createInputSurface;
                            this.eglBase.createSurface(createInputSurface);
                            this.drawer = new GlRectDrawer();
                        }
                        this.mediaCodec.start();
                        this.outputBuffers = this.mediaCodec.getOutputBuffers();
                        Logging.d(TAG, "Output buffers: " + this.outputBuffers.length);
                        return true;
                    } catch (IllegalStateException e10) {
                        Logging.e(TAG, "initEncode failed", e10);
                        release();
                        return false;
                    }
                }
                Logging.d(TAG, "High profile H.264 encoder requested, but not supported. Use baseline.");
            }
            z11 = false;
            i15 = 20;
            z12 = z11;
            encoderProperties = findHwEncoder;
            if (encoderProperties == null) {
            }
        }
        i15 = 100;
        z12 = false;
        if (encoderProperties == null) {
        }
    }

    @CalledByNative
    public boolean isQcomHardware() {
        if (CodecOMXName.startsWith("OMX.qcom") || CodecOMXName.startsWith("c2.qti.")) {
            Logging.w(TAG, "qcom HW encoder true");
            return true;
        }
        Logging.w(TAG, "qcom HW encoder false");
        return false;
    }

    @CalledByNativeUnchecked
    public void release() {
        Logging.d(TAG, "Java releaseEncoder");
        checkOnMediaCodecThread();
        final C1CaughtException c1CaughtException = new C1CaughtException();
        boolean z10 = false;
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() { // from class: io.agora.base.internal.video.MediaCodecVideoEncoder.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread");
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                    } catch (Exception e10) {
                        Logging.e(MediaCodecVideoEncoder.TAG, "Media encoder stop failed", e10);
                    }
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                    } catch (Exception e11) {
                        Logging.e(MediaCodecVideoEncoder.TAG, "Media encoder release failed", e11);
                        c1CaughtException.f49157e = e11;
                    }
                    Logging.d(MediaCodecVideoEncoder.TAG, "Java releaseEncoder on release thread done");
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000L)) {
                Logging.e(TAG, "Media encoder release timeout");
                z10 = true;
            }
            this.mediaCodec = null;
        }
        this.mediaCodecThread = null;
        GlRectDrawer glRectDrawer = this.drawer;
        if (glRectDrawer != null) {
            glRectDrawer.release();
            this.drawer = null;
        }
        EglBase14 eglBase14 = this.eglBase;
        if (eglBase14 != null) {
            eglBase14.release();
            this.eglBase = null;
        }
        Surface surface = this.inputSurface;
        if (surface != null) {
            surface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        if (!z10) {
            if (c1CaughtException.f49157e == null) {
                Logging.d(TAG, "Java releaseEncoder done");
                return;
            } else {
                RuntimeException runtimeException = new RuntimeException(c1CaughtException.f49157e);
                runtimeException.setStackTrace(ThreadUtils.concatStackTraces(c1CaughtException.f49157e.getStackTrace(), runtimeException.getStackTrace()));
                throw runtimeException;
            }
        }
        codecErrors++;
        if (errorCallback != null) {
            Logging.e(TAG, "Invoke codec error callback. Errors: " + codecErrors);
            errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
        }
        throw new RuntimeException("Media encoder release timeout.");
    }

    @CalledByNativeUnchecked
    public boolean releaseOutputBuffer(int i10) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i10, false);
            return true;
        } catch (IllegalStateException e10) {
            Logging.e(TAG, "releaseOutputBuffer failed", e10);
            return false;
        }
    }
}
