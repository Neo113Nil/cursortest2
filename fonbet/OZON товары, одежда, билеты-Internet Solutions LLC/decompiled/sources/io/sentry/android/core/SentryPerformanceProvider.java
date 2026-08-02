package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C2;
import io.sentry.C7224y0;
import io.sentry.I2;
import io.sentry.InterfaceC7097a0;
import io.sentry.InterfaceC7146g0;
import io.sentry.L1;
import io.sentry.W2;
import io.sentry.r3;
import io.sentry.s3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class SentryPerformanceProvider extends Q {

    /* renamed from: e, reason: collision with root package name */
    private static final long f66985e = SystemClock.uptimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f66986f = 0;

    /* renamed from: b, reason: collision with root package name */
    private Application f66987b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7113n f66988c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final I f66989d;

    public SentryPerformanceProvider() {
        new io.sentry.util.a();
        C7113n c7113n = new C7113n();
        this.f66988c = c7113n;
        this.f66989d = new I(c7113n);
    }

    private void a(@NotNull Context context, @NotNull L1 l12, @NotNull io.sentry.android.core.performance.j jVar) {
        boolean f7 = l12.f();
        C7113n c7113n = this.f66988c;
        if (!f7) {
            c7113n.c(I2.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C7109j c7109j = new C7109j(this.f66989d, new io.sentry.android.core.internal.util.v(context.getApplicationContext(), c7113n, this.f66989d), c7113n, l12.c(), l12.d(), new D3.l(new C2()));
        jVar.s(null);
        jVar.r(c7109j);
        c7113n.c(I2.DEBUG, "App start continuous profiling started.", new Object[0]);
        W2 empty = W2.empty();
        empty.setProfileSessionSampleRate(Double.valueOf(l12.f() ? 1.0d : 0.0d));
        c7109j.b(l12.a(), new r3(empty));
    }

    private void b(@NotNull Context context, @NotNull L1 l12, @NotNull io.sentry.android.core.performance.j jVar) {
        s3 s3Var = new s3(Boolean.valueOf(l12.l()), l12.e(), null, Boolean.valueOf(l12.i()), l12.b());
        jVar.t(s3Var);
        boolean booleanValue = s3Var.b().booleanValue();
        C7113n c7113n = this.f66988c;
        if (!booleanValue || !s3Var.e().booleanValue()) {
            c7113n.c(I2.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C2 c22 = new C2();
        C7122x c7122x = new C7122x(context, this.f66989d, new io.sentry.android.core.internal.util.v(context, c7113n, this.f66989d), c7113n, l12.c(), l12.j(), l12.d(), new D3.l(c22));
        jVar.r(null);
        jVar.s(c7122x);
        c7113n.c(I2.DEBUG, "App start profiling started.", new Object[0]);
        c7122x.start();
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        io.sentry.android.core.performance.j m11 = io.sentry.android.core.performance.j.m();
        Context context = getContext();
        m11.n().m(f66985e);
        this.f66989d.getClass();
        m11.h().m(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.f66987b = (Application) context;
        }
        Application application = this.f66987b;
        if (application != null) {
            m11.q(application);
        }
        Context context2 = getContext();
        C7113n c7113n = this.f66988c;
        if (context2 == null) {
            c7113n.c(I2.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (!file.exists() || !file.canRead()) {
            return true;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                L1 l12 = (L1) new C7224y0(W2.empty()).c(bufferedReader, L1.class);
                if (l12 == null) {
                    c7113n.c(I2.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                } else if (l12.g() && l12.k()) {
                    a(context2, l12, m11);
                } else if (!l12.j()) {
                    c7113n.c(I2.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                } else if (l12.h()) {
                    b(context2, l12, m11);
                }
                bufferedReader.close();
                return true;
            } finally {
            }
        } catch (FileNotFoundException e11) {
            c7113n.a(I2.ERROR, "App start profiling config file not found. ", e11);
            return true;
        } catch (Throwable th2) {
            c7113n.a(I2.ERROR, "Error reading app start profiling config file. ", th2);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        InterfaceC7097a0 a11 = io.sentry.android.core.performance.j.f67322r.a();
        try {
            InterfaceC7146g0 f7 = io.sentry.android.core.performance.j.m().f();
            if (f7 != null) {
                f7.close();
            }
            io.sentry.K e11 = io.sentry.android.core.performance.j.m().e();
            if (e11 != null) {
                ((C7109j) e11).a(true);
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
