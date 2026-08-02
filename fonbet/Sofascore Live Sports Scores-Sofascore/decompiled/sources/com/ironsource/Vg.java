package com.ironsource;

import com.ironsource.S4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vg implements Yg {

    @NotNull
    private final Rg a;

    public Vg(@NotNull Rg rg) {
        rg.getClass();
        this.a = rg;
    }

    @Override // com.ironsource.Yg
    public void a(@NotNull B b) {
        b.getClass();
        this.a.a(b);
        this.a.a(S4.b.b);
    }

    @Override // com.ironsource.Yg
    @NotNull
    public Md b() {
        return Md.FEATURE_DISABLED;
    }

    @Override // com.ironsource.Yg
    @Nullable
    public B c() {
        return this.a.a(0);
    }

    @Override // com.ironsource.Yg
    public void a() {
    }
}
