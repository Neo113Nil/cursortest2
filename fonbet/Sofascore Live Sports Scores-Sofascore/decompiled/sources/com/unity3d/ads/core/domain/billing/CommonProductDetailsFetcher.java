package com.unity3d.ads.core.domain.billing;

import com.ironsource.U3;
import com.unity3d.ads.core.domain.billing.ProductDetailsResult;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import defpackage.kj2;
import defpackage.lj2;
import defpackage.lu3;
import defpackage.p2g;
import defpackage.rq3;
import defpackage.w2g;
import defpackage.z9a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/billing/CommonProductDetailsFetcher;", "Lcom/unity3d/ads/core/domain/billing/ProductDetailsFetcher;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientAdapter", "", U3.i.m, "<init>", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;Ljava/lang/String;)V", InAppPurchaseMetaData.KEY_PRODUCT_ID, "Lcom/unity3d/ads/core/domain/billing/ProductDetailsResult;", "fetchProductDetails", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "Ljava/lang/String;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonProductDetailsFetcher implements ProductDetailsFetcher {

    @Nullable
    private final BillingClientAdapter billingClientAdapter;

    @NotNull
    private final String productType;

    public CommonProductDetailsFetcher(@Nullable BillingClientAdapter billingClientAdapter, @NotNull String str) {
        str.getClass();
        this.billingClientAdapter = billingClientAdapter;
        this.productType = str;
    }

    @Override // com.unity3d.ads.core.domain.billing.ProductDetailsFetcher
    @Nullable
    public Object fetchProductDetails(@NotNull String str, @NotNull rq3<? super ProductDetailsResult> rq3Var) {
        final lj2 lj2Var = new lj2(1, z9a.b(rq3Var));
        lj2Var.t();
        ProductDetailsListener productDetailsListener = new ProductDetailsListener() { // from class: com.unity3d.ads.core.domain.billing.CommonProductDetailsFetcher$fetchProductDetails$2$listener$1
            @Override // com.unity3d.services.store.gpbl.listeners.ProductDetailsListener
            public final void onProductDetailsResponse(BillingResultBridge billingResultBridge, String str2) {
                billingResultBridge.getClass();
                if (str2 != null && billingResultBridge.getResponseCode() == BillingResultResponseCode.OK) {
                    kj2 kj2Var = kj2.this;
                    p2g p2gVar = w2g.b;
                    kj2Var.resumeWith(new ProductDetailsResult.Success(str2));
                    return;
                }
                BillingResultResponseCode responseCode = billingResultBridge.getResponseCode();
                BillingResultResponseCode billingResultResponseCode = BillingResultResponseCode.OK;
                kj2 kj2Var2 = kj2.this;
                if (responseCode == billingResultResponseCode) {
                    p2g p2gVar2 = w2g.b;
                    kj2Var2.resumeWith(ProductDetailsResult.NotFound.INSTANCE);
                } else {
                    p2g p2gVar3 = w2g.b;
                    kj2Var2.resumeWith(new ProductDetailsResult.Failure(billingResultBridge));
                }
            }
        };
        BillingClientAdapter billingClientAdapter = this.billingClientAdapter;
        if (billingClientAdapter != null) {
            billingClientAdapter.queryProductDetailsAsync(str, this.productType, productDetailsListener);
        }
        Object q = lj2Var.q();
        lu3 lu3Var = lu3.a;
        return q;
    }
}
