package e90;

import Jb.e;
import Jb.f;
import b90.C5594a;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: e90.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6322b implements e<C6321a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<C5594a> f62046a;

    /* renamed from: b, reason: collision with root package name */
    private final f f62047b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<S30.a> f62048c;

    public C6322b(f fVar, Pc.a aVar, Pc.a aVar2) {
        this.f62046a = aVar;
        this.f62047b = fVar;
        this.f62048c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new C6321a(this.f62046a.get(), (ExternalNetworkSettings) this.f62047b.get(), this.f62048c.get());
    }
}
