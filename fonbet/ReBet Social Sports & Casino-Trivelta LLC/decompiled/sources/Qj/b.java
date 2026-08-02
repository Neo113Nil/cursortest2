package Qj;

import android.content.Context;

/* loaded from: classes5.dex */
public final class b implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f9898a;

    public b(Gg.e eVar) {
        this.f9898a = eVar;
    }

    public static b a(Gg.e eVar) {
        return new b(eVar);
    }

    public static a c(Context context) {
        return new a(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((Context) this.f9898a.get());
    }
}
