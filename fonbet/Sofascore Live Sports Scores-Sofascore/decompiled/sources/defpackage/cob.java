package defpackage;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcob;", "Lbuc;", "Leob;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class cob extends buc {
    public final ma0 a;
    public final fo6 b;
    public final rie c;

    public cob(ma0 ma0Var, fo6 fo6Var, rie rieVar) {
        this.a = ma0Var;
        this.b = fo6Var;
        this.c = rieVar;
    }

    @Override // defpackage.buc
    public final wtc c() {
        return new eob(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // defpackage.buc
    public final void g(wtc wtcVar) {
        eob eobVar = (eob) wtcVar;
        float f = eobVar.q;
        long j = eobVar.s;
        float f2 = eobVar.t;
        boolean z = eobVar.r;
        float f3 = eobVar.u;
        boolean z2 = eobVar.v;
        rie rieVar = eobVar.w;
        View view = eobVar.x;
        kx4 kx4Var = eobVar.y;
        eobVar.o = this.a;
        eobVar.q = Float.NaN;
        eobVar.r = true;
        eobVar.s = 9205357640488583168L;
        eobVar.t = Float.NaN;
        eobVar.u = Float.NaN;
        eobVar.v = true;
        eobVar.p = this.b;
        rie rieVar2 = this.c;
        eobVar.w = rieVar2;
        View N = pco.N(eobVar);
        kx4 kx4Var2 = c6o.c0(eobVar).y;
        if (eobVar.z != null) {
            a4h a4hVar = fob.a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(f)) && Float.NaN != f && !rieVar2.a()) || 9205357640488583168L != j || !p75.b(Float.NaN, f2) || !p75.b(Float.NaN, f3) || true != z || true != z2 || !rieVar2.equals(rieVar) || !N.equals(view) || !Intrinsics.c(kx4Var2, kx4Var)) {
                eobVar.l1();
            }
        }
        eobVar.m1();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + dmi.e(fc6.a(Float.NaN, fc6.a(Float.NaN, ljg.c(dmi.e(fc6.a(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}
