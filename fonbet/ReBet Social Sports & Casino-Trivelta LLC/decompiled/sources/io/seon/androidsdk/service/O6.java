package io.seon.androidsdk.service;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class O6 extends N6 {
    public O6() {
        super(1000, 1);
    }

    public final Q6 e() {
        int i10 = this.f53083d;
        if (i10 == 0) {
            return new Q6(-1.0f, -1.0f, -1.0f, -1.0f, i10);
        }
        float[][] b10 = b();
        int length = b10.length;
        float[] fArr = new float[length];
        for (int i11 = 0; i11 < b10.length; i11++) {
            fArr[i11] = b10[i11][0];
        }
        Arrays.sort(fArr);
        int i12 = length - 1;
        return new Q6(length % 2 != 0 ? fArr[length / 2] : (fArr[i12 / 2] + fArr[length / 2]) / 2.0f, fArr[i12], fArr[0], fArr[(int) (i12 * 0.95d)], length);
    }
}
