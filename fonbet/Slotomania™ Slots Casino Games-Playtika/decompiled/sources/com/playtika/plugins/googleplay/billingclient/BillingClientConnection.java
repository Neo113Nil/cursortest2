package com.playtika.plugins.googleplay.billingclient;

import android.app.Activity;
import android.util.Log;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.playtika.plugins.googleplay.billingclient.adapters.BillingClientAdapter;
import com.playtika.plugins.googleplay.billingclient.adapters.BillingClientResult;
import com.playtika.plugins.googleplay.billingclient.adapters.PurchaseUpdatedListener;

/* loaded from: classes4.dex */
public class BillingClientConnection {
    private static final String TAG = "BillingClientConnection";
    private BillingClientAdapter _adapter;
    private BillingClientStateListener _billingClientStateListener;
    private BillingClient _client;
    private ConnectionCompleteCallback _connectionCompleteCallback;
    private ConnectionErrorCallback _connectionErrorCallback;
    private PurchaseUpdatedListener _purchaseListener;
    private ConnectionState _state = ConnectionState.DISCONNECTED;

    public interface ConnectionCompleteCallback {
        void run(BillingClientAdapter billingClientAdapter);
    }

    public interface ConnectionErrorCallback {
        void run(String str);
    }

    public enum ConnectionState {
        DISCONNECTED,
        CONNECTING,
        CONNECTED,
        DISPOSED
    }

    public BillingClientConnection(Activity activity) {
        PurchaseUpdatedListener purchaseUpdatedListener = new PurchaseUpdatedListener();
        this._purchaseListener = purchaseUpdatedListener;
        purchaseUpdatedListener.addHandler(new BillingClientConnection$$ExternalSyntheticLambda0(this));
        this._client = BillingClient.newBuilder(activity).setListener(this._purchaseListener).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).enableBillingProgram(1).build();
        this._adapter = new BillingClientAdapter(activity, this._client, this._purchaseListener);
        this._billingClientStateListener = new BillingClientStateListener() { // from class: com.playtika.plugins.googleplay.billingclient.BillingClientConnection.1
            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingSetupFinished(BillingResult billingResult) {
                BillingClientConnection.this.onBillingSetupFinishedHandler(billingResult);
            }

            @Override // com.android.billingclient.api.BillingClientStateListener
            public void onBillingServiceDisconnected() {
                BillingClientConnection.this.onBillingServiceDisconnectedHandler();
            }
        };
        startConnection();
    }

    public void getClient(ConnectionCompleteCallback connectionCompleteCallback, ConnectionErrorCallback connectionErrorCallback) {
        this._connectionCompleteCallback = connectionCompleteCallback;
        this._connectionErrorCallback = connectionErrorCallback;
        if (this._state == ConnectionState.DISPOSED) {
            Log.e(TAG, "BillingClientConnection is disposed.");
        } else if (this._state == ConnectionState.DISCONNECTED) {
            Log.i(TAG, "Restarting connection to billing service");
            startConnection();
        } else {
            this._connectionCompleteCallback.run(this._adapter);
        }
    }

    public void dispose() {
        Log.i(TAG, "Dispose");
        if (this._state == ConnectionState.DISPOSED) {
            Log.w(TAG, "Dispose called after disposed.");
            return;
        }
        this._state = ConnectionState.DISPOSED;
        this._client.endConnection();
        this._purchaseListener.removeHandler(new BillingClientConnection$$ExternalSyntheticLambda0(this));
        this._purchaseListener = null;
        this._client = null;
        this._adapter = null;
        this._billingClientStateListener = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBillingServiceDisconnectedHandler() {
        if (this._state != ConnectionState.DISPOSED) {
            Log.i(TAG, "Billing service disconnected");
            this._state = ConnectionState.DISCONNECTED;
        } else {
            Log.w(TAG, "OnBillingServiceDisconnected called after dispose.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBillingSetupFinishedHandler(BillingResult billingResult) {
        Log.i(TAG, "OnBillingSetupFinished BillingResult = " + billingResult);
        if (this._state == ConnectionState.DISPOSED) {
            Log.e(TAG, "OnBillingSetupFinished called after dispose.");
            return;
        }
        if (billingResult.getResponseCode() == 0) {
            Log.i(TAG, "Billing client connected");
            this._state = ConnectionState.CONNECTED;
            ConnectionCompleteCallback connectionCompleteCallback = this._connectionCompleteCallback;
            if (connectionCompleteCallback != null) {
                connectionCompleteCallback.run(this._adapter);
                return;
            }
            return;
        }
        Log.w(TAG, "Failed connect to billing service");
        this._state = ConnectionState.DISCONNECTED;
        Log.e(TAG, "Could not start billing service connection");
        ConnectionErrorCallback connectionErrorCallback = this._connectionErrorCallback;
        if (connectionErrorCallback != null) {
            connectionErrorCallback.run("Could not start billing service connection");
        }
    }

    private void startConnection() {
        if (this._state == ConnectionState.DISCONNECTED) {
            Log.i(TAG, "Start connection to billing service");
            this._state = ConnectionState.CONNECTING;
            this._client.startConnection(this._billingClientStateListener);
            return;
        }
        Log.w(TAG, "Trying to start connection in state " + this._state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPurchaseUpdated(BillingClientResult billingClientResult, PurchaseUpdatedListener.Handler handler) {
        Log.i(TAG, "Purchases updated in state = " + this._state + ", billingClientResult = " + billingClientResult);
    }
}
