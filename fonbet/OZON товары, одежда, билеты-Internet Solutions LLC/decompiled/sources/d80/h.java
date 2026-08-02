package d80;

import android.app.Application;
import d40.InterfaceC6083a;

/* loaded from: classes3.dex */
public final class h implements Jb.e<ru.ozon.fintech.features.sharing.presentation.photo.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f61333a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f61334b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<S80.b> f61335c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<U30.a> f61336d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<r90.f> f61337e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<K40.a> f61338f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f61339g;

    public h(Pc.a<Application> aVar, Pc.a<InterfaceC6083a> aVar2, Pc.a<S80.b> aVar3, Pc.a<U30.a> aVar4, Pc.a<r90.f> aVar5, Pc.a<K40.a> aVar6, Pc.a<ru.ozon.fintech.settings.domain.a> aVar7) {
        this.f61333a = aVar;
        this.f61334b = aVar2;
        this.f61335c = aVar3;
        this.f61336d = aVar4;
        this.f61337e = aVar5;
        this.f61338f = aVar6;
        this.f61339g = aVar7;
    }

    @Override // Pc.a
    public final Object get() {
        return new ru.ozon.fintech.features.sharing.presentation.photo.a(this.f61333a.get(), this.f61334b.get(), this.f61335c.get(), this.f61336d.get(), this.f61337e.get(), this.f61338f.get(), this.f61339g.get());
    }
}
