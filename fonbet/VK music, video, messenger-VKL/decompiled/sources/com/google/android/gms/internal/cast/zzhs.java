package com.google.android.gms.internal.cast;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzhs extends zzhp {
    public zzhs() {
        super(4);
    }

    public final zzhs zzb(Object obj) {
        obj.getClass();
        int length = this.zza.length;
        int zza = zzhq.zza(length, this.zzb + 1);
        if (zza > length || this.zzc) {
            this.zza = Arrays.copyOf(this.zza, zza);
            this.zzc = false;
        }
        Object[] objArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        objArr[i] = obj;
        return this;
    }

    public final zzhv zzc() {
        this.zzc = true;
        return zzhv.zzk(this.zza, this.zzb);
    }
}
