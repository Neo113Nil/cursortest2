package io.sentry;

import java.io.IOException;
import java.io.Writer;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7212v0 implements InterfaceC7135d1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.vendor.gson.stream.c f68612a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7208u0 f68613b;

    public C7212v0(@NotNull Writer writer, int i11) {
        this.f68612a = new io.sentry.vendor.gson.stream.c(writer);
        this.f68613b = new C7208u0(i11);
    }

    public final C7212v0 a() throws IOException {
        this.f68612a.beginArray();
        return this;
    }

    public final C7212v0 b() throws IOException {
        this.f68612a.beginObject();
        return this;
    }

    public final C7212v0 c() throws IOException {
        this.f68612a.endArray();
        return this;
    }

    public final C7212v0 d() throws IOException {
        this.f68612a.endObject();
        return this;
    }

    public final String e() {
        return this.f68612a.j();
    }

    public final C7212v0 f() throws IOException {
        this.f68612a.k();
        return this;
    }

    public final C7212v0 g(@NotNull String str) throws IOException {
        this.f68612a.m(str);
        return this;
    }

    public final C7212v0 h() throws IOException {
        this.f68612a.p();
        return this;
    }

    public final void i(String str) {
        this.f68612a.r(str);
    }

    public final void j(boolean z11) {
        this.f68612a.setLenient(z11);
    }

    public final C7212v0 k(double d11) throws IOException {
        this.f68612a.t(d11);
        return this;
    }

    public final C7212v0 l(long j11) throws IOException {
        this.f68612a.v(j11);
        return this;
    }

    public final C7212v0 m(@NotNull ILogger iLogger, Object obj) throws IOException {
        this.f68613b.a(this, iLogger, obj);
        return this;
    }

    public final C7212v0 n(Boolean bool) throws IOException {
        this.f68612a.w(bool);
        return this;
    }

    public final C7212v0 o(Number number) throws IOException {
        this.f68612a.x(number);
        return this;
    }

    public final C7212v0 p(String str) throws IOException {
        this.f68612a.y(str);
        return this;
    }

    public final C7212v0 q(boolean z11) throws IOException {
        this.f68612a.z(z11);
        return this;
    }

    public final void r(@NotNull ILogger iLogger, Object obj) throws IOException {
        this.f68613b.a(this, iLogger, obj);
    }
}
