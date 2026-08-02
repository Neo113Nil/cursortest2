package P2;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import wi.AbstractC6757a;

/* loaded from: classes.dex */
public abstract class v {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final z f8797a = new z(v.d().getWebkitToCompatConverter());
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final x f8798a = v.a();
    }

    public static x a() {
        try {
            return new y((WebViewProviderFactoryBoundaryInterface) AbstractC6757a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new k();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static z c() {
        return a.f8797a;
    }

    public static x d() {
        return b.f8798a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? f.a() : f().getClass().getClassLoader();
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }
}
