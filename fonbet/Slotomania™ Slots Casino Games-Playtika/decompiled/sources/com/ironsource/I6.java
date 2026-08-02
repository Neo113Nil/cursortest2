package com.ironsource;

import android.app.Activity;
import com.ironsource.C2594p6;
import com.ironsource.InterfaceC2683u6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class I6 implements InterfaceC2683u6, C2594p6.b, C2594p6.a {
    private final C2588p0 a;
    private final InterfaceC2683u6.a b;
    private final InterfaceC2612q6 c;
    private final InterfaceC2647s6 d;
    private final InterfaceC2665t6 e;
    private C2594p6 f;

    public I6(C2588p0 adTools, InterfaceC2683u6.a config, InterfaceC2612q6 fullscreenAdUnitFactory, InterfaceC2647s6 fullscreenAdUnitListener, InterfaceC2665t6 listener) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitFactory, "fullscreenAdUnitFactory");
        Intrinsics.checkNotNullParameter(fullscreenAdUnitListener, "fullscreenAdUnitListener");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a = adTools;
        this.b = config;
        this.c = fullscreenAdUnitFactory;
        this.d = fullscreenAdUnitListener;
        this.e = listener;
    }

    public final C2588p0 a() {
        return this.a;
    }

    public final InterfaceC2683u6.a b() {
        return this.b;
    }

    @Override // com.ironsource.C2594p6.b
    public void c(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.onAdInfoChanged(adInfo);
    }

    @Override // com.ironsource.InterfaceC2683u6
    public void loadAd() {
        C2594p6 a = this.c.a(true, this.d);
        a.a(this);
        this.f = a;
    }

    @Override // com.ironsource.InterfaceC2683u6
    public void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C2594p6 c2594p6 = this.f;
        if (c2594p6 != null) {
            c2594p6.a(activity, this);
        }
    }

    @Override // com.ironsource.C2594p6.b
    public void b(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.b(adInfo);
    }

    @Override // com.ironsource.C2594p6.b
    public void a(C2594p6 adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f = null;
        this.e.a();
    }

    @Override // com.ironsource.C2594p6.b
    public void b(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.a(ironSourceError);
    }

    @Override // com.ironsource.C2594p6.a
    public void a(C2594p6 adUnit, LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.e.a(adInfo);
    }

    @Override // com.ironsource.C2594p6.a
    public void a(C2594p6 adUnit, IronSourceError ironSourceError) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.e.c(ironSourceError);
    }
}
