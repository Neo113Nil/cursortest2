package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fdn {
    public static final fdn f = new fdn(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public fdn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static fdn a() {
        return new fdn(0, new int[8], new Object[8], true);
    }

    public final void b(b1l b1lVar) {
        r8n r8nVar = (r8n) b1lVar.b;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    r8nVar.e(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    r8nVar.f(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    r8nVar.i(i4, (g8n) obj);
                } else if (i3 == 3) {
                    r8nVar.a(i4, 3);
                    ((fdn) obj).b(b1lVar);
                    r8nVar.a(i4, 4);
                } else {
                    if (i3 != 5) {
                        is8.h(new kan());
                        return;
                    }
                    r8nVar.d(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int r;
        int s;
        int r2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    r2 = r8n.r(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    g8n g8nVar = (g8n) this.c[i3];
                    int r3 = r8n.r(i7);
                    int d = g8nVar.d();
                    i2 = x5n.u(d, d, r3, i2);
                } else if (i6 == 3) {
                    int r4 = r8n.r(i5 << 3);
                    r = r4 + r4;
                    s = ((fdn) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        yhk.q(new kan());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    r2 = r8n.r(i5 << 3) + 4;
                }
                i2 = r2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                r = r8n.r(i8);
                s = r8n.s(longValue);
            }
            i2 = s + r + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            a70.i();
            return;
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fdn)) {
            return false;
        }
        fdn fdnVar = (fdn) obj;
        int i = this.a;
        if (i == fdnVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = fdnVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = fdnVar.c;
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
        int i2 = i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    private fdn() {
        this(0, new int[8], new Object[8], true);
    }
}
