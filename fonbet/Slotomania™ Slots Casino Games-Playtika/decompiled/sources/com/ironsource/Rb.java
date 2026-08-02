package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Rb extends AbstractC2533m implements InterfaceC2421fc, M0, InterfaceC2767z0 {
    private final Ub b;
    private final C2588p0 c;
    private final C2349bc d;
    private C2385dc e;
    private LevelPlayAdInfo f;

    public Rb(Ub listener, C2588p0 adTools, C2349bc nativeAdProperties) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.b = listener;
        this.c = adTools;
        this.d = nativeAdProperties;
        this.f = m();
    }

    private final LevelPlayAdInfo m() {
        String uuid = this.d.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "nativeAdProperties.adId.toString()");
        String c = this.d.c();
        String aVar = this.d.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    public final void a(Ob nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        C2385dc c2385dc = this.e;
        if (c2385dc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c2385dc = null;
        }
        c2385dc.a(new Wb(nativeAdBinder), this);
    }

    @Override // com.ironsource.InterfaceC2767z0
    public void c(IronSourceError ironSourceError) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.K0
    public void e() {
        this.b.b(this.f);
    }

    public final void n() {
        this.f = m();
        C2385dc c2385dc = this.e;
        if (c2385dc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            c2385dc = null;
        }
        c2385dc.a(true);
    }

    public final void o() {
        C2385dc a = a(this.c, this.d);
        this.e = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nativeAdUnit");
            a = null;
        }
        a.a((M0) this);
    }

    private final C2385dc a(C2588p0 c2588p0, C2349bc c2349bc) {
        IronLog.INTERNAL.verbose();
        return new C2385dc(c2588p0, C2403ec.y.a(c2349bc, l().a()), this);
    }

    @Override // com.ironsource.M0
    public void a(C2677u0 adUnitCallback) {
        Intrinsics.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo c = adUnitCallback.c();
        if (c != null) {
            this.f = c;
            this.b.a(c);
        }
    }

    @Override // com.ironsource.InterfaceC2767z0
    public void a(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.b.onNativeAdLoadFailed(ironSourceError);
    }
}
