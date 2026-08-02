package com.mbridge.msdk.splash.manager;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.splash.view.MBSplashView;
import com.mbridge.msdk.splash.view.MBSplashWebview;
import defpackage.lnb;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class g {
    private boolean a;
    private boolean b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a extends com.mbridge.msdk.mbsignalcommon.listener.b {
        final /* synthetic */ c a;
        final /* synthetic */ MBSplashView b;
        final /* synthetic */ CampaignEx c;
        final /* synthetic */ String d;
        final /* synthetic */ long e;

        public a(c cVar, MBSplashView mBSplashView, CampaignEx campaignEx, String str, long j) {
            this.a = cVar;
            this.b = mBSplashView;
            this.c = campaignEx;
            this.d = str;
            this.e = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            super.a(webView, i);
            c cVar = this.a;
            if (cVar != null) {
                cVar.a(i);
            }
            g gVar = g.this;
            if (i == 1) {
                gVar.a = true;
                this.b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.d, "", this.e, 1);
                com.mbridge.msdk.splash.report.a.a(1, "", this.d, this.c);
                return;
            }
            gVar.a = false;
            this.b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "readyState 2", this.d, this.c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.d, "readyState 2", this.e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            c cVar = this.a;
            if (cVar != null) {
                cVar.a();
            }
            g.this.b = true;
            if (!this.c.isHasMBTplMark()) {
                this.b.setH5Ready(true);
                com.mbridge.msdk.splash.report.a.a(1, "", this.d, this.c);
                com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.d, "", this.e, 1);
            }
            com.mbridge.msdk.splash.signal.c.a(webView);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            c cVar = this.a;
            if (cVar != null) {
                cVar.onError(str);
            }
            g.this.b();
            this.b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error code:" + i + str, this.d, this.c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.d, lnb.k(i, "error code:", str), this.e, 3);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            c cVar = this.a;
            if (cVar != null) {
                cVar.onError(sslError.toString());
            }
            g.this.b();
            this.b.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(2, "error url:" + sslError.getUrl(), this.d, this.c);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.c, this.d, "error url:" + sslError.getUrl(), this.e, 3);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class b {
        private static final g a = new g(null);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface c {
        void a();

        void a(int i);

        void onError(String str);
    }

    private g() {
        this.a = false;
        this.b = false;
    }

    public void a(MBSplashView mBSplashView, d dVar, c cVar) {
        if (mBSplashView == null || dVar == null) {
            return;
        }
        String e = dVar.e();
        String d2 = dVar.d();
        CampaignEx a2 = dVar.a();
        String c2 = dVar.c();
        boolean f = dVar.f();
        int b2 = dVar.b();
        MBSplashWebview splashWebview = mBSplashView.getSplashWebview();
        if (splashWebview == null) {
            return;
        }
        com.mbridge.msdk.splash.signal.b bVar = new com.mbridge.msdk.splash.signal.b(mBSplashView.getContext(), d2, e);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a2);
        bVar.a(arrayList);
        bVar.a(f ? 1 : 0);
        bVar.b(b2);
        mBSplashView.setSplashSignalCommunicationImpl(bVar);
        String requestIdNotice = TextUtils.isEmpty(a2.getRequestId()) ? a2.getRequestIdNotice() : a2.getRequestId();
        String requestId = splashWebview.getRequestId();
        q0.b("WebViewRenderManager", "CampaignEx RequestId = " + requestIdNotice + " WebView RequestId = " + requestId);
        if (!TextUtils.isEmpty(requestId) && requestId.equals(requestIdNotice) && (this.a || this.b)) {
            mBSplashView.setH5Ready(true);
            if (cVar != null) {
                cVar.a(1);
                return;
            }
            return;
        }
        b();
        splashWebview.setRequestId(requestIdNotice);
        com.mbridge.msdk.splash.report.a.b(e, a2);
        long currentTimeMillis = System.currentTimeMillis();
        splashWebview.setWebViewListener(new a(cVar, mBSplashView, a2, e, currentTimeMillis));
        if (!splashWebview.isDestoryed()) {
            splashWebview.loadUrl(c2);
        } else {
            mBSplashView.setH5Ready(false);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), a2, e, "webview had destory", currentTimeMillis, 3);
        }
    }

    public void b() {
        this.a = false;
        this.b = false;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class d {
        private String a;
        private String b;
        private CampaignEx c;
        private String d;
        private boolean e;
        private int f;

        public void a(String str) {
            this.d = str;
        }

        public void b(String str) {
            this.a = str;
        }

        public String c() {
            return this.d;
        }

        public String d() {
            return this.a;
        }

        public String e() {
            return this.b;
        }

        public boolean f() {
            return this.e;
        }

        public CampaignEx a() {
            return this.c;
        }

        public int b() {
            return this.f;
        }

        public void c(String str) {
            this.b = str;
        }

        public void a(CampaignEx campaignEx) {
            this.c = campaignEx;
        }

        public void a(boolean z) {
            this.e = z;
        }

        public void a(int i) {
            this.f = i;
        }
    }

    public /* synthetic */ g(a aVar) {
        this();
    }

    public static g a() {
        return b.a;
    }
}
