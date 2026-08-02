package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x19 {
    public final float[] a;
    public final int[] b;

    public x19(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(x19 x19Var) {
        int i = 0;
        while (true) {
            int[] iArr = x19Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = x19Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final x19 b(float[] fArr) {
        int s;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int binarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (binarySearch >= 0) {
                s = iArr2[binarySearch];
            } else {
                int i2 = -(binarySearch + 1);
                if (i2 == 0) {
                    s = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    s = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    s = dy0.s((f - f2) / (fArr2[i2] - f2), iArr2[i3], iArr2[i2]);
                }
            }
            iArr[i] = s;
        }
        return new x19(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x19.class != obj.getClass()) {
            return false;
        }
        x19 x19Var = (x19) obj;
        return Arrays.equals(this.a, x19Var.a) && Arrays.equals(this.b, x19Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
