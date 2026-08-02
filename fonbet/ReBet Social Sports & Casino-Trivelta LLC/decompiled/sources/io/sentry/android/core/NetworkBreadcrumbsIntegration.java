package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.AbstractC4779m;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.InterfaceC4861w2;
import io.sentry.util.C4843a;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC4839u0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50728a;

    /* renamed from: b, reason: collision with root package name */
    public final C4683i0 f50729b;

    /* renamed from: c, reason: collision with root package name */
    public final C4843a f50730c = new C4843a();

    /* renamed from: d, reason: collision with root package name */
    public F3 f50731d;

    /* renamed from: e, reason: collision with root package name */
    public volatile b f50732e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f50733a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50734b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50735c;

        /* renamed from: d, reason: collision with root package name */
        public long f50736d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f50737e;

        /* renamed from: f, reason: collision with root package name */
        public final String f50738f;

        public a(NetworkCapabilities networkCapabilities, C4683i0 c4683i0, long j10) {
            io.sentry.util.w.c(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.w.c(c4683i0, "BuildInfoProvider is required");
            this.f50733a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f50734b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = c4683i0.d() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f50735c = signalStrength > -100 ? signalStrength : 0;
            this.f50737e = networkCapabilities.hasTransport(4);
            String l22 = io.sentry.android.core.internal.util.g.l2(networkCapabilities);
            this.f50738f = l22 == null ? "" : l22;
            this.f50736d = j10;
        }

        public boolean a(a aVar) {
            int abs = Math.abs(this.f50735c - aVar.f50735c);
            int abs2 = Math.abs(this.f50733a - aVar.f50733a);
            int abs3 = Math.abs(this.f50734b - aVar.f50734b);
            boolean z10 = AbstractC4779m.l((double) Math.abs(this.f50736d - aVar.f50736d)) < 5000.0d;
            return this.f50737e == aVar.f50737e && this.f50738f.equals(aVar.f50738f) && (z10 || abs <= 5) && (z10 || (((double) abs2) > Math.max(1000.0d, ((double) Math.abs(this.f50733a)) * 0.1d) ? 1 : (((double) abs2) == Math.max(1000.0d, ((double) Math.abs(this.f50733a)) * 0.1d) ? 0 : -1)) <= 0) && (z10 || (((double) abs3) > Math.max(1000.0d, ((double) Math.abs(this.f50734b)) * 0.1d) ? 1 : (((double) abs3) == Math.max(1000.0d, ((double) Math.abs(this.f50734b)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    public static final class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC4740e0 f50739a;

        /* renamed from: b, reason: collision with root package name */
        public final C4683i0 f50740b;

        /* renamed from: c, reason: collision with root package name */
        public NetworkCapabilities f50741c = null;

        /* renamed from: d, reason: collision with root package name */
        public long f50742d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final InterfaceC4861w2 f50743e;

        public b(InterfaceC4740e0 interfaceC4740e0, C4683i0 c4683i0, InterfaceC4861w2 interfaceC4861w2) {
            this.f50739a = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
            this.f50740b = (C4683i0) io.sentry.util.w.c(c4683i0, "BuildInfoProvider is required");
            this.f50743e = (InterfaceC4861w2) io.sentry.util.w.c(interfaceC4861w2, "SentryDateProvider is required");
        }

        public final C4744f a(String str) {
            C4744f c4744f = new C4744f();
            c4744f.A("system");
            c4744f.v("network.event");
            c4744f.w("action", str);
            c4744f.x(EnumC4788n3.INFO);
            return c4744f;
        }

        public final a b(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j10, long j11) {
            if (networkCapabilities == null) {
                return new a(networkCapabilities2, this.f50740b, j11);
            }
            a aVar = new a(networkCapabilities, this.f50740b, j10);
            a aVar2 = new a(networkCapabilities2, this.f50740b, j11);
            if (aVar.a(aVar2)) {
                return null;
            }
            return aVar2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.f50739a.d(a("NETWORK_AVAILABLE"));
            this.f50741c = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            long f10 = this.f50743e.now().f();
            a b10 = b(this.f50741c, networkCapabilities, this.f50742d, f10);
            if (b10 == null) {
                return;
            }
            this.f50741c = networkCapabilities;
            this.f50742d = f10;
            C4744f a10 = a("NETWORK_CAPABILITIES_CHANGED");
            a10.w("download_bandwidth", Integer.valueOf(b10.f50733a));
            a10.w("upload_bandwidth", Integer.valueOf(b10.f50734b));
            a10.w("vpn_active", Boolean.valueOf(b10.f50737e));
            a10.w("network_type", b10.f50738f);
            int i10 = b10.f50735c;
            if (i10 != 0) {
                a10.w("signal_strength", Integer.valueOf(i10));
            }
            io.sentry.J j10 = new io.sentry.J();
            j10.m("android:networkCapabilities", b10);
            this.f50739a.g(a10, j10);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.f50739a.d(a("NETWORK_LOST"));
            this.f50741c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, C4683i0 c4683i0) {
        this.f50728a = (Context) io.sentry.util.w.c(AbstractC4704q0.g(context), "Context is required");
        this.f50729b = (C4683i0) io.sentry.util.w.c(c4683i0, "BuildInfoProvider is required");
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50731d = f32;
        ILogger logger = f32.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.f50729b.d() < 24) {
                f32.getLogger().c(enumC4788n3, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            InterfaceC4765j0 d10 = this.f50730c.d();
            try {
                this.f50732e = new b(interfaceC4740e0, this.f50729b, f32.getDateProvider());
                if (io.sentry.android.core.internal.util.g.g2(this.f50728a, f32.getLogger(), this.f50729b, this.f50732e)) {
                    f32.getLogger().c(enumC4788n3, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.n.a("NetworkBreadcrumbs");
                } else {
                    f32.getLogger().c(enumC4788n3, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC4765j0 d10 = this.f50730c.d();
        try {
            b bVar = this.f50732e;
            this.f50732e = null;
            if (d10 != null) {
                d10.close();
            }
            if (bVar != null) {
                io.sentry.android.core.internal.util.g.r2(bVar);
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
