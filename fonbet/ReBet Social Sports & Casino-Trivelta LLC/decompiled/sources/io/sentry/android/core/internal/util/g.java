package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Handler;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4765j0;
import io.sentry.P;
import io.sentry.android.core.AbstractC4704q0;
import io.sentry.android.core.AppState;
import io.sentry.android.core.C4683i0;
import io.sentry.util.C4843a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class g implements P, AppState.a {

    /* renamed from: n, reason: collision with root package name */
    public static volatile ConnectivityManager f51116n;

    /* renamed from: a, reason: collision with root package name */
    public final Context f51119a;

    /* renamed from: b, reason: collision with root package name */
    public final F3 f51120b;

    /* renamed from: c, reason: collision with root package name */
    public final C4683i0 f51121c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.transport.o f51122d;

    /* renamed from: e, reason: collision with root package name */
    public final List f51123e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f51124f;

    /* renamed from: g, reason: collision with root package name */
    public final C4843a f51125g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ConnectivityManager.NetworkCallback f51126h;

    /* renamed from: i, reason: collision with root package name */
    public volatile NetworkCapabilities f51127i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Network f51128j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f51129k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f51130l;

    /* renamed from: m, reason: collision with root package name */
    public static final C4843a f51115m = new C4843a();

    /* renamed from: o, reason: collision with root package name */
    public static final C4843a f51117o = new C4843a();

    /* renamed from: p, reason: collision with root package name */
    public static final List f51118p = new ArrayList();
    private static final int[] transports = {1, 0, 3, 2};
    private static final int[] capabilities = new int[2];

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        public final void a() {
            g.this.f51130l.set(false);
            InterfaceC4765j0 d10 = g.this.f51125g.d();
            try {
                g.this.f51127i = null;
                g.this.f51128j = null;
                g gVar = g.this;
                gVar.f51129k = gVar.f51122d.a();
                g.this.f51120b.getLogger().c(EnumC4788n3.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
                Iterator it = g.this.f51123e.iterator();
                while (it.hasNext()) {
                    ((P.b) it.next()).B(P.a.DISCONNECTED);
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        public final boolean b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : g.capabilities) {
                if (i10 != 0 && networkCapabilities.hasCapability(i10) != networkCapabilities2.hasCapability(i10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean c(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2) {
            for (int i10 : g.transports) {
                if (networkCapabilities.hasTransport(i10) != networkCapabilities2.hasTransport(i10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(NetworkCapabilities networkCapabilities) {
            NetworkCapabilities networkCapabilities2 = g.this.f51127i;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                return true;
            }
            if (networkCapabilities2 == null && networkCapabilities == null) {
                return false;
            }
            return b(networkCapabilities2, networkCapabilities) || c(networkCapabilities2, networkCapabilities);
        }

        public final void e(Network network, NetworkCapabilities networkCapabilities) {
            if (d(networkCapabilities)) {
                g.this.v2(networkCapabilities);
                P.a j22 = g.this.j2();
                InterfaceC4765j0 d10 = g.this.f51125g.d();
                try {
                    Iterator it = g.this.f51123e.iterator();
                    while (it.hasNext()) {
                        ((P.b) it.next()).B(j22);
                    }
                    if (d10 != null) {
                        d10.close();
                    }
                } catch (Throwable th2) {
                    if (d10 != null) {
                        try {
                            d10.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            g.this.f51128j = network;
            if (g.this.f51130l.getAndSet(true)) {
                return;
            }
            InterfaceC4765j0 d10 = g.f51117o.d();
            try {
                Iterator it = g.f51118p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network.equals(g.this.f51128j)) {
                e(network, networkCapabilities);
                InterfaceC4765j0 d10 = g.f51117o.d();
                try {
                    Iterator it = g.f51118p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onCapabilitiesChanged(network, networkCapabilities);
                    }
                    if (d10 != null) {
                        d10.close();
                    }
                } catch (Throwable th2) {
                    if (d10 != null) {
                        try {
                            d10.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(g.this.f51128j)) {
                a();
                InterfaceC4765j0 d10 = g.f51117o.d();
                try {
                    Iterator it = g.f51118p.iterator();
                    while (it.hasNext()) {
                        ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                    }
                    if (d10 != null) {
                        d10.close();
                    }
                } catch (Throwable th2) {
                    if (d10 != null) {
                        try {
                            d10.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            a();
            InterfaceC4765j0 d10 = g.f51117o.d();
            try {
                Iterator it = g.f51118p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public g(Context context, F3 f32, C4683i0 c4683i0, io.sentry.transport.o oVar) {
        this(context, f32, c4683i0, oVar, null);
    }

    public static /* synthetic */ void J(g gVar) {
        gVar.u2(true);
        InterfaceC4765j0 d10 = f51117o.d();
        try {
            f51118p.clear();
            if (d10 != null) {
                d10.close();
            }
            d10 = f51115m.d();
            try {
                f51116n = null;
                if (d10 != null) {
                    d10.close();
                }
                AppState.w0().D0(gVar);
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ void U(g gVar) {
        InterfaceC4765j0 d10;
        gVar.v2(null);
        P.a j22 = gVar.j2();
        if (j22 == P.a.DISCONNECTED) {
            gVar.f51130l.set(false);
            d10 = f51117o.d();
            try {
                Iterator it = f51118p.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                }
                if (d10 != null) {
                    d10.close();
                }
            } finally {
            }
        }
        d10 = gVar.f51125g.d();
        try {
            Iterator it2 = gVar.f51123e.iterator();
            while (it2.hasNext()) {
                ((P.b) it2.next()).B(j22);
            }
            if (d10 != null) {
                d10.close();
            }
            gVar.h2();
        } finally {
        }
    }

    public static boolean g2(Context context, ILogger iLogger, C4683i0 c4683i0, ConnectivityManager.NetworkCallback networkCallback) {
        if (c4683i0.d() < 24) {
            iLogger.c(EnumC4788n3.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC4788n3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        InterfaceC4765j0 d10 = f51117o.d();
        try {
            f51118p.add(networkCallback);
            if (d10 == null) {
                return true;
            }
            d10.close();
            return true;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static P.a i2(Context context, ConnectivityManager connectivityManager, ILogger iLogger) {
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC4788n3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return P.a.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? P.a.CONNECTED : P.a.DISCONNECTED;
            }
            iLogger.c(EnumC4788n3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return P.a.DISCONNECTED;
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.WARNING, "Could not retrieve Connection Status", th2);
            return P.a.UNKNOWN;
        }
    }

    public static String k2(Context context, ILogger iLogger, C4683i0 c4683i0) {
        boolean z10;
        boolean z11;
        ConnectivityManager n22 = n2(context, iLogger);
        if (n22 == null) {
            return null;
        }
        boolean z12 = false;
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC4788n3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return null;
        }
        try {
            z10 = true;
            if (c4683i0.d() >= 23) {
                Network activeNetwork = n22.getActiveNetwork();
                if (activeNetwork == null) {
                    iLogger.c(EnumC4788n3.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities = n22.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    iLogger.c(EnumC4788n3.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean hasTransport = networkCapabilities.hasTransport(3);
                z11 = networkCapabilities.hasTransport(1);
                z10 = networkCapabilities.hasTransport(0);
                z12 = hasTransport;
            } else {
                NetworkInfo activeNetworkInfo = n22.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    iLogger.c(EnumC4788n3.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
                    return null;
                }
                int type = activeNetworkInfo.getType();
                if (type == 0) {
                    z11 = false;
                } else if (type != 1) {
                    if (type != 9) {
                        z11 = false;
                    } else {
                        z11 = false;
                        z12 = true;
                    }
                    z10 = z11;
                } else {
                    z11 = true;
                    z10 = false;
                }
            }
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.ERROR, "Failed to retrieve network info", th2);
        }
        if (z12) {
            return "ethernet";
        }
        if (z11) {
            return "wifi";
        }
        if (z10) {
            return "cellular";
        }
        return null;
    }

    public static String l2(NetworkCapabilities networkCapabilities) {
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

    public static ConnectivityManager n2(Context context, ILogger iLogger) {
        if (f51116n != null) {
            return f51116n;
        }
        InterfaceC4765j0 d10 = f51115m.d();
        try {
            if (f51116n != null) {
                ConnectivityManager connectivityManager = f51116n;
                if (d10 != null) {
                    d10.close();
                }
                return connectivityManager;
            }
            f51116n = (ConnectivityManager) context.getSystemService("connectivity");
            if (f51116n == null) {
                iLogger.c(EnumC4788n3.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = f51116n;
            if (d10 != null) {
                d10.close();
            }
            return connectivityManager2;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static boolean q2(Context context, ILogger iLogger, C4683i0 c4683i0, Handler handler, ConnectivityManager.NetworkCallback networkCallback) {
        if (c4683i0.d() < 24) {
            iLogger.c(EnumC4788n3.DEBUG, "NetworkCallbacks need Android N+.", new Object[0]);
            return false;
        }
        ConnectivityManager n22 = n2(context, iLogger);
        if (n22 == null) {
            return false;
        }
        if (!t.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            iLogger.c(EnumC4788n3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        try {
            if (handler != null) {
                n22.registerDefaultNetworkCallback(networkCallback, handler);
                return true;
            }
            n22.registerDefaultNetworkCallback(networkCallback);
            return true;
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.WARNING, "registerDefaultNetworkCallback failed", th2);
            return false;
        }
    }

    public static void r2(ConnectivityManager.NetworkCallback networkCallback) {
        InterfaceC4765j0 d10 = f51117o.d();
        try {
            f51118p.remove(networkCallback);
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static void t2(Context context, ILogger iLogger, ConnectivityManager.NetworkCallback networkCallback) {
        ConnectivityManager n22 = n2(context, iLogger);
        if (n22 == null) {
            return;
        }
        try {
            n22.unregisterNetworkCallback(networkCallback);
        } catch (Throwable th2) {
            iLogger.b(EnumC4788n3.WARNING, "unregisterNetworkCallback failed", th2);
        }
    }

    @Override // io.sentry.P
    public String I() {
        if (!o2()) {
            v2(null);
        }
        return m2();
    }

    @Override // io.sentry.P
    public void J1(P.b bVar) {
        InterfaceC4765j0 d10 = this.f51125g.d();
        try {
            this.f51123e.remove(bVar);
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        s2(new Runnable() { // from class: io.sentry.android.core.internal.util.c
            @Override // java.lang.Runnable
            public final void run() {
                g.J(g.this);
            }
        });
    }

    @Override // io.sentry.android.core.AppState.a
    public void d() {
        if (this.f51126h != null) {
            return;
        }
        s2(new Runnable() { // from class: io.sentry.android.core.internal.util.d
            @Override // java.lang.Runnable
            public final void run() {
                g.U(g.this);
            }
        });
    }

    public final void h2() {
        if (AbstractC4704q0.s() && this.f51126h == null) {
            InterfaceC4765j0 d10 = this.f51125g.d();
            try {
                if (this.f51126h != null) {
                    if (d10 != null) {
                        d10.close();
                        return;
                    }
                    return;
                }
                a aVar = new a();
                if (q2(this.f51119a, this.f51120b.getLogger(), this.f51121c, this.f51124f, aVar)) {
                    this.f51126h = aVar;
                    this.f51120b.getLogger().c(EnumC4788n3.DEBUG, "Network callback registered successfully", new Object[0]);
                } else {
                    this.f51120b.getLogger().c(EnumC4788n3.WARNING, "Failed to register network callback", new Object[0]);
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final P.a j2() {
        if (this.f51127i != null) {
            return p2(this.f51127i) ? P.a.CONNECTED : P.a.DISCONNECTED;
        }
        ConnectivityManager n22 = n2(this.f51119a, this.f51120b.getLogger());
        return n22 != null ? i2(this.f51119a, n22, this.f51120b.getLogger()) : P.a.UNKNOWN;
    }

    @Override // io.sentry.android.core.AppState.a
    public void k() {
        if (this.f51126h == null) {
            return;
        }
        s2(new Runnable() { // from class: io.sentry.android.core.internal.util.b
            @Override // java.lang.Runnable
            public final void run() {
                g.this.u2(false);
            }
        });
    }

    public final String m2() {
        NetworkCapabilities networkCapabilities = this.f51127i;
        return networkCapabilities != null ? l2(networkCapabilities) : k2(this.f51119a, this.f51120b.getLogger(), this.f51121c);
    }

    public final boolean o2() {
        return this.f51122d.a() - this.f51129k < 120000;
    }

    public final boolean p2(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return false;
        }
        boolean hasCapability = networkCapabilities.hasCapability(12);
        if (this.f51121c.d() >= 23) {
            hasCapability = hasCapability && networkCapabilities.hasCapability(16);
        }
        if (!hasCapability) {
            return false;
        }
        for (int i10 : transports) {
            if (networkCapabilities.hasTransport(i10)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.P
    public P.a s0() {
        if (!o2()) {
            v2(null);
        }
        return j2();
    }

    public final void s2(Runnable runnable) {
        try {
            this.f51120b.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            this.f51120b.getLogger().b(EnumC4788n3.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    public final void u2(boolean z10) {
        InterfaceC4765j0 d10 = this.f51125g.d();
        if (z10) {
            try {
                this.f51123e.clear();
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        ConnectivityManager.NetworkCallback networkCallback = this.f51126h;
        this.f51126h = null;
        if (networkCallback != null) {
            t2(this.f51119a, this.f51120b.getLogger(), networkCallback);
        }
        this.f51127i = null;
        this.f51128j = null;
        this.f51129k = 0L;
        if (d10 != null) {
            d10.close();
        }
        this.f51120b.getLogger().c(EnumC4788n3.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void v2(NetworkCapabilities networkCapabilities) {
        InterfaceC4765j0 d10 = this.f51125g.d();
        try {
            if (networkCapabilities != null) {
                this.f51127i = networkCapabilities;
            } else {
                if (!t.a(this.f51119a, "android.permission.ACCESS_NETWORK_STATE")) {
                    this.f51120b.getLogger().c(EnumC4788n3.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.f51127i = null;
                    this.f51129k = this.f51122d.a();
                    if (d10 != null) {
                        d10.close();
                        return;
                    }
                    return;
                }
                if (this.f51121c.d() < 23) {
                    this.f51127i = null;
                    this.f51129k = this.f51122d.a();
                    if (d10 != null) {
                        d10.close();
                        return;
                    }
                    return;
                }
                ConnectivityManager n22 = n2(this.f51119a, this.f51120b.getLogger());
                if (n22 != null) {
                    Network activeNetwork = n22.getActiveNetwork();
                    this.f51127i = activeNetwork != null ? n22.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.f51127i = null;
                }
            }
            this.f51129k = this.f51122d.a();
            this.f51120b.getLogger().c(EnumC4788n3.DEBUG, "Cache updated - Status: " + j2() + ", Type: " + m2(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f51120b.getLogger().b(EnumC4788n3.WARNING, "Failed to update connection status cache", th2);
                this.f51127i = null;
                this.f51129k = this.f51122d.a();
            } catch (Throwable th3) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        }
        if (d10 != null) {
            d10.close();
        }
    }

    @Override // io.sentry.P
    public boolean x1(P.b bVar) {
        InterfaceC4765j0 d10 = this.f51125g.d();
        try {
            this.f51123e.add(bVar);
            if (d10 != null) {
                d10.close();
            }
            h2();
            return this.f51126h != null;
        } catch (Throwable th2) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public g(Context context, F3 f32, C4683i0 c4683i0, io.sentry.transport.o oVar, Handler handler) {
        this.f51125g = new C4843a();
        this.f51129k = 0L;
        this.f51130l = new AtomicBoolean(false);
        this.f51119a = AbstractC4704q0.g(context);
        this.f51120b = f32;
        this.f51121c = c4683i0;
        this.f51122d = oVar;
        this.f51124f = handler;
        this.f51123e = new ArrayList();
        int[] iArr = capabilities;
        iArr[0] = 12;
        if (c4683i0.d() >= 23) {
            iArr[1] = 16;
        }
        s2(new Runnable() { // from class: io.sentry.android.core.internal.util.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.h2();
            }
        });
        AppState.w0().B(this);
    }
}
