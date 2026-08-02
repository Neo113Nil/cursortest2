package n40;

import Jb.e;
import Jb.f;
import l90.C7901a;

/* loaded from: classes3.dex */
public final class b implements e<C8440a> {

    /* renamed from: a, reason: collision with root package name */
    private final f f76484a;

    /* renamed from: b, reason: collision with root package name */
    private final f f76485b;

    /* renamed from: c, reason: collision with root package name */
    private final f f76486c;

    public b(f fVar, f fVar2, f fVar3) {
        this.f76484a = fVar;
        this.f76485b = fVar2;
        this.f76486c = fVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new C8440a((C7901a) this.f76484a.get(), (C80.a) this.f76485b.get(), (N90.a) this.f76486c.get());
    }
}
