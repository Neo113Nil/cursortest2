package com.playtika.plugins.googleplay.billingclient.adapters;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingProgramAvailabilityListener;
import com.android.billingclient.api.BillingProgramReportingDetailsListener;
import com.android.billingclient.api.BillingProgramReportingDetailsParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.GetBillingConfigParams;
import com.android.billingclient.api.LaunchExternalLinkParams;
import com.android.billingclient.api.LaunchExternalLinkResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.android.billingclient.api.QueryPurchasesParams;
import com.playtika.plugins.googleplay.billingclient.DataFormatter;
import com.playtika.plugins.googleplay.billingclient.adapters.PurchaseUpdatedListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class BillingClientAdapter {
    private final Activity _activity;
    private final BillingClient _billingClient;
    private final PurchaseUpdatedListener _purchaseUpdatedListener;

    public interface BillingClientResultListener {
        void run(BillingClientResult billingClientResult);
    }

    public BillingClientAdapter(Activity activity, BillingClient billingClient, PurchaseUpdatedListener purchaseUpdatedListener) {
        this._activity = activity;
        this._billingClient = billingClient;
        this._purchaseUpdatedListener = purchaseUpdatedListener;
    }

    public void consumePurchase(String str, ConsumeResponseListener consumeResponseListener) {
        this._billingClient.consumeAsync(ConsumeParams.newBuilder().setPurchaseToken(str).build(), consumeResponseListener);
    }

    public void acknowledgePurchase(String str, AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        this._billingClient.acknowledgePurchase(AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str).build(), acknowledgePurchaseResponseListener);
    }

    public void querySkuDetails(List<String> list, String str, ProductDetailsResponseListener productDetailsResponseListener) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId(it.next()).setProductType(str).build());
        }
        this._billingClient.queryProductDetailsAsync(QueryProductDetailsParams.newBuilder().setProductList(arrayList).build(), productDetailsResponseListener);
    }

    public void getBillingConfigAsync(BillingConfigResponseListener billingConfigResponseListener) {
        this._billingClient.getBillingConfigAsync(GetBillingConfigParams.newBuilder().build(), billingConfigResponseListener);
    }

    public void isExternalContentLinkProgramAvailableAsync(BillingProgramAvailabilityListener billingProgramAvailabilityListener) {
        this._billingClient.isBillingProgramAvailableAsync(1, billingProgramAvailabilityListener);
    }

    public void getExternalTransactionTokenAsync(BillingProgramReportingDetailsListener billingProgramReportingDetailsListener) {
        this._billingClient.createBillingProgramReportingDetailsAsync(BillingProgramReportingDetailsParams.newBuilder().setBillingProgram(1).build(), billingProgramReportingDetailsListener);
    }

    public void launchExternalLinkAsync(String str, int i, int i2, LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        this._billingClient.launchExternalLink(this._activity, LaunchExternalLinkParams.newBuilder().setBillingProgram(1).setLinkUri(Uri.parse(str)).setLinkType(i).setLaunchMode(i2).build(), launchExternalLinkResponseListener);
    }

    public void launchBillingFlow(final ProductDetails productDetails, final BillingClientResultListener billingClientResultListener) {
        String str;
        if (productDetails.getOneTimePurchaseOfferDetails() == null) {
            str = "";
        } else {
            str = productDetails.getOneTimePurchaseOfferDetails().getOfferToken();
        }
        if (TextUtils.isEmpty(str)) {
            billingClientResultListener.run(new BillingClientResult(BillingResult.newBuilder().setResponseCode(5).setDebugMessage("Missing offerToken for productId=" + productDetails.getProductId()).build(), new ArrayList()));
            return;
        }
        BillingFlowParams build = BillingFlowParams.newBuilder().setProductDetailsParamsList(Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(str).build())).build();
        this._purchaseUpdatedListener.addHandler(new PurchaseUpdatedListener.Handler() { // from class: com.playtika.plugins.googleplay.billingclient.adapters.BillingClientAdapter$$ExternalSyntheticLambda0
            @Override // com.playtika.plugins.googleplay.billingclient.adapters.PurchaseUpdatedListener.Handler
            public final void run(BillingClientResult billingClientResult, PurchaseUpdatedListener.Handler handler) {
                BillingClientAdapter.this.lambda$launchBillingFlow$0(productDetails, billingClientResultListener, billingClientResult, handler);
            }
        });
        this._billingClient.launchBillingFlow(this._activity, build);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$launchBillingFlow$0(ProductDetails productDetails, BillingClientResultListener billingClientResultListener, BillingClientResult billingClientResult, PurchaseUpdatedListener.Handler handler) {
        if (billingClientResult.containsInPurchaseList(productDetails.getProductId()).booleanValue() || !billingClientResult.isOk().booleanValue()) {
            this._purchaseUpdatedListener.removeHandler(handler);
            billingClientResultListener.run(billingClientResult);
            DataFormatter.removeProductDetailsFromCache(productDetails);
        }
    }

    public Boolean isReadyAndInAppsSupported() {
        return Boolean.valueOf(this._billingClient.isReady());
    }

    public BillingResult isFeatureSupported(String str) {
        return this._billingClient.isFeatureSupported(str);
    }

    public void queryPurchases(String str, final BillingClientResultListener billingClientResultListener) {
        this._billingClient.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(str).build(), new PurchasesResponseListener() { // from class: com.playtika.plugins.googleplay.billingclient.adapters.BillingClientAdapter.1
            @Override // com.android.billingclient.api.PurchasesResponseListener
            public void onQueryPurchasesResponse(BillingResult billingResult, List<Purchase> list) {
                billingClientResultListener.run(new BillingClientResult(billingResult, list));
            }
        });
    }
}
