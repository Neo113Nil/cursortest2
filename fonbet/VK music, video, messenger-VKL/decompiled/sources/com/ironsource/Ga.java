package com.ironsource;

import android.graphics.Rect;
import com.ironsource.AbstractC4308f3;
import com.ironsource.Ff;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Lambda;
import kotlin.time.DurationUnit;
import xsna.eoo;
import xsna.gzs;
import xsna.mf3;
import xsna.p31;
import xsna.s3q0;
import xsna.zno;

/* loaded from: classes13.dex */
public final class Ga implements Ma {
    private final Ca a;
    private final L2 b;
    private final Long c;
    private Ff.a d;
    private final long e;

    public static final class a extends Lambda implements gzs<s3q0> {
        final /* synthetic */ AbstractC4308f3.c b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4308f3.c cVar, long j) {
            super(0);
            this.b = cVar;
            this.c = j;
        }

        public final void a() {
            Ga.this.a.a(Ga.this.b, this.b, Long.valueOf(this.c));
        }

        @Override // xsna.gzs
        public /* bridge */ /* synthetic */ s3q0 invoke() {
            a();
            return s3q0.a;
        }
    }

    public Ga(Ca ca, L2 l2, Long l) {
        this.a = ca;
        this.b = l2;
        this.c = l;
        this.e = ca.p().a();
        ca.r();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Ga ga) {
        C4602vb.a(ga.a.a(), new p31(ga, 13), 0L, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Ga ga) {
        if (!Ig.a(ga.a.k(), new Rect())) {
            ga.e();
            return;
        }
        long a2 = ga.a.p().a();
        long j = a2 - ga.e;
        Long l = ga.c;
        ga.a.a().c(AbstractRunnableC4408ke.a.a(ga.new a(new AbstractC4308f3.c(l != null ? a2 - l.longValue() : 0L, new AbstractC4308f3.d.f(j)), a2)));
    }

    private final void e() {
        long q = this.a.q();
        Ff o = this.a.o();
        mf3 mf3Var = new mf3(this, 8);
        zno.a aVar = zno.c;
        this.d = o.a(mf3Var, eoo.f(q, DurationUnit.MILLISECONDS));
    }

    @Override // com.ironsource.M0
    public void a(C4573u0 c4573u0) {
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ma
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ma
    public void c() {
        Ff.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        Ca ca = this.a;
        ca.a((Ma) new Fa(ca));
    }

    @Override // com.ironsource.Ma
    public void f() {
    }

    @Override // com.ironsource.M0
    public void a(IronSourceError ironSourceError) {
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ma
    public void d() {
        Ff.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        Ca ca = this.a;
        ca.a((Ma) new Ia(ca, this.b));
    }
}
