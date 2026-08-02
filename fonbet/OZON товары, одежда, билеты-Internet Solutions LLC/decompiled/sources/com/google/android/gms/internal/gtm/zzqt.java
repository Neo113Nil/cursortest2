package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* loaded from: classes9.dex */
final class zzqt implements Iterator<zzqw<?>> {
    final /* synthetic */ Iterator zza;

    zzqt(zzqw zzqwVar, Iterator it) {
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzqw<?> next() {
        return new zzrh((String) this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
    }
}
