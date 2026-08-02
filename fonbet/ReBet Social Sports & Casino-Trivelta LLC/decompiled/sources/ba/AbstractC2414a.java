package ba;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.C3171d;
import com.google.android.gms.common.C3172e;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;

/* renamed from: ba.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2414a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3171d f25008a = C3171d.h();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f25009b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f25010c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f25011d = false;

    /* renamed from: ba.a$a, reason: collision with other inner class name */
    public interface InterfaceC0433a {
        void a();

        void b(int i10, Intent intent);
    }

    public static void a(Context context) {
        Context context2;
        AbstractC3191o.n(context, "Context must not be null");
        f25008a.n(context, 11925000);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (f25009b) {
            Context context3 = null;
            if (!f25011d) {
                try {
                    context2 = DynamiteModule.e(context, DynamiteModule.f32843f, "com.google.android.gms.providerinstaller.dynamite").b();
                } catch (DynamiteModule.a e10) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    d(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z10 = f25011d;
            Context e11 = AbstractC3175h.e(context);
            if (e11 != null) {
                f25011d = true;
                if (!z10) {
                    try {
                        zzj.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", e11.getClassLoader(), zzi.zzb(Context.class, context), zzh.zza(uptimeMillis), zzh.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e12) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e12.toString()));
                    }
                }
                context3 = e11;
            }
            if (context3 != null) {
                d(context3, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C3172e(8);
            }
        }
    }

    public static void b(Context context, InterfaceC0433a interfaceC0433a) {
        AbstractC3191o.n(context, "Context must not be null");
        AbstractC3191o.n(interfaceC0433a, "Listener must not be null");
        AbstractC3191o.f("Must be called on the UI thread");
        new b(context, interfaceC0433a).execute(new Void[0]);
    }

    public static void d(Context context, Context context2, String str) {
        try {
            if (f25010c == null) {
                f25010c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f25010c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.toString() : cause.toString())));
            }
            throw new C3172e(8);
        }
    }
}
