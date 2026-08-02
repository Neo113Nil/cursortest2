package v30;

import r90.InterfaceC9218a;
import s90.C9632a;
import s90.C9633b;

/* loaded from: classes3.dex */
public final class c implements Jb.e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC9218a> f102002a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C9633b> f102003b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<C9632a> f102004c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<s90.g> f102005d;

    public c(Pc.a<InterfaceC9218a> aVar, Pc.a<C9633b> aVar2, Pc.a<C9632a> aVar3, Pc.a<s90.g> aVar4) {
        this.f102002a = aVar;
        this.f102003b = aVar2;
        this.f102004c = aVar3;
        this.f102005d = aVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new b(this.f102002a.get(), this.f102003b.get(), this.f102004c.get(), this.f102005d.get());
    }
}
