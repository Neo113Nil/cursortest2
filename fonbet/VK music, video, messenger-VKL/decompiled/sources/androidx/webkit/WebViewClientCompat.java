package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;
import org.chromium.support_lib_boundary.util.Features;
import xsna.azg0;
import xsna.ly2;
import xsna.mhx0;
import xsna.mjx0;
import xsna.my2;
import xsna.nhx0;
import xsna.oix0;
import xsna.oy2;
import xsna.vix0;
import xsna.zq70;
import xsna.zyg0;

/* loaded from: classes12.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {Features.VISUAL_STATE_CALLBACK, Features.RECEIVE_WEB_RESOURCE_ERROR, Features.RECEIVE_HTTP_ERROR, Features.SHOULD_OVERRIDE_WITH_REDIRECTS, Features.SAFE_BROWSING_HIT};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull InvocationHandler invocationHandler) {
        nhx0 nhx0Var = new nhx0();
        nhx0Var.b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebResourceErrorBoundaryInterface.class, invocationHandler);
        onReceivedError(webView, webResourceRequest, nhx0Var);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull InvocationHandler invocationHandler) {
        azg0 azg0Var = new azg0();
        azg0Var.b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
        onSafeBrowsingHit(webView, webResourceRequest, i, azg0Var);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean onWebAuthnIntent(@NonNull WebView webView, @NonNull PendingIntent pendingIntent, @NonNull InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, ly2.a(webResourceRequest).toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError) {
        nhx0 nhx0Var = new nhx0();
        nhx0Var.a = webResourceError;
        onReceivedError(webView, webResourceRequest, nhx0Var);
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull SafeBrowsingResponse safeBrowsingResponse) {
        azg0 azg0Var = new azg0();
        azg0Var.a = safeBrowsingResponse;
        onSafeBrowsingHit(webView, webResourceRequest, i, azg0Var);
    }

    public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull mhx0 mhx0Var) {
        if (zq70.C(Features.WEB_RESOURCE_ERROR_GET_CODE) && zq70.C(Features.WEB_RESOURCE_ERROR_GET_DESCRIPTION) && ly2.b(webResourceRequest)) {
            nhx0 nhx0Var = (nhx0) mhx0Var;
            nhx0Var.getClass();
            oix0.c.getClass();
            if (nhx0Var.a == null) {
                mjx0 mjx0Var = vix0.a.a;
                nhx0Var.a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) mjx0Var.a).convertWebResourceError(Proxy.getInvocationHandler(nhx0Var.b));
            }
            int f = my2.f(nhx0Var.a);
            oix0.b.getClass();
            if (nhx0Var.a == null) {
                mjx0 mjx0Var2 = vix0.a.a;
                nhx0Var.a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) mjx0Var2.a).convertWebResourceError(Proxy.getInvocationHandler(nhx0Var.b));
            }
            onReceivedError(webView, f, my2.e(nhx0Var.a).toString(), ly2.a(webResourceRequest).toString());
        }
    }

    public void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull zyg0 zyg0Var) {
        if (zq70.C(Features.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL)) {
            azg0 azg0Var = (azg0) zyg0Var;
            azg0Var.getClass();
            oix0.d.getClass();
            if (azg0Var.a == null) {
                mjx0 mjx0Var = vix0.a.a;
                azg0Var.a = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) mjx0Var.a).convertSafeBrowsingResponse(Proxy.getInvocationHandler(azg0Var.b));
            }
            oy2.e(azg0Var.a, true);
            return;
        }
        throw oix0.a();
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
    }
}
