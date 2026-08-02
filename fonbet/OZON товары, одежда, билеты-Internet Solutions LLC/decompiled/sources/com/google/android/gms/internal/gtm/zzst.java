package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
final class zzst extends zzsw {
    final /* synthetic */ zztd zza;
    private int zzb = 0;
    private final int zzc;

    zzst(zztd zztdVar) {
        this.zza = zztdVar;
        this.zzc = zztdVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzsy
    public final byte zza() {
        int i11 = this.zzb;
        if (i11 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i11 + 1;
        return this.zza.zzb(i11);
    }
}
