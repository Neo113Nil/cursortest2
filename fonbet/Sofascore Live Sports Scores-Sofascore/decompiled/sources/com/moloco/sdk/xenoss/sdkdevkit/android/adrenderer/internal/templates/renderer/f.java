package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.a70;
import defpackage.ad2;
import defpackage.ddi;
import defpackage.fdi;
import defpackage.gdi;
import defpackage.hs4;
import defpackage.jof;
import defpackage.lu3;
import defpackage.rob;
import defpackage.s9a;
import defpackage.sq3;
import defpackage.y6a;
import defpackage.z45;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends WebView {
    public static final /* synthetic */ int h = 0;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f a;
    public final com.moloco.sdk.acm.recorder.c b;
    public final j c;
    public final ad2 d;
    public final fdi e;
    public final jof f;
    public final jof g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar2, com.moloco.sdk.acm.recorder.c cVar, boolean z) {
        super(context);
        j jVar = new j(fVar, cVar, z);
        this.a = fVar2;
        this.b = cVar;
        this.c = jVar;
        hs4 hs4Var = z45.a;
        this.d = s9a.c(rob.a);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.a;
        this.e = gdi.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b());
        setWebViewClient(jVar);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.f = jVar.j;
        this.g = jVar.h;
    }

    public static String b() {
        try {
            PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                String str = currentWebViewPackage.versionName;
                if (str != null) {
                    return str;
                }
            }
            return "unknown";
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "WebView version retrieval exception", e, false, 8, null);
            return "unknown";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:26|27))(3:28|29|(1:31))|12|(1:14)(1:24)|15|16|17|18|19))|37|6|7|(0)(0)|12|(0)(0)|15|16|17|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "TemplateWebView", "Creative rendering check URL fire failed", r0, false, 8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00db, code lost:
    
        return kotlin.Unit.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "TemplateWebView", "Creative rendering check failed to sample WebView", r0, false, 8, null);
        r9 = "capture_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a aVar, sq3 sq3Var) {
        c cVar;
        int i;
        if (sq3Var instanceof c) {
            cVar = (c) sq3Var;
            int i2 = cVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.v = i2 - Integer.MIN_VALUE;
                Object obj = cVar.t;
                lu3 lu3Var = lu3.a;
                i = cVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    m mVar = m.a;
                    float f = aVar.c;
                    cVar.r = this;
                    cVar.s = aVar;
                    cVar.v = 1;
                    obj = mVar.a(this, f, cVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = cVar.s;
                    this = cVar.r;
                    y6a.M(obj);
                }
                String str = !((Boolean) obj).booleanValue() ? "black" : "rendered";
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Black screen creative rendering check: result=".concat(str), null, false, 12, null);
                this.getClass();
                String b = b();
                com.moloco.sdk.acm.recorder.c cVar2 = this.b;
                com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
                com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("creative_rendering_check");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar.a("result", str);
                dVar.a("creative_type", aVar.b);
                dVar.a("webview_version", b);
                cVar2.a(dVar);
                Uri build = Uri.parse(aVar.a).buildUpon().appendQueryParameter("result", str).appendQueryParameter("webview_version", b).build();
                com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k b2 = com.moloco.sdk.service_locator.j.b();
                String uri = build.toString();
                uri.getClass();
                b2.a(uri);
                return Unit.a;
            }
        }
        cVar = new c(this, sq3Var);
        Object obj2 = cVar.t;
        lu3 lu3Var2 = lu3.a;
        i = cVar.v;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Black screen creative rendering check: result=".concat(str), null, false, 12, null);
        this.getClass();
        String b3 = b();
        com.moloco.sdk.acm.recorder.c cVar22 = this.b;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.b;
        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d("creative_rendering_check");
        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
        dVar2.a("result", str);
        dVar2.a("creative_type", aVar.b);
        dVar2.a("webview_version", b3);
        cVar22.a(dVar2);
        Uri build2 = Uri.parse(aVar.a).buildUpon().appendQueryParameter("result", str).appendQueryParameter("webview_version", b3).build();
        com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k b22 = com.moloco.sdk.service_locator.j.b();
        String uri2 = build2.toString();
        uri2.getClass();
        b22.a(uri2);
        return Unit.a;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @NotNull
    public final ddi getOrientation$moloco_sdk_release() {
        return this.e;
    }

    @NotNull
    public final ddi getUnrecoverableError() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        s9a.o(this.d, null);
    }
}
