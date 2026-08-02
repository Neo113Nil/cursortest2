package com.vk.push.common.messaging;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationResourceType.kt */
/* loaded from: classes5.dex */
public final class NotificationResourceType {
    private static final /* synthetic */ NotificationResourceType[] $VALUES;
    public static final NotificationResourceType DEFAULT_SDK;
    public static final NotificationResourceType MANIFEST;
    public static final NotificationResourceType PAYLOAD;
    public static final NotificationResourceType STUB;

    static {
        NotificationResourceType notificationResourceType = new NotificationResourceType("MANIFEST", 0);
        MANIFEST = notificationResourceType;
        NotificationResourceType notificationResourceType2 = new NotificationResourceType("DEFAULT_SDK", 1);
        DEFAULT_SDK = notificationResourceType2;
        NotificationResourceType notificationResourceType3 = new NotificationResourceType("PAYLOAD", 2);
        PAYLOAD = notificationResourceType3;
        NotificationResourceType notificationResourceType4 = new NotificationResourceType("STUB", 3);
        STUB = notificationResourceType4;
        $VALUES = new NotificationResourceType[]{notificationResourceType, notificationResourceType2, notificationResourceType3, notificationResourceType4};
    }

    public NotificationResourceType() {
        throw null;
    }

    public static NotificationResourceType valueOf(String str) {
        return (NotificationResourceType) Enum.valueOf(NotificationResourceType.class, str);
    }

    public static NotificationResourceType[] values() {
        return (NotificationResourceType[]) $VALUES.clone();
    }
}
