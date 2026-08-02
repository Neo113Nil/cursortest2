package k2;

import j2.C7241a;
import j2.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class i extends d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70354a;

        static {
            int[] iArr = new int[f.a.values().length];
            f70354a = iArr;
            try {
                iArr[f.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70354a[f.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70354a[f.a.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // j2.d, j2.C7241a, j2.e
    public final void apply() {
        j2.f fVar;
        ArrayList<Object> arrayList = this.f68890m0;
        Iterator<Object> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = this.f68888k0;
            if (!hasNext) {
                break;
            } else {
                fVar.c(it.next()).k();
            }
        }
        Iterator<Object> it2 = arrayList.iterator();
        C7241a c7241a = null;
        C7241a c7241a2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            C7241a c11 = fVar.c(next);
            if (c7241a2 == null) {
                Object obj = this.f68815N;
                if (obj != null) {
                    c11.D(obj);
                    c11.s(this.f68849l).u(this.f68855r);
                } else {
                    Object obj2 = this.f68816O;
                    if (obj2 != null) {
                        c11.C(obj2);
                        c11.s(this.f68849l).u(this.f68855r);
                    } else {
                        Object obj3 = this.f68811J;
                        if (obj3 != null) {
                            c11.D(obj3);
                            c11.s(this.f68846j).u(this.f68853p);
                        } else {
                            Object obj4 = this.f68812K;
                            if (obj4 != null) {
                                c11.C(obj4);
                                c11.s(this.f68846j).u(this.f68853p);
                            } else {
                                String obj5 = c11.getKey().toString();
                                c11.D(0);
                                c11.t(Float.valueOf(Q(obj5))).v(Float.valueOf(P(obj5)));
                            }
                        }
                    }
                }
                c7241a2 = c11;
            }
            if (c7241a != null) {
                String obj6 = c7241a.getKey().toString();
                String obj7 = c11.getKey().toString();
                c7241a.n(c11.getKey());
                c7241a.t(Float.valueOf(O(obj6))).v(Float.valueOf(N(obj6)));
                c11.C(c7241a.getKey());
                c11.t(Float.valueOf(Q(obj7))).v(Float.valueOf(P(obj7)));
            }
            String obj8 = next.toString();
            HashMap<String, Float> hashMap = this.f70301o0;
            float floatValue = hashMap.containsKey(obj8) ? hashMap.get(obj8).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                c11.x(floatValue);
            }
            c7241a = c11;
        }
        if (c7241a != null) {
            Object obj9 = this.f68817P;
            if (obj9 != null) {
                c7241a.n(obj9);
                c7241a.s(this.f68850m).u(this.f68856s);
            } else {
                Object obj10 = this.f68818Q;
                if (obj10 != null) {
                    c7241a.m(obj10);
                    c7241a.s(this.f68850m).u(this.f68856s);
                } else {
                    Object obj11 = this.f68813L;
                    if (obj11 != null) {
                        c7241a.n(obj11);
                        c7241a.s(this.f68848k).u(this.f68854q);
                    } else {
                        Object obj12 = this.f68814M;
                        if (obj12 != null) {
                            c7241a.m(obj12);
                            c7241a.s(this.f68848k).u(this.f68854q);
                        } else {
                            String obj13 = c7241a.getKey().toString();
                            c7241a.m(0);
                            c7241a.t(Float.valueOf(O(obj13))).v(Float.valueOf(N(obj13)));
                        }
                    }
                }
            }
        }
        if (c7241a2 == null) {
            return;
        }
        float f7 = this.f70300n0;
        if (f7 != 0.5f) {
            c7241a2.r(f7);
        }
        int i11 = a.f70354a[this.f70306t0.ordinal()];
        if (i11 == 1) {
            c7241a2.w(0);
        } else if (i11 == 2) {
            c7241a2.w(1);
        } else {
            if (i11 != 3) {
                return;
            }
            c7241a2.w(2);
        }
    }
}
