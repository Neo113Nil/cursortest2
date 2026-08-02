package O7;

import H7.k;
import android.graphics.Matrix;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f8346a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final D6.f f8347b;

    static {
        D6.f b10 = D6.f.b(2, 7, 4, 5);
        Intrinsics.checkNotNullExpressionValue(b10, "of(...)");
        f8347b = b10;
    }

    public static final int a(int i10) {
        return Math.max(1, 8 / i10);
    }

    public static final float b(B7.g gVar, int i10, int i11) {
        if (gVar == null) {
            return 1.0f;
        }
        float f10 = i10;
        float f11 = i11;
        float max = Math.max(gVar.f849a / f10, gVar.f850b / f11);
        float f12 = f10 * max;
        float f13 = gVar.f851c;
        if (f12 > f13) {
            max = f13 / f10;
        }
        return f11 * max > f13 ? f13 / f11 : max;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int d(B7.h rotationOptions, k encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int K02 = encodedImage.K0();
        D6.f fVar = f8347b;
        int indexOf = fVar.indexOf(Integer.valueOf(K02));
        if (indexOf < 0) {
            throw new IllegalArgumentException("Only accepts inverted exif orientations");
        }
        E e10 = fVar.get((indexOf + ((!rotationOptions.j() ? rotationOptions.h() : 0) / 90)) % fVar.size());
        Intrinsics.checkNotNullExpressionValue(e10, "get(...)");
        return ((Number) e10).intValue();
    }

    public static final int e(B7.h rotationOptions, k encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!rotationOptions.i()) {
            return 0;
        }
        int c10 = f8346a.c(encodedImage);
        return rotationOptions.j() ? c10 : (c10 + rotationOptions.h()) % 360;
    }

    public static final int f(B7.h rotationOptions, B7.g gVar, k encodedImage, boolean z10) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!z10 || gVar == null) {
            return 8;
        }
        int e10 = e(rotationOptions, encodedImage);
        int d10 = f8347b.contains(Integer.valueOf(encodedImage.K0())) ? d(rotationOptions, encodedImage) : 0;
        boolean z11 = e10 == 90 || e10 == 270 || d10 == 5 || d10 == 7;
        int k10 = k(b(gVar, z11 ? encodedImage.getHeight() : encodedImage.getWidth(), z11 ? encodedImage.getWidth() : encodedImage.getHeight()), gVar.f852d);
        if (k10 > 8) {
            return 8;
        }
        if (k10 < 1) {
            return 1;
        }
        return k10;
    }

    public static final Matrix g(k encodedImage, B7.h rotationOptions) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        if (f8347b.contains(Integer.valueOf(encodedImage.K0()))) {
            return f8346a.h(d(rotationOptions, encodedImage));
        }
        int e10 = e(rotationOptions, encodedImage);
        if (e10 == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(e10);
        return matrix;
    }

    public static final boolean i(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static final boolean j(int i10) {
        return i10 >= 0 && i10 <= 270 && i10 % 90 == 0;
    }

    public static final int k(float f10, float f11) {
        return (int) (f11 + (f10 * 8));
    }

    public final int c(k kVar) {
        int Y02 = kVar.Y0();
        if (Y02 == 90 || Y02 == 180 || Y02 == 270) {
            return kVar.Y0();
        }
        return 0;
    }

    public final Matrix h(int i10) {
        Matrix matrix = new Matrix();
        if (i10 == 2) {
            matrix.setScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
            return matrix;
        }
        if (i10 != 5) {
            return null;
        }
        matrix.setRotate(90.0f);
        matrix.postScale(-1.0f, 1.0f);
        return matrix;
    }
}
