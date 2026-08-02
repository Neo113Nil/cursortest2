package Ej;

import android.content.Context;
import android.media.AudioManager;

/* loaded from: classes5.dex */
public final class c implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f3137a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3138b;

    public c(a aVar, Gg.e eVar) {
        this.f3137a = aVar;
        this.f3138b = eVar;
    }

    public static c a(a aVar, Gg.e eVar) {
        return new c(aVar, eVar);
    }

    public static AudioManager c(a aVar, Context context) {
        return (AudioManager) Gg.d.d(aVar.b(context));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AudioManager get() {
        return c(this.f3137a, (Context) this.f3138b.get());
    }
}
