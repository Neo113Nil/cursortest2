package com.ironsource;

import android.app.Activity;
import com.ironsource.InterfaceC4153k0;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.e6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4052e6 implements InterfaceC4213n6 {

    @NotNull
    private final Va a;

    @NotNull
    private final a b;

    @NotNull
    private final LevelPlayAdInfo c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.e6$a */
    public enum a {
        Created,
        Closed,
        Expired,
        ShowFailed,
        LoadFailed
    }

    public C4052e6(@NotNull Va va, @NotNull a aVar) {
        va.getClass();
        aVar.getClass();
        this.a = va;
        this.b = aVar;
        String uuid = va.e().toString();
        uuid.getClass();
        this.c = new LevelPlayAdInfo(uuid, va.h(), va.d().toString(), null, null, null, null, 120, null);
    }

    private final boolean d() {
        int length = this.a.h().length();
        Va va = this.a;
        if (length == 0) {
            String uuid = this.a.e().toString();
            uuid.getClass();
            Va.a(va, new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"), 0L, 2, null);
            return false;
        }
        boolean a2 = va.f().a();
        Va va2 = this.a;
        if (!a2) {
            String uuid2 = this.a.e().toString();
            uuid2.getClass();
            Va.a(va2, new LevelPlayAdError(uuid2, this.a.h(), LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "Load must be called after init success callback"), 0L, 2, null);
            return false;
        }
        Sa a3 = va2.l().f().a();
        if (a3 != null && a3.a(this.a.h(), this.a.d())) {
            return true;
        }
        Va va3 = this.a;
        String uuid3 = this.a.e().toString();
        uuid3.getClass();
        Va.a(va3, new LevelPlayAdError(uuid3, this.a.h(), LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"), 0L, 2, null);
        return false;
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull Activity activity, @Nullable String str) {
        activity.getClass();
        String str2 = this.b == a.Expired ? "Show called on expired ad" : "Show called before load success";
        String uuid = this.a.e().toString();
        uuid.getClass();
        this.a.a(new LevelPlayAdError(uuid, this.a.h(), LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK, str2), this.c);
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public LevelPlayAdInfo b() {
        return this.c;
    }

    @Override // com.ironsource.InterfaceC4213n6
    @NotNull
    public InterfaceC4153k0 c() {
        return new InterfaceC4153k0.a(this.b == a.Expired ? "ad is invalid due to loading time" : "load ad was not called");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void loadAd() {
        if (d()) {
            this.a.o();
        }
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClicked() {
        this.a.b("onAdClicked on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdClosed() {
        this.a.b("onAdClosed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdDisplayed on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdInfoChanged on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdLoadFailed on " + this.b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
        this.a.b("onAdLoaded on " + this.b + " state");
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a(@NotNull LevelPlayAdError levelPlayAdError) {
        levelPlayAdError.getClass();
        this.a.b("onAdDisplayFailed on " + this.b + " state with error: " + levelPlayAdError.getErrorMessage());
    }

    public /* synthetic */ C4052e6(Va va, a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(va, (i & 2) != 0 ? a.Created : aVar);
    }

    @Override // com.ironsource.InterfaceC4213n6
    public void a() {
        this.a.b("onAdExpired on " + this.b + " state");
    }
}
