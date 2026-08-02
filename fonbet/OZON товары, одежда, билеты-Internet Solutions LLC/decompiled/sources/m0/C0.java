package m0;

import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C0<T, V extends AbstractC8015t> implements InterfaceC7992h<T, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X0<V> f73466a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U0<T, V> f73467b;

    /* renamed from: c, reason: collision with root package name */
    private T f73468c;

    /* renamed from: d, reason: collision with root package name */
    private T f73469d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private V f73470e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private V f73471f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final V f73472g;

    /* renamed from: h, reason: collision with root package name */
    private long f73473h;

    /* renamed from: i, reason: collision with root package name */
    private V f73474i;

    public C0() {
        throw null;
    }

    public C0(@NotNull InterfaceC8002m<T> interfaceC8002m, @NotNull U0<T, V> u02, T t2, T t11, V v11) {
        this.f73466a = interfaceC8002m.a(u02);
        this.f73467b = u02;
        this.f73468c = t11;
        this.f73469d = t2;
        this.f73470e = u02.a().invoke(t2);
        this.f73471f = u02.a().invoke(t11);
        this.f73472g = v11 != null ? (V) C8017u.a(v11) : (V) u02.a().invoke(t2).c();
        this.f73473h = -1L;
    }

    @Override // m0.InterfaceC7992h
    public final boolean a() {
        return this.f73466a.a();
    }

    @Override // m0.InterfaceC7992h
    public final long c() {
        if (this.f73473h < 0) {
            this.f73473h = this.f73466a.b(this.f73470e, this.f73471f, this.f73472g);
        }
        return this.f73473h;
    }

    @Override // m0.InterfaceC7992h
    @NotNull
    public final U0<T, V> d() {
        return this.f73467b;
    }

    @Override // m0.InterfaceC7992h
    public final T e(long j11) {
        if (b(j11)) {
            return this.f73468c;
        }
        V c11 = this.f73466a.c(j11, this.f73470e, this.f73471f, this.f73472g);
        int b11 = c11.b();
        for (int i11 = 0; i11 < b11; i11++) {
            if (Float.isNaN(c11.a(i11))) {
                C7985d0.b("AnimationVector cannot contain a NaN. " + c11 + ". Animation: " + this + ", playTimeNanos: " + j11);
                throw null;
            }
        }
        return this.f73467b.b().invoke(c11);
    }

    @Override // m0.InterfaceC7992h
    public final T f() {
        return this.f73468c;
    }

    @Override // m0.InterfaceC7992h
    @NotNull
    public final V g(long j11) {
        if (!b(j11)) {
            return this.f73466a.d(j11, this.f73470e, this.f73471f, this.f73472g);
        }
        V v11 = this.f73474i;
        if (v11 != null) {
            return v11;
        }
        V e11 = this.f73466a.e(this.f73470e, this.f73471f, this.f73472g);
        this.f73474i = e11;
        return e11;
    }

    public final T h() {
        return this.f73469d;
    }

    public final void i(T t2) {
        if (Intrinsics.d(t2, this.f73469d)) {
            return;
        }
        this.f73469d = t2;
        this.f73470e = this.f73467b.a().invoke(t2);
        this.f73474i = null;
        this.f73473h = -1L;
    }

    public final void j(T t2) {
        if (Intrinsics.d(this.f73468c, t2)) {
            return;
        }
        this.f73468c = t2;
        this.f73471f = this.f73467b.a().invoke(t2);
        this.f73474i = null;
        this.f73473h = -1L;
    }

    @NotNull
    public final String toString() {
        return "TargetBasedAnimation: " + this.f73469d + " -> " + this.f73468c + ",initial velocity: " + this.f73472g + ", duration: " + C7996j.b(this) + " ms,animationSpec: " + this.f73466a;
    }
}
