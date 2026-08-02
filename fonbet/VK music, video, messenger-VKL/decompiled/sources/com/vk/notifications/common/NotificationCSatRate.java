package com.vk.notifications.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationCSatRate.kt */
/* loaded from: classes4.dex */
public final class NotificationCSatRate {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationCSatRate[] $VALUES;
    public static final NotificationCSatRate No;
    public static final NotificationCSatRate NotSure;
    public static final NotificationCSatRate Star1;
    public static final NotificationCSatRate Star2;
    public static final NotificationCSatRate Star3;
    public static final NotificationCSatRate Star4;
    public static final NotificationCSatRate Star5;
    public static final NotificationCSatRate Yes;

    static {
        NotificationCSatRate notificationCSatRate = new NotificationCSatRate("Star1", 0);
        Star1 = notificationCSatRate;
        NotificationCSatRate notificationCSatRate2 = new NotificationCSatRate("Star2", 1);
        Star2 = notificationCSatRate2;
        NotificationCSatRate notificationCSatRate3 = new NotificationCSatRate("Star3", 2);
        Star3 = notificationCSatRate3;
        NotificationCSatRate notificationCSatRate4 = new NotificationCSatRate("Star4", 3);
        Star4 = notificationCSatRate4;
        NotificationCSatRate notificationCSatRate5 = new NotificationCSatRate("Star5", 4);
        Star5 = notificationCSatRate5;
        NotificationCSatRate notificationCSatRate6 = new NotificationCSatRate("No", 5);
        No = notificationCSatRate6;
        NotificationCSatRate notificationCSatRate7 = new NotificationCSatRate("NotSure", 6);
        NotSure = notificationCSatRate7;
        NotificationCSatRate notificationCSatRate8 = new NotificationCSatRate("Yes", 7);
        Yes = notificationCSatRate8;
        NotificationCSatRate[] notificationCSatRateArr = {notificationCSatRate, notificationCSatRate2, notificationCSatRate3, notificationCSatRate4, notificationCSatRate5, notificationCSatRate6, notificationCSatRate7, notificationCSatRate8};
        $VALUES = notificationCSatRateArr;
        $ENTRIES = new asp(notificationCSatRateArr);
    }

    public NotificationCSatRate() {
        throw null;
    }

    public static NotificationCSatRate valueOf(String str) {
        return (NotificationCSatRate) Enum.valueOf(NotificationCSatRate.class, str);
    }

    public static NotificationCSatRate[] values() {
        return (NotificationCSatRate[]) $VALUES.clone();
    }
}
