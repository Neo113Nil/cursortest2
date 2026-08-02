package Gj;

import android.media.AudioManager;

/* loaded from: classes5.dex */
public final class j implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f4236a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f4237b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f4238c;

    public j(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        this.f4236a = eVar;
        this.f4237b = eVar2;
        this.f4238c = eVar3;
    }

    public static j a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        return new j(eVar, eVar2, eVar3);
    }

    public static i c(t tVar, AudioManager audioManager, n nVar) {
        return new i(tVar, audioManager, nVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((t) this.f4236a.get(), (AudioManager) this.f4237b.get(), (n) this.f4238c.get());
    }
}
