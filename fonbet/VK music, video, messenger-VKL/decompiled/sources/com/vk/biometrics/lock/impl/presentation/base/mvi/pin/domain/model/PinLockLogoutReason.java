package com.vk.biometrics.lock.impl.presentation.base.mvi.pin.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinLockLogoutReason.kt */
/* loaded from: classes15.dex */
public final class PinLockLogoutReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PinLockLogoutReason[] $VALUES;
    public static final PinLockLogoutReason MULTIPLE_INCORRECT_CODE;
    public static final PinLockLogoutReason USER_LOGOUT;
    private final String value;

    static {
        PinLockLogoutReason pinLockLogoutReason = new PinLockLogoutReason("USER_LOGOUT", 0, "pin_lock_user_logout");
        USER_LOGOUT = pinLockLogoutReason;
        PinLockLogoutReason pinLockLogoutReason2 = new PinLockLogoutReason("MULTIPLE_INCORRECT_CODE", 1, "pin_lock_code_incorrectly");
        MULTIPLE_INCORRECT_CODE = pinLockLogoutReason2;
        PinLockLogoutReason[] pinLockLogoutReasonArr = {pinLockLogoutReason, pinLockLogoutReason2};
        $VALUES = pinLockLogoutReasonArr;
        $ENTRIES = new asp(pinLockLogoutReasonArr);
    }

    public PinLockLogoutReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static PinLockLogoutReason valueOf(String str) {
        return (PinLockLogoutReason) Enum.valueOf(PinLockLogoutReason.class, str);
    }

    public static PinLockLogoutReason[] values() {
        return (PinLockLogoutReason[]) $VALUES.clone();
    }

    public final String h() {
        return this.value;
    }
}
