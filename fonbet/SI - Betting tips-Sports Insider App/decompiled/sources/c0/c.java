package c0;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3237a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f3238b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f3239c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f3240d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f3241e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f3242f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f3243g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(2:2|3)|4|5|6|7|8|9|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method declaredMethod2;
        Class cls3;
        int i5;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f3237a = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        f3238b = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        f3239c = field2;
        Class cls4 = f3237a;
        Class<?> cls5 = Boolean.TYPE;
        if (cls4 != null) {
            try {
                declaredMethod = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls5, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            f3240d = declaredMethod;
            cls2 = f3237a;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls5);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                f3241e = declaredMethod2;
                cls3 = f3237a;
                i5 = Build.VERSION.SDK_INT;
                if ((i5 != 26 || i5 == 27) && cls3 != null) {
                    Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                    declaredMethod3.setAccessible(true);
                    method = declaredMethod3;
                }
                f3242f = method;
            }
            declaredMethod2 = null;
            f3241e = declaredMethod2;
            cls3 = f3237a;
            i5 = Build.VERSION.SDK_INT;
            if (i5 != 26) {
            }
            Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
            declaredMethod32.setAccessible(true);
            method = declaredMethod32;
            f3242f = method;
        }
        declaredMethod = null;
        f3240d = declaredMethod;
        cls2 = f3237a;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        f3241e = declaredMethod2;
        cls3 = f3237a;
        i5 = Build.VERSION.SDK_INT;
        if (i5 != 26) {
        }
        Method declaredMethod322 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
        declaredMethod322.setAccessible(true);
        method = declaredMethod322;
        f3242f = method;
    }
}
