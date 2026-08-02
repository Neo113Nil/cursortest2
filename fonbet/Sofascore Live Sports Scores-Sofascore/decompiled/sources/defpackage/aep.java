package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class aep extends map {
    public static final aep a = new aep();

    private aep() {
    }

    public static void a(f7n f7nVar, m9p m9pVar) {
        if (m9pVar == null || (m9pVar instanceof q9p)) {
            f7nVar.f0();
            return;
        }
        boolean z = m9pVar instanceof s9p;
        if (z) {
            if (!z) {
                a70.r("Not a JSON Primitive: ".concat(m9pVar.toString()));
                return;
            }
            s9p s9pVar = (s9p) m9pVar;
            Serializable serializable = s9pVar.a;
            if (serializable instanceof Number) {
                f7nVar.e0(s9pVar.c());
                return;
            } else if (serializable instanceof Boolean) {
                f7nVar.M(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(s9pVar.d()));
                return;
            } else {
                f7nVar.H(s9pVar.d());
                return;
            }
        }
        boolean z2 = m9pVar instanceof j9p;
        if (z2) {
            f7nVar.m();
            if (!z2) {
                a70.r("Not a JSON Array: ".concat(m9pVar.toString()));
                return;
            }
            Iterator it = ((j9p) m9pVar).a.iterator();
            while (it.hasNext()) {
                a(f7nVar, (m9p) it.next());
            }
            f7nVar.n();
            return;
        }
        boolean z3 = m9pVar instanceof r9p;
        if (!z3) {
            a70.p("Couldn't write ".concat(String.valueOf(m9pVar.getClass())));
            return;
        }
        f7nVar.p();
        if (!z3) {
            a70.r("Not a JSON Object: ".concat(m9pVar.toString()));
            return;
        }
        Iterator it2 = ((ccp) ((r9p) m9pVar).a.entrySet()).iterator();
        while (((lbb) it2).hasNext()) {
            mbb d = ((bcp) it2).d();
            f7nVar.C((String) d.getKey());
            a(f7nVar, (m9p) d.getValue());
        }
        f7nVar.t();
    }

    public static final m9p b(e7n e7nVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return new s9p(e7nVar.f0());
        }
        if (i2 == 6) {
            return new s9p(new ybp(e7nVar.f0()));
        }
        if (i2 == 7) {
            return new s9p(Boolean.valueOf(e7nVar.g0()));
        }
        if (i2 == 8) {
            e7nVar.j0();
            return q9p.a;
        }
        a70.r("Unexpected token: ".concat(b0a.T(i)));
        return null;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        m9p j9pVar;
        m9p j9pVar2;
        if (e7nVar instanceof dep) {
            dep depVar = (dep) e7nVar;
            int Q0 = depVar.Q0();
            if (Q0 == 5 || Q0 == 2 || Q0 == 4 || Q0 == 10) {
                String T = b0a.T(Q0);
                a70.r(wt3.m("Unexpected ", T, new StringBuilder(T.length() + 39), " when reading a JsonElement."));
                return null;
            }
            m9p m9pVar = (m9p) depVar.g1();
            depVar.E0();
            return m9pVar;
        }
        int Q02 = e7nVar.Q0();
        int i = Q02 - 1;
        if (i == 0) {
            e7nVar.zza();
            j9pVar = new j9p();
        } else if (i != 2) {
            j9pVar = null;
        } else {
            e7nVar.T();
            j9pVar = new r9p();
        }
        if (j9pVar == null) {
            return b(e7nVar, Q02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (e7nVar.a0()) {
                String e0 = j9pVar instanceof r9p ? e7nVar.e0() : null;
                int Q03 = e7nVar.Q0();
                int i2 = Q03 - 1;
                if (i2 == 0) {
                    e7nVar.zza();
                    j9pVar2 = new j9p();
                } else if (i2 != 2) {
                    j9pVar2 = null;
                } else {
                    e7nVar.T();
                    j9pVar2 = new r9p();
                }
                m9p b = j9pVar2 == null ? b(e7nVar, Q03) : j9pVar2;
                if (j9pVar instanceof j9p) {
                    ((j9p) j9pVar).a.add(b);
                } else {
                    ((r9p) j9pVar).a.put(e0, b);
                }
                if (j9pVar2 != null) {
                    arrayDeque.addLast(j9pVar);
                    j9pVar = b;
                }
            } else {
                if (j9pVar instanceof j9p) {
                    e7nVar.M();
                } else {
                    e7nVar.Z();
                }
                if (arrayDeque.isEmpty()) {
                    return j9pVar;
                }
                j9pVar = (m9p) arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.map
    public final /* bridge */ /* synthetic */ void write(f7n f7nVar, Object obj) {
        a(f7nVar, (m9p) obj);
    }
}
