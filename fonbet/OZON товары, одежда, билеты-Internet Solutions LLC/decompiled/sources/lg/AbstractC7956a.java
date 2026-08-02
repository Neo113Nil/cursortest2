package lg;

import Fm.C3051a;
import jg.h;
import jg.p;
import mg.EnumC8145a;
import mg.d;
import mg.i;
import mg.j;
import mg.l;

/* renamed from: lg.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC7956a extends Lf.a implements h {
    public AbstractC7956a() {
        super(false);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.ERA : hVar != null && hVar.a(this);
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        return hVar == EnumC8145a.ERA ? ((p) this).L0() : p(hVar).a(m(hVar), hVar);
    }

    @Override // mg.f
    public final d R(d dVar) {
        return dVar.j1(((p) this).L0(), EnumC8145a.ERA);
    }

    @Override // Lf.a, mg.e
    public final <R> R d(j<R> jVar) {
        if (jVar == i.e()) {
            return (R) mg.b.ERAS;
        }
        if (jVar == i.a() || jVar == i.f() || jVar == i.g() || jVar == i.d() || jVar == i.b() || jVar == i.c()) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (hVar == EnumC8145a.ERA) {
            return ((p) this).L0();
        }
        if (hVar instanceof EnumC8145a) {
            throw new l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.f(this);
    }
}
