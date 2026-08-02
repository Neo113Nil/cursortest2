package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import defpackage.iog;
import defpackage.jog;
import defpackage.k0l;
import defpackage.l0l;
import defpackage.l1l;
import defpackage.s02;
import defpackage.s90;
import defpackage.u90;
import defpackage.y0l;
import defpackage.z0l;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull k0l k0lVar) {
        if (y0l.b("WEB_RESOURCE_ERROR_GET_CODE") && y0l.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, k0lVar.b(), k0lVar.a().toString(), webResourceRequest.getUrl().toString());
        }
    }

    public void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull iog iogVar) {
        if (!y0l.b("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw y0l.a();
        }
        jog jogVar = (jog) iogVar;
        jogVar.getClass();
        s90 s90Var = y0l.c;
        if (s90Var.a()) {
            SafeBrowsingResponse safeBrowsingResponse = jogVar.a;
            if (safeBrowsingResponse == null) {
                safeBrowsingResponse = z0l.a.a(Proxy.getInvocationHandler(jogVar.b));
                jogVar.a = safeBrowsingResponse;
            }
            u90.b(safeBrowsingResponse);
            return;
        }
        if (!s90Var.b()) {
            throw y0l.a();
        }
        SafeBrowsingResponseBoundaryInterface safeBrowsingResponseBoundaryInterface = jogVar.b;
        if (safeBrowsingResponseBoundaryInterface == null) {
            l1l l1lVar = z0l.a;
            safeBrowsingResponseBoundaryInterface = (SafeBrowsingResponseBoundaryInterface) s02.E(SafeBrowsingResponseBoundaryInterface.class, l1lVar.a.convertSafeBrowsingResponse(jogVar.a));
            jogVar.b = safeBrowsingResponseBoundaryInterface;
        }
        safeBrowsingResponseBoundaryInterface.showInterstitial(true);
    }

    public boolean onWebAuthnIntent(@NonNull WebView webView, @NonNull PendingIntent pendingIntent, @NonNull InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError) {
        l0l l0lVar = new l0l();
        l0lVar.a = webResourceError;
        onReceivedError(webView, webResourceRequest, l0lVar);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull InvocationHandler invocationHandler) {
        l0l l0lVar = new l0l();
        l0lVar.b = (WebResourceErrorBoundaryInterface) s02.E(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, l0lVar);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull SafeBrowsingResponse safeBrowsingResponse) {
        jog jogVar = new jog();
        jogVar.a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i, jogVar);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull InvocationHandler invocationHandler) {
        jog jogVar = new jog();
        jogVar.b = (SafeBrowsingResponseBoundaryInterface) s02.E(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i, jogVar);
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
    }
}
