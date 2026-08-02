package jg;

import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import jg.AbstractC7423b;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
final class d<D extends AbstractC7423b> extends c<D> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    private final D f70003b;

    /* renamed from: c, reason: collision with root package name */
    private final ig.h f70004c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70005a;

        static {
            int[] iArr = new int[mg.b.values().length];
            f70005a = iArr;
            try {
                iArr[mg.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70005a[mg.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70005a[mg.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70005a[mg.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70005a[mg.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70005a[mg.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70005a[mg.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private d(D d11, ig.h hVar) {
        lg.c.e(hVar, "time");
        this.f70003b = d11;
        this.f70004c = hVar;
    }

    static <R extends AbstractC7423b> d<R> j1(R r11, ig.h hVar) {
        return new d<>(r11, hVar);
    }

    private d<D> m1(D d11, long j11, long j12, long j13, long j14) {
        long j15 = j11 | j12 | j13 | j14;
        ig.h hVar = this.f70004c;
        if (j15 == 0) {
            return q1(d11, hVar);
        }
        long j16 = j12 / 1440;
        long j17 = j11 / 24;
        long j18 = (j12 % 1440) * 60000000000L;
        long j19 = ((j11 % 24) * 3600000000000L) + j18 + ((j13 % 86400) * 1000000000) + (j14 % 86400000000000L);
        long u12 = hVar.u1();
        long j21 = j19 + u12;
        long b11 = lg.c.b(j21, 86400000000000L) + j17 + j16 + (j13 / 86400) + (j14 / 86400000000000L);
        long j22 = ((j21 % 86400000000000L) + 86400000000000L) % 86400000000000L;
        if (j22 != u12) {
            hVar = ig.h.c1(j22);
        }
        return q1(d11.T0(b11, mg.b.DAYS), hVar);
    }

    private d<D> q1(mg.d dVar, ig.h hVar) {
        D d11 = this.f70003b;
        return (d11 == dVar && this.f70004c == hVar) ? this : new d<>(d11.L0().b(dVar), hVar);
    }

    private Object writeReplace() {
        return new t((byte) 12, this);
    }

    @Override // jg.c
    public final e E0(ig.q qVar) {
        return f.m1(qVar, null, this);
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar != null && hVar.a(this);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        return enumC8145a.b() || enumC8145a.j();
    }

    @Override // Lf.a, mg.e
    public final int Q(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).j() ? this.f70004c.Q(hVar) : this.f70003b.Q(hVar) : p(hVar).a(m(hVar), hVar);
    }

    @Override // jg.c
    public final D W0() {
        return this.f70003b;
    }

    @Override // jg.c
    public final ig.h a1() {
        return this.f70004c;
    }

    @Override // jg.c
    /* renamed from: d1 */
    public final c k1(ig.f fVar) {
        return q1(fVar, this.f70004c);
    }

    @Override // jg.c, mg.d
    /* renamed from: j */
    public final mg.d k1(ig.f fVar) {
        return q1(fVar, this.f70004c);
    }

    @Override // jg.c, mg.d
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public final d<D> T0(long j11, mg.k kVar) {
        boolean z11 = kVar instanceof mg.b;
        D d11 = this.f70003b;
        if (!z11) {
            return d11.L0().d(kVar.a(this, j11));
        }
        int i11 = a.f70005a[((mg.b) kVar).ordinal()];
        ig.h hVar = this.f70004c;
        switch (i11) {
            case 1:
                return m1(this.f70003b, 0L, 0L, 0L, j11);
            case 2:
                d<D> q12 = q1(d11.T0(j11 / 86400000000L, mg.b.DAYS), hVar);
                return q12.m1(q12.f70003b, 0L, 0L, 0L, (j11 % 86400000000L) * 1000);
            case 3:
                d<D> q13 = q1(d11.T0(j11 / 86400000, mg.b.DAYS), hVar);
                return q13.m1(q13.f70003b, 0L, 0L, 0L, (j11 % 86400000) * 1000000);
            case 4:
                return l1(j11);
            case 5:
                return m1(this.f70003b, 0L, j11, 0L, 0L);
            case 6:
                return m1(this.f70003b, j11, 0L, 0L, 0L);
            case 7:
                d<D> q14 = q1(d11.T0(j11 / 256, mg.b.DAYS), hVar);
                return q14.m1(q14.f70003b, (j11 % 256) * 12, 0L, 0L, 0L);
            default:
                return q1(d11.T0(j11, kVar), hVar);
        }
    }

    final d<D> l1(long j11) {
        return m1(this.f70003b, 0L, 0L, j11, 0L);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        return hVar instanceof EnumC8145a ? ((EnumC8145a) hVar).j() ? this.f70004c.m(hVar) : this.f70003b.m(hVar) : hVar.f(this);
    }

    @Override // jg.c
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final d j1(long j11, mg.h hVar) {
        boolean z11 = hVar instanceof EnumC8145a;
        D d11 = this.f70003b;
        if (!z11) {
            return d11.L0().d(hVar.e(this, j11));
        }
        boolean j12 = ((EnumC8145a) hVar).j();
        ig.h hVar2 = this.f70004c;
        return j12 ? q1(d11, hVar2.c1(j11, hVar)) : q1(d11.j1(j11, hVar), hVar2);
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar instanceof EnumC8145a) {
            return (((EnumC8145a) hVar).j() ? this.f70004c : this.f70003b).p(hVar);
        }
        return hVar.g(this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f70003b);
        objectOutput.writeObject(this.f70004c);
    }
}
