package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class je {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        ge geVar = (ge) this.e.get(str);
        if ((geVar != null ? geVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                geVar.a.onActivityResult(geVar.b.c(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(intent, i2));
        return true;
    }

    public abstract void b(int i, yd ydVar, Object obj, ok3 ok3Var);

    public final ie c(String str, yd ydVar, xd xdVar) {
        str.getClass();
        e(str);
        this.e.put(str, new ge(ydVar, xdVar));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            xdVar.onActivityResult(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) gz8.K(bundle, str, ActivityResult.class);
        if (activityResult != null) {
            bundle.remove(str);
            xdVar.onActivityResult(ydVar.c(activityResult.b, activityResult.a));
        }
        return new ie(this, str, ydVar, 1);
    }

    public final ie d(final String str, u6b u6bVar, final yd ydVar, final xd xdVar) {
        str.getClass();
        ydVar.getClass();
        xdVar.getClass();
        g6b lifecycle = u6bVar.getLifecycle();
        if (lifecycle.b().compareTo(e6b.d) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(u6bVar);
            e6b b = lifecycle.b();
            sb.append(" is attempting to register while current state is ");
            sb.append(b);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        e(str);
        LinkedHashMap linkedHashMap = this.c;
        he heVar = (he) linkedHashMap.get(str);
        if (heVar == null) {
            heVar = new he(lifecycle);
        }
        p6b p6bVar = new p6b() { // from class: fe
            @Override // defpackage.p6b
            public final void onStateChanged(u6b u6bVar2, d6b d6bVar) {
                d6b d6bVar2 = d6b.ON_START;
                je jeVar = je.this;
                String str2 = str;
                if (d6bVar2 != d6bVar) {
                    if (d6b.ON_STOP == d6bVar) {
                        jeVar.e.remove(str2);
                        return;
                    } else {
                        if (d6b.ON_DESTROY == d6bVar) {
                            jeVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = jeVar.e;
                Bundle bundle = jeVar.g;
                LinkedHashMap linkedHashMap3 = jeVar.f;
                yd ydVar2 = ydVar;
                xd xdVar2 = xdVar;
                linkedHashMap2.put(str2, new ge(ydVar2, xdVar2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    xdVar2.onActivityResult(obj);
                }
                ActivityResult activityResult = (ActivityResult) gz8.K(bundle, str2, ActivityResult.class);
                if (activityResult != null) {
                    bundle.remove(str2);
                    xdVar2.onActivityResult(ydVar2.c(activityResult.b, activityResult.a));
                }
            }
        };
        heVar.a.a(p6bVar);
        heVar.b.add(p6bVar);
        linkedHashMap.put(str, heVar);
        return new ie(this, str, ydVar, 0);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        Iterator it = e5h.d(new c0(10)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        ogj.m("Sequence contains no element matching the predicate.");
    }

    public final void f(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString((ActivityResult) gz8.K(bundle, str, ActivityResult.class));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        he heVar = (he) linkedHashMap2.get(str);
        if (heVar != null) {
            ArrayList arrayList = heVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                heVar.a.d((p6b) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
