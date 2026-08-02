package com.vk.biometric.auth.api.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthMode.kt */
/* loaded from: classes15.dex */
public final class AuthMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AuthMode[] $VALUES;
    public static final AuthMode DECRYPTION;
    public static final AuthMode ENCRYPTION;

    static {
        AuthMode authMode = new AuthMode("ENCRYPTION", 0);
        ENCRYPTION = authMode;
        AuthMode authMode2 = new AuthMode("DECRYPTION", 1);
        DECRYPTION = authMode2;
        AuthMode[] authModeArr = {authMode, authMode2};
        $VALUES = authModeArr;
        $ENTRIES = new asp(authModeArr);
    }

    public AuthMode() {
        throw null;
    }

    public static AuthMode valueOf(String str) {
        return (AuthMode) Enum.valueOf(AuthMode.class, str);
    }

    public static AuthMode[] values() {
        return (AuthMode[]) $VALUES.clone();
    }
}
