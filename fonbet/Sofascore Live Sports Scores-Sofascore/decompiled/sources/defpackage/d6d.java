package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d6d implements u6b, ttk, h79, qqg {
    public final fl5 a;
    public s6d b;
    public final Bundle c;
    public e6b d;
    public final l6d e;
    public final String f;
    public final Bundle g;
    public final f6d h = new f6d(this);

    public d6d(fl5 fl5Var, s6d s6dVar, Bundle bundle, e6b e6bVar, l6d l6dVar, String str, Bundle bundle2) {
        this.a = fl5Var;
        this.b = s6dVar;
        this.c = bundle;
        this.d = e6bVar;
        this.e = l6dVar;
        this.f = str;
        this.g = bundle2;
        ypa.b(new xxb(this, 11));
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof d6d)) {
            d6d d6dVar = (d6d) obj;
            Bundle bundle = d6dVar.c;
            if (!this.f.equals(d6dVar.f) || !Intrinsics.c(this.b, d6dVar.b) || this.h.j != d6dVar.h.j || getSavedStateRegistry() != d6dVar.getSavedStateRegistry()) {
                return false;
            }
            Bundle bundle2 = this.c;
            if (Intrinsics.c(bundle2, bundle)) {
                return true;
            }
            if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                Set<String> set = keySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (String str : set) {
                    if (!Intrinsics.c(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // defpackage.h79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ly3 getDefaultViewModelCreationExtras() {
        Application application;
        Application application2;
        f6d f6dVar = this.h;
        f6dVar.getClass();
        qzc qzcVar = new qzc(0);
        wkf wkfVar = yso.l;
        d6d d6dVar = f6dVar.a;
        LinkedHashMap linkedHashMap = qzcVar.a;
        linkedHashMap.put(wkfVar, d6dVar);
        linkedHashMap.put(yso.m, d6dVar);
        Bundle a = f6dVar.a();
        if (a != null) {
            linkedHashMap.put(yso.n, a);
        }
        fl5 fl5Var = this.a;
        if (fl5Var != null) {
            Context context = fl5Var.a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(ptk.d, application2);
                }
                return qzcVar;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return qzcVar;
    }

    @Override // defpackage.h79
    public final qtk getDefaultViewModelProviderFactory() {
        return this.h.l;
    }

    @Override // defpackage.u6b
    public final g6b getLifecycle() {
        return this.h.j;
    }

    @Override // defpackage.qqg
    public final nqg getSavedStateRegistry() {
        return this.h.h.b;
    }

    @Override // defpackage.ttk
    public final stk getViewModelStore() {
        f6d f6dVar = this.h;
        if (!f6dVar.i) {
            a70.r("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (f6dVar.j.i == e6b.a) {
            a70.r("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        l6d l6dVar = f6dVar.e;
        if (l6dVar == null) {
            a70.r("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = f6dVar.f;
        LinkedHashMap linkedHashMap = l6dVar.b;
        stk stkVar = (stk) linkedHashMap.get(str);
        if (stkVar != null) {
            return stkVar;
        }
        stk stkVar2 = new stk();
        linkedHashMap.put(str, stkVar2);
        return stkVar2;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.b.hashCode() + (this.f.hashCode() * 31);
        Bundle bundle = this.c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.h.j.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.h.toString();
    }
}
