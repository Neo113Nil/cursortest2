package m0;

import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j1<V extends AbstractC8015t> implements c1<V> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d1<V> f73786a;

    public j1(float f7, float f11, V v11) {
        this.f73786a = new d1<>(v11 != null ? new Y0(f7, f11, v11) : new Z0(f7, f11));
    }

    @Override // m0.c1, m0.X0
    public final boolean a() {
        this.f73786a.getClass();
        return false;
    }

    @Override // m0.X0
    public final long b(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73786a.b(v11, v12, v13);
    }

    @Override // m0.X0
    @NotNull
    public final V c(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73786a.c(j11, v11, v12, v13);
    }

    @Override // m0.X0
    @NotNull
    public final V d(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73786a.d(j11, v11, v12, v13);
    }

    @Override // m0.X0
    @NotNull
    public final V e(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        return this.f73786a.e(v11, v12, v13);
    }
}
