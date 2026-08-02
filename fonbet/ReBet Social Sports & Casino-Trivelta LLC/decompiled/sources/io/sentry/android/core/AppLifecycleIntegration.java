package io.sentry.android.core;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.util.C4843a;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class AppLifecycleIntegration implements InterfaceC4839u0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C4843a f50660a = new C4843a();

    /* renamed from: b, reason: collision with root package name */
    public volatile K0 f50661b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f50662c;

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50662c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f50662c.isEnableAutoSessionTracking()));
        this.f50662c.getLogger().c(enumC4788n3, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f50662c.isEnableAppLifecycleBreadcrumbs()));
        if (!this.f50662c.isEnableAutoSessionTracking() && !this.f50662c.isEnableAppLifecycleBreadcrumbs()) {
            return;
        }
        InterfaceC4765j0 d10 = this.f50660a.d();
        try {
            if (this.f50661b != null) {
                if (d10 != null) {
                    d10.close();
                }
            } else {
                this.f50661b = new K0(interfaceC4740e0, this.f50662c.getSessionTrackingIntervalMillis(), this.f50662c.isEnableAutoSessionTracking(), this.f50662c.isEnableAppLifecycleBreadcrumbs());
                AppState.w0().B(this.f50661b);
                if (d10 != null) {
                    d10.close();
                }
                f32.getLogger().c(enumC4788n3, "AppLifecycleIntegration installed.", new Object[0]);
                io.sentry.util.n.a("AppLifecycle");
            }
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
        AppState.w0().y1();
    }

    public final void d() {
        InterfaceC4765j0 d10 = this.f50660a.d();
        try {
            K0 k02 = this.f50661b;
            this.f50661b = null;
            if (d10 != null) {
                d10.close();
            }
            if (k02 != null) {
                AppState.w0().D0(k02);
                SentryAndroidOptions sentryAndroidOptions = this.f50662c;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
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
