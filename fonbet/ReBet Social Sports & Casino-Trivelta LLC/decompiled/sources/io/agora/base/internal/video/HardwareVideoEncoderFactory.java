package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import io.agora.base.internal.Logging;
import io.agora.base.internal.video.EglBase;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class HardwareVideoEncoderFactory implements VideoEncoderFactory {
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final String TAG = "HardwareVideoEncoderFactory";
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;
    private final EglBase.Context sharedContext;

    /* renamed from: io.agora.base.internal.video.HardwareVideoEncoderFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$internal$video$VideoCodecType;

        static {
            int[] iArr = new int[VideoCodecType.values().length];
            $SwitchMap$io$agora$base$internal$video$VideoCodecType = iArr;
            try {
                iArr[VideoCodecType.VP8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.VP9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.H264.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.H265.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.AV1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public HardwareVideoEncoderFactory(EglBase.Context context, boolean z10, boolean z11) {
        this.sharedContext = context;
        this.enableIntelVp8Encoder = z10;
        this.enableH264HighProfile = z11;
    }

    private BitrateAdjuster createBitrateAdjuster(VideoCodecType videoCodecType, String str) {
        return str.startsWith("OMX.Exynos.") ? videoCodecType == VideoCodecType.VP8 ? new DynamicBitrateAdjuster() : (videoCodecType == VideoCodecType.H264 || videoCodecType == VideoCodecType.H265) ? new FactorBitrateAdjuster(FactorBitrateAdjuster.FACTOR_LEVEL1) : new FramerateBitrateAdjuster() : ((videoCodecType == VideoCodecType.H264 || videoCodecType == VideoCodecType.H265) && (str.startsWith("OMX.qcom.") || str.startsWith("OMX.MTK.") || str.startsWith("OMX.hisi."))) ? new FactorBitrateAdjuster(FactorBitrateAdjuster.FACTOR_LEVEL1) : new BaseBitrateAdjuster();
    }

    private int getForcedKeyFrameIntervalMs(VideoCodecType videoCodecType, String str) {
        return (videoCodecType == VideoCodecType.VP8 && str.startsWith("OMX.qcom.")) ? 15000 : 0;
    }

    private int getKeyFrameIntervalSec(VideoCodecType videoCodecType) {
        switch (AnonymousClass1.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()]) {
            case 1:
            case 2:
                return 100;
            case 6:
                Logging.e(TAG, "UNKNOWN is not excepted but h264");
            case 3:
            case 4:
            case 5:
                return 20;
            default:
                throw new IllegalArgumentException("Unsupported VideoCodecType " + videoCodecType);
        }
    }

    private boolean isH264HighProfileSupported(MediaCodecInfo mediaCodecInfo) {
        boolean z10;
        boolean z11;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (mediaCodecInfo.getName().startsWith("OMX.qcom.") || mediaCodecInfo.getName().startsWith("OMX.hisi.") || mediaCodecInfo.getName().startsWith("OMX.Exynos.") || mediaCodecInfo.getName().startsWith("OMX.MTK.")) {
            z10 = true;
            z11 = false;
        } else {
            z11 = true;
            z10 = false;
        }
        if (this.enableH264HighProfile && (z10 || z11)) {
            try {
                codecCapabilities = mediaCodecInfo.getCapabilitiesForType(VideoCodecType.H264.mimeType());
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "getCapabilitiesForType:", e10);
                codecCapabilities = null;
            }
            if (codecCapabilities == null) {
                return false;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                if (codecProfileLevel.profile == 8) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean parseGoogleEnc(Map<String, String> map) {
        try {
            String str = map.get(VideoCodecInfo.KEY_AV_DEC_VIDEO_AV1_GOOGLE_ENC_ENABLE);
            if (str != null && !TextUtils.isEmpty(str)) {
                boolean parseBoolean = Boolean.parseBoolean(str);
                Logging.d(TAG, "get google enc enable: " + parseBoolean);
                return parseBoolean;
            }
            return false;
        } catch (Exception unused) {
            Logging.d(TAG, "fail to convert google enc enable");
            return false;
        }
    }

    private String parseSkipCodecByName(Map<String, String> map) {
        try {
            String str = map.get(VideoCodecInfo.KEY_AV_ENC_VIDEO_SKIP_HWENC_BY_NAME);
            if (str != null && !TextUtils.isEmpty(str)) {
                Logging.i(TAG, "get skip hw enc name: " + str);
                return str;
            }
            return "av1";
        } catch (Exception unused) {
            Logging.w(TAG, "fail to convert skip codec name");
            return null;
        }
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z10, boolean z11) {
        return createEncoder(videoCodecInfo, z10);
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoCodecInfo[] getSupportedCodecs(boolean z10) {
        ArrayList arrayList = new ArrayList();
        VideoCodecType[] videoCodecTypeArr = {VideoCodecType.H264, VideoCodecType.H265, VideoCodecType.AV1};
        for (int i10 = 0; i10 < 3; i10++) {
            VideoCodecType videoCodecType = videoCodecTypeArr[i10];
            MediaCodecInfo findCodecForType = VideoEncoderUtils.findCodecForType(videoCodecType, z10);
            if (findCodecForType != null) {
                String name = videoCodecType.name();
                if (videoCodecType == VideoCodecType.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, true)));
                }
                arrayList.add(new VideoCodecInfo(name, MediaCodecUtils.getCodecProperties(videoCodecType, false)));
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }

    @Override // io.agora.base.internal.video.VideoEncoderFactory
    public VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo, boolean z10) {
        VideoCodecType valueOf;
        MediaCodecInfo findCodecForType;
        if (!VideoCodecType.contains(videoCodecInfo.name) || (findCodecForType = VideoEncoderUtils.findCodecForType((valueOf = VideoCodecType.valueOf(videoCodecInfo.name)), z10, parseGoogleEnc(videoCodecInfo.params), parseSkipCodecByName(videoCodecInfo.params))) == null) {
            return null;
        }
        String name = findCodecForType.getName();
        if (valueOf == VideoCodecType.H264) {
            H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(valueOf, true));
            H264Utils.isSameH264Profile(videoCodecInfo.params, MediaCodecUtils.getCodecProperties(valueOf, false));
            videoCodecInfo.params.put(VideoCodecInfo.H264_IS_HIGH_PROFILE_SUPPORTED, String.valueOf(isH264HighProfileSupported(findCodecForType)));
        }
        return new HardwareVideoEncoder(new MediaCodecWrapperFactoryImpl(), name, valueOf, findCodecForType, videoCodecInfo.params, getKeyFrameIntervalSec(valueOf), getForcedKeyFrameIntervalMs(valueOf, name), createBitrateAdjuster(valueOf, name), this.sharedContext);
    }

    @Deprecated
    public HardwareVideoEncoderFactory(boolean z10, boolean z11) {
        this(null, z10, z11);
    }
}
