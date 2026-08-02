package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g1 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final Application f2175a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f2176b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f2177c;

    /* renamed from: d, reason: collision with root package name */
    public final y f2178d;

    /* renamed from: e, reason: collision with root package name */
    public final q2.d f2179e;

    public g1() {
        this.f2176b = new l1(null);
    }

    @Override // androidx.lifecycle.m1
    public final k1 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.m1
    public final k1 b(ag.c modelClass, t1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return c(u6.h.k(modelClass), extras);
    }

    @Override // androidx.lifecycle.m1
    public final k1 c(Class modelClass, t1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(n1.f2219b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(d1.f2149a) == null || extras.a(d1.f2150b) == null) {
            if (this.f2178d != null) {
                return d(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(l1.f2201e);
        boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
        Constructor a7 = (!isAssignableFrom || application == null) ? h1.a(modelClass, h1.f2185b) : h1.a(modelClass, h1.f2184a);
        return a7 == null ? this.f2176b.c(modelClass, extras) : (!isAssignableFrom || application == null) ? h1.b(modelClass, a7, d1.d(extras)) : h1.b(modelClass, a7, application, d1.d(extras));
    }

    public final k1 d(Class modelClass, String key) {
        k1 b10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        y lifecycle = this.f2178d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = a.class.isAssignableFrom(modelClass);
        Application application = this.f2175a;
        Constructor a7 = (!isAssignableFrom || application == null) ? h1.a(modelClass, h1.f2185b) : h1.a(modelClass, h1.f2184a);
        int i5 = 1;
        if (a7 == null) {
            if (application != null) {
                return this.f2176b.a(modelClass);
            }
            if (c1.f2145b == null) {
                c1.f2145b = new c1(i5);
            }
            c1 c1Var = c1.f2145b;
            Intrinsics.checkNotNull(c1Var);
            return c1Var.a(modelClass);
        }
        q2.d registry = this.f2179e;
        Intrinsics.checkNotNull(registry);
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        a1 c2 = d1.c(registry.a(key), this.f2177c);
        b1 b1Var = new b1(key, c2);
        b1Var.k(lifecycle, registry);
        x xVar = ((g0) lifecycle).f2169d;
        if (xVar == x.f2254b || xVar.a(x.f2256d)) {
            registry.d();
        } else {
            lifecycle.a(new l(lifecycle, registry));
        }
        if (!isAssignableFrom || application == null) {
            b10 = h1.b(modelClass, a7, c2);
        } else {
            Intrinsics.checkNotNull(application);
            b10 = h1.b(modelClass, a7, application, c2);
        }
        b10.a("androidx.lifecycle.savedstate.vm.tag", b1Var);
        return b10;
    }

    public g1(Application application, q2.f owner, Bundle bundle) {
        l1 l1Var;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f2179e = owner.getSavedStateRegistry();
        this.f2178d = owner.getLifecycle();
        this.f2177c = bundle;
        this.f2175a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (l1.f2200d == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                l1.f2200d = new l1(application);
            }
            l1Var = l1.f2200d;
            Intrinsics.checkNotNull(l1Var);
        } else {
            l1Var = new l1(null);
        }
        this.f2176b = l1Var;
    }
}
