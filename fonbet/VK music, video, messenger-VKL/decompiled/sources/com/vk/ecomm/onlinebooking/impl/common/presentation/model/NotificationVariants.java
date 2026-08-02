package com.vk.ecomm.onlinebooking.impl.common.presentation.model;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationVariants.kt */
/* loaded from: classes18.dex */
public final class NotificationVariants {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationVariants[] $VALUES;
    public static final NotificationVariants HOURS_1;
    public static final NotificationVariants HOURS_2;
    public static final NotificationVariants HOURS_24;
    public static final NotificationVariants HOURS_3;
    public static final NotificationVariants HOURS_48;
    public static final NotificationVariants NEVER;
    private final int displayResId;
    private final int hours;

    static {
        NotificationVariants notificationVariants = new NotificationVariants("HOURS_1", 0, 1, R.string.booking_notification_1_hour);
        HOURS_1 = notificationVariants;
        NotificationVariants notificationVariants2 = new NotificationVariants("HOURS_2", 1, 2, R.string.booking_notification_2_hours);
        HOURS_2 = notificationVariants2;
        NotificationVariants notificationVariants3 = new NotificationVariants("HOURS_3", 2, 3, R.string.booking_notification_3_hours);
        HOURS_3 = notificationVariants3;
        NotificationVariants notificationVariants4 = new NotificationVariants("HOURS_24", 3, 24, R.string.booking_notification_24_hours);
        HOURS_24 = notificationVariants4;
        NotificationVariants notificationVariants5 = new NotificationVariants("HOURS_48", 4, 48, R.string.booking_notification_48_hours);
        HOURS_48 = notificationVariants5;
        NotificationVariants notificationVariants6 = new NotificationVariants("NEVER", 5, 0, R.string.booking_notification_never);
        NEVER = notificationVariants6;
        NotificationVariants[] notificationVariantsArr = {notificationVariants, notificationVariants2, notificationVariants3, notificationVariants4, notificationVariants5, notificationVariants6};
        $VALUES = notificationVariantsArr;
        $ENTRIES = new asp(notificationVariantsArr);
    }

    public NotificationVariants(String str, int i, int i2, int i3) {
        this.hours = i2;
        this.displayResId = i3;
    }

    public static zrp<NotificationVariants> i() {
        return $ENTRIES;
    }

    public static NotificationVariants valueOf(String str) {
        return (NotificationVariants) Enum.valueOf(NotificationVariants.class, str);
    }

    public static NotificationVariants[] values() {
        return (NotificationVariants[]) $VALUES.clone();
    }

    public final int h() {
        return this.displayResId;
    }

    public final int j() {
        return this.hours;
    }
}
