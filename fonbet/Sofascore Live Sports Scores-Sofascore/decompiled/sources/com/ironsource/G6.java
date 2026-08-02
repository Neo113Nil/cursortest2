package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public interface G6 {
    void a();

    void a(@NotNull Activity activity);

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@Nullable IronSourceError ironSourceError);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@Nullable IronSourceError ironSourceError);

    void c(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
