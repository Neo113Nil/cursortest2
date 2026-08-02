package e50;

import x40.C10656a;

/* loaded from: classes3.dex */
public final class c implements Jb.e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C10656a> f62011a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f62012b;

    public c(Pc.a<C10656a> aVar, Pc.a<S80.b> aVar2) {
        this.f62011a = aVar;
        this.f62012b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f62011a.get(), this.f62012b.get());
    }
}
