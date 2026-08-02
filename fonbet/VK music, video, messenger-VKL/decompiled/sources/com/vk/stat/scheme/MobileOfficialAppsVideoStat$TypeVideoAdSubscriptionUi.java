package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi[] $VALUES;

    @pmi0("ad_player_button")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi AD_PLAYER_BUTTON;

    @pmi0("banner")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi BANNER;

    @pmi0("banner_discover")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi BANNER_DISCOVER;

    @pmi0("button")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi BUTTON;

    @pmi0("notification")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi NOTIFICATION;

    @pmi0("popup")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi POPUP;

    @pmi0("profile_settings_button")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi PROFILE_SETTINGS_BUTTON;

    @pmi0("snackbar")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi SNACKBAR;

    static {
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("POPUP", 0);
        POPUP = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi2 = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("BANNER", 1);
        BANNER = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi2;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi3 = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("BUTTON", 2);
        BUTTON = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi3;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi4 = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("SNACKBAR", 3);
        SNACKBAR = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi4;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi5 = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("NOTIFICATION", 4);
        NOTIFICATION = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi5;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi6 = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("AD_PLAYER_BUTTON", 5);
        AD_PLAYER_BUTTON = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi6;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi7 = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("PROFILE_SETTINGS_BUTTON", 6);
        PROFILE_SETTINGS_BUTTON = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi7;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi8 = new MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi("BANNER_DISCOVER", 7);
        BANNER_DISCOVER = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi8;
        MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi[] mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUiArr = {mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi2, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi3, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi4, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi5, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi6, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi7, mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi8};
        $VALUES = mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUiArr;
        $ENTRIES = new asp(mobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUiArr);
    }

    private MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi(String str, int i) {
    }

    public static MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi valueOf(String str) {
        return (MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi) Enum.valueOf(MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi.class, str);
    }

    public static MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi[] values() {
        return (MobileOfficialAppsVideoStat$TypeVideoAdSubscriptionUi[]) $VALUES.clone();
    }
}
