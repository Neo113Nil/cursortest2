package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.a8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3957a8 extends C4138j3 {
    private static final C3957a8 d = new C3957a8();
    private InterfaceC4021cb b = null;
    private InterfaceC4021cb c = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$a */
    public class a implements Runnable {
        final /* synthetic */ AdInfo a;

        public a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.b;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.e(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$b */
    public class b implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.c;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.a(this.a, c3957a8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3957a8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$c */
    public class c implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        public c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.b;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.a(this.a, c3957a8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C3957a8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$d */
    public class d implements Runnable {
        final /* synthetic */ AdInfo a;

        public d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.c;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.d(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$e */
    public class e implements Runnable {
        final /* synthetic */ AdInfo a;

        public e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.b;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.d(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$f */
    public class f implements Runnable {
        final /* synthetic */ AdInfo a;

        public f(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.c;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.a(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$g */
    public class g implements Runnable {
        final /* synthetic */ AdInfo a;

        public g(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.b;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.a(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$h */
    public class h implements Runnable {
        final /* synthetic */ IronSourceError a;

        public h(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4021cb interfaceC4021cb = C3957a8.this.c;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$i */
    public class i implements Runnable {
        final /* synthetic */ IronSourceError a;

        public i(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4021cb interfaceC4021cb = C3957a8.this.b;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$j */
    public class j implements Runnable {
        final /* synthetic */ AdInfo a;

        public j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.c;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.c(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$k */
    public class k implements Runnable {
        final /* synthetic */ AdInfo a;

        public k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.b;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.c(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$l */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.c;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.b(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$m */
    public class m implements Runnable {
        final /* synthetic */ AdInfo a;

        public m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.b;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.b(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a8$n */
    public class n implements Runnable {
        final /* synthetic */ AdInfo a;

        public n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3957a8 c3957a8 = C3957a8.this;
            InterfaceC4021cb interfaceC4021cb = c3957a8.c;
            if (interfaceC4021cb != null) {
                interfaceC4021cb.e(c3957a8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C3957a8.this.a(this.a));
            }
        }
    }

    private C3957a8() {
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

    public static synchronized C3957a8 a() {
        C3957a8 c3957a8;
        synchronized (C3957a8.class) {
            c3957a8 = d;
        }
        return c3957a8;
    }

    public synchronized void a(InterfaceC4021cb interfaceC4021cb) {
        this.b = interfaceC4021cb;
    }

    public synchronized void b(InterfaceC4021cb interfaceC4021cb) {
        this.c = interfaceC4021cb;
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
