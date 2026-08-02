package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Ca implements Ka {

    @NotNull
    private final Ba a;
    private boolean b;

    public Ca(@NotNull Ba ba, boolean z) {
        ba.getClass();
        this.a = ba;
        this.b = z;
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        this.a.a("Received load success before load");
    }

    @Override // com.ironsource.Ka
    public void b() {
        J2 a = this.a.i().a(true);
        this.a.a((Ka) new Fa(this.a, a, this.b));
        a.a(this.a.g());
    }

    @Override // com.ironsource.Ka
    public void c() {
        Ba ba = this.a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.Ka
    public void f() {
        this.b = false;
    }

    public /* synthetic */ Ca(Ba ba, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, (i & 2) != 0 ? false : z);
    }

    @Override // com.ironsource.L0
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load failed before load");
    }
}
