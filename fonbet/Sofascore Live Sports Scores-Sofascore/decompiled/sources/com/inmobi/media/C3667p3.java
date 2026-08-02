package com.inmobi.media;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.fsf;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.p3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3667p3 extends WebViewClient {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ fsf b;
    public final /* synthetic */ C3693q3 c;
    public final /* synthetic */ Z2 d;

    public C3667p3(AtomicBoolean atomicBoolean, fsf fsfVar, C3693q3 c3693q3, Z2 z2) {
        this.a = atomicBoolean;
        this.b = fsfVar;
        this.c = c3693q3;
        this.d = z2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C3693q3.a(this.a, this.b, this.c, this.d, true);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        C3693q3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        C3693q3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        C3693q3.a(this.a, this.b, this.c, this.d, false);
        return No.a(webView, renderProcessGoneDetail, "click_mgr");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        return (this.d.d || Intrinsics.c(webResourceRequest.getUrl().toString(), this.d.b)) ? false : true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        C3693q3.a(this.a, this.b, this.c, this.d, false);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        Z2 z2 = this.d;
        return (z2.d || Intrinsics.c(str, z2.b)) ? false : true;
    }
}
