package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.i.ba;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class kc {

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2973 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2974;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2975 = {1025544850, -314566486, -147617137, -1082412112, 138059252, -476438189, -933727488, -1608874423, -927041735, 1280789362, 1927033438, -1624149396, 157163810, 1764982836, 846874785, 1254733006, -1878974093, 1416506261};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private WeakReference<ba.d> f2976;

    /* renamed from: ｋ, reason: contains not printable characters */
    private WeakReference<WebView> f2977;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private boolean f2978;

    public kc(WebView webView) {
        this.f2977 = new WeakReference<>(webView);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m8342() {
        int i = 2 % 2;
        int i2 = f2974 + 37;
        f2973 = i2 % 128;
        int i3 = i2 % 2;
        WebView webView = this.f2977.get();
        int i4 = f2974 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2973 = i4 % 128;
        int i5 = i4 % 2;
        return webView;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final ba.d m8340() {
        int i = 2 % 2;
        int i2 = f2973;
        int i3 = i2 + 13;
        f2974 = i3 % 128;
        int i4 = i3 % 2;
        WeakReference<ba.d> weakReference = this.f2976;
        if (weakReference != null) {
            return weakReference.get();
        }
        int i5 = i2 + 63;
        f2974 = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private void m8335(ba.d dVar) {
        int i = 2 % 2;
        this.f2976 = new WeakReference<>(dVar);
        int i2 = f2973 + 37;
        f2974 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static void m8336(ba.d dVar) {
        int i = 2 % 2;
        new WeakReference(dVar);
        int i2 = f2974 + 71;
        f2973 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8341(WebViewClient webViewClient) {
        int i = 2 % 2;
        int i2 = f2973 + 5;
        f2974 = i2 % 128;
        int i3 = i2 % 2;
        WebView m8342 = m8342();
        if (m8342 != null) {
            try {
                hr hrVar = new hr(ko.m8495(m8342), webViewClient);
                m8335(hrVar);
                m8342.setWebViewClient(hrVar);
                this.f2978 = true;
                int i4 = f2973 + 15;
                f2974 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 61 / 0;
                    return;
                }
                return;
            } catch (Exception e) {
                kl.m8458(m8337(new int[]{1958964947, 1643038258, -1226902848, -1658057597, 305519973, -1135629721, -295575135, -1389772063}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16).intern(), m8337(new int[]{785300948, -1806512046, 215855656, -74328926, -1414176270, 1855323541, -905868023, -14658158, -936110783, 1884754485, 398054873, -1856727316, 1992380902, -619259732}, View.MeasureSpec.getMode(0) + 27).intern(), (Throwable) e, false);
            }
        }
        this.f2978 = false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m8338(WebChromeClient webChromeClient) {
        int i = 2 % 2;
        int i2 = f2973 + 89;
        f2974 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            WebView m8342 = m8342();
            if (m8342 != null) {
                try {
                    WebChromeClient m8492 = ko.m8492(m8342);
                    if (m8492 != null && !(m8492 instanceof WebChromeClient)) {
                        hu huVar = new hu(m8492, webChromeClient);
                        m8336(huVar);
                        m8342.setWebChromeClient(huVar);
                    }
                    int i3 = f2973 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f2974 = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    super.hashCode();
                    throw null;
                } catch (Exception e) {
                    kl.m8458(m8337(new int[]{1958964947, 1643038258, -1226902848, -1658057597, 305519973, -1135629721, -295575135, -1389772063}, Color.red(0) + 16).intern(), m8337(new int[]{785300948, -1806512046, 215855656, -74328926, -1414176270, 1855323541, -905868023, -14658158, -1678569775, -1695975826, -960162793, -77567311, -979943013, 2104793189, 918814131, -838351239}, 29 - Gravity.getAbsoluteGravity(0, 0)).intern(), (Throwable) e, false);
                    return;
                }
            }
            return;
        }
        m8342();
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m8339() {
        boolean z;
        int i = 2 % 2;
        int i2 = f2974 + 109;
        int i3 = i2 % 128;
        f2973 = i3;
        if (i2 % 2 == 0) {
            z = this.f2978;
            int i4 = 44 / 0;
        } else {
            z = this.f2978;
        }
        int i5 = i3 + 15;
        f2974 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8337(int[] iArr, int i) {
        String str;
        synchronized (a.f86) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2975.clone();
            a.f83 = 0;
            while (a.f83 < iArr.length) {
                cArr[0] = (char) (iArr[a.f83] >> 16);
                cArr[1] = (char) iArr[a.f83];
                cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                cArr[3] = (char) iArr[a.f83 + 1];
                a.f84 = (cArr[0] << 16) + cArr[1];
                a.f85 = (cArr[2] << 16) + cArr[3];
                a.m5773(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = a.f84 ^ iArr2[i2];
                    a.f84 = i3;
                    a.f85 = a.m5774(i3) ^ a.f85;
                    int i4 = a.f84;
                    a.f84 = a.f85;
                    a.f85 = i4;
                }
                int i5 = a.f84;
                a.f84 = a.f85;
                a.f85 = i5;
                a.f85 = i5 ^ iArr2[16];
                a.f84 ^= iArr2[17];
                int i6 = a.f84;
                int i7 = a.f85;
                cArr[0] = (char) (a.f84 >>> 16);
                cArr[1] = (char) a.f84;
                cArr[2] = (char) (a.f85 >>> 16);
                cArr[3] = (char) a.f85;
                a.m5773(iArr2);
                cArr2[a.f83 << 1] = cArr[0];
                cArr2[(a.f83 << 1) + 1] = cArr[1];
                cArr2[(a.f83 << 1) + 2] = cArr[2];
                cArr2[(a.f83 << 1) + 3] = cArr[3];
                a.f83 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
