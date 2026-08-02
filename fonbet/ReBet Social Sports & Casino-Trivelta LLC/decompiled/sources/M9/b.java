package M9;

import K9.n;
import android.content.Context;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f7568a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f7569b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f7568a;
            if (context2 != null && (bool = f7569b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f7569b = null;
            if (n.e()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f7569b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f7569b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f7569b = Boolean.FALSE;
                }
            }
            f7568a = applicationContext;
            return f7569b.booleanValue();
        }
    }
}
