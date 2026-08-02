package com.vk.toggle.data.firebase;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FirebaseInitType.kt */
/* loaded from: classes11.dex */
public final class FirebaseInitType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FirebaseInitType[] $VALUES;
    public static final FirebaseInitType ASYNC;
    public static final a Companion;
    public static final FirebaseInitType SAFE_ASYNC;
    public static final FirebaseInitType SYNC;
    private final int value;

    /* compiled from: FirebaseInitType.kt */
    public static final class a {
    }

    static {
        FirebaseInitType firebaseInitType = new FirebaseInitType("SYNC", 0, 1);
        SYNC = firebaseInitType;
        FirebaseInitType firebaseInitType2 = new FirebaseInitType("SAFE_ASYNC", 1, 0);
        SAFE_ASYNC = firebaseInitType2;
        FirebaseInitType firebaseInitType3 = new FirebaseInitType("ASYNC", 2, -1);
        ASYNC = firebaseInitType3;
        FirebaseInitType[] firebaseInitTypeArr = {firebaseInitType, firebaseInitType2, firebaseInitType3};
        $VALUES = firebaseInitTypeArr;
        $ENTRIES = new asp(firebaseInitTypeArr);
        Companion = new a();
    }

    public FirebaseInitType(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<FirebaseInitType> h() {
        return $ENTRIES;
    }

    public static FirebaseInitType valueOf(String str) {
        return (FirebaseInitType) Enum.valueOf(FirebaseInitType.class, str);
    }

    public static FirebaseInitType[] values() {
        return (FirebaseInitType[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
