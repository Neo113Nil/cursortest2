package com.vk.biometrics.lock.impl.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnlockType.kt */
/* loaded from: classes15.dex */
public final class UnlockType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ UnlockType[] $VALUES;
    public static final UnlockType BIOMETRICS;
    public static final UnlockType PASSWORD;

    static {
        UnlockType unlockType = new UnlockType("PASSWORD", 0);
        PASSWORD = unlockType;
        UnlockType unlockType2 = new UnlockType("BIOMETRICS", 1);
        BIOMETRICS = unlockType2;
        UnlockType[] unlockTypeArr = {unlockType, unlockType2};
        $VALUES = unlockTypeArr;
        $ENTRIES = new asp(unlockTypeArr);
    }

    public UnlockType() {
        throw null;
    }

    public static UnlockType valueOf(String str) {
        return (UnlockType) Enum.valueOf(UnlockType.class, str);
    }

    public static UnlockType[] values() {
        return (UnlockType[]) $VALUES.clone();
    }
}
