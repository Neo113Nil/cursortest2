package L2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class L extends I {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f6778d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f6779e = true;

    public static class a {
        public static void a(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // L2.I
    public void g(View view, Matrix matrix) {
        if (f6778d) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f6778d = false;
            }
        }
    }

    @Override // L2.I
    public void h(View view, Matrix matrix) {
        if (f6779e) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f6779e = false;
            }
        }
    }
}
