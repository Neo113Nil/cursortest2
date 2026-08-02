package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.base.b;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* compiled from: MBWebViewChecker.java */
/* loaded from: classes13.dex */
public final class a {
    private static volatile Boolean a;
    private static volatile Handler b;
    private static Boolean c;

    /* compiled from: MBWebViewChecker.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.webEnvCheck.a$a, reason: collision with other inner class name */
    public class RunnableC0300a implements Runnable {
        final /* synthetic */ Context a;

        public RunnableC0300a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.a == null) {
                try {
                    Boolean unused = a.a = Boolean.valueOf(a.a(this.a));
                } catch (Exception unused2) {
                    Boolean unused3 = a.a = Boolean.FALSE;
                }
            }
        }
    }

    public static boolean b(Context context) {
        g gVar;
        try {
            gVar = i.b().d(c.n().b());
        } catch (Exception unused) {
            gVar = null;
        }
        if (gVar != null) {
            c = Boolean.valueOf(gVar.I0());
        } else {
            c = Boolean.FALSE;
        }
        Boolean bool = c;
        if (bool == null || !bool.booleanValue()) {
            return true;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (a == null) {
                try {
                    a = Boolean.valueOf(a(context));
                } catch (Exception unused2) {
                    a = Boolean.FALSE;
                }
            }
            if (a == null) {
                a = new Boolean(false);
            }
            return a.booleanValue();
        }
        if (a == null && b == null) {
            b = new Handler(Looper.getMainLooper());
            b.post(new RunnableC0300a(context));
        }
        if (a == null) {
            return true;
        }
        return a.booleanValue();
    }

    public static boolean a(Context context) {
        WebView webView;
        try {
            webView = new WebView(context);
            webView.setWebViewClient(new b());
        } catch (Exception unused) {
            webView = null;
        }
        if (webView == null) {
            return false;
        }
        a(webView);
        return true;
    }

    private static void a(WebView webView) {
        try {
            webView.destroy();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBWebViewChecker", "destroy webview error", e);
            }
        }
    }
}
