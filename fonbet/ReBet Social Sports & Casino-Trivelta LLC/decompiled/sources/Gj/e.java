package Gj;

import android.media.AudioManager;

/* loaded from: classes5.dex */
public final class e implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f4230b;

    public e(Gg.e eVar, Gg.e eVar2) {
        this.f4229a = eVar;
        this.f4230b = eVar2;
    }

    public static e a(Gg.e eVar, Gg.e eVar2) {
        return new e(eVar, eVar2);
    }

    public static d c(AudioManager audioManager, f fVar) {
        return new d(audioManager, fVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((AudioManager) this.f4229a.get(), (f) this.f4230b.get());
    }
}
