package com.vk.ecomm.reviews.impl.subscriptionpayment.presentation;

import android.content.Intent;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ironsource.X3;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.ActionDeserializer;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.ActionParams;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.ActionParamsStatus;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.ActionParamsStatusDeserializer;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.BillingEvent;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.EventAction;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.EventDeserializer;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.EventType;
import com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.PaymentResult;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import xsna.brm0;
import xsna.drm0;
import xsna.dsw;
import xsna.oz50;
import xsna.s4c0;
import xsna.v390;
import xsna.y390;

/* compiled from: CommunityReviewsPinSubscriptionVKPayFragment.kt */
/* loaded from: classes18.dex */
public final class CommunityReviewsPinSubscriptionVKPayFragment extends FragmentImpl {
    public String O;
    public final Gson N = new GsonBuilder().registerTypeAdapter(EventType.class, new EventDeserializer()).registerTypeAdapter(EventAction.class, new ActionDeserializer()).registerTypeAdapter(ActionParamsStatus.class, new ActionParamsStatusDeserializer()).create();
    public PaymentResult P = PaymentResult.CANCEL;

    /* compiled from: CommunityReviewsPinSubscriptionVKPayFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: CommunityReviewsPinSubscriptionVKPayFragment.kt */
    public static final class b implements s4c0 {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        
            if ((r1 != null ? r1.a() : null) == com.vk.ecomm.reviews.impl.subscriptionpayment.domain.model.ActionParamsStatus.TIMEOUT) goto L34;
         */
        @Override // xsna.s4c0
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void postMessage(String str) {
            if (str == null) {
                return;
            }
            String y = brm0.y(drm0.q0(str, '\"'), "\\\"", "\"");
            CommunityReviewsPinSubscriptionVKPayFragment communityReviewsPinSubscriptionVKPayFragment = CommunityReviewsPinSubscriptionVKPayFragment.this;
            BillingEvent billingEvent = (BillingEvent) communityReviewsPinSubscriptionVKPayFragment.N.fromJson(y, BillingEvent.class);
            if (billingEvent.c() != EventType.BILLING) {
                return;
            }
            if (billingEvent.a() == EventAction.PAY_SUCCESS) {
                communityReviewsPinSubscriptionVKPayFragment.P = PaymentResult.SUCCESS;
                return;
            }
            EventAction a = billingEvent.a();
            EventAction eventAction = EventAction.CLOSE_WINDOW;
            if (a == eventAction) {
                ActionParams b = billingEvent.b();
                if ((b != null ? b.a() : null) == ActionParamsStatus.OK) {
                    Intent intent = new Intent();
                    intent.putExtra("PAYMENT_RESULT_KEY", "SUCCESS");
                    communityReviewsPinSubscriptionVKPayFragment.Mf(-1, intent);
                    return;
                }
            }
            if (billingEvent.a() == eventAction) {
                ActionParams b2 = billingEvent.b();
                if ((b2 != null ? b2.a() : null) != ActionParamsStatus.ERROR) {
                    ActionParams b3 = billingEvent.b();
                }
                Intent intent2 = new Intent();
                intent2.putExtra("PAYMENT_RESULT_KEY", "FAIL");
                communityReviewsPinSubscriptionVKPayFragment.Mf(-1, intent2);
                return;
            }
            if (billingEvent.a() == eventAction) {
                Intent intent3 = new Intent();
                intent3.putExtra("PAYMENT_RESULT_KEY", "CANCEL");
                communityReviewsPinSubscriptionVKPayFragment.Mf(0, intent3);
            }
        }
    }

    /* compiled from: CommunityReviewsPinSubscriptionVKPayFragment.kt */
    public static final class c extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            if (webView != null) {
                webView.loadUrl("\n            javascript:(() => {\n              window.addEventListener('message', function (e) {\n                Android.postMessage(JSON.stringify(e.data));\n              });\n            })();\n        ");
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url;
            String str = null;
            if (sslError != null && (url = sslError.getUrl()) != null && !drm0.N(url)) {
                str = url;
            }
            if (str != null) {
                dsw<UserId, v390> dswVar = y390.a;
                if (y390.a.a().d(str)) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"CommunityReviews: skip SSL for ".concat(str)});
                    }
                    if (sslErrorHandler != null) {
                        sslErrorHandler.proceed();
                        return;
                    }
                    return;
                }
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (this.P == PaymentResult.SUCCESS) {
            Intent intent = new Intent();
            intent.putExtra("PAYMENT_RESULT_KEY", "SUCCESS");
            Mf(-1, intent);
            return true;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("PAYMENT_RESULT_KEY", "CANCEL");
        Mf(0, intent2);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("COMMUNITY_REVIEWS_PIN_VKPAY_URL")) == null) {
            str = "";
        }
        this.O = str;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.community_reviews_pin_subscription_vkpay_fragment_layout, viewGroup, false);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        WebView webView = (WebView) view.findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new b(), X3.d);
        webView.setWebViewClient(new c());
        String str = this.O;
        if (str != null) {
            webView.loadUrl(str);
        }
    }
}
