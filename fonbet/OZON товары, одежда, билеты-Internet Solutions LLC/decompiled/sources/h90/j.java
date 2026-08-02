package h90;

import A30.m;
import android.content.Context;
import android.content.SharedPreferences;
import g30.InterfaceC6618a;
import i90.InterfaceC7024a;
import j90.InterfaceC7310a;

/* loaded from: classes3.dex */
public final class j implements Jb.e<g> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<InterfaceC7310a> f65183a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<InterfaceC7024a> f65184b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f65185c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<Context> f65186d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<m> f65187e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<S30.a> f65188f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f65189g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f65190h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<R30.a> f65191i;

    public j(Pc.a<InterfaceC7310a> aVar, Pc.a<InterfaceC7024a> aVar2, Pc.a<ru.ozon.fintech.settings.domain.a> aVar3, Pc.a<Context> aVar4, Pc.a<m> aVar5, Pc.a<S30.a> aVar6, Pc.a<InterfaceC6618a> aVar7, Pc.a<SharedPreferences> aVar8, Pc.a<R30.a> aVar9) {
        this.f65183a = aVar;
        this.f65184b = aVar2;
        this.f65185c = aVar3;
        this.f65186d = aVar4;
        this.f65187e = aVar5;
        this.f65188f = aVar6;
        this.f65189g = aVar7;
        this.f65190h = aVar8;
        this.f65191i = aVar9;
    }

    @Override // Pc.a
    public final Object get() {
        return new g(this.f65183a.get(), this.f65184b.get(), this.f65185c.get(), this.f65186d.get(), this.f65187e.get(), this.f65188f.get(), this.f65189g.get(), this.f65190h.get(), this.f65191i.get());
    }
}
