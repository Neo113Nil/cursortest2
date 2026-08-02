package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uyc {
    public final x0d a;

    public /* synthetic */ uyc(x0d x0dVar) {
        this.a = x0dVar;
    }

    public static final void a(x0d x0dVar, Object obj, Object obj2) {
        int f = x0dVar.f(obj);
        boolean z = f < 0;
        Object obj3 = z ? null : x0dVar.c[f];
        if (obj3 != null) {
            if (obj3 instanceof l0d) {
                l0d l0dVar = (l0d) obj3;
                l0dVar.a(obj2);
                obj2 = l0dVar;
            } else {
                Object[] objArr = yjd.a;
                l0d l0dVar2 = new l0d(2);
                l0dVar2.a(obj3);
                l0dVar2.a(obj2);
                obj2 = l0dVar2;
            }
        }
        if (!z) {
            x0dVar.c[f] = obj2;
            return;
        }
        int i = ~f;
        x0dVar.b[i] = obj;
        x0dVar.c[i] = obj2;
    }

    public static final Object b(x0d x0dVar, rwc rwcVar) {
        Object g = x0dVar.g(rwcVar);
        if (g == null) {
            return null;
        }
        if (!(g instanceof l0d)) {
            x0dVar.k(rwcVar);
            return g;
        }
        l0d l0dVar = (l0d) g;
        if (l0dVar.h()) {
            ogj.m("List is empty.");
            return null;
        }
        int i = l0dVar.b - 1;
        Object f = l0dVar.f(i);
        l0dVar.k(i);
        f.getClass();
        if (l0dVar.h()) {
            x0dVar.k(rwcVar);
        }
        if (l0dVar.b == 1) {
            x0dVar.m(rwcVar, l0dVar.e());
        }
        return f;
    }

    public static final void c(x0d x0dVar, rwc rwcVar, Function1 function1) {
        Object g = x0dVar.g(rwcVar);
        if (g != null) {
            if (!(g instanceof l0d)) {
                if (((Boolean) function1.invoke(g)).booleanValue()) {
                    x0dVar.k(rwcVar);
                    return;
                }
                return;
            }
            l0d l0dVar = (l0d) g;
            int i = l0dVar.b;
            Object[] objArr = l0dVar.a;
            int i2 = 0;
            IntRange j = llf.j(0, i);
            int i3 = j.a;
            int i4 = j.b;
            if (i3 <= i4) {
                while (true) {
                    objArr[i3 - i2] = objArr[i3];
                    if (((Boolean) function1.invoke(objArr[i3])).booleanValue()) {
                        i2++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            mh0.m(i - i2, i, null, objArr);
            l0dVar.b -= i2;
            if (l0dVar.h()) {
                x0dVar.k(rwcVar);
            }
            if (l0dVar.b == 1) {
                x0dVar.m(rwcVar, l0dVar.e());
            }
        }
    }

    public static final l0d d(x0d x0dVar) {
        if (x0dVar.i()) {
            l0d l0dVar = yjd.b;
            l0dVar.getClass();
            return l0dVar;
        }
        l0d l0dVar2 = new l0d();
        Object[] objArr = x0dVar.c;
        long[] jArr = x0dVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof l0d) {
                                l0dVar2.b((l0d) obj);
                            } else {
                                obj.getClass();
                                l0dVar2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return l0dVar2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uyc) {
            return this.a.equals(((uyc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
