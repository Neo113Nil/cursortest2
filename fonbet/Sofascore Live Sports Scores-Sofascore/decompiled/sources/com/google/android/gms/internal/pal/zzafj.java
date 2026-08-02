package com.google.android.gms.internal.pal;

import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.a70;
import defpackage.e3c;
import defpackage.h8n;
import defpackage.is8;
import defpackage.x5n;
import defpackage.yhk;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafj {
    public static final zzafj f = new zzafj(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public zzafj(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static zzafj b() {
        return new zzafj(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int a;
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
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    i2 = x5n.t(i5 << 3, 8, i2);
                } else if (i6 == 2) {
                    zzaby zzabyVar = (zzaby) this.c[i3];
                    int a2 = zzach.a(i5 << 3);
                    int m = zzabyVar.m();
                    i2 = x5n.d(m, m, a2, i2);
                } else if (i6 == 3) {
                    int f2 = zzach.f(i5);
                    a = f2 + f2;
                    b = ((zzafj) this.c[i3]).a();
                } else {
                    if (i6 != 5) {
                        yhk.q(zzadi.d());
                        return 0;
                    }
                    ((Integer) this.c[i3]).getClass();
                    i2 = x5n.t(i5 << 3, 4, i2);
                }
            } else {
                long longValue = ((Long) this.c[i3]).longValue();
                a = zzach.a(i5 << 3);
                b = zzach.b(longValue);
            }
            i2 = b + a + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            a70.i();
            return;
        }
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
    }

    public final void d(e3c e3cVar) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ((h8n) e3cVar.b).u(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ((h8n) e3cVar.b).m(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    e3cVar.r(i3, (zzaby) obj);
                } else if (i4 == 3) {
                    ((h8n) e3cVar.b).r(i3, 3);
                    ((zzafj) obj).d(e3cVar);
                    ((h8n) e3cVar.b).r(i3, 4);
                } else {
                    if (i4 != 5) {
                        is8.h(zzadi.d());
                        return;
                    }
                    ((h8n) e3cVar.b).k(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzafj)) {
            return false;
        }
        zzafj zzafjVar = (zzafj) obj;
        int i = this.a;
        if (i == zzafjVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = zzafjVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = zzafjVar.c;
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

    private zzafj() {
        this(0, new int[8], new Object[8], true);
    }
}
