package com.ironsource;

import com.ironsource.AbstractC4308f3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.zcl;

/* loaded from: classes13.dex */
public final class La implements Ma {
    private final Ca a;
    private final L2 b;
    private final L2 c;
    private final long d;
    private final boolean e;

    public La(Ca ca, L2 l2, L2 l22, long j, boolean z) {
        this.a = ca;
        this.b = l2;
        this.c = l22;
        this.d = j;
        this.e = z;
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        this.a.a(c4573u0, this.c, this.b, (AbstractC4308f3) new AbstractC4308f3.c(this.a.p().a() - this.d, AbstractC4308f3.d.C0218d.a), false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading an ad while reloading after timer finished");
    }

    @Override // com.ironsource.Ma
    public void c() {
        this.b.a(true);
        this.c.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void d() {
        Ca ca = this.a;
        ca.a((Ma) new Ia(ca, this.b));
    }

    public /* synthetic */ La(Ca ca, L2 l2, L2 l22, long j, boolean z, int i, zcl zclVar) {
        this(ca, l2, l22, j, (i & 16) != 0 ? true : z);
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a(ironSourceError, this.b, (AbstractC4308f3) new AbstractC4308f3.c(this.a.p().a() - this.d, AbstractC4308f3.d.c.a), this.e, false, Long.valueOf(this.d));
    }

    @Override // com.ironsource.Ma
    public void f() {
    }
}
