package com.playtika.pras.sdk;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.ironsource.X3;
import com.playtika.pras.b.b;
import com.playtika.pras.b.d;
import com.playtika.pras.c.e;
import com.playtika.pras.e.g;
import com.playtika.pras.sdk.PrasSDK;
import com.playtika.pras.sdk.network.ResponseCode;
import com.playtika.pras.sdk.network.SdkConfig;
import com.playtika.pras.sdk.network.StagesApi;
import com.playtika.pras.sdk.network.models.results.BillingResult;
import com.playtika.pras.sdk.views.PurchaseWebViewContainer;
import com.safedk.android.utils.Logger;

/* loaded from: classes5.dex */
public class PaymentWidget extends AppCompatActivity implements g, d {
    public static PaymentWidget b;
    public static PrasSDK.ResponseHandler c;
    public static boolean d;
    public Bundle a;

    public static void a(Intent intent, Context context, PrasSDK.ResponseHandler responseHandler) {
        if (b != null || d) {
            return;
        }
        d = true;
        c = responseHandler;
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (ActivityNotFoundException e) {
            d = false;
            com.playtika.pras.c.d.a("Error: " + e.getMessage());
            if (responseHandler != null) {
                responseHandler.onResponse(new BillingResult(ResponseCode.RESULT_ERROR).toBundle());
            }
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    @Override // com.playtika.pras.e.g
    public final void b(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.playtika.pras.e.g
    public final void onAfterExternalBrowserClosed() {
        PrasSDK.ResponseHandler responseHandler = c;
        if (responseHandler instanceof PrasSDK.ResponseHandlerEx) {
            ((PrasSDK.ResponseHandlerEx) responseHandler).onAfterExternalBrowserClosed();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        PurchaseWebViewContainer purchaseWebViewContainer = (PurchaseWebViewContainer) getSupportFragmentManager().findFragmentById(R.id.purchaseWebViewContainerFragment);
        if (purchaseWebViewContainer != null) {
            purchaseWebViewContainer.backButtonHandler();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.playtika.pras.e.g
    public final void onBeforeExternalBrowserOpened(String str) {
        PrasSDK.ResponseHandler responseHandler = c;
        if (responseHandler instanceof PrasSDK.ResponseHandlerEx) {
            ((PrasSDK.ResponseHandlerEx) responseHandler).onBeforeExternalBrowserOpened(str);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            StagesApi.restore(bundle);
            SdkConfig.restore(bundle);
        }
        super.onCreate(bundle);
        setFinishOnTouchOutside(false);
        if (SdkConfig.isFullScreen()) {
            setContentView(R.layout.activity_next_gen_payment_widget);
        } else {
            setTheme(R.style.PrasDialogTheme);
            setContentView(R.layout.activity_new_payment_widget);
        }
        if (com.playtika.pras.c.a.a(this)) {
            setRequestedOrientation(4);
        } else {
            String lockOrientation = SdkConfig.getLockOrientation();
            if (X3.i.D.equals(lockOrientation)) {
                setRequestedOrientation(7);
            } else if (X3.i.C.equals(lockOrientation)) {
                setRequestedOrientation(6);
            } else {
                setRequestedOrientation(4);
            }
        }
        b = this;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Bundle bundle;
        if (!isFinishing() || (bundle = this.a) == null) {
            Bundle bundle2 = new BillingResult(ResponseCode.RESULT_ERROR).toBundle();
            PrasSDK.ResponseHandler responseHandler = c;
            if (responseHandler != null) {
                responseHandler.onResponse(bundle2);
                c = null;
            }
        } else {
            PrasSDK.ResponseHandler responseHandler2 = c;
            if (responseHandler2 != null) {
                responseHandler2.onResponse(bundle);
                c = null;
            }
        }
        b = null;
        d = false;
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        StagesApi.save(bundle);
        SdkConfig.save(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.playtika.pras.e.g
    public final void setOrientation(String str) {
        setRequestedOrientation(e.a(str));
    }

    @Override // com.playtika.pras.b.d
    public final void b(String str) {
        com.playtika.pras.c.d.a("onBeforeUrlOpen", str);
        PrasSDK.ResponseHandler responseHandler = c;
        if (responseHandler instanceof PrasSDK.ResponseHandlerEx) {
            ((PrasSDK.ResponseHandlerEx) responseHandler).onBeforeExternalBrowserOpened("payment");
        }
    }

    @Override // com.playtika.pras.e.g
    public final void a(Bundle bundle) {
        this.a = bundle;
        finish();
    }

    @Override // com.playtika.pras.e.g
    public final void a(WebView webView) {
        b.newInstance((AppCompatActivity) this, webView, SdkConfig.useInternalBrowserForRedirects()).setNavigationListener(this);
    }

    @Override // com.playtika.pras.b.d
    public final void a(String str) {
        com.playtika.pras.c.d.a("onUrlOpened", str);
        PurchaseWebViewContainer purchaseWebViewContainer = (PurchaseWebViewContainer) getSupportFragmentManager().findFragmentById(R.id.purchaseWebViewContainerFragment);
        if (purchaseWebViewContainer != null) {
            purchaseWebViewContainer.setPaypalWaiting();
        }
    }

    @Override // com.playtika.pras.b.d
    public final void a() {
        com.playtika.pras.c.d.a("onBrowserClosed");
        PrasSDK.ResponseHandler responseHandler = c;
        if (responseHandler instanceof PrasSDK.ResponseHandlerEx) {
            ((PrasSDK.ResponseHandlerEx) responseHandler).onAfterExternalBrowserClosed();
        }
    }
}
