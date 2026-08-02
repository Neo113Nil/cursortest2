package m0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class N<T> implements InterfaceC8002m<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D<T> f73559a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC7987e0 f73560b;

    /* renamed from: c, reason: collision with root package name */
    private final long f73561c;

    private N() {
        throw null;
    }

    public N(D d11, EnumC7987e0 enumC7987e0, long j11) {
        this.f73559a = d11;
        this.f73560b = enumC7987e0;
        this.f73561c = j11;
    }

    @Override // m0.InterfaceC8002m
    @NotNull
    public final <V extends AbstractC8015t> X0<V> a(@NotNull U0<T, V> u02) {
        return new f1(this.f73559a.a((U0) u02), this.f73560b, this.f73561c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n11 = (N) obj;
            if (Intrinsics.d(n11.f73559a, this.f73559a) && n11.f73560b == this.f73560b && n11.f73561c == this.f73561c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f73561c) + ((this.f73560b.hashCode() + (this.f73559a.hashCode() * 31)) * 31);
    }
}
