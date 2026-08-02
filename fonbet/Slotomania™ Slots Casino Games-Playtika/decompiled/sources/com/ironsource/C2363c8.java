package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* renamed from: com.ironsource.c8, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2363c8 extends C2537m3 {
    private static final C2363c8 d = new C2363c8();
    private InterfaceC2402eb b = null;
    private InterfaceC2402eb c = null;

    /* renamed from: com.ironsource.c8$a */
    class a implements Runnable {
        final /* synthetic */ AdInfo a;

        a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.b;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.e(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$b */
    class b implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.c;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.a(this.a, c2363c8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C2363c8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$c */
    class c implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.b;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.a(this.a, c2363c8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C2363c8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$d */
    class d implements Runnable {
        final /* synthetic */ AdInfo a;

        d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.c;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.d(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$e */
    class e implements Runnable {
        final /* synthetic */ AdInfo a;

        e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.b;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.d(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$f */
    class f implements Runnable {
        final /* synthetic */ AdInfo a;

        f(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.c;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.a(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$g */
    class g implements Runnable {
        final /* synthetic */ AdInfo a;

        g(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.b;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.a(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$h */
    class h implements Runnable {
        final /* synthetic */ IronSourceError a;

        h(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2402eb interfaceC2402eb = C2363c8.this.c;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$i */
    class i implements Runnable {
        final /* synthetic */ IronSourceError a;

        i(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2402eb interfaceC2402eb = C2363c8.this.b;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.c8$j */
    class j implements Runnable {
        final /* synthetic */ AdInfo a;

        j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.c;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.c(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$k */
    class k implements Runnable {
        final /* synthetic */ AdInfo a;

        k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.b;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.c(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$l */
    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.c;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.b(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$m */
    class m implements Runnable {
        final /* synthetic */ AdInfo a;

        m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.b;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.b(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.c8$n */
    class n implements Runnable {
        final /* synthetic */ AdInfo a;

        n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2363c8 c2363c8 = C2363c8.this;
            InterfaceC2402eb interfaceC2402eb = c2363c8.c;
            if (interfaceC2402eb != null) {
                interfaceC2402eb.e(c2363c8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C2363c8.this.a(this.a));
            }
        }
    }

    private C2363c8() {
    }

    public static synchronized C2363c8 a() {
        C2363c8 c2363c8;
        synchronized (C2363c8.class) {
            c2363c8 = d;
        }
        return c2363c8;
    }

    public synchronized void b(InterfaceC2402eb interfaceC2402eb) {
        this.c = interfaceC2402eb;
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
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC2402eb interfaceC2402eb) {
        this.b = interfaceC2402eb;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
