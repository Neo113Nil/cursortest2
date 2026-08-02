package oi;

import java.util.Set;

/* loaded from: classes5.dex */
public abstract class q implements o {
    @Override // oi.o
    public Object c(p pVar) {
        return v(pVar).e(t());
    }

    @Override // oi.o
    public boolean d() {
        return false;
    }

    @Override // oi.o
    public int e(p pVar) {
        InterfaceC5902C u10 = s().u(pVar);
        try {
            return u10 == null ? ((Integer) j(pVar)).intValue() : u10.n(t());
        } catch (r unused) {
            return Integer.MIN_VALUE;
        }
    }

    @Override // oi.o
    public boolean f(p pVar) {
        return s().y(pVar);
    }

    public <V> boolean isValid(p pVar, V v10) {
        if (pVar != null) {
            return f(pVar) && v(pVar).isValid(t(), v10);
        }
        throw new NullPointerException("Missing chronological element.");
    }

    @Override // oi.o
    public Object j(p pVar) {
        return v(pVar).p(t());
    }

    @Override // oi.o
    public Object m(p pVar) {
        return v(pVar).i(t());
    }

    @Override // oi.o
    public net.time4j.tz.k r() {
        throw new r("Timezone not available: " + this);
    }

    public abstract x s();

    public q t() {
        x s10 = s();
        Class r10 = s10.r();
        if (r10.isInstance(this)) {
            return (q) r10.cast(this);
        }
        for (p pVar : s10.v()) {
            if (r10 == pVar.getType()) {
                return (q) r10.cast(j(pVar));
            }
        }
        throw new IllegalStateException("Implementation error: Cannot find entity context.");
    }

    public Set u() {
        return s().v();
    }

    public z v(p pVar) {
        return s().w(pVar);
    }

    public q w(p pVar, int i10) {
        InterfaceC5902C u10 = s().u(pVar);
        return u10 != null ? (q) u10.h(t(), i10, pVar.g()) : y(pVar, Integer.valueOf(i10));
    }

    public q x(p pVar, long j10) {
        return y(pVar, Long.valueOf(j10));
    }

    public q y(p pVar, Object obj) {
        return (q) v(pVar).o(t(), obj, pVar.g());
    }

    public q z(v vVar) {
        return (q) vVar.apply(t());
    }

    public boolean isValid(p pVar, int i10) {
        InterfaceC5902C u10 = s().u(pVar);
        if (u10 != null) {
            return u10.isValid(t(), i10);
        }
        return isValid(pVar, (p) Integer.valueOf(i10));
    }

    public boolean isValid(p pVar, long j10) {
        return isValid(pVar, (p) Long.valueOf(j10));
    }
}
