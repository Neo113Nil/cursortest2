package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qok extends an2 {
    @Override // defpackage.r99, defpackage.fm3, defpackage.gtf, defpackage.hm6
    public final void apply() {
        zci zciVar;
        ArrayList arrayList = this.m0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            zciVar = this.k0;
            if (!hasNext) {
                break;
            } else {
                zciVar.b(it.next()).h();
            }
        }
        Iterator it2 = arrayList.iterator();
        fm3 fm3Var = null;
        fm3 fm3Var2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            fm3 b = zciVar.b(next);
            if (fm3Var2 == null) {
                Object obj = this.R;
                if (obj != null) {
                    b.p(obj);
                    b.k(this.n).m(this.t);
                } else {
                    Object obj2 = this.S;
                    if (obj2 != null) {
                        b.j0 = 10;
                        b.S = obj2;
                        b.k(this.n).m(this.t);
                    } else {
                        String obj3 = b.a.toString();
                        b.p(0);
                        b.l(Float.valueOf(w(obj3))).n(Float.valueOf(v(obj3)));
                    }
                }
                fm3Var2 = b;
            }
            if (fm3Var != null) {
                String obj4 = fm3Var.a.toString();
                String obj5 = b.a.toString();
                Object obj6 = b.a;
                fm3Var.j0 = 12;
                fm3Var.U = obj6;
                fm3Var.l(Float.valueOf(u(obj4))).n(Float.valueOf(t(obj4)));
                Object obj7 = fm3Var.a;
                b.j0 = 10;
                b.S = obj7;
                b.l(Float.valueOf(w(obj5))).n(Float.valueOf(v(obj5)));
            }
            String obj8 = next.toString();
            HashMap hashMap = this.o0;
            float floatValue = hashMap.containsKey(obj8) ? ((Float) hashMap.get(obj8)).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                b.g = floatValue;
            }
            fm3Var = b;
        }
        if (fm3Var != null) {
            Object obj9 = this.U;
            if (obj9 != null) {
                fm3Var.j0 = 12;
                fm3Var.U = obj9;
                fm3Var.k(this.o).m(this.u);
            } else {
                Object obj10 = this.V;
                if (obj10 != null) {
                    fm3Var.e(obj10);
                    fm3Var.k(this.o).m(this.u);
                } else {
                    String obj11 = fm3Var.a.toString();
                    fm3Var.e(0);
                    fm3Var.l(Float.valueOf(u(obj11))).n(Float.valueOf(t(obj11)));
                }
            }
        }
        if (fm3Var2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            fm3Var2.i = f;
        }
        int ordinal = this.t0.ordinal();
        if (ordinal == 0) {
            fm3Var2.e = 0;
        } else if (ordinal == 1) {
            fm3Var2.e = 1;
        } else {
            if (ordinal != 2) {
                return;
            }
            fm3Var2.e = 2;
        }
    }
}
