package com.playtika.plugins.googleplay.billingclient;

import android.app.Activity;
import android.util.Log;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingConfigResponseListener;
import com.android.billingclient.api.BillingProgramAvailabilityListener;
import com.android.billingclient.api.BillingProgramReportingDetailsListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.LaunchExternalLinkResponseListener;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.playtika.plugins.googleplay.billingclient.BillingClientConnection;
import com.playtika.plugins.googleplay.billingclient.adapters.BillingClientAdapter;
import java.util.List;

/* loaded from: classes.dex */
public class BillingService {
    private static final String FEATURE_LOG_PATTERN = "Billing is not supported for feature %s. Response code = %d, debug message = %s";
    private static final String TAG = "BillingService";
    private final BillingClientConnection _billingClientConnection;
    private byte _capabilities;
    private Boolean _disposed;
    private final IGooglePlayPurchaseObserver _purchaseObserver;

    public interface InitializeCallback {
        void run(byte b);
    }

    public BillingService(Activity activity, IGooglePlayPurchaseObserver iGooglePlayPurchaseObserver) {
        this._purchaseObserver = iGooglePlayPurchaseObserver;
        this._billingClientConnection = new BillingClientConnection(activity);
    }

    public void initialize(final InitializeCallback initializeCallback) {
        Log.d(TAG, "BillingService: initialization...");
        this._capabilities = (byte) 0;
        this._purchaseObserver.onInitStarted();
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda18
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                BillingService.this.lambda$initialize$0(initializeCallback, billingClientAdapter);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda19
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str) {
                BillingService.this.lambda$initialize$1(initializeCallback, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0(InitializeCallback initializeCallback, BillingClientAdapter billingClientAdapter) {
        if (billingClientAdapter.isReadyAndInAppsSupported().booleanValue()) {
            this._capabilities = (byte) (this._capabilities | 1);
        } else {
            Log.e(TAG, "Billing is not supported for type 'inapp'.");
        }
        BillingResult isFeatureSupported = billingClientAdapter.isFeatureSupported(BillingClient.FeatureType.PRODUCT_DETAILS);
        if (isFeatureSupported.getResponseCode() == 0) {
            this._capabilities = (byte) (this._capabilities | 4);
        } else {
            Log.w(TAG, String.format(FEATURE_LOG_PATTERN, "Product Details", Integer.valueOf(isFeatureSupported.getResponseCode()), isFeatureSupported.getDebugMessage()));
        }
        BillingResult isFeatureSupported2 = billingClientAdapter.isFeatureSupported(BillingClient.FeatureType.SUBSCRIPTIONS);
        if (isFeatureSupported2.getResponseCode() != 0) {
            Log.w(TAG, String.format(FEATURE_LOG_PATTERN, BillingClient.FeatureType.SUBSCRIPTIONS, Integer.valueOf(isFeatureSupported2.getResponseCode()), isFeatureSupported2.getDebugMessage()));
        } else {
            this._capabilities = (byte) (this._capabilities | 2);
        }
        this._purchaseObserver.onInitCompleted();
        initializeCallback.run(this._capabilities);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$1(InitializeCallback initializeCallback, String str) {
        Log.e(TAG, "Failed to initialize BillingService connection. " + str);
        this._purchaseObserver.onInitFailed();
        initializeCallback.run(this._capabilities);
    }

    public void acknowledgePurchase(final String str, final AcknowledgePurchaseResponseListener acknowledgePurchaseResponseListener) {
        Log.i(TAG, "AcknowledgePurchase(" + str + ")");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda7
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.acknowledgePurchase(str, acknowledgePurchaseResponseListener);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda8
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str2) {
                Log.e(BillingService.TAG, "AcknowledgePurchase Error: " + str2);
            }
        });
    }

