package l1;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.X, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7805X {

    /* renamed from: a, reason: collision with root package name */
    private static Method f72244a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f72245b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f72246c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(@NotNull Canvas canvas, boolean z11) {
        Method method;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            C7806Y.f72247a.a(canvas, z11);
            return;
        }
        if (!f72246c) {
            try {
                if (i11 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f72244a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f72245b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f72244a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f72245b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f72244a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f72245b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f72246c = true;
        }
        if (z11) {
            try {
                Method method4 = f72244a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z11 || (method = f72245b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }
}
