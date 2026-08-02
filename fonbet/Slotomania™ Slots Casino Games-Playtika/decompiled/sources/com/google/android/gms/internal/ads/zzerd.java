package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes.dex */
public final class zzerd {
    private final zzdmu zza;

    public zzerd(zzdmu zzdmuVar) {
        this.zza = zzdmuVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfke zzfkeVar, zzfjt zzfjtVar, View view, zzeqz zzeqzVar) {
        zzerb zzerbVar = new zzerb(this, new zzera(this, zzfjtVar));
        zzdlo zzd = this.zza.zzd(new zzcxx(zzfkeVar, zzfjtVar, null), zzerbVar);
        zzeqzVar.zzd(new zzerc(this, zzd));
        return zzd.zzh();
    }
}
