package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import io.sentry.EnumC7162k0;
import io.sentry.InterfaceC7134d0;
import io.sentry.T1;
import io.sentry.android.core.C7111l;
import io.sentry.n3;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f67311a;

    /* renamed from: b, reason: collision with root package name */
    private T1 f67312b = null;

    /* renamed from: c, reason: collision with root package name */
    private T1 f67313c = null;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7134d0 f67314d = null;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC7134d0 f67315e = null;

    public b(@NotNull String str) {
        this.f67311a = str;
    }

    @NotNull
    private static InterfaceC7134d0 d(@NotNull InterfaceC7134d0 interfaceC7134d0, @NotNull String str, @NotNull T1 t12) {
        InterfaceC7134d0 g10 = interfaceC7134d0.g(str, t12, EnumC7162k0.SENTRY);
        g10.c(Long.valueOf(io.sentry.android.core.internal.util.d.e(Looper.getMainLooper().getThread())), "thread.id");
        g10.c("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        g10.c(bool, "ui.contributes_to_ttid");
        g10.c(bool, "ui.contributes_to_ttfd");
        return g10;
    }

    public final void a() {
        InterfaceC7134d0 interfaceC7134d0 = this.f67314d;
        if (interfaceC7134d0 != null && !interfaceC7134d0.h()) {
            this.f67314d.n(n3.CANCELLED);
        }
        this.f67314d = null;
        InterfaceC7134d0 interfaceC7134d02 = this.f67315e;
        if (interfaceC7134d02 != null && !interfaceC7134d02.h()) {
            this.f67315e.n(n3.CANCELLED);
        }
        this.f67315e = null;
    }

    public final void b(InterfaceC7134d0 interfaceC7134d0) {
        if (this.f67312b == null || interfaceC7134d0 == null) {
            return;
        }
        InterfaceC7134d0 d11 = d(interfaceC7134d0, this.f67311a.concat(".onCreate"), this.f67312b);
        this.f67314d = d11;
        d11.finish();
    }

    public final void c(InterfaceC7134d0 interfaceC7134d0) {
        if (this.f67313c == null || interfaceC7134d0 == null) {
            return;
        }
        InterfaceC7134d0 d11 = d(interfaceC7134d0, this.f67311a.concat(".onStart"), this.f67313c);
        this.f67315e = d11;
        d11.finish();
    }

    public final void e() {
        InterfaceC7134d0 interfaceC7134d0 = this.f67314d;
        if (interfaceC7134d0 == null || this.f67315e == null) {
            return;
        }
        T1 r11 = interfaceC7134d0.r();
        T1 r12 = this.f67315e.r();
        if (r11 == null || r12 == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        T1 a11 = C7111l.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(a11.b(this.f67314d.s()));
        long millis2 = timeUnit.toMillis(a11.b(r11));
        long millis3 = timeUnit.toMillis(a11.b(this.f67315e.s()));
        long millis4 = timeUnit.toMillis(a11.b(r12));
        c cVar = new c();
        cVar.a().n(timeUnit.toMillis(this.f67314d.s().d()), uptimeMillis - millis, uptimeMillis - millis2, this.f67314d.getDescription());
        cVar.b().n(timeUnit.toMillis(this.f67315e.s().d()), uptimeMillis - millis3, uptimeMillis - millis4, this.f67315e.getDescription());
        j.m().c(cVar);
    }

    public final void f(@NotNull T1 t12) {
        this.f67312b = t12;
    }

    public final void g(@NotNull T1 t12) {
        this.f67313c = t12;
    }
}
