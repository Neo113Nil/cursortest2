package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public interface zzfpi {
    static zzfpi zzn(Context context, int i) {
        boolean booleanValue;
        if (zzfpv.zza()) {
            int i2 = i - 2;
            if (i2 == 20 || i2 == 21) {
                booleanValue = ((Boolean) zzbjx.zze.zze()).booleanValue();
            } else if (i2 != 110) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        booleanValue = ((Boolean) zzbjx.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        booleanValue = ((Boolean) zzbjx.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        booleanValue = ((Boolean) zzbjx.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzki)).booleanValue();
            }
            if (booleanValue) {
                return new zzfpk(context, i);
            }
        }
        return new zzfql();
    }

    static zzfpi zzo(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfpi zzn = zzn(context, i);
        if (zzn instanceof zzfpk) {
            zzn.zza();
            zzn.zzp(i2);
            zzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfpr.zza(str)) {
                zzn.zze(str);
            }
        }
        return zzn;
    }

    zzfpi zza();

    boolean zzb();

    zzfpi zzc();

    zzfpi zzd(boolean z);

    zzfpi zze(String str);

    zzfpi zzf(zzfpx zzfpxVar);

    zzfpi zzg(zzfkd zzfkdVar);

    zzfpi zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfpi zzi(String str);

    zzfpi zzj(Throwable th);

    zzfpi zzk(String str);

    boolean zzl();

    zzfpl zzm();

    zzfpi zzp(int i);
}
