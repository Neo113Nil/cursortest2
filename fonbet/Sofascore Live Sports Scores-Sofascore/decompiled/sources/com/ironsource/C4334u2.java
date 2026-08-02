package com.ironsource;

import com.ironsource.V7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.u2, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4334u2 extends V7.a<ISDemandOnlyBannerListener> {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u2$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyBannerListener c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4334u2.this.a(this.a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.a, this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u2$b */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4334u2.this.a(this.a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u2$c */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4334u2.this.a(this.a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u2$d */
    public class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4334u2.this.a(this.a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.u2$e */
    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4334u2.this.a(this.a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.a);
        }
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener a2 = a();
        a(new a(str, ironSourceError, a2), a2 != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new e(str, a2), a2 != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new b(str, a2), a2 != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new c(str, a2), a2 != null);
    }

    public void a(String str) {
        ISDemandOnlyBannerListener a2 = a();
        a(new d(str, a2), a2 != null);
    }
}
