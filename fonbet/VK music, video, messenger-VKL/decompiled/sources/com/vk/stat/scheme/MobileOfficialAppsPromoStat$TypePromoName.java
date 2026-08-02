package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsPromoStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsPromoStat$TypePromoName {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsPromoStat$TypePromoName[] $VALUES;

    @pmi0("vk_video")
    public static final MobileOfficialAppsPromoStat$TypePromoName VK_VIDEO;

    static {
        MobileOfficialAppsPromoStat$TypePromoName mobileOfficialAppsPromoStat$TypePromoName = new MobileOfficialAppsPromoStat$TypePromoName("VK_VIDEO", 0);
        VK_VIDEO = mobileOfficialAppsPromoStat$TypePromoName;
        MobileOfficialAppsPromoStat$TypePromoName[] mobileOfficialAppsPromoStat$TypePromoNameArr = {mobileOfficialAppsPromoStat$TypePromoName};
        $VALUES = mobileOfficialAppsPromoStat$TypePromoNameArr;
        $ENTRIES = new asp(mobileOfficialAppsPromoStat$TypePromoNameArr);
    }

    private MobileOfficialAppsPromoStat$TypePromoName(String str, int i) {
    }

    public static MobileOfficialAppsPromoStat$TypePromoName valueOf(String str) {
        return (MobileOfficialAppsPromoStat$TypePromoName) Enum.valueOf(MobileOfficialAppsPromoStat$TypePromoName.class, str);
    }

    public static MobileOfficialAppsPromoStat$TypePromoName[] values() {
        return (MobileOfficialAppsPromoStat$TypePromoName[]) $VALUES.clone();
    }
}
