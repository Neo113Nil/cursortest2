package N;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7833a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static float[] a(float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    public static /* synthetic */ float[] b(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return a(fArr);
    }

    public static final long c(float[] fArr, long j10) {
        float c10 = M.d.c(j10);
        float d10 = M.d.d(j10);
        float f10 = 1 / (((fArr[3] * c10) + (fArr[7] * d10)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return M.e.a(((fArr[0] * c10) + (fArr[4] * d10) + fArr[12]) * f10, f10 * ((fArr[1] * c10) + (fArr[5] * d10) + fArr[13]));
    }
}
