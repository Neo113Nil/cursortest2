package w30;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p implements Jb.e<o> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f103544a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Q90.c> f103545b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<ru.ozon.fintech.settings.domain.a> f103546c;

    public p(Pc.a<Context> aVar, Pc.a<Q90.c> aVar2, Pc.a<ru.ozon.fintech.settings.domain.a> aVar3) {
        this.f103544a = aVar;
        this.f103545b = aVar2;
        this.f103546c = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        return new o(this.f103544a.get(), this.f103545b.get(), this.f103546c.get());
    }
}
