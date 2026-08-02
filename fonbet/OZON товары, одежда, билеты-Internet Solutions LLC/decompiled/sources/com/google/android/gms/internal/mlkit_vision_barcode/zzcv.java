package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Set;

/* loaded from: classes9.dex */
public abstract class zzcv extends zzcn implements Set {
    private transient zzcs zza;

    zzcv() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzds.zzb(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzds.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzdu iterator();

    public final zzcs zzf() {
        zzcs zzcsVar = this.zza;
        if (zzcsVar != null) {
            return zzcsVar;
        }
        zzcs zzg = zzg();
        this.zza = zzg;
        return zzg;
    }

    zzcs zzg() {
        Object[] array = toArray();
        int i11 = zzcs.zzd;
        return zzcs.zzg(array, array.length);
    }
}
