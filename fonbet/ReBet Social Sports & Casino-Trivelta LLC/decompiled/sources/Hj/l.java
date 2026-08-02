package Hj;

import android.content.Context;

/* loaded from: classes5.dex */
public final class l implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5044a;

    public l(Gg.e eVar) {
        this.f5044a = eVar;
    }

    public static l a(Gg.e eVar) {
        return new l(eVar);
    }

    public static k c(Context context) {
        return new k(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c((Context) this.f5044a.get());
    }
}
