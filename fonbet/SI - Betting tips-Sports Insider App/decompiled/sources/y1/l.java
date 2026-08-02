package y1;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import androidx.lifecycle.m1;
import androidx.lifecycle.o1;
import androidx.lifecycle.p1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements androidx.lifecycle.e0, p1, androidx.lifecycle.r, q2.f {

    /* renamed from: a, reason: collision with root package name */
    public final b2.e f25582a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f25583b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f25584c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.x f25585d;

    /* renamed from: e, reason: collision with root package name */
    public final s f25586e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25587f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f25588g;

    /* renamed from: h, reason: collision with root package name */
    public final b2.d f25589h = new b2.d(this);

    public l(b2.e eVar, b0 b0Var, Bundle bundle, androidx.lifecycle.x xVar, s sVar, String str, Bundle bundle2) {
        this.f25582a = eVar;
        this.f25583b = b0Var;
        this.f25584c = bundle;
        this.f25585d = xVar;
        this.f25586e = sVar;
        this.f25587f = str;
        this.f25588g = bundle2;
        gf.k.b(new me.a(22, this));
    }

    public final void a(androidx.lifecycle.x maxState) {
        Intrinsics.checkNotNullParameter(maxState, "value");
        b2.d dVar = this.f25589h;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        dVar.f2965k = maxState;
        dVar.b();
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            Bundle bundle = lVar.f25584c;
            if (Intrinsics.areEqual(this.f25587f, lVar.f25587f) && Intrinsics.areEqual(this.f25583b, lVar.f25583b) && Intrinsics.areEqual(this.f25589h.j, lVar.f25589h.j) && Intrinsics.areEqual(getSavedStateRegistry(), lVar.getSavedStateRegistry())) {
                Bundle bundle2 = this.f25584c;
                if (Intrinsics.areEqual(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    if (keySet.isEmpty()) {
                        return true;
                    }
                    for (String str : keySet) {
                        if (!Intrinsics.areEqual(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    @Override // androidx.lifecycle.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t1.c getDefaultViewModelCreationExtras() {
        Application application;
        Application application2;
        b2.d dVar = this.f25589h;
        dVar.getClass();
        t1.e eVar = new t1.e(0);
        y8.d dVar2 = d1.f2149a;
        l lVar = dVar.f2956a;
        eVar.b(dVar2, lVar);
        eVar.b(d1.f2150b, lVar);
        Bundle a7 = dVar.a();
        if (a7 != null) {
            eVar.b(d1.f2151c, a7);
        }
        b2.e eVar2 = this.f25582a;
        if (eVar2 != null) {
            Context applicationContext = eVar2.f2968a.getApplicationContext();
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    eVar.b(l1.f2201e, application2);
                }
                return eVar;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    public final m1 getDefaultViewModelProviderFactory() {
        return this.f25589h.f2966l;
    }

    @Override // androidx.lifecycle.e0
    public final androidx.lifecycle.y getLifecycle() {
        return this.f25589h.j;
    }

    @Override // q2.f
    public final q2.d getSavedStateRegistry() {
        return this.f25589h.f2963h.f21928b;
    }

    @Override // androidx.lifecycle.p1
    public final o1 getViewModelStore() {
        b2.d dVar = this.f25589h;
        if (!dVar.f2964i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (dVar.j.f2169d == androidx.lifecycle.x.f2253a) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        s sVar = dVar.f2960e;
        if (sVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = dVar.f2961f;
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = sVar.f25632b;
        o1 o1Var = (o1) linkedHashMap.get(backStackEntryId);
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1Var2 = new o1();
        linkedHashMap.put(backStackEntryId, o1Var2);
        return o1Var2;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.f25583b.hashCode() + (this.f25587f.hashCode() * 31);
        Bundle bundle = this.f25584c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i5 = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i5 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.f25589h.j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f25589h.toString();
    }
}
