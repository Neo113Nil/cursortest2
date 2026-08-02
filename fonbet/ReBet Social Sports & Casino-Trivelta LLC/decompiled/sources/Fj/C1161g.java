package Fj;

import android.os.PowerManager;

/* renamed from: Fj.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1161g implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f3749a;

    public C1161g(Gg.e eVar) {
        this.f3749a = eVar;
    }

    public static C1161g a(Gg.e eVar) {
        return new C1161g(eVar);
    }

    public static C1160f c(PowerManager powerManager) {
        return new C1160f(powerManager);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1160f get() {
        return c((PowerManager) this.f3749a.get());
    }
}
