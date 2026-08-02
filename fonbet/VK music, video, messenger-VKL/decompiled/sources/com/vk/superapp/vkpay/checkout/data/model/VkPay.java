package com.vk.superapp.vkpay.checkout.data.model;

/* compiled from: PayMethodData.kt */
/* loaded from: classes6.dex */
public final class VkPay extends PayMethodData {
    private final int balance;
    private final int bonusBalance;
    private final boolean bonusModeSpend;
    private final int brokerBalance;
    private final String statName;

    public VkPay(int i, int i2, boolean z, int i3) {
        super(0);
        this.balance = i;
        this.bonusBalance = i2;
        this.bonusModeSpend = z;
        this.brokerBalance = i3;
        this.statName = "vkpay";
    }

    @Override // com.vk.superapp.vkpay.checkout.data.model.PayMethodData
    public final String h() {
        return this.statName;
    }

    public final int i() {
        return this.balance;
    }
}
