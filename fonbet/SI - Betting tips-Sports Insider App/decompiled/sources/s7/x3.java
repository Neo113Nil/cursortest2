package s7;

import com.google.android.gms.internal.measurement.t7;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23242a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23243b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.l3 f23244c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f23245d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f23246e;

    /* renamed from: f, reason: collision with root package name */
    public final s.e f23247f;

    /* renamed from: g, reason: collision with root package name */
    public final s.e f23248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c f23249h;

    public x3(c cVar, String str, com.google.android.gms.internal.measurement.l3 l3Var, BitSet bitSet, BitSet bitSet2, s.e eVar, s.e eVar2) {
        this.f23249h = cVar;
        this.f23242a = str;
        this.f23245d = bitSet;
        this.f23246e = bitSet2;
        this.f23247f = eVar;
        this.f23248g = new s.e(0);
        Iterator it = ((s.b) eVar2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.f23248g.put(num, arrayList);
        }
        this.f23243b = false;
        this.f23244c = l3Var;
    }

    public final void a(b bVar) {
        int q;
        boolean z5;
        boolean v5;
        switch (bVar.f22655g) {
            case 0:
                q = ((com.google.android.gms.internal.measurement.n1) bVar.f22657i).q();
                break;
            default:
                q = ((com.google.android.gms.internal.measurement.u1) bVar.f22657i).q();
                break;
        }
        if (bVar.f22651c != null) {
            this.f23246e.set(q, true);
        }
        Boolean bool = bVar.f22652d;
        if (bool != null) {
            this.f23245d.set(q, bool.booleanValue());
        }
        if (bVar.f22653e != null) {
            Integer valueOf = Integer.valueOf(q);
            s.e eVar = this.f23247f;
            Long l6 = (Long) eVar.get(valueOf);
            long longValue = bVar.f22653e.longValue() / 1000;
            if (l6 == null || longValue > l6.longValue()) {
                eVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (bVar.f22654f != null) {
            Integer valueOf2 = Integer.valueOf(q);
            s.e eVar2 = this.f23248g;
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(valueOf2, list);
            }
            switch (bVar.f22655g) {
                case 0:
                    z5 = false;
                    break;
                default:
                    z5 = true;
                    break;
            }
            if (z5) {
                list.clear();
            }
            t7.a();
            f1 f1Var = (f1) this.f23249h.f3328a;
            e eVar3 = f1Var.f22743d;
            w wVar = x.G0;
            String str = this.f23242a;
            if (eVar3.t(str, wVar)) {
                switch (bVar.f22655g) {
                    case 0:
                        v5 = ((com.google.android.gms.internal.measurement.n1) bVar.f22657i).v();
                        break;
                    default:
                        v5 = false;
                        break;
                }
                if (v5) {
                    list.clear();
                }
            }
            t7.a();
            if (!f1Var.f22743d.t(str, wVar)) {
                list.add(Long.valueOf(bVar.f22654f.longValue() / 1000));
                return;
            }
            Long valueOf3 = Long.valueOf(bVar.f22654f.longValue() / 1000);
            if (list.contains(valueOf3)) {
                return;
            }
            list.add(valueOf3);
        }
    }

    public final com.google.android.gms.internal.measurement.s2 b(int i5) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.r2 w10 = com.google.android.gms.internal.measurement.s2.w();
        w10.b();
        ((com.google.android.gms.internal.measurement.s2) w10.f5041b).x(i5);
        w10.b();
        ((com.google.android.gms.internal.measurement.s2) w10.f5041b).A(this.f23243b);
        com.google.android.gms.internal.measurement.l3 l3Var = this.f23244c;
        if (l3Var != null) {
            w10.b();
            ((com.google.android.gms.internal.measurement.s2) w10.f5041b).z(l3Var);
        }
        com.google.android.gms.internal.measurement.k3 x10 = com.google.android.gms.internal.measurement.l3.x();
        ArrayList R = r0.R(this.f23245d);
        x10.b();
        ((com.google.android.gms.internal.measurement.l3) x10.f5041b).B(R);
        ArrayList R2 = r0.R(this.f23246e);
        x10.b();
        ((com.google.android.gms.internal.measurement.l3) x10.f5041b).z(R2);
        s.e eVar = this.f23247f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f22575c);
            Iterator it = ((s.b) eVar.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                Long l6 = (Long) eVar.get(num);
                if (l6 != null) {
                    com.google.android.gms.internal.measurement.x2 t3 = com.google.android.gms.internal.measurement.y2.t();
                    t3.b();
                    ((com.google.android.gms.internal.measurement.y2) t3.f5041b).u(intValue);
                    long longValue = l6.longValue();
                    t3.b();
                    ((com.google.android.gms.internal.measurement.y2) t3.f5041b).v(longValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.y2) t3.f());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            x10.b();
            ((com.google.android.gms.internal.measurement.l3) x10.f5041b).D(arrayList);
        }
        s.e eVar2 = this.f23248g;
        if (eVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f22575c);
            Iterator it2 = ((s.b) eVar2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.m3 u10 = com.google.android.gms.internal.measurement.n3.u();
                int intValue2 = num2.intValue();
                u10.b();
                ((com.google.android.gms.internal.measurement.n3) u10.f5041b).v(intValue2);
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    u10.b();
                    ((com.google.android.gms.internal.measurement.n3) u10.f5041b).w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.n3) u10.f());
            }
            list = arrayList3;
        }
        x10.b();
        ((com.google.android.gms.internal.measurement.l3) x10.f5041b).F(list);
        w10.b();
        ((com.google.android.gms.internal.measurement.s2) w10.f5041b).y((com.google.android.gms.internal.measurement.l3) x10.f());
        return (com.google.android.gms.internal.measurement.s2) w10.f();
    }

    public x3(c cVar, String str) {
        this.f23249h = cVar;
        this.f23242a = str;
        this.f23243b = true;
        this.f23245d = new BitSet();
        this.f23246e = new BitSet();
        this.f23247f = new s.e(0);
        this.f23248g = new s.e(0);
    }
}
