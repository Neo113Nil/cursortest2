package e;

import S0.InterfaceC3978p0;
import Sc.InterfaceC3999a;
import g.AbstractC6592d;
import org.jetbrains.annotations.NotNull;

/* renamed from: e.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6236k<I, O> extends AbstractC6592d<I> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6226a<I> f61704a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC3978p0 f61705b;

    public C6236k(@NotNull C6226a c6226a, @NotNull InterfaceC3978p0 interfaceC3978p0) {
        this.f61704a = c6226a;
        this.f61705b = interfaceC3978p0;
    }

    @Override // g.AbstractC6592d
    public final void a(Object obj) {
        this.f61704a.a(obj);
    }

    @Override // g.AbstractC6592d
    @InterfaceC3999a
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
