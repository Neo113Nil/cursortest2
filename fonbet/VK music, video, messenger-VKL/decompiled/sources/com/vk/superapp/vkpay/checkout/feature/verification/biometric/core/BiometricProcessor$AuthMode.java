package com.vk.superapp.vkpay.checkout.feature.verification.biometric.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BiometricProcessor.kt */
/* loaded from: classes6.dex */
public final class BiometricProcessor$AuthMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ BiometricProcessor$AuthMode[] $VALUES;
    public static final BiometricProcessor$AuthMode DECRYPTION;
    public static final BiometricProcessor$AuthMode ENCRYPTION;

    static {
        BiometricProcessor$AuthMode biometricProcessor$AuthMode = new BiometricProcessor$AuthMode("ENCRYPTION", 0);
        ENCRYPTION = biometricProcessor$AuthMode;
        BiometricProcessor$AuthMode biometricProcessor$AuthMode2 = new BiometricProcessor$AuthMode("DECRYPTION", 1);
        DECRYPTION = biometricProcessor$AuthMode2;
        BiometricProcessor$AuthMode[] biometricProcessor$AuthModeArr = {biometricProcessor$AuthMode, biometricProcessor$AuthMode2};
        $VALUES = biometricProcessor$AuthModeArr;
        $ENTRIES = new asp(biometricProcessor$AuthModeArr);
    }

    public BiometricProcessor$AuthMode() {
        throw null;
    }

    public static BiometricProcessor$AuthMode valueOf(String str) {
        return (BiometricProcessor$AuthMode) Enum.valueOf(BiometricProcessor$AuthMode.class, str);
    }

    public static BiometricProcessor$AuthMode[] values() {
        return (BiometricProcessor$AuthMode[]) $VALUES.clone();
    }
}
