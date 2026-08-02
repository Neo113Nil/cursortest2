package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzeqp implements zzelg {
    private final Context zza;
    private final zzcwe zzb;
    private final zzbiz zzc;
    private final zzhbs zzd;
    private final zzfoy zze;

    public zzeqp(Context context, zzcwe zzcweVar, zzfoy zzfoyVar, zzhbs zzhbsVar, zzbiz zzbizVar) {
        this.zza = context;
        this.zzb = zzcweVar;
        this.zze = zzfoyVar;
        this.zzd = zzhbsVar;
        this.zzc = zzbizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final boolean zza(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzfjy zzfjyVar;
        return (this.zzc == null || (zzfjyVar = zzfjtVar.zzs) == null || zzfjyVar.zza == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final ListenableFuture zzb(zzfke zzfkeVar, zzfjt zzfjtVar) {
        zzeql zzeqlVar = new zzeql(this, new View(this.zza), null, zzeqn.zza, (zzfju) zzfjtVar.zzu.get(0));
        zzcva zzf = this.zzb.zzf(new zzcxx(zzfkeVar, zzfjtVar, null), zzeqlVar);
        zzeqo zzl = zzf.zzl();
        zzfjy zzfjyVar = zzfjtVar.zzs;
        final zzbiu zzbiuVar = new zzbiu(zzl, zzfjyVar.zzb, zzfjyVar.zza);
        zzfos zzfosVar = zzfos.CUSTOM_RENDER_SYN;
        zzfoy zzfoyVar = this.zze;
        Objects.requireNonNull(zzfoyVar);
        return zzfoj.zzd(new zzfoe() { // from class: com.google.android.gms.internal.ads.zzeqm
            @Override // com.google.android.gms.internal.ads.zzfoe
            public final /* synthetic */ void zza() {
                zzeqp.this.zzc(zzbiuVar);
            }
        }, this.zzd, zzfosVar, zzfoyVar).zzj(zzfos.CUSTOM_RENDER_ACK).zze(zzhbi.zza(zzf.zzi())).zzi();
    }

    final /* synthetic */ void zzc(zzbiu zzbiuVar) {
        this.zzc.zze(zzbiuVar);
    }
}
