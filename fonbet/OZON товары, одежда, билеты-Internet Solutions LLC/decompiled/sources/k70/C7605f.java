package k70;

import android.content.Context;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;

/* renamed from: k70.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7605f implements Jb.e<ru.ozon.fintech.features.offline.presentation.select.a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f71055a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<S80.b> f71056b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6083a> f71057c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<r90.f> f71058d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<V60.a> f71059e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f71060f;

    public C7605f(Pc.a<Context> aVar, Pc.a<S80.b> aVar2, Pc.a<InterfaceC6083a> aVar3, Pc.a<r90.f> aVar4, Pc.a<V60.a> aVar5, Pc.a<InterfaceC6618a> aVar6) {
        this.f71055a = aVar;
        this.f71056b = aVar2;
        this.f71057c = aVar3;
        this.f71058d = aVar4;
        this.f71059e = aVar5;
        this.f71060f = aVar6;
    }

    @Override // Pc.a
    public final Object get() {
        return new ru.ozon.fintech.features.offline.presentation.select.a(this.f71055a.get(), this.f71056b.get(), this.f71057c.get(), this.f71058d.get(), this.f71059e.get(), this.f71060f.get());
    }
}
