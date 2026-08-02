package com.vk.ecomm.reviews.impl.pinnedreview.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinReviewSubscriptionDetails.kt */
/* loaded from: classes18.dex */
public final class SubscriptionAction {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubscriptionAction[] $VALUES;
    public static final SubscriptionAction None;
    public static final SubscriptionAction Resume;
    public static final SubscriptionAction Suspend;

    static {
        SubscriptionAction subscriptionAction = new SubscriptionAction("Resume", 0);
        Resume = subscriptionAction;
        SubscriptionAction subscriptionAction2 = new SubscriptionAction("Suspend", 1);
        Suspend = subscriptionAction2;
        SubscriptionAction subscriptionAction3 = new SubscriptionAction("None", 2);
        None = subscriptionAction3;
        SubscriptionAction[] subscriptionActionArr = {subscriptionAction, subscriptionAction2, subscriptionAction3};
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
