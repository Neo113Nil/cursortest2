package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.OnFailureListener;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import xsna.a8o0;
import xsna.wpz0;
import xsna.z7o0;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@18.2.0 */
/* loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);

    @Nullable
    private final z7o0 zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = new wpz0(context, wpz0.a, new a8o0("ads_identifier:api"), b.a.c);
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static void zzb(zzd zzdVar, long j, Exception exc) {
        ConnectionResult connectionResult;
        "getting error as ".concat(String.valueOf(exc.getMessage()));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).d().e) != null && connectionResult.c == 24) {
            zzdVar.zze.set(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        if ((r2 - r17.zze.get()) > com.google.android.gms.ads.identifier.zzd.zzc.toMillis()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.zze;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        atomicLong.get();
        if (this.zze.get() != -1) {
        }
        z7o0 z7o0Var = this.zzd;
        if (z7o0Var == null) {
            return;
        }
        ((wpz0) z7o0Var).a(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i2, 0, j, j2, null, null, 0, i3)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.ads.identifier.zzc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzd.zzb(zzd.this, elapsedRealtime, exc);
            }
        });
    }
}
