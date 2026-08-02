package p40;

import android.content.Context;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Q90.c> f80168a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<K40.a> f80169b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f80170c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Context> f80171d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<R30.a> f80172e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f80173f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f80174g;

    public f(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6) {
        this.f80168a = aVar;
        this.f80169b = aVar2;
        this.f80170c = aVar3;
        this.f80171d = aVar4;
        this.f80172e = aVar5;
        this.f80173f = fVar;
        this.f80174g = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        return new e(this.f80168a.get(), this.f80169b.get(), this.f80170c.get(), this.f80171d.get(), this.f80172e.get(), (C80.a) this.f80173f.get(), this.f80174g.get());
    }
}
