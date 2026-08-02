package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.lq9;
import xsna.s7s0;
import xsna.spj;

/* compiled from: CommonProductDetailsFetcher.kt */
/* loaded from: classes14.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {
    private final BillingClientAdapter billingClientAdapter;
    private final String productType;

    public CommonProductDetailsFetcher(BillingClientAdapter billingClientAdapter, String str) {
        this.billingClientAdapter = billingClientAdapter;
        this.productType = str;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    public Object fetchProductDetails(String str, spj<? super ProductDetailsResult> spjVar) {
        final lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(BillingResultBridge billingResultBridge, String str2) {
                if (str2 != null && billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    lq9Var.resumeWith(new ProductDetailsResult.Success(str2));
                } else if (billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    lq9Var.resumeWith(ProductDetailsResult.NotFound.INSTANCE);
                } else {
                    lq9Var.resumeWith(new ProductDetailsResult.Failure(billingResultBridge));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
}
