package io.sentry;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7175n1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private io.sentry.protocol.t f68115a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private l3 f68116b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7133d f68117c;

    public C7175n1() {
        this(new io.sentry.protocol.t(), new l3(), null);
    }

    @NotNull
    public final C7133d a() {
        return this.f68117c;
    }

    @NotNull
    public final Double b() {
        Double d11 = this.f68117c.d();
        return Double.valueOf(d11 == null ? 0.0d : d11.doubleValue());
    }

    @NotNull
    public final l3 c() {
        return this.f68116b;
    }

    @NotNull
    public final io.sentry.protocol.t d() {
        return this.f68115a;
    }

    @NotNull
    public final j3 e() {
        j3 j3Var = new j3(this.f68115a, this.f68116b, "default", null);
        j3Var.f68024i = "auto";
        return j3Var;
    }

    public final q3 f() {
        return this.f68117c.l();
    }

    public C7175n1(@NotNull io.sentry.protocol.t tVar, @NotNull l3 l3Var, C7133d c7133d) {
        this.f68115a = tVar;
        this.f68116b = l3Var;
        this.f68117c = io.sentry.util.y.a(c7133d, null, null, null);
    }

    public C7175n1(@NotNull C7175n1 c7175n1) {
        this(c7175n1.f68115a, c7175n1.f68116b, c7175n1.f68117c);
    }
}
