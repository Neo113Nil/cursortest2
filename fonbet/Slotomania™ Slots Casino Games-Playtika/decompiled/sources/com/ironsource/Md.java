package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes3.dex */
public class Md extends C2537m3 {
    private static final Md d = new Md();
    private InterfaceC2617qb b = null;
    private InterfaceC2617qb c = null;

    class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        a(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.b;
            if (interfaceC2617qb != null) {
                if (this.a) {
                    ((InterfaceC2634rb) interfaceC2617qb).d(md.a(this.b));
                    IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Md.this.a(this.b));
                } else {
                    ((InterfaceC2634rb) interfaceC2617qb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ C2440gd a;
        final /* synthetic */ AdInfo b;

        b(C2440gd c2440gd, AdInfo adInfo) {
            this.a = c2440gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.c;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.b(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ C2440gd a;
        final /* synthetic */ AdInfo b;

        c(C2440gd c2440gd, AdInfo adInfo) {
            this.a = c2440gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.b;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.b(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.c;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Md.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.b;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Md.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ C2440gd a;
        final /* synthetic */ AdInfo b;

        f(C2440gd c2440gd, AdInfo adInfo) {
            this.a = c2440gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.c;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ C2440gd a;
        final /* synthetic */ AdInfo b;

        g(C2440gd c2440gd, AdInfo adInfo) {
            this.a = c2440gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.b;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    class h implements Runnable {
        final /* synthetic */ AdInfo a;

        h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.c;
            if (interfaceC2617qb != null) {
                ((InterfaceC2652sb) interfaceC2617qb).a(md.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ AdInfo a;

        i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.b;
            if (interfaceC2617qb != null) {
                ((InterfaceC2652sb) interfaceC2617qb).a(md.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    class j implements Runnable {
        final /* synthetic */ IronSourceError a;

        j(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2617qb interfaceC2617qb = Md.this.c;
            if (interfaceC2617qb != null) {
                ((InterfaceC2652sb) interfaceC2617qb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    class k implements Runnable {
        final /* synthetic */ IronSourceError a;

        k(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2617qb interfaceC2617qb = Md.this.b;
            if (interfaceC2617qb != null) {
                ((InterfaceC2652sb) interfaceC2617qb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.c;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.c(md.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    class m implements Runnable {
        final /* synthetic */ AdInfo a;

        m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.b;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.c(md.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    class n implements Runnable {
        final /* synthetic */ AdInfo a;

        n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.c;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.b(md.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    class o implements Runnable {
        final /* synthetic */ AdInfo a;

        o(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.b;
            if (interfaceC2617qb != null) {
                interfaceC2617qb.b(md.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    class p implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        p(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC2617qb interfaceC2617qb = md.c;
            if (interfaceC2617qb != null) {
                if (this.a) {
                    ((InterfaceC2634rb) interfaceC2617qb).d(md.a(this.b));
                    IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Md.this.a(this.b));
                } else {
                    ((InterfaceC2634rb) interfaceC2617qb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                }
            }
        }
    }

    private Md() {
    }

    public void b() {
    }

    public void c() {
    }

    public static Md a() {
        return d;
    }

    public void b(InterfaceC2617qb interfaceC2617qb) {
        this.c = interfaceC2617qb;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC2617qb interfaceC2617qb = this.b;
        if (interfaceC2617qb == null || !(interfaceC2617qb instanceof InterfaceC2652sb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC2617qb interfaceC2617qb) {
        this.b = interfaceC2617qb;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC2617qb interfaceC2617qb = this.b;
        if (interfaceC2617qb == null || !(interfaceC2617qb instanceof InterfaceC2652sb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(C2440gd c2440gd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c2440gd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c2440gd, adInfo));
        }
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC2617qb interfaceC2617qb = this.b;
        if (interfaceC2617qb == null || !(interfaceC2617qb instanceof InterfaceC2634rb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C2440gd c2440gd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c2440gd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c2440gd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
