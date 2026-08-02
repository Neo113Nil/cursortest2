package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ironsource.U3;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.z;
import defpackage.fdi;
import defpackage.k0l;
import defpackage.zk9;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(j jVar, Object obj, WebView webView, int i) {
        this.a = i;
        this.b = jVar;
        this.d = obj;
        this.c = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.a;
        WebView webView = this.c;
        Object obj2 = this.d;
        j jVar = this.b;
        switch (i) {
            case 0:
                com.moloco.sdk.acm.recorder.c cVar = jVar.b;
                fdi fdiVar = jVar.f;
                WebResourceResponse webResourceResponse = (WebResourceResponse) obj2;
                boolean parseBoolean = Boolean.parseBoolean((String) obj);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", U3.j.d + Thread.currentThread().getName() + "] Content isRequired with http error: " + parseBoolean, null, false, 12, null);
                if (!parseBoolean) {
                    MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("webview_html_ad_error");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar.a("result", "failure");
                    dVar.a("required", "false");
                    dVar.a("reason", String.valueOf(webResourceResponse.getStatusCode()));
                    dVar.a("is_loaded", String.valueOf(((Boolean) fdiVar.getValue()).booleanValue()));
                    cVar.a(dVar);
                } else if (((Boolean) fdiVar.getValue()).booleanValue()) {
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("webview_html_ad_ignored_error");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar2.a("result", "failure");
                    dVar2.a("required", "true");
                    dVar2.a("reason", String.valueOf(webResourceResponse.getStatusCode()));
                    dVar2.a("is_loaded", String.valueOf(((Boolean) fdiVar.getValue()).booleanValue()));
                    cVar.a(dVar2);
                    MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already showing but received HTTP " + webResourceResponse.getStatusCode() + ", not setting unrecoverable error", null, false, 12, null);
                } else {
                    int statusCode = webResourceResponse.getStatusCode();
                    if ((statusCode == zk9.n.a || statusCode == zk9.m.a || statusCode < 400 || statusCode >= 500) && jVar.d()) {
                        jVar.a(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), webView);
                    } else {
                        jVar.b(String.valueOf(webResourceResponse.getStatusCode()), webResourceResponse.getStatusCode(), f0.d);
                        MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", "Setting unrecoverable error: " + jVar.j.a.getValue(), null, false, 12, null);
                    }
                }
                fdi fdiVar2 = jVar.n;
                Boolean bool = Boolean.FALSE;
                fdiVar2.getClass();
                fdiVar2.m(null, bool);
                break;
            default:
                com.moloco.sdk.acm.recorder.c cVar2 = jVar.b;
                fdi fdiVar3 = jVar.f;
                k0l k0lVar = (k0l) obj2;
                boolean parseBoolean2 = Boolean.parseBoolean((String) obj);
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", U3.j.d + Thread.currentThread().getName() + "] Content type with webview error is required: " + parseBoolean2, null, false, 12, null);
                if (!parseBoolean2) {
                    MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr3 = com.moloco.sdk.internal.client_metrics_data.a.b;
                    com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d("webview_html_ad_error");
                    com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                    dVar3.a("result", "failure");
                    dVar3.a("required", "false");
                    dVar3.a("reason", String.valueOf(k0lVar.a()));
                    dVar3.a("status_code", String.valueOf(k0lVar.b()));
                    dVar3.a("is_loaded", String.valueOf(((Boolean) fdiVar3.getValue()).booleanValue()));
                    cVar2.a(dVar3);
                } else if (((Boolean) fdiVar3.getValue()).booleanValue()) {
                    MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", "Webview is already showing and received error: " + ((Object) k0lVar.a()), null, false, 12, null);
                    String obj3 = k0lVar.a().toString();
                    obj3.getClass();
                    s sVar = (s) ((Map) s.d.getValue()).get(obj3);
                    if (sVar == null) {
                        sVar = r.e;
                    }
                    if (sVar.c) {
                        jVar.b(k0lVar.a().toString(), k0lVar.b(), f0.c);
                    } else {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr4 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar4 = new com.moloco.sdk.acm.d("webview_html_ad_ignored_error");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr4 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar4.a("result", "failure");
                        dVar4.a("required", "true");
                        dVar4.a("reason", String.valueOf(k0lVar.a()));
                        dVar4.a("status_code", String.valueOf(k0lVar.b()));
                        dVar4.a("is_loaded", String.valueOf(((Boolean) fdiVar3.getValue()).booleanValue()));
                        cVar2.a(dVar4);
                        MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", "Webview is already showing but received " + ((Object) k0lVar.a()) + ", not setting unrecoverable error", null, false, 12, null);
                    }
                } else {
                    String obj4 = k0lVar.a().toString();
                    obj4.getClass();
                    s sVar2 = (s) ((Map) s.d.getValue()).get(obj4);
                    if (sVar2 == null) {
                        sVar2 = r.e;
                    }
                    String a = sVar2.a();
                    z zVar = z.f;
                    if (Intrinsics.c(a, "net::ERR_FAILED") && jVar.c) {
                        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr5 = com.moloco.sdk.internal.client_metrics_data.a.b;
                        com.moloco.sdk.acm.d dVar5 = new com.moloco.sdk.acm.d("webview_html_ad_ignored_error");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr5 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar5.a("result", "failure");
                        dVar5.a("required", "true");
                        dVar5.a("reason", String.valueOf(k0lVar.a()));
                        dVar5.a("status_code", String.valueOf(k0lVar.b()));
                        dVar5.a("is_loaded", String.valueOf(((Boolean) fdiVar3.getValue()).booleanValue()));
                        cVar2.a(dVar5);
                        MolocoLogger.info$default(molocoLogger2, "TemplateWebViewClientImpl", "Ignoring error: " + ((Object) k0lVar.a()) + " with code: " + k0lVar.b() + " since it's marked to be ignored pre load", null, false, 12, null);
                    } else if (sVar2.b && jVar.d()) {
                        jVar.a(k0lVar.a().toString(), k0lVar.b(), webView);
                    } else {
                        jVar.b(k0lVar.a().toString(), k0lVar.b(), f0.c);
                    }
                }
                fdi fdiVar4 = jVar.n;
                Boolean bool2 = Boolean.FALSE;
                fdiVar4.getClass();
                fdiVar4.m(null, bool2);
                break;
        }
    }
}
