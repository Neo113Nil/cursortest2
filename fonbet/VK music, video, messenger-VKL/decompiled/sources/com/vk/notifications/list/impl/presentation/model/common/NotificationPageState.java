package com.vk.notifications.list.impl.presentation.model.common;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationPageState.kt */
/* loaded from: classes4.dex */
public final class NotificationPageState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ NotificationPageState[] $VALUES;
    public static final NotificationPageState CONTENT;
    public static final NotificationPageState ERROR;
    public static final NotificationPageState LOADING;
    public static final NotificationPageState REFRESHING;

    static {
        NotificationPageState notificationPageState = new NotificationPageState("LOADING", 0);
        LOADING = notificationPageState;
        NotificationPageState notificationPageState2 = new NotificationPageState("REFRESHING", 1);
        REFRESHING = notificationPageState2;
        NotificationPageState notificationPageState3 = new NotificationPageState("CONTENT", 2);
        CONTENT = notificationPageState3;
        NotificationPageState notificationPageState4 = new NotificationPageState("ERROR", 3);
        ERROR = notificationPageState4;
        NotificationPageState[] notificationPageStateArr = {notificationPageState, notificationPageState2, notificationPageState3, notificationPageState4};
        $VALUES = notificationPageStateArr;
        $ENTRIES = new asp(notificationPageStateArr);
    }

    public NotificationPageState() {
        throw null;
    }

    public static NotificationPageState valueOf(String str) {
        return (NotificationPageState) Enum.valueOf(NotificationPageState.class, str);
    }

    public static NotificationPageState[] values() {
        return (NotificationPageState[]) $VALUES.clone();
    }
}
