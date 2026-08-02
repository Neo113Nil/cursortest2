package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4220nd {

    @NotNull
    private final String a;

    @NotNull
    private final LevelPlay.AdFormat b;

    public C4220nd(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        str.getClass();
        adFormat.getClass();
        this.a = str;
        this.b = adFormat;
    }

    @NotNull
    public final String a() {
        return this.a + "_" + this.b;
    }
}
