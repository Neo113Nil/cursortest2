package com.ironsource;

import android.graphics.Rect;
import com.ironsource.AbstractC4031d3;
import com.ironsource.Df;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.be5;
import defpackage.hg5;
import defpackage.wd5;
import defpackage.wkn;
import defpackage.xd5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@InterfaceC4307sb
/* loaded from: classes4.dex */
public final class Ea implements Ka {

    @NotNull
    private final Ba a;

    @NotNull
    private final J2 b;

    @Nullable
    private final Long c;

    @Nullable
    private Df.a d;
    private final long e;

    public Ea(@NotNull Ba ba, @NotNull J2 j2, @Nullable Long l) {
        ba.getClass();
        j2.getClass();
        this.a = ba;
        this.b = j2;
        this.c = l;
        this.e = ba.o().a();
        ba.q();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ea ea) {
        ea.getClass();
        boolean a = Fg.a(ea.a.j(), new Rect());
        Ba ba = ea.a;
        if (!a) {
            ba.a().a(new hg5(ea, 0));
            return;
        }
        long a2 = ba.o().a();
        long j = a2 - ea.e;
        Long l = ea.c;
        ea.a.a().a(new defpackage.jd(ea, new AbstractC4031d3.c(l != null ? a2 - l.longValue() : 0L, new AbstractC4031d3.d.f(j)), a2, 2));
    }

    private final void e() {
        long p = this.a.p();
        Df n = this.a.n();
        hg5 hg5Var = new hg5(this, 1);
        wd5 wd5Var = xd5.b;
        this.d = n.a(hg5Var, wkn.S(p, be5.MILLISECONDS));
    }

    @Override // com.ironsource.Ka
    public void b() {
        this.a.a("Loading a loaded ad");
    }

    @Override // com.ironsource.Ka
    public void c() {
        Df.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        this.b.a(true);
        Ba ba = this.a;
        ba.a((Ka) new Da(ba));
    }

    @Override // com.ironsource.Ka
    public void d() {
        Df.a aVar = this.d;
        if (aVar != null) {
            aVar.a();
        }
        Ba ba = this.a;
        ba.a((Ka) new Ga(ba, this.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Ea ea) {
        ea.getClass();
        ea.e();
    }

    @Override // com.ironsource.L0
    public void b(@Nullable IronSourceError ironSourceError) {
        this.a.a("Received load success while paused not visible");
    }

    @Override // com.ironsource.Ka
    public void f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ea ea, AbstractC4031d3.c cVar, long j) {
        ea.getClass();
        cVar.getClass();
        ea.a.a(ea.b, cVar, Long.valueOf(j));
    }

    @Override // com.ironsource.L0
    public void a(@NotNull C4332u0 c4332u0) {
        c4332u0.getClass();
        this.a.a("Received load success while paused not visible");
    }
}
