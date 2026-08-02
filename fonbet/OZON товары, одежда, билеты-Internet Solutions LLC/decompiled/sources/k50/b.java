package k50;

import Jb.e;
import d40.InterfaceC6083a;
import j50.InterfaceC7285a;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class b implements e<C7594a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f70912a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C10656a> f70913b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC7285a> f70914c;

    public b(Pc.a<InterfaceC6083a> aVar, Pc.a<C10656a> aVar2, Pc.a<InterfaceC7285a> aVar3) {
        this.f70912a = aVar;
        this.f70913b = aVar2;
        this.f70914c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new C7594a(this.f70912a.get(), this.f70913b.get(), this.f70914c.get());
    }
}
