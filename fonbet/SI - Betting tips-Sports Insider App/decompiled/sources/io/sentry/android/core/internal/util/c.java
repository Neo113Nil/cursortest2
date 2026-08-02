package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.e0;
import io.sentry.android.core.h0;
import io.sentry.android.core.m0;
import io.sentry.android.core.n0;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.o0;
import io.sentry.p0;
import io.sentry.r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements p0, e0 {

    /* renamed from: m, reason: collision with root package name */
    public static volatile ConnectivityManager f15697m;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15701a;

    /* renamed from: b, reason: collision with root package name */
    public final b6 f15702b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f15703c;

    /* renamed from: d, reason: collision with root package name */
    public final d f15704d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f15705e;

    /* renamed from: f, reason: collision with root package name */
    public final io.sentry.util.a f15706f;

    /* renamed from: g, reason: collision with root package name */
    public volatile b f15707g;

    /* renamed from: h, reason: collision with root package name */
    public volatile NetworkCapabilities f15708h;

    /* renamed from: i, reason: collision with root package name */
    public volatile Network f15709i;
    public volatile long j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f15710k;

    /* renamed from: l, reason: collision with root package name */
    public static final io.sentry.util.a f15696l = new io.sentry.util.a();

    /* renamed from: n, reason: collision with root package name */
    public static final io.sentry.util.a f15698n = new io.sentry.util.a();

    /* renamed from: o, reason: collision with root package name */
    public static final ArrayList f15699o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f15700p = {1, 0, 3, 2};
    public static final int[] q = new int[2];

    public c(MyApp myApp, n0 n0Var, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.f15711a;
        this.f15706f = new io.sentry.util.a();
        this.j = 0L;
        this.f15710k = new AtomicBoolean(false);
        Context applicationContext = myApp.getApplicationContext();
        this.f15701a = applicationContext != null ? applicationContext : myApp;
        this.f15702b = sentryAndroidOptions;
        this.f15703c = n0Var;
        this.f15704d = dVar;
        this.f15705e = new ArrayList();
        int[] iArr = q;
        iArr[0] = 12;
        iArr[1] = 16;
        J(new a(this, 1));
        h0.f15617e.c(this);
    }

    public static boolean C(Context context, ILogger iLogger, n0 n0Var, b bVar) {
        n0Var.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            iLogger.h(b5.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager z5 = z(context, iLogger);
        if (z5 == null) {
            return false;
        }
        if (!m4.g.o(context)) {
            iLogger.h(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            z5.registerDefaultNetworkCallback(bVar);
            return true;
        } catch (Throwable th2) {
            iLogger.e(b5.WARNING, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    public static boolean c(Context context, ILogger iLogger, n0 n0Var, ConnectivityManager.NetworkCallback networkCallback) {
        n0Var.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            iLogger.h(b5.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!m4.g.o(context)) {
            iLogger.h(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        r a7 = f15698n.a();
        try {
            f15699o.add(networkCallback);
            a7.close();
            return true;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String w(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public static ConnectivityManager z(Context context, ILogger iLogger) {
        if (f15697m != null) {
            return f15697m;
        }
        r a7 = f15696l.a();
        try {
            if (f15697m != null) {
                ConnectivityManager connectivityManager = f15697m;
                a7.close();
                return connectivityManager;
            }
            f15697m = (ConnectivityManager) context.getSystemService("connectivity");
            if (f15697m == null) {
                iLogger.h(b5.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f15697m;
            a7.close();
            return connectivityManager2;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void J(Runnable runnable) {
        b6 b6Var = this.f15702b;
        try {
            b6Var.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            b6Var.getLogger().e(b5.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    public final void K(boolean z5) {
        r a7 = this.f15706f.a();
        if (z5) {
            try {
                this.f15705e.clear();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        b bVar = this.f15707g;
        this.f15707g = null;
        if (bVar != null) {
            Context context = this.f15701a;
            ILogger logger = this.f15702b.getLogger();
            ConnectivityManager z7 = z(context, logger);
            if (z7 != null) {
                try {
                    z7.unregisterNetworkCallback(bVar);
                } catch (Throwable th4) {
                    logger.e(b5.WARNING, "unregisterNetworkCallback failed", th4);
                }
            }
        }
        this.f15708h = null;
        this.f15709i = null;
        this.j = 0L;
        a7.close();
        this.f15702b.getLogger().h(b5.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void N(NetworkCapabilities networkCapabilities) {
        r a7 = this.f15706f.a();
        try {
            if (networkCapabilities != null) {
                this.f15708h = networkCapabilities;
            } else {
                if (!m4.g.o(this.f15701a)) {
                    this.f15702b.getLogger().h(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f15708h = null;
                    this.f15704d.getClass();
                    this.j = SystemClock.uptimeMillis();
                    a7.close();
                    return;
                }
                this.f15703c.getClass();
                ConnectivityManager z5 = z(this.f15701a, this.f15702b.getLogger());
                if (z5 != null) {
                    Network activeNetwork = z5.getActiveNetwork();
                    this.f15708h = activeNetwork != null ? z5.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f15708h = null;
                }
            }
            this.f15704d.getClass();
            this.j = SystemClock.uptimeMillis();
            this.f15702b.getLogger().h(b5.DEBUG, "Cache updated - Status: " + t() + ", Type: " + y(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f15702b.getLogger().e(b5.WARNING, "Failed to update connection status cache", th2);
                this.f15708h = null;
                this.f15704d.getClass();
                this.j = SystemClock.uptimeMillis();
            } catch (Throwable th3) {
                try {
                    a7.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        a7.close();
    }

    @Override // io.sentry.p0
    public final io.sentry.n0 T() {
        this.f15704d.getClass();
        if (SystemClock.uptimeMillis() - this.j >= 120000) {
            N(null);
        }
        return t();
    }

    @Override // io.sentry.p0
    public final boolean X(o0 o0Var) {
        r a7 = this.f15706f.a();
        try {
            this.f15705e.add(o0Var);
            a7.close();
            r();
            return this.f15707g != null;
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        J(new a(this, 0));
    }

    @Override // io.sentry.p0
    public final void e0(o0 o0Var) {
        r a7 = this.f15706f.a();
        try {
            this.f15705e.remove(o0Var);
            a7.close();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.e0
    public final void k() {
        if (this.f15707g != null) {
            return;
        }
        J(new a(this, 3));
    }

    @Override // io.sentry.android.core.e0
    public final void n() {
        if (this.f15707g == null) {
            return;
        }
        J(new a(this, 2));
    }

    public final void r() {
        if (m0.h() && this.f15707g == null) {
            r a7 = this.f15706f.a();
            try {
                if (this.f15707g != null) {
                    a7.close();
                    return;
                }
                b bVar = new b(this);
                if (C(this.f15701a, this.f15702b.getLogger(), this.f15703c, bVar)) {
                    this.f15707g = bVar;
                    this.f15702b.getLogger().h(b5.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f15702b.getLogger().h(b5.WARNING, "Failed to register network callback", new Object[0]);
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public final io.sentry.n0 t() {
        if (this.f15708h != null) {
            NetworkCapabilities networkCapabilities = this.f15708h;
            if (networkCapabilities != null) {
                boolean hasCapability = networkCapabilities.hasCapability(12);
                this.f15703c.getClass();
                if (hasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i5 : f15700p) {
                        if (networkCapabilities.hasTransport(i5)) {
                            return io.sentry.n0.CONNECTED;
                        }
                    }
                }
            }
            return io.sentry.n0.DISCONNECTED;
        }
        ConnectivityManager z5 = z(this.f15701a, this.f15702b.getLogger());
        if (z5 == null) {
            return io.sentry.n0.UNKNOWN;
        }
        Context context = this.f15701a;
        ILogger logger = this.f15702b.getLogger();
        if (!m4.g.o(context)) {
            logger.h(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return io.sentry.n0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = z5.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? io.sentry.n0.CONNECTED : io.sentry.n0.DISCONNECTED;
            }
            logger.h(b5.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return io.sentry.n0.DISCONNECTED;
        } catch (Throwable th2) {
            logger.e(b5.WARNING, "Could not retrieve Connection Status", th2);
            return io.sentry.n0.UNKNOWN;
        }
    }

    @Override // io.sentry.p0
    public final String u() {
        this.f15704d.getClass();
        if (SystemClock.uptimeMillis() - this.j >= 120000) {
            N(null);
        }
        return y();
    }

    public final String y() {
        NetworkCapabilities networkCapabilities = this.f15708h;
        if (networkCapabilities != null) {
            return w(networkCapabilities);
        }
        Context context = this.f15701a;
        ILogger logger = this.f15702b.getLogger();
        n0 n0Var = this.f15703c;
        ConnectivityManager z5 = z(context, logger);
        if (z5 != null) {
            if (!m4.g.o(context)) {
                logger.h(b5.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                n0Var.getClass();
                Network activeNetwork = z5.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.h(b5.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = z5.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.h(b5.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean hasTransport = networkCapabilities2.hasTransport(3);
                boolean hasTransport2 = networkCapabilities2.hasTransport(1);
                boolean hasTransport3 = networkCapabilities2.hasTransport(0);
                if (hasTransport) {
                    return "ethernet";
                }
                if (hasTransport2) {
                    return "wifi";
                }
                if (hasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th2) {
                logger.e(b5.ERROR, "Failed to retrieve network info", th2);
                return null;
            }
        }
        return null;
    }
}
