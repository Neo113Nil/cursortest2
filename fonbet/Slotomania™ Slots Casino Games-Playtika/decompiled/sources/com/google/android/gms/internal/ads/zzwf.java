package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzwf implements zzyu {
    public final zzyu zza;
    final /* synthetic */ zzwg zzb;
    private boolean zzc;

    public zzwf(zzwg zzwgVar, zzyu zzyuVar) {
        Objects.requireNonNull(zzwgVar);
        this.zzb = zzwgVar;
        this.zza = zzyuVar;
    }

    public final void zza() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final boolean zzb() {
        return !this.zzb.zzo() && this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zzd(zzlq zzlqVar, zzip zzipVar, int i) {
        zzwg zzwgVar = this.zzb;
        if (zzwgVar.zzo()) {
            return -3;
        }
        if (this.zzc) {
            zzipVar.zzg(4);
            return -4;
        }
        zzyu zzyuVar = this.zza;
        long zzi = zzwgVar.zzi();
        int zzd = zzyuVar.zzd(zzlqVar, zzipVar, i);
        if (zzwgVar.zzq() != C.TIME_UNSET && zzd != -3) {
            zzwgVar.zzr(C.TIME_UNSET);
        }
        if (zzd != -5) {
            long j = zzwgVar.zzb;
            if (j == Long.MIN_VALUE || ((zzd != -4 || zzipVar.zze < j) && !(zzd == -3 && zzi == Long.MIN_VALUE && !zzipVar.zzd))) {
                return zzd;
            }
            zzipVar.zza();
            zzipVar.zzg(4);
            this.zzc = true;
            return -4;
        }
        long j2 = zzwgVar.zzb;
        zzv zzvVar = zzlqVar.zzb;
        zzvVar.getClass();
        int i2 = zzvVar.zzK;
        if (i2 == 0) {
            if (zzvVar.zzL != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = j2 == Long.MIN_VALUE ? zzvVar.zzL : 0;
        zzt zza = zzvVar.zza();
        zza.zzJ(i2);
        zza.zzK(i3);
        zzlqVar.zzb = zza.zzO();
        return -5;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final int zze(long j) {
        if (this.zzb.zzo()) {
            return -3;
        }
        return this.zza.zze(j);
    }
}
