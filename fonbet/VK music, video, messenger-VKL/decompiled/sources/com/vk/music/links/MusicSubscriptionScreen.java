package com.vk.music.links;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicSubscriptionScreen.kt */
/* loaded from: classes3.dex */
public final class MusicSubscriptionScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicSubscriptionScreen[] $VALUES;
    public static final a Companion;
    public static final MusicSubscriptionScreen SUBSCRIPTION_NOTRIAL;
    public static final MusicSubscriptionScreen SUBSCRIPTION_RETRIAL;
    public static final MusicSubscriptionScreen SUBSCRIPTION_SUSPEND;
    public static final MusicSubscriptionScreen SUBSCRIPTION_TRIAL;
    private final MobileOfficialAppsCoreNavStat$EventScreen screen;
    private final String screenName;

    /* compiled from: MusicSubscriptionScreen.kt */
    public static final class a {
        public static MobileOfficialAppsCoreNavStat$EventScreen a(String str) {
            MusicSubscriptionScreen musicSubscriptionScreen;
            MobileOfficialAppsCoreNavStat$EventScreen h;
            MusicSubscriptionScreen[] values = MusicSubscriptionScreen.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    musicSubscriptionScreen = null;
                    break;
                }
                musicSubscriptionScreen = values[i];
                if (epx.f(musicSubscriptionScreen.i(), str)) {
                    break;
                }
                i++;
            }
            return (musicSubscriptionScreen == null || (h = musicSubscriptionScreen.h()) == null) ? MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE : h;
        }
    }

    static {
        MusicSubscriptionScreen musicSubscriptionScreen = new MusicSubscriptionScreen("SUBSCRIPTION_SUSPEND", 0, "subscription_suspend", MobileOfficialAppsCoreNavStat$EventScreen.SUBSCRIPTION_SUSPEND);
        SUBSCRIPTION_SUSPEND = musicSubscriptionScreen;
        MusicSubscriptionScreen musicSubscriptionScreen2 = new MusicSubscriptionScreen("SUBSCRIPTION_TRIAL", 1, "buy_subscription_trial", MobileOfficialAppsCoreNavStat$EventScreen.BUY_SUBSCRIPTION_TRIAL);
        SUBSCRIPTION_TRIAL = musicSubscriptionScreen2;
        MusicSubscriptionScreen musicSubscriptionScreen3 = new MusicSubscriptionScreen("SUBSCRIPTION_RETRIAL", 2, "buy_subscription_retrial", MobileOfficialAppsCoreNavStat$EventScreen.BUY_SUBSCRIPTION_RETRIAL);
        SUBSCRIPTION_RETRIAL = musicSubscriptionScreen3;
        MusicSubscriptionScreen musicSubscriptionScreen4 = new MusicSubscriptionScreen("SUBSCRIPTION_NOTRIAL", 3, "buy_subscription_notrial", MobileOfficialAppsCoreNavStat$EventScreen.BUY_SUBSCRIPTION_NOTRIAL);
        SUBSCRIPTION_NOTRIAL = musicSubscriptionScreen4;
        MusicSubscriptionScreen[] musicSubscriptionScreenArr = {musicSubscriptionScreen, musicSubscriptionScreen2, musicSubscriptionScreen3, musicSubscriptionScreen4};
        $VALUES = musicSubscriptionScreenArr;
        $ENTRIES = new asp(musicSubscriptionScreenArr);
        Companion = new a();
    }

    public MusicSubscriptionScreen(String str, int i, String str2, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this.screenName = str2;
        this.screen = mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public static MusicSubscriptionScreen valueOf(String str) {
        return (MusicSubscriptionScreen) Enum.valueOf(MusicSubscriptionScreen.class, str);
    }

    public static MusicSubscriptionScreen[] values() {
        return (MusicSubscriptionScreen[]) $VALUES.clone();
    }

    public final MobileOfficialAppsCoreNavStat$EventScreen h() {
        return this.screen;
    }

    public final String i() {
        return this.screenName;
    }
}
