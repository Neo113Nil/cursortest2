package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Y5 implements Jc {

    @Nullable
    private Z5 a;

    @NotNull
    private WeakReference<InterfaceC3955a6> b = new WeakReference<>(null);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        public static final a a = new a();

        @NotNull
        public static final String b = "impressions";

        private a() {
        }
    }

    public final void a(@NotNull InterfaceC3955a6 interfaceC3955a6) {
        interfaceC3955a6.getClass();
        this.b = new WeakReference<>(interfaceC3955a6);
    }

    @Override // com.ironsource.Jc
    public void onInterstitialAdRewarded(@Nullable String str, int i) {
        InterfaceC3955a6 interfaceC3955a6 = this.b.get();
        if (interfaceC3955a6 != null) {
            interfaceC3955a6.onAdInstanceDidReward(str, i);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClick() {
        InterfaceC3955a6 interfaceC3955a6 = this.b.get();
        if (interfaceC3955a6 != null) {
            interfaceC3955a6.onAdInstanceDidClick();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialClose() {
        InterfaceC3955a6 interfaceC3955a6 = this.b.get();
        if (interfaceC3955a6 != null) {
            interfaceC3955a6.onAdInstanceDidDismiss();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialEventNotificationReceived(@Nullable String str, @Nullable JSONObject jSONObject) {
        InterfaceC3955a6 interfaceC3955a6;
        if (!Intrinsics.c(str, "impressions") || (interfaceC3955a6 = this.b.get()) == null) {
            return;
        }
        interfaceC3955a6.onAdInstanceDidBecomeVisible();
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadFailed(@NotNull String str) {
        str.getClass();
        Z5 z5 = this.a;
        if (z5 != null) {
            z5.a(str);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialLoadSuccess(@NotNull J9 j9) {
        j9.getClass();
        Z5 z5 = this.a;
        if (z5 != null) {
            z5.a(j9);
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialOpen() {
        InterfaceC3955a6 interfaceC3955a6 = this.b.get();
        if (interfaceC3955a6 != null) {
            interfaceC3955a6.onAdInstanceDidShow();
        }
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowFailed(@Nullable String str) {
        InterfaceC3955a6 interfaceC3955a6 = this.b.get();
        if (interfaceC3955a6 != null) {
            interfaceC3955a6.a(str);
        }
    }

    public final void a(@NotNull Z5 z5) {
        z5.getClass();
        this.a = z5;
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitSuccess() {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialShowSuccess() {
    }

    @Override // com.ironsource.Jc
    public void onInterstitialInitFailed(@Nullable String str) {
    }
}
