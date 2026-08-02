package com.vk.profile.community.subscription.api.tracker;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunitySubscriptionTracker.kt */
/* loaded from: classes5.dex */
public final class SubscriptionEvent {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubscriptionEvent[] $VALUES;
    public static final SubscriptionEvent JOIN_GROUP_OUT;
    public static final SubscriptionEvent LEAVE_GROUP_OUT;

    static {
        SubscriptionEvent subscriptionEvent = new SubscriptionEvent("JOIN_GROUP_OUT", 0);
        JOIN_GROUP_OUT = subscriptionEvent;
        SubscriptionEvent subscriptionEvent2 = new SubscriptionEvent("LEAVE_GROUP_OUT", 1);
        LEAVE_GROUP_OUT = subscriptionEvent2;
        SubscriptionEvent[] subscriptionEventArr = {subscriptionEvent, subscriptionEvent2};
        $VALUES = subscriptionEventArr;
        $ENTRIES = new asp(subscriptionEventArr);
    }

    public SubscriptionEvent() {
        throw null;
    }

    public static SubscriptionEvent valueOf(String str) {
        return (SubscriptionEvent) Enum.valueOf(SubscriptionEvent.class, str);
    }

    public static SubscriptionEvent[] values() {
        return (SubscriptionEvent[]) $VALUES.clone();
    }
}
