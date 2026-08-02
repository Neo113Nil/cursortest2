package com.ironsource;

import com.ironsource.V7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class T7 extends V7.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.a, "onInterstitialAdReady()");
            this.b.onInterstitialAdReady(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.a, "onInterstitialAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdLoadFailed(this.a, this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.a, "onInterstitialAdOpened()");
            this.b.onInterstitialAdOpened(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.a, "onInterstitialAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdShowFailed(this.a, this.b);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.a, "onInterstitialAdClicked()");
            this.b.onInterstitialAdClicked(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class f implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            T7.this.a(this.a, "onInterstitialAdClosed()");
            this.b.onInterstitialAdClosed(this.a);
        }
    }

    public T7(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new e(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new f(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new b(str, ironSourceError, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new c(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new a(str, a2), a2 != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener a2 = a();
        a(new d(str, ironSourceError, a2), a2 != null);
    }

    public T7() {
    }
}
