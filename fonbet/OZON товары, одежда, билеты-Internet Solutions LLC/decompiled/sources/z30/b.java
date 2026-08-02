package z30;

import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;

/* loaded from: classes3.dex */
public final class b implements Jb.e<C10979a> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f107204a;

    public b(Jb.f fVar) {
        this.f107204a = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        return new C10979a((ExternalFintechAuth) this.f107204a.get());
    }
}
