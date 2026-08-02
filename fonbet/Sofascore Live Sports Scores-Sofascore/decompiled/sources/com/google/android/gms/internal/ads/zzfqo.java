package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfqo implements zzdlb, zzdef, zzdlf {
    public final zzfrg a;
    public final zzfqw b;

    public zzfqo(Context context, zzfrg zzfrgVar) {
        this.a = zzfrgVar;
        this.b = zzfqw.e(13, context);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void t(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbla.d.c()).booleanValue()) {
            String adError = zzeVar.zza().toString();
            zzfqw zzfqwVar = this.b;
            zzfqwVar.zzk(adError);
            zzfqwVar.zzd(false);
            this.a.a(zzfqwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final void zza() {
        if (((Boolean) zzbla.d.c()).booleanValue()) {
            zzfqw zzfqwVar = this.b;
            zzfqwVar.zzd(true);
            this.a.a(zzfqwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzh() {
        if (((Boolean) zzbla.d.c()).booleanValue()) {
            this.b.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdlf
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzdlb
    public final void zzg() {
    }
}
