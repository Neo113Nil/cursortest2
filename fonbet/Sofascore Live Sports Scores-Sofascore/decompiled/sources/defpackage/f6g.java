package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f6g {
    public final KClass a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public Executor f;
    public Executor g;
    public yf0 h;
    public boolean i;
    public Intent j;
    public final jga k;
    public final LinkedHashSet l;
    public final LinkedHashSet m;
    public final ArrayList n;
    public boolean o;
    public boolean p;
    public boolean q;

    public f6g(Context context, Class cls, String str) {
        context.getClass();
        this.d = new ArrayList();
        this.e = new ArrayList();
        i6g i6gVar = i6g.a;
        this.k = new jga(1);
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.n = new ArrayList();
        this.o = true;
        this.a = duf.a.getOrCreateKotlinClass(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(njc... njcVarArr) {
        for (njc njcVar : njcVarArr) {
            Integer valueOf = Integer.valueOf(njcVar.a);
            LinkedHashSet linkedHashSet = this.m;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(njcVar.b));
        }
        for (njc njcVar2 : (njc[]) Arrays.copyOf(njcVarArr, njcVarArr.length)) {
            this.k.a(njcVar2);
        }
    }

    public final k6g b() {
        String str;
        String str2;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            hg0 hg0Var = ig0.j;
            this.g = hg0Var;
            this.f = hg0Var;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.m;
        boolean isEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = this.l;
        if (!isEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                    ogj.h(ljg.j(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        eni eniVar = this.h;
        if (eniVar == null) {
            eniVar = new zic(24);
        }
        eni eniVar2 = eniVar;
        boolean z = this.i;
        i6g i6gVar = i6g.a;
        Context context = this.b;
        context.getClass();
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        i6g i6gVar2 = (activityManager == null || activityManager.isLowRamDevice()) ? i6g.a : i6g.b;
        Executor executor2 = this.f;
        if (executor2 == null) {
            a70.p("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            a70.p("Required value was null.");
            return null;
        }
        hg4 hg4Var = new hg4(context, this.c, eniVar2, this.k, this.d, z, i6gVar2, executor2, executor3, this.j, this.o, this.p, linkedHashSet2, null, null, null, this.e, this.n, this.q, null, null);
        Class x = sha.x(this.a);
        Package r0 = x.getPackage();
        if (r0 == null || (str = r0.getName()) == null) {
            str = "";
        }
        String canonicalName = x.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        String replace = canonicalName.replace('.', '_');
        replace.getClass();
        String concat = replace.concat("_Impl");
        try {
            if (str.length() == 0) {
                str2 = concat;
            } else {
                str2 = str + '.' + concat;
            }
            Class<?> cls = Class.forName(str2, true, x.getClassLoader());
            cls.getClass();
            k6g k6gVar = (k6g) cls.getDeclaredConstructor(null).newInstance(null);
            k6gVar.init(hg4Var);
            return k6gVar;
        } catch (ClassNotFoundException e) {
            pvd.u("Cannot find implementation for ", x.getCanonicalName(), ". ", concat, " does not exist. Is Room annotation processor correctly configured?", e);
            return null;
        } catch (IllegalAccessException e2) {
            pvd.v("Cannot access the constructor ", x.getCanonicalName(), e2);
            return null;
        } catch (InstantiationException e3) {
            pvd.v("Failed to create an instance of ", x.getCanonicalName(), e3);
            return null;
        }
    }
}
