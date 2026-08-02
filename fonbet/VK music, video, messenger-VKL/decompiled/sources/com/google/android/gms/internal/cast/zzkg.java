package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzkg implements Iterator {
    final /* synthetic */ zzkh zza;
    private int zzb;

    public zzkg(zzkh zzkhVar) {
        Objects.requireNonNull(zzkhVar);
        this.zza = zzkhVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzkh zzkhVar = this.zza;
        return i < zzkhVar.zzb() - zzkhVar.zza();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zzb;
        zzkh zzkhVar = this.zza;
        if (i >= zzkhVar.zzb() - zzkhVar.zza()) {
            throw new NoSuchElementException();
        }
        zzki zzkiVar = zzkhVar.zzb;
        Object obj = zzkiVar.zzb()[zzkhVar.zza() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
