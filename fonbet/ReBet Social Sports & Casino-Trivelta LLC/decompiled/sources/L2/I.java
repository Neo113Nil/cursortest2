package L2;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f6775a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f6776b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f6777c;
    private float[] mMatrixValues;

    public static class a {
        public static float a(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        public static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    public float b(View view) {
        if (f6775a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f6775a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public void e(View view, float f10) {
        if (f6775a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f6775a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void f(View view, int i10) {
        if (!f6777c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f6776b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f6777c = true;
        }
        Field field = f6776b;
        if (field != null) {
            try {
                f6776b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);

    public void a(View view) {
    }

    public void c(View view) {
    }
}
