package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class C6 implements G6 {

    @NotNull
    private final A6 a;

    @NotNull
    private final C4231o6 b;

    @NotNull
    private final C4231o6 c;

    @NotNull
    private LevelPlayAdInfo d;

    public C6(@NotNull A6 a6, @NotNull C4231o6 c4231o6, @NotNull C4231o6 c4231o62, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        a6.getClass();
        c4231o6.getClass();
        c4231o62.getClass();
        levelPlayAdInfo.getClass();
        this.a = a6;
        this.b = c4231o6;
        this.c = c4231o62;
        this.d = levelPlayAdInfo;
    }

    @Override // com.ironsource.G6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show called before load success"));
    }

    @Override // com.ironsource.G6
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("load failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.G6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a("load success on progressive ad unit is already loaded");
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        this.a.d().b(this.d);
        A6 a6 = this.a;
        a6.a(new E6(a6, this.c));
    }

    @Override // com.ironsource.G6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.d = levelPlayAdInfo;
    }

    @Override // com.ironsource.G6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.a.a("show failed on progressive ad unit that already loaded");
    }

    @Override // com.ironsource.G6
    public void a() {
        A6 a6 = this.a;
        a6.a(new B6(a6, this.b, true));
    }

    @Override // com.ironsource.G6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a("show success on progressive ad unit that already loaded");
    }
}
