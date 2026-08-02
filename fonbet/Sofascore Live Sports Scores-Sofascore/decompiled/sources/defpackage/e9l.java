package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e9l extends l9l {
    public static Field g = null;
    public static boolean h = false;
    public static Constructor i = null;
    public static boolean j = false;
    public WindowInsets e;
    public u4a f;

    public e9l() {
        this.e = j();
    }

    private static WindowInsets j() {
        if (!h) {
            try {
                g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException unused) {
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException unused2) {
            }
        }
        if (!j) {
            try {
                i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException unused3) {
            }
            j = true;
        }
        Constructor constructor = i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException unused4) {
            }
        }
        return null;
    }

    @Override // defpackage.l9l
    public x9l b() {
        a();
        x9l h2 = x9l.h(null, this.e);
        u4a[] u4aVarArr = this.b;
        u9l u9lVar = h2.a;
        u9lVar.w(u4aVarArr);
        u9lVar.z(this.f);
        u9lVar.v(null);
        u9lVar.B(this.c);
        u9lVar.C(this.d);
        return h2;
    }

    @Override // defpackage.l9l
    public void f(u4a u4aVar) {
        this.f = u4aVar;
    }

    @Override // defpackage.l9l
    public void h(u4a u4aVar) {
        WindowInsets windowInsets = this.e;
        if (windowInsets != null) {
            this.e = windowInsets.replaceSystemWindowInsets(u4aVar.a, u4aVar.b, u4aVar.c, u4aVar.d);
        }
    }

    public e9l(x9l x9lVar) {
        super(x9lVar);
        this.e = x9lVar.g();
    }
}
