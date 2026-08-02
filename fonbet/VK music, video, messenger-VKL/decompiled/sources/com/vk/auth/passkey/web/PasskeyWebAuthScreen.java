package com.vk.auth.passkey.web;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PasskeyWebAuthScreen.kt */
/* loaded from: classes15.dex */
public final class PasskeyWebAuthScreen {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PasskeyWebAuthScreen[] $VALUES;
    public static final a Companion;
    public static final PasskeyWebAuthScreen PASSKEY;
    public static final PasskeyWebAuthScreen PASSKEY_OTP;
    private final String type;

    /* compiled from: PasskeyWebAuthScreen.kt */
    public static final class a {
        public static PasskeyWebAuthScreen a(boolean z) {
            return z ? PasskeyWebAuthScreen.PASSKEY : PasskeyWebAuthScreen.PASSKEY_OTP;
        }
    }

    static {
        PasskeyWebAuthScreen passkeyWebAuthScreen = new PasskeyWebAuthScreen("PASSKEY", 0, "passkey");
        PASSKEY = passkeyWebAuthScreen;
        PasskeyWebAuthScreen passkeyWebAuthScreen2 = new PasskeyWebAuthScreen("PASSKEY_OTP", 1, "passkeyOtp");
        PASSKEY_OTP = passkeyWebAuthScreen2;
        PasskeyWebAuthScreen[] passkeyWebAuthScreenArr = {passkeyWebAuthScreen, passkeyWebAuthScreen2};
        $VALUES = passkeyWebAuthScreenArr;
        $ENTRIES = new asp(passkeyWebAuthScreenArr);
        Companion = new a();
    }

    public PasskeyWebAuthScreen(String str, int i, String str2) {
        this.type = str2;
    }

    public static PasskeyWebAuthScreen valueOf(String str) {
        return (PasskeyWebAuthScreen) Enum.valueOf(PasskeyWebAuthScreen.class, str);
    }

    public static PasskeyWebAuthScreen[] values() {
        return (PasskeyWebAuthScreen[]) $VALUES.clone();
    }

    public final String h() {
        return this.type;
    }
}
