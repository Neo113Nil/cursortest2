package k2;

import j2.C7241a;
import j2.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class j extends d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70355a;

        static {
            int[] iArr = new int[f.a.values().length];
            f70355a = iArr;
            try {
                iArr[f.a.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70355a[f.a.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70355a[f.a.PACKED.ordinal()] = 3;
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
                fVar.c(it.next()).l();
            }
        }
        Iterator<Object> it2 = arrayList.iterator();
        C7241a c7241a = null;
        C7241a c7241a2 = null;
        while (it2.hasNext()) {
            Object next = it2.next();
            C7241a c11 = fVar.c(next);
            if (c7241a2 == null) {
                Object obj = this.f68819R;
                if (obj != null) {
                    c11.F(obj);
                    c11.s(this.f68851n).u(this.f68857t);
                } else {
                    Object obj2 = this.f68820S;
                    if (obj2 != null) {
                        c11.E(obj2);
                        c11.s(this.f68851n).u(this.f68857t);
                    } else {
                        String obj3 = c11.getKey().toString();
                        c11.F(0);
                        c11.t(Float.valueOf(Q(obj3))).v(Float.valueOf(P(obj3)));
                    }
                }
                c7241a2 = c11;
            }
            if (c7241a != null) {
                String obj4 = c7241a.getKey().toString();
                String obj5 = c11.getKey().toString();
                c7241a.h(c11.getKey());
                c7241a.t(Float.valueOf(O(obj4))).v(Float.valueOf(N(obj4)));
                c11.E(c7241a.getKey());
                c11.t(Float.valueOf(Q(obj5))).v(Float.valueOf(P(obj5)));
            }
            String obj6 = next.toString();
            HashMap<String, Float> hashMap = this.f70301o0;
            float floatValue = hashMap.containsKey(obj6) ? hashMap.get(obj6).floatValue() : -1.0f;
            if (floatValue != -1.0f) {
                c11.A(floatValue);
            }
            c7241a = c11;
        }
        if (c7241a != null) {
            Object obj7 = this.f68822U;
            if (obj7 != null) {
                c7241a.h(obj7);
                c7241a.s(this.f68852o).u(this.f68858u);
            } else {
                Object obj8 = this.f68823V;
                if (obj8 != null) {
                    c7241a.g(obj8);
                    c7241a.s(this.f68852o).u(this.f68858u);
                } else {
                    String obj9 = c7241a.getKey().toString();
                    c7241a.g(0);
                    c7241a.t(Float.valueOf(O(obj9))).v(Float.valueOf(N(obj9)));
                }
            }
        }
        if (c7241a2 == null) {
            return;
        }
        float f7 = this.f70300n0;
        if (f7 != 0.5f) {
            c7241a2.G(f7);
        }
        int i11 = a.f70355a[this.f70306t0.ordinal()];
        if (i11 == 1) {
            c7241a2.z(0);
        } else if (i11 == 2) {
            c7241a2.z(1);
        } else {
            if (i11 != 3) {
                return;
            }
            c7241a2.z(2);
        }
    }
}
