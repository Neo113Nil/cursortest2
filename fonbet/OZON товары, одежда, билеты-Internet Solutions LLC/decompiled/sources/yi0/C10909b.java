package yi0;

import Jb.e;
import Jb.f;
import ei0.InterfaceC6369b;
import ij0.d;

/* renamed from: yi0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10909b implements e<C10908a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<d> f106761a;

    /* renamed from: b, reason: collision with root package name */
    private final f f106762b;

    public C10909b(f fVar, Pc.a aVar) {
        this.f106761a = aVar;
        this.f106762b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C10908a(this.f106761a.get(), (InterfaceC6369b) this.f106762b.get());
    }
}
