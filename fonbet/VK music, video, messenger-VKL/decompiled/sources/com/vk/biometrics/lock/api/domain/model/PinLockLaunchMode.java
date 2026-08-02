package com.vk.biometrics.lock.api.domain.model;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinLockLaunchMode.kt */
/* loaded from: classes15.dex */
public final class PinLockLaunchMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PinLockLaunchMode[] $VALUES;
    public static final a Companion;
    public static final PinLockLaunchMode DEFAULT;
    public static final PinLockLaunchMode DISABLE_PASSWORD;
    public static final PinLockLaunchMode ENTER_PASSWORD;
    public static final PinLockLaunchMode NEW_PASSWORD;
    public static final PinLockLaunchMode OLD_PASSWORD;
    private final int code;

    /* compiled from: PinLockLaunchMode.kt */
    public static final class a {
        public static PinLockLaunchMode a(int i) {
            for (PinLockLaunchMode pinLockLaunchMode : PinLockLaunchMode.values()) {
                if (i == pinLockLaunchMode.h()) {
                    return pinLockLaunchMode;
                }
            }
            return PinLockLaunchMode.DEFAULT;
        }
    }

    static {
        PinLockLaunchMode pinLockLaunchMode = new PinLockLaunchMode("DEFAULT", 0, 0);
        DEFAULT = pinLockLaunchMode;
        PinLockLaunchMode pinLockLaunchMode2 = new PinLockLaunchMode("ENTER_PASSWORD", 1, 1);
        ENTER_PASSWORD = pinLockLaunchMode2;
        PinLockLaunchMode pinLockLaunchMode3 = new PinLockLaunchMode("OLD_PASSWORD", 2, 2);
        OLD_PASSWORD = pinLockLaunchMode3;
        PinLockLaunchMode pinLockLaunchMode4 = new PinLockLaunchMode("NEW_PASSWORD", 3, 3);
        NEW_PASSWORD = pinLockLaunchMode4;
        PinLockLaunchMode pinLockLaunchMode5 = new PinLockLaunchMode("DISABLE_PASSWORD", 4, 4);
        DISABLE_PASSWORD = pinLockLaunchMode5;
        PinLockLaunchMode[] pinLockLaunchModeArr = {pinLockLaunchMode, pinLockLaunchMode2, pinLockLaunchMode3, pinLockLaunchMode4, pinLockLaunchMode5};
        $VALUES = pinLockLaunchModeArr;
        $ENTRIES = new asp(pinLockLaunchModeArr);
        Companion = new a();
    }

    public PinLockLaunchMode(String str, int i, int i2) {
        this.code = i2;
    }

    public static PinLockLaunchMode valueOf(String str) {
        return (PinLockLaunchMode) Enum.valueOf(PinLockLaunchMode.class, str);
    }

    public static PinLockLaunchMode[] values() {
        return (PinLockLaunchMode[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
