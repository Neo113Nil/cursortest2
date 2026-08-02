package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgbu extends zzgbt {
    private static zzgbu zzd;

    private zzgbu(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final zzgbu zzh(Context context) {
        zzgbu zzgbuVar;
        synchronized (zzgbu.class) {
            if (zzd == null) {
                zzd = new zzgbu(context);
            }
            zzgbuVar = zzd;
        }
        return zzgbuVar;
    }

    public final zzgbq zzi(long j, boolean z) throws IOException {
        zzgbq zza;
        synchronized (zzgbu.class) {
            zza = zza(null, null, j, z);
        }
        return zza;
    }

    public final zzgbq zzj(String str, String str2, long j, boolean z) throws IOException {
        zzgbq zza;
        synchronized (zzgbu.class) {
            zza = zza(str, str2, j, z);
        }
        return zza;
    }

    public final void zzk() throws IOException {
        synchronized (zzgbu.class) {
            zzc(false);
        }
    }

    public final void zzl() throws IOException {
        synchronized (zzgbu.class) {
            zzc(true);
        }
    }
}
