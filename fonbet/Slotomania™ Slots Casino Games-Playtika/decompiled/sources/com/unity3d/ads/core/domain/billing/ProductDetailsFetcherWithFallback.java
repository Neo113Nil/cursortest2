package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductDetailsFetcherWithFallback.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcherWithFallback;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "primaryFetcher", "secondaryFetcher", "(Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "fetchProductDetails", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", InAppPurchaseMetaData.KEY_PRODUCT_ID, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {
    private final ProductDetailsFetcher primaryFetcher;
    private final ProductDetailsFetcher secondaryFetcher;

    public ProductDetailsFetcherWithFallback(ProductDetailsFetcher primaryFetcher, ProductDetailsFetcher secondaryFetcher) {
        Intrinsics.checkNotNullParameter(primaryFetcher, "primaryFetcher");
        Intrinsics.checkNotNullParameter(secondaryFetcher, "secondaryFetcher");
        this.primaryFetcher = primaryFetcher;
        this.secondaryFetcher = secondaryFetcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchProductDetails(String str, Continuation<? super ProductDetailsResult> continuation) {
        ProductDetailsFetcherWithFallback$fetchProductDetails$1 productDetailsFetcherWithFallback$fetchProductDetails$1;
        int i;
        ProductDetailsFetcherWithFallback productDetailsFetcherWithFallback;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (continuation instanceof ProductDetailsFetcherWithFallback$fetchProductDetails$1) {
            productDetailsFetcherWithFallback$fetchProductDetails$1 = (ProductDetailsFetcherWithFallback$fetchProductDetails$1) continuation;
            if ((productDetailsFetcherWithFallback$fetchProductDetails$1.label & Integer.MIN_VALUE) != 0) {
                productDetailsFetcherWithFallback$fetchProductDetails$1.label -= Integer.MIN_VALUE;
                Object obj = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = this;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$1 = str;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 1;
                    obj = productDetailsFetcher.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (obj != coroutine_suspended) {
                        productDetailsFetcherWithFallback = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    productDetailsResult2 = (ProductDetailsResult) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) obj;
                    return !(productDetailsResult3 instanceof ProductDetailsResult.Success) ? productDetailsResult3 : productDetailsResult2;
                }
                str = (String) productDetailsFetcherWithFallback$fetchProductDetails$1.L$1;
                productDetailsFetcherWithFallback = (ProductDetailsFetcherWithFallback) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                ResultKt.throwOnFailure(obj);
                productDetailsResult = (ProductDetailsResult) obj;
                if (!(productDetailsResult instanceof ProductDetailsResult.Success)) {
                    return productDetailsResult;
                }
                if (productDetailsResult instanceof ProductDetailsResult.NotFound) {
                    ProductDetailsFetcher productDetailsFetcher2 = productDetailsFetcherWithFallback.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$1 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 2;
                    Object fetchProductDetails = productDetailsFetcher2.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (fetchProductDetails != coroutine_suspended) {
                        return fetchProductDetails;
                    }
                } else if (productDetailsResult instanceof ProductDetailsResult.Failure) {
                    ProductDetailsFetcher productDetailsFetcher3 = productDetailsFetcherWithFallback.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = productDetailsResult;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$1 = null;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 3;
                    Object fetchProductDetails2 = productDetailsFetcher3.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (fetchProductDetails2 != coroutine_suspended) {
                        obj = fetchProductDetails2;
                        productDetailsResult2 = productDetailsResult;
                        ProductDetailsResult productDetailsResult32 = (ProductDetailsResult) obj;
                        if (!(productDetailsResult32 instanceof ProductDetailsResult.Success)) {
                        }
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
        }
        productDetailsFetcherWithFallback$fetchProductDetails$1 = new ProductDetailsFetcherWithFallback$fetchProductDetails$1(this, continuation);
        Object obj2 = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
        if (i != 0) {
        }
        productDetailsResult = (ProductDetailsResult) obj2;
        if (!(productDetailsResult instanceof ProductDetailsResult.Success)) {
        }
    }
}
