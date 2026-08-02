package g;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import bg.r;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9640a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9641b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9642c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9643d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f9644e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f9645f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f9646g = new Bundle();

    public final boolean a(int i5, int i10, Intent intent) {
        String str = (String) this.f9640a.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.f9644e.get(str);
        if ((dVar != null ? dVar.f9632a : null) != null) {
            ArrayList arrayList = this.f9643d;
            if (arrayList.contains(str)) {
                dVar.f9632a.a(dVar.f9633b.c(intent, i10));
                arrayList.remove(str);
                return true;
            }
        }
        this.f9645f.remove(str);
        this.f9646g.putParcelable(str, new ActivityResult(intent, i10));
        return true;
    }

    public abstract void b(int i5, h.a aVar, Object obj);

    public final f c(final String key, e0 lifecycleOwner, final h.a contract, final a callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        y lifecycle = lifecycleOwner.getLifecycle();
        g0 g0Var = (g0) lifecycle;
        if (g0Var.f2169d.a(x.f2256d)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + g0Var.f2169d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f9642c;
        e eVar = (e) linkedHashMap.get(key);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        c0 observer = new c0() { // from class: g.c
            @Override // androidx.lifecycle.c0
            public final void c(e0 e0Var, w event) {
                Intrinsics.checkNotNullParameter(e0Var, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                w wVar = w.ON_START;
                g gVar = g.this;
                String str = key;
                if (wVar != event) {
                    if (w.ON_STOP == event) {
                        gVar.f9644e.remove(str);
                        return;
                    } else {
                        if (w.ON_DESTROY == event) {
                            gVar.f(str);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = gVar.f9644e;
                Bundle bundle = gVar.f9646g;
                LinkedHashMap linkedHashMap3 = gVar.f9645f;
                h.a aVar = contract;
                a aVar2 = callback;
                linkedHashMap2.put(str, new d(aVar, aVar2));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    aVar2.a(obj);
                }
                ActivityResult activityResult = (ActivityResult) y4.a.u(bundle, str);
                if (activityResult != null) {
                    bundle.remove(str);
                    aVar2.a(aVar.c(activityResult.f195b, activityResult.f194a));
                }
            }
        };
        Intrinsics.checkNotNullParameter(observer, "observer");
        eVar.f9634a.a(observer);
        eVar.f9635b.add(observer);
        linkedHashMap.put(key, eVar);
        return new f(this, key, contract, 0);
    }

    public final f d(String key, h.a contract, a callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        e(key);
        this.f9644e.put(key, new d(contract, callback));
        LinkedHashMap linkedHashMap = this.f9645f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            callback.a(obj);
        }
        Bundle bundle = this.f9646g;
        ActivityResult activityResult = (ActivityResult) y4.a.u(bundle, key);
        if (activityResult != null) {
            bundle.remove(key);
            callback.a(contract.c(activityResult.f195b, activityResult.f194a));
        }
        return new f(this, key, contract, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f9641b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        b2.b nextFunction = new b2.b(22);
        Intrinsics.checkNotNullParameter(nextFunction, "nextFunction");
        r rVar = new r(nextFunction, new a2.f(1, nextFunction));
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Iterator it = new bg.a(rVar).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f9640a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f9643d.contains(key) && (num = (Integer) this.f9641b.remove(key)) != null) {
            this.f9640a.remove(num);
        }
        this.f9644e.remove(key);
        LinkedHashMap linkedHashMap = this.f9645f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder p10 = d9.e.p("Dropping pending result for request ", key, ": ");
            p10.append(linkedHashMap.get(key));
            w0.m("ActivityResultRegistry", p10.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f9646g;
        if (bundle.containsKey(key)) {
            w0.m("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((ActivityResult) y4.a.u(bundle, key)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f9642c;
        e eVar = (e) linkedHashMap2.get(key);
        if (eVar != null) {
            ArrayList arrayList = eVar.f9635b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.f9634a.b((c0) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
