package Xj;

import android.content.Context;

/* loaded from: classes5.dex */
public final class e implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f13887a;

    public e(Gg.e eVar) {
        this.f13887a = eVar;
    }

    public static e a(Gg.e eVar) {
        return new e(eVar);
    }

    public static d c(Context context) {
        return new d(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((Context) this.f13887a.get());
    }
}
