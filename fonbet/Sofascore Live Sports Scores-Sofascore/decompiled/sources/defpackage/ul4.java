package defpackage;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ul4 {
    public final Class a;
    public final List b;
    public final w1g c;
    public final r0f d;
    public final String e;

    public ul4(Class cls, Class cls2, Class cls3, List list, w1g w1gVar, r0f r0fVar) {
        this.a = cls;
        this.b = list;
        this.c = w1gVar;
        this.d = r0fVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final e1g a(int i, int i2, yz1 yz1Var, ie4 ie4Var, uvd uvdVar) {
        e1g e1gVar;
        bwj bwjVar;
        int i3;
        m1g m1gVar;
        e1g e1gVar2;
        boolean z;
        boolean z2;
        Object qd4Var;
        r0f r0fVar = this.d;
        List list = (List) r0fVar.c();
        w1a.m(list, "Argument must not be null");
        try {
            e1g b = b(ie4Var, i, i2, uvdVar, list);
            r0fVar.b(list);
            tl4 tl4Var = (tl4) yz1Var.c;
            int i4 = yz1Var.b;
            sl4 sl4Var = tl4Var.a;
            Class<?> cls = b.get().getClass();
            if (i4 != 4) {
                bwj e = sl4Var.e(cls);
                bwjVar = e;
                e1gVar = e.a(tl4Var.h, b, tl4Var.l, tl4Var.m);
            } else {
                e1gVar = b;
                bwjVar = null;
            }
            if (!b.equals(e1gVar)) {
                b.c();
            }
            if (sl4Var.c.a().d.b(e1gVar.d()) != null) {
                m1gVar = sl4Var.c.a().d.b(e1gVar.d());
                if (m1gVar == null) {
                    throw new nvf(e1gVar.d());
                }
                i3 = m1gVar.g(tl4Var.o);
            } else {
                i3 = 3;
                m1gVar = null;
            }
            pia piaVar = tl4Var.v;
            ArrayList b2 = sl4Var.b();
            int size = b2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    e1gVar2 = null;
                    z = false;
                    break;
                }
                e1gVar2 = null;
                if (((ntc) b2.get(i5)).a.equals(piaVar)) {
                    z = true;
                    break;
                }
                i5++;
            }
            switch (tl4Var.n.a) {
                default:
                    if (((!z && i4 == 3) || i4 == 1) && i3 == 2) {
                        z2 = true;
                        break;
                    }
                case 0:
                case 1:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (m1gVar == null) {
                    throw new nvf(e1gVar.get().getClass());
                }
                int C = wt3.C(i3);
                if (C == 0) {
                    qd4Var = new qd4(tl4Var.v, tl4Var.i);
                } else {
                    if (C != 1) {
                        a70.p("Unknown strategy: ".concat(i3 != 1 ? i3 != 2 ? i3 != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                        return e1gVar2;
                    }
                    qd4Var = new g1g(sl4Var.c.a, tl4Var.v, tl4Var.i, tl4Var.l, tl4Var.m, bwjVar, cls, tl4Var.o);
                }
                mib mibVar = (mib) mib.e.c();
                mibVar.d = false;
                mibVar.c = true;
                mibVar.b = e1gVar;
                l2a l2aVar = tl4Var.f;
                l2aVar.b = qd4Var;
                l2aVar.c = m1gVar;
                l2aVar.d = mibVar;
                e1gVar = mibVar;
            }
            return this.c.o(e1gVar, uvdVar);
        } catch (Throwable th) {
            r0fVar.b(list);
            throw th;
        }
    }

    public final e1g b(ie4 ie4Var, int i, int i2, uvd uvdVar, List list) {
        List list2 = this.b;
        int size = list2.size();
        e1g e1gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            j1g j1gVar = (j1g) list2.get(i3);
            try {
                if (j1gVar.a(ie4Var.e(), uvdVar)) {
                    e1gVar = j1gVar.b(ie4Var.e(), i, i2, uvdVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(j1gVar);
                }
                list.add(e);
            }
            if (e1gVar != null) {
                break;
            }
        }
        if (e1gVar != null) {
            return e1gVar;
        }
        throw new mz8(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
