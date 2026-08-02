package com.vk.queue.sync.utils;

import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InterruptionType.kt */
/* loaded from: classes5.dex */
public final class InterruptionType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ InterruptionType[] $VALUES;
    public static final InterruptionType CUSTOM;
    public static final InterruptionType NORMAL;
    public static final InterruptionType NOT_INTERRUPTED;

    /* compiled from: InterruptionType.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InterruptionType.values().length];
            try {
                iArr[InterruptionType.NOT_INTERRUPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterruptionType.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterruptionType.CUSTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        InterruptionType interruptionType = new InterruptionType("NOT_INTERRUPTED", 0);
        NOT_INTERRUPTED = interruptionType;
        InterruptionType interruptionType2 = new InterruptionType("NORMAL", 1);
        NORMAL = interruptionType2;
        InterruptionType interruptionType3 = new InterruptionType("CUSTOM", 2);
        CUSTOM = interruptionType3;
        InterruptionType[] interruptionTypeArr = {interruptionType, interruptionType2, interruptionType3};
        $VALUES = interruptionTypeArr;
        $ENTRIES = new asp(interruptionTypeArr);
    }

    public InterruptionType() {
        throw null;
    }

    public static InterruptionType valueOf(String str) {
        return (InterruptionType) Enum.valueOf(InterruptionType.class, str);
    }

    public static InterruptionType[] values() {
        return (InterruptionType[]) $VALUES.clone();
    }

    public final boolean h() {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean i() {
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
