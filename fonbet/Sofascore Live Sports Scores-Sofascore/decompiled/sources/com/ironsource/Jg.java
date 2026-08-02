package com.ironsource;

import defpackage.a70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface Jg {
    static /* synthetic */ Hg a(Jg jg, Pg pg, F f, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: createWaterfall");
            return null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        return jg.a(pg, f);
    }

    @NotNull
    Hg a(@NotNull Pg pg, @Nullable F f);
}
