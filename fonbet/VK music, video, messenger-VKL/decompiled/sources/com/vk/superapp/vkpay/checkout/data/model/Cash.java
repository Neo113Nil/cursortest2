package com.vk.superapp.vkpay.checkout.data.model;

/* compiled from: PayMethodData.kt */
/* loaded from: classes6.dex */
public final class Cash extends PayMethodData {
    public static final Cash c = new Cash();
    public static final String d = "cash";

    private Cash() {
        super(0);
    }

    @Override // com.vk.superapp.vkpay.checkout.data.model.PayMethodData
    public final String h() {
        return d;
    }
}
