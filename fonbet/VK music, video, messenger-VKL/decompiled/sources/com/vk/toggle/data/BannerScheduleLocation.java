package com.vk.toggle.data;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationResubscribeBannerScheduleConfig.kt */
/* loaded from: classes6.dex */
public final class BannerScheduleLocation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BannerScheduleLocation[] $VALUES;
    public static final BannerScheduleLocation CHAT;
    public static final BannerScheduleLocation CHAT_LIST;
    public static final BannerScheduleLocation NOTIFICATIONS;

    static {
        BannerScheduleLocation bannerScheduleLocation = new BannerScheduleLocation("NOTIFICATIONS", 0);
        NOTIFICATIONS = bannerScheduleLocation;
        BannerScheduleLocation bannerScheduleLocation2 = new BannerScheduleLocation("CHAT_LIST", 1);
        CHAT_LIST = bannerScheduleLocation2;
        BannerScheduleLocation bannerScheduleLocation3 = new BannerScheduleLocation("CHAT", 2);
        CHAT = bannerScheduleLocation3;
        BannerScheduleLocation[] bannerScheduleLocationArr = {bannerScheduleLocation, bannerScheduleLocation2, bannerScheduleLocation3};
        $VALUES = bannerScheduleLocationArr;
        $ENTRIES = new asp(bannerScheduleLocationArr);
    }

    public BannerScheduleLocation() {
        throw null;
    }

    public static BannerScheduleLocation valueOf(String str) {
        return (BannerScheduleLocation) Enum.valueOf(BannerScheduleLocation.class, str);
    }

    public static BannerScheduleLocation[] values() {
        return (BannerScheduleLocation[]) $VALUES.clone();
    }
}
