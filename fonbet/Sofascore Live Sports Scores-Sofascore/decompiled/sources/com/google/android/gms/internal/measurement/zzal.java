package com.google.android.gms.internal.measurement;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.hgn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzal implements zzao, zzak {
    public final HashMap a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void a(String str, zzao zzaoVar) {
        HashMap hashMap = this.a;
        if (zzaoVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, zzaoVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public zzao c(String str, zzg zzgVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(toString()) : zzak.b(this, new zzas(str), zzgVar, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzal) {
            return this.a.equals(((zzal) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final Iterator zzf() {
        return new hgn(this.a.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return this.a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        HashMap hashMap = this.a;
        return hashMap.containsKey(str) ? (zzao) hashMap.get(str) : zzao.I7;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao zzt() {
        zzal zzalVar = new zzal();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof zzak;
            HashMap hashMap = zzalVar.a;
            if (z) {
                hashMap.put((String) entry.getKey(), (zzao) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((zzao) entry.getValue()).zzt());
            }
        }
        return zzalVar;
    }
}
