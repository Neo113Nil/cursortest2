package com.ironsource;

import android.app.Activity;
import com.ironsource.C4052e6;
import com.ironsource.InterfaceC4153k0;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.npm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.m6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4195m6 implements InterfaceC4213n6 {

    @NotNull
    private final Va a;

    @NotNull
    private final LevelPlayAdInfo b;

    public C4195m6(@NotNull Va va, @NotNull LevelPlayAdInfo levelPlayAdInfo) {
        va.getClass();
        levelPlayAdInfo.getClass();
        this.a = va;
        this.b = levelPlayAdInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4195m6 c4195m6) {
        c4195m6.getClass();
        Wa k = c4195m6.a.k();
        if (k != null) {
            k.onAdClosed(c4195m6.b);
        }
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        String uuid = this.a.e().toString();
        uuid.getClass();
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW, "Ad is already shown"), this.b);
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public InterfaceC4153k0 c() {
        return new InterfaceC4153k0.a("ad is shown");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void loadAd() {
        String uuid = this.a.e().toString();
        uuid.getClass();
        Va.a(this.a, new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW, "Load is called while ad is shown"), 0L, 2, null);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClicked() {
        IronLog.INTERNAL.verbose(C4243p0.a(this.a.f(), "onAdClicked adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.f().b(new npm(this, 0));
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClosed() {
        IronLog.INTERNAL.verbose(C4243p0.a(this.a.f(), "onAdClosed adInfo: " + this.b, (String) null, 2, (Object) null));
        this.a.a(C4052e6.a.Closed);
        this.a.f().b(new npm(this, 1));
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdDisplayed on shown state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdInfoChanged on shown state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdLoadFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdLoaded on shown state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.b;
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a() {
        this.a.b("onAdExpired on shown state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdDisplayFailed on shown state with error: " + levelPlayAdError.getErrorMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4195m6 c4195m6) {
        c4195m6.getClass();
        Wa k = c4195m6.a.k();
        if (k != null) {
            k.onAdClicked(c4195m6.b);
        }
    }
}
