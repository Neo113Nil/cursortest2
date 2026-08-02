package m0;

import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8014s0<V extends AbstractC8015t> implements X0<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X0<V> f73864a;

    /* renamed from: b, reason: collision with root package name */
    private final long f73865b;

    public C8014s0(@NotNull X0<V> x02, long j11) {
        this.f73864a = x02;
        this.f73865b = j11;
    }

    @Override // m0.X0
    public final boolean a() {
        return this.f73864a.a();
    }

    @Override // m0.X0
    public final long b(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73864a.b(v11, v12, v13) + this.f73865b;
    }

    @Override // m0.X0
    @NotNull
    public final V c(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        long j12 = this.f73865b;
        return j11 < j12 ? v11 : this.f73864a.c(j11 - j12, v11, v12, v13);
    }

    @Override // m0.X0
    @NotNull
    public final V d(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        long j12 = this.f73865b;
        return j11 < j12 ? v13 : this.f73864a.d(j11 - j12, v11, v12, v13);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8014s0)) {
            return false;
        }
        C8014s0 c8014s0 = (C8014s0) obj;
        return c8014s0.f73865b == this.f73865b && Intrinsics.d(c8014s0.f73864a, this.f73864a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f73865b) + (this.f73864a.hashCode() * 31);
    }
}
