package com.vk.superapp.vkpay.checkout.data.model;

import java.io.Serializable;
import java.util.List;
import xsna.e43;
import xsna.epx;

/* compiled from: PayMethodData.kt */
/* loaded from: classes6.dex */
public abstract class PayMethodData implements Serializable, Comparable<PayMethodData> {
    public static final List<Class<? extends PayMethodData>> b = e43.l(Cash.class, VkPay.class, GooglePay.class, Card.class, NoVkPay.class, AddCardMethod.class);

    public /* synthetic */ PayMethodData(int i) {
        this();
    }

    @Override // java.lang.Comparable
    public final int compareTo(PayMethodData payMethodData) {
        Class<?> cls = getClass();
        List<Class<? extends PayMethodData>> list = b;
        return epx.g(list.indexOf(cls), list.indexOf(payMethodData.getClass()));
    }

    public abstract String h();

    private PayMethodData() {
    }
}
