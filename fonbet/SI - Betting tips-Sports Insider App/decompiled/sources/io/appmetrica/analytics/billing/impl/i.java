package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c fromModel(@NotNull BillingInfo billingInfo) {
        c cVar = new c();
        int i5 = h.f11425a[billingInfo.type.ordinal()];
        cVar.f11414a = i5 != 1 ? i5 != 2 ? 1 : 3 : 2;
        cVar.f11415b = billingInfo.productId;
        cVar.f11416c = billingInfo.purchaseToken;
        cVar.f11417d = billingInfo.purchaseTime;
        cVar.f11418e = billingInfo.sendTime;
        return cVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final BillingInfo toModel(@NotNull c cVar) {
        ProductType productType;
        int i5 = cVar.f11414a;
        if (i5 == 2) {
            productType = ProductType.INAPP;
        } else if (i5 != 3) {
            productType = ProductType.UNKNOWN;
        } else {
            productType = ProductType.SUBS;
        }
        return new BillingInfo(productType, cVar.f11415b, cVar.f11416c, cVar.f11417d, cVar.f11418e);
    }
}
