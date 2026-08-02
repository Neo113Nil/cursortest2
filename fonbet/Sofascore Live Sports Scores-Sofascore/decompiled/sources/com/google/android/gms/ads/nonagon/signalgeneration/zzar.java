package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzdml;
import com.google.android.gms.internal.ads.zzhcv;
import defpackage.ewm;
import defpackage.ue8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzar implements zzhcv {
    public final /* synthetic */ zzdml a;

    public zzar(zzdml zzdmlVar) {
        this.a = zzdmlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzdml zzdmlVar = this.a;
        String message = th.getMessage();
        synchronized (zzdmlVar) {
            zzdmlVar.p0(new ue8(message, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(@Nullable Object obj) {
        zzdml zzdmlVar = this.a;
        zzbc zzbcVar = (zzbc) obj;
        synchronized (zzdmlVar) {
            zzdmlVar.p0(new ewm(zzbcVar, 16));
        }
    }
}
