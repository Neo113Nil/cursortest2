package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ng0 implements mg0 {
    public final float a;
    public final boolean b;
    public final og0 c;
    public final float d;

    public ng0(float f, boolean z, og0 og0Var) {
        this.a = f;
        this.b = z;
        this.c = og0Var;
        this.d = f;
    }

    @Override // defpackage.pg0
    public final void b(kx4 kx4Var, int i, int[] iArr, int[] iArr2) {
        j(kx4Var, i, iArr, ema.a, iArr2);
    }

    @Override // defpackage.lg0, defpackage.pg0
    public final float e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng0)) {
            return false;
        }
        ng0 ng0Var = (ng0) obj;
        return p75.b(this.a, ng0Var.a) && this.b == ng0Var.b && Intrinsics.c(this.c, ng0Var.c);
    }

    public final int hashCode() {
        int e = dmi.e(Float.hashCode(this.a) * 31, 31, this.b);
        og0 og0Var = this.c;
        return e + (og0Var == null ? 0 : og0Var.hashCode());
    }

    @Override // defpackage.lg0
    public final void j(kx4 kx4Var, int i, int[] iArr, ema emaVar, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int e0 = kx4Var.e0(this.a);
        boolean z = this.b && emaVar == ema.b;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < length) {
                int max = Math.max(0, i - iArr[i3]);
                iArr2[i5] = max;
                i4 = Math.min(e0, max);
                i = iArr2[i5] - i4;
                i3++;
                i5++;
            }
            i2 = i + i4;
        } else {
            int length2 = iArr.length;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < length2) {
                int i10 = iArr[i6];
                int min = Math.min(i7, i - i10);
                iArr2[i9] = min;
                int min2 = Math.min(e0, (i - min) - i10);
                int i11 = iArr2[i9] + i10 + min2;
                i6++;
                i8 = min2;
                i7 = i11;
                i9++;
            }
            i2 = i - (i7 - i8);
        }
        og0 og0Var = this.c;
        if (og0Var == null || i2 <= 0) {
            return;
        }
        int c = og0Var.c(i2, emaVar);
        if (z) {
            c -= i2;
        }
        if (c != 0) {
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + c;
            }
        }
    }

    public final String toString() {
        return (this.b ? "" : "Absolute") + "Arrangement#spacedAligned(" + ((Object) p75.c(this.a)) + ", " + this.c + ')';
    }
}
