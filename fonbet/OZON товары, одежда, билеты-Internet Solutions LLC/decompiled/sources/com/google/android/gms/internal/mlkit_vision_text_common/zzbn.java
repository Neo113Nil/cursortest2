package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Set;

/* loaded from: classes9.dex */
public abstract class zzbn extends zzbf implements Set {
    private transient zzbk zza;

    zzbn() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzcl.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzco iterator();

    public final zzbk zzf() {
        zzbk zzbkVar = this.zza;
        if (zzbkVar != null) {
            return zzbkVar;
        }
        zzbk zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    zzbk zzg() {
        Object[] array = toArray();
        int i11 = zzbk.zzd;
        return zzbk.zzg(array, array.length);
    }
}
