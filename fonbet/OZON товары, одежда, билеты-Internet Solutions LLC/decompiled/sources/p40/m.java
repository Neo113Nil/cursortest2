package p40;

import android.content.Context;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;

/* loaded from: classes3.dex */
public final class m implements Jb.e<l> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Q90.c> f80205a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<K40.a> f80206b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f80207c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Context> f80208d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<R30.a> f80209e;

    /* renamed from: f, reason: collision with root package name */
    private final Jb.f f80210f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f80211g;

    public m(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6) {
        this.f80205a = aVar;
        this.f80206b = aVar2;
        this.f80207c = aVar3;
        this.f80208d = aVar4;
        this.f80209e = aVar5;
        this.f80210f = fVar;
        this.f80211g = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        return new l(this.f80205a.get(), this.f80206b.get(), this.f80207c.get(), this.f80208d.get(), this.f80209e.get(), (N90.a) this.f80210f.get(), this.f80211g.get());
    }
}
