package io.sentry.cache;

import io.sentry.F3;
import io.sentry.InterfaceC4859w0;
import io.sentry.X;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h implements X {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51932a;

    public h(F3 f32) {
        this.f51932a = f32;
    }

    public static Object i(F3 f32, String str, Class cls) {
        return j(f32, str, cls, null);
    }

    public static Object j(F3 f32, String str, Class cls, InterfaceC4859w0 interfaceC4859w0) {
        return d.c(f32, ".options-cache", str, cls, interfaceC4859w0);
    }

    public final void a(String str) {
        d.a(this.f51932a, ".options-cache", str);
    }

    @Override // io.sentry.X
    public void b(Map map) {
        k(map, "tags.json");
    }

    @Override // io.sentry.X
    public void c(String str) {
        if (str == null) {
            a("dist.json");
        } else {
            k(str, "dist.json");
        }
    }

    @Override // io.sentry.X
    public void d(Double d10) {
        if (d10 == null) {
            a("replay-error-sample-rate.json");
        } else {
            k(d10.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.X
    public void e(String str) {
        if (str == null) {
            a("environment.json");
        } else {
            k(str, "environment.json");
        }
    }

    @Override // io.sentry.X
    public void f(String str) {
        if (str == null) {
            a("proguard-uuid.json");
        } else {
            k(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.X
    public void g(io.sentry.protocol.s sVar) {
        if (sVar == null) {
            a("sdk-version.json");
        } else {
            k(sVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.X
    public void h(String str) {
        if (str == null) {
            a("release.json");
        } else {
            k(str, "release.json");
        }
    }

    public final void k(Object obj, String str) {
        d.d(this.f51932a, obj, ".options-cache", str);
    }
}
