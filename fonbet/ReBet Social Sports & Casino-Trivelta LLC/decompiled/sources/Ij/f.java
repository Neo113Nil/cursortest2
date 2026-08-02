package Ij;

import Gj.q;
import android.content.Context;

/* loaded from: classes5.dex */
public final class f implements Gg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Gg.e f5863a;

    /* renamed from: b, reason: collision with root package name */
    public final Gg.e f5864b;

    public f(Gg.e eVar, Gg.e eVar2) {
        this.f5863a = eVar;
        this.f5864b = eVar2;
    }

    public static f a(Gg.e eVar, Gg.e eVar2) {
        return new f(eVar, eVar2);
    }

    public static e c(Context context, q qVar) {
        return new e(context, qVar);
    }

    @Override // javax.inject.Provider
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((Context) this.f5863a.get(), (q) this.f5864b.get());
    }
}
