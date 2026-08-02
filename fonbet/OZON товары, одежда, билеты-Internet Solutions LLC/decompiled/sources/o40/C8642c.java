package o40;

import Jb.e;
import g30.InterfaceC6618a;
import p40.n;

/* renamed from: o40.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8642c implements e<C8641b> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Q90.c> f77702a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f77703b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<n> f77704c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<n> f77705d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<n> f77706e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f77707f;

    public C8642c(Pc.a<Q90.c> aVar, Pc.a<ru.ozon.fintech.settings.domain.a> aVar2, Pc.a<n> aVar3, Pc.a<n> aVar4, Pc.a<n> aVar5, Pc.a<InterfaceC6618a> aVar6) {
        this.f77702a = aVar;
        this.f77703b = aVar2;
        this.f77704c = aVar3;
        this.f77705d = aVar4;
        this.f77706e = aVar5;
        this.f77707f = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        return new C8641b(this.f77702a.get(), this.f77703b.get(), this.f77704c.get(), this.f77705d.get(), this.f77706e.get(), this.f77707f.get());
    }
}
