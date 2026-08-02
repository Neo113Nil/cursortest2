package com.google.android.gms.internal.measurement;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.ewm;
import defpackage.is8;
import defpackage.x5n;
import defpackage.yhk;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaga {
    public static final zzaga f = new zzaga(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public zzaga(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static zzaga a() {
        return new zzaga(0, new int[8], new Object[8], true);
    }

    public final void b(ewm ewmVar) {
        zzada zzadaVar = (zzada) ewmVar.b;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzadaVar.j(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzadaVar.k(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzadaVar.n(i4, (zzacr) obj);
                } else if (i3 == 3) {
                    zzadaVar.f(i4, 3);
                    ((zzaga) obj).b(ewmVar);
                    zzadaVar.f(i4, 4);
                } else {
                    if (i3 != 5) {
                        is8.h(new zzaeg());
                        return;
                    }
                    zzadaVar.i(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int b;
        int c;
        int b2;
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
                    b2 = zzada.b(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    zzacr zzacrVar = (zzacr) this.c[i3];
                    int b3 = zzada.b(i7);
                    int d = zzacrVar.d();
                    i2 = x5n.w(d, d, b3, i2);
                } else if (i6 == 3) {
                    int b4 = zzada.b(i5 << 3);
                    b = b4 + b4;
                    c = ((zzaga) this.c[i3]).c();
                } else {
                    if (i6 != 5) {
                        yhk.q(new zzaeg());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    b2 = zzada.b(i5 << 3) + 4;
                }
                i2 = b2 + i2;
            } else {
                int i8 = i5 << 3;
                long longValue = ((Long) this.c[i3]).longValue();
                b = zzada.b(i8);
                c = zzada.c(longValue);
            }
            i2 = c + b + i2;
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
        if (obj == null || !(obj instanceof zzaga)) {
            return false;
        }
        zzaga zzagaVar = (zzaga) obj;
        int i = this.a;
        if (i == zzagaVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = zzagaVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = zzagaVar.c;
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

    private zzaga() {
        this(0, new int[8], new Object[8], true);
    }
}
