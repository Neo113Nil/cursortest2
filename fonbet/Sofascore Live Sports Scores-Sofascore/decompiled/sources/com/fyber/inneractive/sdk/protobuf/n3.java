package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.is8;
import defpackage.yhk;
import defpackage.zzl;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n3 {
    public static final n3 f = new n3(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public n3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int b;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                b = b0.b(i5) + b0.a(((Long) this.c[i3]).longValue());
            } else if (i6 == 1) {
                ((Long) this.c[i3]).getClass();
                b = b0.b(i5) + 8;
            } else if (i6 == 2) {
                b = b0.a((s) this.c[i3]) + b0.b(i5);
            } else if (i6 == 3) {
                i2 = ((n3) this.c[i3]).a() + (b0.b(i5) * 2) + i2;
            } else {
                if (i6 != 5) {
                    yhk.q(new m1());
                    return 0;
                }
                ((Integer) this.c[i3]).getClass();
                b = b0.b(i5) + 4;
            }
            i2 = b + i2;
        }
        this.d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        int i = this.a;
        if (i == n3Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = n3Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = n3Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public n3() {
        this(0, new int[8], new Object[8], true);
    }

    public final boolean a(int i, w wVar) {
        int t;
        if (!this.e) {
            a70.i();
            return false;
        }
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            a(i, Long.valueOf(wVar.l()));
            return true;
        }
        if (i3 == 1) {
            a(i, Long.valueOf(wVar.i()));
            return true;
        }
        if (i3 == 2) {
            a(i, wVar.e());
            return true;
        }
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 5) {
                    a(i, Integer.valueOf(wVar.h()));
                    return true;
                }
                zzl.o();
            }
            return false;
        }
        n3 n3Var = new n3();
        do {
            t = wVar.t();
            if (t == 0) {
                break;
            }
        } while (n3Var.a(t, wVar));
        wVar.a((i2 << 3) | 4);
        a(i, n3Var);
        return true;
    }

    public final void a(int i, Object obj) {
        if (this.e) {
            int i2 = this.a;
            int[] iArr = this.b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.b = Arrays.copyOf(iArr, i3);
                this.c = Arrays.copyOf(this.c, i3);
            }
            int[] iArr2 = this.b;
            int i4 = this.a;
            iArr2[i4] = i;
            this.c[i4] = obj;
            this.a = i4 + 1;
            return;
        }
        a70.i();
    }

    public final void a(c0 c0Var) {
        if (this.a == 0) {
            return;
        }
        c0Var.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c0Var.a.b(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c0Var.a.a(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c0Var.a.a(i3, (s) obj);
            } else if (i4 == 3) {
                c0Var.a.c(i3, 3);
                ((n3) obj).a(c0Var);
                c0Var.a.c(i3, 4);
            } else if (i4 == 5) {
                c0Var.a.a(i3, ((Integer) obj).intValue());
            } else {
                is8.h(new m1());
                return;
            }
        }
    }

    public static n3 a(n3 n3Var, n3 n3Var2) {
        int i = n3Var.a + n3Var2.a;
        int[] copyOf = Arrays.copyOf(n3Var.b, i);
        System.arraycopy(n3Var2.b, 0, copyOf, n3Var.a, n3Var2.a);
        Object[] copyOf2 = Arrays.copyOf(n3Var.c, i);
        System.arraycopy(n3Var2.c, 0, copyOf2, n3Var.a, n3Var2.a);
        return new n3(i, copyOf, copyOf2, true);
    }
}
