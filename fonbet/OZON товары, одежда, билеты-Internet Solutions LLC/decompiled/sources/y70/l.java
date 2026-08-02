package y70;

import android.app.Application;

/* loaded from: classes3.dex */
public final class l implements Jb.e<j> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Application> f106286a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<r90.f> f106287b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<S80.b> f106288c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<h90.f> f106289d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<Q90.c> f106290e;

    public l(Pc.a<Application> aVar, Pc.a<r90.f> aVar2, Pc.a<S80.b> aVar3, Pc.a<h90.f> aVar4, Pc.a<Q90.c> aVar5) {
        this.f106286a = aVar;
        this.f106287b = aVar2;
        this.f106288c = aVar3;
        this.f106289d = aVar4;
        this.f106290e = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        return new j(this.f106286a.get(), this.f106287b.get(), this.f106288c.get(), this.f106289d.get(), this.f106290e.get());
    }
}
