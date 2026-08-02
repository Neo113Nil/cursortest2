package io.seon.androidsdk.service;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class X extends N6 {
    public X() {
        super(3000, 4);
    }

    @Override // io.seon.androidsdk.service.N6
    public final void a(float[] fArr) {
        float[] fArr2 = new float[4];
        System.arraycopy(fArr, 0, fArr2, 0, 3);
        float f10 = 0.0f;
        if (this.f53083d != 0) {
            float[] c10 = c();
            if (c10 == null || fArr.length < 3 || c10.length < 3) {
                f10 = -1.0f;
            } else {
                for (int i10 = 0; i10 < fArr.length; i10++) {
                    float abs = Math.abs(fArr[i10] - c10[i10]);
                    if (abs > f10) {
                        f10 = abs;
                    }
                }
            }
        }
        fArr2[3] = f10;
        super.a(fArr2);
    }

    public final X0 e() {
        int i10 = this.f53083d;
        if (i10 < 2) {
            return new X0(-1, -1, new float[0], i10);
        }
        if (i10 <= 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        float[] fArr = this.f53080a[this.f53081b % this.f53084e];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (true) {
            int i14 = this.f53083d;
            if (i13 >= i14) {
                float[] fArr2 = new float[i14];
                for (int i15 = 0; i15 < this.f53083d; i15++) {
                    fArr2[i15] = this.f53080a[i15][3];
                }
                Arrays.sort(fArr2);
                return new X0(i11, i12, Arrays.copyOfRange(fArr2, Math.max(1, this.f53083d - 10), this.f53083d), this.f53083d);
            }
            if (i13 >= i14) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            float[] fArr3 = this.f53080a[(this.f53081b + i13) % this.f53084e];
            if (!Arrays.equals(fArr, fArr3)) {
                if (fArr3 != null && fArr != null && fArr3.length == fArr.length) {
                    for (int i16 = 0; i16 < fArr3.length; i16++) {
                        if (Math.abs(fArr3[i16] - fArr[i16]) <= 0.1f) {
                        }
                    }
                    i12++;
                }
                i11++;
                break;
            }
            i13++;
            fArr = fArr3;
        }
    }
}
