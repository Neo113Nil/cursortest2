package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzpo;
import java.util.HashMap;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.1 */
/* loaded from: classes7.dex */
public final class zzna extends zzmy {
    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final Pair<zznd, Boolean> zza(String str) {
        zzf zze;
        if (zzpo.zza() && zze().zza(zzbh.zzbu)) {
            zzq();
            if (zznt.zzf(str)) {
                zzj().zzp().zza("sgtm feature flag enabled.");
                zzf zze2 = zzh().zze(str);
                if (zze2 != null) {
                    String zzad = zze2.zzad();
                    zzfj.zzd zzc = zzm().zzc(str);
                    if (zzc != null && (zze = zzh().zze(str)) != null && ((zzc.zzr() && zzc.zzh().zza() == 100) || zzq().zzd(str, zze.zzam()) || (!TextUtils.isEmpty(zzad) && zzad.hashCode() % 100 < zzc.zzh().zza()))) {
                        zznd zzndVar = null;
                        if (zze2.zzat()) {
                            zzj().zzp().zza("sgtm upload enabled in manifest.");
                            zzfj.zzd zzc2 = zzm().zzc(zze2.zzac());
                            if (zzc2 != null && zzc2.zzr()) {
                                String zze3 = zzc2.zzh().zze();
                                if (!TextUtils.isEmpty(zze3)) {
                                    String zzd = zzc2.zzh().zzd();
                                    zzj().zzp().zza("sgtm configured with upload_url, server_info", zze3, TextUtils.isEmpty(zzd) ? "Y" : "N");
                                    if (TextUtils.isEmpty(zzd)) {
                                        zzndVar = new zznd(zze3);
                                    } else {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("x-sgtm-server-info", zzd);
                                        if (!TextUtils.isEmpty(zze2.zzam())) {
                                            hashMap.put("x-gtm-server-preview", zze2.zzam());
                                        }
                                        zzndVar = new zznd(zze3, hashMap);
                                    }
                                }
                            }
                        }
                        if (zzndVar != null) {
                            return Pair.create(zzndVar, false);
                        }
                    }
                }
                return Pair.create(new zznd(zzb(str)), true);
            }
        }
        return Pair.create(new zznd(zzb(str)), true);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzs zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzad zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzae zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzan zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzfv zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zzgl zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzgw zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    @Pure
    public final /* bridge */ /* synthetic */ zzhg zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzmc zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzna zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zznp g_() {
        return super.g_();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    @Pure
    public final /* bridge */ /* synthetic */ zznt zzq() {
        return super.zzq();
    }

    private final String zzb(String str) {
        String zzf = zzm().zzf(str);
        if (!TextUtils.isEmpty(zzf)) {
            Uri parse = Uri.parse(zzbh.zzq.zza(null));
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.authority(zzf + "." + parse.getAuthority());
            return buildUpon.build().toString();
        }
        return zzbh.zzq.zza(null);
    }

    zzna(zznc zzncVar) {
        super(zzncVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }
}
