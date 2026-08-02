package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzfoh {
    final /* synthetic */ zzfoq zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfoh(zzfoq zzfoqVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfoqVar);
        this.zza = zzfoqVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfop zza(Callable callable) {
        List list = this.zzc;
        zzhbh zzp = zzhbi.zzp(list);
        ListenableFuture zza = zzp.zza(zzfog.zza, zzcff.zzh);
        zzfoq zzfoqVar = this.zza;
        return new zzfop(zzfoqVar, this.zzb, null, zza, list, zzp.zza(callable, zzfoqVar.zze()), null);
    }
}
