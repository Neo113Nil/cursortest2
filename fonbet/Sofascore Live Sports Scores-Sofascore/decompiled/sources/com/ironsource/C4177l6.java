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
/* renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4177l6 implements InterfaceC4213n6 {

    @NotNull
    private final Va a;

    @NotNull
    private final LevelPlayAdInfo b;

    public C4177l6(@NotNull Va va, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        va.getClass();
        levelPlayAdInfo.getClass();
        this.a = va;
        this.b = levelPlayAdInfo;
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        String uuid = this.a.e().toString();
        uuid.getClass();
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already showing"), this.b);
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public InterfaceC4153k0 c() {
        return new InterfaceC4153k0.a("ad is showing");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void loadAd() {
        String uuid = this.a.e().toString();
        uuid.getClass();
        Va.a(this.a, new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is showing"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClicked() {
        this.a.b("onAdClicked on showing state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClosed() {
        this.a.b("onAdClosed on showing state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        C4243p0 f = this.a.f();
        LevelPlayAdInfo levelPlayAdInfo2 = new LevelPlayAdInfo(levelPlayAdInfo, this.b.getPlacementName());
        IronLog.INTERNAL.verbose(C4243p0.a(f, "onAdDisplayed adInfo: " + levelPlayAdInfo2, (String) null, 2, (Object) null));
        f.f().h().d();
        Va va = this.a;
        va.a(new C4195m6(va, levelPlayAdInfo2));
        f.b(new wem(9, this, levelPlayAdInfo2));
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdInfoChanged on showing state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdLoadFailed on showing state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdLoaded on showing state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.a(a(levelPlayAdError, this.b));
        this.a.a(levelPlayAdError, this.b);
    }

    private final InterfaceC4213n6 a(LevelPlayAdError levelPlayAdError, LevelPlayAdInfo levelPlayAdInfo) {
        boolean a = Y4.a.a(Zf.a.a(levelPlayAdError));
        Va va = this.a;
        if (a) {
            return new C4141j6(va, levelPlayAdInfo, va.j());
        }
        return new C4052e6(va, C4052e6.a.ShowFailed);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a() {
        this.a.b("onAdExpired on showing state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4177l6 c4177l6, LevelPlayAdInfo levelPlayAdInfo) {
        c4177l6.getClass();
        levelPlayAdInfo.getClass();
        Wa k = c4177l6.a.k();
        if (k != null) {
            k.onAdDisplayed(levelPlayAdInfo);
        }
    }
}
