package com.vk.superapp.advertisement.requestsanalytics;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdRequestPurpose.kt */
/* loaded from: classes6.dex */
public final class AdRequestPurpose {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AdRequestPurpose[] $VALUES;
    public static final AdRequestPurpose CHECK_INSTANCE;
    public static final AdRequestPurpose LOAD_INITIAL_INSTANCE;
    public static final AdRequestPurpose LOAD_NEXT_INSTANCE;
    public static final AdRequestPurpose SHOW_INSTANCE;

    static {
        AdRequestPurpose adRequestPurpose = new AdRequestPurpose("CHECK_INSTANCE", 0);
        CHECK_INSTANCE = adRequestPurpose;
        AdRequestPurpose adRequestPurpose2 = new AdRequestPurpose("SHOW_INSTANCE", 1);
        SHOW_INSTANCE = adRequestPurpose2;
        AdRequestPurpose adRequestPurpose3 = new AdRequestPurpose("LOAD_INITIAL_INSTANCE", 2);
        LOAD_INITIAL_INSTANCE = adRequestPurpose3;
        AdRequestPurpose adRequestPurpose4 = new AdRequestPurpose("LOAD_NEXT_INSTANCE", 3);
        LOAD_NEXT_INSTANCE = adRequestPurpose4;
        AdRequestPurpose[] adRequestPurposeArr = {adRequestPurpose, adRequestPurpose2, adRequestPurpose3, adRequestPurpose4};
        $VALUES = adRequestPurposeArr;
        $ENTRIES = new asp(adRequestPurposeArr);
    }

    public AdRequestPurpose() {
        throw null;
    }

    public static AdRequestPurpose valueOf(String str) {
        return (AdRequestPurpose) Enum.valueOf(AdRequestPurpose.class, str);
    }

    public static AdRequestPurpose[] values() {
        return (AdRequestPurpose[]) $VALUES.clone();
    }
}
