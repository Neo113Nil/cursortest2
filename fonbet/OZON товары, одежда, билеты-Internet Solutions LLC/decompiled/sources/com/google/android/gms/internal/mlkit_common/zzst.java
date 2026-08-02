package com.google.android.gms.internal.mlkit_common;

import U8.b;
import android.os.SystemClock;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.mlkit.common.sdkinternal.k;
import com.google.mlkit.common.sdkinternal.m;

/* loaded from: classes9.dex */
public final class zzst {
    private static final GmsLogger zza = new GmsLogger("RemoteModelUtils", "");

    public static zznc zza(b bVar, m mVar, zzsj zzsjVar) {
        k zzb = zzsjVar.zzb();
        bVar.getClass();
        zzni zzniVar = new zzni();
        zznd zzndVar = new zznd();
        zzndVar.zzc((String) b.f27457a.get(null));
        zzndVar.zzd(zznf.CLOUD);
        zzndVar.zza(zzu.zzb(null));
        int ordinal = zzb.ordinal();
        zzndVar.zzb(ordinal != 2 ? ordinal != 4 ? ordinal != 5 ? zzne.TYPE_UNKNOWN : zzne.BASE_DIGITAL_INK : zzne.CUSTOM : zzne.BASE_TRANSLATE);
        zzniVar.zzb(zzndVar.zzg());
        zznl zzc = zzniVar.zzc();
        zzmz zzmzVar = new zzmz();
        zzmzVar.zzd(zzsjVar.zzc());
        zzmzVar.zzc(zzsjVar.zzd());
        zzmzVar.zzb(Long.valueOf(zzsjVar.zza()));
        zzmzVar.zzf(zzc);
        if (zzsjVar.zzg()) {
            long b11 = mVar.b();
            if (b11 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                long c11 = mVar.c();
                if (c11 == 0) {
                    c11 = SystemClock.elapsedRealtime();
                    mVar.d(c11);
                }
                zzmzVar.zzg(Long.valueOf(c11 - b11));
            }
        }
        if (zzsjVar.zzf()) {
            long b12 = mVar.b();
            if (b12 == 0) {
                zza.w("RemoteModelUtils", "Model downloaded without its beginning time recorded.");
            } else {
                zzmzVar.zze(Long.valueOf(SystemClock.elapsedRealtime() - b12));
            }
        }
        return zzmzVar.zzi();
    }
}
