package com.google.android.gms.internal.fido;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes7.dex */
final class zzfe implements Iterator {
    final /* synthetic */ zzff zza;
    private int zzb = 0;

    zzfe(zzff zzffVar) {
        this.zza = zzffVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb;
        zzff zzffVar = this.zza;
        return i < zzffVar.zza() - zzffVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int i = this.zzb;
        zzff zzffVar = this.zza;
        if (i >= zzffVar.zza() - zzffVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzff zzffVar2 = this.zza;
        objArr = zzffVar2.zzb.zzb;
        Object obj = objArr[zzffVar2.zzb() + i];
        this.zzb = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
