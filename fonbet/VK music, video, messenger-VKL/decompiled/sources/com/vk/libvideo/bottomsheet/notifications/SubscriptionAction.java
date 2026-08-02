package com.vk.libvideo.bottomsheet.notifications;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NotificationsSubscriptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class SubscriptionAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubscriptionAction[] $VALUES;
    public static final SubscriptionAction DISABLED_NOTIFICATIONS;
    public static final SubscriptionAction FULLY_ENABLED_NOTIFICATIONS;
    public static final SubscriptionAction HIDE_AUTHOR;
    public static final SubscriptionAction NOTIFICATIONS_PERMISSION;
    public static final SubscriptionAction PREFERRED_VIDEOS_NOTIFICATIONS;
    public static final SubscriptionAction UNSUBSCRIBE_AUTHOR;

    static {
        SubscriptionAction subscriptionAction = new SubscriptionAction("FULLY_ENABLED_NOTIFICATIONS", 0);
        FULLY_ENABLED_NOTIFICATIONS = subscriptionAction;
        SubscriptionAction subscriptionAction2 = new SubscriptionAction("PREFERRED_VIDEOS_NOTIFICATIONS", 1);
        PREFERRED_VIDEOS_NOTIFICATIONS = subscriptionAction2;
        SubscriptionAction subscriptionAction3 = new SubscriptionAction("DISABLED_NOTIFICATIONS", 2);
        DISABLED_NOTIFICATIONS = subscriptionAction3;
        SubscriptionAction subscriptionAction4 = new SubscriptionAction("NOTIFICATIONS_PERMISSION", 3);
        NOTIFICATIONS_PERMISSION = subscriptionAction4;
        SubscriptionAction subscriptionAction5 = new SubscriptionAction("UNSUBSCRIBE_AUTHOR", 4);
        UNSUBSCRIBE_AUTHOR = subscriptionAction5;
        SubscriptionAction subscriptionAction6 = new SubscriptionAction("HIDE_AUTHOR", 5);
        HIDE_AUTHOR = subscriptionAction6;
        SubscriptionAction[] subscriptionActionArr = {subscriptionAction, subscriptionAction2, subscriptionAction3, subscriptionAction4, subscriptionAction5, subscriptionAction6};
        $VALUES = subscriptionActionArr;
        $ENTRIES = new asp(subscriptionActionArr);
    }

    public SubscriptionAction() {
        throw null;
    }

    public static SubscriptionAction valueOf(String str) {
        return (SubscriptionAction) Enum.valueOf(SubscriptionAction.class, str);
    }

    public static SubscriptionAction[] values() {
        return (SubscriptionAction[]) $VALUES.clone();
    }
}
