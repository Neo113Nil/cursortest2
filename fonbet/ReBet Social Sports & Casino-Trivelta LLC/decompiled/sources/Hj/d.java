package Hj;

import android.content.Context;

/* loaded from: classes5.dex */
public final class d implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5033a;

    public d(Gg.e eVar) {
        this.f5033a = eVar;
    }

    public static d a(Gg.e eVar) {
        return new d(eVar);
    }

    public static c c(Context context) {
        return new c(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Context) this.f5033a.get());
    }
}
