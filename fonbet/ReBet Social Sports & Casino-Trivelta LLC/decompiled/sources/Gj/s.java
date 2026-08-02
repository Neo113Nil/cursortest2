package Gj;

import android.media.AudioManager;

/* loaded from: classes5.dex */
public final class s implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f4254a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f4255b;

    /* renamed from: c, reason: collision with root package name */
    public final Gg.e f4256c;

    public s(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        this.f4254a = eVar;
        this.f4255b = eVar2;
        this.f4256c = eVar3;
    }

    public static s a(Gg.e eVar, Gg.e eVar2, Gg.e eVar3) {
        return new s(eVar, eVar2, eVar3);
    }

    public static r c(AudioManager audioManager, Hj.a aVar, a aVar2) {
        return new r(audioManager, aVar, aVar2);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((AudioManager) this.f4254a.get(), (Hj.a) this.f4255b.get(), (a) this.f4256c.get());
    }
}
