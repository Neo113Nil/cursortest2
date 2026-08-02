package com.vk.video.profile.presentation.models;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StateSubscribeNotification.kt */
/* loaded from: classes6.dex */
public final class StateSubscribeNotification {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ StateSubscribeNotification[] $VALUES;
    public static final StateSubscribeNotification ALL_NOTIFICATIONS;
    public static final StateSubscribeNotification NONE_NOTIFICATIONS;
    public static final StateSubscribeNotification PREFER_NOTIFICATIONS;
    public static final StateSubscribeNotification SUBSCRIBE;
    public static final StateSubscribeNotification UNSUBSCRIBE;

    static {
        StateSubscribeNotification stateSubscribeNotification = new StateSubscribeNotification("SUBSCRIBE", 0);
        SUBSCRIBE = stateSubscribeNotification;
        StateSubscribeNotification stateSubscribeNotification2 = new StateSubscribeNotification("UNSUBSCRIBE", 1);
        UNSUBSCRIBE = stateSubscribeNotification2;
        StateSubscribeNotification stateSubscribeNotification3 = new StateSubscribeNotification("ALL_NOTIFICATIONS", 2);
        ALL_NOTIFICATIONS = stateSubscribeNotification3;
        StateSubscribeNotification stateSubscribeNotification4 = new StateSubscribeNotification("PREFER_NOTIFICATIONS", 3);
        PREFER_NOTIFICATIONS = stateSubscribeNotification4;
        StateSubscribeNotification stateSubscribeNotification5 = new StateSubscribeNotification("NONE_NOTIFICATIONS", 4);
        NONE_NOTIFICATIONS = stateSubscribeNotification5;
        StateSubscribeNotification[] stateSubscribeNotificationArr = {stateSubscribeNotification, stateSubscribeNotification2, stateSubscribeNotification3, stateSubscribeNotification4, stateSubscribeNotification5};
        $VALUES = stateSubscribeNotificationArr;
        $ENTRIES = new asp(stateSubscribeNotificationArr);
    }

    public StateSubscribeNotification() {
        throw null;
    }

    public static StateSubscribeNotification valueOf(String str) {
        return (StateSubscribeNotification) Enum.valueOf(StateSubscribeNotification.class, str);
    }

    public static StateSubscribeNotification[] values() {
        return (StateSubscribeNotification[]) $VALUES.clone();
    }
}
