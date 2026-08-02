package t5;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import b5.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t5.InterfaceC6443a;

/* loaded from: classes2.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f65680a;

    /* renamed from: b, reason: collision with root package name */
    public static ConnectivityManager f65681b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f65682c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f65683d;

    /* renamed from: e, reason: collision with root package name */
    public static final List f65684e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConnectivityManager.NetworkCallback f65685f;

    public static final class a extends ConnectivityManager.NetworkCallback {
        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            c.f65683d = true;
            Iterator it = c.f65684e.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(InterfaceC6443a.C0911a.f65678a);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            c.f65683d = false;
            Iterator it = c.f65684e.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(InterfaceC6443a.b.f65679a);
            }
        }
    }

    static {
        c cVar = new c();
        f65680a = cVar;
        f65684e = new ArrayList();
        f65685f = cVar.e();
    }

    @Override // t5.b
    public synchronized void a(d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f65684e.remove(listener);
    }

    @Override // t5.b
    public synchronized void b(d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        f65684e.add(listener);
    }

    public final ConnectivityManager.NetworkCallback e() {
        return new a();
    }

    public final boolean f() {
        ConnectivityManager connectivityManager = f65681b;
        ConnectivityManager connectivityManager2 = null;
        if (connectivityManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
            connectivityManager = null;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        ConnectivityManager connectivityManager3 = f65681b;
        if (connectivityManager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
        } else {
            connectivityManager2 = connectivityManager3;
        }
        NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(activeNetwork);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public synchronized void g(Application application) {
        try {
            Intrinsics.checkNotNullParameter(application, "application");
            if (f65682c) {
                return;
            }
            f65681b = (ConnectivityManager) application.getSystemService(ConnectivityManager.class);
            f65683d = f();
            ConnectivityManager connectivityManager = f65681b;
            if (connectivityManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
                connectivityManager = null;
            }
            connectivityManager.registerDefaultNetworkCallback(f65685f);
            f65682c = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(Application application) {
        try {
            Intrinsics.checkNotNullParameter(application, "application");
            if (f65682c) {
                ConnectivityManager connectivityManager = f65681b;
                if (connectivityManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("connectivityManager");
                    connectivityManager = null;
                }
                connectivityManager.unregisterNetworkCallback(f65685f);
                f65682c = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // t5.b
    public boolean isNetworkAvailable() {
        if (f65682c) {
            return f65683d;
        }
        throw new IllegalStateException("Network connectivity monitor is not registered.");
    }
}
