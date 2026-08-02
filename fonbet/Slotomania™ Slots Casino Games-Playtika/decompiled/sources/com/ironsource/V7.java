package com.ironsource;

import com.ironsource.X7;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes2.dex */
public class V7 extends X7.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            V7.this.a(this.a, "onInterstitialAdReady()");
            this.b.onInterstitialAdReady(this.a);
        }
    }

    class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            V7.this.a(this.a, "onInterstitialAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdLoadFailed(this.a, this.b);
        }
    }

    class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            V7.this.a(this.a, "onInterstitialAdOpened()");
            this.b.onInterstitialAdOpened(this.a);
        }
    }

    class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyInterstitialListener c;

        d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            V7.this.a(this.a, "onInterstitialAdShowFailed() error = " + this.b.getErrorMessage());
            this.c.onInterstitialAdShowFailed(this.a, this.b);
        }
    }

    class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            V7.this.a(this.a, "onInterstitialAdClicked()");
            this.b.onInterstitialAdClicked(this.a);
        }
    }

    class f implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyInterstitialListener b;

        f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.a = str;
            this.b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            V7.this.a(this.a, "onInterstitialAdClosed()");
            this.b.onInterstitialAdClosed(this.a);
        }
    }

    V7(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
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

    V7() {
    }
}
