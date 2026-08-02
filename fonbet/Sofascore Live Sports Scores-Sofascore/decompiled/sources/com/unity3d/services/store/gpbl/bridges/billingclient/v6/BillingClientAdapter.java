package com.unity3d.services.store.gpbl.bridges.billingclient.v6;

import com.ironsource.U3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.listeners.BillingClientStateListener;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.ProductDetailsListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.proxies.BillingClientStateListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchaseUpdatedListenerProxy;
import com.unity3d.services.store.gpbl.proxies.PurchasesResponseListenerProxy;
import com.unity3d.services.store.gpbl.proxies.SkuDetailsResponseListenerProxy;
import defpackage.f1d;
import defpackage.fdi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J \u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientAdapter;", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/BillingClientAdapter;", "billingClientBuilderBridge", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;", "detectedVersion", "", "<init>", "(Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBuilderBridge;I)V", "billingClient", "Lcom/unity3d/services/store/gpbl/bridges/billingclient/v6/BillingClientBridge;", "initialize", "", "billingInitializationListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingInitializationListener;", "startConnection", "billingClientStateListener", "Lcom/unity3d/services/store/gpbl/listeners/BillingClientStateListener;", "isFeatureSupported", "Lcom/unity3d/services/store/gpbl/BillingResultResponseCode;", "purchaseType", "", "isReady", "", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PURCHASES_ASYNC_METHOD, "purchasesResponseListener", "Lcom/unity3d/services/store/gpbl/listeners/PurchasesResponseListener;", com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.QUERY_PRODUCT_DETAILS_ASYNC_METHOD, InAppPurchaseMetaData.KEY_PRODUCT_ID, U3.i.m, "listener", "Lcom/unity3d/services/store/gpbl/listeners/ProductDetailsListener;", "getAdapterVersion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingClientAdapter extends com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter {
    private BillingClientBridge billingClient;

    @NotNull
    private final BillingClientBuilderBridge billingClientBuilderBridge;
    private final int detectedVersion;

    public BillingClientAdapter(@NotNull BillingClientBuilderBridge billingClientBuilderBridge, int i) {
        billingClientBuilderBridge.getClass();
        this.billingClientBuilderBridge = billingClientBuilderBridge;
        this.detectedVersion = i;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    @NotNull
    public String getAdapterVersion() {
        return String.valueOf(this.detectedVersion);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void initialize(@NotNull BillingInitializationListener billingInitializationListener) {
        billingInitializationListener.getClass();
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        this.billingClientBuilderBridge.setListener(new PurchaseUpdatedListenerProxy(billingInitializationListener));
        this.billingClientBuilderBridge.enablePendingPurchases();
        BillingClientBridgeCommon build = this.billingClientBuilderBridge.build();
        build.getClass();
        this.billingClient = (BillingClientBridge) build;
        startConnection(billingInitializationListener);
        f1d f1dVar = get_isInitialized();
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = (fdi) f1dVar;
        fdiVar.getClass();
        fdiVar.m(null, bool);
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    @Nullable
    public BillingResultResponseCode isFeatureSupported(@Nullable String purchaseType) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            return billingClientBridge.isFeatureSupported(purchaseType);
        }
        Intrinsics.i("billingClient");
        throw null;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public boolean isReady() {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            return billingClientBridge.isReady();
        }
        Intrinsics.i("billingClient");
        throw null;
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryProductDetailsAsync(@NotNull String productId, @NotNull String productType, @NotNull final ProductDetailsListener listener) {
        productId.getClass();
        productType.getClass();
        listener.getClass();
        SkuDetailsParamsBridge build = SkuDetailsParamsBridge.newBuilder().setSkuList(a.c(productId)).setType(productType).build();
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.querySkuDetailsAsync(build, new SkuDetailsResponseListenerProxy(new SkuDetailsResponseListener() { // from class: com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter$queryProductDetailsAsync$1
                @Override // com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener
                public void onSkuDetailsUpdated(BillingResultBridge billingResult, List<? extends SkuDetailsBridge> skuDetailsList) {
                    billingResult.getClass();
                    if (skuDetailsList == null || skuDetailsList.isEmpty()) {
                        ProductDetailsListener.this.onProductDetailsResponse(billingResult, null);
                        return;
                    }
                    ProductDetailsListener productDetailsListener = ProductDetailsListener.this;
                    JSONObject originalJson = skuDetailsList.get(0).getOriginalJson();
                    productDetailsListener.onProductDetailsResponse(billingResult, originalJson != null ? originalJson.toString() : null);
                }
            }));
        } else {
            Intrinsics.i("billingClient");
            throw null;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void queryPurchasesAsync(@Nullable String purchaseType, @Nullable PurchasesResponseListener purchasesResponseListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.queryPurchasesAsync(purchaseType, new PurchasesResponseListenerProxy(purchasesResponseListener));
        } else {
            Intrinsics.i("billingClient");
            throw null;
        }
    }

    @Override // com.unity3d.services.store.gpbl.bridges.billingclient.BillingClientAdapter
    public void startConnection(@Nullable BillingClientStateListener billingClientStateListener) {
        BillingClientBridge billingClientBridge = this.billingClient;
        if (billingClientBridge != null) {
            billingClientBridge.startConnection(new BillingClientStateListenerProxy(billingClientStateListener));
        } else {
            Intrinsics.i("billingClient");
            throw null;
        }
    }

    public /* synthetic */ BillingClientAdapter(BillingClientBuilderBridge billingClientBuilderBridge, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(billingClientBuilderBridge, (i2 & 2) != 0 ? 6 : i);
    }
}
