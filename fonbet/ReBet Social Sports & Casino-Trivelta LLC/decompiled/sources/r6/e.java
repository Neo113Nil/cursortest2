package r6;

import T7.C1676p;
import T7.Y;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import g6.C4331C;
import g8.InterfaceC4365a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p6.g;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f64048a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final String f64049b = e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f64050c;

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* renamed from: a, reason: collision with root package name */
        public final String f64053a;

        a(String str) {
            this.f64053a = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f64053a;
        }
    }

    public static final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final CountDownLatch f64054a = new CountDownLatch(1);

        /* renamed from: b, reason: collision with root package name */
        public IBinder f64055b;

        public final IBinder a() {
            this.f64054a.await(5L, TimeUnit.SECONDS);
            return this.f64055b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f64054a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.f64055b = serviceBinder;
            this.f64054a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final boolean b() {
        if (Y7.a.d(e.class)) {
            return false;
        }
        try {
            if (f64050c == null) {
                f64050c = Boolean.valueOf(f64048a.a(C4331C.l()) != null);
            }
            Boolean bool = f64050c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return false;
        }
    }

    public static final c c(String applicationId, List appEvents) {
        if (Y7.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return f64048a.d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return null;
        }
    }

    public static final c e(String applicationId) {
        if (Y7.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return f64048a.d(a.MOBILE_APP_INSTALL, applicationId, CollectionsKt.emptyList());
        } catch (Throwable th2) {
            Y7.a.b(th2, e.class);
            return null;
        }
    }

    public final Intent a(Context context) {
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C1676p.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (C1676p.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return null;
        }
    }

    public final c d(a aVar, String str, List list) {
        c cVar;
        String str2;
        if (Y7.a.d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            g.b();
            Context l10 = C4331C.l();
            Intent a10 = a(l10);
            if (a10 == null) {
                return cVar2;
            }
            b bVar = new b();
            try {
                if (!l10.bindService(a10, bVar, 1)) {
                    return c.SERVICE_ERROR;
                }
                try {
                    try {
                        IBinder a11 = bVar.a();
                        if (a11 != null) {
                            InterfaceC4365a c10 = InterfaceC4365a.AbstractBinderC0685a.c(a11);
                            Bundle a12 = d.a(aVar, str, list);
                            if (a12 != null) {
                                c10.l(a12);
                                Y y10 = Y.f11042a;
                                Y.k0(f64049b, Intrinsics.stringPlus("Successfully sent events to the remote service: ", a12));
                            }
                            cVar2 = c.OPERATION_SUCCESS;
                        }
                        l10.unbindService(bVar);
                        Y y11 = Y.f11042a;
                        Y.k0(f64049b, "Unbound from the remote service");
                        return cVar2;
                    } catch (RemoteException e10) {
                        cVar = c.SERVICE_ERROR;
                        Y y12 = Y.f11042a;
                        str2 = f64049b;
                        Y.j0(str2, e10);
                        l10.unbindService(bVar);
                        Y.k0(str2, "Unbound from the remote service");
                        return cVar;
                    }
                } catch (InterruptedException e11) {
                    cVar = c.SERVICE_ERROR;
                    Y y13 = Y.f11042a;
                    str2 = f64049b;
                    Y.j0(str2, e11);
                    l10.unbindService(bVar);
                    Y.k0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } catch (Throwable th2) {
                l10.unbindService(bVar);
                Y y14 = Y.f11042a;
                Y.k0(f64049b, "Unbound from the remote service");
                throw th2;
            }
        } catch (Throwable th3) {
            Y7.a.b(th3, this);
            return null;
        }
    }
}
