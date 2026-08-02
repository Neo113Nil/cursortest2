package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class hep extends f7n {
    public static final fep r = new fep();
    public static final s9p s = new s9p("closed");
    public final ArrayList o;
    public String p;
    public m9p q;

    public hep() {
        super(r);
        this.o = new ArrayList();
        this.q = q9p.a;
    }

    public final void B0(m9p m9pVar) {
        if (this.p != null) {
            if (!(m9pVar instanceof q9p) || this.k) {
                r9p r9pVar = (r9p) u0();
                r9pVar.a.put(this.p, m9pVar);
            }
            this.p = null;
            return;
        }
        if (this.o.isEmpty()) {
            this.q = m9pVar;
            return;
        }
        m9p u0 = u0();
        if (u0 instanceof j9p) {
            ((j9p) u0).a.add(m9pVar);
        } else {
            zzl.s();
        }
    }

    @Override // defpackage.f7n
    public final void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.o.isEmpty() || this.p != null) {
            a70.r("Did not expect a name");
        } else if (u0() instanceof r9p) {
            this.p = str;
        } else {
            a70.r("Please begin an object before writing a name.");
        }
    }

    @Override // defpackage.f7n
    public final void H(String str) {
        if (str == null) {
            B0(q9p.a);
        } else {
            B0(new s9p(str));
        }
    }

    @Override // defpackage.f7n
    public final void M(boolean z) {
        B0(new s9p(Boolean.valueOf(z)));
    }

    @Override // defpackage.f7n
    public final void T(Boolean bool) {
        if (bool == null) {
            B0(q9p.a);
        } else {
            B0(new s9p(bool));
        }
    }

    @Override // defpackage.f7n
    public final void Z(double d) {
        if (this.h != 1 && (Double.isNaN(d) || Double.isInfinite(d))) {
            zzl.f(String.valueOf(d).length() + 33, "JSON forbids NaN and infinities: ", d);
        } else {
            B0(new s9p(Double.valueOf(d)));
        }
    }

    @Override // defpackage.f7n
    public final void a0(long j) {
        B0(new s9p(Long.valueOf(j)));
    }

    @Override // defpackage.f7n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            arrayList.add(s);
        } else {
            is8.e("Incomplete document");
        }
    }

    @Override // defpackage.f7n
    public final void e0(Number number) {
        if (number == null) {
            B0(q9p.a);
            return;
        }
        if (this.h != 1) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                a70.p("JSON forbids NaN and infinities: ".concat(number.toString()));
                return;
            }
        }
        B0(new s9p(number));
    }

    @Override // defpackage.f7n
    public final void f0() {
        B0(q9p.a);
    }

    @Override // defpackage.f7n
    public final void m() {
        j9p j9pVar = new j9p();
        B0(j9pVar);
        this.o.add(j9pVar);
    }

    @Override // defpackage.f7n
    public final void n() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty() || this.p != null) {
            zzl.s();
        } else if (u0() instanceof j9p) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            zzl.s();
        }
    }

    @Override // defpackage.f7n
    public final void p() {
        r9p r9pVar = new r9p();
        B0(r9pVar);
        this.o.add(r9pVar);
    }

    @Override // defpackage.f7n
    public final void t() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty() || this.p != null) {
            zzl.s();
        } else if (u0() instanceof r9p) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            zzl.s();
        }
    }

    public final m9p u0() {
        return (m9p) this.o.get(r1.size() - 1);
    }

    @Override // defpackage.f7n, java.io.Flushable
    public final void flush() {
    }
}
