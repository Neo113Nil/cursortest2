package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class kb0 {
    public static final n5h a = new n5h(new g35(1));
    public static int b = -100;
    public static fib c = null;
    public static fib d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final gh0 g = new gh0(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static void a() {
        fib fibVar;
        gh0 gh0Var = g;
        gh0Var.getClass();
        zg0 zg0Var = new zg0(gh0Var);
        while (zg0Var.hasNext()) {
            kb0 kb0Var = (kb0) ((WeakReference) zg0Var.next()).get();
            if (kb0Var != null) {
                ub0 ub0Var = (ub0) kb0Var;
                Context context = ub0Var.k;
                int i2 = 1;
                if (e(context) && (fibVar = c) != null && !fibVar.equals(d)) {
                    a.execute(new hb0(context, i2));
                }
                ub0Var.r(true, true);
            }
        }
    }

    public static fib b() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object c2 = c();
            if (c2 != null) {
                return fib.d(jb0.a(c2));
            }
        } else {
            fib fibVar = c;
            if (fibVar != null) {
                return fibVar;
            }
        }
        return fib.b;
    }

    public static Object c() {
        Context context;
        gh0 gh0Var = g;
        gh0Var.getClass();
        zg0 zg0Var = new zg0(gh0Var);
        while (zg0Var.hasNext()) {
            kb0 kb0Var = (kb0) ((WeakReference) zg0Var.next()).get();
            if (kb0Var != null && (context = ((ub0) kb0Var).k) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean e(Context context) {
        if (e == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), ee0.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void h(ub0 ub0Var) {
        synchronized (h) {
            try {
                gh0 gh0Var = g;
                gh0Var.getClass();
                zg0 zg0Var = new zg0(gh0Var);
                while (zg0Var.hasNext()) {
                    kb0 kb0Var = (kb0) ((WeakReference) zg0Var.next()).get();
                    if (kb0Var == ub0Var || kb0Var == null) {
                        zg0Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void n(int i2) {
        if ((i2 == -1 || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) && b != i2) {
            b = i2;
            synchronized (h) {
                try {
                    gh0 gh0Var = g;
                    gh0Var.getClass();
                    zg0 zg0Var = new zg0(gh0Var);
                    while (zg0Var.hasNext()) {
                        kb0 kb0Var = (kb0) ((WeakReference) zg0Var.next()).get();
                        if (kb0Var != null) {
                            ((ub0) kb0Var).r(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void q(Context context) {
        if (e(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f) {
                    return;
                }
                a.execute(new hb0(context, 0));
                return;
            }
            synchronized (i) {
                try {
                    fib fibVar = c;
                    if (fibVar == null) {
                        fib fibVar2 = d;
                        if (fibVar2 == null) {
                            fibVar2 = fib.a(hz8.X(context));
                            d = fibVar2;
                        }
                        if (fibVar2.a.a.isEmpty()) {
                        } else {
                            c = d;
                        }
                    } else if (!fibVar.equals(d)) {
                        fib fibVar3 = c;
                        d = fibVar3;
                        hz8.V(context, fibVar3.c());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i2);

    public abstract void k(int i2);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void o(CharSequence charSequence);
}
