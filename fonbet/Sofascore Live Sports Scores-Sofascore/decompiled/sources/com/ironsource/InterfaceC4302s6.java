package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.s6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4302s6 {
    void a();

    void a(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@Nullable IronSourceError ironSourceError);

    void b(@NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@Nullable IronSourceError ironSourceError);

    default void onAdInfoChanged(@NotNull LevelPlayAdInfo levelPlayAdInfo) {
        levelPlayAdInfo.getClass();
    }
}
