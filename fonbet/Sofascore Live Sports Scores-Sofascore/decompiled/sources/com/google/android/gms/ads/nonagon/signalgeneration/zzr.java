package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzeae;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzr implements zzdmi {
    public final zzeae a;
    public final zzq b;
    public final String c;

    public zzr(zzeae zzeaeVar, zzq zzqVar, String str) {
        this.a = zzeaeVar;
        this.b = zzqVar;
        this.c = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(@Nullable zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        zzeae zzeaeVar = this.a;
        this.b.zza(this.c, zzbcVar.zzb, zzeaeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(@Nullable String str) {
    }
}
