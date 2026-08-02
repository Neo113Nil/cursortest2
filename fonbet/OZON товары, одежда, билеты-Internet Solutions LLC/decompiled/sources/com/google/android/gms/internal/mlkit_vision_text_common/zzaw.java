package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
abstract class zzaw implements Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ zzba zze;

    /* synthetic */ zzaw(zzba zzbaVar, zzav zzavVar) {
        int i11;
        this.zze = zzbaVar;
        i11 = zzbaVar.zzf;
        this.zzb = i11;
        this.zzc = zzbaVar.zze();
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
        zzx.zzd(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i11 = this.zzd;
        zzba zzbaVar = this.zze;
        zzbaVar.remove(zzba.zzg(zzbaVar, i11));
        this.zzc--;
        this.zzd = -1;
    }

    abstract Object zza(int i11);
}
