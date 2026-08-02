package m70;

import Jb.e;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import x40.C10656a;

/* renamed from: m70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8102b implements e<C8101a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f74626a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f74627b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<V60.a> f74628c;

    /* renamed from: d, reason: collision with root package name */
    private final Pa0.e f74629d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f74630e;

    public C8102b(Pa0.e eVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f74626a = aVar;
        this.f74627b = aVar2;
        this.f74628c = aVar3;
        this.f74629d = eVar;
        this.f74630e = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new C8101a(this.f74626a.get(), this.f74627b.get(), this.f74628c.get(), (C10656a) this.f74629d.get(), this.f74630e.get());
    }
}
