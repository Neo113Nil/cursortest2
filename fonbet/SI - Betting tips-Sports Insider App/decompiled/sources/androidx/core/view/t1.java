package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t1 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f1397e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1398f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f1399g = null;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f1400h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f1401c;

    /* renamed from: d, reason: collision with root package name */
    public g0.d f1402d;

    public t1() {
        this.f1401c = i();
    }

    private static WindowInsets i() {
        if (!f1398f) {
            try {
                f1397e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f1398f = true;
        }
        Field field = f1397e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
            }
        }
        if (!f1400h) {
            try {
                f1399g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
            }
            f1400h = true;
        }
        Constructor constructor = f1399g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
            }
        }
        return null;
    }

    @Override // androidx.core.view.z1
    public k2 b() {
        a();
        k2 h10 = k2.h(null, this.f1401c);
        g0.d[] dVarArr = this.f1420b;
        h2 h2Var = h10.f1349a;
        h2Var.p(dVarArr);
        h2Var.r(this.f1402d);
        return h10;
    }

    @Override // androidx.core.view.z1
    public void e(g0.d dVar) {
        this.f1402d = dVar;
    }

    @Override // androidx.core.view.z1
    public void g(g0.d dVar) {
        WindowInsets windowInsets = this.f1401c;
        if (windowInsets != null) {
            this.f1401c = windowInsets.replaceSystemWindowInsets(dVar.f9676a, dVar.f9677b, dVar.f9678c, dVar.f9679d);
        }
    }

    public t1(k2 k2Var) {
        super(k2Var);
        this.f1401c = k2Var.g();
    }
}
