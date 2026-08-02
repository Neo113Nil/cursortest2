package ru.ozon.android.messenger.framework.data.repository;

/* loaded from: classes10.dex */
public final class i0 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88550a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f88551b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.e f88552c;

    public i0(Jb.f fVar, Pc.a aVar) {
        this.f88551b = aVar;
        this.f88552c = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f88550a) {
            case 0:
                return new h0((ru.ozon.android.messenger.framework.data.local.database.c) ((f50.q) this.f88552c).get(), (ru.ozon.android.messenger.framework.data.local.mapper.c) this.f88551b.get(), ru.ozon.android.messenger.framework.di.z.b());
            default:
                return new ru.ozon.android.messenger.framework.domain.usecases.E((ru.ozon.android.messenger.framework.domain.repository.b) this.f88551b.get(), (ru.ozon.android.messenger.framework.analytics.i) ((Jb.f) this.f88552c).get());
        }
    }

    public i0(f50.q qVar, Pc.a aVar, ru.ozon.android.messenger.framework.di.z zVar) {
        this.f88552c = qVar;
        this.f88551b = aVar;
    }
}
