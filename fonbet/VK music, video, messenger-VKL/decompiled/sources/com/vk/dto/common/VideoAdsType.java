package com.vk.dto.common;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoAdsType.kt */
/* loaded from: classes18.dex */
public final class VideoAdsType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoAdsType[] $VALUES;
    public static final a Companion;
    public static final VideoAdsType MAIL_PROMOTED_SHORT_VIDEO;
    public static final VideoAdsType MAIL_SHORT_VIDEO;
    public static final VideoAdsType MAIL_SHORT_VIDEO_KNOWN_OWNER;
    public static final VideoAdsType MY_TARGET_VIDEO;
    public static final VideoAdsType UNKNOWN;
    public static final VideoAdsType VK_SHORT_VIDEO;
    private final String key;

    /* compiled from: VideoAdsType.kt */
    public static final class a {
        public static VideoAdsType a(String str) {
            Object obj;
            Iterator<E> it = VideoAdsType.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((VideoAdsType) obj).i(), str)) {
                    break;
                }
            }
            VideoAdsType videoAdsType = (VideoAdsType) obj;
            return videoAdsType == null ? VideoAdsType.UNKNOWN : videoAdsType;
        }
    }

    static {
        VideoAdsType videoAdsType = new VideoAdsType("VK_SHORT_VIDEO", 0, "ads_vk_short_video");
        VK_SHORT_VIDEO = videoAdsType;
        VideoAdsType videoAdsType2 = new VideoAdsType("MAIL_SHORT_VIDEO", 1, "ads_mail_short_video");
        MAIL_SHORT_VIDEO = videoAdsType2;
        VideoAdsType videoAdsType3 = new VideoAdsType("MAIL_SHORT_VIDEO_KNOWN_OWNER", 2, "ads_mail_short_video_known_owner");
        MAIL_SHORT_VIDEO_KNOWN_OWNER = videoAdsType3;
        VideoAdsType videoAdsType4 = new VideoAdsType("MAIL_PROMOTED_SHORT_VIDEO", 3, "ads_mail_promoted_short_video");
        MAIL_PROMOTED_SHORT_VIDEO = videoAdsType4;
        VideoAdsType videoAdsType5 = new VideoAdsType("MY_TARGET_VIDEO", 4, "ads_my_target_video");
        MY_TARGET_VIDEO = videoAdsType5;
        VideoAdsType videoAdsType6 = new VideoAdsType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5, "unknown");
        UNKNOWN = videoAdsType6;
        VideoAdsType[] videoAdsTypeArr = {videoAdsType, videoAdsType2, videoAdsType3, videoAdsType4, videoAdsType5, videoAdsType6};
        $VALUES = videoAdsTypeArr;
        $ENTRIES = new asp(videoAdsTypeArr);
        Companion = new a();
    }

    public VideoAdsType(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<VideoAdsType> h() {
        return $ENTRIES;
    }

    public static VideoAdsType valueOf(String str) {
        return (VideoAdsType) Enum.valueOf(VideoAdsType.class, str);
    }

    public static VideoAdsType[] values() {
        return (VideoAdsType[]) $VALUES.clone();
    }

    public final String i() {
        return this.key;
    }
}
