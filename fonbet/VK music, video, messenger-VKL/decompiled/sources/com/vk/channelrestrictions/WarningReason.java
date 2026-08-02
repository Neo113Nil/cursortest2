package com.vk.channelrestrictions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WarningReason.kt */
/* loaded from: classes16.dex */
public final class WarningReason {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WarningReason[] $VALUES;
    public static final WarningReason ADULT_CONTENT;
    public static final WarningReason ANTI_VACCINES;
    public static final a Companion;
    public static final WarningReason HIV_DENIALISM;
    public static final WarningReason NONE;
    public static final WarningReason QUARANTINE_GATHERING;
    private final int value;

    /* compiled from: WarningReason.kt */
    public static final class a {
        public static WarningReason a(int i) {
            return i != 1 ? i != 3 ? i != 4 ? i != 5 ? WarningReason.NONE : WarningReason.ADULT_CONTENT : WarningReason.HIV_DENIALISM : WarningReason.QUARANTINE_GATHERING : WarningReason.ANTI_VACCINES;
        }
    }

    static {
        WarningReason warningReason = new WarningReason("NONE", 0, 0);
        NONE = warningReason;
        WarningReason warningReason2 = new WarningReason("ANTI_VACCINES", 1, 1);
        ANTI_VACCINES = warningReason2;
        WarningReason warningReason3 = new WarningReason("QUARANTINE_GATHERING", 2, 3);
        QUARANTINE_GATHERING = warningReason3;
        WarningReason warningReason4 = new WarningReason("HIV_DENIALISM", 3, 4);
        HIV_DENIALISM = warningReason4;
        WarningReason warningReason5 = new WarningReason("ADULT_CONTENT", 4, 5);
        ADULT_CONTENT = warningReason5;
        WarningReason[] warningReasonArr = {warningReason, warningReason2, warningReason3, warningReason4, warningReason5};
        $VALUES = warningReasonArr;
        $ENTRIES = new asp(warningReasonArr);
        Companion = new a();
    }

    public WarningReason(String str, int i, int i2) {
        this.value = i2;
    }

    public static WarningReason valueOf(String str) {
        return (WarningReason) Enum.valueOf(WarningReason.class, str);
    }

    public static WarningReason[] values() {
        return (WarningReason[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
