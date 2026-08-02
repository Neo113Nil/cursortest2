package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C4743e3;
import io.sentry.C4777l2;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4765j0;
import io.sentry.InterfaceC4795p0;
import io.sentry.k4;
import io.sentry.l4;
import io.sentry.util.C4843a;
import io.sentry.util.p;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes3.dex */
public final class SentryPerformanceProvider extends AbstractC4715w0 {

    /* renamed from: f, reason: collision with root package name */
    public static final long f50801f = SystemClock.uptimeMillis();

    /* renamed from: b, reason: collision with root package name */
    public Application f50802b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f50803c;

    /* renamed from: d, reason: collision with root package name */
    public final C4683i0 f50804d;

    /* renamed from: e, reason: collision with root package name */
    public final C4843a f50805e = new C4843a();

    public SentryPerformanceProvider() {
        C c10 = new C();
        this.f50803c = c10;
        this.f50804d = new C4683i0(c10);
    }

    public static /* synthetic */ InterfaceC4760i0 a(C4743e3 c4743e3) {
        return c4743e3;
    }

    public static /* synthetic */ InterfaceC4760i0 b(C4743e3 c4743e3) {
        return c4743e3;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    public final void c(Context context, C4777l2 c4777l2, io.sentry.android.core.performance.m mVar) {
        if (!c4777l2.f()) {
            this.f50803c.c(EnumC4788n3.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        final C4743e3 c4743e3 = new C4743e3();
        C4718y c4718y = new C4718y(this.f50804d, new io.sentry.android.core.internal.util.E(context.getApplicationContext(), this.f50803c, this.f50804d), this.f50803c, c4777l2.c(), c4777l2.d(), new p.a() { // from class: io.sentry.android.core.g1
            @Override // io.sentry.util.p.a
            public final Object a() {
                return SentryPerformanceProvider.b(C4743e3.this);
            }
        });
        mVar.H(null);
        mVar.F(c4718y);
        this.f50803c.c(EnumC4788n3.DEBUG, "App start continuous profiling started.", new Object[0]);
        F3 empty = F3.empty();
        empty.setProfileSessionSampleRate(Double.valueOf(c4777l2.f() ? 1.0d : 0.0d));
        c4718y.b(c4777l2.a(), new k4(empty));
    }

    public final void d(Context context, C4777l2 c4777l2, io.sentry.android.core.performance.m mVar) {
        l4 l4Var = new l4(Boolean.valueOf(c4777l2.l()), c4777l2.e(), Boolean.valueOf(c4777l2.i()), c4777l2.b());
        mVar.I(l4Var);
        if (!l4Var.b().booleanValue() || !l4Var.e().booleanValue()) {
            this.f50803c.c(EnumC4788n3.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        final C4743e3 c4743e3 = new C4743e3();
        T t10 = new T(context, this.f50804d, new io.sentry.android.core.internal.util.E(context, this.f50803c, this.f50804d), this.f50803c, c4777l2.c(), c4777l2.j(), c4777l2.d(), new p.a() { // from class: io.sentry.android.core.f1
            @Override // io.sentry.util.p.a
            public final Object a() {
                return SentryPerformanceProvider.a(C4743e3.this);
            }
        });
        mVar.F(null);
        mVar.H(t10);
        this.f50803c.c(EnumC4788n3.DEBUG, "App start profiling started.", new Object[0]);
        t10.start();
    }

    public final void e(io.sentry.android.core.performance.m mVar) {
        Context context = getContext();
        if (context == null) {
            this.f50803c.c(EnumC4788n3.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return;
        }
        File file = new File(M.e(context), "app_start_profiling_config");
        if (file.exists() && file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                try {
                    C4777l2 c4777l2 = (C4777l2) new io.sentry.H0(F3.empty()).c(bufferedReader, C4777l2.class);
                    if (c4777l2 == null) {
                        this.f50803c.c(EnumC4788n3.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                    } else if (c4777l2.g() && c4777l2.k()) {
                        c(context, c4777l2, mVar);
                    } else if (!c4777l2.j()) {
                        this.f50803c.c(EnumC4788n3.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                    } else if (c4777l2.h()) {
                        d(context, c4777l2, mVar);
                    }
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                this.f50803c.b(EnumC4788n3.ERROR, "App start profiling config file not found. ", e10);
            } catch (Throwable th4) {
                this.f50803c.b(EnumC4788n3.ERROR, "Error reading app start profiling config file. ", th4);
            }
        }
    }

    public final void f(Context context, io.sentry.android.core.performance.m mVar) {
        mVar.w().p(f50801f);
        if (this.f50804d.d() >= 24) {
            mVar.o().p(Process.getStartUptimeMillis());
        }
        if (context instanceof Application) {
            this.f50802b = (Application) context;
        }
        Application application = this.f50802b;
        if (application == null) {
            return;
        }
        mVar.B(application);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        io.sentry.android.core.performance.m v10 = io.sentry.android.core.performance.m.v();
        f(getContext(), v10);
        e(v10);
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        InterfaceC4765j0 d10 = io.sentry.android.core.performance.m.f51231A.d();
        try {
            InterfaceC4795p0 k10 = io.sentry.android.core.performance.m.v().k();
            if (k10 != null) {
                k10.close();
            }
            io.sentry.Q h10 = io.sentry.android.core.performance.m.v().h();
            if (h10 != null) {
                h10.a(true);
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
}
