package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractViewOnLayoutChangeListenerC3987z extends AbstractC0984 implements View.OnLayoutChangeListener {

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f282 = StringFog.decrypt("t5oCzYfQTTCEtwH1itlfAw==\n", "4P9gm+61OnE=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public I f284;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public L f286;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public boolean f287;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public boolean f288;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public String f289;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public List f290;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final WeakHashMap f285 = new WeakHashMap();

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final ArrayList f283 = new ArrayList();

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            if (view instanceof WebView) {
                WebView webView = (WebView) view;
                if (this.f285.containsKey(webView)) {
                    m124(webView);
                }
            }
        } catch (Throwable th) {
            AbstractC0356.m204(f282, StringFog.decrypt("q/2/zQt74QPO4KPuGCLnGJrMpcMXPO0=\n", "7o/NonlbiG0=\n"), th, false);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0984, com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﻛ */
    public final void mo96(JSONObject jSONObject, View view, Object obj) {
        jSONObject.remove(AbstractC0615.f2034);
        super.mo96(jSONObject, (WebView) view, obj);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m124(WebView webView) {
        L l = (L) this.f285.get(webView);
        if (this.f288 && l.f100.f76) {
            if (!(W.m65(webView) instanceof C)) {
                l.m59();
            }
            I i = this.f284;
            i.getClass();
            try {
                AbstractC1008.m611(new H(i, webView));
            } catch (Exception e) {
                AbstractC0420.m243(I.f89, StringFog.decrypt("zF90nLIWcLLjSGWHqVh+/ONeJoevFm6563tvlrcMOQ==\n", "iS0G88A2Gdw=\n") + e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: ﾇ */
    public abstract Object mo54(WebView webView);

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m125(WebView webView) {
        if (webView == null || this.f285.containsKey(webView)) {
            return;
        }
        String decrypt = StringFog.decrypt("Somak3uPxygE\n", "K+35/xnk/Qc=\n");
        WeakHashMap weakHashMap = L.f98;
        L l = (L) weakHashMap.get(webView);
        if (l == null) {
            l = new L(webView, decrypt);
            weakHashMap.put(webView, l);
        }
        if (this.f286 == null) {
            this.f286 = l;
        }
        this.f285.put(webView, l);
        C3986y c3986y = new C3986y(this);
        this.f283.add(c3986y);
        l.f99.add(c3986y);
        m124(webView);
        webView.addOnLayoutChangeListener(this);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m123(AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z, String str) {
        abstractViewOnLayoutChangeListenerC3987z.getClass();
        try {
            String decode = URLDecoder.decode(str, StringFog.decrypt("f9y5gms=\n", "Koj/r1Ps5PQ=\n"));
            if (!TextUtils.isEmpty(decode)) {
                return new JSONObject(decode);
            }
        } catch (Exception e) {
            String str2 = f282;
            AbstractC0420.m252(str2, str2, StringFog.decrypt("+p4bmeLMaHfLmACY98xrc8uN\n", "v+xp9pDsDxI=\n"), e, null, false);
        }
        return new JSONObject();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0984
    /* renamed from: ﾒ */
    public final String mo79(Object obj) {
        return this.f289;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractC0984, com.ironsource.adqualitysdk.sdk.i.InterfaceC0881
    /* renamed from: ﾒ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final void mo98(JSONObject jSONObject, WebView webView, Object obj) {
        if (webView != null) {
            try {
                jSONObject.put(AbstractC0615.f1991, webView.getWindowToken() != null);
            } catch (JSONException unused) {
            }
        }
        super.mo98(jSONObject, webView, obj);
    }
}
