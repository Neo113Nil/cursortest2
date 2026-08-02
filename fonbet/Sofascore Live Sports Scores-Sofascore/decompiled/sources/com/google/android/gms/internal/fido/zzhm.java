package com.google.android.gms.internal.fido;

import defpackage.a70;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhm extends zzhp {
    public final int a;
    public final zzcj b;

    public zzhm(zzcj zzcjVar) {
        zzcjVar.getClass();
        this.b = zzcjVar;
        zzdc it = zzcjVar.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int a = ((zzhp) entry.getKey()).a();
            i = i < a ? a : i;
            int a2 = ((zzhp) entry.getValue()).a();
            if (i < a2) {
                i = a2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        zzhp zzhpVar = (zzhp) obj;
        int zza = zzhpVar.zza();
        int c = zzhp.c((byte) -96);
        if (c != zza) {
            return c - zzhpVar.zza();
        }
        zzcj zzcjVar = ((zzhm) zzhpVar).b;
        zzcj zzcjVar2 = this.b;
        if (zzcjVar2.d.size() != zzcjVar.d.size()) {
            return zzcjVar2.d.size() - zzcjVar.d.size();
        }
        zzdc it = zzcjVar2.entrySet().iterator();
        zzdc it2 = zzcjVar.entrySet().iterator();
        do {
            if (!it.hasNext() && !it2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compareTo2 = ((zzhp) entry.getKey()).compareTo((zzhp) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((zzhp) entry.getValue()).compareTo((zzhp) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhm.class == obj.getClass()) {
            return this.b.equals(((zzhm) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.c((byte) -96)), this.b});
    }

    public final String toString() {
        zzcj zzcjVar = this.b;
        if (zzcjVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zzdc it = zzcjVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((zzhp) entry.getKey()).toString().replace("\n", "\n  "), ((zzhp) entry.getValue()).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVar = new zzbd();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            zzbc.a(sb, linkedHashMap.entrySet().iterator(), zzbdVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            a70.j(e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.c((byte) -96);
    }
}
