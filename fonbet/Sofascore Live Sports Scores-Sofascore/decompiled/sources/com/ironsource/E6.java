package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class E6 implements G6 {

    @NotNull
    private final A6 a;

    @NotNull
    private final C4231o6 b;

    public E6(@NotNull A6 a6, @NotNull C4231o6 c4231o6) {
        a6.getClass();
        c4231o6.getClass();
        this.a = a6;
        this.b = c4231o6;
    }

    @Override // com.ironsource.G6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.d().a(levelPlayAdInfo);
        C4231o6 a = this.a.b().a(false, this.a.c());
        A6 a6 = this.a;
        a6.a(new D6(a6, this.b, a));
        a.a(this.a);
    }

    @Override // com.ironsource.G6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.d().onAdInfoChanged(levelPlayAdInfo);
    }

    @Override // com.ironsource.G6
    public void c(@Nullable IronSourceError ironSourceError) {
        if (!Y4.a.a(ironSourceError)) {
            A6 a6 = this.a;
            a6.a(new B6(a6, null, false, 4, null));
        }
        this.a.d().c(ironSourceError);
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        A6 a6 = this.a;
        a6.a(new B6(a6, null, false, 4, null));
        this.a.loadAd();
    }

    @Override // com.ironsource.G6
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("load failed after ad unit is already loaded");
    }

    @Override // com.ironsource.G6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a("Ad unit is already loaded");
    }

    @Override // com.ironsource.G6
    public void a() {
        A6 a6 = this.a;
        a6.a(new B6(a6, null, true));
        this.a.d().a();
    }

    @Override // com.ironsource.G6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.b.a(activity, this.a);
    }
}
