package io.sentry.android.core;

import android.content.Context;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4839u0;
import io.sentry.android.core.C4670c;
import io.sentry.util.C4843a;
import java.io.Closeable;

/* loaded from: classes3.dex */
public final class AnrIntegration implements InterfaceC4839u0, Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static C4670c f50637e;

    /* renamed from: f, reason: collision with root package name */
    public static final C4843a f50638f = new C4843a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f50639a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f50640b = false;

    /* renamed from: c, reason: collision with root package name */
    public final C4843a f50641c = new C4843a();

    /* renamed from: d, reason: collision with root package name */
    public F3 f50642d;

    public static final class a implements io.sentry.hints.a, io.sentry.hints.r {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f50643a;

        public a(boolean z10) {
            this.f50643a = z10;
        }

        @Override // io.sentry.hints.a
        public Long a() {
            return null;
        }

        @Override // io.sentry.hints.a
        public boolean f() {
            return true;
        }

        @Override // io.sentry.hints.a
        public String h() {
            return this.f50643a ? "anr_background" : "anr_foreground";
        }
    }

    public AnrIntegration(Context context) {
        this.f50639a = AbstractC4704q0.g(context);
    }

    public static /* synthetic */ void d(AnrIntegration anrIntegration, InterfaceC4740e0 interfaceC4740e0, SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC4765j0 d10 = anrIntegration.f50641c.d();
        try {
            if (!anrIntegration.f50640b) {
                anrIntegration.w0(interfaceC4740e0, sentryAndroidOptions);
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

    public final void B(final InterfaceC4740e0 interfaceC4740e0, final SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            io.sentry.util.n.a("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnrIntegration.d(AnrIntegration.this, interfaceC4740e0, sentryAndroidOptions);
                    }
                });
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().b(EnumC4788n3.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }

    @Override // io.sentry.InterfaceC4839u0
    public final void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        this.f50642d = (F3) io.sentry.util.w.c(f32, "SentryOptions is required");
        B(interfaceC4740e0, (SentryAndroidOptions) f32);
    }

    public void U(InterfaceC4740e0 interfaceC4740e0, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        sentryAndroidOptions.getLogger().c(EnumC4788n3.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
        boolean equals = Boolean.TRUE.equals(AppState.w0().z0());
        C4733c3 c4733c3 = new C4733c3(r(equals, sentryAndroidOptions, applicationNotResponding));
        c4733c3.C0(EnumC4788n3.ERROR);
        interfaceC4740e0.v(c4733c3, io.sentry.util.l.c(new a(equals)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC4765j0 d10 = this.f50641c.d();
        try {
            this.f50640b = true;
            if (d10 != null) {
                d10.close();
            }
            d10 = f50638f.d();
            try {
                C4670c c4670c = f50637e;
                if (c4670c != null) {
                    c4670c.interrupt();
                    f50637e = null;
                    F3 f32 = this.f50642d;
                    if (f32 != null) {
                        f32.getLogger().c(EnumC4788n3.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                if (d10 != null) {
                    d10.close();
                }
            } finally {
            }
        } finally {
        }
    }

    public final Throwable r(boolean z10, SentryAndroidOptions sentryAndroidOptions, ApplicationNotResponding applicationNotResponding) {
        String str = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
        if (z10) {
            str = "Background " + str;
        }
        Thread a10 = applicationNotResponding.a();
        ApplicationNotResponding applicationNotResponding2 = a10 == null ? new ApplicationNotResponding(str) : new ApplicationNotResponding(str, a10);
        io.sentry.protocol.m mVar = new io.sentry.protocol.m();
        mVar.r("ANR");
        return new io.sentry.exception.a(mVar, applicationNotResponding2, a10, true);
    }

    public final void w0(final InterfaceC4740e0 interfaceC4740e0, final SentryAndroidOptions sentryAndroidOptions) {
        InterfaceC4765j0 d10 = f50638f.d();
        try {
            if (f50637e == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
                logger.c(enumC4788n3, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                C4670c c4670c = new C4670c(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new C4670c.a() { // from class: io.sentry.android.core.W
                    @Override // io.sentry.android.core.C4670c.a
                    public final void a(ApplicationNotResponding applicationNotResponding) {
                        AnrIntegration.this.U(interfaceC4740e0, sentryAndroidOptions, applicationNotResponding);
                    }
                }, sentryAndroidOptions.getLogger(), this.f50639a);
                f50637e = c4670c;
                c4670c.start();
                sentryAndroidOptions.getLogger().c(enumC4788n3, "AnrIntegration installed.", new Object[0]);
            }
            if (d10 != null) {
                d10.close();
            }
        } catch (Throwable th2) {
            if (d10 == null) {
                throw th2;
            }
            try {
                d10.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
