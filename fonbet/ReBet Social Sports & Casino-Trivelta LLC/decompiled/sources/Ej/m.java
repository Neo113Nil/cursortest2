package Ej;

import com.google.gson.Gson;

/* loaded from: classes5.dex */
public final class m implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final l f3202a;

    public m(l lVar) {
        this.f3202a = lVar;
    }

    public static m a(l lVar) {
        return new m(lVar);
    }

    public static Gson c(l lVar) {
        return (Gson) Gg.d.d(lVar.a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Gson get() {
        return c(this.f3202a);
    }
}
