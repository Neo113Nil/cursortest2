package X0;

import Y0.g;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final V f13377a;

    /* renamed from: b, reason: collision with root package name */
    public final U.c f13378b;

    /* renamed from: c, reason: collision with root package name */
    public final a f13379c;

    /* renamed from: d, reason: collision with root package name */
    public final Y0.e f13380d;

    public d(V store, U.c factory, a defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f13377a = store;
        this.f13378b = factory;
        this.f13379c = defaultExtras;
        this.f13380d = new Y0.e();
    }

    public static /* synthetic */ Q e(d dVar, KClass kClass, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = g.f13899a.c(kClass);
        }
        return dVar.d(kClass, str);
    }

    public final Q d(KClass modelClass, String key) {
        Q b10;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f13380d) {
            try {
                b10 = this.f13377a.b(key);
                if (modelClass.isInstance(b10)) {
                    if (this.f13378b instanceof U.e) {
                        U.e eVar = (U.e) this.f13378b;
                        Intrinsics.checkNotNull(b10);
                        eVar.a(b10);
                    }
                    Intrinsics.checkNotNull(b10, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    b bVar = new b(this.f13379c);
                    bVar.c(U.f20356c, key);
                    b10 = e.a(this.f13378b, modelClass, bVar);
                    this.f13377a.d(key, b10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }
}
