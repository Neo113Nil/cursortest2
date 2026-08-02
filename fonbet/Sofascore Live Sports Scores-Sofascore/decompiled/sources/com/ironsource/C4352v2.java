package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.v2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4352v2 extends C4138j3 {
    private static final C4352v2 d = new C4352v2();
    private Aa b = null;
    private Aa c = null;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$a */
    public class a implements Runnable {
        final /* synthetic */ AdInfo a;

        public a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.b;
            if (aa != null) {
                aa.g(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$b */
    public class b implements Runnable {
        final /* synthetic */ AdInfo a;

        public b(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.c;
            if (aa != null) {
                aa.d(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$c */
    public class c implements Runnable {
        final /* synthetic */ AdInfo a;

        public c(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.b;
            if (aa != null) {
                aa.d(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$d */
    public class d implements Runnable {
        final /* synthetic */ AdInfo a;

        public d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.c;
            if (aa != null) {
                aa.e(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$e */
    public class e implements Runnable {
        final /* synthetic */ AdInfo a;

        public e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.b;
            if (aa != null) {
                aa.e(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$f */
    public class f implements Runnable {
        final /* synthetic */ IronSourceError a;

        public f(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Aa aa = C4352v2.this.c;
            if (aa != null) {
                aa.a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$g */
    public class g implements Runnable {
        final /* synthetic */ IronSourceError a;

        public g(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Aa aa = C4352v2.this.b;
            if (aa != null) {
                aa.a(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$h */
    public class h implements Runnable {
        final /* synthetic */ AdInfo a;

        public h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.c;
            if (aa != null) {
                aa.h(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$i */
    public class i implements Runnable {
        final /* synthetic */ AdInfo a;

        public i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.b;
            if (aa != null) {
                aa.h(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$j */
    public class j implements Runnable {
        final /* synthetic */ AdInfo a;

        public j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.c;
            if (aa != null) {
                aa.f(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$k */
    public class k implements Runnable {
        final /* synthetic */ AdInfo a;

        public k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.b;
            if (aa != null) {
                aa.f(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.v2$l */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4352v2 c4352v2 = C4352v2.this;
            Aa aa = c4352v2.c;
            if (aa != null) {
                aa.g(c4352v2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4352v2.this.a(this.a));
            }
        }
    }

    private C4352v2() {
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

    public static C4352v2 a() {
        return d;
    }

    public void a(Aa aa) {
        this.b = aa;
    }

    public void b(Aa aa) {
        this.c = aa;
    }

    public Aa b() {
        return this.b;
    }
}
