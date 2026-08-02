package g0;

import android.graphics.Color;
import kotlin.KotlinVersion;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f9674a = new ThreadLocal();

    public static int a(double d10, double d11, double d12) {
        double d13 = (((-0.4986d) * d12) + (((-1.5372d) * d11) + (3.2406d * d10))) / 100.0d;
        double d14 = ((0.0415d * d12) + ((1.8758d * d11) + ((-0.9689d) * d10))) / 100.0d;
        double d15 = ((1.057d * d12) + (((-0.204d) * d11) + (0.0557d * d10))) / 100.0d;
        double pow = d13 > 0.0031308d ? (Math.pow(d13, 0.4166666666666667d) * 1.055d) - 0.055d : d13 * 12.92d;
        double pow2 = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double pow3 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, KotlinVersion.MAX_COMPONENT_VALUE);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, KotlinVersion.MAX_COMPONENT_VALUE);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, KotlinVersion.MAX_COMPONENT_VALUE) : 0);
    }

    public static int b(int i5, int i10, float f6) {
        float f10 = 1.0f - f6;
        return Color.argb((int) ((Color.alpha(i10) * f6) + (Color.alpha(i5) * f10)), (int) ((Color.red(i10) * f6) + (Color.red(i5) * f10)), (int) ((Color.green(i10) * f6) + (Color.green(i5) * f10)), (int) ((Color.blue(i10) * f6) + (Color.blue(i5) * f10)));
    }

    public static int c(int i5, int i10) {
        int alpha = Color.alpha(i10);
        int alpha2 = Color.alpha(i5);
        int i11 = 255 - (((255 - alpha2) * (255 - alpha)) / KotlinVersion.MAX_COMPONENT_VALUE);
        return Color.argb(i11, d(Color.red(i5), alpha2, Color.red(i10), alpha, i11), d(Color.green(i5), alpha2, Color.green(i10), alpha, i11), d(Color.blue(i5), alpha2, Color.blue(i10), alpha, i11));
    }

    public static int d(int i5, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            return 0;
        }
        return (((255 - i10) * (i11 * i12)) + ((i5 * KotlinVersion.MAX_COMPONENT_VALUE) * i10)) / (i13 * KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static int e(int i5, int i10) {
        if (i10 < 0 || i10 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i5 & 16777215) | (i10 << 24);
    }
}
