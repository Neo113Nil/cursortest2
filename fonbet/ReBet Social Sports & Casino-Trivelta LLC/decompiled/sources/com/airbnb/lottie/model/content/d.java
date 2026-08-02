package com.airbnb.lottie.model.content;

import java.util.Arrays;

/* loaded from: classes.dex */
public class d {
    private final int[] colors;
    private final float[] positions;

    public d(float[] fArr, int[] iArr) {
        this.positions = fArr;
        this.colors = iArr;
    }

    public final void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.colors;
            if (i10 >= iArr.length) {
                return;
            }
            this.positions[i10] = dVar.positions[i10];
            this.colors[i10] = iArr[i10];
            i10++;
        }
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public final int c(float f10) {
        int binarySearch = Arrays.binarySearch(this.positions, f10);
        if (binarySearch >= 0) {
            return this.colors[binarySearch];
        }
        int i10 = -(binarySearch + 1);
        if (i10 == 0) {
            return this.colors[0];
        }
        int[] iArr = this.colors;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.positions;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.airbnb.lottie.utils.e.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public int[] d() {
        return this.colors;
    }

    public float[] e() {
        return this.positions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.positions, dVar.positions) && Arrays.equals(this.colors, dVar.colors)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.colors.length;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.colors.length != dVar2.colors.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.colors.length + " vs " + dVar2.colors.length + ")");
        }
        int i10 = 0;
        while (true) {
            iArr = dVar.colors;
            if (i10 >= iArr.length) {
                break;
            }
            this.positions[i10] = com.airbnb.lottie.utils.l.i(dVar.positions[i10], dVar2.positions[i10], f10);
            this.colors[i10] = com.airbnb.lottie.utils.e.c(f10, dVar.colors[i10], dVar2.colors[i10]);
            i10++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.positions;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.colors;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.colors;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.positions) * 31) + Arrays.hashCode(this.colors);
    }
}
