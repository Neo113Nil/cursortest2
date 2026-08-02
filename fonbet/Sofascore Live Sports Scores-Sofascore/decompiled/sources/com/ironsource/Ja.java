package com.ironsource;

import com.ironsource.AbstractC4031d3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Ja implements Ka {

    @NotNull
    private final Ba a;

    @NotNull
    private final J2 b;

    @NotNull
    private final J2 c;
    private final long d;
    private final boolean e;

    public Ja(@NotNull Ba ba, @NotNull J2 j2, @NotNull J2 j22, long j, boolean z) {
        ba.getClass();
        j2.getClass();
        j22.getClass();
        this.a = ba;
        this.b = j2;
        this.c = j22;
        this.d = j;
        this.e = z;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        this.a.a(c4332u0, this.c, this.b, (AbstractC4031d3) new AbstractC4031d3.c(this.a.o().a() - this.d, AbstractC4031d3.d.C1198d.a), false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.L0
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4031d3) new AbstractC4031d3.c(this.a.o().a() - this.d, AbstractC4031d3.d.c.a), this.e, false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.Ka
    public void c() {
        this.b.a(true);
        this.c.a(true);
        Ba ba = this.a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        Ba ba = this.a;
        ba.a((Ka) new Ga(ba, this.b));
    }

    @Override // com.ironsource.Ka
    public void f() {
    }

    public /* synthetic */ Ja(Ba ba, J2 j2, J2 j22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, j2, j22, j, (i & 16) != 0 ? true : z);
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.a.a("Loading an ad while reloading after timer finished");
    }
}
