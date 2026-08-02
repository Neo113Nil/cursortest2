package K9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.common.AbstractC3175h;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static Boolean f6409a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f6410b;

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f6411c;

    /* renamed from: d, reason: collision with root package name */
    public static Boolean f6412d;

    public static boolean a(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean b() {
        int i10 = AbstractC3175h.f32612a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return e(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !n.d()) {
            return true;
        }
        if (f(context)) {
            return !n.e() || n.h();
        }
        return false;
    }

    public static boolean e(PackageManager packageManager) {
        if (f6409a == null) {
            f6409a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f6409a.booleanValue();
    }

    public static boolean f(Context context) {
        if (f6410b == null) {
            f6410b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f6410b.booleanValue();
    }

    public static boolean g(Context context) {
        if (f6411c == null) {
            f6411c = Boolean.valueOf(n.e() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f6411c.booleanValue();
    }

    public static boolean h(PackageManager packageManager) {
        if (f6412d == null) {
            boolean z10 = false;
            if (n.e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f6412d = Boolean.valueOf(z10);
        }
        return f6412d.booleanValue();
    }
}
