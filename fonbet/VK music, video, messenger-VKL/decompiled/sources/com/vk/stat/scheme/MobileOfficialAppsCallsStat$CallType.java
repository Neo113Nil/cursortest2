package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsCallsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsCallsStat$CallType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsCallsStat$CallType[] $VALUES;

    @pmi0("contact")
    public static final MobileOfficialAppsCallsStat$CallType CONTACT;

    @pmi0("group")
    public static final MobileOfficialAppsCallsStat$CallType GROUP;

    @pmi0("user")
    public static final MobileOfficialAppsCallsStat$CallType USER;

    static {
        MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType = new MobileOfficialAppsCallsStat$CallType("USER", 0);
        USER = mobileOfficialAppsCallsStat$CallType;
        MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType2 = new MobileOfficialAppsCallsStat$CallType("GROUP", 1);
        GROUP = mobileOfficialAppsCallsStat$CallType2;
        MobileOfficialAppsCallsStat$CallType mobileOfficialAppsCallsStat$CallType3 = new MobileOfficialAppsCallsStat$CallType("CONTACT", 2);
        CONTACT = mobileOfficialAppsCallsStat$CallType3;
        MobileOfficialAppsCallsStat$CallType[] mobileOfficialAppsCallsStat$CallTypeArr = {mobileOfficialAppsCallsStat$CallType, mobileOfficialAppsCallsStat$CallType2, mobileOfficialAppsCallsStat$CallType3};
        $VALUES = mobileOfficialAppsCallsStat$CallTypeArr;
        $ENTRIES = new asp(mobileOfficialAppsCallsStat$CallTypeArr);
    }

    private MobileOfficialAppsCallsStat$CallType(String str, int i) {
    }

    public static MobileOfficialAppsCallsStat$CallType valueOf(String str) {
        return (MobileOfficialAppsCallsStat$CallType) Enum.valueOf(MobileOfficialAppsCallsStat$CallType.class, str);
    }

    public static MobileOfficialAppsCallsStat$CallType[] values() {
        return (MobileOfficialAppsCallsStat$CallType[]) $VALUES.clone();
    }
}
