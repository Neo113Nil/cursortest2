package com.ironsource;

import com.ironsource.AbstractC4031d3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Ga implements Ka {

    @NotNull
    private final Ba a;

    @NotNull
    private final J2 b;

    public Ga(@NotNull Ba ba, @NotNull J2 j2) {
        ba.getClass();
        j2.getClass();
        this.a = ba;
        this.b = j2;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        this.a.a("Received load success while paused");
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ka
    public void c() {
        this.b.a(true);
        Ba ba = this.a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void f() {
        Ba.a(this.a, this.b, (AbstractC4031d3) new AbstractC4031d3.a(AbstractC4031d3.b.c.a), false, 4, (Object) null);
    }

    @Override // com.ironsource.L0
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed while paused");
    }

    @Override // com.ironsource.Ka
    public void d() {
    }
}
