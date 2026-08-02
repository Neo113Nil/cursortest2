package jg;

import Fm.C3051a;
import jg.AbstractC7423b;
import lg.AbstractC7957b;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public abstract class e<D extends AbstractC7423b> extends AbstractC7957b implements Comparable<e<?>> {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70006a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70006a = iArr;
            try {
                iArr[EnumC8145a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70006a[EnumC8145a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e() {
        super(false);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [jg.b] */
    @Override // java.lang.Comparable
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e<?> eVar) {
        int a11 = lg.c.a(W0(), eVar.W0());
        return (a11 == 0 && (a11 = d1().W0() - eVar.d1().W0()) == 0 && (a11 = c1().compareTo(eVar.c1())) == 0 && (a11 = L0().a().compareTo(eVar.L0().a())) == 0) ? a1().L0().i().compareTo(eVar.a1().L0().i()) : a11;
    }

    public abstract ig.q H0();

    public abstract ig.p L0();

    @Override // lg.AbstractC7957b, mg.d
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public e s(long j11, mg.b bVar) {
        return a1().L0().e(super.s(j11, bVar));
    }

    @Override // Lf.a, mg.e
    public int Q(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return super.Q(hVar);
        }
        int i11 = a.f70006a[((EnumC8145a) hVar).ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? c1().Q(hVar) : H0().i();
        }
        throw new mg.l(C3051a.c("Field too large for an int: ", hVar));
    }

    @Override // mg.d
    public abstract e<D> T0(long j11, mg.k kVar);

    public final long W0() {
        return ((a1().a1() * 86400) + d1().v1()) - H0().i();
    }

    public D a1() {
        return c1().W0();
    }

    public abstract c<D> c1();

    @Override // Lf.a, mg.e
    public <R> R d(mg.j<R> jVar) {
        return (jVar == mg.i.g() || jVar == mg.i.f()) ? (R) L0() : jVar == mg.i.a() ? (R) a1().L0() : jVar == mg.i.e() ? (R) mg.b.NANOS : jVar == mg.i.d() ? (R) H0() : jVar == mg.i.b() ? (R) ig.f.J1(a1().a1()) : jVar == mg.i.c() ? (R) d1() : (R) super.d(jVar);
    }

    public ig.h d1() {
        return c1().a1();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public int hashCode() {
        return (c1().hashCode() ^ H0().hashCode()) ^ Integer.rotateLeft(L0().hashCode(), 3);
    }

    @Override // mg.d
    public abstract e j1(long j11, mg.h hVar);

    @Override // mg.d
    public e<D> k1(mg.f fVar) {
        return a1().L0().e(fVar.R(this));
    }

    public abstract e<D> l1(ig.p pVar);

    public long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i11 = a.f70006a[((EnumC8145a) hVar).ordinal()];
        return i11 != 1 ? i11 != 2 ? c1().m(hVar) : H0().i() : W0();
    }

    @Override // Lf.a, mg.e
    public mg.m p(mg.h hVar) {
        return hVar instanceof EnumC8145a ? (hVar == EnumC8145a.INSTANT_SECONDS || hVar == EnumC8145a.OFFSET_SECONDS) ? ((EnumC8145a) hVar).d() : c1().p(hVar) : hVar.g(this);
    }

    @Override // Lf.a
    public String toString() {
        String str = c1().toString() + H0().toString();
        if (H0() == L0()) {
            return str;
        }
        return str + '[' + L0().toString() + ']';
    }
}
