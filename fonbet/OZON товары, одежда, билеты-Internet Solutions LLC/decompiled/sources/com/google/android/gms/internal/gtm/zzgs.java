package com.google.android.gms.internal.gtm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Random;

@ShowFirstParty
/* loaded from: classes9.dex */
public final class zzgs {
    private final Context zza;
    private final Random zzb;
    private final String zzc;

    public zzgs(Context context, String str) {
        Random random = new Random();
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzc = (String) Preconditions.checkNotNull(str);
        this.zzb = random;
    }

    private final long zzg(long j11, long j12) {
        long max = Math.max(0L, zzh().getLong("FORBIDDEN_COUNT", 0L));
        return (long) (this.zzb.nextFloat() * (j11 + ((long) ((max / ((max + Math.max(0L, r0.getLong("SUCCESSFUL_COUNT", 0L))) + 1)) * (j12 - j11)))));
    }

    private final SharedPreferences zzh() {
        Context context = this.zza;
        String valueOf = String.valueOf(this.zzc);
        return context.getSharedPreferences(valueOf.length() != 0 ? "v5_gtmContainerRefreshPolicy_".concat(valueOf) : new String("v5_gtmContainerRefreshPolicy_"), 0);
    }

    public final long zza() {
        if (Math.max(0L, zzh().getLong("FORBIDDEN_COUNT", 0L)) == 0) {
            return 0L;
        }
        return zzg(10000L, 600000L) + 10000;
    }

    public final long zzb() {
        return zzg(7200000L, 259200000L) + 43200000;
    }

    public final long zzc() {
        return zzg(600000L, 86400000L) + 3600000;
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zzd() {
        SharedPreferences zzh = zzh();
        long j11 = zzh.getLong("FORBIDDEN_COUNT", 0L);
        long j12 = zzh.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor edit = zzh.edit();
        long min = j11 == 0 ? 3L : Math.min(10L, j11 + 1);
        long max = Math.max(0L, Math.min(j12, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void zze() {
        SharedPreferences zzh = zzh();
        long j11 = zzh.getLong("SUCCESSFUL_COUNT", 0L);
        long j12 = zzh.getLong("FORBIDDEN_COUNT", 0L);
        long min = Math.min(10L, j11 + 1);
        long max = Math.max(0L, Math.min(j12, 10 - min));
        SharedPreferences.Editor edit = zzh.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }

    public final boolean zzf() {
        return Math.max(0L, zzh().getLong("FORBIDDEN_COUNT", 0L)) > 0;
    }
}
