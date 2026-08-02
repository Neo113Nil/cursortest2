package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzfsp {
    private final zzdyz zza;

    zzfsp(zzdyz zzdyzVar, Context context) {
        this.zza = zzdyzVar;
    }

    private final void zzt(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, String str4) {
        zzdyy zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j));
        zza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("pas", Integer.toString(i3));
        zza.zzc("pv", "2");
        zza.zzc("ad_unit_id", str3);
        zza.zzc("pid", str2);
        zza.zzd();
    }

    private final void zzu(String str, String str2, long j, int i, int i2, String str3, zzfsw zzfswVar, String str4) {
        zzdyy zza = this.zza.zza();
        zza.zzc(str2, Long.toString(j));
        if (zzfswVar != null) {
            zza.zzc("ad_unit_id", zzfswVar.zza());
            zza.zzc("ad_format", zzfswVar.zzb());
            zza.zzc("pid", zzfswVar.zzc());
        }
        zza.zzc("action", str);
        if (str3 != null) {
            zza.zzc("gqi", str3);
        }
        if (i >= 0) {
            zza.zzc("max_ads", Integer.toString(i));
        }
        if (i2 >= 0) {
            zza.zzc("cache_size", Integer.toString(i2));
        }
        zza.zzc("pv", str4);
        zza.zzd();
    }

    private final void zzv(String str, long j, String str2, String str3, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzdyy zza = this.zza.zza();
        zza.zzc("action", str);
        zza.zzc("pat", Long.toString(j));
        zza.zzc("pid", str2);
        zza.zzc("ad_unit_id", str3);
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("tpcnt", Integer.toString(i4));
        zza.zzc("mpl", Integer.toString(i5));
        if (adFormat != null) {
            zza.zzc("ad_format", adFormat.name().toLowerCase(Locale.ENGLISH));
        }
        if (i3 > 0) {
            zza.zzc("nptr", Integer.toString(i3));
        }
        zza.zzd();
    }

    public final void zza(int i, long j, zzfsw zzfswVar, String str) {
        zzdyy zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc("ad_format", zzfswVar.zzb());
        zza.zzc("ad_unit_id", zzfswVar.zza());
        zza.zzc("pid", zzfswVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzb(Map map, long j, String str) {
        zzdyy zza = this.zza.zza();
        zza.zzc("action", "start_preload");
        zza.zzc("sp_ts", Long.toString(j));
        zza.zzc("pv", "1");
        for (AdFormat adFormat : map.keySet()) {
            String lowerCase = adFormat.name().toLowerCase(Locale.ENGLISH);
            String.valueOf(lowerCase);
            String valueOf = String.valueOf(lowerCase);
            zza.zzc(valueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zza.zzd();
    }

    public final void zzc(int i, int i2, long j, zzfsw zzfswVar) {
        zzdyy zza = this.zza.zza();
        zza.zzc("action", "cache_resize");
        zza.zzc("cs_ts", Long.toString(j));
        zza.zzc("orig_ma", Integer.toString(i));
        zza.zzc("max_ads", Integer.toString(i2));
        zza.zzc("ad_format", zzfswVar.zzb());
        zza.zzc("ad_unit_id", zzfswVar.zza());
        zza.zzc("pid", zzfswVar.zzc());
        zza.zzc("pv", "1");
        zza.zzd();
    }

    public final void zzd(int i, int i2, long j, Long l, String str, zzfsw zzfswVar, String str2) {
        zzdyy zza = this.zza.zza();
        zza.zzc("plaac_ts", Long.toString(j));
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "is_ad_available");
        if (zzfswVar != null) {
            zza.zzc("ad_unit_id", zzfswVar.zza());
            zza.zzc("pid", zzfswVar.zzc());
            zza.zzc("ad_format", zzfswVar.zzb());
        }
        if (l != null) {
            zza.zzc("plaay_ts", Long.toString(l.longValue()));
        }
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zze(long j, String str) {
        zzu("poll_ad", "ppacwe_ts", j, -1, -1, null, null, "2");
    }

    public final void zzf(long j, zzfsw zzfswVar, int i, int i2, String str) {
        zzu("poll_ad", "ppac_ts", j, i, i2, null, zzfswVar, str);
    }

    public final void zzg(long j, int i, int i2, String str, zzfsw zzfswVar, String str2) {
        zzu("poll_ad", "psvroc_ts", j, i, i2, str, zzfswVar, str2);
    }

    public final void zzh(long j, int i, int i2, String str, zzfsw zzfswVar, String str2) {
        zzdyy zza = this.zza.zza();
        zza.zzc("ppla_ts", Long.toString(j));
        zza.zzc("ad_format", zzfswVar.zzb());
        zza.zzc("ad_unit_id", zzfswVar.zza());
        zza.zzc("pid", zzfswVar.zzc());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("action", "poll_ad");
        if (str != null) {
            zza.zzc("gqi", str);
        }
        zza.zzc("pv", str2);
        zza.zzd();
    }

    public final void zzi(long j, String str, zzfsw zzfswVar, int i, int i2, String str2) {
        zzu("paa", "pano_ts", j, i, i2, str, zzfswVar, str2);
    }

    public final void zzj(long j, zzfsw zzfswVar, int i, String str) {
        zzu("pae", "paeo_ts", j, i, 0, null, zzfswVar, str);
    }

    public final void zzk(long j, zzfsw zzfswVar, com.google.android.gms.ads.internal.client.zze zzeVar, int i, int i2, String str) {
        zzdyy zza = this.zza.zza();
        zza.zzc("action", "pftla");
        zza.zzc("pftlat_ts", Long.toString(j));
        zza.zzc("pftlaec", Integer.toString(zzeVar.zza));
        zza.zzc("ad_format", zzfswVar.zzb());
        zza.zzc("max_ads", Integer.toString(i));
        zza.zzc("cache_size", Integer.toString(i2));
        zza.zzc("ad_unit_id", zzfswVar.zza());
        zza.zzc("pid", zzfswVar.zzc());
        zza.zzc("pv", str);
        zza.zzd();
    }

    public final void zzl(long j, AdFormat adFormat, int i) {
        zzt("pda", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzm(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzt("pd", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzn(AdFormat adFormat, long j, int i) {
        zzt("pgcs", j, null, null, adFormat, -1, -1, i, "2");
    }

    public final void zzo(long j, String str, String str2, AdFormat adFormat, int i, int i2) {
        zzt("pgc", j, str, str2, adFormat, i, i2, 1, "2");
    }

    public final void zzp(int i, long j, String str, String str2, AdFormat adFormat, int i2) {
        zzt("pnav", j, str, str2, adFormat, i2, i, 1, "2");
    }

    public final void zzq(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4) {
        zzv("acmpa", j, str, str2, adFormat, i, i2, 0, i3, i4);
    }

    public final void zzr(long j, String str, String str2, AdFormat adFormat, int i, int i2, int i3, int i4, int i5) {
        zzv("acmpr", j, str, str2, adFormat, i, i2, i3, i4, i5);
    }

    public final void zzs(long j, int i, int i2) {
        zzdyy zza = this.zza.zza();
        zza.zzc("action", "acmlr");
        zza.zzc("pat", Long.toString(j));
        zza.zzc("mpl", Integer.toString(i));
        zza.zzc("pas", Integer.toString(i2));
        zza.zzd();
    }
}
