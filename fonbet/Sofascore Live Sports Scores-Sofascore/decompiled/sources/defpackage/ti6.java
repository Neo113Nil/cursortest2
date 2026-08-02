package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.sofascore.model.Country;
import com.sofascore.model.ExperimentsRemoteConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ti6 {
    public final SharedPreferences a;
    public final boolean b;
    public final ArrayList c;
    public oo5 d;
    public boolean e;

    public ti6(SharedPreferences sharedPreferences) {
        km5 km5Var = bpg.a;
        mi6 mi6Var = l8f.a;
        this.a = sharedPreferences;
        this.b = sharedPreferences.getBoolean("PREF_FIRST_RUN_V3", true);
        Collection collection = bpg.b;
        collection = collection == null ? km5.a : collection;
        Iterable iterable = l8f.c;
        this.c = CollectionsKt.w0(iterable == null ? km5.a : iterable, collection);
    }

    public static oo5 b(List list) {
        double nextDouble;
        list.getClass();
        glf.a.getClass();
        d7 d7Var = glf.b;
        d7Var.getClass();
        double d = 0.0d;
        if (!Double.isInfinite(1.0d) || Math.abs(0.0d) > Double.MAX_VALUE || Math.abs(1.0d) > Double.MAX_VALUE) {
            nextDouble = (d7Var.j().nextDouble() * 1.0d) + 0.0d;
        } else {
            double nextDouble2 = d7Var.j().nextDouble() * 0.5d;
            nextDouble = 0.0d + nextDouble2 + nextDouble2;
        }
        if (nextDouble >= 1.0d) {
            nextDouble = Math.nextAfter(1.0d, Double.NEGATIVE_INFINITY);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mi6 mi6Var = (mi6) it.next();
            Iterator it2 = mi6Var.a.iterator();
            while (it2.hasNext()) {
                zi6 zi6Var = (zi6) it2.next();
                d += zi6Var.b;
                if (d >= nextDouble) {
                    return new oo5(mi6Var, zi6Var.a);
                }
            }
        }
        return null;
    }

    public final void a() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            edit.remove("active_experiment_".concat(str));
        }
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x004e, code lost:
    
        if ((r0 instanceof defpackage.u2g) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList c(List list, Country country, String str) {
        Object u2gVar;
        Map<String, Long> killed;
        Map<String, Long> expired;
        list.getClass();
        str.getClass();
        yea yeaVar = j58.a;
        e58 f = e58.f();
        f.getClass();
        String g = f.g("local_experiments");
        if (g.length() != 0) {
            try {
                p2g p2gVar = w2g.b;
                yeaVar.getClass();
                u2gVar = yeaVar.b(l98.W(ExperimentsRemoteConfig.INSTANCE.serializer()), g);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            Throwable a = w2g.a(u2gVar);
            if (a != null) {
                s38.a().c(a);
            }
        }
        u2gVar = null;
        ExperimentsRemoteConfig experimentsRemoteConfig = (ExperimentsRemoteConfig) u2gVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mi6 mi6Var = (mi6) obj;
            mi6Var.getClass();
            String str2 = mi6Var.c;
            Long l = (experimentsRemoteConfig == null || (expired = experimentsRemoteConfig.getExpired()) == null) ? null : expired.get("android_appsflyer_personalized_onboarding");
            if (l == null) {
                l = null;
            }
            boolean z = true;
            boolean z2 = l != null && System.currentTimeMillis() / 1000 > l.longValue();
            Long l2 = (experimentsRemoteConfig == null || (killed = experimentsRemoteConfig.getKilled()) == null) ? null : killed.get("android_appsflyer_personalized_onboarding");
            if (l2 == null) {
                l2 = null;
            }
            boolean z3 = l2 != null && System.currentTimeMillis() / 1000 > l2.longValue();
            if (f(str2) == null && !this.b) {
                z = false;
            }
            if (z3) {
                "android_appsflyer_personalized_onboarding".toUpperCase(Locale.ROOT).getClass();
                e();
                SharedPreferences.Editor edit = this.a.edit();
                edit.getClass();
                edit.remove(str2);
                edit.apply();
            }
            if (!z3 && !z2) {
                List<ni6> list2 = mi6Var.b;
                if (!list2.isEmpty()) {
                    for (ni6 ni6Var : list2) {
                        ni6Var.getClass();
                        if (!(ni6Var instanceof ni6)) {
                            zzl.b();
                            return null;
                        }
                        List list3 = ni6Var.a;
                        if (list3 == null || !list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                if (!(((l28) it.next()) instanceof l28)) {
                                    zzl.b();
                                    return null;
                                }
                                if (!z) {
                                    break;
                                }
                            }
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ri6 d(mi6 mi6Var) {
        mi6Var.getClass();
        oo5 oo5Var = this.d;
        if (oo5Var == null) {
            return null;
        }
        ri6 ri6Var = oo5Var.b;
        oo5Var.a.getClass();
        return ri6Var;
    }

    public final void e() {
        ugj.a.getClass();
    }

    public final ri6 f(String str) {
        String string = this.a.getString(str, null);
        if (string == null) {
            return null;
        }
        if (string.equals("control")) {
            return oi6.a;
        }
        if (!c.v(string, "treatment", false)) {
            return pi6.a;
        }
        Integer intOrNull = StringsKt.toIntOrNull(new Regex("[^0-9]").replace(string, ""));
        return new qi6(intOrNull != null ? intOrNull.intValue() : 1);
    }

    public final void g(ri6 ri6Var, String str) {
        ri6Var.getClass();
        SharedPreferences.Editor edit = this.a.edit();
        edit.getClass();
        edit.putString(str, ri6Var.a());
        edit.apply();
    }

    public final void h(mi6 mi6Var, ri6 ri6Var) {
        mi6Var.getClass();
        ri6Var.getClass();
        a();
        SharedPreferences.Editor edit = this.a.edit();
        edit.getClass();
        Iterable iterable = l8f.b;
        if (iterable == null) {
            iterable = km5.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            edit.remove(((mi6) it.next()).c);
        }
        km5 km5Var = bpg.a;
        if (km5Var == null) {
            km5Var = km5.a;
        }
        km5Var.getClass();
        im5.a.getClass();
        edit.apply();
        this.d = new oo5(mi6Var, ri6Var);
        g(ri6Var, mi6Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Context context, boolean z) {
        Object obj;
        oo5 b;
        ri6 ri6Var;
        ri6 f;
        if (!this.e || z) {
            ArrayList arrayList = dv3.a;
            Country b2 = dv3.b(Integer.valueOf(ke0.c));
            if (b2 == null) {
                return;
            }
            a();
            km5 km5Var = bpg.a;
            if (km5Var == null) {
                km5Var = km5.a;
            }
            mi6 mi6Var = (mi6) CollectionsKt.firstOrNull(c(km5Var, b2, dla.b(context)));
            pi6 pi6Var = pi6.a;
            if (mi6Var != null && (f = f(mi6Var.c)) != null) {
                b = new oo5(mi6Var, f);
                if (!f.equals(pi6Var)) {
                    f.a();
                    e();
                    this.d = b;
                    if (b != null) {
                        mi6 mi6Var2 = b.a;
                    }
                    Objects.toString(b != null ? b.b : null);
                    e();
                    this.e = true;
                }
            }
            List list = l8f.b;
            if (list == null) {
                list = km5.a;
            }
            ArrayList c = c(list, b2, dla.b(context));
            ArrayList arrayList2 = new ArrayList(k13.r(c, 10));
            Iterator it = c.iterator();
            while (it.hasNext()) {
                mi6 mi6Var3 = (mi6) it.next();
                arrayList2.add(new oo5(mi6Var3, f(mi6Var3.c)));
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                ri6 ri6Var2 = ((oo5) obj).b;
                if (ri6Var2 != null && !ri6Var2.equals(pi6Var)) {
                    break;
                }
            }
            oo5 oo5Var = (oo5) obj;
            if (oo5Var != null) {
                oo5Var.toString();
                e();
                b = oo5Var;
            } else {
                if (mi6Var != null) {
                    oo5 b3 = b(a.c(mi6Var));
                    if (b3 == null || (ri6Var = b3.b) == null) {
                        ri6Var = pi6Var;
                    }
                    g(ri6Var, mi6Var.c);
                    oo5 oo5Var2 = new oo5(mi6Var, ri6Var);
                    if (!ri6Var.equals(pi6Var)) {
                        ri6Var.a();
                        e();
                        nv.a(context, ri6Var.a());
                        b = oo5Var2;
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (((oo5) next).b == null) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(((oo5) it4.next()).a);
                }
                if (arrayList4.isEmpty()) {
                    e();
                } else {
                    b = b(arrayList4);
                    if (b != null) {
                        mi6 mi6Var4 = b.a;
                        ri6 ri6Var3 = b.b;
                        if (ri6Var3 != null) {
                            g(ri6Var3, mi6Var4.c);
                            b.toString();
                            e();
                            if (!ri6Var3.equals(pi6Var)) {
                                nv.a(context, ri6Var3.a());
                            }
                        }
                    } else {
                        e();
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            String str = ((mi6) it5.next()).c;
                            SharedPreferences.Editor edit = this.a.edit();
                            edit.getClass();
                            edit.putString(str, "none");
                            edit.apply();
                        }
                    }
                }
                b = null;
            }
            this.d = b;
            if (b != null) {
            }
            Objects.toString(b != null ? b.b : null);
            e();
            this.e = true;
        }
    }
}
