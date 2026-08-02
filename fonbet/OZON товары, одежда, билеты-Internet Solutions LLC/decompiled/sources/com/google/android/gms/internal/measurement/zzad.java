package com.google.android.gms.internal.measurement;

import Ej.b;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb >= this.zza.zzc()) {
            throw new NoSuchElementException(b.a(this.zzb, "Out of bounds index: "));
        }
        zzae zzaeVar = this.zza;
        int i11 = this.zzb;
        this.zzb = i11 + 1;
        return zzaeVar.zze(i11);
    }
}
