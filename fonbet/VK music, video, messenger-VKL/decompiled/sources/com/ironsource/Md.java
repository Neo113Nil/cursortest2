package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes13.dex */
public class Md extends C4433m3 {
    private static final Md d = new Md();
    private InterfaceC4530rb b = null;
    private InterfaceC4530rb c = null;

    public class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public a(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.b;
            if (interfaceC4530rb != null) {
                if (!this.a) {
                    ((InterfaceC4548sb) interfaceC4530rb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4548sb) interfaceC4530rb).d(md.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Md.this.a(this.b));
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ C4336gd a;
        final /* synthetic */ AdInfo b;

        public b(C4336gd c4336gd, AdInfo adInfo) {
            this.a = c4336gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.c;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.b(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ C4336gd a;
        final /* synthetic */ AdInfo b;

        public c(C4336gd c4336gd, AdInfo adInfo) {
            this.a = c4336gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.b;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.b(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.c;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Md.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    public class e implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.b;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Md.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    public class f implements Runnable {
        final /* synthetic */ C4336gd a;
        final /* synthetic */ AdInfo b;

        public f(C4336gd c4336gd, AdInfo adInfo) {
            this.a = c4336gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.c;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    public class g implements Runnable {
        final /* synthetic */ C4336gd a;
        final /* synthetic */ AdInfo b;

        public g(C4336gd c4336gd, AdInfo adInfo) {
            this.a = c4336gd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.b;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.a(this.a, md.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Md.this.a(this.b));
            }
        }
    }

    public class h implements Runnable {
        final /* synthetic */ AdInfo a;

        public h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.c;
            if (interfaceC4530rb != null) {
                ((InterfaceC4566tb) interfaceC4530rb).a(md.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    public class i implements Runnable {
        final /* synthetic */ AdInfo a;

        public i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.b;
            if (interfaceC4530rb != null) {
                ((InterfaceC4566tb) interfaceC4530rb).a(md.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    public class j implements Runnable {
        final /* synthetic */ IronSourceError a;

        public j(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4530rb interfaceC4530rb = Md.this.c;
            if (interfaceC4530rb != null) {
                ((InterfaceC4566tb) interfaceC4530rb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    public class k implements Runnable {
        final /* synthetic */ IronSourceError a;

        public k(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4530rb interfaceC4530rb = Md.this.b;
            if (interfaceC4530rb != null) {
                ((InterfaceC4566tb) interfaceC4530rb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.c;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.c(md.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.b;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.c(md.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.c;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.b(md.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    public class o implements Runnable {
        final /* synthetic */ AdInfo a;

        public o(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.b;
            if (interfaceC4530rb != null) {
                interfaceC4530rb.b(md.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Md.this.a(this.a));
            }
        }
    }

    public class p implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public p(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Md md = Md.this;
            InterfaceC4530rb interfaceC4530rb = md.c;
            if (interfaceC4530rb != null) {
                if (!this.a) {
                    ((InterfaceC4548sb) interfaceC4530rb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4548sb) interfaceC4530rb).d(md.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Md.this.a(this.b));
            }
        }
    }

    private Md() {
    }

    public static Md a() {
        return d;
    }

    public void b() {
    }

    public void c() {
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC4530rb interfaceC4530rb = this.b;
        if (interfaceC4530rb == null || !(interfaceC4530rb instanceof InterfaceC4566tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC4530rb interfaceC4530rb) {
        this.b = interfaceC4530rb;
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4530rb interfaceC4530rb = this.b;
        if (interfaceC4530rb == null || !(interfaceC4530rb instanceof InterfaceC4566tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(InterfaceC4530rb interfaceC4530rb) {
        this.c = interfaceC4530rb;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC4530rb interfaceC4530rb = this.b;
        if (interfaceC4530rb == null || !(interfaceC4530rb instanceof InterfaceC4548sb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    public void b(C4336gd c4336gd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4336gd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4336gd, adInfo));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C4336gd c4336gd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4336gd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4336gd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
