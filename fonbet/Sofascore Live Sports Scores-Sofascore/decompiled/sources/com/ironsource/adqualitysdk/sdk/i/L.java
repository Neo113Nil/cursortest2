package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class L implements InterfaceC0705 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final WeakHashMap f98;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f99 = new HashSet();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final E f100;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f101;

    static {
        StringFog.decrypt("7evhzWPsfiPT/ff+ZOx7\n", "uo6DmwqJCW8=\n");
        f98 = new WeakHashMap();
    }

    public L(WebView webView, String str) {
        this.f101 = str;
        E e = new E(webView);
        this.f100 = e;
        m59();
        new K(this);
        WebView webView2 = (WebView) e.f78.get();
        if (webView2 != null) {
            try {
                W.m66(webView2);
            } catch (Exception e2) {
                AbstractC0356.m204(E.f75, StringFog.decrypt("VkHWuxMshbRnR826Biy1tHFwzKYOYYeSf1rBuhU=\n", "EzOk1GEM4tE=\n"), (Throwable) e2, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m59() {
        E e = this.f100;
        J j = new J(this);
        WebView webView = (WebView) e.f78.get();
        if (webView != null) {
            try {
                C c = new C(W.m65(webView), j);
                e.f77 = new WeakReference(c);
                webView.setWebViewClient(c);
                e.f76 = true;
                return;
            } catch (Exception e2) {
                AbstractC0356.m204(E.f75, StringFog.decrypt("wGFtwJX8BdXxZ3bBgPw11edFdsqQnw7Z4H1r\n", "hRMfr+fcYrA=\n"), (Throwable) e2, false);
            }
        }
        e.f76 = false;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo60(WebView webView) {
        Iterator it = new HashSet(this.f99).iterator();
        while (it.hasNext()) {
            InterfaceC0705 interfaceC0705 = (InterfaceC0705) it.next();
            if (interfaceC0705 != null) {
                interfaceC0705.mo60(webView);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo62(WebView webView, String str, String str2) {
        Iterator it = new HashSet(this.f99).iterator();
        while (it.hasNext()) {
            InterfaceC0705 interfaceC0705 = (InterfaceC0705) it.next();
            if (interfaceC0705 != null) {
                interfaceC0705.mo62(webView, str, str2);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo63(WebView webView, String str, boolean z) {
        Iterator it = new HashSet(this.f99).iterator();
        while (it.hasNext()) {
            InterfaceC0705 interfaceC0705 = (InterfaceC0705) it.next();
            if (interfaceC0705 != null) {
                interfaceC0705.mo63(webView, str, z);
            }
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0705
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo61(WebView webView, String str) {
        Iterator it = new HashSet(this.f99).iterator();
        while (it.hasNext()) {
            InterfaceC0705 interfaceC0705 = (InterfaceC0705) it.next();
            if (interfaceC0705 != null) {
                interfaceC0705.mo61(webView, str);
            }
        }
    }
}
