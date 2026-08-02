package p6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import g6.e0;
import g6.v;
import io.sentry.android.core.w0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import s6.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f21520b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f21521c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f21522a = new ConcurrentHashMap();

    public static a b() {
        if (f21521c == null) {
            synchronized (f21520b) {
                try {
                    if (f21521c == null) {
                        f21521c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f21521c;
        v.h(aVar);
        return aVar;
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i5) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i5, null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof e0)) {
            ConcurrentHashMap concurrentHashMap = this.f21522a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i5, Executor executor) {
        boolean z5;
        ComponentName component = intent.getComponent();
        if (component != null) {
            if ((c.a(context).a(0, component.getPackageName()).flags & 2097152) != 0) {
                z5 = true;
                if (!z5) {
                    w0.m("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
                if (serviceConnection instanceof e0) {
                    if (executor == null) {
                        executor = null;
                    }
                    return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i5) : context.bindService(intent, i5, executor, serviceConnection);
                }
                ConcurrentHashMap concurrentHashMap = this.f21522a;
                ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
                if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                    w0.m("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
                }
                if (executor == null) {
                    executor = null;
                }
                try {
                    boolean bindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i5) : context.bindService(intent, i5, executor, serviceConnection);
                    if (bindService) {
                        return bindService;
                    }
                    return false;
                } finally {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                }
            }
        }
        z5 = false;
        if (!z5) {
        }
    }
}
