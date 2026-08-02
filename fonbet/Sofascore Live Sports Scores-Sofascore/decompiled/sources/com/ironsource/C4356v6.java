package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.v6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4356v6 implements InterfaceC4428z6 {

    @NotNull
    private final C4338u6 a;

    public C4356v6(@NotNull C4338u6 c4338u6) {
        c4338u6.getClass();
        this.a = c4338u6;
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.a.a("ad display success before load called");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.a.a("load success before load called");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        c4231o6.getClass();
        levelPlayAdInfo.getClass();
        this.a.a("load success with better ad before load called");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void loadAd() {
        C4231o6 a = this.a.b().a(true, this.a.c());
        this.a.a(new C4392x6(this.a, a, true));
        a.a(this.a);
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6) {
        c4231o6.getClass();
        this.a.a("ad expired before load called");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.a.a("load failed before load called");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull Activity activity) {
        activity.getClass();
        this.a.a("show called before load success");
    }

    @Override // com.ironsource.InterfaceC4428z6
    public void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError) {
        c4231o6.getClass();
        this.a.a("ad display failed before load called");
    }
}
