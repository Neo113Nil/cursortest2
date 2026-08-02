package com.ironsource;

import com.ironsource.AbstractC4085g3;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ug<Smash extends AbstractC4085g3<?>> {

    @NotNull
    private final Zg<Smash> a;

    public Ug(@NotNull Zg<Smash> zg) {
        zg.getClass();
        this.a = zg;
    }

    @NotNull
    public final List<Smash> a() {
        return this.a.c();
    }

    public final boolean b() {
        return this.a.c().isEmpty() && this.a.a().isEmpty();
    }

    public final boolean c() {
        return this.a.d() == 0;
    }
}
