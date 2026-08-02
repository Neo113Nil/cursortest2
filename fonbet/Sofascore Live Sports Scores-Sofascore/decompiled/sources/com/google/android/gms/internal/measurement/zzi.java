package com.google.android.gms.internal.measurement;

import defpackage.a70;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzi {
    public static zzao a(Object obj) {
        if (obj == null) {
            return zzao.J7;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                a70.p("Invalid value type");
                return null;
            }
            zzae zzaeVar = new zzae();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.o(zzaeVar.m(), a(it.next()));
            }
            return zzaeVar;
        }
        zzal zzalVar = new zzal();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            zzao a = a(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                zzalVar.a((String) obj2, a);
            }
        }
        return zzalVar;
    }

    public static zzao b(zzje zzjeVar) {
        if (zzjeVar == null) {
            return zzao.I7;
        }
        int G = zzjeVar.G() - 1;
        if (G == 1) {
            return zzjeVar.A() ? new zzas(zzjeVar.B()) : zzao.P7;
        }
        if (G == 2) {
            return zzjeVar.E() ? new zzah(Double.valueOf(zzjeVar.F())) : new zzah(null);
        }
        if (G == 3) {
            return zzjeVar.C() ? new zzaf(Boolean.valueOf(zzjeVar.D())) : new zzaf(null);
        }
        if (G != 4) {
            a70.p("Unknown type found. Cannot convert entity");
            return null;
        }
        List y = zzjeVar.y();
        ArrayList arrayList = new ArrayList();
        Iterator it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(b((zzje) it.next()));
        }
        return new zzap(zzjeVar.z(), arrayList);
    }
}
