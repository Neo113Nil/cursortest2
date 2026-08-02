package org.chromium.net.impl;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import org.chromium.net.impl.I;

/* loaded from: classes6.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f78867a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Context f78868b;

    /* renamed from: c, reason: collision with root package name */
    private static Bundle f78869c;

    private static Bundle a(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (f78867a) {
            try {
                if (applicationContext != f78868b) {
                    vf.c.c("CronetManifest#getMetaData fetching info");
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                        serviceInfo = null;
                    }
                    if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                        bundle2 = new Bundle();
                    }
                    f78869c = bundle2;
                    f78868b = applicationContext;
                }
                bundle = f78869c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public static boolean b(Context context, I.d dVar) {
        return a(context).getBoolean("android.net.http.EnableTelemetry", dVar == I.d.CRONET_SOURCE_PLATFORM || dVar == I.d.CRONET_SOURCE_PLAY_SERVICES);
    }

    public static boolean c(Context context) {
        return a(context).getBoolean("android.net.http.ReadHttpFlags", true);
    }

    public static boolean d(Context context) {
        return a(context).getBoolean("android.net.http.UsePerfetto", true);
    }
}
