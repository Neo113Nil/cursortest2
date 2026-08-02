package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4839u0;
import io.sentry.protocol.C4804f;
import java.io.Closeable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements InterfaceC4839u0, Closeable, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    public static final io.sentry.J f50655e = new io.sentry.J();

    /* renamed from: a, reason: collision with root package name */
    public final Context f50656a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC4740e0 f50657b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f50658c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.o f50659d = new io.sentry.android.core.internal.util.o(io.sentry.android.core.internal.util.h.b(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.f50656a = (Context) io.sentry.util.w.c(AbstractC4704q0.g(context), "Context is required");
    }

    public final void B(long j10, int i10) {
        if (this.f50657b != null) {
            C4744f c4744f = new C4744f(j10);
            c4744f.A("system");
            c4744f.v("device.event");
            c4744f.y("Low memory");
            c4744f.w("action", "LOW_MEMORY");
            c4744f.w("level", Integer.valueOf(i10));
            c4744f.x(EnumC4788n3.WARNING);
            this.f50657b.g(c4744f, f50655e);
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        this.f50657b = (InterfaceC4740e0) io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50658c = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f50658c.isEnableAppComponentBreadcrumbs()));
        if (this.f50658c.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f50656a.registerComponentCallbacks(this);
                f32.getLogger().c(enumC4788n3, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                io.sentry.util.n.a("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f50658c.setEnableAppComponentBreadcrumbs(false);
                f32.getLogger().a(EnumC4788n3.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }

    public final void U(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f50658c;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f50658c.getLogger().a(EnumC4788n3.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f50656a.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f50658c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().a(EnumC4788n3.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f50658c;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().c(EnumC4788n3.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        final long currentTimeMillis = System.currentTimeMillis();
        U(new Runnable() { // from class: io.sentry.android.core.b0
            @Override // java.lang.Runnable
            public final void run() {
                AppComponentsBreadcrumbsIntegration.this.r(currentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i10) {
        if (i10 >= 40 && !this.f50659d.a()) {
            final long currentTimeMillis = System.currentTimeMillis();
            U(new Runnable() { // from class: io.sentry.android.core.c0
                @Override // java.lang.Runnable
                public final void run() {
                    AppComponentsBreadcrumbsIntegration.this.B(currentTimeMillis, i10);
                }
            });
        }
    }

    public final void r(long j10, Configuration configuration) {
        if (this.f50657b != null) {
            C4804f.b a10 = io.sentry.android.core.internal.util.p.a(this.f50656a.getResources().getConfiguration().orientation);
            String lowerCase = a10 != null ? a10.name().toLowerCase(Locale.ROOT) : "undefined";
            C4744f c4744f = new C4744f(j10);
            c4744f.A("navigation");
            c4744f.v("device.orientation");
            c4744f.w(ViewProps.POSITION, lowerCase);
            c4744f.x(EnumC4788n3.INFO);
            io.sentry.J j11 = new io.sentry.J();
            j11.m("android:configuration", configuration);
            this.f50657b.g(c4744f, j11);
        }
    }
}
