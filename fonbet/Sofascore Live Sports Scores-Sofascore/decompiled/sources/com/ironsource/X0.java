package com.ironsource;

import com.ironsource.V0;
import com.unity3d.mediation.LevelPlay;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X0 {
    @NotNull
    public final V0 a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, @NotNull F8 f8) {
        str.getClass();
        adFormat.getClass();
        f8.getClass();
        if (str.length() == 0) {
            return new V0.a(W0.a);
        }
        if (!f8.c()) {
            return new V0.a(W0.b);
        }
        Sa a = f8.a();
        return (a == null || !a.a(str, adFormat)) ? new V0.a(W0.c) : V0.b.a;
    }
}
