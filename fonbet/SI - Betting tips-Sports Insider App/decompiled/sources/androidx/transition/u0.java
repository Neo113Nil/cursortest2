package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class u0 extends a.a {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2748e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2749f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2750g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2751h = true;

    @Override // a.a
    public void A(View view, int i5) {
        if (Build.VERSION.SDK_INT == 28) {
            super.A(view, i5);
        } else if (f2751h) {
            try {
                t0.a(view, i5);
            } catch (NoSuchMethodError unused) {
                f2751h = false;
            }
        }
    }

    public void H(View view, int i5, int i10, int i11, int i12) {
        if (f2750g) {
            try {
                s0.a(view, i5, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f2750g = false;
            }
        }
    }

    public void I(View view, Matrix matrix) {
        if (f2748e) {
            try {
                r0.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2748e = false;
            }
        }
    }

    public void J(View view, Matrix matrix) {
        if (f2749f) {
            try {
                r0.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2749f = false;
            }
        }
    }
}
