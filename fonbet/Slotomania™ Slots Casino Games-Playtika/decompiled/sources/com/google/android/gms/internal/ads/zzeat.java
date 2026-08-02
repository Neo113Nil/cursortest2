package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzeat implements zzeai {
    private final long zza;
    private final zzesy zzb;

    zzeat(long j, Context context, zzeam zzeamVar, zzcmx zzcmxVar, String str) {
        this.zza = j;
        zzfhy zzn = zzcmxVar.zzn();
        zzn.zzd(context);
        zzn.zzb(new com.google.android.gms.ads.internal.client.zzr());
        zzn.zzc(str);
        zzesy zza = zzn.zza().zza();
        this.zzb = zza;
        zza.zzdS(new zzeas(this, zzeamVar));
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zzb.zze(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zzb() {
        this.zzb.zzR(ObjectWrapper.wrap(null));
    }

    @Override // com.google.android.gms.internal.ads.zzeai
    public final void zzc() {
        this.zzb.zzc();
    }

    final /* synthetic */ long zzd() {
        return this.zza;
    }
}
