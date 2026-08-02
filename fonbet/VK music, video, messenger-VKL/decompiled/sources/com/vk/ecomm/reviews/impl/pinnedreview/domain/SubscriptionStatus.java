package com.vk.ecomm.reviews.impl.pinnedreview.domain;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PinReviewSubscriptionDetails.kt */
/* loaded from: classes18.dex */
public final class SubscriptionStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubscriptionStatus[] $VALUES;
    public static final SubscriptionStatus Active;
    public static final SubscriptionStatus Canceled;
    public static final SubscriptionStatus None;
    public static final SubscriptionStatus Suspended;

    static {
        SubscriptionStatus subscriptionStatus = new SubscriptionStatus("Active", 0);
        Active = subscriptionStatus;
        SubscriptionStatus subscriptionStatus2 = new SubscriptionStatus("Suspended", 1);
        Suspended = subscriptionStatus2;
        SubscriptionStatus subscriptionStatus3 = new SubscriptionStatus("Canceled", 2);
        Canceled = subscriptionStatus3;
        SubscriptionStatus subscriptionStatus4 = new SubscriptionStatus("None", 3);
        None = subscriptionStatus4;
        SubscriptionStatus[] subscriptionStatusArr = {subscriptionStatus, subscriptionStatus2, subscriptionStatus3, subscriptionStatus4};
        $VALUES = subscriptionStatusArr;
        $ENTRIES = new asp(subscriptionStatusArr);
    }

    public SubscriptionStatus() {
        throw null;
    }

    public static SubscriptionStatus valueOf(String str) {
        return (SubscriptionStatus) Enum.valueOf(SubscriptionStatus.class, str);
    }

    public static SubscriptionStatus[] values() {
        return (SubscriptionStatus[]) $VALUES.clone();
    }
}
