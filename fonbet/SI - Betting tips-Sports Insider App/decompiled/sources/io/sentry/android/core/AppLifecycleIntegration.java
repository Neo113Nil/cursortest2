package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AppLifecycleIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f15479a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    public volatile v0 f15480b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f15481c;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r a7 = this.f15479a.a();
        try {
            v0 v0Var = this.f15480b;
            this.f15480b = null;
            a7.close();
            if (v0Var != null) {
                h0.f15617e.r(v0Var);
                SentryAndroidOptions sentryAndroidOptions = this.f15481c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().h(b5.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            h0.f15617e.t();
        } catch (Throwable th2) {
            try {
                a7.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15481c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f15481c.isEnableAutoSessionTracking()));
        this.f15481c.getLogger().h(b5Var, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f15481c.isEnableAppLifecycleBreadcrumbs()));
        if (this.f15481c.isEnableAutoSessionTracking() || this.f15481c.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.r a7 = this.f15479a.a();
            try {
                if (this.f15480b != null) {
                    a7.close();
                    return;
                }
                this.f15480b = new v0(this.f15481c.getSessionTrackingIntervalMillis(), this.f15481c.isEnableAutoSessionTracking(), this.f15481c.isEnableAppLifecycleBreadcrumbs());
                h0.f15617e.c(this.f15480b);
                a7.close();
                b6Var.getLogger().h(b5Var, "AppLifecycleIntegration installed.", new Object[0]);
                rh.g.a("AppLifecycle");
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
