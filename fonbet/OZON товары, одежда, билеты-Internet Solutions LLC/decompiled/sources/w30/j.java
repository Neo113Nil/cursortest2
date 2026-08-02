package w30;

import android.content.Context;

/* loaded from: classes3.dex */
public final class j implements Jb.e<i> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f103527a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<v30.b> f103528b;

    public j(Pc.a<Context> aVar, Pc.a<v30.b> aVar2) {
        this.f103527a = aVar;
        this.f103528b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new i(this.f103527a.get(), this.f103528b.get());
    }
}
