package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.j0;
import com.moloco.sdk.internal.k0;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.ad2;
import defpackage.dmi;
import defpackage.fdi;
import defpackage.fdl;
import defpackage.g7e;
import defpackage.gdi;
import defpackage.jof;
import defpackage.p2g;
import defpackage.rd4;
import defpackage.rq3;
import defpackage.s0l;
import defpackage.si0;
import defpackage.t0l;
import defpackage.u2g;
import defpackage.un0;
import defpackage.w2g;
import defpackage.xl1;
import defpackage.xw3;
import defpackage.zzl;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i0 extends WebViewClientCompat {
    public final com.facebook.c0 a;
    public final xl1 b;
    public final fdi c;
    public final fdi d;
    public final fdi e;
    public final jof f;

    public i0(Context context, com.facebook.c0 c0Var) {
        context.getClass();
        this.a = c0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g7e("/", new s0l(context.getApplicationContext())));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g7e g7eVar = (g7e) it.next();
            arrayList2.add(new t0l((String) g7eVar.a, (s0l) g7eVar.b));
        }
        this.b = new xl1(arrayList2, 4);
        fdi a = gdi.a(Boolean.FALSE);
        this.c = a;
        this.d = a;
        fdi a2 = gdi.a(null);
        this.e = a2;
        this.f = un0.u(a2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Boolean bool = Boolean.TRUE;
        fdi fdiVar = this.c;
        fdiVar.getClass();
        fdiVar.m(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        Boolean bool = Boolean.FALSE;
        fdi fdiVar = this.c;
        fdiVar.getClass();
        fdiVar.m(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.a;
        fdi fdiVar = this.e;
        fdiVar.getClass();
        fdiVar.m(null, dVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", dmi.q("onReceivedError ", str), null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.b;
        fdi fdiVar = this.e;
        fdiVar.getClass();
        fdiVar.m(null, dVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebViewClient", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        if (url == null || (str = url.toString()) == null) {
            str = "";
        }
        Uri parse = Uri.parse(kotlin.text.c.r(str, "mraid.js", "com.moloco.sdk.xenoss.sdkdevkit.mraid.js", true));
        parse.getClass();
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            t0l t0lVar = (t0l) it.next();
            t0lVar.getClass();
            String str2 = t0lVar.a;
            s0l s0lVar = (!parse.getScheme().equals("http") && (parse.getScheme().equals("http") || parse.getScheme().equals(HttpRequest.DEFAULT_SCHEME)) && parse.getAuthority().equals("appassets.androidplatform.net") && parse.getPath().startsWith(str2)) ? t0lVar.b : null;
            if (s0lVar != null) {
                String replaceFirst = parse.getPath().replaceFirst(str2, "");
                try {
                    si0 si0Var = s0lVar.a;
                    String substring = (replaceFirst.length() <= 1 || replaceFirst.charAt(0) != '/') ? replaceFirst : replaceFirst.substring(1);
                    InputStream open = si0Var.a.getAssets().open(substring, 2);
                    if (substring.endsWith(".svgz")) {
                        open = new GZIPInputStream(open);
                    }
                    return new WebResourceResponse(si0.b(replaceFirst), null, open);
                } catch (IOException unused) {
                    return new WebResourceResponse(null, null, null);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014a  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Object u2gVar;
        Object obj;
        Object k0Var;
        Object u2gVar2;
        Uri uri;
        String str2;
        Object u2gVar3;
        String str3;
        Boolean j0;
        if (str == null) {
            return false;
        }
        com.facebook.c0 c0Var = this.a;
        c0Var.getClass();
        rd4 rd4Var = (rd4) c0Var.b;
        try {
            p2g p2gVar = w2g.b;
            u2gVar = Uri.parse(str);
        } catch (Throwable th) {
            p2g p2gVar2 = w2g.b;
            u2gVar = new u2g(th);
        }
        rq3 rq3Var = null;
        if (u2gVar instanceof u2g) {
            u2gVar = null;
        }
        Uri uri2 = (Uri) u2gVar;
        if (uri2 == null) {
            k0Var = new j0(new t(false, "Invalid url: ".concat(str)));
        } else if (Intrinsics.c(uri2.getScheme(), CampaignEx.JSON_KEY_MRAID)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str4 : uri2.getQueryParameterNames()) {
                linkedHashMap.put(str4, TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, uri2.getQueryParameters(str4)));
            }
            String host = uri2.getHost();
            if (host != null) {
                switch (host.hashCode()) {
                    case -1289167206:
                        if (host.equals("expand")) {
                            String str5 = (String) linkedHashMap.get("url");
                            if (str5 == null) {
                                uri = null;
                            } else {
                                try {
                                    p2g p2gVar3 = w2g.b;
                                    u2gVar2 = Uri.parse(str5);
                                } catch (Throwable th2) {
                                    p2g p2gVar4 = w2g.b;
                                    u2gVar2 = new u2g(th2);
                                }
                                if (u2gVar2 instanceof u2g) {
                                    u2gVar2 = null;
                                }
                                uri = (Uri) u2gVar2;
                            }
                            obj = new u(uri);
                            break;
                        }
                        break;
                    case -934437708:
                        host.equals("resize");
                        break;
                    case 3417674:
                        if (host.equals("open") && (str2 = (String) linkedHashMap.get("url")) != null) {
                            try {
                                p2g p2gVar5 = w2g.b;
                                Uri parse = Uri.parse(str2);
                                parse.getClass();
                                u2gVar3 = new v(parse);
                            } catch (Throwable th3) {
                                p2g p2gVar6 = w2g.b;
                                u2gVar3 = new u2g(th3);
                            }
                            if (u2gVar3 instanceof u2g) {
                                u2gVar3 = null;
                            }
                            obj = (v) u2gVar3;
                            break;
                        }
                        break;
                    case 94756344:
                        if (host.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                            obj = s.b;
                            break;
                        }
                        break;
                    case 133423073:
                        if (host.equals("setOrientationProperties") && (str3 = (String) linkedHashMap.get("allowOrientationChange")) != null && (j0 = StringsKt.j0(str3)) != null) {
                            boolean booleanValue = j0.booleanValue();
                            a aVar = y.a;
                            String str6 = (String) linkedHashMap.get("forceOrientation");
                            aVar.getClass();
                            y a = a.a(str6);
                            if (a != null) {
                                obj = new w(booleanValue, a);
                                break;
                            }
                        }
                        break;
                }
                k0Var = obj == null ? new k0(obj) : new j0(new t(true, "Unknown/unsupported mraid command " + uri2.getHost()));
            }
            obj = null;
            if (obj == null) {
            }
            k0Var = obj == null ? new k0(obj) : new j0(new t(true, "Unknown/unsupported mraid command " + uri2.getHost()));
        } else {
            k0Var = new j0(new t(false, "Non-mraid url scheme: ".concat(str)));
        }
        if (k0Var instanceof k0) {
            xw3.L((ad2) rd4Var.b, null, null, new fdl((k0) k0Var, rd4Var, rq3Var, 11), 3);
            return true;
        }
        if (k0Var instanceof j0) {
            return ((t) ((j0) k0Var).a).a;
        }
        zzl.b();
        return false;
    }
}
