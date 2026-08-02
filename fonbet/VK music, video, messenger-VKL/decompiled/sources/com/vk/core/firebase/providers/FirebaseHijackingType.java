package com.vk.core.firebase.providers;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FirebaseHijackingType.kt */
/* loaded from: classes.dex */
public final class FirebaseHijackingType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FirebaseHijackingType[] $VALUES;
    public static final FirebaseHijackingType ASYNC;
    public static final FirebaseHijackingType COLD_START;
    public static final a Companion;
    public static final FirebaseHijackingType SYNC;
    private final int value;

    /* compiled from: FirebaseHijackingType.kt */
    public static final class a {
    }

    static {
        FirebaseHijackingType firebaseHijackingType = new FirebaseHijackingType("ASYNC", 0, 0);
        ASYNC = firebaseHijackingType;
        FirebaseHijackingType firebaseHijackingType2 = new FirebaseHijackingType("SYNC", 1, 1);
        SYNC = firebaseHijackingType2;
        FirebaseHijackingType firebaseHijackingType3 = new FirebaseHijackingType("COLD_START", 2, 2);
        COLD_START = firebaseHijackingType3;
        FirebaseHijackingType[] firebaseHijackingTypeArr = {firebaseHijackingType, firebaseHijackingType2, firebaseHijackingType3};
        $VALUES = firebaseHijackingTypeArr;
        $ENTRIES = new asp(firebaseHijackingTypeArr);
        Companion = new a();
    }

    public FirebaseHijackingType(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<FirebaseHijackingType> h() {
        return $ENTRIES;
    }

    public static FirebaseHijackingType valueOf(String str) {
        return (FirebaseHijackingType) Enum.valueOf(FirebaseHijackingType.class, str);
    }

    public static FirebaseHijackingType[] values() {
        return (FirebaseHijackingType[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
