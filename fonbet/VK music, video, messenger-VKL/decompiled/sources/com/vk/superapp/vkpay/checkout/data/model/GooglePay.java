package com.vk.superapp.vkpay.checkout.data.model;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;

/* compiled from: PayMethodData.kt */
/* loaded from: classes6.dex */
public final class GooglePay extends PayMethodData {
    public static final GooglePay c = new GooglePay();
    public static final String d = AndroidStaticDeviceInfoDataSource.STORE_GOOGLE;

    private GooglePay() {
        super(0);
    }

    @Override // com.vk.superapp.vkpay.checkout.data.model.PayMethodData
    public final String h() {
        return d;
    }
}
