package com.ironsource;

import com.ironsource.F0;
import com.ironsource.InterfaceC2474ib;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.jb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2491jb extends AbstractC2687ua implements Ub {
    private final UUID d;
    private final C2456hb e;
    private Rb f;
    private String g;
    private C2440gd h;
    private InterfaceC2527lb i;
    private AdapterNativeAdData j;
    private AdapterNativeAdViewBinder k;

    public /* synthetic */ C2491jb(UUID uuid, C2456hb c2456hb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C2702v7.a.a() : uuid, c2456hb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2491jb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.API.info(String.valueOf(this$0));
        try {
            Rb rb = this$0.f;
            if (rb == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
                rb = null;
            }
            rb.n();
            this$0.i = null;
        } catch (Throwable th) {
            C2556n4.d().a(th);
            IronLog.API.error("destroyNativeAd()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2491jb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Rb rb = null;
        if (this$0.c()) {
            IronLog.INTERNAL.warning(C2588p0.a(this$0.a(), "Native ad load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.a(true);
        if (this$0.d()) {
            Rb rb2 = this$0.f;
            if (rb2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            } else {
                rb = rb2;
            }
            rb.o();
        }
    }

    private final Rb e() {
        this.h = a().c(this.g);
        UUID uuid = this.d;
        String b = b();
        C2440gd c2440gd = this.h;
        if (c2440gd == null) {
            Intrinsics.throwUninitializedPropertyAccessException("placement");
            c2440gd = null;
        }
        C2349bc c2349bc = new C2349bc(uuid, b, c2440gd);
        a(c2349bc);
        return new Rb(this, a(), c2349bc);
    }

    @Override // com.ironsource.AbstractC2687ua
    public boolean d() {
        this.f = e();
        return true;
    }

    public final void f() {
        a(new Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C2491jb.a(C2491jb.this);
            }
        });
    }

    public final UUID g() {
        return this.d;
    }

    public final String h() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getAdvertiser();
        }
        return null;
    }

    public final String i() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getBody();
        }
        return null;
    }

    public final String j() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getCallToAction();
        }
        return null;
    }

    public final InterfaceC2474ib.a k() {
        NativeAdDataInterface.Image icon;
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData == null || (icon = adapterNativeAdData.getIcon()) == null) {
            return null;
        }
        return new InterfaceC2474ib.a(icon.getDrawable(), icon.getUri());
    }

    public final AdapterNativeAdViewBinder l() {
        return this.k;
    }

    public final String m() {
        AdapterNativeAdData adapterNativeAdData = this.j;
        if (adapterNativeAdData != null) {
            return adapterNativeAdData.getTitle();
        }
        return null;
    }

    public final void n() {
        a(new Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C2491jb.b(C2491jb.this);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void onNativeAdLoadFailed(IronSourceError ironSourceError) {
        String uuid = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adId.toString()");
        final LevelPlayAdError levelPlayAdError = new LevelPlayAdError(ironSourceError, uuid, b());
        b(new Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C2491jb.a(C2491jb.this, levelPlayAdError);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2491jb(UUID adId, C2456hb nativeAd) {
        super(new C2588p0(r1, F0.b.MEDIATION));
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        IronSource.a aVar = IronSource.a.NATIVE_AD;
        this.d = adId;
        this.e = nativeAd;
        this.g = "";
        a().e().a(new C2551n(aVar, adId, b()));
    }

    public final void a(final InterfaceC2527lb interfaceC2527lb) {
        a(new Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C2491jb.a(C2491jb.this, interfaceC2527lb);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2491jb this$0, InterfaceC2527lb interfaceC2527lb) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.i = interfaceC2527lb;
    }

    @Override // com.ironsource.Ub
    public void a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        IronLog.CALLBACK.info(String.valueOf(this));
        Ob ob = new Ob();
        Rb rb = this.f;
        if (rb == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdController");
            rb = null;
        }
        rb.a(ob);
        this.j = ob.a();
        this.k = ob.b();
        b(new Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C2491jb.b(C2491jb.this, adInfo);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C2491jb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC2527lb interfaceC2527lb = this$0.i;
        if (interfaceC2527lb != null) {
            interfaceC2527lb.b(this$0.e, adInfo);
        }
    }

    @Override // com.ironsource.Ub
    public void b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        b(new Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C2491jb.a(C2491jb.this, adInfo);
            }
        });
    }

    public final void b(final String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        a(new Runnable() { // from class: com.ironsource.jb$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C2491jb.a(C2491jb.this, placementName);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2491jb this$0, LevelPlayAdError levelPlayError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(levelPlayError, "$levelPlayError");
        InterfaceC2527lb interfaceC2527lb = this$0.i;
        if (interfaceC2527lb != null) {
            interfaceC2527lb.a(this$0.e, levelPlayError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2491jb this$0, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        InterfaceC2527lb interfaceC2527lb = this$0.i;
        if (interfaceC2527lb != null) {
            interfaceC2527lb.c(this$0.e, adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C2491jb this$0, String placementName) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placementName, "$placementName");
        this$0.g = placementName;
    }
}
