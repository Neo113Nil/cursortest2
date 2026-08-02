package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sye extends mij {
    public static final /* synthetic */ int k = 0;
    public final int b;
    public final yfh c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final mij[] h;
    public final Object[] i;
    public final HashMap j;

    public sye(mij[] mijVarArr, Object[] objArr, yfh yfhVar) {
        this.c = yfhVar;
        this.b = yfhVar.b.length;
        int length = mijVarArr.length;
        this.h = mijVarArr;
        this.f = new int[length];
        this.g = new int[length];
        this.i = objArr;
        this.j = new HashMap();
        int length2 = mijVarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length2) {
            mij mijVar = mijVarArr[i];
            this.h[i4] = mijVar;
            this.g[i4] = i2;
            this.f[i4] = i3;
            i2 += mijVar.o();
            i3 += this.h[i4].h();
            this.j.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.d = i2;
        this.e = i3;
    }

    @Override // defpackage.mij
    public final int a(boolean z) {
        if (this.b != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.c.b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                mij[] mijVarArr = this.h;
                if (!mijVarArr[i].p()) {
                    return mijVarArr[i].a(z) + this.g[i];
                }
                i = q(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.mij
    public final int b(Object obj) {
        int b;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            Integer num = (Integer) this.j.get(obj2);
            int intValue = num == null ? -1 : num.intValue();
            if (intValue != -1 && (b = this.h[intValue].b(obj3)) != -1) {
                return this.f[intValue] + b;
            }
        }
        return -1;
    }

    @Override // defpackage.mij
    public final int c(boolean z) {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            if (z) {
                int[] iArr = this.c.b;
                i = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
            } else {
                i = i2 - 1;
            }
            do {
                mij[] mijVarArr = this.h;
                if (!mijVarArr[i].p()) {
                    return mijVarArr[i].c(z) + this.g[i];
                }
                i = r(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.mij
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int e = nik.e(iArr, i + 1, false, false);
        int i3 = iArr[e];
        mij[] mijVarArr = this.h;
        int e2 = mijVarArr[e].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (e2 != -1) {
            return i3 + e2;
        }
        int q = q(e, z);
        while (q != -1 && mijVarArr[q].p()) {
            q = q(q, z);
        }
        if (q != -1) {
            return mijVarArr[q].a(z) + iArr[q];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.mij
    public final iij f(int i, iij iijVar, boolean z) {
        int[] iArr = this.f;
        int e = nik.e(iArr, i + 1, false, false);
        int i2 = this.g[e];
        this.h[e].f(i - iArr[e], iijVar, z);
        iijVar.c += i2;
        if (z) {
            Object obj = this.i[e];
            Object obj2 = iijVar.b;
            obj2.getClass();
            iijVar.b = Pair.create(obj, obj2);
        }
        return iijVar;
    }

    @Override // defpackage.mij
    public final iij g(Object obj, iij iijVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.g[intValue];
        this.h[intValue].g(obj3, iijVar);
        iijVar.c += i;
        iijVar.b = obj;
        return iijVar;
    }

    @Override // defpackage.mij
    public final int h() {
        return this.e;
    }

    @Override // defpackage.mij
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int e = nik.e(iArr, i + 1, false, false);
        int i3 = iArr[e];
        mij[] mijVarArr = this.h;
        int k2 = mijVarArr[e].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (k2 != -1) {
            return i3 + k2;
        }
        int r = r(e, z);
        while (r != -1 && mijVarArr[r].p()) {
            r = r(r, z);
        }
        if (r != -1) {
            return mijVarArr[r].c(z) + iArr[r];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.mij
    public final Object l(int i) {
        int[] iArr = this.f;
        int e = nik.e(iArr, i + 1, false, false);
        return Pair.create(this.i[e], this.h[e].l(i - iArr[e]));
    }

    @Override // defpackage.mij
    public final kij m(int i, kij kijVar, long j) {
        int[] iArr = this.g;
        int e = nik.e(iArr, i + 1, false, false);
        int i2 = iArr[e];
        int i3 = this.f[e];
        this.h[e].m(i - i2, kijVar, j);
        Object obj = this.i[e];
        Object obj2 = kij.p;
        Object obj3 = kijVar.a;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        kijVar.a = obj;
        kijVar.m += i3;
        kijVar.n += i3;
        return kijVar;
    }

    @Override // defpackage.mij
    public final int o() {
        return this.d;
    }

    public final int q(int i, boolean z) {
        if (!z) {
            if (i < this.b - 1) {
                return i + 1;
            }
            return -1;
        }
        yfh yfhVar = this.c;
        int i2 = yfhVar.c[i] + 1;
        int[] iArr = yfhVar.b;
        if (i2 < iArr.length) {
            return iArr[i2];
        }
        return -1;
    }

    public final int r(int i, boolean z) {
        if (!z) {
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }
        yfh yfhVar = this.c;
        int i2 = yfhVar.c[i] - 1;
        if (i2 >= 0) {
            return yfhVar.b[i2];
        }
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sye(ArrayList arrayList, yfh yfhVar) {
        this(r0, r1, yfhVar);
        mij[] mijVarArr = new mij[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            mijVarArr[i2] = ((gdc) it.next()).b();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((gdc) it2.next()).a();
            i++;
        }
    }
}
