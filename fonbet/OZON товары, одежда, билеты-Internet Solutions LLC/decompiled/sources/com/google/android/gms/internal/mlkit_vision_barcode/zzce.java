package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
abstract class zzce implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzci zze;

    /* synthetic */ zzce(zzci zzciVar, zzcd zzcdVar) {
        int i11;
        this.zze = zzciVar;
        i11 = zzciVar.zzf;
        this.zzb = i11;
        this.zzc = zzciVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i11;
        i11 = this.zze.zzf;
        if (i11 != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i11 = this.zzc;
        this.zzd = i11;
        Object zza = zza(i11);
        this.zzc = this.zze.zzf(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzaz.zzf(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i11 = this.zzd;
        zzci zzciVar = this.zze;
        zzciVar.remove(zzci.zzg(zzciVar, i11));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i11);
}
