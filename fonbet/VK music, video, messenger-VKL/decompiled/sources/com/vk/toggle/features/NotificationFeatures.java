package com.vk.toggle.features;

import com.vk.toggle.b;
import xsna.asp;
import xsna.gd6;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationFeatures.kt */
/* loaded from: classes11.dex */
public final class NotificationFeatures implements gd6 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationFeatures[] $VALUES;
    public static final NotificationFeatures NOTIFICATION_DYNAMIC_PUSH_BANNER;
    public static final NotificationFeatures NOTIFICATION_PUSH_PIPELINE_ANALYTIC;
    public static final NotificationFeatures NOTIFICATION_PUSH_RECEIVING_POST;
    public static final NotificationFeatures NOTIFICATION_RELOAD_FIX;
    private final String key;

    static {
        NotificationFeatures notificationFeatures = new NotificationFeatures("NOTIFICATION_DYNAMIC_PUSH_BANNER", 0, "notif_dynamic_push_banner");
        NOTIFICATION_DYNAMIC_PUSH_BANNER = notificationFeatures;
        NotificationFeatures notificationFeatures2 = new NotificationFeatures("NOTIFICATION_RELOAD_FIX", 1, "notif_reload_fix");
        NOTIFICATION_RELOAD_FIX = notificationFeatures2;
        NotificationFeatures notificationFeatures3 = new NotificationFeatures("NOTIFICATION_PUSH_RECEIVING_POST", 2, "notif_push_receiving_post");
        NOTIFICATION_PUSH_RECEIVING_POST = notificationFeatures3;
        NotificationFeatures notificationFeatures4 = new NotificationFeatures("NOTIFICATION_PUSH_PIPELINE_ANALYTIC", 3, "notif_push_pipeline_analytic");
        NOTIFICATION_PUSH_PIPELINE_ANALYTIC = notificationFeatures4;
        NotificationFeatures[] notificationFeaturesArr = {notificationFeatures, notificationFeatures2, notificationFeatures3, notificationFeatures4};
        $VALUES = notificationFeaturesArr;
        $ENTRIES = new asp(notificationFeaturesArr);
    }

    public NotificationFeatures(String str, int i, String str2) {
        this.key = str2;
    }

    public static zrp<NotificationFeatures> i() {
        return $ENTRIES;
    }

    public static NotificationFeatures valueOf(String str) {
        return (NotificationFeatures) Enum.valueOf(NotificationFeatures.class, str);
    }

    public static NotificationFeatures[] values() {
        return (NotificationFeatures[]) $VALUES.clone();
    }

    @Override // com.vk.toggle.b.a
    public final String getKey() {
        return this.key;
    }

    @Override // xsna.gd6, com.vk.toggle.b.a
    public final boolean h() {
        return b.A.a(this);
    }
}
