package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Ld extends C4138j3 {
    private static final Ld d = new Ld();
    private InterfaceC4236ob b = null;
    private InterfaceC4236ob c = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public a(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.b;
            if (interfaceC4236ob != null) {
                if (!this.a) {
                    ((InterfaceC4254pb) interfaceC4236ob).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4254pb) interfaceC4236ob).d(ld.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ C4077fd a;
        final /* synthetic */ AdInfo b;

        public b(C4077fd c4077fd, AdInfo adInfo) {
            this.a = c4077fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.c;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.b(this.a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ C4077fd a;
        final /* synthetic */ AdInfo b;

        public c(C4077fd c4077fd, AdInfo adInfo) {
            this.a = c4077fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.b;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.b(this.a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.c;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.a(this.a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Ld.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.b;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.a(this.a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Ld.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        final /* synthetic */ C4077fd a;
        final /* synthetic */ AdInfo b;

        public f(C4077fd c4077fd, AdInfo adInfo) {
            this.a = c4077fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.c;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.a(this.a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class g implements Runnable {
        final /* synthetic */ C4077fd a;
        final /* synthetic */ AdInfo b;

        public g(C4077fd c4077fd, AdInfo adInfo) {
            this.a = c4077fd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.b;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.a(this.a, ld.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class h implements Runnable {
        final /* synthetic */ AdInfo a;

        public h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.c;
            if (interfaceC4236ob != null) {
                ((InterfaceC4272qb) interfaceC4236ob).a(ld.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Ld.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class i implements Runnable {
        final /* synthetic */ AdInfo a;

        public i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.b;
            if (interfaceC4236ob != null) {
                ((InterfaceC4272qb) interfaceC4236ob).a(ld.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Ld.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class j implements Runnable {
        final /* synthetic */ IronSourceError a;

        public j(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4236ob interfaceC4236ob = Ld.this.c;
            if (interfaceC4236ob != null) {
                ((InterfaceC4272qb) interfaceC4236ob).a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class k implements Runnable {
        final /* synthetic */ IronSourceError a;

        public k(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4236ob interfaceC4236ob = Ld.this.b;
            if (interfaceC4236ob != null) {
                ((InterfaceC4272qb) interfaceC4236ob).a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.c;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.c(ld.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Ld.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.b;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.c(ld.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Ld.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.c;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.b(ld.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Ld.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class o implements Runnable {
        final /* synthetic */ AdInfo a;

        public o(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.b;
            if (interfaceC4236ob != null) {
                interfaceC4236ob.b(ld.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Ld.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class p implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        public p(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ld ld = Ld.this;
            InterfaceC4236ob interfaceC4236ob = ld.c;
            if (interfaceC4236ob != null) {
                if (!this.a) {
                    ((InterfaceC4254pb) interfaceC4236ob).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4254pb) interfaceC4236ob).d(ld.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Ld.this.a(this.b));
            }
        }
    }

    private Ld() {
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4236ob interfaceC4236ob = this.b;
        if (interfaceC4236ob == null || !(interfaceC4236ob instanceof InterfaceC4272qb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
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
        InterfaceC4236ob interfaceC4236ob = this.b;
        if (interfaceC4236ob == null || !(interfaceC4236ob instanceof InterfaceC4272qb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void b() {
    }

    public void c() {
    }

    public void b(InterfaceC4236ob interfaceC4236ob) {
        this.c = interfaceC4236ob;
    }

    public static Ld a() {
        return d;
    }

    public void b(C4077fd c4077fd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4077fd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4077fd, adInfo));
        }
    }

    public void a(InterfaceC4236ob interfaceC4236ob) {
        this.b = interfaceC4236ob;
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC4236ob interfaceC4236ob = this.b;
        if (interfaceC4236ob == null || !(interfaceC4236ob instanceof InterfaceC4254pb)) {
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

    public void a(C4077fd c4077fd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4077fd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4077fd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
