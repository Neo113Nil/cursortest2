package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$LinkType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCallsStat$LinkType[] $VALUES;

    @pmi0("long")
    public static final MobileOfficialAppsCallsStat$LinkType LONG;

    @pmi0("short")
    public static final MobileOfficialAppsCallsStat$LinkType SHORT;

    static {
        MobileOfficialAppsCallsStat$LinkType mobileOfficialAppsCallsStat$LinkType = new MobileOfficialAppsCallsStat$LinkType("SHORT", 0);
        SHORT = mobileOfficialAppsCallsStat$LinkType;
        MobileOfficialAppsCallsStat$LinkType mobileOfficialAppsCallsStat$LinkType2 = new MobileOfficialAppsCallsStat$LinkType("LONG", 1);
        LONG = mobileOfficialAppsCallsStat$LinkType2;
        MobileOfficialAppsCallsStat$LinkType[] mobileOfficialAppsCallsStat$LinkTypeArr = {mobileOfficialAppsCallsStat$LinkType, mobileOfficialAppsCallsStat$LinkType2};
        $VALUES = mobileOfficialAppsCallsStat$LinkTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsCallsStat$LinkTypeArr);
    }

    private MobileOfficialAppsCallsStat$LinkType(String str, int i) {
    }

    public static MobileOfficialAppsCallsStat$LinkType valueOf(String str) {
        return (MobileOfficialAppsCallsStat$LinkType) Enum.valueOf(MobileOfficialAppsCallsStat$LinkType.class, str);
    }

    public static MobileOfficialAppsCallsStat$LinkType[] values() {
        return (MobileOfficialAppsCallsStat$LinkType[]) $VALUES.clone();
    }
}
