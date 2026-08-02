package m0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: m0.r0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8012r0<T> implements InterfaceC8002m<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final H f73857a;

    /* renamed from: b, reason: collision with root package name */
    private final long f73858b;

    public C8012r0(@NotNull H h11, long j11) {
        this.f73857a = h11;
        this.f73858b = j11;
    }

    @Override // m0.InterfaceC8002m
    @NotNull
    public final <V extends AbstractC8015t> X0<V> a(@NotNull U0<T, V> u02) {
        return new C8014s0(this.f73857a.a(u02), this.f73858b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8012r0)) {
            return false;
        }
        C8012r0 c8012r0 = (C8012r0) obj;
        return c8012r0.f73858b == this.f73858b && Intrinsics.d(c8012r0.f73857a, this.f73857a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f73858b) + (this.f73857a.hashCode() * 31);
    }
}
