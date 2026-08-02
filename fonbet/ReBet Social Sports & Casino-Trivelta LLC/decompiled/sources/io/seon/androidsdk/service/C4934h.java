package io.seon.androidsdk.service;

import java.util.Arrays;

/* renamed from: io.seon.androidsdk.service.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4934h extends N6 {
    public C4934h() {
        super(1000, 1);
    }

    @Override // io.seon.androidsdk.service.N6
    public final void a(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        super.a(new float[]{(float) Math.sqrt((f12 * f12) + (f11 * f11) + (f10 * f10))});
    }

    public final C4958k e() {
        int i10 = this.f53083d;
        if (i10 == 0) {
            return new C4958k(-1.0f, -1.0f, -1.0f, -1.0f, i10);
        }
        float[][] b10 = b();
        int i11 = this.f53083d;
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < this.f53083d; i12++) {
            fArr[i12] = b10[i12][0];
        }
        Arrays.sort(fArr);
        int i13 = i11 - 1;
        return new C4958k(i11 % 2 != 0 ? fArr[i11 / 2] : (fArr[i13 / 2] + fArr[i11 / 2]) / 2.0f, fArr[0], fArr[i13], fArr[(int) (i13 * 0.95d)], i11);
    }
}