    public void consumePurchase(final String str, final ConsumeResponseListener consumeResponseListener) {
        Log.i(TAG, "ConsumePurchase(" + str + ")");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda12
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.consumePurchase(str, consumeResponseListener);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda13
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str2) {
                Log.e(BillingService.TAG, "ConsumePurchase Error: " + str2);
            }
        });
    }

    public void queryPurchases(final String str, final BillingClientAdapter.BillingClientResultListener billingClientResultListener) {
        Log.i(TAG, "QueryPurchases(" + str + ")");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda0
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.queryPurchases(str, billingClientResultListener);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda11
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str2) {
                Log.e(BillingService.TAG, "QueryPurchases Error: " + str2);
            }
        });
    }

    public void querySkuDetails(final List<String> list, final String str, final ProductDetailsResponseListener productDetailsResponseListener) {
        Log.i(TAG, "QuerySkuDetails(" + str + ")");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda1
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.querySkuDetails(list, str, productDetailsResponseListener);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda2
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str2) {
                Log.e(BillingService.TAG, "QueryPurchases Error: " + str2);
            }
        });
    }

    public void launchBillingFlow(final ProductDetails productDetails, final BillingClientAdapter.BillingClientResultListener billingClientResultListener) {
        Log.i(TAG, "LaunchBillingFlow(" + productDetails + ") sku = " + productDetails.getProductId());
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda3
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.launchBillingFlow(ProductDetails.this, billingClientResultListener);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda4
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str) {
                Log.e(BillingService.TAG, "QueryPurchases Error: " + str);
            }
        });
    }

    public void getBillingConfigAsync(final BillingConfigResponseListener billingConfigResponseListener) {
        Log.i(TAG, "GetBillingConfigAsync");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda14
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.getBillingConfigAsync(BillingConfigResponseListener.this);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda15
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str) {
                Log.e(BillingService.TAG, "getBillingConfigAsync Error: " + str);
            }
        });
    }

    public void isExternalContentLinkProgramAvailableAsync(final BillingProgramAvailabilityListener billingProgramAvailabilityListener) {
        Log.i(TAG, "isExternalContentLinkProgramAvailableAsync");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda5
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.isExternalContentLinkProgramAvailableAsync(BillingProgramAvailabilityListener.this);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda6
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str) {
                Log.e(BillingService.TAG, "isExternalContentLinkProgramAvailableAsync Error: " + str);
            }
        });
    }

    public void getExternalTransactionTokenAsync(final BillingProgramReportingDetailsListener billingProgramReportingDetailsListener) {
        Log.i(TAG, "getExternalTransactionTokenAsync");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda16
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.getExternalTransactionTokenAsync(BillingProgramReportingDetailsListener.this);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda17
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str) {
                Log.e(BillingService.TAG, "getExternalTransactionTokenAsync Error: " + str);
            }
        });
    }

    public void launchExternalLinkAsync(final String str, final int i, final int i2, final LaunchExternalLinkResponseListener launchExternalLinkResponseListener) {
        Log.i(TAG, "launchExternalLinkAsync");
        getClient(new BillingClientConnection.ConnectionCompleteCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda9
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionCompleteCallback
            public final void run(BillingClientAdapter billingClientAdapter) {
                billingClientAdapter.launchExternalLinkAsync(str, i, i2, launchExternalLinkResponseListener);
            }
        }, new BillingClientConnection.ConnectionErrorCallback() { // from class: com.playtika.plugins.googleplay.billingclient.BillingService$$ExternalSyntheticLambda10
            @Override // com.playtika.plugins.googleplay.billingclient.BillingClientConnection.ConnectionErrorCallback
            public final void run(String str2) {
                Log.e(BillingService.TAG, "launchExternalLinkAsync Error: " + str2);
            }
        });
    }

    public void dispose() {
        if (this._disposed.booleanValue()) {
            return;
        }
        this._disposed = true;
        this._billingClientConnection.dispose();
    }

    private void getClient(BillingClientConnection.ConnectionCompleteCallback connectionCompleteCallback, BillingClientConnection.ConnectionErrorCallback connectionErrorCallback) {
        this._billingClientConnection.getClient(connectionCompleteCallback, connectionErrorCallback);
    }
}
