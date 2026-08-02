package defpackage;

import com.ironsource.C4427z5;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nkb implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public nkb(int i) {
        if (i == 0) {
            this.b = kik.j;
            this.c = kik.k;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.b = new long[i5];
        this.c = new Object[i5];
    }

    public final void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final boolean b(long j) {
        return d(j) >= 0;
    }

    public final Object c(long j) {
        Object obj;
        int i = kik.i(this.b, this.d, j);
        if (i < 0 || (obj = this.c[i]) == tol.e) {
            return null;
        }
        return obj;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        nkb nkbVar = (nkb) clone;
        nkbVar.b = (long[]) this.b.clone();
        nkbVar.c = (Object[]) this.c.clone();
        return nkbVar;
    }

    public final int d(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != tol.e) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return kik.i(this.b, this.d, j);
    }

    public final boolean e() {
        return i() == 0;
    }

    public final long f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            a70.p(ljg.j(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != tol.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final void g(Object obj, long j) {
        Object obj2 = tol.e;
        int i = kik.i(this.b, this.d, j);
        if (i >= 0) {
            this.c[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == obj2) {
                this.b[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.a = false;
                this.d = i4;
                i2 = ~kik.i(this.b, i4, j);
            }
        }
        int i6 = this.d;
        if (i6 >= this.b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            this.b = Arrays.copyOf(this.b, i10);
            this.c = Arrays.copyOf(this.c, i10);
        }
        int i11 = this.d;
        if (i11 - i2 != 0) {
            long[] jArr2 = this.b;
            int i12 = i2 + 1;
            mh0.h(jArr2, jArr2, i12, i2, i11);
            Object[] objArr3 = this.c;
            mh0.d(i12, i2, this.d, objArr3, objArr3);
        }
        this.b[i2] = j;
        this.c[i2] = obj;
        this.d++;
    }

    public final void h(long j) {
        int i = kik.i(this.b, this.d, j);
        if (i >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[i];
            Object obj2 = tol.e;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.a = true;
            }
        }
    }

    public final int i() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != tol.e) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final Object j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            a70.p(ljg.j(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != tol.e) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(f(i2));
            sb.append(C4427z5.U);
            Object j = j(i2);
            if (j != sb) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ nkb(Object obj) {
        this(10);
    }
}
