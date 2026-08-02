package com.fyber.inneractive.sdk.activities;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.click.r;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.j1;
import com.fyber.inneractive.sdk.util.v;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g extends WebViewClient {
    public final /* synthetic */ InneractiveInternalBrowserActivity a;

    public g(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity) {
        this.a = inneractiveInternalBrowserActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.a.f.setImageDrawable(webView.canGoBack() ? com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_left_arrow) : com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unleft_arrow));
        this.a.g.setImageDrawable(webView.canGoForward() ? com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_right_arrow) : com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.a.g.setImageDrawable(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_unright_arrow));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        IAlog.f("Received Error on WebViewClient: Code: %d, Description: %s, failingUrl: %s", Integer.valueOf(i), str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        z.a("WebViewRendererProcessGone", "Web view renderer process has gone. Web view destroyed", null, null);
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.a;
        if (inneractiveInternalBrowserActivity.e == webView) {
            inneractiveInternalBrowserActivity.e = null;
        }
        if (webView != null) {
            v.a(webView);
            webView.destroy();
        }
        this.a.finish();
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean a = j1.a(str);
        InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity = this.a;
        if (a) {
            WebView webView2 = inneractiveInternalBrowserActivity.e;
            if (webView2 != null) {
                webView2.loadUrl("chrome://crash");
            }
            return true;
        }
        String str2 = InneractiveInternalBrowserActivity.URL_EXTRA;
        inneractiveInternalBrowserActivity.getClass();
        com.fyber.inneractive.sdk.click.g gVar = new com.fyber.inneractive.sdk.click.g(new h(inneractiveInternalBrowserActivity), null, com.fyber.inneractive.sdk.util.g.VIDEO_CTA);
        r rVar = new r(false, inneractiveInternalBrowserActivity.b);
        rVar.j.addAll(Arrays.asList(gVar, new com.fyber.inneractive.sdk.click.d(), new com.fyber.inneractive.sdk.click.h(), new com.fyber.inneractive.sdk.click.l(), new com.fyber.inneractive.sdk.click.i(false, TextUtils.isEmpty(str) ? null : Uri.parse(str).getScheme())));
        rVar.a(inneractiveInternalBrowserActivity.getApplicationContext(), str, new i(inneractiveInternalBrowserActivity), null, false, com.fyber.inneractive.sdk.ignite.m.NONE, "");
        return !str.startsWith("http");
    }
}
