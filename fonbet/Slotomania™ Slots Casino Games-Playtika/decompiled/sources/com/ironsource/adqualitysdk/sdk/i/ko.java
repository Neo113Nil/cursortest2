package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Field;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class ko {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f3066 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static d f3067;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f3068;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f3069;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f3070;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static d f3071;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3072;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3073;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3074;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f3075;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f3076;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8487() {
        f3068 = (char) 6;
        f3070 = new char[]{'j', 'a', 'v', GMTDateParser.SECONDS, 'c', 'r', 'i', 'p', 't', AbstractJsonLexerKt.COLON, 'e', 'l', '(', 'o', 'b', '\"', ')', ';', 'C', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.DAY_OF_MONTH, 'n', '\'', ' ', 'f', 'W', 'V', 'w', GMTDateParser.HOURS, GMTDateParser.MINUTES, 'U', 'E', 'k', 'g', 'q', 'x'};
    }

    static {
        m8487();
        f3075 = true;
        f3072 = true;
        f3076 = true;
        byte b = 0;
        f3074 = false;
        f3073 = false;
        f3071 = new d(b);
        f3067 = new d(b);
        int i = f3069 + 21;
        f3066 = i % 128;
        int i2 = i % 2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static synchronized at m8496() {
        at mo6053;
        synchronized (ko.class) {
            int i = 2 % 2;
            int i2 = f3066 + 69;
            f3069 = i2 % 128;
            int i3 = i2 % 2;
            mo6053 = ar.m6041().mo6053();
            int i4 = f3069 + 31;
            f3066 = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
        return mo6053;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8491(WebView webView, String str) {
        int i = 2 % 2;
        int i2 = f3066 + 3;
        f3069 = i2 % 128;
        int i3 = i2 % 2;
        if (webView != null) {
            if (webView.getHandler() == null && webView.getRootView() == null) {
                return;
            }
            IronSourceNetworkBridge.webviewLoadUrl(webView, new StringBuilder().append(m8486(23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0001\u0002\u0003\u0002\u0004\u0005\u0000\u000b\b\t\n\u000b\u0003\u0002\u0006\u0011\u0002\u0007\u000e\u000f\r\u0010", (byte) (33 - TextUtils.getOffsetBefore("", 0))).intern()).append(str).append(m8486(TextUtils.getOffsetBefore("", 0) + 4, "\u0010\u0011\u0011\f", (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 36)).intern()).toString());
            int i4 = f3069 + 77;
            f3066 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WebViewClient m8495(WebView webView) {
        int i = 2 % 2;
        if (Build.VERSION.SDK_INT >= 26) {
            int i2 = f3069 + 97;
            f3066 = i2 % 128;
            if (i2 % 2 == 0) {
                m8496().m6131();
                throw null;
            }
            if (m8496().m6131() && m8488(webView.getContext())) {
                int i3 = f3069 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f3066 = i3 % 128;
                if (i3 % 2 != 0) {
                    return webView.getWebViewClient();
                }
                int i4 = 33 / 0;
                return webView.getWebViewClient();
            }
        }
        Cif<WebViewClient> m8485 = m8485(webView);
        if (m8485 != null) {
            return m8485.mo7966();
        }
        throw new RuntimeException(m8486(33 - Drawable.resolveOpacity(0, 0), "\u0013\f\u0017\u0007\u0015\u0016\u0014\n\u0012\u001d\t\u0012\u0015\u0012\u001c\u0007\u0014 \u0007\u000b\u0018\u0015\u0006\u0007\t\u0016\u000b\u0014\u001e\f\u000b\u0006§", (byte) (67 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static WebChromeClient m8492(WebView webView) {
        int i = 2 % 2;
        int i2 = f3066 + 91;
        f3069 = i2 % 128;
        if ((i2 % 2 != 0 || Build.VERSION.SDK_INT >= 26) && !(!m8496().m6129()) && m8499(webView.getContext())) {
            int i3 = f3066 + 1;
            f3069 = i3 % 128;
            if (i3 % 2 == 0) {
                return webView.getWebChromeClient();
            }
            webView.getWebChromeClient();
            Object obj = null;
            super.hashCode();
            throw null;
        }
        Cif<WebChromeClient> m8489 = m8489(webView);
        if (m8489 == null) {
            throw new RuntimeException(m8486(35 - TextUtils.getTrimmedLength(""), "\u0013\f\u0017\u0007\u0015\u0016\u0014\n\u0012\u001d\t\u0012\u0015\u0012\u001c\u0007\f\u0014\u001d\u0004\u0011\u0019\u0006\u0016\u0006\u0007\t\u0016\u000b\u0014\u001e\f\u000b\u0006Â", (byte) (94 - Drawable.resolveOpacity(0, 0))).intern());
        }
        return m8489.mo7966();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m8484(WebView webView) {
        int i = 2 % 2;
        int i2 = f3066 + 17;
        f3069 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = m8495(webView) instanceof hr;
        if (i3 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Cif<WebViewClient> m8485(WebView webView) {
        int i = 2 % 2;
        int i2 = f3069 + 69;
        f3066 = i2 % 128;
        if (i2 % 2 == 0) {
            m8483(webView.getContext());
            int i3 = 52 / 0;
            return m8497(webView, m8493(), f3071);
        }
        m8483(webView.getContext());
        return m8497(webView, m8493(), f3071);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static Cif<WebChromeClient> m8489(WebView webView) {
        int i = 2 % 2;
        int i2 = f3069 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3066 = i2 % 128;
        if (i2 % 2 != 0) {
            m8483(webView.getContext());
            return m8497(webView, m8482(), f3067);
        }
        m8483(webView.getContext());
        m8497(webView, m8482(), f3067);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m8483(Context context) {
        int i = 2 % 2;
        int i2 = f3066 + 21;
        f3069 = i2 % 128;
        int i3 = i2 % 2;
        if (f3075) {
            f3075 = false;
            try {
                WebView webView = new WebView(context);
                hr hrVar = new hr(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.5
                    @Override // android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
                        super.onPageStarted(view, url, favicon);
                        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                        super.onReceivedError(view, errorCode, description, failingUrl);
                        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, view, errorCode, description, failingUrl);
                    }

                    @Override // android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, view, url, shouldOverrideUrlLoading);
                        return shouldOverrideUrlLoading;
                    }
                });
                webView.setWebViewClient(hrVar);
                hu huVar = new hu(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.2
                });
                webView.setWebChromeClient(huVar);
                f3071 = m8494(webView, hrVar, m8493());
                f3067 = m8494(webView, huVar, m8482());
                int i4 = f3069 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                f3066 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                kl.m8458(m8486(12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u001c\u0007\u0014 \u0007\u000b\u0018!\t\u0007\t\u0005", (byte) (80 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), m8486(32 - Drawable.resolveOpacity(0, 0), "#\u0001\u0001\u0011\u000b\u001d\n\"\u0010\n\u001e\b\u001b\u0003\u0012\u001d\u0011\u0001\u0012\u000bãã\u000b\u0004\u0016\u0005\u0006\u0007\t\u0016\t\u0002", (byte) ((ViewConfiguration.getTouchSlop() >> 8) + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)).intern(), th, false);
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m8488(Context context) {
        boolean z;
        int i = 2 % 2;
        if (f3072) {
            try {
                f3072 = false;
                WebView webView = new WebView(context);
                hr hrVar = new hr(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.1
                    @Override // android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageStarted(WebView view, String url, Bitmap favicon) {
                        super.onPageStarted(view, url, favicon);
                        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                        super.onReceivedError(view, errorCode, description, failingUrl);
                        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, view, errorCode, description, failingUrl);
                    }

                    @Override // android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                    }

                    @Override // android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
                        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, view, url, shouldOverrideUrlLoading);
                        return shouldOverrideUrlLoading;
                    }
                });
                webView.setWebViewClient(hrVar);
                if (hrVar == webView.getWebViewClient()) {
                    int i2 = f3069 + 29;
                    f3066 = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                f3074 = z;
                int i4 = f3069 + 27;
                f3066 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                kl.m8458(m8486(12 - TextUtils.getCapsMode("", 0, 0), "\u001c\u0007\u0014 \u0007\u000b\u0018!\t\u0007\t\u0005", (byte) (Color.blue(0) + 79)).intern(), m8486((ViewConfiguration.getTapTimeout() >> 16) + 36, "#\u0001\u0001\u0011\u000b\u001d\n\"\u0010\n\u001e\b\u001b\u0003\u0012\u000b\u001d\u0012\u0004\u0002\u001c\u000b\u0013\u001d\b\u0010\u0018\b\t\u001c\u0017\u0006\u0007\u000b\u0014\t", (byte) (Color.argb(0, 0, 0, 0) + 16)).intern(), th, false);
            }
        }
        return f3074;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m8499(Context context) {
        int i = 2 % 2;
        if (f3076) {
            boolean z = false;
            f3076 = false;
            WebView webView = new WebView(context);
            hu huVar = new hu(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.3
            });
            webView.setWebChromeClient(huVar);
            if (huVar == webView.getWebChromeClient()) {
                int i2 = f3066 + 35;
                f3069 = i2 % 128;
                int i3 = i2 % 2;
                z = true;
            } else {
                int i4 = f3066 + 95;
                f3069 = i4 % 128;
                int i5 = i4 % 2;
            }
            f3073 = z;
        }
        return f3073;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static <T> d m8494(WebView webView, T t, ii iiVar) {
        int i = 2 % 2;
        d dVar = new d((byte) 0);
        Cif m8481 = m8481(webView, iiVar, m8496().m6130(), m8496().m6132());
        if (m8481 != null) {
            int i2 = f3069 + 73;
            f3066 = i2 % 128;
            int i3 = i2 % 2;
            Object mo7966 = m8481.mo7966();
            if (mo7966 == t) {
                dVar.m8502();
                return dVar;
            }
            Cif m8490 = m8490(mo7966, iiVar, m8496().m6133(), m8496().m6134());
            if (m8490 != null) {
                int i4 = f3069 + 9;
                f3066 = i4 % 128;
                Object obj = null;
                if (i4 % 2 != 0) {
                    if (m8490.mo7966() != t) {
                        return dVar;
                    }
                    int i5 = f3069 + 57;
                    f3066 = i5 % 128;
                    if (i5 % 2 != 0) {
                        dVar.m8504();
                        return dVar;
                    }
                    dVar.m8504();
                    super.hashCode();
                    throw null;
                }
                m8490.mo7966();
                super.hashCode();
                throw null;
            }
        }
        return dVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> Cif<T> m8497(WebView webView, ii iiVar, d dVar) {
        T mo7966;
        int i = 2 % 2;
        int i2 = f3066 + 97;
        f3069 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                int i3 = 64 / 0;
                if (!dVar.m8501()) {
                    return null;
                }
            } else if (!dVar.m8501()) {
                return null;
            }
            Cif<T> m8481 = m8481(webView, iiVar, m8496().m6130(), m8496().m6132());
            if (!dVar.m8503() || m8481 == null || (mo7966 = m8481.mo7966()) == null) {
                return m8481;
            }
            int i4 = f3066 + 63;
            f3069 = i4 % 128;
            int i5 = i4 % 2;
            return !mo7966.getClass().equals(m8481.mo7967().getType()) ? m8490(mo7966, iiVar, m8496().m6133(), m8496().m6134()) : m8481;
        } catch (Throwable th) {
            kl.m8458(m8486(12 - Color.alpha(0), "\u001c\u0007\u0014 \u0007\u000b\u0018!\t\u0007\t\u0005", (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 79)).intern(), m8486(KeyEvent.normalizeMetaState(0) + 26, "#\u0001\u0001\u0011\u000b\u001d\"\t\u00ad\u00ad\t\u0012#\u0015\u0005\n\u0007\u000b\u0014\t\u0012\u001d\u0007\u000b\b\u0017", (byte) (57 - KeyEvent.getDeadChar(0, 0))).intern(), th, false);
            return null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static <T> Cif<T> m8481(WebView webView, ii iiVar, List<String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f3066 + 69;
        f3069 = i3 % 128;
        int i4 = i3 % 2;
        Cif<T> m8498 = m8498(webView, iiVar, list, i);
        int i5 = f3069 + 45;
        f3066 = i5 % 128;
        int i6 = i5 % 2;
        return m8498;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static <T> Cif<T> m8490(T t, ii iiVar, List<String> list, int i) {
        int i2 = 2 % 2;
        int i3 = f3066 + 53;
        f3069 = i3 % 128;
        int i4 = i3 % 2;
        Cif<T> m8498 = m8498(t, iiVar, list, i);
        int i5 = f3069 + 113;
        f3066 = i5 % 128;
        int i6 = i5 % 2;
        return m8498;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static <T> Cif<T> m8498(Object obj, ii iiVar, final List<String> list, int i) {
        int i2 = 2 % 2;
        Cif<T> m8048 = id.m7937().m7939().m8048(obj, iiVar, new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* renamed from: ｋ */
            public final Field[] mo7875(Object obj2) {
                id.m7937().m7940();
                return hw.m7867(obj2.getClass(), true, -1, list);
            }
        }, list, i);
        int i3 = f3066 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f3069 = i3 % 128;
        int i4 = i3 % 2;
        return m8048;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static ii m8493() {
        int i = 2 % 2;
        ii iiVar = new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7428(Cif cif) {
                return WebViewClient.class.equals(cif.mo7967().getType());
            }
        };
        int i2 = f3066 + 29;
        f3069 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 39 / 0;
        }
        return iiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static ii m8482() {
        int i = 2 % 2;
        ii iiVar = new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.7
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* renamed from: ﻐ */
            public final boolean mo7428(Cif cif) {
                return WebChromeClient.class.equals(cif.mo7967().getType());
            }
        };
        int i2 = f3066 + 61;
        f3069 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return iiVar;
    }

    static class d {

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean f3078;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3079;

        private d() {
            this.f3079 = false;
            this.f3078 = false;
        }

        /* synthetic */ d(byte b) {
            this();
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private boolean m8500() {
            return this.f3079;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        final void m8502() {
            this.f3079 = true;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        final boolean m8503() {
            return this.f3078;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        final void m8504() {
            this.f3078 = true;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        final boolean m8501() {
            return m8500() || m8503();
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8486(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f3070;
            char c = f3068;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
