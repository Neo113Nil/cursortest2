package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rye extends lij {
    public final int b;
    public final xfh c;
    public final int d;
    public final int e;
    public final int[] f;
    public final int[] g;
    public final lij[] h;
    public final Object[] i;
    public final HashMap j;

    public rye(ArrayList arrayList, xfh xfhVar) {
        this.c = xfhVar;
        this.b = xfhVar.b.length;
        int size = arrayList.size();
        this.f = new int[size];
        this.g = new int[size];
        this.h = new lij[size];
        this.i = new Object[size];
        this.j = new HashMap();
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            fdc fdcVar = (fdc) it.next();
            this.h[i3] = fdcVar.b();
            this.g[i3] = i;
            this.f[i3] = i2;
            i += this.h[i3].o();
            i2 += this.h[i3].h();
            this.i[i3] = fdcVar.a();
            this.j.put(this.i[i3], Integer.valueOf(i3));
            i3++;
        }
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.lij
    public final int a(boolean z) {
        if (this.b != 0) {
            int i = 0;
            if (z) {
                int[] iArr = this.c.b;
                i = iArr.length > 0 ? iArr[0] : -1;
            }
            do {
                lij[] lijVarArr = this.h;
                if (!lijVarArr[i].p()) {
                    return lijVarArr[i].a(z) + this.g[i];
                }
                i = q(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.lij
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

    @Override // defpackage.lij
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
                lij[] lijVarArr = this.h;
                if (!lijVarArr[i].p()) {
                    return lijVarArr[i].c(z) + this.g[i];
                }
                i = r(i, z);
            } while (i != -1);
        }
        return -1;
    }

    @Override // defpackage.lij
    public final int e(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int d = lik.d(iArr, i + 1, false, false);
        int i3 = iArr[d];
        lij[] lijVarArr = this.h;
        int e = lijVarArr[d].e(i - i3, i2 != 2 ? i2 : 0, z);
        if (e != -1) {
            return i3 + e;
        }
        int q = q(d, z);
        while (q != -1 && lijVarArr[q].p()) {
            q = q(q, z);
        }
        if (q != -1) {
            return lijVarArr[q].a(z) + iArr[q];
        }
        if (i2 == 2) {
            return a(z);
        }
        return -1;
    }

    @Override // defpackage.lij
    public final hij f(int i, hij hijVar, boolean z) {
        int[] iArr = this.f;
        int d = lik.d(iArr, i + 1, false, false);
        int i2 = this.g[d];
        this.h[d].f(i - iArr[d], hijVar, z);
        hijVar.c += i2;
        if (z) {
            Object obj = this.i[d];
            Object obj2 = hijVar.b;
            obj2.getClass();
            hijVar.b = Pair.create(obj, obj2);
        }
        return hijVar;
    }

    @Override // defpackage.lij
    public final hij g(Object obj, hij hijVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.j.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i = this.g[intValue];
        this.h[intValue].g(obj3, hijVar);
        hijVar.c += i;
        hijVar.b = obj;
        return hijVar;
    }

    @Override // defpackage.lij
    public final int h() {
        return this.e;
    }

    @Override // defpackage.lij
    public final int k(int i, int i2, boolean z) {
        int[] iArr = this.g;
        int d = lik.d(iArr, i + 1, false, false);
        int i3 = iArr[d];
        lij[] lijVarArr = this.h;
        int k = lijVarArr[d].k(i - i3, i2 != 2 ? i2 : 0, z);
        if (k != -1) {
            return i3 + k;
        }
        int r = r(d, z);
        while (r != -1 && lijVarArr[r].p()) {
            r = r(r, z);
        }
        if (r != -1) {
            return lijVarArr[r].c(z) + iArr[r];
        }
        if (i2 == 2) {
            return c(z);
        }
        return -1;
    }

    @Override // defpackage.lij
    public final Object l(int i) {
        int[] iArr = this.f;
        int d = lik.d(iArr, i + 1, false, false);
        return Pair.create(this.i[d], this.h[d].l(i - iArr[d]));
    }

    @Override // defpackage.lij
    public final jij m(int i, jij jijVar, long j) {
        int[] iArr = this.g;
        int d = lik.d(iArr, i + 1, false, false);
        int i2 = iArr[d];
        int i3 = this.f[d];
        this.h[d].m(i - i2, jijVar, j);
        Object obj = this.i[d];
        Object obj2 = jij.p;
        Object obj3 = jijVar.a;
        if (obj2 != obj3) {
            obj = Pair.create(obj, obj3);
        }
        jijVar.a = obj;
        jijVar.m += i3;
        jijVar.n += i3;
        return jijVar;
    }

    @Override // defpackage.lij
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
        xfh xfhVar = this.c;
        int i2 = xfhVar.c[i] + 1;
        int[] iArr = xfhVar.b;
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
        xfh xfhVar = this.c;
        int i2 = xfhVar.c[i] - 1;
        if (i2 >= 0) {
            return xfhVar.b[i2];
        }
        return -1;
    }
}
