package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class NetworkBreadcrumbsIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15489a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f15490b;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f15491c = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    public volatile z0 f15492d;

    public NetworkBreadcrumbsIntegration(MyApp myApp, n0 n0Var) {
        Context applicationContext = myApp.getApplicationContext();
        this.f15489a = applicationContext != null ? applicationContext : myApp;
        this.f15490b = n0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r a7 = this.f15491c.a();
        try {
            z0 z0Var = this.f15492d;
            this.f15492d = null;
            a7.close();
            if (z0Var != null) {
                io.sentry.r a10 = io.sentry.android.core.internal.util.c.f15698n.a();
                try {
                    io.sentry.android.core.internal.util.c.f15699o.remove(z0Var);
                    a10.close();
                } catch (Throwable th2) {
                    try {
                        a10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                a7.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        ILogger logger = b6Var.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f15490b.getClass();
            if (Build.VERSION.SDK_INT < 24) {
                b6Var.getLogger().h(b5Var, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            io.sentry.r a7 = this.f15491c.a();
            try {
                this.f15492d = new z0(this.f15490b, b6Var.getDateProvider());
                if (io.sentry.android.core.internal.util.c.c(this.f15489a, b6Var.getLogger(), this.f15490b, this.f15492d)) {
                    b6Var.getLogger().h(b5Var, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    rh.g.a("NetworkBreadcrumbs");
                } else {
                    b6Var.getLogger().h(b5Var, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
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
}
