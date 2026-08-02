package com.ironsource;

import android.app.Activity;
import com.ironsource.C4052e6;
import com.ironsource.InterfaceC4153k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.wem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.j6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4141j6 implements InterfaceC4213n6 {

    @NotNull
    private final Va a;

    @NotNull
    private LevelPlayAdInfo b;

    @NotNull
    private final InterfaceC4193m4 c;
    private final long d;

    public C4141j6(@NotNull Va va, @NotNull LevelPlayAdInfo levelPlayAdInfo, @NotNull InterfaceC4193m4 interfaceC4193m4) {
        va.getClass();
        levelPlayAdInfo.getClass();
        interfaceC4193m4.getClass();
        this.a = va;
        this.b = levelPlayAdInfo;
        this.c = interfaceC4193m4;
        this.d = interfaceC4193m4.a();
    }

    private final long d() {
        return this.c.a() - this.d;
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        C4077fd a = this.a.f().a(this.a.d(), str);
        LevelPlayAdInfo levelPlayAdInfo = new LevelPlayAdInfo(this.b, str);
        this.b = levelPlayAdInfo;
        Va va = this.a;
        va.a(new C4177l6(va, levelPlayAdInfo));
        this.a.c().a(activity, a);
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public InterfaceC4153k0 c() {
        D3 a = this.a.l().g().a(this.a.h());
        return a.d() ? InterfaceC4153k0.a.c.a(a.e()) : InterfaceC4153k0.b.a;
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void loadAd() {
        this.a.f().f().h().a(Long.valueOf(d()));
        this.a.a(this.b);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClicked() {
        this.a.b("onAdClicked on loaded state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClosed() {
        this.a.b("onAdClosed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdDisplayed on loaded state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        C4243p0 f = this.a.f();
        IronLog.INTERNAL.verbose(C4243p0.a(f, "onAdInfoChanged adInfo: " + levelPlayAdInfo, (String) null, 2, (Object) null));
        f.f().h().a(this.b, levelPlayAdInfo);
        this.b = levelPlayAdInfo;
        f.b(new wem(7, this, levelPlayAdInfo));
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdLoadFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdLoaded on loaded state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a() {
        IronLog.INTERNAL.verbose(C4243p0.a(this.a.f(), "onAdExpired", (String) null, 2, (Object) null));
        this.a.a(C4052e6.a.Expired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4141j6 c4141j6, LevelPlayAdInfo levelPlayAdInfo) {
        c4141j6.getClass();
        levelPlayAdInfo.getClass();
        Wa k = c4141j6.a.k();
        if (k != null) {
            k.onAdInfoChanged(levelPlayAdInfo);
        }
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdDisplayFailed on loaded state with error: " + levelPlayAdError.getErrorMessage());
    }
}
