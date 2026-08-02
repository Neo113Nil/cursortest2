package com.ironsource;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface Uc {
    default void a(@NotNull B b, @Nullable String str, @NotNull C4181la c4181la) {
        b.getClass();
        c4181la.getClass();
    }

    default void a(@NotNull List<? extends B> list, @NotNull B b) {
        list.getClass();
        b.getClass();
    }
}
