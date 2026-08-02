package com.google.android.gms.dynamic;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class RemoteCreator<T> {
    public final String a;
    public Object b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static class RemoteCreatorException extends Exception {
    }

    public RemoteCreator(String str) {
        this.a = str;
    }

    public abstract Object a(IBinder iBinder);

    public final Object b(Context context) {
        Context context2;
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        Preconditions.i(context);
        AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
        try {
            context2 = context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            context2 = null;
        }
        if (context2 == null) {
            throw new RemoteCreatorException("Could not get remote context.");
        }
        try {
            Object a = a((IBinder) context2.getClassLoader().loadClass(this.a).newInstance());
            this.b = a;
            return a;
        } catch (ClassNotFoundException e) {
            throw new RemoteCreatorException("Could not load creator class.", e);
        } catch (IllegalAccessException e2) {
            throw new RemoteCreatorException("Could not access creator.", e2);
        } catch (InstantiationException e3) {
            throw new RemoteCreatorException("Could not instantiate creator.", e3);
        }
    }
}
