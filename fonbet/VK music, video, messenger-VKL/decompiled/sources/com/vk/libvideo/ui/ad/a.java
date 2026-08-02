package com.vk.libvideo.ui.ad;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vk.libvideo.ui.ad.a;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import xsna.air;
import xsna.drm0;
import xsna.dsw;
import xsna.epx;
import xsna.gzs;
import xsna.pn00;
import xsna.s3q0;
import xsna.v390;
import xsna.y390;
import xsna.zr;

/* compiled from: AdvertBannerView.kt */
/* loaded from: classes3.dex */
public final class a extends WebViewClient {
    public final /* synthetic */ AdvertBannerView a;
    public final /* synthetic */ AdvertBannerView.Style b;
    public final /* synthetic */ gzs<s3q0> c;

    /* compiled from: AdvertBannerView.kt */
    /* renamed from: com.vk.libvideo.ui.ad.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1251a extends FunctionReferenceImpl implements gzs<s3q0> {
        final /* synthetic */ gzs<s3q0> $onLoaded;
        final /* synthetic */ AdvertBannerView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1251a(AdvertBannerView advertBannerView, gzs<s3q0> gzsVar) {
            super(0, epx.a.class, "onEndLoading", "loadTemplate$onEndLoading(Lcom/vk/libvideo/ui/ad/AdvertBannerView;Lkotlin/jvm/functions/Function0;)V", 0);
            this.this$0 = advertBannerView;
            this.$onLoaded = gzsVar;
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            AdvertBannerView advertBannerView = this.this$0;
            gzs<s3q0> gzsVar = this.$onLoaded;
            advertBannerView.c = true;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            return s3q0.a;
        }
    }

    public a(AdvertBannerView advertBannerView, AdvertBannerView.Style style, gzs<s3q0> gzsVar) {
        this.a = advertBannerView;
        this.b = style;
        this.c = gzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        AdvertBannerView advertBannerView = this.a;
        int color = advertBannerView.getContext().getColor(R.color.vk_black);
        String b = air.b('\'', "document.querySelector('.freebet-banner').style.background = '", "rgba(" + Color.red(color) + ", " + Color.green(color) + ", " + Color.blue(color) + ", 0.75)");
        StringBuilder sb = new StringBuilder("javascript:");
        sb.append(b);
        sb.append(';');
        advertBannerView.evaluateJavascript(sb.toString(), null);
        gzs<s3q0> gzsVar = this.c;
        AdvertBannerView.Style style = this.b;
        if (style == null) {
            advertBannerView.c = true;
            gzsVar.invoke();
            return;
        }
        final C1251a c1251a = new C1251a(advertBannerView, gzsVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("imageWidth", style.k() + "px");
        linkedHashMap.put("imageHeight", style.k() + "px");
        linkedHashMap.put("iconPadding", style.j() + "px");
        linkedHashMap.put("borderImageRadius", style.i() + "px");
        linkedHashMap.put("borderRadius", style.h() + "px");
        linkedHashMap.put("titleDisplay", style.l() ? "flex" : "none");
        advertBannerView.evaluateJavascript(zr.a("javascript:updateBannerStyles(", new JSONObject(pn00.t(linkedHashMap)).toString(), ");"), new ValueCallback() { // from class: xsna.q31
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                a.C1251a.this.invoke();
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.a.c = false;
        super.onPageStarted(webView, str, bitmap);
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
                    L.u(l, L.LogType.d, new Object[]{"AdvertBannerView: skip SSL for ".concat(str)});
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

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return true;
    }
}
