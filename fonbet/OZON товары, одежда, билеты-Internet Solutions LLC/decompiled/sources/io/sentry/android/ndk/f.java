package io.sentry.android.ndk;

import L3.B;
import L3.H;
import io.sentry.AbstractC7221x1;
import io.sentry.C7141f;
import io.sentry.C7209u1;
import io.sentry.I2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.j3;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.E;
import io.sentry.util.p;
import java.util.Locale;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f extends AbstractC7221x1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67414a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final NativeScope f67415b;

    public f(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        p.b(sentryAndroidOptions, "The SentryOptions object is required.");
        this.f67414a = sentryAndroidOptions;
        this.f67415b = nativeScope;
    }

    public static void n(f fVar, E e11) {
        NativeScope nativeScope = fVar.f67415b;
        String j11 = e11.j();
        String i11 = e11.i();
        String k11 = e11.k();
        String l11 = e11.l();
        nativeScope.getClass();
        NativeScope.nativeSetUser(j11, i11, k11, l11);
    }

    public static void q(f fVar, String str, String str2) {
        fVar.f67415b.getClass();
        NativeScope.nativeSetExtra(str, str2);
    }

    public static void r(f fVar, String str) {
        fVar.f67415b.getClass();
        NativeScope.nativeRemoveExtra(str);
    }

    public static void s(f fVar, C7141f c7141f) {
        SentryAndroidOptions sentryAndroidOptions = fVar.f67414a;
        String str = null;
        String lowerCase = c7141f.j() != null ? c7141f.j().name().toLowerCase(Locale.ROOT) : null;
        String b11 = io.sentry.vendor.gson.internal.bind.util.a.b(c7141f.l());
        try {
            Map<String, Object> i11 = c7141f.i();
            if (!i11.isEmpty()) {
                str = sentryAndroidOptions.getSerializer().e(i11);
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
        }
        String str2 = str;
        String k11 = c7141f.k();
        String h11 = c7141f.h();
        String m11 = c7141f.m();
        fVar.f67415b.getClass();
        NativeScope.nativeAddBreadcrumb(lowerCase, k11, h11, m11, b11, str2);
    }

    public static void t(f fVar, j3 j3Var) {
        fVar.getClass();
        String tVar = j3Var.o().toString();
        String l3Var = j3Var.l().toString();
        fVar.f67415b.getClass();
        NativeScope.nativeSetTrace(tVar, l3Var);
    }

    public static void u(f fVar, String str, String str2) {
        fVar.f67415b.getClass();
        NativeScope.nativeSetTag(str, str2);
    }

    public static void v(f fVar, String str) {
        fVar.f67415b.getClass();
        NativeScope.nativeRemoveTag(str);
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void b(@NotNull String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f67414a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new e(this, str));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void c(@NotNull final String str, @NotNull final String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.f67414a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.q(f.this, str, str2);
                }
            });
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.V
    public final void d(E e11) {
        SentryAndroidOptions sentryAndroidOptions = this.f67414a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new H(1, this, e11));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.V
    public final void f(@NotNull C7141f c7141f) {
        SentryAndroidOptions sentryAndroidOptions = this.f67414a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new b(0, this, c7141f));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.V
    public final void i(j3 j3Var, @NotNull C7209u1 c7209u1) {
        SentryAndroidOptions sentryAndroidOptions = this.f67414a;
        if (j3Var == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new B(1, this, j3Var));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void l(@NotNull String str) {
        SentryAndroidOptions sentryAndroidOptions = this.f67414a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new Nu.a(3, this, str));
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.AbstractC7221x1, io.sentry.V
    public final void setTag(@NotNull final String str, @NotNull final String str2) {
        SentryAndroidOptions sentryAndroidOptions = this.f67414a;
        try {
            sentryAndroidOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.u(f.this, str, str2);
                }
            });
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().b(I2.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }
}
