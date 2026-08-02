package com.vk.toggle.data.firebase;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FirebaseInitConfig.kt */
/* loaded from: classes11.dex */
public final class FirebaseInitConfig {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FirebaseInitConfig[] $VALUES;
    public static final FirebaseInitConfig AFTER_COLD_START;
    public static final FirebaseInitConfig ASYNC_CONTENT_PROVIDER;
    public static final FirebaseInitConfig SAFE_ASYNC_CONTENT_PROVIDER;
    public static final FirebaseInitConfig SYNC_CONTENT_PROVIDER;

    static {
        FirebaseInitConfig firebaseInitConfig = new FirebaseInitConfig("SAFE_ASYNC_CONTENT_PROVIDER", 0);
        SAFE_ASYNC_CONTENT_PROVIDER = firebaseInitConfig;
        FirebaseInitConfig firebaseInitConfig2 = new FirebaseInitConfig("ASYNC_CONTENT_PROVIDER", 1);
        ASYNC_CONTENT_PROVIDER = firebaseInitConfig2;
        FirebaseInitConfig firebaseInitConfig3 = new FirebaseInitConfig("SYNC_CONTENT_PROVIDER", 2);
        SYNC_CONTENT_PROVIDER = firebaseInitConfig3;
        FirebaseInitConfig firebaseInitConfig4 = new FirebaseInitConfig("AFTER_COLD_START", 3);
        AFTER_COLD_START = firebaseInitConfig4;
        FirebaseInitConfig[] firebaseInitConfigArr = {firebaseInitConfig, firebaseInitConfig2, firebaseInitConfig3, firebaseInitConfig4};
        $VALUES = firebaseInitConfigArr;
        $ENTRIES = new asp(firebaseInitConfigArr);
    }

    public FirebaseInitConfig() {
        throw null;
    }

    public static FirebaseInitConfig valueOf(String str) {
        return (FirebaseInitConfig) Enum.valueOf(FirebaseInitConfig.class, str);
    }

    public static FirebaseInitConfig[] values() {
        return (FirebaseInitConfig[]) $VALUES.clone();
    }
}
