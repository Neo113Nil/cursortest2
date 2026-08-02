package net.time4j.format.expert;

import java.util.Set;

/* loaded from: classes5.dex */
public abstract class t extends oi.q {
    public abstract Object A();

    public abstract void B(oi.p pVar, int i10);

    public abstract void C(oi.p pVar, Object obj);

    public abstract void D(Object obj);

    @Override // oi.q
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public t w(oi.p pVar, int i10) {
        B(pVar, i10);
        return this;
    }

    @Override // oi.q
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public t y(oi.p pVar, Object obj) {
        C(pVar, obj);
        return this;
    }

    @Override // oi.q, oi.o
    public Object c(oi.p pVar) {
        return pVar.c();
    }

    @Override // oi.q, oi.o
    public final boolean d() {
        return f(B.TIMEZONE_ID) || f(B.TIMEZONE_OFFSET);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        Set<oi.p> u10 = u();
        Set u11 = tVar.u();
        if (u10.size() != u11.size()) {
            return false;
        }
        for (oi.p pVar : u10) {
            if (!u11.contains(pVar) || !j(pVar).equals(tVar.j(pVar))) {
                return false;
            }
        }
        Object A10 = A();
        Object A11 = tVar.A();
        return A10 == null ? A11 == null : A10.equals(A11);
    }

    public final int hashCode() {
        int hashCode = u().hashCode();
        Object A10 = A();
        return A10 != null ? hashCode + (A10.hashCode() * 31) : hashCode;
    }

    @Override // oi.q
    public <V> boolean isValid(oi.p pVar, V v10) {
        if (pVar != null) {
            return true;
        }
        throw new NullPointerException("Missing chronological element.");
    }

    @Override // oi.q, oi.o
    public Object m(oi.p pVar) {
        return pVar.d0();
    }

    @Override // oi.q, oi.o
    public final net.time4j.tz.k r() {
        Object j10;
        B b10 = B.TIMEZONE_ID;
        if (f(b10)) {
            j10 = j(b10);
        } else {
            B b11 = B.TIMEZONE_OFFSET;
            j10 = f(b11) ? j(b11) : null;
        }
        return j10 instanceof net.time4j.tz.k ? (net.time4j.tz.k) net.time4j.tz.k.class.cast(j10) : super.r();
    }

    @Override // oi.q
    public final oi.x s() {
        throw new UnsupportedOperationException("Parsed values do not have any chronology.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append('{');
        boolean z10 = true;
        for (oi.p pVar : u()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(pVar.name());
            sb2.append('=');
            sb2.append(j(pVar));
        }
        sb2.append('}');
        Object A10 = A();
        if (A10 != null) {
            sb2.append(">>>result=");
            sb2.append(A10);
        }
        return sb2.toString();
    }
}
