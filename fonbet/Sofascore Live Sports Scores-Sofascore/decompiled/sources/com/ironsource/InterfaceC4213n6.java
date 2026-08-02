package com.ironsource;

import android.app.Activity;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.n6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4213n6 {
    @InterfaceC4307sb
    void a();

    @InterfaceC4307sb
    void a(@NotNull Activity activity, @Nullable String str);

    @InterfaceC4307sb
    void a(@NotNull LevelPlayAdError levelPlayAdError);

    @NotNull
    LevelPlayAdInfo b();

    @NotNull
    InterfaceC4153k0 c();

    @InterfaceC4307sb
    void loadAd();

    @InterfaceC4307sb
    void onAdClicked();

    @InterfaceC4307sb
    void onAdClosed();

    @InterfaceC4307sb
    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    @InterfaceC4307sb
    void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    @InterfaceC4307sb
    void onAdLoadFailed(@NotNull LevelPlayAdError levelPlayAdError);

    @InterfaceC4307sb
    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
