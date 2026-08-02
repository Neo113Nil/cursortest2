package defpackage;

import com.google.android.gms.internal.measurement.zzahn;
import com.google.android.gms.internal.measurement.zzhf;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzij;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzpk;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ddp {
    public final String a;
    public final boolean b;
    public final zzii c;
    public final BitSet d;
    public final BitSet e;
    public final dh0 f;
    public final dh0 g;
    public final /* synthetic */ t9n h;

    public ddp(t9n t9nVar, String str, zzii zziiVar, BitSet bitSet, BitSet bitSet2, dh0 dh0Var, dh0 dh0Var2) {
        this.h = t9nVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = dh0Var;
        this.g = new dh0(0);
        Iterator it = ((ah0) dh0Var2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) dh0Var2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = zziiVar;
    }

    public final void a(t6d t6dVar) {
        int c = t6dVar.c();
        if (((Boolean) t6dVar.c) != null) {
            this.e.set(c, true);
        }
        Boolean bool = (Boolean) t6dVar.d;
        if (bool != null) {
            this.d.set(c, bool.booleanValue());
        }
        if (((Long) t6dVar.e) != null) {
            Integer valueOf = Integer.valueOf(c);
            dh0 dh0Var = this.f;
            Long l = (Long) dh0Var.get(valueOf);
            long longValue = ((Long) t6dVar.e).longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                dh0Var.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (((Long) t6dVar.f) != null) {
            Integer valueOf2 = Integer.valueOf(c);
            dh0 dh0Var2 = this.g;
            List list = (List) dh0Var2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                dh0Var2.put(valueOf2, list);
            }
            if (t6dVar.d()) {
                list.clear();
            }
            zzahn.a();
            zzic zzicVar = (zzic) this.h.b;
            zzal zzalVar = zzicVar.d;
            zzfx zzfxVar = zzfy.F0;
            String str = this.a;
            if (zzalVar.b0(str, zzfxVar) && t6dVar.e()) {
                list.clear();
            }
            zzahn.a();
            boolean b0 = zzicVar.d.b0(str, zzfxVar);
            Long l2 = (Long) t6dVar.f;
            if (!b0) {
                list.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(l2.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final zzhg b(int i) {
        List list;
        zzhf F = zzhg.F();
        F.k();
        ((zzhg) F.b).G(i);
        F.k();
        ((zzhg) F.b).J(this.b);
        zzii zziiVar = this.c;
        if (zziiVar != null) {
            F.k();
            ((zzhg) F.b).I(zziiVar);
        }
        zzih G = zzii.G();
        ArrayList w0 = zzpk.w0(this.d);
        G.k();
        ((zzii) G.b).K(w0);
        ArrayList w02 = zzpk.w0(this.e);
        G.k();
        ((zzii) G.b).I(w02);
        dh0 dh0Var = this.f;
        ArrayList arrayList = new ArrayList(dh0Var.c);
        Iterator it = ((ah0) dh0Var.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            Long l = (Long) dh0Var.get(num);
            if (l != null) {
                zzhp C = zzhq.C();
                C.k();
                ((zzhq) C.b).D(intValue);
                long longValue = l.longValue();
                C.k();
                ((zzhq) C.b).E(longValue);
                arrayList.add((zzhq) C.m());
            }
        }
        G.k();
        ((zzii) G.b).M(arrayList);
        dh0 dh0Var2 = this.g;
        if (dh0Var2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(dh0Var2.c);
            Iterator it2 = ((ah0) dh0Var2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                zzij D = zzik.D();
                int intValue2 = num2.intValue();
                D.k();
                ((zzik) D.b).E(intValue2);
                List list2 = (List) dh0Var2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    D.k();
                    ((zzik) D.b).F(list2);
                }
                arrayList2.add((zzik) D.m());
            }
            list = arrayList2;
        }
        G.k();
        ((zzii) G.b).O(list);
        F.k();
        ((zzhg) F.b).H((zzii) G.m());
        return (zzhg) F.m();
    }

    public ddp(t9n t9nVar, String str) {
        this.h = t9nVar;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new dh0(0);
        this.g = new dh0(0);
    }
}
