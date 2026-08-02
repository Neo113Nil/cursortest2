package Ej;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes5.dex */
public final class f implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f3142a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3143b;

    public f(a aVar, Gg.e eVar) {
        this.f3142a = aVar;
        this.f3143b = eVar;
    }

    public static f a(a aVar, Gg.e eVar) {
        return new f(aVar, eVar);
    }

    public static PowerManager c(a aVar, Context context) {
        return (PowerManager) Gg.d.d(aVar.e(context));
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PowerManager get() {
        return c(this.f3142a, (Context) this.f3143b.get());
    }
}
