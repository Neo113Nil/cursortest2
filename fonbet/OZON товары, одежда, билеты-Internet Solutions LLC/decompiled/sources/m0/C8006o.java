package m0;

import S0.A1;
import S0.C3991w0;
import S0.D1;
import S0.n1;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8006o<T, V extends AbstractC8015t> implements A1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final U0<T, V> f73832a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73833b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private V f73834c;

    /* renamed from: d, reason: collision with root package name */
    private long f73835d;

    /* renamed from: e, reason: collision with root package name */
    private long f73836e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f73837f;

    public /* synthetic */ C8006o(U0 u02, Object obj, AbstractC8015t abstractC8015t, int i11) {
        this(u02, obj, (i11 & 4) != 0 ? null : abstractC8015t, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void A(@NotNull V v11) {
        this.f73834c = v11;
    }

    public final long b() {
        return this.f73836e;
    }

    @Override // S0.A1
    public final T getValue() {
        return this.f73833b.getValue();
    }

    public final long k() {
        return this.f73835d;
    }

    @NotNull
    public final U0<T, V> m() {
        return this.f73832a;
    }

    public final T o() {
        return this.f73832a.b().invoke(this.f73834c);
    }

    @NotNull
    public final V s() {
        return this.f73834c;
    }

    @NotNull
    public final String toString() {
        return "AnimationState(value=" + this.f73833b.getValue() + ", velocity=" + o() + ", isRunning=" + this.f73837f + ", lastFrameTimeNanos=" + this.f73835d + ", finishedTimeNanos=" + this.f73836e + ')';
    }

    public final boolean v() {
        return this.f73837f;
    }

    public final void w(long j11) {
        this.f73836e = j11;
    }

    public final void x(long j11) {
        this.f73835d = j11;
    }

    public final void y(boolean z11) {
        this.f73837f = z11;
    }

    public final void z(T t2) {
        this.f73833b.setValue(t2);
    }

    public C8006o(@NotNull U0<T, V> u02, T t2, V v11, long j11, long j12, boolean z11) {
        C3991w0 f7;
        V invoke;
        this.f73832a = u02;
        f7 = n1.f(t2, D1.f25195a);
        this.f73833b = f7;
        if (v11 != null) {
            invoke = (V) C8017u.a(v11);
        } else {
            invoke = u02.a().invoke(t2);
            invoke.d();
        }
        this.f73834c = invoke;
        this.f73835d = j11;
        this.f73836e = j12;
        this.f73837f = z11;
    }
}
