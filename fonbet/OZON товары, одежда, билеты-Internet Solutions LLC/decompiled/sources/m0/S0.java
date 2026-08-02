package m0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class S0<S> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f73604a;

    public S0(int i11) {
        C3991w0 f7;
        f7 = n1.f(Boolean.FALSE, D1.f25195a);
        this.f73604a = f7;
    }

    public abstract S a();

    public abstract S b();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f73604a.getValue()).booleanValue();
    }

    public abstract void d(S s11);

    public final void e(boolean z11) {
        this.f73604a.setValue(Boolean.valueOf(z11));
    }

    public abstract void f(@NotNull D0<S> d02);

    public abstract void g();
}
