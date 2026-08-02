package com.ironsource;

import com.ironsource.AbstractC4031d3;
import com.ironsource.Df;
import com.ironsource.InterfaceC4182lb;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import defpackage.be5;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Ha implements Ka {

    @NotNull
    private final Ba a;

    @NotNull
    private final J2 b;

    @NotNull
    private final J2 c;
    private final long d;
    private final boolean e;

    @Nullable
    private InterfaceC4182lb<LevelPlayAdInfo> f;

    @Nullable
    private Df.a g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a extends xka implements Function1<Ha, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull Ha ha) {
            ha.getClass();
            ha.e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Ha) obj);
            return Unit.a;
        }
    }

    public Ha(@NotNull Ba ba, @NotNull J2 j2, @NotNull J2 j22, long j, boolean z) {
        ba.getClass();
        j2.getClass();
        j22.getClass();
        this.a = ba;
        this.b = j2;
        this.c = j22;
        this.d = j;
        this.e = z;
        g();
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long a2 = this.a.o().a() - this.d;
        this.a.a(new C4332u0(this.c, levelPlayAdInfo), this.c, this.b, (AbstractC4031d3) new AbstractC4031d3.c(a2, AbstractC4031d3.d.h.a), false, Long.valueOf(this.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC4182lb<LevelPlayAdInfo> interfaceC4182lb = this.f;
        if (interfaceC4182lb == null) {
            Ba ba = this.a;
            ba.a((Ka) new Ja(ba, this.b, this.c, this.d, this.e));
        } else if (interfaceC4182lb instanceof InterfaceC4182lb.b) {
            a((LevelPlayAdInfo) ((InterfaceC4182lb.b) interfaceC4182lb).b());
        } else if (interfaceC4182lb instanceof InterfaceC4182lb.a) {
            a(((InterfaceC4182lb.a) interfaceC4182lb).b());
        }
    }

    private final void g() {
        Df n = this.a.n();
        wd5 wd5Var = xd5.b;
        this.g = n.a(this, wkn.S(this.a.k(), be5.MILLISECONDS), a.a);
    }

    @Override // com.ironsource.L0
    public void b(@Nullable IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, "Unknown error");
        }
        a(new InterfaceC4182lb.a(ironSourceError));
    }

    @Override // com.ironsource.Ka
    public void c() {
        Df.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        this.c.a(true);
        Ba ba = this.a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        Df.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        Ba ba = this.a;
        ba.a((Ka) new Ga(ba, this.b));
    }

    @Override // com.ironsource.Ka
    public void f() {
        Ba ba = this.a;
        ba.a((Ka) new Ha(ba, this.b, this.c, ba.o().a(), false, 16, null));
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.a.a("Loading an ad while reloading");
    }

    public /* synthetic */ Ha(Ba ba, J2 j2, J2 j22, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba, j2, j22, j, (i & 16) != 0 ? true : z);
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        LevelPlayAdInfo c = c4332u0.c();
        if (c != null) {
            a(new InterfaceC4182lb.b(c));
        } else {
            a(new InterfaceC4182lb.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    private final void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4031d3) new AbstractC4031d3.c(this.a.o().a() - this.d, AbstractC4031d3.d.g.a), this.e, false, Long.valueOf(this.d));
    }

    private final void a(InterfaceC4182lb<LevelPlayAdInfo> interfaceC4182lb) {
        String b;
        if (this.f != null) {
            Ba ba = this.a;
            b = Ia.b(interfaceC4182lb);
            ba.a("Received excessive load " + b + " while reloading");
            return;
        }
        this.f = interfaceC4182lb;
    }
}
