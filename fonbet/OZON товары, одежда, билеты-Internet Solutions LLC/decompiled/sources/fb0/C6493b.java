package fb0;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import db0.InterfaceC6135a;
import org.jetbrains.annotations.NotNull;

/* renamed from: fb0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6493b<State> implements InterfaceC6492a<State> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x0<State> f63064a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M0<State> f63065b;

    public C6493b(InterfaceC6135a.b bVar) {
        x0<State> a11 = O0.a(bVar);
        this.f63064a = a11;
        this.f63065b = C2399j.b(a11);
    }

    @Override // fb0.InterfaceC6492a
    public final void a(InterfaceC6135a.C0956a c0956a) {
        this.f63064a.tryEmit(c0956a);
    }

    @Override // fb0.InterfaceC6492a
    @NotNull
    public final M0<State> getState() {
        return this.f63065b;
    }
}
