package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.cp4;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class W {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f112 = StringFog.decrypt("NcXRFR1QW6gWyd8w\n", "YqCzQ3Q1LP0=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean f111 = true;

    /* renamed from: ｋ, reason: contains not printable characters */
    public static boolean f110 = true;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean f109 = true;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean f108 = false;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static boolean f107 = false;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static V f106 = new V();

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static V f105 = new V();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static WebViewClient m65(WebView webView) {
        JSONObject jSONObject;
        M m67 = m67();
        synchronized (m67) {
            jSONObject = m67.f3206;
        }
        boolean z = true;
        if (jSONObject.optBoolean(StringFog.decrypt("jqEDbA==\n", "6dZ1DxqD1oA=\n"), true)) {
            Context context = webView.getContext();
            if (f110) {
                try {
                    f110 = false;
                    WebView webView2 = new WebView(context);
                    C c = new C(null, new P());
                    webView2.setWebViewClient(c);
                    if (c != webView2.getWebViewClient()) {
                        z = false;
                    }
                    f108 = z;
                } catch (Throwable th) {
                    AbstractC0356.m204(f112, StringFog.decrypt("oYTELczYhiqBld0r0J/FK4LWxSPTncUVgZTgK9uPpi6Nk9g2\n", "5Pa2Qr745UI=\n"), th, false);
                }
            }
            if (f108) {
                return webView.getWebViewClient();
            }
        }
        m71(webView.getContext());
        InterfaceC0264 m69 = m69(webView, new T(), f106);
        if (m69 != null) {
            return (WebViewClient) ((C1179) m69).m665();
        }
        cp4.h(StringFog.decrypt("IMcSVnqHeDpDzg5UeskIKwH+Dl9pqjMnBsYTGniAOiIH\n", "Y6hnOh7pX04=\n"));
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0264 m69(WebView webView, InterfaceC0248 interfaceC0248, V v) {
        Object m665;
        try {
            if (!v.f104 && !v.f103) {
                return null;
            }
            C1037 c1037 = m67().f3205;
            JSONObject jSONObject = c1037.f3308;
            String str = c1037.f3314;
            List list = c1037.f3316;
            String str2 = AbstractC0523.f1759;
            JSONArray optJSONArray = jSONObject.optJSONArray(str);
            if (optJSONArray != null) {
                list = AbstractC0523.m344(optJSONArray);
            }
            C1037 c10372 = m67().f3205;
            InterfaceC0264 m70 = m70(webView, interfaceC0248, list, c10372.f3308.optInt(c10372.f3313, 7));
            if (v.f103 && m70 != null && (m665 = ((C1179) m70).m665()) != null && !m665.getClass().equals(((C1179) m70).f3712.getType())) {
                C1037 c10373 = m67().f3205;
                JSONObject jSONObject2 = c10373.f3308;
                String str3 = c10373.f3312;
                List list2 = c10373.f3315;
                JSONArray optJSONArray2 = jSONObject2.optJSONArray(str3);
                if (optJSONArray2 != null) {
                    list2 = AbstractC0523.m344(optJSONArray2);
                }
                C1037 c10374 = m67().f3205;
                return m70(m665, interfaceC0248, list2, c10374.f3308.optInt(c10374.f3311, 2));
            }
            return m70;
        } catch (Throwable th) {
            AbstractC0356.m204(f112, StringFog.decrypt("nQNR6mzWAZCsBUrredYFmbEUTfE+kA+QtBU=\n", "2HEjhR72ZvU=\n"), th, false);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WebChromeClient m66(WebView webView) {
        JSONObject jSONObject;
        M m67 = m67();
        synchronized (m67) {
            jSONObject = m67.f3206;
        }
        if (jSONObject.optBoolean(StringFog.decrypt("8MpJSw==\n", "l70qKL6k+H0=\n"), true)) {
            Context context = webView.getContext();
            if (f109) {
                f109 = false;
                WebView webView2 = new WebView(context);
                C3982u c3982u = new C3982u(new Q());
                webView2.setWebChromeClient(c3982u);
                f107 = c3982u == webView2.getWebChromeClient();
            }
            if (f107) {
                return webView.getWebChromeClient();
            }
        }
        m71(webView.getContext());
        InterfaceC0264 m69 = m69(webView, new U(), f105);
        if (m69 != null) {
            return (WebChromeClient) ((C1179) m69).m665();
        }
        cp4.h(StringFog.decrypt("EbLdMEUT0DZyu8EyRV2gJzCewC5OEJIBPrTNMlVdkSs3scw=\n", "Ut2oXCF990I=\n"));
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m71(Context context) {
        if (f111) {
            f111 = false;
            try {
                WebView webView = new WebView(context);
                C c = new C(null, new N());
                webView.setWebViewClient(c);
                C3982u c3982u = new C3982u(new O());
                webView.setWebChromeClient(c3982u);
                f106 = m68(webView, c, new T());
                f105 = m68(webView, c3982u, new U());
            } catch (Throwable th) {
                AbstractC0356.m204(f112, StringFog.decrypt("AUvNw+Lhx6QhWtTF/qaEqitLn8X+r8G+ZFrTxfWv0L8=\n", "RDm/rJDBpMw=\n"), th, false);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static V m68(WebView webView, InterfaceC0823 interfaceC0823, InterfaceC0248 interfaceC0248) {
        V v = new V();
        C1037 c1037 = m67().f3205;
        JSONObject jSONObject = c1037.f3308;
        String str = c1037.f3314;
        List list = c1037.f3316;
        String str2 = AbstractC0523.f1759;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            list = AbstractC0523.m344(optJSONArray);
        }
        C1037 c10372 = m67().f3205;
        InterfaceC0264 m70 = m70(webView, interfaceC0248, list, c10372.f3308.optInt(c10372.f3313, 7));
        if (m70 != null) {
            Object m665 = ((C1179) m70).m665();
            if (m665 == interfaceC0823) {
                v.f104 = true;
                return v;
            }
            C1037 c10373 = m67().f3205;
            JSONObject jSONObject2 = c10373.f3308;
            String str3 = c10373.f3312;
            List list2 = c10373.f3315;
            JSONArray optJSONArray2 = jSONObject2.optJSONArray(str3);
            if (optJSONArray2 != null) {
                list2 = AbstractC0523.m344(optJSONArray2);
            }
            C1037 c10374 = m67().f3205;
            InterfaceC0264 m702 = m70(m665, interfaceC0248, list2, c10374.f3308.optInt(c10374.f3311, 2));
            if (m702 != null && ((C1179) m702).m665() == interfaceC0823) {
                v.f103 = true;
            }
        }
        return v;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static InterfaceC0264 m70(Object obj, InterfaceC0248 interfaceC0248, List list, int i) {
        C1050 c1050 = C0267.m139().f487;
        S s = new S(list);
        c1050.getClass();
        C1091 c1091 = new C1091();
        C1103 c1103 = c1091.f3400;
        c1103.f3472 = -1;
        c1091.f3399 = interfaceC0248;
        c1091.f3398 = s;
        c1103.f3477 = list;
        c1103.f3476 = i;
        c1103.f3479 = interfaceC0248.getClass();
        c1091.f3400.f3478 = S.class;
        return c1050.m626(obj, c1091);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized M m67() {
        M m;
        synchronized (W.class) {
            m = ((C0346) AbstractC0274.m142()).f859;
        }
        return m;
    }
}
