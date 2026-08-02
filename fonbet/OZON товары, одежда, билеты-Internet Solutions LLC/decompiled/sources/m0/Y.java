package m0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Y<S> extends S0<S> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73644b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73645c;

    public Y(S s11) {
        super(0);
        C3991w0 f7;
        C3991w0 f11;
        f7 = n1.f(s11, D1.f25195a);
        this.f73644b = f7;
        f11 = n1.f(s11, D1.f25195a);
        this.f73645c = f11;
    }

    @Override // m0.S0
    public final S a() {
        return (S) this.f73644b.getValue();
    }

    @Override // m0.S0
    public final S b() {
        return (S) this.f73645c.getValue();
    }

    @Override // m0.S0
    public final void d(S s11) {
        this.f73644b.setValue(s11);
    }

    @Override // m0.S0
    public final void f(@NotNull D0<S> d02) {
    }

    @Override // m0.S0
    public final void g() {
    }

    public final boolean h() {
        return Intrinsics.d(this.f73644b.getValue(), this.f73645c.getValue()) && !c();
    }

    public final void i(Boolean bool) {
        this.f73645c.setValue(bool);
    }
}
