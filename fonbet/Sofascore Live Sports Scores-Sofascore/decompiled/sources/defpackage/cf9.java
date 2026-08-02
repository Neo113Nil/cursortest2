package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cf9 extends an2 {
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
                zciVar.b(it.next()).g();
            }
        }
        Iterator it2 = arrayList.iterator();
        fm3 fm3Var = null;
        fm3 fm3Var2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            fm3 b = zciVar.b(next);
            if (fm3Var2 == null) {
                Object obj = this.N;
                if (obj != null) {
                    b.o(obj);
                    b.k(this.l).m(this.r);
                } else {
                    Object obj2 = this.O;
                    if (obj2 != null) {
                        b.j0 = 6;
                        b.O = obj2;
                        b.k(this.l).m(this.r);
                    } else {
                        Object obj3 = this.J;
                        if (obj3 != null) {
                            b.o(obj3);
                            b.k(this.j).m(this.p);
                        } else {
                            Object obj4 = this.K;
                            if (obj4 != null) {
                                b.j0 = 6;
                                b.O = obj4;
                                b.k(this.j).m(this.p);
                            } else {
                                String obj5 = b.a.toString();
                                b.o(0);
                                b.l(Float.valueOf(w(obj5))).n(Float.valueOf(v(obj5)));
                            }
                        }
                    }
                }
                fm3Var2 = b;
            }
            if (fm3Var != null) {
                String obj6 = fm3Var.a.toString();
                String obj7 = b.a.toString();
                Object obj8 = b.a;
                fm3Var.j0 = 7;
                fm3Var.P = obj8;
                fm3Var.l(Float.valueOf(u(obj6))).n(Float.valueOf(t(obj6)));
                Object obj9 = fm3Var.a;
                b.j0 = 6;
                b.O = obj9;
                b.l(Float.valueOf(w(obj7))).n(Float.valueOf(v(obj7)));
            }
            String obj10 = next.toString();
            HashMap hashMap = this.o0;
            float floatValue = hashMap.containsKey(obj10) ? ((Float) hashMap.get(obj10)).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                b.f = floatValue;
            }
            fm3Var = b;
        }
        if (fm3Var != null) {
            Object obj11 = this.P;
            if (obj11 != null) {
                fm3Var.j0 = 7;
                fm3Var.P = obj11;
                fm3Var.k(this.m).m(this.s);
            } else {
                Object obj12 = this.Q;
                if (obj12 != null) {
                    fm3Var.i(obj12);
                    fm3Var.k(this.m).m(this.s);
                } else {
                    Object obj13 = this.L;
                    if (obj13 != null) {
                        fm3Var.j0 = 7;
                        fm3Var.P = obj13;
                        fm3Var.k(this.k).m(this.q);
                    } else {
                        Object obj14 = this.M;
                        if (obj14 != null) {
                            fm3Var.i(obj14);
                            fm3Var.k(this.k).m(this.q);
                        } else {
                            String obj15 = fm3Var.a.toString();
                            fm3Var.i(0);
                            fm3Var.l(Float.valueOf(u(obj15))).n(Float.valueOf(t(obj15)));
                        }
                    }
                }
            }
        }
        if (fm3Var2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            fm3Var2.h = f;
        }
        int ordinal = this.t0.ordinal();
        if (ordinal == 0) {
            fm3Var2.d = 0;
        } else if (ordinal == 1) {
            fm3Var2.d = 1;
        } else {
            if (ordinal != 2) {
                return;
            }
            fm3Var2.d = 2;
        }
    }
}
