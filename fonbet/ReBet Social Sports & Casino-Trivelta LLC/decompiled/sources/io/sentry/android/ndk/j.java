package io.sentry.android.ndk;

import io.sentry.AbstractC4779m;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4730c0;
import io.sentry.O1;
import io.sentry.a4;
import io.sentry.ndk.NativeScope;
import io.sentry.protocol.F;
import io.sentry.util.w;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j extends O1 {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51406a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.ndk.a f51407b;

    public j(F3 f32) {
        this(f32, new NativeScope());
    }

    public static /* synthetic */ void o(j jVar, F f10) {
        if (f10 == null) {
            jVar.f51407b.d();
        } else {
            jVar.f51407b.h(f10.i(), f10.h(), f10.j(), f10.k());
        }
    }

    public static /* synthetic */ void r(j jVar, C4744f c4744f) {
        jVar.getClass();
        String str = null;
        String lowerCase = c4744f.m() != null ? c4744f.m().name().toLowerCase(Locale.ROOT) : null;
        String g10 = AbstractC4779m.g(c4744f.q());
        try {
            Map l10 = c4744f.l();
            if (!l10.isEmpty()) {
                str = jVar.f51406a.getSerializer().f(l10);
            }
        } catch (Throwable th2) {
            jVar.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Breadcrumb data is not serializable.", new Object[0]);
        }
        jVar.f51407b.b(lowerCase, c4744f.n(), c4744f.j(), c4744f.r(), g10, str);
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void a(final String str) {
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.g
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f51407b.a(str);
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void c(final String str) {
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.e
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f51407b.c(str);
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.InterfaceC4735d0
    public void d(final C4744f c4744f) {
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.c
                @Override // java.lang.Runnable
                public final void run() {
                    j.r(j.this, c4744f);
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void e(final String str, final String str2) {
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.f
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f51407b.e(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void f(final String str, final String str2) {
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.d
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f51407b.f(str, str2);
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.O1, io.sentry.InterfaceC4735d0
    public void g() {
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f51407b.g();
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync clearAttachments has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC4735d0
    public void i(final a4 a4Var, InterfaceC4730c0 interfaceC4730c0) {
        if (a4Var == null) {
            return;
        }
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.this.f51407b.i(r1.q().toString(), a4Var.n().toString());
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC4735d0
    public void j(final F f10) {
        try {
            this.f51406a.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.ndk.b
                @Override // java.lang.Runnable
                public final void run() {
                    j.o(j.this, f10);
                }
            });
        } catch (Throwable th2) {
            this.f51406a.getLogger().a(EnumC4788n3.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    public j(F3 f32, io.sentry.ndk.a aVar) {
        this.f51406a = (F3) w.c(f32, "The SentryOptions object is required.");
        this.f51407b = (io.sentry.ndk.a) w.c(aVar, "The NativeScope object is required.");
    }
}
