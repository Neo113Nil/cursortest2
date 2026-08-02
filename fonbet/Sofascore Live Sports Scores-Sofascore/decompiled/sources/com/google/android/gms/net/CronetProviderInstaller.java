package com.google.android.gms.net;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class CronetProviderInstaller {
    public static final GoogleApiAvailabilityLight a = GoogleApiAvailabilityLight.b;
    public static final Object b = new Object();
    public static DynamiteModule c = null;
    public static String d = "0";

    private CronetProviderInstaller() {
    }

    public static Task a(final Context context) {
        DynamiteModule dynamiteModule;
        Preconditions.j(context, "Context must not be null");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (b) {
            dynamiteModule = c;
        }
        if (dynamiteModule != null) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new Runnable() { // from class: com.google.android.gms.net.zza
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    CronetProviderInstaller.b(context2);
                    taskCompletionSource2.setResult(null);
                } catch (Exception e) {
                    taskCompletionSource2.setException(e);
                }
            }
        }).start();
        return taskCompletionSource.getTask();
    }

    public static void b(Context context) {
        DynamiteModule dynamiteModule;
        Object obj = b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    dynamiteModule = c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dynamiteModule != null) {
            return;
        }
        Preconditions.j(context, "Context must not be null");
        ClassLoader classLoader = CronetProviderInstaller.class.getClassLoader();
        Preconditions.i(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            GoogleApiAvailabilityLight googleApiAvailabilityLight = a;
            googleApiAvailabilityLight.getClass();
            GooglePlayServicesUtilLight.a(context);
            try {
                DynamiteModule c2 = DynamiteModule.c(context, DynamiteModule.b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> loadClass = c2.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() == CronetProviderInstaller.class.getClassLoader()) {
                        throw new GooglePlayServicesNotAvailableException();
                    }
                    Method method = loadClass.getMethod("getApiLevel", null);
                    Method method2 = loadClass.getMethod("getCronetVersion", null);
                    Integer num = (Integer) method.invoke(null, null);
                    Preconditions.i(num);
                    int intValue = num.intValue();
                    String str = (String) method2.invoke(null, null);
                    Preconditions.i(str);
                    d = str;
                    if (apiLevel <= intValue) {
                        c = c2;
                        return;
                    }
                    if (googleApiAvailabilityLight.a(context, 2, "cr") == null) {
                        throw new GooglePlayServicesNotAvailableException();
                    }
                    String str2 = d;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                    sb.append("Google Play Services update is required. The API Level of the client is ");
                    sb.append(apiLevel);
                    sb.append(". The API Level of the implementation is ");
                    sb.append(intValue);
                    sb.append(". The Cronet implementation version is ");
                    sb.append(str2);
                    throw new GooglePlayServicesRepairableException(sb.toString());
                } catch (Exception e) {
                    throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e));
                }
            } catch (DynamiteModule.LoadingException e2) {
                throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            throw ((GooglePlayServicesNotAvailableException) new GooglePlayServicesNotAvailableException().initCause(e3));
        }
    }
}
