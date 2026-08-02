package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.measurement.zzne;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes9.dex */
public final class zzkg extends zzkz {
    public final zzfl zza;
    public final zzfl zzb;
    public final zzfl zzc;
    public final zzfl zzd;
    public final zzfl zze;
    private final Map zzg;
    private String zzh;
    private boolean zzi;
    private long zzj;

    zzkg(zzll zzllVar) {
        super(zzllVar);
        this.zzg = new HashMap();
        zzfp zzm = this.zzs.zzm();
        zzm.getClass();
        this.zza = new zzfl(zzm, "last_delete_stale", 0L);
        zzfp zzm2 = this.zzs.zzm();
        zzm2.getClass();
        this.zzb = new zzfl(zzm2, "backoff", 0L);
        zzfp zzm3 = this.zzs.zzm();
        zzm3.getClass();
        this.zzc = new zzfl(zzm3, "last_upload", 0L);
        zzfp zzm4 = this.zzs.zzm();
        zzm4.getClass();
        this.zzd = new zzfl(zzm4, "last_upload_attempt", 0L);
        zzfp zzm5 = this.zzs.zzm();
        zzm5.getClass();
        this.zze = new zzfl(zzm5, "midnight_offset", 0L);
    }

    @Deprecated
    final Pair zza(String str) {
        AdvertisingIdClient.Info advertisingIdInfo;
        zzkf zzkfVar;
        AdvertisingIdClient.Info advertisingIdInfo2;
        zzg();
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        zzne.zzc();
        if (this.zzs.zzf().zzs(null, zzen.zzar)) {
            zzkf zzkfVar2 = (zzkf) this.zzg.get(str);
            if (zzkfVar2 != null && elapsedRealtime < zzkfVar2.zzc) {
                return new Pair(zzkfVar2.zza, Boolean.valueOf(zzkfVar2.zzb));
            }
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
            long zzi = this.zzs.zzf().zzi(str, zzen.zza) + elapsedRealtime;
            try {
                advertisingIdInfo2 = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            } catch (Exception e11) {
                this.zzs.zzay().zzc().zzb("Unable to get advertising id", e11);
                zzkfVar = new zzkf("", false, zzi);
            }
            if (advertisingIdInfo2 == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id2 = advertisingIdInfo2.getId();
            zzkfVar = id2 != null ? new zzkf(id2, advertisingIdInfo2.isLimitAdTrackingEnabled(), zzi) : new zzkf("", advertisingIdInfo2.isLimitAdTrackingEnabled(), zzi);
            this.zzg.put(str, zzkfVar);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(zzkfVar.zza, Boolean.valueOf(zzkfVar.zzb));
        }
        String str2 = this.zzh;
        if (str2 != null && elapsedRealtime < this.zzj) {
            return new Pair(str2, Boolean.valueOf(this.zzi));
        }
        this.zzj = this.zzs.zzf().zzi(str, zzen.zza) + elapsedRealtime;
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
        } catch (Exception e12) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e12);
            this.zzh = "";
        }
        if (advertisingIdInfo == null) {
            return new Pair("", Boolean.FALSE);
        }
        this.zzh = "";
        String id3 = advertisingIdInfo.getId();
        if (id3 != null) {
            this.zzh = id3;
        }
        this.zzi = advertisingIdInfo.isLimitAdTrackingEnabled();
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzh, Boolean.valueOf(this.zzi));
    }

    @Override // com.google.android.gms.measurement.internal.zzkz
    protected final boolean zzb() {
        return false;
    }

    final Pair zzd(String str, zzai zzaiVar) {
        return zzaiVar.zzi(zzah.AD_STORAGE) ? zza(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    final String zzf(String str) {
        zzg();
        String str2 = (String) zza(str).first;
        MessageDigest zzF = zzlt.zzF();
        if (zzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzF.digest(str2.getBytes())));
    }
}
