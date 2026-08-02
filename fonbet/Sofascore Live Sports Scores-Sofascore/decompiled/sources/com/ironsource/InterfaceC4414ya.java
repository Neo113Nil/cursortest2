package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ya, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4414ya {
    void a(@Nullable IronSourceError ironSourceError);

    void d(@Nullable IronSourceError ironSourceError);

    void i();

    void k();

    void onAdClicked();

    void onAdDisplayed(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void onAdLeftApplication();

    void onAdLoaded(@NotNull LevelPlayAdInfo levelPlayAdInfo);
}
