package O7;

import H7.k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import u7.C6528b;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8344a = new a();

    public static final float a(B7.h rotationOptions, B7.g gVar, k encodedImage) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!k.b2(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        if (gVar == null || gVar.f850b <= 0 || gVar.f849a <= 0 || encodedImage.getWidth() == 0 || encodedImage.getHeight() == 0) {
            return 1.0f;
        }
        int d10 = f8344a.d(rotationOptions, encodedImage);
        boolean z10 = d10 == 90 || d10 == 270;
        int height = z10 ? encodedImage.getHeight() : encodedImage.getWidth();
        int width = z10 ? encodedImage.getWidth() : encodedImage.getHeight();
        float f10 = gVar.f849a / height;
        float f11 = gVar.f850b / width;
        float coerceAtLeast = RangesKt.coerceAtLeast(f10, f11);
        E6.a.F("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(gVar.f849a), Integer.valueOf(gVar.f850b), Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(coerceAtLeast));
        return coerceAtLeast;
    }

    public static final int b(B7.h rotationOptions, B7.g gVar, k encodedImage, int i10) {
        Intrinsics.checkNotNullParameter(rotationOptions, "rotationOptions");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        if (!k.b2(encodedImage)) {
            return 1;
        }
        float a10 = a(rotationOptions, gVar, encodedImage);
        int f10 = encodedImage.A0() == C6528b.f66196b ? f(a10) : e(a10);
        int max = Math.max(encodedImage.getHeight(), encodedImage.getWidth());
        float f11 = gVar != null ? gVar.f851c : i10;
        while (max / f10 > f11) {
            f10 = encodedImage.A0() == C6528b.f66196b ? f10 * 2 : f10 + 1;
        }
        return f10;
    }

    public static final int c(k encodedImage, int i10, int i11) {
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        int n12 = encodedImage.n1();
        while ((((encodedImage.getWidth() * encodedImage.getHeight()) * i10) / n12) / n12 > i11) {
            n12 *= 2;
        }
        return n12;
    }

    public static final int e(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            double d10 = i10;
            if ((1.0d / d10) + ((1.0d / (Math.pow(d10, 2.0d) - d10)) * 0.33333334f) <= f10) {
                return i10 - 1;
            }
            i10++;
        }
    }

    public static final int f(float f10) {
        if (f10 > 0.6666667f) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            int i11 = i10 * 2;
            double d10 = 1.0d / i11;
            if (d10 + (0.33333334f * d10) <= f10) {
                return i10;
            }
            i10 = i11;
        }
    }

    public final int d(B7.h hVar, k kVar) {
        if (!hVar.j()) {
            return 0;
        }
        int Y02 = kVar.Y0();
        if (Y02 == 0 || Y02 == 90 || Y02 == 180 || Y02 == 270) {
            return Y02;
        }
        throw new IllegalStateException("Check failed.");
    }
}
