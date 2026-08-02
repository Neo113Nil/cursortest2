package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k1<V extends AbstractC8015t> implements b1<V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f73793a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73794b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d1<V> f73795c;

    public k1(int i11, int i12, @NotNull E e11) {
        this.f73793a = i11;
        this.f73794b = i12;
        this.f73795c = new d1<>(new K(i11, i12, e11));
    }

    @Override // m0.X0
    @NotNull
    public final V c(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73795c.c(j11, v11, v12, v13);
    }

    @Override // m0.X0
    @NotNull
    public final V d(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73795c.d(j11, v11, v12, v13);
    }

    @Override // m0.b1
    public final int f() {
        return this.f73794b;
    }

    @Override // m0.b1
    public final int g() {
        return this.f73793a;
    }
}
