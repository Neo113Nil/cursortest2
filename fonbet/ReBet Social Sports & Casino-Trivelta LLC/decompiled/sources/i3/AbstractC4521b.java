package i3;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import i3.C4520a;
import q3.C6111c;
import r3.AbstractC6204d;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4521b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f48057a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f48058b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile String f48059c;

    /* renamed from: i3.b$a */
    public interface a {
        void a();
    }

    public static void a(Activity activity, C6111c c6111c, C4520a.InterfaceC0724a interfaceC0724a) {
        g();
        new C4520a(b()).a(activity, c6111c, interfaceC0724a);
    }

    public static String b() {
        AbstractC6204d.d();
        return f48059c;
    }

    public static synchronized void c(Context context) {
        synchronized (AbstractC4521b.class) {
            d(context, null);
        }
    }

    public static synchronized void d(Context context, a aVar) {
        synchronized (AbstractC4521b.class) {
            if (aVar != null) {
                if (f48058b) {
                    aVar.a();
                    return;
                }
            }
            AbstractC6204d.c(context, "applicationContext");
            AbstractC6204d.a(context);
            f(context);
            f48058b = true;
            f48057a = context;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public static boolean e() {
        return f48058b;
    }

    public static void f(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || f48059c != null) {
                return;
            }
            f48059c = applicationInfo.metaData.getString("co.paystack.android.PublicKey");
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void g() {
        AbstractC6204d.d();
        AbstractC6204d.b();
    }

    public static void h(String str) {
        f48059c = str;
    }
}
