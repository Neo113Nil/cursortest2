package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f1<V extends AbstractC8015t> implements X0<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b1<V> f73749a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC7987e0 f73750b;

    /* renamed from: c, reason: collision with root package name */
    private final long f73751c;

    /* renamed from: d, reason: collision with root package name */
    private final long f73752d;

    public f1(b1 b1Var, EnumC7987e0 enumC7987e0, long j11) {
        this.f73749a = b1Var;
        this.f73750b = enumC7987e0;
        this.f73751c = (b1Var.g() + b1Var.f()) * 1000000;
        this.f73752d = j11 * 1000000;
    }

    private final long h(long j11) {
        long j12 = this.f73752d;
        if (j11 + j12 <= 0) {
            return 0L;
        }
        long j13 = j11 + j12;
        long j14 = this.f73751c;
        long j15 = j13 / j14;
        return (this.f73750b == EnumC7987e0.Restart || j15 % ((long) 2) == 0) ? j13 - (j15 * j14) : ((j15 + 1) * j14) - j13;
    }

    private final V i(long j11, V v11, V v12, V v13) {
        long j12 = this.f73752d;
        long j13 = j11 + j12;
        long j14 = this.f73751c;
        return j13 > j14 ? this.f73749a.d(j14 - j12, v11, v13, v12) : v12;
    }

    @Override // m0.X0
    public final boolean a() {
        return true;
    }

    @Override // m0.X0
    public final long b(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return Long.MAX_VALUE;
    }

    @Override // m0.X0
    @NotNull
    public final V c(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73749a.c(h(j11), v11, v12, i(j11, v11, v13, v12));
    }

    @Override // m0.X0
    @NotNull
    public final V d(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73749a.d(h(j11), v11, v12, i(j11, v11, v13, v12));
    }
}
