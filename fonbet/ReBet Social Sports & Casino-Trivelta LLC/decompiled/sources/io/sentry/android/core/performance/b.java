package io.sentry.android.core.performance;

import android.os.Looper;
import android.os.SystemClock;
import io.sentry.AbstractC4856v2;
import io.sentry.EnumC4832t0;
import io.sentry.InterfaceC4780m0;
import io.sentry.android.core.A;
import io.sentry.f4;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f51221a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC4856v2 f51222b = null;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC4856v2 f51223c = null;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC4780m0 f51224d = null;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4780m0 f51225e = null;

    public b(String str) {
        this.f51221a = str;
    }

    public void a() {
        InterfaceC4780m0 interfaceC4780m0 = this.f51224d;
        if (interfaceC4780m0 != null && !interfaceC4780m0.d()) {
            this.f51224d.l(f4.CANCELLED);
        }
        this.f51224d = null;
        InterfaceC4780m0 interfaceC4780m02 = this.f51225e;
        if (interfaceC4780m02 != null && !interfaceC4780m02.d()) {
            this.f51225e.l(f4.CANCELLED);
        }
        this.f51225e = null;
    }

    public void b(InterfaceC4780m0 interfaceC4780m0) {
        if (this.f51222b == null || interfaceC4780m0 == null) {
            return;
        }
        InterfaceC4780m0 d10 = d(interfaceC4780m0, this.f51221a + ".onCreate", this.f51222b);
        this.f51224d = d10;
        d10.g();
    }

    public void c(InterfaceC4780m0 interfaceC4780m0) {
        if (this.f51223c == null || interfaceC4780m0 == null) {
            return;
        }
        InterfaceC4780m0 d10 = d(interfaceC4780m0, this.f51221a + ".onStart", this.f51223c);
        this.f51225e = d10;
        d10.g();
    }

    public final InterfaceC4780m0 d(InterfaceC4780m0 interfaceC4780m0, String str, AbstractC4856v2 abstractC4856v2) {
        InterfaceC4780m0 n10 = interfaceC4780m0.n("activity.load", str, abstractC4856v2, EnumC4832t0.SENTRY);
        f(n10);
        return n10;
    }

    public void e() {
        InterfaceC4780m0 interfaceC4780m0 = this.f51224d;
        if (interfaceC4780m0 == null || this.f51225e == null) {
            return;
        }
        AbstractC4856v2 s10 = interfaceC4780m0.s();
        AbstractC4856v2 s11 = this.f51225e.s();
        if (s10 == null || s11 == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AbstractC4856v2 a10 = A.a();
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long millis = timeUnit.toMillis(a10.b(this.f51224d.u()));
        long millis2 = timeUnit.toMillis(a10.b(s10));
        long millis3 = timeUnit.toMillis(a10.b(this.f51225e.u()));
        long millis4 = timeUnit.toMillis(a10.b(s11));
        c cVar = new c();
        cVar.b().r(this.f51224d.getDescription(), timeUnit.toMillis(this.f51224d.u().f()), uptimeMillis - millis, uptimeMillis - millis2);
        cVar.c().r(this.f51225e.getDescription(), timeUnit.toMillis(this.f51225e.u().f()), uptimeMillis - millis3, uptimeMillis - millis4);
        m.v().d(cVar);
    }

    public final void f(InterfaceC4780m0 interfaceC4780m0) {
        interfaceC4780m0.k("thread.id", Long.valueOf(io.sentry.android.core.internal.util.k.f(Looper.getMainLooper().getThread())));
        interfaceC4780m0.k("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        interfaceC4780m0.k("ui.contributes_to_ttid", bool);
        interfaceC4780m0.k("ui.contributes_to_ttfd", bool);
    }

    public void g(AbstractC4856v2 abstractC4856v2) {
        this.f51222b = abstractC4856v2;
    }

    public void h(AbstractC4856v2 abstractC4856v2) {
        this.f51223c = abstractC4856v2;
    }
}
