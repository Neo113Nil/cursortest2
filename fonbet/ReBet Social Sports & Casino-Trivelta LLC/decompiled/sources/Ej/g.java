package Ej;

import android.content.Context;
import android.telephony.TelephonyManager;

/* loaded from: classes5.dex */
public final class g implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final a f3144a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f3145b;

    public g(a aVar, Gg.e eVar) {
        this.f3144a = aVar;
        this.f3145b = eVar;
    }

    public static g a(a aVar, Gg.e eVar) {
        return new g(aVar, eVar);
    }

    public static TelephonyManager c(a aVar, Context context) {
        return aVar.f(context);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TelephonyManager get() {
        return c(this.f3144a, (Context) this.f3145b.get());
    }
}
