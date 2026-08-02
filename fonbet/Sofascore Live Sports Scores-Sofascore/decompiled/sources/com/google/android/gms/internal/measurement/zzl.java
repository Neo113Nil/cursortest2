package com.google.android.gms.internal.measurement;

import defpackage.a70;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzl extends zzal {
    public final zzab b;

    public zzl(zzab zzabVar) {
        this.b = zzabVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzao
    public final zzao c(String str, zzg zzgVar, ArrayList arrayList) {
        int hashCode = str.hashCode();
        zzab zzabVar = this.b;
        switch (hashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    zzh.a(0, "getEventName", arrayList);
                    return new zzas(zzabVar.b.a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    zzh.a(0, "getTimestamp", arrayList);
                    return new zzah(Double.valueOf(zzabVar.b.b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    zzh.a(1, "getParamValue", arrayList);
                    String zzc = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    HashMap hashMap = zzabVar.b.c;
                    return zzi.a(hashMap.containsKey(zzc) ? hashMap.get(zzc) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    zzh.a(0, "getParams", arrayList);
                    HashMap hashMap2 = zzabVar.b.c;
                    zzal zzalVar = new zzal();
                    for (String str2 : hashMap2.keySet()) {
                        zzalVar.a(str2, zzi.a(hashMap2.get(str2)));
                    }
                    return zzalVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    zzh.a(2, "setParamValue", arrayList);
                    String zzc2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0)).zzc();
                    zzao b = zzgVar.b.b(zzgVar, (zzao) arrayList.get(1));
                    zzaa zzaaVar = zzabVar.b;
                    Object i = zzh.i(b);
                    HashMap hashMap3 = zzaaVar.c;
                    if (i == null) {
                        hashMap3.remove(zzc2);
                        return b;
                    }
                    hashMap3.put(zzc2, zzaa.b(hashMap3.get(zzc2), i, zzc2));
                    return b;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    zzh.a(1, "setEventName", arrayList);
                    zzao b2 = zzgVar.b.b(zzgVar, (zzao) arrayList.get(0));
                    if (zzao.I7.equals(b2) || zzao.J7.equals(b2)) {
                        a70.p("Illegal event name");
                        return null;
                    }
                    zzabVar.b.a = b2.zzc();
                    return new zzas(b2.zzc());
                }
                break;
        }
        return super.c(str, zzgVar, arrayList);
    }
}
