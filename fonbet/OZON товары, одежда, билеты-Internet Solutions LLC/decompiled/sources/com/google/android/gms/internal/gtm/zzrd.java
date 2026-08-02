package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import g.C6594f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzrd extends zzqw<List<zzqw<?>>> {
    private static final Map<String, zzjt> zzb;
    private final ArrayList<zzqw<?>> zzc;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("concat", new zzjw());
        hashMap.put("every", new zzjx());
        hashMap.put("filter", new zzjy());
        hashMap.put("forEach", new zzjz());
        hashMap.put("indexOf", new zzka());
        hashMap.put("hasOwnProperty", zzlu.zza);
        hashMap.put("join", new zzkb());
        hashMap.put("lastIndexOf", new zzkc());
        hashMap.put("map", new zzkd());
        hashMap.put("pop", new zzke());
        hashMap.put("push", new zzkf());
        hashMap.put("reduce", new zzkg());
        hashMap.put("reduceRight", new zzkh());
        hashMap.put("reverse", new zzki());
        hashMap.put("shift", new zzkj());
        hashMap.put("slice", new zzkk());
        hashMap.put("some", new zzkl());
        hashMap.put("sort", new zzkp());
        hashMap.put("splice", new zzkq());
        hashMap.put("toString", new zzmw());
        hashMap.put("unshift", new zzkr());
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzrd(List<zzqw<?>> list) {
        Preconditions.checkNotNull(list);
        this.zzc = new ArrayList<>(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrd)) {
            return false;
        }
        ArrayList<zzqw<?>> arrayList = ((zzrd) obj).zzc;
        if (this.zzc.size() != arrayList.size()) {
            return false;
        }
        boolean z11 = true;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            z11 = this.zzc.get(i11) == null ? arrayList.get(i11) == null : this.zzc.get(i11).equals(arrayList.get(i11));
            if (!z11) {
                return z11;
            }
        }
        return z11;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    /* renamed from: toString */
    public final String zzc() {
        return this.zzc.toString();
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final zzjt zza(String str) {
        if (zzg(str)) {
            return zzb.get(str);
        }
        throw new IllegalStateException(C6594f.a("Native Method ", str, " is not defined for type ListWrapper.", new StringBuilder(String.valueOf(str).length() + 51)));
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final /* bridge */ /* synthetic */ List<zzqw<?>> zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final Iterator<zzqw<?>> zze() {
        return new zzrc(this, new zzrb(this), zzd());
    }

    @Override // com.google.android.gms.internal.gtm.zzqw
    public final boolean zzg(String str) {
        return zzb.containsKey(str);
    }

    public final zzqw<?> zzi(int i11) {
        if (i11 < 0 || i11 >= this.zzc.size()) {
            return zzra.zze;
        }
        zzqw<?> zzqwVar = this.zzc.get(i11);
        return zzqwVar == null ? zzra.zze : zzqwVar;
    }

    public final List<zzqw<?>> zzk() {
        return this.zzc;
    }

    public final void zzl(int i11, zzqw<?> zzqwVar) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i11 >= this.zzc.size()) {
            zzm(i11 + 1);
        }
        this.zzc.set(i11, zzqwVar);
    }

    public final void zzm(int i11) {
        Preconditions.checkArgument(i11 >= 0, "Invalid array length");
        if (this.zzc.size() == i11) {
            return;
        }
        if (this.zzc.size() >= i11) {
            ArrayList<zzqw<?>> arrayList = this.zzc;
            arrayList.subList(i11, arrayList.size()).clear();
            return;
        }
        this.zzc.ensureCapacity(i11);
        for (int size = this.zzc.size(); size < i11; size++) {
            this.zzc.add(null);
        }
    }

    public final boolean zzn(int i11) {
        return i11 >= 0 && i11 < this.zzc.size() && this.zzc.get(i11) != null;
    }
}
