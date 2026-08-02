package io.sentry.android.ndk;

import androidx.appcompat.app.t;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.f;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.e;
import io.sentry.n6;
import io.sentry.ndk.NativeScope;
import io.sentry.s3;
import io.sentry.v3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends v3 {

    /* renamed from: a, reason: collision with root package name */
    public final b6 f15919a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeScope f15920b;

    public c(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        y4.a.C(sentryAndroidOptions, "The SentryOptions object is required.");
        this.f15919a = sentryAndroidOptions;
        this.f15920b = nativeScope;
    }

    @Override // io.sentry.a1
    public final void c(e eVar) {
        b6 b6Var = this.f15919a;
        try {
            b6Var.getExecutorService().submit(new t(26, this, eVar));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.a1
    public final void d(n6 n6Var, s3 s3Var) {
        b6 b6Var = this.f15919a;
        if (n6Var == null) {
            return;
        }
        try {
            b6Var.getExecutorService().submit(new t(27, this, n6Var));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void f(String str, String str2) {
        b6 b6Var = this.f15919a;
        try {
            b6Var.getExecutorService().submit(new androidx.fragment.app.d(this, str, str2, 16));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void i(String str) {
        b6 b6Var = this.f15919a;
        try {
            b6Var.getExecutorService().submit(new b(this, str, 0));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void j() {
        b6 b6Var = this.f15919a;
        try {
            b6Var.getExecutorService().submit(new f(5, this));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Scope sync removeExtra(%s) has an error.", "sessionURL");
        }
    }

    @Override // io.sentry.v3, io.sentry.a1
    public final void o(String str) {
        b6 b6Var = this.f15919a;
        try {
            b6Var.getExecutorService().submit(new b(this, str, 1));
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Scope sync setExtra(%s) has an error.", "sessionURL");
        }
    }
}
