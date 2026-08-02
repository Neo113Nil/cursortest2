package com.vk.im.engine.models.groups;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Group.kt */
/* loaded from: classes2.dex */
public final class WarningNotification {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ WarningNotification[] $VALUES;
    public static final WarningNotification ADULT_CONTENT;
    public static final WarningNotification ANTI_VACCINES;
    public static final a Companion;
    public static final WarningNotification HIV_DENIALISM;
    public static final WarningNotification NONE;
    public static final WarningNotification QUARANTINE_GATHERING;
    private final int value;

    /* compiled from: Group.kt */
    public static final class a {
        public static WarningNotification a(int i) {
            return i != 1 ? i != 3 ? i != 4 ? i != 5 ? WarningNotification.NONE : WarningNotification.ADULT_CONTENT : WarningNotification.HIV_DENIALISM : WarningNotification.QUARANTINE_GATHERING : WarningNotification.ANTI_VACCINES;
        }
    }

    static {
        WarningNotification warningNotification = new WarningNotification("NONE", 0, 0);
        NONE = warningNotification;
        WarningNotification warningNotification2 = new WarningNotification("ANTI_VACCINES", 1, 1);
        ANTI_VACCINES = warningNotification2;
        WarningNotification warningNotification3 = new WarningNotification("QUARANTINE_GATHERING", 2, 3);
        QUARANTINE_GATHERING = warningNotification3;
        WarningNotification warningNotification4 = new WarningNotification("HIV_DENIALISM", 3, 4);
        HIV_DENIALISM = warningNotification4;
        WarningNotification warningNotification5 = new WarningNotification("ADULT_CONTENT", 4, 5);
        ADULT_CONTENT = warningNotification5;
        WarningNotification[] warningNotificationArr = {warningNotification, warningNotification2, warningNotification3, warningNotification4, warningNotification5};
        $VALUES = warningNotificationArr;
        $ENTRIES = new asp(warningNotificationArr);
        Companion = new a();
    }

    public WarningNotification(String str, int i, int i2) {
        this.value = i2;
    }

    public static WarningNotification valueOf(String str) {
        return (WarningNotification) Enum.valueOf(WarningNotification.class, str);
    }

    public static WarningNotification[] values() {
        return (WarningNotification[]) $VALUES.clone();
    }

    public final int h() {
        return this.value;
    }
}
