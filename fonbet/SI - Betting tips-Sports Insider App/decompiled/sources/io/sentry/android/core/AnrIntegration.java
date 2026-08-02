package io.sentry.android.core;

import android.content.Context;
import com.sports.insider.MyApp;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.q1;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AnrIntegration implements q1, Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static a f15465e;

    /* renamed from: f, reason: collision with root package name */
    public static final io.sentry.util.a f15466f = new io.sentry.util.a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f15467a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15468b = false;

    /* renamed from: c, reason: collision with root package name */
    public final io.sentry.util.a f15469c = new io.sentry.util.a();

    /* renamed from: d, reason: collision with root package name */
    public b6 f15470d;

    public AnrIntegration(MyApp myApp) {
        Context applicationContext = myApp.getApplicationContext();
        this.f15467a = applicationContext != null ? applicationContext : myApp;
    }

    public final void c(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.r a7 = f15466f.a();
        try {
            if (f15465e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                b5 b5Var = b5.DEBUG;
                logger.h(b5Var, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new com.google.firebase.messaging.g(10, this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f15467a);
                f15465e = aVar;
                aVar.start();
                sentryAndroidOptions.getLogger().h(b5Var, "AnrIntegration installed.", new Object[0]);
            }
            a7.close();
        } finally {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r a7 = this.f15469c.a();
        try {
            this.f15468b = true;
            a7.close();
            a7 = f15466f.a();
            try {
                a aVar = f15465e;
                if (aVar != null) {
                    aVar.interrupt();
                    f15465e = null;
                    b6 b6Var = this.f15470d;
                    if (b6Var != null) {
                        b6Var.getLogger().h(b5.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                a7.close();
            } finally {
                try {
                    a7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // io.sentry.q1
    public final void y(b6 b6Var) {
        this.f15470d = b6Var;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) b6Var;
        sentryAndroidOptions.getLogger().h(b5.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            rh.g.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new androidx.appcompat.app.t(23, this, sentryAndroidOptions));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().e(b5.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }
}
