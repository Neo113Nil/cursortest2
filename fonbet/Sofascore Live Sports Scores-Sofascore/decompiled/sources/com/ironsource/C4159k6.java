package com.ironsource;

import android.app.Activity;
import com.ironsource.C4052e6;
import com.ironsource.InterfaceC4153k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.k6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4159k6 implements InterfaceC4213n6 {

    @NotNull
    private final Va a;

    @NotNull
    private final InterfaceC4193m4 b;
    private final long c;

    @NotNull
    private final LevelPlayAdInfo d;

    public C4159k6(@NotNull Va va, @NotNull InterfaceC4193m4 interfaceC4193m4) {
        va.getClass();
        interfaceC4193m4.getClass();
        this.a = va;
        this.b = interfaceC4193m4;
        this.c = interfaceC4193m4.a();
        String uuid = va.e().toString();
        uuid.getClass();
        this.d = new LevelPlayAdInfo(uuid, va.h(), va.d().toString(), null, null, null, null, 120, null);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        String uuid = this.a.e().toString();
        uuid.getClass();
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, "Show is called while loading ad"), this.d);
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.d;
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public InterfaceC4153k0 c() {
        return new InterfaceC4153k0.a("Ad is loading");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void loadAd() {
        String uuid = this.a.e().toString();
        uuid.getClass();
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED, "Load is already called"), this.b.a() - this.c);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClicked() {
        this.a.b("onAdClicked on loading state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClosed() {
        this.a.b("onAdClosed on loading state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdDisplayed on loading state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdInfoChanged on loading state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.a(levelPlayAdError, this.b.a() - this.c);
        this.a.a(C4052e6.a.LoadFailed);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        Va va = this.a;
        va.a(new C4141j6(va, levelPlayAdInfo, this.b));
        this.a.a(levelPlayAdInfo);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a() {
        this.a.b("onAdExpired on loading state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdDisplayFailed on loading state with error: " + levelPlayAdError.getErrorMessage());
    }
}
