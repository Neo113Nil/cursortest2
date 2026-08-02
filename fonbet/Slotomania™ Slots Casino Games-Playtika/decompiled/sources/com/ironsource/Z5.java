package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Z5 implements Jc {
    private InterfaceC2325a6 a;
    private WeakReference<InterfaceC2343b6> b = new WeakReference<>(null);

    public static final class a {
        public static final a a = new a();
        public static final String b = "impressions";

        private a() {
        }
    }

    public final void a(InterfaceC2325a6 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.a = loadListener;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(String str, int i) {
        InterfaceC2343b6 interfaceC2343b6 = this.b.get();
        if (interfaceC2343b6 != null) {
            interfaceC2343b6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        InterfaceC2343b6 interfaceC2343b6 = this.b.get();
        if (interfaceC2343b6 != null) {
            interfaceC2343b6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        InterfaceC2343b6 interfaceC2343b6 = this.b.get();
        if (interfaceC2343b6 != null) {
            interfaceC2343b6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        InterfaceC2343b6 interfaceC2343b6;
        if (!Intrinsics.areEqual(str, "impressions") || (interfaceC2343b6 = this.b.get()) == null) {
            return;
        }
        interfaceC2343b6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(String str) {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC2325a6 interfaceC2325a6 = this.a;
        if (interfaceC2325a6 != null) {
            interfaceC2325a6.a(description);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(J9 adInstance) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        InterfaceC2325a6 interfaceC2325a6 = this.a;
        if (interfaceC2325a6 != null) {
            interfaceC2325a6.a(adInstance);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        InterfaceC2343b6 interfaceC2343b6 = this.b.get();
        if (interfaceC2343b6 != null) {
            interfaceC2343b6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(String str) {
        InterfaceC2343b6 interfaceC2343b6 = this.b.get();
        if (interfaceC2343b6 != null) {
            interfaceC2343b6.a(str);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
    }

    public final void a(InterfaceC2343b6 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.b = new WeakReference<>(showListener);
    }
}
