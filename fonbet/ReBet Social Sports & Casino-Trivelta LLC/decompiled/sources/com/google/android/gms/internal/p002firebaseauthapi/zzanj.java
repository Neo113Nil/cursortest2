package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzanj implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzang zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        Map map;
        int i11 = this.zza + 1;
        i10 = this.zzd.zzb;
        if (i11 >= i10) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i10;
        Object[] objArr;
        this.zzb = true;
        int i11 = this.zza + 1;
        this.zza = i11;
        i10 = this.zzd.zzb;
        if (i11 >= i10) {
            return (Map.Entry) zza().next();
        }
        objArr = this.zzd.zza;
        return (zzank) objArr[this.zza];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        this.zzd.zzg();
        int i11 = this.zza;
        i10 = this.zzd.zzb;
        if (i11 >= i10) {
            zza().remove();
            return;
        }
        zzang zzangVar = this.zzd;
        int i12 = this.zza;
        this.zza = i12 - 1;
        zzangVar.zzb(i12);
    }

    private zzanj(zzang zzangVar) {
        Objects.requireNonNull(zzangVar);
        this.zzd = zzangVar;
        this.zza = -1;
    }
}
