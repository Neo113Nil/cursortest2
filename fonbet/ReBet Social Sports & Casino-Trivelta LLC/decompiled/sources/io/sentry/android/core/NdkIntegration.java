package io.sentry.android.core;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4839u0;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class NdkIntegration implements InterfaceC4839u0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Class f50726a;

    /* renamed from: b, reason: collision with root package name */
    public SentryAndroidOptions f50727b;

    public NdkIntegration(Class cls) {
        this.f50726a = cls;
    }

    @Override // io.sentry.InterfaceC4839u0
    public final void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        io.sentry.util.w.c(interfaceC4740e0, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50727b = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f50727b.getLogger();
        EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
        logger.c(enumC4788n3, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || this.f50726a == null) {
            d(this.f50727b);
            return;
        }
        if (this.f50727b.getCacheDirPath() == null) {
            this.f50727b.getLogger().c(EnumC4788n3.ERROR, "No cache dir path is defined in options.", new Object[0]);
            d(this.f50727b);
            return;
        }
        try {
            this.f50726a.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f50727b);
            this.f50727b.getLogger().c(enumC4788n3, "NdkIntegration installed.", new Object[0]);
            io.sentry.util.n.a("Ndk");
        } catch (NoSuchMethodException e10) {
            d(this.f50727b);
            this.f50727b.getLogger().b(EnumC4788n3.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th2) {
            d(this.f50727b);
            this.f50727b.getLogger().b(EnumC4788n3.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f50727b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f50726a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f50727b.getLogger().c(EnumC4788n3.DEBUG, "NdkIntegration removed.", new Object[0]);
                        d(this.f50727b);
                    } catch (NoSuchMethodException e10) {
                        this.f50727b.getLogger().b(EnumC4788n3.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
                        d(this.f50727b);
                    }
                } catch (Throwable th2) {
                    this.f50727b.getLogger().b(EnumC4788n3.ERROR, "Failed to close SentryNdk.", th2);
                    d(this.f50727b);
                }
            }
        } catch (Throwable th3) {
            d(this.f50727b);
            throw th3;
        }
    }

    public final void d(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }
}
