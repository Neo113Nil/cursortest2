package n2;

import Hj.C3143a;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    p f76332a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList<p> f76333b = new ArrayList<>();

    m(p pVar) {
        this.f76332a = null;
        this.f76332a = pVar;
    }

    private static long c(f fVar, long j11) {
        p pVar = fVar.f76319d;
        if (pVar instanceof k) {
            return j11;
        }
        ArrayList arrayList = fVar.f76326k;
        int size = arrayList.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f76319d != pVar) {
                    j12 = Math.min(j12, c(fVar2, fVar2.f76321f + j11));
                }
            }
        }
        if (fVar != pVar.f76351i) {
            return j12;
        }
        long j13 = pVar.j();
        long j14 = j11 - j13;
        return Math.min(Math.min(j12, c(pVar.f76350h, j14)), j14 - r9.f76321f);
    }

    private static long d(f fVar, long j11) {
        p pVar = fVar.f76319d;
        if (pVar instanceof k) {
            return j11;
        }
        ArrayList arrayList = fVar.f76326k;
        int size = arrayList.size();
        long j12 = j11;
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f76319d != pVar) {
                    j12 = Math.max(j12, d(fVar2, fVar2.f76321f + j11));
                }
            }
        }
        if (fVar != pVar.f76350h) {
            return j12;
        }
        long j13 = pVar.j();
        long j14 = j11 + j13;
        return Math.max(Math.max(j12, d(pVar.f76351i, j14)), j14 - r9.f76321f);
    }

    public final void a(p pVar) {
        this.f76333b.add(pVar);
    }

    public final long b(m2.f fVar, int i11) {
        p pVar = this.f76332a;
        if (!(pVar instanceof c) ? i11 != 0 ? (pVar instanceof n) : (pVar instanceof l) : ((c) pVar).f76348f == i11) {
            return 0L;
        }
        f fVar2 = (i11 == 0 ? fVar.f74126d : fVar.f74128e).f76350h;
        f fVar3 = (i11 == 0 ? fVar.f74126d : fVar.f74128e).f76351i;
        boolean contains = pVar.f76350h.f76327l.contains(fVar2);
        boolean contains2 = pVar.f76351i.f76327l.contains(fVar3);
        long j11 = pVar.j();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(d(pVar.f76350h, r13.f76321f), pVar.f76350h.f76321f + j11);
            }
            if (!contains2) {
                return (pVar.j() + pVar.f76350h.f76321f) - pVar.f76351i.f76321f;
            }
            return Math.max(-c(pVar.f76351i, r13.f76321f), (-pVar.f76351i.f76321f) + j11);
        }
        long d11 = d(pVar.f76350h, 0L);
        long c11 = c(pVar.f76351i, 0L);
        long j12 = d11 - j11;
        int i12 = pVar.f76351i.f76321f;
        if (j12 >= (-i12)) {
            j12 += i12;
        }
        long j13 = pVar.f76350h.f76321f;
        long j14 = ((-c11) - j11) - j13;
        if (j14 >= j13) {
            j14 -= j13;
        }
        float p11 = pVar.f76344b.p(i11);
        float f7 = p11 > 0.0f ? (long) ((j12 / (1.0f - p11)) + (j14 / p11)) : 0L;
        return (pVar.f76350h.f76321f + ((((long) ((f7 * p11) + 0.5f)) + j11) + ((long) C3143a.d(1.0f, p11, f7, 0.5f)))) - pVar.f76351i.f76321f;
    }
}
