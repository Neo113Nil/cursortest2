package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2733x2 extends C2537m3 {
    private static final C2733x2 d = new C2733x2();
    private Aa b = null;
    private Aa c = null;

    /* renamed from: com.ironsource.x2$a */
    class a implements Runnable {
        final /* synthetic */ AdInfo a;

        a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.b;
            if (aa != null) {
                aa.g(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$b */
    class b implements Runnable {
        final /* synthetic */ AdInfo a;

        b(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.c;
            if (aa != null) {
                aa.d(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$c */
    class c implements Runnable {
        final /* synthetic */ AdInfo a;

        c(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.b;
            if (aa != null) {
                aa.d(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$d */
    class d implements Runnable {
        final /* synthetic */ AdInfo a;

        d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.c;
            if (aa != null) {
                aa.e(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$e */
    class e implements Runnable {
        final /* synthetic */ AdInfo a;

        e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.b;
            if (aa != null) {
                aa.e(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$f */
    class f implements Runnable {
        final /* synthetic */ IronSourceError a;

        f(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Aa aa = C2733x2.this.c;
            if (aa != null) {
                aa.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.x2$g */
    class g implements Runnable {
        final /* synthetic */ IronSourceError a;

        g(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Aa aa = C2733x2.this.b;
            if (aa != null) {
                aa.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.x2$h */
    class h implements Runnable {
        final /* synthetic */ AdInfo a;

        h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.c;
            if (aa != null) {
                aa.h(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$i */
    class i implements Runnable {
        final /* synthetic */ AdInfo a;

        i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.b;
            if (aa != null) {
                aa.h(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$j */
    class j implements Runnable {
        final /* synthetic */ AdInfo a;

        j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.c;
            if (aa != null) {
                aa.f(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$k */
    class k implements Runnable {
        final /* synthetic */ AdInfo a;

        k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.b;
            if (aa != null) {
                aa.f(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$l */
    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2733x2 c2733x2 = C2733x2.this;
            Aa aa = c2733x2.c;
            if (aa != null) {
                aa.g(c2733x2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C2733x2.this.a(this.a));
            }
        }
    }

    private C2733x2() {
    }

    public static C2733x2 a() {
        return d;
    }

    public void b(Aa aa) {
        this.c = aa;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
        }
    }

    public void a(Aa aa) {
        this.b = aa;
    }

    public Aa b() {
        return this.b;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
