package com.ironsource;

import java.lang.ref.WeakReference;
import org.json.JSONObject;
import xsna.epx;

/* renamed from: com.ironsource.b6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4239b6 implements Kc {
    private InterfaceC4257c6 a;
    private WeakReference<InterfaceC4275d6> b = new WeakReference<>(null);

    /* renamed from: com.ironsource.b6$a */
    public static final class a {
        public static final a a = new a();
        public static final String b = "impressions";

        private a() {
        }
    }

    public final void a(InterfaceC4257c6 interfaceC4257c6) {
        this.a = interfaceC4257c6;
    }

    @Override // com.ironsource.Kc
    public void onInterstitialAdRewarded(String str, int i) {
        InterfaceC4275d6 interfaceC4275d6 = this.b.get();
        if (interfaceC4275d6 != null) {
            interfaceC4275d6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClick() {
        InterfaceC4275d6 interfaceC4275d6 = this.b.get();
        if (interfaceC4275d6 != null) {
            interfaceC4275d6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialClose() {
        InterfaceC4275d6 interfaceC4275d6 = this.b.get();
        if (interfaceC4275d6 != null) {
            interfaceC4275d6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC4275d6 interfaceC4275d6;
        if (!epx.f(str, "impressions") || (interfaceC4275d6 = this.b.get()) == null) {
            return;
        }
        interfaceC4275d6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadFailed(String str) {
        InterfaceC4257c6 interfaceC4257c6 = this.a;
        if (interfaceC4257c6 != null) {
            interfaceC4257c6.a(str);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialLoadSuccess(K9 k9) {
        InterfaceC4257c6 interfaceC4257c6 = this.a;
        if (interfaceC4257c6 != null) {
            interfaceC4257c6.a(k9);
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialOpen() {
        InterfaceC4275d6 interfaceC4275d6 = this.b.get();
        if (interfaceC4275d6 != null) {
            interfaceC4275d6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowFailed(String str) {
        InterfaceC4275d6 interfaceC4275d6 = this.b.get();
        if (interfaceC4275d6 != null) {
            interfaceC4275d6.a(str);
        }
    }

    public final void a(InterfaceC4275d6 interfaceC4275d6) {
        this.b = new WeakReference<>(interfaceC4275d6);
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialShowSuccess() {
    }

    @Override // com.ironsource.Kc
    public void onInterstitialInitFailed(String str) {
    }
}
