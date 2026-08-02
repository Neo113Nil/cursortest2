package com.vk.dto.video;

import xsna.asp;
import xsna.brm0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoNotificationsStatus.kt */
/* loaded from: classes18.dex */
public final class VideoNotificationsStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoNotificationsStatus[] $VALUES;
    public static final VideoNotificationsStatus ALL;
    public static final a Companion;
    public static final VideoNotificationsStatus NONE;
    public static final VideoNotificationsStatus PREFERRED;
    private final String value;

    /* compiled from: VideoNotificationsStatus.kt */
    public static final class a {
        public static VideoNotificationsStatus a(String str) {
            for (VideoNotificationsStatus videoNotificationsStatus : VideoNotificationsStatus.values()) {
                if (brm0.w(videoNotificationsStatus.i(), str, true)) {
                    return videoNotificationsStatus;
                }
            }
            return null;
        }
    }

    static {
        VideoNotificationsStatus videoNotificationsStatus = new VideoNotificationsStatus("ALL", 0, "all");
        ALL = videoNotificationsStatus;
        VideoNotificationsStatus videoNotificationsStatus2 = new VideoNotificationsStatus("PREFERRED", 1, "preferred");
        PREFERRED = videoNotificationsStatus2;
        VideoNotificationsStatus videoNotificationsStatus3 = new VideoNotificationsStatus("NONE", 2, "none");
        NONE = videoNotificationsStatus3;
        VideoNotificationsStatus[] videoNotificationsStatusArr = {videoNotificationsStatus, videoNotificationsStatus2, videoNotificationsStatus3};
        $VALUES = videoNotificationsStatusArr;
        $ENTRIES = new asp(videoNotificationsStatusArr);
        Companion = new a();
    }

    public VideoNotificationsStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public static zrp<VideoNotificationsStatus> h() {
        return $ENTRIES;
    }

    public static VideoNotificationsStatus valueOf(String str) {
        return (VideoNotificationsStatus) Enum.valueOf(VideoNotificationsStatus.class, str);
    }

    public static VideoNotificationsStatus[] values() {
        return (VideoNotificationsStatus[]) $VALUES.clone();
    }

    public final String i() {
        return this.value;
    }
}
