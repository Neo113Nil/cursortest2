package f30;

import i30.C7004a;
import i30.C7005b;
import m90.C8110a;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;

/* loaded from: classes3.dex */
public final class c implements Jb.e<b> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f62508a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f62509b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f62510c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.f f62511d;

    public c(Jb.f fVar, Jb.f fVar2, Jb.f fVar3, Jb.f fVar4) {
        this.f62508a = fVar;
        this.f62509b = fVar2;
        this.f62510c = fVar3;
        this.f62511d = fVar4;
    }

    @Override // Pc.a
    public final Object get() {
        return new b((AnalyticsConfig) this.f62508a.get(), (C7004a) this.f62509b.get(), (C8110a) this.f62510c.get(), (C7005b) this.f62511d.get());
    }
}
