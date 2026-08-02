package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* renamed from: com.ironsource.z6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4428z6 {
    void a(@NotNull Activity activity);

    void a(@NotNull C4231o6 c4231o6);

    void a(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError);

    void a(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void b(@NotNull C4231o6 c4231o6, @Nullable IronSourceError ironSourceError);

    void b(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void c(@NotNull C4231o6 c4231o6, @NotNull LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}
