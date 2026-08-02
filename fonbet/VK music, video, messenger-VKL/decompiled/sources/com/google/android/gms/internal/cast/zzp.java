package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Map;
import xsna.exc0;
import xsna.o100;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzp {
    private static final o100 zza = new o100("ApplicationAnalyticsUtils", null);
    private static final String zzb = "22.3.1";
    private final String zzc;
    private final Map zzd;
    private final Map zze;

    public zzp(Bundle bundle, String str) {
        this.zzc = str;
        this.zzd = zzaz.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.zze = zzaz.zza(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    private final zzqq zzh(zzo zzoVar) {
        long j;
        zzqq zzc = zzqr.zzc();
        zzc.zza(zzoVar.zzd);
        int i = zzoVar.zze;
        zzoVar.zze = i + 1;
        zzc.zzg(i);
        String str = zzoVar.zzc;
        if (str != null) {
            zzc.zzf(str);
        }
        zzur zza2 = zzus.zza();
        if (!TextUtils.isEmpty(zzoVar.zzh)) {
            zzc.zzb(zzoVar.zzh);
            zza2.zza(zzoVar.zzh);
        }
        if (!TextUtils.isEmpty(zzoVar.zzi)) {
            zza2.zzb(zzoVar.zzi);
        }
        if (!TextUtils.isEmpty(zzoVar.zzj)) {
            zza2.zzc(zzoVar.zzj);
        }
        if (!TextUtils.isEmpty(zzoVar.zzk)) {
            zza2.zzd(zzoVar.zzk);
        }
        if (!TextUtils.isEmpty(zzoVar.zzl)) {
            zza2.zze(zzoVar.zzl);
        }
        if (!TextUtils.isEmpty(zzoVar.zzm)) {
            zza2.zzf(zzoVar.zzm);
        }
        zza2.zzg(zzco.zza(zzoVar.zzn));
        zzc.zzn((zzus) zza2.zzu());
        zzqb zza3 = zzqc.zza();
        zza3.zzb(zzb);
        zza3.zza(this.zzc);
        zzc.zzl((zzqc) zza3.zzu());
        zzqf zza4 = zzqg.zza();
        if (zzoVar.zzb != null) {
            zzro zza5 = zzrp.zza();
            zza5.zza(zzoVar.zzb);
            zza4.zza((zzrp) zza5.zzu());
        }
        zza4.zzb(false);
        String str2 = zzoVar.zzf;
        if (str2 != null) {
            try {
                String replace = str2.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException unused) {
                zza.c("receiverSessionId %s is not valid for hash", str2);
                j = 0;
            }
            zza4.zzc(j);
        }
        zza4.zzf(zzoVar.zzg);
        zza4.zzg(zzoVar.zzb());
        zza4.zzj(zzoVar.zzo);
        zzc.zzj(zza4);
        return zzc;
    }

    private static void zzi(zzqq zzqqVar, boolean z) {
        zzqf zzc = zzqg.zzc(zzqqVar.zzh());
        zzc.zzb(z);
        zzqqVar.zzj(zzc);
    }

    public final zzqr zza(zzo zzoVar) {
        return (zzqr) zzh(zzoVar).zzu();
    }

    public final zzqr zzb(zzo zzoVar) {
        zzqq zzh = zzh(zzoVar);
        if (zzoVar.zzp == 1) {
            zzqf zzc = zzqg.zzc(zzh.zzh());
            zzc.zzd(17);
            zzh.zzi((zzqg) zzc.zzu());
        }
        return (zzqr) zzh.zzu();
    }

    public final zzqr zzc(zzo zzoVar) {
        zzqq zzh = zzh(zzoVar);
        zzqf zzc = zzqg.zzc(zzh.zzh());
        zzc.zzd(10);
        zzh.zzi((zzqg) zzc.zzu());
        zzi(zzh, true);
        return (zzqr) zzh.zzu();
    }

    public final zzqr zzd(zzo zzoVar, boolean z) {
        zzqq zzh = zzh(zzoVar);
        zzi(zzh, z);
        return (zzqr) zzh.zzu();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqr zze(zzo zzoVar, int i) {
        int i2;
        Map map;
        int i3;
        zzqq zzh = zzh(zzoVar);
        zzqf zzc = zzqg.zzc(zzh.zzh());
        Map map2 = this.zze;
        if (map2 != null) {
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                Integer num = (Integer) map2.get(valueOf);
                exc0.i(num);
                i2 = num.intValue();
                zzc.zzd(i2);
                map = this.zzd;
                if (map != null) {
                    Integer valueOf2 = Integer.valueOf(i);
                    if (map.containsKey(valueOf2)) {
                        Integer num2 = (Integer) map.get(valueOf2);
                        exc0.i(num2);
                        i3 = num2.intValue();
                        zzc.zze(i3);
                        zzh.zzi((zzqg) zzc.zzu());
                        return (zzqr) zzh.zzu();
                    }
                }
                i3 = i + 10000;
                zzc.zze(i3);
                zzh.zzi((zzqg) zzc.zzu());
                return (zzqr) zzh.zzu();
            }
        }
        i2 = i + 10000;
        zzc.zzd(i2);
        map = this.zzd;
        if (map != null) {
        }
        i3 = i + 10000;
        zzc.zze(i3);
        zzh.zzi((zzqg) zzc.zzu());
        return (zzqr) zzh.zzu();
    }

    public final zzqr zzf(zzo zzoVar, int i) {
        zzqq zzh = zzh(zzoVar);
        zzqf zzc = zzqg.zzc(zzh.zzh());
        zzc.zzh(i);
        zzh.zzi((zzqg) zzc.zzu());
        return (zzqr) zzh.zzu();
    }

    public final zzqr zzg(zzo zzoVar, int i, int i2) {
        zzqq zzh = zzh(zzoVar);
        zzqf zzc = zzqg.zzc(zzh.zzh());
        zzc.zzh(i);
        zzc.zzi(i2);
        zzh.zzi((zzqg) zzc.zzu());
        return (zzqr) zzh.zzu();
    }
}
