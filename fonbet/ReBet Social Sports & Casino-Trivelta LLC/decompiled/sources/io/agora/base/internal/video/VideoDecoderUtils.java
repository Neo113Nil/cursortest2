package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.Logging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class VideoDecoderUtils {
    private static final String TAG = "HardwareVideoDecoderUtils";
    private static final List<String> H264_HWDEC_EXCEPTION_MODELS = Arrays.asList("ASUS_T00J");
    static Map<VideoCodecType, MediaCodecInfo> mediaCodecInfoMaps = new ConcurrentHashMap();

    /* renamed from: io.agora.base.internal.video.VideoDecoderUtils$1, reason: invalid class name */
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
        }
    }

    public static class SupportCodecInfo {
        private String codecNames;
        private int supportCodecs;

        public SupportCodecInfo(int i10, String str) {
            this.supportCodecs = i10;
            this.codecNames = str;
        }

        public String getCodecNames() {
            return this.codecNames;
        }

        public int getSupportCodecs() {
            return this.supportCodecs;
        }
    }

    @CalledByNative
    public static boolean IsSupportDecodeHEVC10Bit() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        VideoCodecType videoCodecType = VideoCodecType.H265;
        MediaCodecInfo findCodecForType = findCodecForType(videoCodecType);
        if (findCodecForType == null) {
            return false;
        }
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = findCodecForType.getCapabilitiesForType(videoCodecType.mimeType());
            if (capabilitiesForType != null && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    int i10 = codecProfileLevel.profile;
                    if (i10 == 2 || i10 == 4096 || i10 == 8192) {
                        return true;
                    }
                }
                return true;
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        return findCodecForType(videoCodecType, true, true, null);
    }

    @CalledByNative
    public static int getMaxSupportedInstances(String str) {
        MediaCodecInfo findCodecForType;
        if (VideoCodecType.contains(str) && (findCodecForType = findCodecForType(VideoCodecType.valueOf(str))) != null) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = findCodecForType.getCapabilitiesForType(VideoCodecType.valueOf(str).mimeType());
                if (capabilitiesForType == null) {
                    return -1;
                }
                return capabilitiesForType.getMaxSupportedInstances();
            } catch (IllegalArgumentException e10) {
                e10.printStackTrace();
            }
        }
        return -1;
    }

    public static SupportCodecInfo getSupportedDecoders() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (int i11 = 0; i11 < MediaCodecList.getCodecCount(); i11++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i11);
            boolean isSoftwareOnly = (codecInfoAt == null || Build.VERSION.SDK_INT < 29) ? false : codecInfoAt.isSoftwareOnly();
            if (!codecInfoAt.isEncoder() && !isSoftwareOnly) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    String lowerCase = codecInfoAt.getName().toLowerCase();
                    if (str.equals(VideoCodecType.VP8.mimeType())) {
                        i10 |= 1;
                        if (!arrayList.contains(lowerCase)) {
                            arrayList.add(lowerCase);
                        }
                    } else if (str.equals(VideoCodecType.H264.mimeType())) {
                        i10 |= 2;
                        if (!arrayList.contains(lowerCase)) {
                            arrayList.add(lowerCase);
                        }
                    } else if (str.equals(VideoCodecType.H265.mimeType())) {
                        i10 |= 4;
                        if (!arrayList.contains(lowerCase)) {
                            arrayList.add(lowerCase);
                        }
                    } else if (str.equals(VideoCodecType.AV1.mimeType()) && !arrayList.contains(lowerCase)) {
                        arrayList.add(lowerCase);
                    }
                }
            }
        }
        return new SupportCodecInfo(i10, arrayList.toString());
    }

    public static boolean isHardwareSupported(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        String name = mediaCodecInfo.getName();
        int i10 = AnonymousClass1.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        if (i10 == 1) {
            return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Intel.") || name.startsWith("OMX.Exynos.") || name.startsWith("OMX.Nvidia.");
        }
        if (i10 == 2) {
            return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
        }
        if (i10 == 3) {
            return !H264_HWDEC_EXCEPTION_MODELS.contains(Build.MODEL);
        }
        if (i10 != 4) {
            return i10 == 5 && Build.VERSION.SDK_INT >= 30;
        }
        return true;
    }

    @CalledByNative
    public static boolean isSupportHwDecoderByType(String str) {
        return VideoCodecType.contains(str) && findCodecForType(VideoCodecType.valueOf(str)) != null;
    }

    @CalledByNative
    public static boolean isSupportHwDecoderByTypeAndProfile(String str, String str2) {
        MediaCodecInfo findCodecForType;
        Logging.w(TAG, "isSupportHwDecoderByTypeAndProfile " + str + ":" + str2);
        if (!VideoCodecType.contains(str) || (findCodecForType = findCodecForType(VideoCodecType.valueOf(str))) == null) {
            return false;
        }
        try {
            if (VideoCodecProfile.contains(str2)) {
                return isSupportedProfile(findCodecForType.getCapabilitiesForType(VideoCodecType.valueOf(str).mimeType()), VideoCodecProfile.valueOf(str2));
            }
            return false;
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) == null) {
                Logging.w(TAG, "selectColorFormat is null");
                return false;
            }
            if (MediaCodecUtils.checkInvalidDecoder(mediaCodecInfo.getName())) {
                return false;
            }
            return isHardwareSupported(mediaCodecInfo, videoCodecType);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean isSupportedProfile(MediaCodecInfo.CodecCapabilities codecCapabilities, VideoCodecProfile videoCodecProfile) {
        if (codecCapabilities != null) {
            for (int i10 = 0; i10 < codecCapabilities.profileLevels.length; i10++) {
                Logging.i(TAG, "device decoder profile:" + codecCapabilities.profileLevels[i10].profile);
                if (codecCapabilities.profileLevels[i10].profile == videoCodecProfile.profile()) {
                    Logging.i(TAG, "match decoder profile:" + codecCapabilities.profileLevels[i10].profile);
                    return true;
                }
            }
        }
        return false;
    }

    public static MediaCodecInfo findCodecForType(VideoCodecType videoCodecType, boolean z10, boolean z11, String str) {
        MediaCodecInfo mediaCodecInfo;
        VideoCodecType videoCodecType2 = VideoCodecType.VP8;
        if (videoCodecType == videoCodecType2 && mediaCodecInfoMaps.get(videoCodecType2) != null && !z10 && (TextUtils.isEmpty(str) || !mediaCodecInfoMaps.get(videoCodecType2).getName().contains(str))) {
            return mediaCodecInfoMaps.get(videoCodecType2);
        }
        VideoCodecType videoCodecType3 = VideoCodecType.VP9;
        if (videoCodecType == videoCodecType3 && mediaCodecInfoMaps.get(videoCodecType3) != null && !z10 && (TextUtils.isEmpty(str) || !mediaCodecInfoMaps.get(videoCodecType3).getName().contains(str))) {
            return mediaCodecInfoMaps.get(videoCodecType3);
        }
        VideoCodecType videoCodecType4 = VideoCodecType.H264;
        if (videoCodecType == videoCodecType4 && mediaCodecInfoMaps.get(videoCodecType4) != null && !z10 && (TextUtils.isEmpty(str) || !mediaCodecInfoMaps.get(videoCodecType4).getName().contains(str))) {
            return mediaCodecInfoMaps.get(videoCodecType4);
        }
        VideoCodecType videoCodecType5 = VideoCodecType.H265;
        if (videoCodecType == videoCodecType5 && mediaCodecInfoMaps.get(videoCodecType5) != null && !z10 && (TextUtils.isEmpty(str) || !mediaCodecInfoMaps.get(videoCodecType5).getName().contains(str))) {
            return mediaCodecInfoMaps.get(videoCodecType5);
        }
        VideoCodecType videoCodecType6 = VideoCodecType.AV1;
        if (videoCodecType == videoCodecType6 && mediaCodecInfoMaps.get(videoCodecType6) != null && !z11 && (TextUtils.isEmpty(str) || !mediaCodecInfoMaps.get(videoCodecType6).getName().contains(str))) {
            return mediaCodecInfoMaps.get(videoCodecType6);
        }
        MediaCodecInfo mediaCodecInfo2 = null;
        for (int i10 = 0; i10 < MediaCodecList.getCodecCount(); i10++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i10);
            } catch (IllegalArgumentException e10) {
                Logging.e(TAG, "Cannot retrieve encoder codec info", e10);
                mediaCodecInfo = null;
            }
            boolean isSoftwareOnly = (mediaCodecInfo == null || Build.VERSION.SDK_INT < 29) ? false : mediaCodecInfo.isSoftwareOnly();
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && ((z11 || !mediaCodecInfo.getName().contains("av1-dav1d")) && ((z10 || !isSoftwareOnly || mediaCodecInfo.getName().contains("av1-dav1d")) && ((TextUtils.isEmpty(str) || !mediaCodecInfo.getName().toLowerCase().contains(str.toLowerCase())) && isSupportedCodec(mediaCodecInfo, videoCodecType))))) {
                if (videoCodecType != VideoCodecType.AV1 || !mediaCodecInfo.getName().contains("av1-dav1d")) {
                    mediaCodecInfoMaps.put(videoCodecType, mediaCodecInfo);
                    return mediaCodecInfo;
                }
                mediaCodecInfo2 = mediaCodecInfo;
            }
        }
        if (videoCodecType != VideoCodecType.AV1 || mediaCodecInfo2 == null) {
            return null;
        }
        mediaCodecInfoMaps.put(videoCodecType, mediaCodecInfo2);
        return mediaCodecInfo2;
    }
}
