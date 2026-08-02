package com.google.android.gms.internal.tapandpay;

import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
final class zzas extends zzax {
    boolean zza;
    final /* synthetic */ Object zzb;

    zzas(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza) {
            throw new NoSuchElementException();
        }
        this.zza = true;
        return this.zzb;
    }
}
