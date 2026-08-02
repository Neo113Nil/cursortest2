package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k7d {
    public final Context a;
    public final k6d b;
    public final fl5 c;
    public final Activity d;
    public boolean e;
    public final px0 f;
    public final boolean g;
    public final mqi h;

    public k7d(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        this.b = new k6d(this, new bb7(this, 2));
        this.c = new fl5(context, false);
        Iterator it = e5h.e(context, new clc(22)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.d = (Activity) obj;
        this.f = new px0(this, 7);
        this.g = true;
        z8d z8dVar = this.b.s;
        z8dVar.a(new j7d(z8dVar));
        this.b.s.a(new rd(this.a));
        this.h = ypa.b(new bb7(this, 3));
    }

    public static void c(k7d k7dVar, Object obj) {
        k7dVar.getClass();
        obj.getClass();
        k7dVar.b.l(obj, null);
    }

    public final void a(i6d i6dVar) {
        k6d k6dVar = this.b;
        k6dVar.getClass();
        k6dVar.p.add(i6dVar);
        vg0 vg0Var = k6dVar.f;
        if (vg0Var.isEmpty()) {
            return;
        }
        d6d d6dVar = (d6d) vg0Var.last();
        i6dVar.a(k6dVar.a, d6dVar.b, d6dVar.h.a());
    }

    public final int b() {
        vg0 vg0Var = this.b.f;
        int i = 0;
        if (vg0Var != null && vg0Var.isEmpty()) {
            return 0;
        }
        Iterator<E> it = vg0Var.iterator();
        while (it.hasNext()) {
            if (!(((d6d) it.next()).b instanceof g7d) && (i = i + 1) < 0) {
                b.p();
                throw null;
            }
        }
        return i;
    }

    public final boolean d() {
        k6d k6dVar = this.b;
        if (k6dVar.f.isEmpty()) {
            return false;
        }
        s6d f = k6dVar.f();
        f.getClass();
        return k6dVar.m(f.b.b, true, false) && k6dVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Bundle bundle) {
        Bundle[] bundleArr;
        Throwable th;
        if (bundle != null) {
            bundle.setClassLoader(this.a.getClassLoader());
        }
        k6d k6dVar = this.b;
        LinkedHashMap linkedHashMap = k6dVar.m;
        Throwable th2 = null;
        if (bundle == null) {
            th = null;
        } else {
            k6dVar.d = bundle.containsKey("android-support-nav:controller:navigatorState") ? o3a.B(bundle, "android-support-nav:controller:navigatorState") : null;
            if (bundle.containsKey("android-support-nav:controller:backStack")) {
                KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Bundle.class);
                orCreateKotlinClass.getClass();
                ArrayList L = gz8.L(bundle, "android-support-nav:controller:backStack", sha.x(orCreateKotlinClass));
                if (L == null) {
                    w3a.I("android-support-nav:controller:backStack");
                    throw null;
                }
                bundleArr = (Bundle[]) L.toArray(new Bundle[0]);
            } else {
                bundleArr = null;
            }
            k6dVar.e = bundleArr;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] z = o3a.z(bundle, "android-support-nav:controller:backStackDestIds");
                ArrayList E = o3a.E(bundle, "android-support-nav:controller:backStackIds");
                int length = z.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    Throwable th3 = th2;
                    k6dVar.l.put(Integer.valueOf(z[i]), !Intrinsics.c(E.get(i2), "") ? (String) E.get(i2) : th3);
                    i++;
                    i2 = i3;
                    th2 = th3;
                }
            }
            th = th2;
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                for (String str : o3a.E(bundle, "android-support-nav:controller:backStackStates")) {
                    if (bundle.containsKey("android-support-nav:controller:backStackStates:" + str)) {
                        String q = dmi.q("android-support-nav:controller:backStackStates:", str);
                        KClass orCreateKotlinClass2 = duf.a.getOrCreateKotlinClass(Bundle.class);
                        orCreateKotlinClass2.getClass();
                        ArrayList L2 = gz8.L(bundle, q, sha.x(orCreateKotlinClass2));
                        if (L2 == null) {
                            w3a.I(q);
                            throw th;
                        }
                        vg0 vg0Var = new vg0(L2.size());
                        Iterator it = L2.iterator();
                        while (it.hasNext()) {
                            vg0Var.addLast(new g6d((Bundle) it.next()));
                        }
                        linkedHashMap.put(str, vg0Var);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean valueOf = (z2 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z2) : th;
            this.e = valueOf != 0 ? valueOf.booleanValue() : false;
        }
    }

    public final Bundle f() {
        Bundle bundle;
        LinkedHashMap linkedHashMap;
        k6d k6dVar = this.b;
        LinkedHashMap linkedHashMap2 = k6dVar.m;
        vg0 vg0Var = k6dVar.f;
        LinkedHashMap linkedHashMap3 = k6dVar.l;
        ArrayList arrayList = new ArrayList();
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : tub.p(k6dVar.s.a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle h = ((y8d) entry.getValue()).h();
            if (h != null) {
                arrayList.add(str);
                r4a.G(E, str, h);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            lm5.a.getClass();
            bundle = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            r4a.I(E, "android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", E);
        }
        if (vg0Var.isEmpty()) {
            linkedHashMap = linkedHashMap2;
        } else {
            if (bundle == null) {
                lm5.a.getClass();
                bundle = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<E> it = vg0Var.iterator();
            while (it.hasNext()) {
                d6d d6dVar = (d6d) it.next();
                d6dVar.getClass();
                int i = d6dVar.b.b.b;
                String str2 = d6dVar.f;
                f6d f6dVar = d6dVar.h;
                Bundle a = f6dVar.a();
                lm5 lm5Var = lm5.a;
                lm5Var.getClass();
                LinkedHashMap linkedHashMap4 = linkedHashMap2;
                Bundle E2 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                f6dVar.h.b(E2);
                lm5Var.getClass();
                Bundle E3 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                E3.putString("nav-entry-state:id", str2);
                E3.putInt("nav-entry-state:destination-id", i);
                if (a == null) {
                    a = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                }
                E3.putBundle("nav-entry-state:args", a);
                E3.putBundle("nav-entry-state:saved-state", E2);
                arrayList2.add(E3);
                linkedHashMap2 = linkedHashMap4;
            }
            linkedHashMap = linkedHashMap2;
            r4a.F(bundle, "android-support-nav:controller:backStack", arrayList2);
        }
        if (!linkedHashMap3.isEmpty()) {
            if (bundle == null) {
                lm5.a.getClass();
                bundle = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            int[] iArr = new int[linkedHashMap3.size()];
            ArrayList arrayList3 = new ArrayList();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str3 = (String) entry2.getValue();
                int i3 = i2 + 1;
                iArr[i2] = intValue;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList3.add(str3);
                i2 = i3;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            r4a.I(bundle, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                lm5.a.getClass();
                bundle = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str4 = (String) entry3.getKey();
                vg0 vg0Var2 = (vg0) entry3.getValue();
                arrayList4.add(str4);
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = vg0Var2.iterator();
                while (it2.hasNext()) {
                    fig figVar = ((g6d) it2.next()).a;
                    lm5.a.getClass();
                    Bundle E4 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    E4.putString("nav-entry-state:id", (String) figVar.b);
                    E4.putInt("nav-entry-state:destination-id", figVar.a);
                    Bundle bundle2 = (Bundle) figVar.c;
                    if (bundle2 == null) {
                        bundle2 = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    }
                    E4.putBundle("nav-entry-state:args", bundle2);
                    E4.putBundle("nav-entry-state:saved-state", (Bundle) figVar.d);
                    arrayList5.add(E4);
                }
                r4a.F(bundle, "android-support-nav:controller:backStackStates:" + str4, arrayList5);
            }
            r4a.I(bundle, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.e) {
            if (bundle == null) {
                lm5.a.getClass();
                bundle = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.e);
        }
        return bundle;
    }

    public final void g(u6b u6bVar) {
        g6b lifecycle;
        u6bVar.getClass();
        k6d k6dVar = this.b;
        ga gaVar = k6dVar.r;
        if (u6bVar.equals(k6dVar.n)) {
            return;
        }
        u6b u6bVar2 = k6dVar.n;
        if (u6bVar2 != null && (lifecycle = u6bVar2.getLifecycle()) != null) {
            lifecycle.d(gaVar);
        }
        k6dVar.n = u6bVar;
        u6bVar.getLifecycle().a(gaVar);
    }

    public final void h(stk stkVar) {
        stkVar.getClass();
        k6d k6dVar = this.b;
        k6dVar.getClass();
        if (Intrinsics.c(k6dVar.o, w3a.A(stkVar))) {
            return;
        }
        if (k6dVar.f.isEmpty()) {
            k6dVar.o = w3a.A(stkVar);
        } else {
            a70.r("ViewModelStore should be set before setGraph call");
        }
    }
}
