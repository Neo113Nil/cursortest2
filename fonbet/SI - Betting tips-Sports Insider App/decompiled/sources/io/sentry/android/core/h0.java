package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.n2;
import java.io.Closeable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static final h0 f15617e = new h0();

    /* renamed from: b, reason: collision with root package name */
    public volatile g0 f15619b;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f15618a = new io.sentry.util.a();

    /* renamed from: c, reason: collision with root package name */
    public final n0 f15620c = new n0();

    /* renamed from: d, reason: collision with root package name */
    public volatile Boolean f15621d = null;

    public final void c(e0 e0Var) {
        io.sentry.r a7 = this.f15618a.a();
        try {
            n(n2.f16660a);
            if (this.f15619b != null) {
                ((f0) this.f15619b.f15585b).add(e0Var);
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        t();
    }

    public final void k(ILogger iLogger) {
        g0 g0Var = this.f15619b;
        if (g0Var != null) {
            try {
                ProcessLifecycleOwner.f2124i.f2130f.a(g0Var);
            } catch (Throwable th2) {
                this.f15619b = null;
                iLogger.e(b5.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th2);
            }
        }
    }

    public final void n(ILogger iLogger) {
        if (this.f15619b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f2124i;
            this.f15619b = new g0(this);
            if (io.sentry.android.core.internal.util.e.f15712a.c()) {
                k(iLogger);
                return;
            }
            n0 n0Var = this.f15620c;
            ((Handler) n0Var.f15782a).post(new androidx.appcompat.app.t(24, this, iLogger));
        } catch (ClassNotFoundException unused) {
            iLogger.h(b5.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th2) {
            iLogger.e(b5.ERROR, "AppState could not register lifecycle observer", th2);
        }
    }

    public final void r(e0 e0Var) {
        io.sentry.r a7 = this.f15618a.a();
        try {
            if (this.f15619b != null) {
                ((f0) this.f15619b.f15585b).remove(e0Var);
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

    public final void t() {
        if (this.f15619b == null) {
            return;
        }
        io.sentry.r a7 = this.f15618a.a();
        try {
            g0 g0Var = this.f15619b;
            ((f0) this.f15619b.f15585b).clear();
            this.f15619b = null;
            a7.close();
            if (io.sentry.android.core.internal.util.e.f15712a.c()) {
                if (g0Var != null) {
                    ProcessLifecycleOwner.f2124i.f2130f.b(g0Var);
                }
            } else {
                n0 n0Var = this.f15620c;
                ((Handler) n0Var.f15782a).post(new f(this, g0Var));
            }
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
