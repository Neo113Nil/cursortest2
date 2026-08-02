package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.x2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4629x2 extends C4433m3 {
    private static final C4629x2 d = new C4629x2();
    private Ba b = null;
    private Ba c = null;

    /* renamed from: com.ironsource.x2$a */
    public class a implements Runnable {
        final /* synthetic */ AdInfo a;

        public a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.b;
            if (ba != null) {
                ba.g(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$b */
    public class b implements Runnable {
        final /* synthetic */ AdInfo a;

        public b(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.c;
            if (ba != null) {
                ba.d(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$c */
    public class c implements Runnable {
        final /* synthetic */ AdInfo a;

        public c(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.b;
            if (ba != null) {
                ba.d(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$d */
    public class d implements Runnable {
        final /* synthetic */ AdInfo a;

        public d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.c;
            if (ba != null) {
                ba.e(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$e */
    public class e implements Runnable {
        final /* synthetic */ AdInfo a;

        public e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.b;
            if (ba != null) {
                ba.e(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdLoaded() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$f */
    public class f implements Runnable {
        final /* synthetic */ IronSourceError a;

        public f(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ba ba = C4629x2.this.c;
            if (ba != null) {
                ba.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.x2$g */
    public class g implements Runnable {
        final /* synthetic */ IronSourceError a;

        public g(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ba ba = C4629x2.this.b;
            if (ba != null) {
                ba.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.x2$h */
    public class h implements Runnable {
        final /* synthetic */ AdInfo a;

        public h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.c;
            if (ba != null) {
                ba.h(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$i */
    public class i implements Runnable {
        final /* synthetic */ AdInfo a;

        public i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.b;
            if (ba != null) {
                ba.h(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenPresented() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$j */
    public class j implements Runnable {
        final /* synthetic */ AdInfo a;

        public j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.c;
            if (ba != null) {
                ba.f(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$k */
    public class k implements Runnable {
        final /* synthetic */ AdInfo a;

        public k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.b;
            if (ba != null) {
                ba.f(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdScreenDismissed() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.x2$l */
    public class l implements Runnable {
        final /* synthetic */ AdInfo a;

        public l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4629x2 c4629x2 = C4629x2.this;
            Ba ba = c4629x2.c;
            if (ba != null) {
                ba.g(c4629x2.a(this.a));
                IronLog.CALLBACK.info("onAdLeftApplication() adInfo = " + C4629x2.this.a(this.a));
            }
        }
    }

    private C4629x2() {
    }

    public static C4629x2 a() {
        return d;
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

    public void a(Ba ba) {
        this.b = ba;
    }

    public void b(Ba ba) {
        this.c = ba;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(ironSourceError));
        }
    }

    public Ba b() {
        return this.b;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(adInfo));
        }
    }
}
