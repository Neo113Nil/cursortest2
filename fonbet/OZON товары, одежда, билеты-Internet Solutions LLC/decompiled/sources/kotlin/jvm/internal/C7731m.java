package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7731m {

    /* renamed from: a, reason: collision with root package name */
    private int f71814a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final float[][] f71815b = new Object[2];

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final float[] f71816c = new float[2];

    public final void a(@NotNull float[] spreadArgument) {
        Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
        int i11 = this.f71814a;
        this.f71814a = i11 + 1;
        this.f71815b[i11] = spreadArgument;
    }

    @NotNull
    public final float[] b() {
        int i11;
        float[][] fArr = this.f71815b;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            float[] fArr2 = fArr[i13];
            if (fArr2 != null) {
                float[] fArr3 = fArr2;
                Intrinsics.checkNotNullParameter(fArr3, "<this>");
                i11 = fArr3.length;
            } else {
                i11 = 1;
            }
            i12 += i11;
            if (i13 == 1) {
                break;
            }
            i13++;
        }
        float[] result = new float[i12];
        float[] values = this.f71816c;
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(result, "result");
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            float[] fArr4 = fArr[i14];
            if (fArr4 != null) {
                if (i15 < i14) {
                    int i17 = i14 - i15;
                    System.arraycopy(values, i15, result, i16, i17);
                    i16 += i17;
                }
                float[] fArr5 = fArr4;
                Intrinsics.checkNotNullParameter(fArr5, "<this>");
                int length = fArr5.length;
                System.arraycopy(fArr4, 0, result, i16, length);
                i16 += length;
                i15 = i14 + 1;
            }
            if (i14 == 1) {
                break;
            }
            i14++;
        }
        if (i15 < 2) {
            System.arraycopy(values, i15, result, i16, 2 - i15);
        }
        return result;
    }
}
