package com.google.android.gms.security;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.common.zzh;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ProviderInstaller {
    public static final GoogleApiAvailabilityLight a = GoogleApiAvailabilityLight.b;
    public static final Object b = new Object();
    public static Method c = null;
    public static boolean d = false;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface ProviderInstallListener {
    }

    public static void a(Context context) {
        Context context2;
        Context context3;
        Preconditions.j(context, "Context must not be null");
        a.getClass();
        GooglePlayServicesUtilLight.a(context);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (b) {
            Context context4 = null;
            if (!d) {
                try {
                    context3 = DynamiteModule.c(context, DynamiteModule.e, "com.google.android.gms.providerinstaller.dynamite").a;
                } catch (DynamiteModule.LoadingException e) {
                    "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage()));
                    context3 = null;
                }
                if (context3 != null) {
                    b(context3, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z = d;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 != null) {
                d = true;
                if (!z) {
                    try {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = context2.getClassLoader();
                        zzi zziVar = new zzi(Context.class, context);
                        Class cls = Long.TYPE;
                        zzj.a(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", zziVar, new zzh(cls, Long.valueOf(uptimeMillis)), new zzh(cls, Long.valueOf(uptimeMillis2)));
                    } catch (Exception e2) {
                        "Failed to report request stats: ".concat(e2.toString());
                    }
                }
                context4 = context2;
            }
            if (context4 == null) {
                throw new GooglePlayServicesNotAvailableException();
            }
            b(context4, "com.google.android.gms.common.security.ProviderInstallerImpl");
        }
    }

    public static void b(Context context, String str) {
        try {
            Method method = c;
            if (method == null) {
                method = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
                c = method;
            }
            method.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(String.valueOf(cause == null ? e.toString() : cause.toString()));
            }
            throw new GooglePlayServicesNotAvailableException();
        }
    }
}
