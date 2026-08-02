package com.vk.music.ui.subscription;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuyMusicSubscriptionComposeButton.kt */
/* loaded from: classes3.dex */
public final class SubscriptionContext {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SubscriptionContext[] $VALUES;
    public static final SubscriptionContext Paywall;
    public static final SubscriptionContext Screen;

    static {
        SubscriptionContext subscriptionContext = new SubscriptionContext("Paywall", 0);
        Paywall = subscriptionContext;
        SubscriptionContext subscriptionContext2 = new SubscriptionContext("Screen", 1);
        Screen = subscriptionContext2;
        SubscriptionContext[] subscriptionContextArr = {subscriptionContext, subscriptionContext2};
        $VALUES = subscriptionContextArr;
        $ENTRIES = new asp(subscriptionContextArr);
    }

    public SubscriptionContext() {
        throw null;
    }

    public static SubscriptionContext valueOf(String str) {
        return (SubscriptionContext) Enum.valueOf(SubscriptionContext.class, str);
    }

    public static SubscriptionContext[] values() {
        return (SubscriptionContext[]) $VALUES.clone();
    }
}
