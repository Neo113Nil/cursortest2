package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.NonNull;
import io.sentry.A1;
import io.sentry.C7141f;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7166l0;
import io.sentry.U1;
import io.sentry.W2;
import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements InterfaceC7166l0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66930a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final I f66931b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f66932c = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    volatile b f66933d;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final int f66934a;

        /* renamed from: b, reason: collision with root package name */
        final int f66935b;

        /* renamed from: c, reason: collision with root package name */
        final int f66936c;

        /* renamed from: d, reason: collision with root package name */
        private long f66937d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f66938e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        final String f66939f;

        @SuppressLint({"NewApi"})
        a(@NotNull NetworkCapabilities networkCapabilities, @NotNull I i11, long j11) {
            io.sentry.util.p.b(networkCapabilities, "NetworkCapabilities is required");
            io.sentry.util.p.b(i11, "BuildInfoProvider is required");
            this.f66934a = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.f66935b = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.f66936c = signalStrength > -100 ? signalStrength : 0;
            this.f66938e = networkCapabilities.hasTransport(4);
            String b02 = io.sentry.android.core.internal.util.a.b0(networkCapabilities);
            this.f66939f = b02 == null ? "" : b02;
            this.f66937d = j11;
        }

        final boolean a(@NotNull a aVar) {
            int abs = Math.abs(this.f66936c - aVar.f66936c);
            int i11 = this.f66934a;
            int abs2 = Math.abs(i11 - aVar.f66934a);
            int i12 = this.f66935b;
            int abs3 = Math.abs(i12 - aVar.f66935b);
            boolean z11 = ((double) Math.abs(this.f66937d - aVar.f66937d)) / 1000000.0d < 5000.0d;
            return this.f66938e == aVar.f66938e && this.f66939f.equals(aVar.f66939f) && (z11 || abs <= 5) && (z11 || (((double) abs2) > Math.max(1000.0d, ((double) Math.abs(i11)) * 0.1d) ? 1 : (((double) abs2) == Math.max(1000.0d, ((double) Math.abs(i11)) * 0.1d) ? 0 : -1)) <= 0) && (z11 || (((double) abs3) > Math.max(1000.0d, ((double) Math.abs(i12)) * 0.1d) ? 1 : (((double) abs3) == Math.max(1000.0d, ((double) Math.abs(i12)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    static final class b extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        final A1 f66940a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        final I f66941b;

        /* renamed from: c, reason: collision with root package name */
        NetworkCapabilities f66942c = null;

        /* renamed from: d, reason: collision with root package name */
        long f66943d = 0;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        final U1 f66944e;

        b(@NotNull A1 a12, @NotNull I i11, @NotNull U1 u12) {
            this.f66940a = a12;
            io.sentry.util.p.b(i11, "BuildInfoProvider is required");
            this.f66941b = i11;
            io.sentry.util.p.b(u12, "SentryDateProvider is required");
            this.f66944e = u12;
        }

        private static C7141f a(String str) {
            C7141f c7141f = new C7141f();
            c7141f.r("system");
            c7141f.n("network.event");
            c7141f.o(str, "action");
            c7141f.p(I2.INFO);
            return c7141f;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(@NonNull Network network) {
            this.f66940a.f(a("NETWORK_AVAILABLE"));
            this.f66942c = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(@NonNull Network network, @NonNull NetworkCapabilities networkCapabilities) {
            a aVar;
            long d11 = this.f66944e.now().d();
            NetworkCapabilities networkCapabilities2 = this.f66942c;
            long j11 = this.f66943d;
            I i11 = this.f66941b;
            if (networkCapabilities2 == null) {
                aVar = new a(networkCapabilities, i11, d11);
            } else {
                a aVar2 = new a(networkCapabilities2, i11, j11);
                aVar = new a(networkCapabilities, i11, d11);
                if (aVar2.a(aVar)) {
                    aVar = null;
                }
            }
            if (aVar == null) {
                return;
            }
            this.f66942c = networkCapabilities;
            this.f66943d = d11;
            C7141f a11 = a("NETWORK_CAPABILITIES_CHANGED");
            a11.o(Integer.valueOf(aVar.f66934a), "download_bandwidth");
            a11.o(Integer.valueOf(aVar.f66935b), "upload_bandwidth");
            a11.o(Boolean.valueOf(aVar.f66938e), "vpn_active");
            a11.o(aVar.f66939f, "network_type");
            int i12 = aVar.f66936c;
            if (i12 != 0) {
                a11.o(Integer.valueOf(i12), "signal_strength");
            }
            io.sentry.E e11 = new io.sentry.E();
            e11.k(aVar, "android:networkCapabilities");
            this.f66940a.g(a11, e11);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(@NonNull Network network) {
            this.f66940a.f(a("NETWORK_LOST"));
            this.f66942c = null;
        }
    }

    public NetworkBreadcrumbsIntegration(@NotNull Context context, @NotNull I i11) {
        Context applicationContext = context.getApplicationContext();
        this.f66930a = applicationContext != null ? applicationContext : context;
        this.f66931b = i11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InterfaceC7097a0 a11 = this.f66932c.a();
        try {
            b bVar = this.f66933d;
            this.f66933d = null;
            a11.close();
            if (bVar != null) {
                io.sentry.android.core.internal.util.a.o0(bVar);
            }
        } catch (Throwable th2) {
            try {
                a11.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        ILogger logger = w22.getLogger();
        I2 i22 = I2.DEBUG;
        logger.c(i22, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f66931b.getClass();
            InterfaceC7097a0 a11 = this.f66932c.a();
            try {
                this.f66933d = new b(a12, this.f66931b, w22.getDateProvider());
                if (io.sentry.android.core.internal.util.a.W(this.f66930a, w22.getLogger(), this.f66931b, this.f66933d)) {
                    w22.getLogger().c(i22, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    io.sentry.util.j.a("NetworkBreadcrumbs");
                } else {
                    w22.getLogger().c(i22, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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
}
