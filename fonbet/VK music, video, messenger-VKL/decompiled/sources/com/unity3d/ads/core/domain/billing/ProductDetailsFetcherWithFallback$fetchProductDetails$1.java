package com.unity3d.ads.core.domain.billing;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: ProductDetailsFetcherWithFallback.kt */
@b6l(c = "com.unity3d.ads.core.domain.billing.ProductDetailsFetcherWithFallback", f = "ProductDetailsFetcherWithFallback.kt", l = {16, 20, 24}, m = "fetchProductDetails")
/* loaded from: classes14.dex */
public final class ProductDetailsFetcherWithFallback$fetchProductDetails$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ProductDetailsFetcherWithFallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsFetcherWithFallback$fetchProductDetails$1(ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback, spj<? super ProductDetailsFetcherWithFallback$fetchProductDetails$1> spjVar) {
        super(spjVar);
        this.this$0 = productDetailsFetcherWithFallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchProductDetails(null, this);
    }
}
