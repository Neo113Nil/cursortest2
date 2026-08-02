package com.ironsource;

import com.ironsource.X7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2715w2 extends X7.a<ISDemandOnlyBannerListener> {

    /* renamed from: com.ironsource.w2$a */
    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyBannerListener c;

        a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2715w2.this.a(this.a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.a, this.b);
        }
    }

    /* renamed from: com.ironsource.w2$b */
    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2715w2.this.a(this.a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.a);
        }
    }

    /* renamed from: com.ironsource.w2$c */
    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2715w2.this.a(this.a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.a);
        }
    }

    /* renamed from: com.ironsource.w2$d */
    class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2715w2.this.a(this.a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.a);
        }
    }

    /* renamed from: com.ironsource.w2$e */
    class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2715w2.this.a(this.a, "onBannerAdLeftApplication()");
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
