package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a5e {
    public final k9 a;
    public final ArrayList b;
    public final ArrayList c;
    public final LinkedHashMap d;
    public int e;
    public final g62 f;
    public final g62 g;
    public final LinkedHashMap h;
    public final ejg i;

    public a5e(k9 k9Var) {
        this.a = k9Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.d = new LinkedHashMap();
        this.f = ml4.g(-1, 6, null);
        this.g = ml4.g(-1, 6, null);
        this.h = new LinkedHashMap();
        ejg ejgVar = new ejg(13);
        ejgVar.C(sfb.a, ofb.b);
        this.i = ejgVar;
    }

    public final c7e a(tvk tvkVar) {
        Integer num;
        k9 k9Var = this.a;
        int i = k9Var.a;
        ArrayList arrayList = this.c;
        List S0 = CollectionsKt.S0(arrayList);
        if (tvkVar != null) {
            int i2 = tvkVar.e;
            int i3 = -this.e;
            int size = (arrayList.size() - 1) - this.e;
            int i4 = 0;
            int i5 = i3;
            while (i5 < i2) {
                i4 += i5 > size ? i : ((z6e) arrayList.get(this.e + i5)).a.size();
                i5++;
            }
            int i6 = i4 + tvkVar.f;
            if (i2 < i3) {
                i6 -= i;
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        return new c7e(S0, num, k9Var, 0);
    }

    public final int b() {
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((z6e) it.next()).a.size();
        }
        return i;
    }

    public final boolean c(int i, sfb sfbVar, z6e z6eVar, Object obj) {
        sfbVar.getClass();
        z6eVar.getClass();
        int i2 = z6eVar.c;
        List list = z6eVar.a;
        int i3 = z6eVar.d;
        int ordinal = sfbVar.ordinal();
        LinkedHashMap linkedHashMap = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (ordinal == 0) {
            if (!arrayList2.isEmpty()) {
                a70.r("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                a70.r("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(z6eVar);
            linkedHashMap.put(Integer.valueOf(z6eVar.hashCode()), obj);
            this.e = 0;
            Unit unit = Unit.a;
            return true;
        }
        LinkedHashMap linkedHashMap2 = this.h;
        if (ordinal != 1) {
            if (ordinal != 2) {
                zzl.b();
                return false;
            }
            if (arrayList2.isEmpty()) {
                a70.r("should've received an init before append");
                return false;
            }
            if (i == 0) {
                arrayList.add(z6eVar);
                linkedHashMap.put(Integer.valueOf(z6eVar.hashCode()), obj);
                if (i3 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap2.remove(sfb.c);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                a70.r("should've received an init before prepend");
                return false;
            }
            if (i == 0) {
                arrayList.add(0, z6eVar);
                linkedHashMap.put(Integer.valueOf(z6eVar.hashCode()), obj);
                this.e++;
                if (i2 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap2.remove(sfb.b);
                return true;
            }
        }
        return false;
    }

    public final z3e d(z6e z6eVar, sfb sfbVar) {
        z6eVar.getClass();
        int ordinal = sfbVar.ordinal();
        int i = 0;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 0 - this.e;
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return null;
                }
                i = (this.c.size() - this.e) - 1;
            }
        }
        List c = a.c(new zvj(i, z6eVar.a));
        int ordinal2 = sfbVar.ordinal();
        ejg ejgVar = this.i;
        if (ordinal2 == 0) {
            rfb F = ejgVar.F();
            c.getClass();
            return new z3e(sfb.a, c, 0, 0, F, null);
        }
        if (ordinal2 == 1) {
            rfb F2 = ejgVar.F();
            c.getClass();
            return new z3e(sfb.b, c, 0, -1, F2, null);
        }
        if (ordinal2 != 2) {
            zzl.b();
            return null;
        }
        rfb F3 = ejgVar.F();
        c.getClass();
        return new z3e(sfb.c, c, -1, 0, F3, null);
    }
}
