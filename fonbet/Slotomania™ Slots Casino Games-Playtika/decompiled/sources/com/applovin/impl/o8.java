package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class o8 {
    private static String a;
    private static int d;
    private static String e;
    private static String f;
    private static final Object b = new Object();
    private static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean g = new AtomicBoolean();

    static {
        com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.E0;
        if (lVar != null && ((Boolean) lVar.a(z4.j4)).booleanValue() && e()) {
            a = (String) c5.a(b5.M, "", com.applovin.impl.sdk.l.p());
        } else {
            a = "";
            c5.b(b5.M, (Object) null, com.applovin.impl.sdk.l.p());
        }
    }

    public static void a(final com.applovin.impl.sdk.l lVar) {
        if (c.getAndSet(true)) {
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.o8$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                o8.d(com.applovin.impl.sdk.l.this);
            }
        });
    }

    public static String b() {
        return f;
    }

    public static String c() {
        return e;
    }

    public static int d() {
        return d;
    }

    private static boolean e() {
        boolean isValidString;
        synchronized (b) {
            isValidString = StringUtils.isValidString((String) c5.a(b5.M, "", com.applovin.impl.sdk.l.p()));
        }
        return isValidString;
    }

    public static void b(com.applovin.impl.sdk.l lVar) {
        if (g.getAndSet(true)) {
            return;
        }
        PackageInfo c2 = c(lVar);
        if (c2 != null) {
            d = c2.versionCode;
            e = c2.versionName;
            f = c2.packageName;
        } else {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().b("WebViewDataCollector", "Failed to get WebView package info");
            }
        }
    }

    private static PackageInfo c(com.applovin.impl.sdk.l lVar) {
        PackageManager packageManager = com.applovin.impl.sdk.l.p().getPackageManager();
        if (p0.e()) {
            return WebView.getCurrentWebViewPackage();
        }
        Iterator it = lVar.c(z4.u4).iterator();
        while (it.hasNext()) {
            try {
                return packageManager.getPackageInfo((String) it.next(), 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(com.applovin.impl.sdk.l lVar) {
        try {
            synchronized (b) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(com.applovin.impl.sdk.l.p());
                if (!TextUtils.isEmpty(defaultUserAgent)) {
                    a = defaultUserAgent;
                    c5.b(b5.M, a, com.applovin.impl.sdk.l.p());
                } else {
                    lVar.Q();
                    if (com.applovin.impl.sdk.p.a()) {
                        lVar.Q().b("WebViewDataCollector", "Collected invalid user agent");
                    }
                    lVar.E().a(f2.k1, "collectedInvalidUserAgent");
                }
            }
        } catch (Throwable th) {
            lVar.Q();
            if (com.applovin.impl.sdk.p.a()) {
                lVar.Q().a("WebViewDataCollector", "Failed to collect user agent", th);
            }
            lVar.E().a("WebViewDataCollector", "collectUserAgent", th);
        }
    }

    public static String a() {
        String str;
        synchronized (b) {
            str = a;
        }
        return str;
    }
}
