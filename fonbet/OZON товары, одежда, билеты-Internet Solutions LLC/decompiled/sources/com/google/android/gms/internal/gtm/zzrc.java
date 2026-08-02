package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* loaded from: classes9.dex */
final class zzrc implements Iterator<zzqw<?>> {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ Iterator zzb;

    zzrc(zzrd zzrdVar, Iterator it, Iterator it2) {
        this.zza = it;
        this.zzb = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzqw<?> next() {
        return this.zza.hasNext() ? ((zzrb) this.zza).next() : (zzqw) this.zzb.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
