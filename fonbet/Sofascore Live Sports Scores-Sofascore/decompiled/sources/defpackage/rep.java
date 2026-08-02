package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rep extends map {
    public static final pep c = new pep(1);
    public final h9p a;
    public final int b;

    public /* synthetic */ rep(h9p h9pVar, int i) {
        this.a = h9pVar;
        this.b = i;
    }

    public final Serializable a(e7n e7nVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return e7nVar.f0();
        }
        if (i2 == 6) {
            return this.b + (-1) != 0 ? new ybp(e7nVar.f0()) : Double.valueOf(e7nVar.n0());
        }
        if (i2 == 7) {
            return Boolean.valueOf(e7nVar.g0());
        }
        if (i2 == 8) {
            e7nVar.j0();
            return null;
        }
        a70.r("Unexpected token: ".concat(b0a.T(i)));
        return null;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        Object arrayList;
        Serializable arrayList2;
        int Q0 = e7nVar.Q0();
        int i = Q0 - 1;
        if (i == 0) {
            e7nVar.zza();
            arrayList = new ArrayList();
        } else if (i != 2) {
            arrayList = null;
        } else {
            e7nVar.T();
            arrayList = new gcp();
        }
        if (arrayList == null) {
            return a(e7nVar, Q0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (e7nVar.a0()) {
                String e0 = arrayList instanceof Map ? e7nVar.e0() : null;
                int Q02 = e7nVar.Q0();
                int i2 = Q02 - 1;
                if (i2 == 0) {
                    e7nVar.zza();
                    arrayList2 = new ArrayList();
                } else if (i2 != 2) {
                    arrayList2 = null;
                } else {
                    e7nVar.T();
                    arrayList2 = new gcp();
                }
                Serializable a = arrayList2 == null ? a(e7nVar, Q02) : arrayList2;
                if (arrayList instanceof List) {
                    ((List) arrayList).add(a);
                } else {
                    ((Map) arrayList).put(e0, a);
                }
                if (arrayList2 != null) {
                    arrayDeque.addLast(arrayList);
                    arrayList = a;
                }
            } else {
                if (arrayList instanceof List) {
                    e7nVar.M();
                } else {
                    e7nVar.Z();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        if (obj == null) {
            f7nVar.f0();
            return;
        }
        map b = this.a.b(new z6n(obj.getClass()));
        if (!(b instanceof rep)) {
            b.write(f7nVar, obj);
        } else {
            f7nVar.p();
            f7nVar.t();
        }
    }
}
