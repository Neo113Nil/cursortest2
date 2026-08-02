package com.google.android.gms.internal.gtm;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
final class zzrg implements Iterator<zzqw<?>> {
    final /* synthetic */ zzrh zza;
    private int zzb = 0;

    zzrg(zzrh zzrhVar) {
        this.zza = zzrhVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i11 = this.zzb;
        str = this.zza.zzc;
        return i11 < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ zzqw<?> next() {
        String str;
        int i11 = this.zzb;
        str = this.zza.zzc;
        if (i11 >= str.length()) {
            throw new NoSuchElementException();
        }
        int i12 = this.zzb;
        this.zzb = i12 + 1;
        return new zzqy(Double.valueOf(i12));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
