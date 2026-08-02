package c0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    public static String f3268d;

    /* renamed from: g, reason: collision with root package name */
    public static g0 f3271g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3272a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f3273b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3267c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f3269e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f3270f = new Object();

    public h0(Context context) {
        this.f3272a = context;
        this.f3273b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return y.a(this.f3273b);
        }
        Context context = this.f3272a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i5 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i5), packageName)).intValue() == 0;
    }

    public final void b(int i5, Notification notification) {
        NotificationManager notificationManager = this.f3273b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i5, notification);
            return;
        }
        d0 d0Var = new d0(this.f3272a.getPackageName(), i5, notification);
        synchronized (f3270f) {
            try {
                if (f3271g == null) {
                    f3271g = new g0(this.f3272a.getApplicationContext());
                }
                f3271g.f3258b.obtainMessage(0, d0Var).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notificationManager.cancel(null, i5);
    }
}
