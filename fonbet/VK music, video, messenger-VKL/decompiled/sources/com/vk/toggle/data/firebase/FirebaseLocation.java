package com.vk.toggle.data.firebase;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FirebaseLocation.kt */
/* loaded from: classes11.dex */
public final class FirebaseLocation {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FirebaseLocation[] $VALUES;
    public static final FirebaseLocation AFTER_COLD_START;
    public static final FirebaseLocation CONTENT_PROVIDER;
    public static final a Companion;
    private final int value;

    /* compiled from: FirebaseLocation.kt */
    public static final class a {
    }

    static {
        FirebaseLocation firebaseLocation = new FirebaseLocation("CONTENT_PROVIDER", 0, 0);
        CONTENT_PROVIDER = firebaseLocation;
        FirebaseLocation firebaseLocation2 = new FirebaseLocation("AFTER_COLD_START", 1, 1);
        AFTER_COLD_START = firebaseLocation2;
        FirebaseLocation[] firebaseLocationArr = {firebaseLocation, firebaseLocation2};
        $VALUES = firebaseLocationArr;
        $ENTRIES = new asp(firebaseLocationArr);
        Companion = new a();
    }

    public FirebaseLocation(String str, int i, int i2) {
        this.value = i2;
    }

    public static zrp<FirebaseLocation> h() {
        return $ENTRIES;
    }

    public static FirebaseLocation valueOf(String str) {
        return (FirebaseLocation) Enum.valueOf(FirebaseLocation.class, str);
    }

    public static FirebaseLocation[] values() {
        return (FirebaseLocation[]) $VALUES.clone();
    }

    public final int i() {
        return this.value;
    }
}
