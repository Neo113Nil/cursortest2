package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m {

    /* renamed from: h, reason: collision with root package name */
    public static int f17842h;

    /* renamed from: c, reason: collision with root package name */
    public p f17845c;

    /* renamed from: d, reason: collision with root package name */
    public p f17846d;

    /* renamed from: f, reason: collision with root package name */
    public int f17848f;

    /* renamed from: g, reason: collision with root package name */
    public int f17849g;

    /* renamed from: a, reason: collision with root package name */
    public int f17843a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17844b = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f17847e = new ArrayList();

    public m(p pVar, int i10) {
        this.f17845c = null;
        this.f17846d = null;
        int i11 = f17842h;
        this.f17848f = i11;
        f17842h = i11 + 1;
        this.f17845c = pVar;
        this.f17846d = pVar;
        this.f17849g = i10;
    }

    public void a(p pVar) {
        this.f17847e.add(pVar);
        this.f17846d = pVar;
    }

    public long b(androidx.constraintlayout.core.widgets.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f17845c;
        if (pVar instanceof c) {
            if (((c) pVar).f17871f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f17953d : fVar.f17955e).f17873h;
        f fVar3 = (i10 == 0 ? fVar.f17953d : fVar.f17955e).f17874i;
        boolean contains = pVar.f17873h.f17829l.contains(fVar2);
        boolean contains2 = this.f17845c.f17874i.f17829l.contains(fVar3);
        long j11 = this.f17845c.j();
        if (contains && contains2) {
            long d10 = d(this.f17845c.f17873h, 0L);
            long c10 = c(this.f17845c.f17874i, 0L);
            long j12 = d10 - j11;
            p pVar2 = this.f17845c;
            int i12 = pVar2.f17874i.f17823f;
            if (j12 >= (-i12)) {
                j12 += i12;
            }
            int i13 = pVar2.f17873h.f17823f;
            long j13 = ((-c10) - j11) - i13;
            if (j13 >= i13) {
                j13 -= i13;
            }
            float q10 = pVar2.f17867b.q(i10);
            float f10 = q10 > 0.0f ? (long) ((j13 / q10) + (j12 / (1.0f - q10))) : 0L;
            long j14 = ((long) ((f10 * q10) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - q10)) + 0.5f));
            j10 = r12.f17873h.f17823f + j14;
            i11 = this.f17845c.f17874i.f17823f;
        } else {
            if (contains) {
                return Math.max(d(this.f17845c.f17873h, r12.f17823f), this.f17845c.f17873h.f17823f + j11);
            }
            if (contains2) {
                return Math.max(-c(this.f17845c.f17874i, r12.f17823f), (-this.f17845c.f17874i.f17823f) + j11);
            }
            j10 = r12.f17873h.f17823f + this.f17845c.j();
            i11 = this.f17845c.f17874i.f17823f;
        }
        return j10 - i11;
    }

    public final long c(f fVar, long j10) {
        p pVar = fVar.f17821d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f17828k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f17828k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f17821d != pVar) {
                    j11 = Math.min(j11, c(fVar2, fVar2.f17823f + j10));
                }
            }
        }
        if (fVar != pVar.f17874i) {
            return j11;
        }
        long j12 = j10 - pVar.j();
        return Math.min(Math.min(j11, c(pVar.f17873h, j12)), j12 - pVar.f17873h.f17823f);
    }

    public final long d(f fVar, long j10) {
        p pVar = fVar.f17821d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f17828k.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f17828k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f17821d != pVar) {
                    j11 = Math.max(j11, d(fVar2, fVar2.f17823f + j10));
                }
            }
        }
        if (fVar != pVar.f17873h) {
            return j11;
        }
        long j12 = j10 + pVar.j();
        return Math.max(Math.max(j11, d(pVar.f17874i, j12)), j12 - pVar.f17874i.f17823f);
    }
}
