package Fj;

import android.content.Context;

/* loaded from: classes5.dex */
public final class u implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f3764a;

    public u(Gg.e eVar) {
        this.f3764a = eVar;
    }

    public static u a(Gg.e eVar) {
        return new u(eVar);
    }

    public static t c(Context context) {
        return new t(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c((Context) this.f3764a.get());
    }
}
