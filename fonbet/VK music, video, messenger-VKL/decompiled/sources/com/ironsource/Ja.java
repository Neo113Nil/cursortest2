package com.ironsource;

import com.ironsource.AbstractC4308f3;
import com.ironsource.Ff;
import com.ironsource.InterfaceC4477ob;
import com.ironsource.adapters.fyber.FyberConstants;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import xsna.eoo;
import xsna.izs;
import xsna.s3q0;
import xsna.zcl;
import xsna.zno;

/* loaded from: classes13.dex */
public final class Ja implements Ma {
    private final Ca a;
    private final L2 b;
    private final L2 c;
    private final long d;
    private final boolean e;
    private InterfaceC4477ob<LevelPlayAdInfo> f;
    private Ff.a g;

    public static final class a extends Lambda implements izs<Ja, s3q0> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(Ja ja) {
            ja.e();
        }

        @Override // xsna.izs
        public /* bridge */ /* synthetic */ s3q0 invoke(Ja ja) {
            a(ja);
            return s3q0.a;
        }
    }

    public Ja(Ca ca, L2 l2, L2 l22, long j, boolean z) {
        this.a = ca;
        this.b = l2;
        this.c = l22;
        this.d = j;
        this.e = z;
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        InterfaceC4477ob<LevelPlayAdInfo> interfaceC4477ob = this.f;
        if (interfaceC4477ob == null) {
            Ca ca = this.a;
            ca.a((Ma) new La(ca, this.b, this.c, this.d, this.e));
        } else if (interfaceC4477ob instanceof InterfaceC4477ob.b) {
            a((LevelPlayAdInfo) ((InterfaceC4477ob.b) interfaceC4477ob).b());
        } else if (interfaceC4477ob instanceof InterfaceC4477ob.a) {
            b(((InterfaceC4477ob.a) interfaceC4477ob).b());
        }
    }

    private final void g() {
        Ff o = this.a.o();
        Ff.b a2 = Gf.a(this, a.a);
        zno.a aVar = zno.c;
        this.g = o.a(a2, eoo.f(this.a.l(), DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading an ad while reloading");
    }

    @Override // com.ironsource.Ma
    public void c() {
        Ff.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        this.c.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        Ff.a aVar = this.g;
        if (aVar != null) {
            aVar.a();
        }
        Ca ca = this.a;
        ca.a((Ma) new Ia(ca, this.b));
    }

    @Override // com.ironsource.Ma
    public void f() {
        Ca ca = this.a;
        ca.a((Ma) new Ja(ca, this.b, this.c, ca.p().a(), false, 16, null));
    }

    private final void b(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4308f3) new AbstractC4308f3.c(this.a.p().a() - this.d, AbstractC4308f3.d.g.a), this.e, false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        LevelPlayAdInfo c = c4573u0.c();
        if (c != null) {
            a(new InterfaceC4477ob.b(c));
        } else {
            a(new InterfaceC4477ob.a(new IronSourceError(0, "Missing ad info")));
        }
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        if (ironSourceError == null) {
            ironSourceError = new IronSourceError(0, FyberConstants.Logs.UNKNOWN_ERROR);
        }
        a(new InterfaceC4477ob.a(ironSourceError));
    }

    private final void a(LevelPlayAdInfo levelPlayAdInfo) {
        long a2 = this.a.p().a() - this.d;
        this.a.a(new C4573u0(this.c, levelPlayAdInfo), this.c, this.b, (AbstractC4308f3) new AbstractC4308f3.c(a2, AbstractC4308f3.d.h.a), false, Long.valueOf(this.d));
    }

    public /* synthetic */ Ja(Ca ca, L2 l2, L2 l22, long j, boolean z, int i, zcl zclVar) {
        this(ca, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    private final void a(InterfaceC4477ob<LevelPlayAdInfo> interfaceC4477ob) {
        String b;
        if (this.f != null) {
            Ca ca = this.a;
            b = Ka.b(interfaceC4477ob);
            ca.a("Received excessive load " + b + " while reloading");
            return;
        }
        this.f = interfaceC4477ob;
    }
}
