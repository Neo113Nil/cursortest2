package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billing.internal.config.BillingConfig;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final int f11406a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11407b;

    public A(int i5, int i10) {
        this.f11406a = i5;
        this.f11407b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceSideBillingConfig(sendFrequencySeconds=");
        sb2.append(this.f11406a);
        sb2.append(", firstCollectingInappMaxAgeSeconds=");
        return d9.e.i(sb2, this.f11407b, ')');
    }

    public A(BillingConfig billingConfig) {
        this(billingConfig.getSendFrequencySeconds(), billingConfig.getFirstCollectingInappMaxAgeSeconds());
    }
}
