package L2;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final I f6772a;

    /* renamed from: b, reason: collision with root package name */
    public static final Property f6773b;

    /* renamed from: c, reason: collision with root package name */
    public static final Property f6774c;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(F.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            F.e(view, f10.floatValue());
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f6772a = new Q();
        } else {
            f6772a = new P();
        }
        f6773b = new a(Float.class, "translationAlpha");
        f6774c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f6772a.a(view);
    }

    public static float b(View view) {
        return f6772a.b(view);
    }

    public static void c(View view) {
        f6772a.c(view);
    }

    public static void d(View view, int i10, int i11, int i12, int i13) {
        f6772a.d(view, i10, i11, i12, i13);
    }

    public static void e(View view, float f10) {
        f6772a.e(view, f10);
    }

    public static void f(View view, int i10) {
        f6772a.f(view, i10);
    }

    public static void g(View view, Matrix matrix) {
        f6772a.g(view, matrix);
    }

    public static void h(View view, Matrix matrix) {
        f6772a.h(view, matrix);
    }
}
