package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l3h implements b4h, Iterable, eia {
    public final x0d a;
    public gub b;
    public boolean c;
    public boolean d;

    public l3h() {
        long[] jArr = qrg.a;
        this.a = new x0d();
    }

    @Override // defpackage.b4h
    public final void a(a4h a4hVar, Object obj) {
        boolean z = obj instanceof m9;
        x0d x0dVar = this.a;
        if (z && x0dVar.c(a4hVar)) {
            Object g = x0dVar.g(a4hVar);
            g.getClass();
            m9 m9Var = (m9) g;
            m9 m9Var2 = (m9) obj;
            String str = m9Var2.a;
            if (str == null) {
                str = m9Var.a;
            }
            dt8 dt8Var = m9Var2.b;
            if (dt8Var == null) {
                dt8Var = m9Var.b;
            }
            x0dVar.m(a4hVar, new m9(str, dt8Var));
        } else {
            x0dVar.m(a4hVar, obj);
        }
        a4hVar.getClass();
    }

    public final l3h c() {
        l3h l3hVar = new l3h();
        l3hVar.c = this.c;
        l3hVar.d = this.d;
        x0d x0dVar = this.a;
        Object[] objArr = x0dVar.b;
        Object[] objArr2 = x0dVar.c;
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
                            int i4 = (i << 3) + i3;
                            l3hVar.a.m(objArr[i4], objArr2[i4]);
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
        return l3hVar;
    }

    public final Object d(a4h a4hVar) {
        Object g = this.a.g(a4hVar);
        if (g != null) {
            return g;
        }
        ilg.f(a4hVar, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void e(l3h l3hVar) {
        x0d x0dVar = l3hVar.a;
        Object[] objArr = x0dVar.b;
        Object[] objArr2 = x0dVar.c;
        long[] jArr = x0dVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        a4h a4hVar = (a4h) obj;
                        x0d x0dVar2 = this.a;
                        Object g = x0dVar2.g(a4hVar);
                        a4hVar.getClass();
                        Object invoke = a4hVar.b.invoke(g, obj2);
                        if (invoke != null) {
                            x0dVar2.m(a4hVar, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3h)) {
            return false;
        }
        l3h l3hVar = (l3h) obj;
        return this.a.equals(l3hVar.a) && this.c == l3hVar.c && this.d == l3hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.e(this.a.hashCode() * 31, 31, this.c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        gub gubVar = this.b;
        if (gubVar == null) {
            gubVar = new gub(this.a);
            this.b = gubVar;
        }
        return ((cp5) gubVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        x0d x0dVar = this.a;
        Object[] objArr = x0dVar.b;
        Object[] objArr2 = x0dVar.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((a4h) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return rha.C(this) + "{ " + ((Object) sb) + " }";
    }
}
