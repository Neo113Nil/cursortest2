package com.ironsource;

import com.ironsource.InterfaceC2592p4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.wa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2723wa extends AbstractC2533m implements O2, InterfaceC2759ya {
    private final C2588p0 b;
    private final J2 c;
    private final WeakReference<InterfaceC2769z2> d;
    private LevelPlayAdInfo e;
    private final InterfaceC2741xa f;

    public C2723wa(InterfaceC2769z2 listener, C2588p0 adTools, J2 bannerAdProperties, W2 bannerViewContainer) {
        InterfaceC2741xa a;
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(bannerViewContainer, "bannerViewContainer");
        this.b = adTools;
        this.c = bannerAdProperties;
        this.d = new WeakReference<>(listener);
        this.e = n();
        a = Ta.a.a(adTools, bannerViewContainer, adTools.d(bannerAdProperties.c()), bannerAdProperties, this, m(), (r17 & 64) != 0 ? new InterfaceC2592p4.a() : null);
        this.f = a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L2 a(C2723wa this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.a(this$0.b, this$0.c, z);
    }

    private final N2 m() {
        return new N2() { // from class: com.ironsource.wa$$ExternalSyntheticLambda0
            @Override // com.ironsource.N2
            public final L2 a(boolean z) {
                L2 a;
                a = C2723wa.a(C2723wa.this, z);
                return a;
            }
        };
    }

    private final LevelPlayAdInfo n() {
        String uuid = this.c.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
        String c = this.c.c();
        String aVar = this.c.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "bannerAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(uuid, c, aVar, null, null, null, null, 120, null);
    }

    public final void b() {
        this.f.b();
    }

    public final void c() {
        this.f.c();
    }

    public final void d() {
        this.f.d();
    }

    @Override // com.ironsource.K0
    public void e() {
        onAdClicked();
    }

    public final void f() {
        this.f.f();
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit g() {
        o();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit h() {
        q();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void i() {
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            interfaceC2769z2.a(this.e);
        }
    }

    @Override // com.ironsource.O2
    public /* bridge */ /* synthetic */ Unit j() {
        p();
        return Unit.INSTANCE;
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void k() {
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            interfaceC2769z2.c(this.e);
        }
    }

    public void o() {
        onAdLeftApplication();
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void onAdClicked() {
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            interfaceC2769z2.d(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void onAdDisplayed(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            interfaceC2769z2.b(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void onAdLeftApplication() {
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            interfaceC2769z2.e(this.e);
        }
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void onAdLoaded(LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e = adInfo;
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            interfaceC2769z2.a(adInfo, false);
        }
    }

    public void p() {
        k();
    }

    public void q() {
        i();
    }

    private final L2 a(C2588p0 c2588p0, J2 j2, boolean z) {
        IronLog.INTERNAL.verbose();
        return new L2(c2588p0, M2.z.a(j2, l().a(), z), this);
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void b(IronSourceError ironSourceError) {
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            String uuid = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC2769z2.a(new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }

    @Override // com.ironsource.InterfaceC2759ya
    public void d(IronSourceError ironSourceError) {
        InterfaceC2769z2 interfaceC2769z2 = this.d.get();
        if (interfaceC2769z2 != null) {
            LevelPlayAdInfo levelPlayAdInfo = this.e;
            String uuid = this.c.b().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "bannerAdProperties.adId.toString()");
            interfaceC2769z2.a(levelPlayAdInfo, new LevelPlayAdError(ironSourceError, uuid, this.c.c()));
        }
    }
}
