package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsVideoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsVideoStat$TypeVideoAdTrialUi {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsVideoStat$TypeVideoAdTrialUi[] $VALUES;

    @pmi0("popup")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdTrialUi POPUP;

    @pmi0("snackbar")
    public static final MobileOfficialAppsVideoStat$TypeVideoAdTrialUi SNACKBAR;

    static {
        MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi = new MobileOfficialAppsVideoStat$TypeVideoAdTrialUi("POPUP", 0);
        POPUP = mobileOfficialAppsVideoStat$TypeVideoAdTrialUi;
        MobileOfficialAppsVideoStat$TypeVideoAdTrialUi mobileOfficialAppsVideoStat$TypeVideoAdTrialUi2 = new MobileOfficialAppsVideoStat$TypeVideoAdTrialUi("SNACKBAR", 1);
        SNACKBAR = mobileOfficialAppsVideoStat$TypeVideoAdTrialUi2;
        MobileOfficialAppsVideoStat$TypeVideoAdTrialUi[] mobileOfficialAppsVideoStat$TypeVideoAdTrialUiArr = {mobileOfficialAppsVideoStat$TypeVideoAdTrialUi, mobileOfficialAppsVideoStat$TypeVideoAdTrialUi2};
        $VALUES = mobileOfficialAppsVideoStat$TypeVideoAdTrialUiArr;
        $ENTRIES = new asp(mobileOfficialAppsVideoStat$TypeVideoAdTrialUiArr);
    }

    private MobileOfficialAppsVideoStat$TypeVideoAdTrialUi(String str, int i) {
    }

    public static MobileOfficialAppsVideoStat$TypeVideoAdTrialUi valueOf(String str) {
        return (MobileOfficialAppsVideoStat$TypeVideoAdTrialUi) Enum.valueOf(MobileOfficialAppsVideoStat$TypeVideoAdTrialUi.class, str);
    }

    public static MobileOfficialAppsVideoStat$TypeVideoAdTrialUi[] values() {
        return (MobileOfficialAppsVideoStat$TypeVideoAdTrialUi[]) $VALUES.clone();
    }
}
