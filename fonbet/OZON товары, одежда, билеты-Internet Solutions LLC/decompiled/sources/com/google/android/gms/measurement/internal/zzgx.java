package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
final class zzgx implements Callable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzhc zzc;

    zzgx(zzhc zzhcVar, zzaw zzawVar, String str) {
        this.zzc = zzhcVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzll zzllVar;
        zzll zzllVar2;
        byte[] bArr;
        zzll zzllVar3;
        zzlq zzlqVar;
        List list;
        com.google.android.gms.internal.measurement.zzfz zzfzVar;
        Bundle bundle;
        zzh zzhVar;
        com.google.android.gms.internal.measurement.zzgb zzgbVar;
        boolean z11;
        zzas zzc;
        long j11;
        zzllVar = this.zzc.zza;
        zzllVar.zzA();
        zzllVar2 = this.zzc.zza;
        zziu zzr = zzllVar2.zzr();
        zzaw zzawVar = this.zza;
        String str = this.zzb;
        zzr.zzg();
        zzgk.zzO();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        if (!zzr.zzs.zzf().zzs(str, zzen.zzT)) {
            zzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzawVar.zza) && !"_iapx".equals(zzawVar.zza)) {
            zzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str, zzawVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzfz zza = com.google.android.gms.internal.measurement.zzga.zza();
        zzr.zzf.zzi().zzw();
        try {
            zzh zzj = zzr.zzf.zzi().zzj(str);
            if (zzj == null) {
                zzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!zzj.zzaj()) {
                zzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            com.google.android.gms.internal.measurement.zzgb zzu = com.google.android.gms.internal.measurement.zzgc.zzu();
            zzu.zzae(1);
            zzu.zzaa("android");
            if (!TextUtils.isEmpty(zzj.zzt())) {
                zzu.zzE(zzj.zzt());
            }
            if (!TextUtils.isEmpty(zzj.zzv())) {
                zzu.zzG((String) Preconditions.checkNotNull(zzj.zzv()));
            }
            if (!TextUtils.isEmpty(zzj.zzw())) {
                zzu.zzH((String) Preconditions.checkNotNull(zzj.zzw()));
            }
            if (zzj.zzb() != -2147483648L) {
                zzu.zzI((int) zzj.zzb());
            }
            zzu.zzW(zzj.zzm());
            zzu.zzQ(zzj.zzk());
            String zzy = zzj.zzy();
            String zzr2 = zzj.zzr();
            if (!TextUtils.isEmpty(zzy)) {
                zzu.zzV(zzy);
            } else if (!TextUtils.isEmpty(zzr2)) {
                zzu.zzC(zzr2);
            }
            zzai zzh = zzr.zzf.zzh(str);
            zzu.zzN(zzj.zzj());
            if (zzr.zzs.zzJ() && zzr.zzs.zzf().zzt(zzu.zzaq()) && zzh.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                zzu.zzP(null);
            }
            zzu.zzM(zzh.zzh());
            if (zzh.zzi(zzah.AD_STORAGE)) {
                Pair zzd = zzr.zzf.zzs().zzd(zzj.zzt(), zzh);
                if (zzj.zzai() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                    try {
                        zzu.zzaf(zziu.zza((String) zzd.first, Long.toString(zzawVar.zzd)));
                        Object obj = zzd.second;
                        if (obj != null) {
                            zzu.zzY(((Boolean) obj).booleanValue());
                        }
                    } catch (SecurityException e11) {
                        zzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e11.getMessage());
                        bArr = new byte[0];
                        zzllVar3 = zzr.zzf;
                        zzllVar3.zzi().zzx();
                        return bArr;
                    }
                }
            }
            zzr.zzs.zzg().zzu();
            zzu.zzO(Build.MODEL);
            zzr.zzs.zzg().zzu();
            zzu.zzZ(Build.VERSION.RELEASE);
            zzu.zzak((int) zzr.zzs.zzg().zzb());
            zzu.zzao(zzr.zzs.zzg().zzc());
            try {
                if (zzh.zzi(zzah.ANALYTICS_STORAGE) && zzj.zzu() != null) {
                    zzu.zzF(zziu.zza((String) Preconditions.checkNotNull(zzj.zzu()), Long.toString(zzawVar.zzd)));
                }
                if (!TextUtils.isEmpty(zzj.zzx())) {
                    zzu.zzU((String) Preconditions.checkNotNull(zzj.zzx()));
                }
                String zzt = zzj.zzt();
                List zzu2 = zzr.zzf.zzi().zzu(zzt);
                Iterator it = zzu2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzlqVar = null;
                        break;
                    }
                    zzlqVar = (zzlq) it.next();
                    if ("_lte".equals(zzlqVar.zzc)) {
                        break;
                    }
                }
                if (zzlqVar == null || zzlqVar.zze == null) {
                    list = zzu2;
                    zzlq zzlqVar2 = new zzlq(zzt, "auto", "_lte", zzr.zzs.zzav().currentTimeMillis(), 0L);
                    list.add(zzlqVar2);
                    zzr.zzf.zzi().zzL(zzlqVar2);
                } else {
                    list = zzu2;
                }
                zzln zzu3 = zzr.zzf.zzu();
                zzu3.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                if (zzu3.zzs.zzg().zze()) {
                    String zzt2 = zzj.zzt();
                    Preconditions.checkNotNull(zzt2);
                    if (zzj.zzai() && zzu3.zzf.zzo().zzn(zzt2)) {
                        zzu3.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if ("_npa".equals(((zzlq) it2.next()).zzc)) {
                                it2.remove();
                                break;
                            }
                        }
                        list.add(new zzlq(zzt2, "auto", "_npa", zzu3.zzs.zzav().currentTimeMillis(), 1L));
                    }
                }
                com.google.android.gms.internal.measurement.zzgl[] zzglVarArr = new com.google.android.gms.internal.measurement.zzgl[list.size()];
                for (int i11 = 0; i11 < list.size(); i11++) {
                    com.google.android.gms.internal.measurement.zzgk zzd2 = com.google.android.gms.internal.measurement.zzgl.zzd();
                    zzd2.zzf(((zzlq) list.get(i11)).zzc);
                    zzd2.zzg(((zzlq) list.get(i11)).zzd);
                    zzr.zzf.zzu().zzu(zzd2, ((zzlq) list.get(i11)).zze);
                    zzglVarArr[i11] = (com.google.android.gms.internal.measurement.zzgl) zzd2.zzaE();
                }
                zzu.zzj(Arrays.asList(zzglVarArr));
                zzfb zzb = zzfb.zzb(zzawVar);
                zzr.zzs.zzv().zzL(zzb.zzd, zzr.zzf.zzi().zzi(str));
                zzr.zzs.zzv().zzM(zzb, zzr.zzs.zzf().zzd(str));
                Bundle bundle2 = zzb.zzd;
                bundle2.putLong("_c", 1L);
                zzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                bundle2.putLong("_r", 1L);
                bundle2.putString("_o", zzawVar.zzc);
                if (zzr.zzs.zzv().zzae(zzu.zzaq())) {
                    zzr.zzs.zzv().zzO(bundle2, "_dbg", 1L);
                    zzr.zzs.zzv().zzO(bundle2, "_r", 1L);
                }
                zzas zzn = zzr.zzf.zzi().zzn(str, zzawVar.zza);
                if (zzn == null) {
                    zzgbVar = zzu;
                    z11 = true;
                    bundle = bundle2;
                    zzc = new zzas(str, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                    j11 = 0;
                    zzhVar = zzj;
                    zzfzVar = zza;
                } else {
                    zzfzVar = zza;
                    bundle = bundle2;
                    zzhVar = zzj;
                    zzgbVar = zzu;
                    z11 = true;
                    long j12 = zzn.zzf;
                    zzc = zzn.zzc(zzawVar.zzd);
                    j11 = j12;
                }
                zzas zzasVar = zzc;
                zzr.zzf.zzi().zzE(zzasVar);
                zzh zzhVar2 = zzhVar;
                com.google.android.gms.internal.measurement.zzgb zzgbVar2 = zzgbVar;
                boolean z12 = z11;
                zzar zzarVar = new zzar(zzr.zzs, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j11, bundle);
                com.google.android.gms.internal.measurement.zzfr zze = com.google.android.gms.internal.measurement.zzfs.zze();
                zze.zzm(zzarVar.zzd);
                zze.zzi(zzarVar.zzb);
                zze.zzl(zzarVar.zze);
                zzat zzatVar = new zzat(zzarVar.zzf);
                while (zzatVar.hasNext()) {
                    String next = zzatVar.next();
                    com.google.android.gms.internal.measurement.zzfv zze2 = com.google.android.gms.internal.measurement.zzfw.zze();
                    zze2.zzj(next);
                    Object zzf = zzarVar.zzf.zzf(next);
                    if (zzf != null) {
                        zzr.zzf.zzu().zzt(zze2, zzf);
                        zze.zze(zze2);
                    }
                }
                zzgbVar2.zzk(zze);
                com.google.android.gms.internal.measurement.zzgd zza2 = com.google.android.gms.internal.measurement.zzgf.zza();
                com.google.android.gms.internal.measurement.zzft zza3 = com.google.android.gms.internal.measurement.zzfu.zza();
                zza3.zza(zzasVar.zzc);
                zza3.zzb(zzawVar.zza);
                zza2.zza(zza3);
                zzgbVar2.zzab(zza2);
                zzgbVar2.zzf(zzr.zzf.zzf().zza(zzhVar2.zzt(), Collections.EMPTY_LIST, zzgbVar2.zzat(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                if (zze.zzq()) {
                    zzgbVar2.zzaj(zze.zzc());
                    zzgbVar2.zzR(zze.zzc());
                }
                long zzn2 = zzhVar2.zzn();
                if (zzn2 != 0) {
                    zzgbVar2.zzac(zzn2);
                }
                long zzp = zzhVar2.zzp();
                if (zzp != 0) {
                    zzgbVar2.zzad(zzp);
                } else if (zzn2 != 0) {
                    zzgbVar2.zzad(zzn2);
                }
                String zzB = zzhVar2.zzB();
                zzps.zzc();
                if (zzr.zzs.zzf().zzs(null, zzen.zzaH) && zzB != null) {
                    zzgbVar2.zzai(zzB);
                }
                zzhVar2.zzE();
                zzgbVar2.zzJ((int) zzhVar2.zzo());
                zzr.zzs.zzf().zzh();
                zzgbVar2.zzam(64000L);
                zzgbVar2.zzal(zzr.zzs.zzav().currentTimeMillis());
                zzgbVar2.zzah(z12);
                zzfzVar.zza(zzgbVar2);
                zzhVar2.zzac(zzgbVar2.zzd());
                zzhVar2.zzaa(zzgbVar2.zzc());
                zzr.zzf.zzi().zzD(zzhVar2);
                zzr.zzf.zzi().zzC();
                try {
                    return zzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzga) zzfzVar.zzaE()).zzby());
                } catch (IOException e12) {
                    zzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzfa.zzn(str), e12);
                    return null;
                }
            } catch (SecurityException e13) {
                zzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e13.getMessage());
                bArr = new byte[0];
                zzllVar3 = zzr.zzf;
                zzllVar3.zzi().zzx();
                return bArr;
            }
        } finally {
            zzr.zzf.zzi().zzx();
        }
    }
}
