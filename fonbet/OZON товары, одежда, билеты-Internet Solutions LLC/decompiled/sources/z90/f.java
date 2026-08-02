package z90;

import android.app.Application;
import android.content.Context;
import d40.InterfaceC6083a;

/* loaded from: classes3.dex */
public final class f implements Jb.e<e> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f107396a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f107397b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f107398c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f107399d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<K40.a> f107400e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<Context> f107401f;

    public f(Pc.a<Application> aVar, Pc.a<S80.b> aVar2, Pc.a<ru.ozon.fintech.settings.domain.a> aVar3, Pc.a<InterfaceC6083a> aVar4, Pc.a<K40.a> aVar5, Pc.a<Context> aVar6) {
        this.f107396a = aVar;
        this.f107397b = aVar2;
        this.f107398c = aVar3;
        this.f107399d = aVar4;
        this.f107400e = aVar5;
        this.f107401f = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        return new e(this.f107396a.get(), this.f107397b.get(), this.f107398c.get(), this.f107399d.get(), this.f107400e.get(), this.f107401f.get());
    }
}
