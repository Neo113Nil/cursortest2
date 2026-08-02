package com.unity3d.ads.core.domain.billing;

import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.a70;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import defpackage.zzl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcherWithFallback;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "primaryFetcher", "secondaryFetcher", "<init>", "(Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;)V", "", InAppPurchaseMetaData.KEY_PRODUCT_ID, "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "fetchProductDetails", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductDetailsFetcherWithFallback implements ProductDetailsFetcher {

    @NotNull
    private final ProductDetailsFetcher primaryFetcher;

    @NotNull
    private final ProductDetailsFetcher secondaryFetcher;

    public ProductDetailsFetcherWithFallback(@NotNull ProductDetailsFetcher productDetailsFetcher, @NotNull ProductDetailsFetcher productDetailsFetcher2) {
        productDetailsFetcher.getClass();
        productDetailsFetcher2.getClass();
        this.primaryFetcher = productDetailsFetcher;
        this.secondaryFetcher = productDetailsFetcher2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchProductDetails(@NotNull String str, @NotNull rq3<? super ProductDetailsResult> rq3Var) {
        ProductDetailsFetcherWithFallback$fetchProductDetails$1 productDetailsFetcherWithFallback$fetchProductDetails$1;
        int i;
        ProductDetailsResult productDetailsResult;
        ProductDetailsResult productDetailsResult2;
        if (rq3Var instanceof ProductDetailsFetcherWithFallback$fetchProductDetails$1) {
            productDetailsFetcherWithFallback$fetchProductDetails$1 = (ProductDetailsFetcherWithFallback$fetchProductDetails$1) rq3Var;
            int i2 = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productDetailsFetcherWithFallback$fetchProductDetails$1.label = i2 - Integer.MIN_VALUE;
                Object obj = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
                lu3 lu3Var = lu3.a;
                i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    ProductDetailsFetcher productDetailsFetcher = this.primaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = str;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 1;
                    obj = productDetailsFetcher.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return obj;
                        }
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        productDetailsResult2 = (ProductDetailsResult) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                        y6a.M(obj);
                        ProductDetailsResult productDetailsResult3 = (ProductDetailsResult) obj;
                        return !(productDetailsResult3 instanceof ProductDetailsResult.Success) ? productDetailsResult3 : productDetailsResult2;
                    }
                    str = (String) productDetailsFetcherWithFallback$fetchProductDetails$1.L$0;
                    y6a.M(obj);
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
                    if (fetchProductDetails != lu3Var) {
                        return fetchProductDetails;
                    }
                } else {
                    if (!(productDetailsResult instanceof ProductDetailsResult.Failure)) {
                        zzl.b();
                        return null;
                    }
                    ProductDetailsFetcher productDetailsFetcher3 = this.secondaryFetcher;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.L$0 = productDetailsResult;
                    productDetailsFetcherWithFallback$fetchProductDetails$1.label = 3;
                    Object fetchProductDetails2 = productDetailsFetcher3.fetchProductDetails(str, productDetailsFetcherWithFallback$fetchProductDetails$1);
                    if (fetchProductDetails2 != lu3Var) {
                        obj = fetchProductDetails2;
                        productDetailsResult2 = productDetailsResult;
                        ProductDetailsResult productDetailsResult32 = (ProductDetailsResult) obj;
                        if (!(productDetailsResult32 instanceof ProductDetailsResult.Success)) {
                        }
                    }
                }
                return lu3Var;
            }
        }
        productDetailsFetcherWithFallback$fetchProductDetails$1 = new ProductDetailsFetcherWithFallback$fetchProductDetails$1(this, rq3Var);
        Object obj2 = productDetailsFetcherWithFallback$fetchProductDetails$1.result;
        lu3 lu3Var2 = lu3.a;
        i = productDetailsFetcherWithFallback$fetchProductDetails$1.label;
        if (i != 0) {
        }
        productDetailsResult = (ProductDetailsResult) obj2;
        if (!(productDetailsResult instanceof ProductDetailsResult.Success)) {
        }
    }
}
