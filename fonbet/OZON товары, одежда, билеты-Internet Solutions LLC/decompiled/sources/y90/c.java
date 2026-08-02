package y90;

import Jb.e;
import v30.d;

/* loaded from: classes3.dex */
public final class c implements e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<d> f106373a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f106374b;

    public c(Pc.a<d> aVar, Pc.a<S80.b> aVar2) {
        this.f106373a = aVar;
        this.f106374b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f106373a.get(), this.f106374b.get());
    }
}
