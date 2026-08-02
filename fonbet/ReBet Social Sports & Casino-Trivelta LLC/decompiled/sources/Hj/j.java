package Hj;

import android.media.AudioManager;

/* loaded from: classes5.dex */
public final class j implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5041a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f5042b;

    public j(Gg.e eVar, Gg.e eVar2) {
        this.f5041a = eVar;
        this.f5042b = eVar2;
    }

    public static j a(Gg.e eVar, Gg.e eVar2) {
        return new j(eVar, eVar2);
    }

    public static i c(Ej.j jVar, AudioManager audioManager) {
        return new i(jVar, audioManager);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c((Ej.j) this.f5041a.get(), (AudioManager) this.f5042b.get());
    }
}
