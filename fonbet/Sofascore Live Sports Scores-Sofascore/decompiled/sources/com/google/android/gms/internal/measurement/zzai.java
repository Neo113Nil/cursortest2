package com.google.android.gms.internal.measurement;

import defpackage.hgn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzai implements zzao, zzak {
    public final String a;
    public final HashMap b = new HashMap();

    public zzai(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final void a(String str, zzao zzaoVar) {
        HashMap hashMap = this.b;
        if (zzaoVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, zzaoVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final zzao c(String str, zzg zzgVar, ArrayList arrayList) {
        return "toString".equals(str) ? new zzas(this.a) : zzak.b(this, new zzas(str), zzgVar, arrayList);
    }

    public abstract zzao d(zzg zzgVar, List list);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzai)) {
            return false;
        }
        zzai zzaiVar = (zzai) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(zzaiVar.a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public final String zzc() {
        return this.a;
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
        return new hgn(this.b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final boolean zzj(String str) {
        return this.b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.zzak
    public final zzao zzk(String str) {
        HashMap hashMap = this.b;
        return hashMap.containsKey(str) ? (zzao) hashMap.get(str) : zzao.I7;
    }

    @Override // com.google.android.gms.internal.measurement.zzao
    public zzao zzt() {
        return this;
    }
}
