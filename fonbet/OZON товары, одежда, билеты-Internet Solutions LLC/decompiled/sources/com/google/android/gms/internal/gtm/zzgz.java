package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes9.dex */
final class zzgz {
    private final long zza;
    private final long zzb;
    private String zzc;
    private String zzd;
    private Map<String, String> zze;
    private String zzf;

    zzgz(long j11, long j12, long j13) {
        this.zza = j11;
        this.zzb = j13;
    }

    final long zza() {
        return this.zzb;
    }

    final long zzb() {
        return this.zza;
    }

    final String zzc() {
        return this.zzf;
    }

    final String zzd() {
        return this.zzd;
    }

    final String zze() {
        return this.zzc;
    }

    final Map<String, String> zzf() {
        return this.zze;
    }

    final void zzg(String str) {
        this.zzf = str;
    }

    final void zzh(Map<String, String> map) {
        this.zze = map;
    }

    final void zzi(String str) {
        this.zzd = str;
    }

    final void zzj(String str) {
        if (str == null || TextUtils.isEmpty(str.trim())) {
            return;
        }
        this.zzc = str;
    }
}
