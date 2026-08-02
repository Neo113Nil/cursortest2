package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public interface VideoDecoder {

    public interface Callback {
        void onDecodeBufferPrepared(long j10);

        void onDecodeReset();

        void onDecodedFrame(VideoFrame videoFrame, Integer num, Integer num2, int i10, int i11, int i12, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);
    }

    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean z10, long j10) {
            this.isMissingFrames = z10;
            this.renderTimeMs = j10;
        }
    }

    public static class Settings {
        public int codecProfile;
        public final boolean enableResetCropping;
        public FrameCropWindow frameCropWindow;
        public int height;
        public int lumaBitDepth;
        public int numberOfCores;
        public int width;

        @CalledByNative("Settings")
        public Settings(int i10, int i11, int i12, int i13, int i14, FrameCropWindow frameCropWindow, boolean z10) {
            this.numberOfCores = i10;
            this.width = i11;
            this.height = i12;
            this.lumaBitDepth = i13;
            this.codecProfile = i14;
            this.frameCropWindow = frameCropWindow;
            this.enableResetCropping = z10;
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
    long createNativeVideoDecoder();

    @CalledByNative
    VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo, CodecSpecificInfo codecSpecificInfo, FrameExtraInfo frameExtraInfo);

    @CalledByNative
    VideoCodecStatus detachProxyThread();

    @CalledByNative
    String getImplementationName();

    @CalledByNative
    VideoHWCodecSpec getVideoHWCodecSpec();

    @CalledByNative
    VideoCodecStatus initDecode(Settings settings, Callback callback);

    @CalledByNative
    boolean isHardwareDecoder();

    @CalledByNative
    VideoCodecStatus release();
}
