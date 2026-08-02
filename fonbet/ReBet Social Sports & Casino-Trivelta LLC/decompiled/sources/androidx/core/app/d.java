package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18836a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f18837b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f18838c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f18839d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f18840e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f18841f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f18842g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0358d f18843a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f18844b;

        public a(C0358d c0358d, Object obj) {
            this.f18843a = c0358d;
            this.f18844b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18843a.f18849a = this.f18844b;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f18845a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C0358d f18846b;

        public b(Application application, C0358d c0358d) {
            this.f18845a = application;
            this.f18846b = c0358d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f18845a.unregisterActivityLifecycleCallbacks(this.f18846b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f18847a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f18848b;

        public c(Object obj, Object obj2) {
            this.f18847a = obj;
            this.f18848b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f18839d;
                if (method != null) {
                    method.invoke(this.f18847a, this.f18848b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f18840e.invoke(this.f18847a, this.f18848b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    public static final class C0358d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public Object f18849a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f18850b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18851c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f18852d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f18853e = false;

        /* renamed from: f, reason: collision with root package name */
        public boolean f18854f = false;

        public C0358d(Activity activity) {
            this.f18850b = activity;
            this.f18851c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f18850b == activity) {
                this.f18850b = null;
                this.f18853e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f18853e || this.f18854f || this.f18852d || !d.h(this.f18849a, this.f18851c, activity)) {
                return;
            }
            this.f18854f = true;
            this.f18849a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f18850b == activity) {
                this.f18852d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a10 = a();
        f18836a = a10;
        f18837b = b();
        f18838c = f();
        f18839d = d(a10);
        f18840e = c(a10);
        f18841f = e(a10);
    }

    public static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    public static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f18838c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f18842g.postAtFrontOfQueue(new c(f18837b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f18841f == null) {
            return false;
        }
        if (f18840e == null && f18839d == null) {
            return false;
        }
        try {
            Object obj2 = f18838c.get(activity);
            if (obj2 == null || (obj = f18837b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0358d c0358d = new C0358d(activity);
            application.registerActivityLifecycleCallbacks(c0358d);
            Handler handler = f18842g;
            handler.post(new a(c0358d, obj2));
            try {
                if (g()) {
                    Method method = f18841f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0358d));
                return true;
            } catch (Throwable th2) {
                f18842g.post(new b(application, c0358d));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
