package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes5.dex */
public final class zzbit {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbit(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbiq zzf() {
        return new zzbiq(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), null, null);
    }

    public final void zza(zzbit zzbitVar) {
        synchronized (this.zzc) {
        }
    }

    public final boolean zzb(zzbiq zzbiqVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbiq(j, strArr[0], zzbiqVar));
        }
        return true;
    }

    public final zzbis zzc() {
        zzbis zzbisVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            List<zzbiq> list = this.zza;
            for (zzbiq zzbiqVar : list) {
                long zza = zzbiqVar.zza();
                String zzb = zzbiqVar.zzb();
                zzbiq zzc = zzbiqVar.zzc();
                if (zzc != null && zza > 0) {
                    long zza2 = zza - zzc.zza();
                    sb.append(zzb);
                    sb.append('.');
                    sb.append(zza2);
                    sb.append(AbstractJsonLexerKt.COMMA);
                    if (booleanValue) {
                        if (hashMap.containsKey(Long.valueOf(zzc.zza()))) {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzc.zza()));
                            sb2.append('+');
                            sb2.append(zzb);
                        } else {
                            hashMap.put(Long.valueOf(zzc.zza()), new StringBuilder(zzb));
                        }
                    }
                }
            }
            list.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    sb3.append(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
                    sb3.append(AbstractJsonLexerKt.COMMA);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbisVar = new zzbis(sb.toString(), str);
        }
        return zzbisVar;
    }

    public final void zzd(String str, String str2) {
        zzbij zza;
        if (TextUtils.isEmpty(str2) || (zza = com.google.android.gms.ads.internal.zzt.zzh().zza()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbip zzd = zza.zzd(str);
            Map map = this.zzb;
            map.put(str, zzd.zza((String) map.get(str), str2));
        }
    }

    public final Map zze() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzh().zza();
            map = this.zzb;
        }
        return map;
    }
}
