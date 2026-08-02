package com.vungle.ads.internal.ui.view;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.vungle.ads.internal.presenter.e0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import defpackage.p2g;
import defpackage.w2g;
import defpackage.xtl;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g implements Runnable {
    public final k a;

    public g(k kVar) {
        kVar.getClass();
        this.a = kVar;
    }

    public static final void a(g gVar) {
        gVar.getClass();
        gVar.run();
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView;
        webView = this.a.b;
        if (webView == null) {
            return;
        }
        try {
            if (!Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new xtl(this, 10));
                return;
            }
            try {
                p2g p2gVar = w2g.b;
                webView.onPause();
                Unit unit = Unit.a;
            } catch (Throwable unused) {
                p2g p2gVar2 = w2g.b;
            }
            try {
                webView.stopLoading();
                Unit unit2 = Unit.a;
            } catch (Throwable unused2) {
                p2g p2gVar3 = w2g.b;
            }
            try {
                webView.setWebChromeClient(null);
                Unit unit3 = Unit.a;
            } catch (Throwable unused3) {
                p2g p2gVar4 = w2g.b;
            }
            try {
                webView.setWebViewClient(new WebViewClient());
                Unit unit4 = Unit.a;
            } catch (Throwable unused4) {
                p2g p2gVar5 = w2g.b;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                try {
                    webView.setWebViewRenderProcessClient(null);
                    Unit unit5 = Unit.a;
                } catch (Throwable unused5) {
                    p2g p2gVar6 = w2g.b;
                }
            }
            try {
                webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
                Unit unit6 = Unit.a;
            } catch (Throwable unused6) {
                p2g p2gVar7 = w2g.b;
            }
            try {
                webView.clearHistory();
                Unit unit7 = Unit.a;
            } catch (Throwable unused7) {
                p2g p2gVar8 = w2g.b;
            }
            try {
                webView.removeAllViews();
                Unit unit8 = Unit.a;
            } catch (Throwable unused8) {
                p2g p2gVar9 = w2g.b;
            }
            try {
                this.a.removeAllViews();
                Unit unit9 = Unit.a;
            } catch (Throwable unused9) {
                p2g p2gVar10 = w2g.b;
            }
            try {
                String eventId = this.a.getEventId();
                if (eventId != null) {
                    e0.a(eventId);
                    Unit unit10 = Unit.a;
                }
            } catch (Throwable unused10) {
                p2g p2gVar11 = w2g.b;
            }
            try {
                webView.destroy();
                Unit unit11 = Unit.a;
            } catch (Throwable unused11) {
                p2g p2gVar12 = w2g.b;
            }
            this.a.b = null;
        } catch (Throwable th) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Destroy webview: ");
            a.append(th.getMessage());
            t.b("MRAIDAdWidget", a.toString());
        }
    }
}
