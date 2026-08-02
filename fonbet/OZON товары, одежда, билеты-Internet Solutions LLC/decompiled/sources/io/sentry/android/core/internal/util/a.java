package io.sentry.android.core.internal.util;

import B90.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.J;
import io.sentry.android.core.F;
import io.sentry.android.core.I;
import io.sentry.android.core.K;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements J, F.a {

    /* renamed from: m, reason: collision with root package name */
    private static volatile ConnectivityManager f67176m;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f67181a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67182b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I f67183c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f67184d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f67185e;

    /* renamed from: g, reason: collision with root package name */
    private volatile ConnectivityManager.NetworkCallback f67187g;

    /* renamed from: h, reason: collision with root package name */
    private volatile NetworkCapabilities f67188h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Network f67189i;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f67175l = new io.sentry.util.a();

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final io.sentry.util.a f67177n = new io.sentry.util.a();

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private static final ArrayList f67178o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f67179p = {1, 0, 3, 2};

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f67180q = new int[2];

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f67186f = new io.sentry.util.a();

    /* renamed from: j, reason: collision with root package name */
    private volatile long f67190j = 0;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f67191k = new AtomicBoolean(false);

    /* renamed from: io.sentry.android.core.internal.util.a$a, reason: collision with other inner class name */
    final class C1103a extends ConnectivityManager.NetworkCallback {
        C1103a() {
        }

        private void a() {
            a aVar = a.this;
            aVar.f67191k.set(false);
            InterfaceC7097a0 a11 = aVar.f67186f.a();
            try {
                aVar.f67188h = null;
                aVar.f67189i = null;
                ((b) aVar.f67184d).getClass();
                aVar.f67190j = SystemClock.uptimeMillis();
                aVar.f67182b.getLogger().c(I2.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = aVar.f67185e.iterator();
                while (it.hasNext()) {
                    ((J.b) it.next()).j(J.a.DISCONNECTED);
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NotNull Network network) {
            a aVar = a.this;
            aVar.f67189i = network;
            if (aVar.f67191k.getAndSet(true)) {
                return;
            }
            InterfaceC7097a0 a11 = a.f67177n.a();
            try {
                Iterator it = a.f67178o.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00a0 A[Catch: all -> 0x00aa, LOOP:0: B:16:0x009a->B:18:0x00a0, LOOP_END, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:15:0x0092, B:16:0x009a, B:18:0x00a0), top: B:14:0x0092 }] */
        @Override // android.net.ConnectivityManager.NetworkCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            J.a Z11;
            InterfaceC7097a0 a11;
            Iterator it;
            a aVar = a.this;
            if (!network.equals(aVar.f67189i)) {
                return;
            }
            NetworkCapabilities networkCapabilities2 = aVar.f67188h;
            try {
                try {
                    if ((networkCapabilities2 == null) == (networkCapabilities == null)) {
                        if (networkCapabilities2 != null || networkCapabilities != null) {
                            int[] iArr = a.f67180q;
                            int length = iArr.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 < length) {
                                    int i12 = iArr[i11];
                                    if (i12 != 0 && networkCapabilities2.hasCapability(i12) != networkCapabilities.hasCapability(i12)) {
                                        break;
                                    } else {
                                        i11++;
                                    }
                                } else {
                                    for (int i13 : a.f67179p) {
                                        if (networkCapabilities2.hasTransport(i13) == networkCapabilities.hasTransport(i13)) {
                                        }
                                    }
                                }
                            }
                        }
                        a11 = a.f67177n.a();
                        it = a.f67178o.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
                        }
                        a11.close();
                        return;
                    }
                    it = a.f67178o.iterator();
                    while (it.hasNext()) {
                    }
                    a11.close();
                    return;
                } finally {
                }
                Iterator it2 = aVar.f67185e.iterator();
                while (it2.hasNext()) {
                    ((J.b) it2.next()).j(Z11);
                }
                a11.close();
                a11 = a.f67177n.a();
            } finally {
            }
            aVar.u0(networkCapabilities);
            Z11 = aVar.Z();
            a11 = aVar.f67186f.a();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NotNull Network network) {
            if (network.equals(a.this.f67189i)) {
                a();
                InterfaceC7097a0 a11 = a.f67177n.a();
                try {
                    Iterator it = a.f67178o.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                    }
                    a11.close();
                } catch (Throwable th2) {
                    try {
                        a11.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onUnavailable() {
            a();
            InterfaceC7097a0 a11 = a.f67177n.a();
            try {
                Iterator it = a.f67178o.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public a(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull I i11, @NotNull b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f67181a = applicationContext != null ? applicationContext : context;
        this.f67182b = sentryAndroidOptions;
        this.f67183c = i11;
        this.f67184d = bVar;
        this.f67185e = new ArrayList();
        int[] iArr = f67180q;
        iArr[0] = 12;
        iArr[1] = 16;
        r0(new com.appsflyer.internal.h(this, 1));
        F.o().j(this);
    }

    public static boolean W(@NotNull Context context, @NotNull ILogger iLogger, @NotNull I i11, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        i11.getClass();
        if (!m.a(context)) {
            iLogger.c(I2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        InterfaceC7097a0 a11 = f67177n.a();
        try {
            f67178o.add(networkCallback);
            a11.close();
            return true;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        if (K.g() && this.f67187g == null) {
            InterfaceC7097a0 a11 = this.f67186f.a();
            try {
                if (this.f67187g != null) {
                    a11.close();
                    return;
                }
                C1103a c1103a = new C1103a();
                Context context = this.f67181a;
                ILogger logger = this.f67182b.getLogger();
                this.f67183c.getClass();
                ConnectivityManager l02 = l0(context, logger);
                if (l02 != null) {
                    if (m.a(context)) {
                        try {
                            l02.registerDefaultNetworkCallback(c1103a);
                            this.f67187g = c1103a;
                            this.f67182b.getLogger().c(I2.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th2) {
                            logger.a(I2.WARNING, "registerDefaultNetworkCallback failed", th2);
                        }
                        a11.close();
                    }
                    logger.c(I2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.f67182b.getLogger().c(I2.WARNING, "Failed to register network callback", new Object[0]);
                a11.close();
            } catch (Throwable th3) {
                try {
                    a11.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NotNull
    public J.a Z() {
        if (this.f67188h != null) {
            NetworkCapabilities networkCapabilities = this.f67188h;
            if (networkCapabilities != null) {
                boolean hasCapability = networkCapabilities.hasCapability(12);
                this.f67183c.getClass();
                if (hasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i11 : f67179p) {
                        if (networkCapabilities.hasTransport(i11)) {
                            return J.a.CONNECTED;
                        }
                    }
                }
            }
            return J.a.DISCONNECTED;
        }
        ConnectivityManager l02 = l0(this.f67181a, this.f67182b.getLogger());
        if (l02 == null) {
            return J.a.UNKNOWN;
        }
        Context context = this.f67181a;
        ILogger logger = this.f67182b.getLogger();
        if (!m.a(context)) {
            logger.c(I2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return J.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = l02.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? J.a.CONNECTED : J.a.DISCONNECTED;
            }
            logger.c(I2.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return J.a.DISCONNECTED;
        } catch (Throwable th2) {
            logger.a(I2.WARNING, "Could not retrieve Connection Status", th2);
            return J.a.UNKNOWN;
        }
    }

    public static String b0(@NotNull NetworkCapabilities networkCapabilities) {
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

    private String d0() {
        NetworkCapabilities networkCapabilities = this.f67188h;
        if (networkCapabilities != null) {
            return b0(networkCapabilities);
        }
        Context context = this.f67181a;
        ILogger logger = this.f67182b.getLogger();
        I i11 = this.f67183c;
        ConnectivityManager l02 = l0(context, logger);
        if (l02 != null) {
            if (!m.a(context)) {
                logger.c(I2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                i11.getClass();
                Network activeNetwork = l02.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.c(I2.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = l02.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.c(I2.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
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
                logger.a(I2.ERROR, "Failed to retrieve network info", th2);
            }
        }
        return null;
    }

    private static ConnectivityManager l0(@NotNull Context context, @NotNull ILogger iLogger) {
        if (f67176m != null) {
            return f67176m;
        }
        InterfaceC7097a0 a11 = f67175l.a();
        try {
            if (f67176m != null) {
                ConnectivityManager connectivityManager = f67176m;
                a11.close();
                return connectivityManager;
            }
            f67176m = (ConnectivityManager) context.getSystemService("connectivity");
            if (f67176m == null) {
                iLogger.c(I2.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f67176m;
            a11.close();
            return connectivityManager2;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static /* synthetic */ void m(a aVar) {
        aVar.s0(true);
        InterfaceC7097a0 a11 = f67177n.a();
        try {
            f67178o.clear();
            a11.close();
            a11 = f67175l.a();
            try {
                f67176m = null;
                a11.close();
                F.o().r(aVar);
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ void o(a aVar) {
        InterfaceC7097a0 a11;
        aVar.u0(null);
        J.a Z11 = aVar.Z();
        if (Z11 == J.a.DISCONNECTED) {
            aVar.f67191k.set(false);
            a11 = f67177n.a();
            try {
                Iterator it = f67178o.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                }
                a11.close();
            } finally {
            }
        }
        a11 = aVar.f67186f.a();
        try {
            Iterator it2 = aVar.f67185e.iterator();
            while (it2.hasNext()) {
                ((J.b) it2.next()).j(Z11);
            }
            a11.close();
            aVar.X();
        } finally {
        }
    }

    public static void o0(@NotNull ConnectivityManager.NetworkCallback networkCallback) {
        InterfaceC7097a0 a11 = f67177n.a();
        try {
            f67178o.remove(networkCallback);
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void r0(@NotNull Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f67182b;
        try {
            sentryAndroidOptions.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().a(I2.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(boolean z11) {
        InterfaceC7097a0 a11 = this.f67186f.a();
        if (z11) {
            try {
                this.f67185e.clear();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        ConnectivityManager.NetworkCallback networkCallback = this.f67187g;
        this.f67187g = null;
        if (networkCallback != null) {
            Context context = this.f67181a;
            ILogger logger = this.f67182b.getLogger();
            ConnectivityManager l02 = l0(context, logger);
            if (l02 != null) {
                try {
                    l02.unregisterNetworkCallback(networkCallback);
                } catch (Throwable th4) {
                    logger.a(I2.WARNING, "unregisterNetworkCallback failed", th4);
                }
            }
        }
        this.f67188h = null;
        this.f67189i = null;
        this.f67190j = 0L;
        a11.close();
        this.f67182b.getLogger().c(I2.DEBUG, "Network callback unregistered", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi", "MissingPermission"})
    public void u0(NetworkCapabilities networkCapabilities) {
        InterfaceC7097a0 a11 = this.f67186f.a();
        try {
            if (networkCapabilities != null) {
                this.f67188h = networkCapabilities;
            } else {
                if (!m.a(this.f67181a)) {
                    this.f67182b.getLogger().c(I2.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f67188h = null;
                    this.f67184d.getClass();
                    this.f67190j = SystemClock.uptimeMillis();
                    a11.close();
                    return;
                }
                this.f67183c.getClass();
                ConnectivityManager l02 = l0(this.f67181a, this.f67182b.getLogger());
                if (l02 != null) {
                    Network activeNetwork = l02.getActiveNetwork();
                    this.f67188h = activeNetwork != null ? l02.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f67188h = null;
                }
            }
            this.f67184d.getClass();
            this.f67190j = SystemClock.uptimeMillis();
            this.f67182b.getLogger().c(I2.DEBUG, "Cache updated - Status: " + Z() + ", Type: " + d0(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f67182b.getLogger().a(I2.WARNING, "Failed to update connection status cache", th2);
                this.f67188h = null;
                this.f67184d.getClass();
                this.f67190j = SystemClock.uptimeMillis();
            } catch (Throwable th3) {
                try {
                    a11.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        a11.close();
    }

    @Override // io.sentry.J
    public final String D() {
        this.f67184d.getClass();
        if (SystemClock.uptimeMillis() - this.f67190j >= 120000) {
            u0(null);
        }
        return d0();
    }

    @Override // io.sentry.J
    public final void I0(@NotNull J.b bVar) {
        InterfaceC7097a0 a11 = this.f67186f.a();
        try {
            this.f67185e.remove(bVar);
            a11.close();
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.J
    public final boolean O1(@NotNull J.b bVar) {
        InterfaceC7097a0 a11 = this.f67186f.a();
        try {
            this.f67185e.add(bVar);
            a11.close();
            X();
            return this.f67187g != null;
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.F.a
    public final void c() {
        if (this.f67187g != null) {
            return;
        }
        r0(new Hn.a(this, 2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r0(new g0(this, 8));
    }

    @Override // io.sentry.android.core.F.a
    public final void j() {
        if (this.f67187g == null) {
            return;
        }
        r0(new Ej.n(this, 3));
    }

    @Override // io.sentry.J
    @NotNull
    public final J.a l() {
        this.f67184d.getClass();
        if (SystemClock.uptimeMillis() - this.f67190j >= 120000) {
            u0(null);
        }
        return Z();
    }
}
