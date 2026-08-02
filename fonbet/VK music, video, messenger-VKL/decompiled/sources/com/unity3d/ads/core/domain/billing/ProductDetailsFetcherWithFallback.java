package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.spj;

/* compiled from: ProductDetailsFetcherWithFallback.kt */
/* loaded from: classes14.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher productDetailsFetcher, ProductDetailsFetcher productDetailsFetcher2) {
        this.primaryFetcher = productDetailsFetcher;
        this.secondaryFetcher = productDetailsFetcher2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0052, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchProductDetails(String str, spj<? super ProductDetailsResult> spjVar) {
        ProductDetailsFetcherWithFallback$fetchProductDetails$1 productDetailsFetcherWithFallback$fetchProductDetails$1;
        int i;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (spjVar instanceof ProductDetailsFetcherWithFallback$fetchProductDetails$1) {
            productDetailsFetcherWithFallback$fetchProductDetails$1 = (ProductDetailsFetcherWithFallback$fetchProductDetails$1) spjVar;
            int i2 = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productDetailsFetcherWithFallback$fetchProductDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
                if (i != 0) {
                    a.a(obj);
                    ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = str;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 1;
                    obj = productDetailsFetcher.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            a.a(obj);
                            return obj;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        productDetailsResult2 = (ProductDetailsResult) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                        a.a(obj);
                        ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) obj;
                        return !(productDetailsResult3 instanceof ProductDetailsResult.Success) ? productDetailsResult3 : productDetailsResult2;
                    }
                    str = (String) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                    a.a(obj);
                }
                productDetailsResult = (ProductDetailsResult) obj;
                if (!(productDetailsResult instanceof ProductDetailsResult.Success)) {
                    return productDetailsResult;
                }
                if (productDetailsResult instanceof ProductDetailsResult.NotFound) {
                    ProductDetailsFetcher productDetailsFetcher2 = this.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 2;
                    Object fetchProductDetails = productDetailsFetcher2.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (fetchProductDetails != coroutineSingletons) {
                        return fetchProductDetails;
                    }
                } else {
                    if (!(productDetailsResult instanceof ProductDetailsResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProductDetailsFetcher productDetailsFetcher3 = this.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = productDetailsResult;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 3;
                    Object fetchProductDetails2 = productDetailsFetcher3.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (fetchProductDetails2 != coroutineSingletons) {
                        obj = fetchProductDetails2;
                        productDetailsResult2 = productDetailsResult;
                        ProductDetailsResult productDetailsResult32 = (ProductDetailsResult) obj;
                        if (!(productDetailsResult32 instanceof ProductDetailsResult.Success)) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        productDetailsFetcherWithFallback$fetchProductDetails$1 = new ProductDetailsFetcherWithFallback$fetchProductDetails$1(this, spjVar);
        Object obj2 = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
        if (i != 0) {
        }
        productDetailsResult = (ProductDetailsResult) obj2;
        if (!(productDetailsResult instanceof ProductDetailsResult.Success)) {
        }
    }
}
