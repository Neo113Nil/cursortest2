package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView implements SchemeStat$TypeView.b {

    @pmi0("from_screen")
    private final FromScreen fromScreen;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsVideoStat.kt */
    public static final class FromScreen {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FromScreen[] $VALUES;

        @pmi0("for_kids")
        public static final FromScreen FOR_KIDS;

        @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
        public static final FromScreen PROFILE;

        static {
            FromScreen fromScreen = new FromScreen("PROFILE", 0);
            PROFILE = fromScreen;
            FromScreen fromScreen2 = new FromScreen("FOR_KIDS", 1);
            FOR_KIDS = fromScreen2;
            FromScreen[] fromScreenArr = {fromScreen, fromScreen2};
            $VALUES = fromScreenArr;
            $ENTRIES = new asp(fromScreenArr);
        }

        private FromScreen(String str, int i) {
        }

        public static FromScreen valueOf(String str) {
            return (FromScreen) Enum.valueOf(FromScreen.class, str);
        }

        public static FromScreen[] values() {
            return (FromScreen[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView(FromScreen fromScreen) {
        this.fromScreen = fromScreen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView) && this.fromScreen == ((MobileOfficialAppsVideoStat$TypeTvKidModeOnboardingView) obj).fromScreen;
    }

    public final int hashCode() {
        return this.fromScreen.hashCode();
    }

    public final String toString() {
        return "TypeTvKidModeOnboardingView(fromScreen=" + this.fromScreen + ')';
    }
}
