package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzgk implements Iterator {
    final /* synthetic */ zzgo zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzgk(zzgo zzgoVar, zzgj zzgjVar) {
        this.zza = zzgoVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11;
        Map map;
        int i12 = this.zzb + 1;
        zzgo zzgoVar = this.zza;
        i11 = zzgoVar.zzb;
        if (i12 < i11) {
            return true;
        }
        map = zzgoVar.zzc;
        return !map.isEmpty() && zza().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i11;
        Object[] objArr;
        this.zzc = true;
        int i12 = this.zzb + 1;
        this.zzb = i12;
        zzgo zzgoVar = this.zza;
        i11 = zzgoVar.zzb;
        if (i12 >= i11) {
            return (Map.Entry) zza().next();
        }
        objArr = zzgoVar.zza;
        return (zzgi) objArr[i12];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i11;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i12 = this.zzb;
        zzgo zzgoVar = this.zza;
        i11 = zzgoVar.zzb;
        if (i12 >= i11) {
            zza().remove();
        } else {
            this.zzb = i12 - 1;
            zzgoVar.zzm(i12);
        }
    }
}
