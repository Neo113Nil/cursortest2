package io.agora.base.internal.video;

import io.agora.base.ColorSpace;
import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.video.EncodedImage;

/* loaded from: classes2.dex */
public interface VideoEncoder {

    public @interface BitrateAdjustment {
        public static final int ACTUAL_FRAMERATE_ADJUSTMENT = 2;
        public static final int CONSTANT_UNIT_BITRATE_ADJUSTMENT = 4;
        public static final int DYNAMIC_ADJUSTMENT = 3;
        public static final int FRAMERATE_ADJUSTMENT = 1;
        public static final int NO_ADJUSTMENT = 0;
    }

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i10 = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i11 : iArr) {
                    i10 += i11;
                }
            }
            return i10;
        }
    }

    public interface Callback {
        void onEncodeBufferPrepared(long j10);

        void onEncodeReset();

        void onEncodedFrame(EncodedImage encodedImage, int i10, int i11, int i12, int i13, int i14, CodecSpecificInfo codecSpecificInfo);
    }

    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        @CalledByNative("EncodeInfo")
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public static class EncoderStyle {
        boolean highProfileSupported;
        int bitrateAdjustment = 0;
        boolean isNeedResetWhenDownBps = false;
        int bitrateAdjustNumerator = 1;
        int bitrateAdjustDenominator = 1;

        @CalledByNative("EncoderStyle")
        public int getBitrateAdjustDenominator() {
            return this.bitrateAdjustDenominator;
        }

        @CalledByNative("EncoderStyle")
        public int getBitrateAdjustNumerator() {
            return this.bitrateAdjustNumerator;
        }

        @CalledByNative("EncoderStyle")
        public int getBitrateAdjustment() {
            return this.bitrateAdjustment;
        }

        @CalledByNative("EncoderStyle")
        public boolean isNeedResetWhenDownBps() {
            return this.isNeedResetWhenDownBps;
        }

        public String toString() {
            return "EncoderStyle{bitrateAdjustment=" + this.bitrateAdjustment + ", isNeedResetWhenDownBps=" + this.isNeedResetWhenDownBps + ", highProfileSupported=" + this.highProfileSupported + '}';
        }
    }

    public static class VideoHWCodecSpec {
        public final int bitrateMode;
        public final String codecName;
        public final int inputType;
        public final String maxResolution;
        public final int minSupportedBitrate;
        public final int platformid = 4;
        public final int profile;
        public final String supportCodecNames;

        public VideoHWCodecSpec(String str, String str2, int i10, int i11, int i12, int i13, String str3) {
            this.codecName = str;
            this.maxResolution = str2;
            this.bitrateMode = i10;
            this.inputType = i11;
            this.profile = i12;
            this.minSupportedBitrate = i13;
            this.supportCodecNames = str3;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getBitrateMode() {
            return this.bitrateMode;
        }

        @CalledByNative("VideoHWCodecSpec")
        public String getCodecName() {
            return this.codecName;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getInputType() {
            return this.inputType;
        }

        @CalledByNative("VideoHWCodecSpec")
        public String getMaxResolution() {
            return this.maxResolution;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getMinSupportedBitrate() {
            return this.minSupportedBitrate;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getPlatformid() {
            return this.platformid;
        }

        @CalledByNative("VideoHWCodecSpec")
        public int getProfile() {
            return this.profile;
        }

        @CalledByNative("VideoHWCodecSpec")
        public String getSupportCodecNames() {
            return this.supportCodecNames;
        }
    }

    @CalledByNative
    VideoCodecStatus attachProxyThread();

    @CalledByNative
    long createNativeVideoEncoder();

    @CalledByNative
    VideoCodecStatus detachProxyThread();

    @CalledByNative
    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo, CodecSpecificInfo codecSpecificInfo);

    @CalledByNative
    VideoCodecStatus flush();

    @CalledByNative
    EncoderStyle getEncoderStyle();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    long getResetCoolDownTimeMs();

    @CalledByNative
    ScalingSettings getScalingSettings();

    @CalledByNative
    VideoHWCodecSpec getVideoHWCodecSpec();

    @CalledByNative
    VideoCodecStatus initEncode(Settings settings, Callback callback);

    @CalledByNative
    boolean isHardwareEncoder();

    @CalledByNative
    boolean isQcomHardware();

    @CalledByNative
    VideoCodecStatus release();

    @CalledByNative
    VideoCodecStatus resume();

    @CalledByNative
    VideoCodecStatus setChannelParameters(short s10, long j10);

    @CalledByNative
    VideoCodecStatus setRates(int i10, int i11);

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public ScalingSettings(int i10, int i11) {
            this.on = true;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }

        public String toString() {
            if (!this.on) {
                return "OFF";
            }
            return "[ " + this.low + ", " + this.high + " ]";
        }

        private ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z10) {
            this.on = z10;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z10, int i10, int i11) {
            this.on = z10;
            this.low = Integer.valueOf(i10);
            this.high = Integer.valueOf(i11);
        }
    }

    public static class Settings {
        public final boolean automaticResizeOn;
        public final ColorSpace colorSpace;
        public final String cpuName;
        public final boolean expectTexture;
        public final int height;
        public final int keyFrameInterval;
        public final int lumaBitDepth;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int rateControlMode;
        public final int startBitrate;
        public final int width;

        @CalledByNative("Settings")
        public Settings(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, int i16, int i17, boolean z11, int i18, String str, ColorSpace colorSpace) {
            this.numberOfCores = i10;
            this.width = i11;
            this.height = i12;
            this.startBitrate = i13;
            this.maxFramerate = i14;
            this.numberOfSimulcastStreams = i15;
            this.automaticResizeOn = z10;
            this.keyFrameInterval = i16;
            this.rateControlMode = i17;
            this.expectTexture = z11;
            this.lumaBitDepth = i18;
            this.cpuName = str;
            this.colorSpace = colorSpace;
        }

        public Settings(int i10, int i11, int i12, int i13, int i14, boolean z10) {
            this(i10, i11, i12, i13, i14, 1, z10, 0, -1, true, 8, "", null);
        }
    }
}
