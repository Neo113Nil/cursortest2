package u1;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements InterfaceC9921b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<C9920a, Boolean> f99739a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99740b;

    public c(int i11, Function1 function1) {
        C3991w0 f7;
        this.f99739a = function1;
        f7 = n1.f(C9920a.a(i11), D1.f25195a);
        this.f99740b = f7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u1.InterfaceC9921b
    public final int a() {
        return ((C9920a) this.f99740b.getValue()).b();
    }

    public final void b(int i11) {
        this.f99740b.setValue(C9920a.a(i11));
    }
}
