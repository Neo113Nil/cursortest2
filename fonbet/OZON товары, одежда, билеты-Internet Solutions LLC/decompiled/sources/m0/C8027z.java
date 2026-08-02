package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8027z<T, V extends AbstractC8015t> implements InterfaceC7992h<T, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1<V> f73916a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final U0<T, V> f73917b;

    /* renamed from: c, reason: collision with root package name */
    private final T f73918c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final V f73919d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final V f73920e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final V f73921f;

    /* renamed from: g, reason: collision with root package name */
    private final T f73922g;

    /* renamed from: h, reason: collision with root package name */
    private final long f73923h;

    public C8027z(@NotNull InterfaceC7976A<T> interfaceC7976A, @NotNull U0<T, V> u02, T t2, @NotNull V v11) {
        a1<V> a11 = interfaceC7976A.a();
        this.f73916a = a11;
        this.f73917b = u02;
        this.f73918c = t2;
        V invoke = u02.a().invoke(t2);
        this.f73919d = invoke;
        this.f73920e = (V) C8017u.a(v11);
        e1 e1Var = (e1) a11;
        this.f73922g = (T) u02.b().invoke(e1Var.e(invoke, v11));
        long d11 = e1Var.d(invoke, v11);
        this.f73923h = d11;
        V v12 = (V) C8017u.a(e1Var.c(d11, invoke, v11));
        this.f73921f = v12;
        int b11 = v12.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v13 = this.f73921f;
            v13.e(kotlin.ranges.h.d(v13.a(i11), -this.f73916a.a(), this.f73916a.a()), i11);
        }
    }

    @Override // m0.InterfaceC7992h
    public final boolean a() {
        return false;
    }

    @Override // m0.InterfaceC7992h
    public final long c() {
        return this.f73923h;
    }

    @Override // m0.InterfaceC7992h
    @NotNull
    public final U0<T, V> d() {
        return this.f73917b;
    }

    @Override // m0.InterfaceC7992h
    public final T e(long j11) {
        if (b(j11)) {
            return this.f73922g;
        }
        return (T) this.f73917b.b().invoke(this.f73916a.b(j11, this.f73919d, this.f73920e));
    }

    @Override // m0.InterfaceC7992h
    public final T f() {
        return this.f73922g;
    }

    @Override // m0.InterfaceC7992h
    @NotNull
    public final V g(long j11) {
        if (b(j11)) {
            return this.f73921f;
        }
        return this.f73916a.c(j11, this.f73919d, this.f73920e);
    }
}
