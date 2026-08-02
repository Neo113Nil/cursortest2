package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class NdkIntegration implements q1, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Class f15487a;

    /* renamed from: b, reason: collision with root package name */
    public SentryAndroidOptions f15488b;

    public NdkIntegration(Class cls) {
        this.f15487a = cls;
    }

    public static void c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f15488b;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f15487a;
        try {
            if (cls != null) {
                try {
                    try {
                        cls.getMethod("close", null).invoke(null, null);
                        this.f15488b.getLogger().h(b5.DEBUG, "NdkIntegration removed.", new Object[0]);
                        c(this.f15488b);
                    } catch (NoSuchMethodException e7) {
                        this.f15488b.getLogger().e(b5.ERROR, "Failed to invoke the SentryNdk.close method.", e7);
                        c(this.f15488b);
                    }
                } catch (Throwable th2) {
                    this.f15488b.getLogger().e(b5.ERROR, "Failed to close SentryNdk.", th2);
                    c(this.f15488b);
                }
            }
        } catch (Throwable th3) {
            c(this.f15488b);
            throw th3;
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = b6Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) b6Var : null;
        y4.a.C(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f15488b = sentryAndroidOptions;
        boolean isEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f15488b.getLogger();
        b5 b5Var = b5.DEBUG;
        logger.h(b5Var, "NdkIntegration enabled: %s", Boolean.valueOf(isEnableNdk));
        if (!isEnableNdk || (cls = this.f15487a) == null) {
            c(this.f15488b);
            return;
        }
        if (this.f15488b.getCacheDirPath() == null) {
            this.f15488b.getLogger().h(b5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            c(this.f15488b);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f15488b);
            this.f15488b.getLogger().h(b5Var, "NdkIntegration installed.", new Object[0]);
            rh.g.a("Ndk");
        } catch (NoSuchMethodException e7) {
            c(this.f15488b);
            this.f15488b.getLogger().e(b5.ERROR, "Failed to invoke the SentryNdk.init method.", e7);
        } catch (Throwable th2) {
            c(this.f15488b);
            this.f15488b.getLogger().e(b5.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }
}
