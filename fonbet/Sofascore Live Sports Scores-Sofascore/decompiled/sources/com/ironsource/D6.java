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
public final class D6 implements G6 {

    @NotNull
    private final A6 a;

    @NotNull
    private final C4231o6 b;

    @NotNull
    private final C4231o6 c;

    public D6(@NotNull A6 a6, @NotNull C4231o6 c4231o6, @NotNull C4231o6 c4231o62) {
        a6.getClass();
        c4231o6.getClass();
        c4231o62.getClass();
        this.a = a6;
        this.b = c4231o6;
        this.c = c4231o62;
    }

    @Override // com.ironsource.G6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.a.d().c(new IronSourceError(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD, "Show called while progressive loading another ad"));
    }

    @Override // com.ironsource.G6
    public void b(@Nullable IronSourceError ironSourceError) {
        A6 a6 = this.a;
        a6.a(new B6(a6, this.b, false, 4, null));
    }

    @Override // com.ironsource.G6
    public void c(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        A6 a6 = this.a;
        a6.a(new C6(a6, this.b, this.c, levelPlayAdInfo));
    }

    @Override // com.ironsource.G6
    public void loadAd() {
        A6 a6 = this.a;
        a6.a(new F6(a6, this.c));
    }

    @Override // com.ironsource.G6
    public void b(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a("load success with better ad before progressive load success");
    }

    @Override // com.ironsource.G6
    public void c(@Nullable IronSourceError ironSourceError) {
        this.a.a("show failed before progressive load success");
    }

    @Override // com.ironsource.G6
    public void a() {
        this.a.a("ad expired before progressive load success");
    }

    @Override // com.ironsource.G6
    public void a(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.a("show success before progressive load success");
    }
}
