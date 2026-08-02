package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sqg implements qtk {
    public final Application a;
    public final ptk b;
    public final Bundle c;
    public final g6b d;
    public final nqg e;

    public sqg(Application application, qqg qqgVar, Bundle bundle) {
        ptk ptkVar;
        this.e = qqgVar.getSavedStateRegistry();
        this.d = qqgVar.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            ptkVar = ptk.c;
            if (ptkVar == null) {
                ptkVar = new ptk(application);
                ptk.c = ptkVar;
            }
        } else {
            ptkVar = new ptk(null);
        }
        this.b = ptkVar;
    }

    @Override // defpackage.qtk
    public final ltk a(Class cls, qzc qzcVar) {
        pff pffVar = dy0.m;
        LinkedHashMap linkedHashMap = qzcVar.a;
        String str = (String) linkedHashMap.get(pffVar);
        if (str == null) {
            a70.r("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(yso.l) == null || linkedHashMap.get(yso.m) == null) {
            if (this.d != null) {
                return d(cls, str);
            }
            a70.r("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(ptk.d);
        boolean isAssignableFrom = d50.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? tqg.a(cls, tqg.b) : tqg.a(cls, tqg.a);
        return a == null ? this.b.a(cls, qzcVar) : (!isAssignableFrom || application == null) ? tqg.b(cls, a, yso.w(qzcVar)) : tqg.b(cls, a, application, yso.w(qzcVar));
    }

    @Override // defpackage.qtk
    public final ltk b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        a70.p("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // defpackage.qtk
    public final ltk c(KClass kClass, qzc qzcVar) {
        kClass.getClass();
        return a(sha.x(kClass), qzcVar);
    }

    public final ltk d(Class cls, String str) {
        fqg fqgVar;
        g6b g6bVar = this.d;
        if (g6bVar == null) {
            a70.m("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = d50.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? tqg.a(cls, tqg.b) : tqg.a(cls, tqg.a);
        if (a == null) {
            if (application != null) {
                return this.b.b(cls);
            }
            rtk rtkVar = rtk.a;
            if (rtkVar == null) {
                rtkVar = new rtk();
                rtk.a = rtkVar;
            }
            return rtkVar.b(cls);
        }
        nqg nqgVar = this.e;
        nqgVar.getClass();
        Bundle a2 = nqgVar.a(str);
        if (a2 == null) {
            a2 = this.c;
        }
        if (a2 == null) {
            fqgVar = new fqg();
        } else {
            ClassLoader classLoader = fqg.class.getClassLoader();
            classLoader.getClass();
            a2.setClassLoader(classLoader);
            fqgVar = new fqg(o3a.P(a2));
        }
        gqg gqgVar = new gqg(str, fqgVar);
        gqgVar.f(nqgVar, g6bVar);
        e6b b = g6bVar.b();
        if (b == e6b.b || b.compareTo(e6b.d) >= 0) {
            nqgVar.d();
        } else {
            g6bVar.a(new tq4(3, g6bVar, nqgVar));
        }
        ltk b2 = (!isAssignableFrom || application == null) ? tqg.b(cls, a, fqgVar) : tqg.b(cls, a, application, fqgVar);
        b2.a("androidx.lifecycle.savedstate.vm.tag", gqgVar);
        return b2;
    }

    public sqg() {
        this.b = new ptk(null);
    }
}
