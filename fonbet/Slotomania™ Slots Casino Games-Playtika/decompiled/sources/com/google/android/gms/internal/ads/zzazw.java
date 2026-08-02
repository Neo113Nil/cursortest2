package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzazw {
    public static final String zza(Context context, String str, long j, boolean z) {
        try {
            zzayq zza = zzayr.zza();
            zza.zzb(str);
            zza.zza("0.828153725");
            zza.zzd(context.getPackageName());
            zza.zzf((System.currentTimeMillis() - j) / 1000);
            zza.zzc(System.currentTimeMillis() / 1000);
            try {
                zza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zza.zze(-1L);
            }
            zzayx zzc = zzazh.zzc(((zzayr) zza.zzbu()).zzaN(), null);
            zzc.zzc(5);
            zzc.zzd(2);
            return Base64.encodeToString(((zzayy) zzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
