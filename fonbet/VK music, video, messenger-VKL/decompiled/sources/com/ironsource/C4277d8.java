package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4277d8 extends C4433m3 {
    private static final C4277d8 d = new C4277d8();
    private InterfaceC4316fb b = null;
    private InterfaceC4316fb c = null;

    /* renamed from: com.ironsource.d8$a */
    public class a implements Runnable {
        final /* synthetic */ AdInfo a;

        public a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.b;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.e(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$b */
    public class b implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.c;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.a(this.a, c4277d8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4277d8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$c */
    public class c implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.b;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.a(this.a, c4277d8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4277d8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$d */
    public class d implements Runnable {
        final /* synthetic */ AdInfo a;

        public d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.c;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.d(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$e */
    public class e implements Runnable {
        final /* synthetic */ AdInfo a;

        public e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.b;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.d(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$f */
    public class f implements Runnable {
        final /* synthetic */ AdInfo a;

        public f(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.c;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.a(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$g */
    public class g implements Runnable {
        final /* synthetic */ AdInfo a;

        public g(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.b;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.a(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$h */
    public class h implements Runnable {
        final /* synthetic */ IronSourceError a;

        public h(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4316fb interfaceC4316fb = C4277d8.this.c;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$i */
    public class i implements Runnable {
        final /* synthetic */ IronSourceError a;

        public i(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4316fb interfaceC4316fb = C4277d8.this.b;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$j */
    public class j implements Runnable {
        final /* synthetic */ AdInfo a;

        public j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.c;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.c(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$k */
    public class k implements Runnable {
        final /* synthetic */ AdInfo a;

        public k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.b;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.c(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$l */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.c;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.b(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$m */
    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.b;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.b(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$n */
    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4277d8 c4277d8 = C4277d8.this;
            InterfaceC4316fb interfaceC4316fb = c4277d8.c;
            if (interfaceC4316fb != null) {
                interfaceC4316fb.e(c4277d8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4277d8.this.a(this.a));
            }
        }
    }

    private C4277d8() {
    }

    public static synchronized C4277d8 a() {
        C4277d8 c4277d8;
        synchronized (C4277d8.class) {
            c4277d8 = d;
        }
        return c4277d8;
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

    public synchronized void a(InterfaceC4316fb interfaceC4316fb) {
        this.b = interfaceC4316fb;
    }

    public synchronized void b(InterfaceC4316fb interfaceC4316fb) {
        this.c = interfaceC4316fb;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
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
