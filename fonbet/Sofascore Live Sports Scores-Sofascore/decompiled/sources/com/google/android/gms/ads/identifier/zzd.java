package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.tasks.OnFailureListener;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzd {
    public static volatile zzd c;
    public static final Object d = new Object();
    public static final Duration e = Duration.ofMinutes(30);
    public final zat a;
    public final AtomicLong b = new AtomicLong(-1);

    public zzd(Context context) {
        TelemetryLoggingOptions telemetryLoggingOptions = TelemetryLoggingOptions.b;
        TelemetryLoggingOptions.Builder builder = new TelemetryLoggingOptions.Builder();
        builder.a = "ads_identifier:api";
        this.a = new zat(context, zat.l, new TelemetryLoggingOptions(builder.a), GoogleApi.Settings.c);
    }

    public static zzd zza(Context context) {
        if (c == null) {
            synchronized (d) {
                try {
                    if (c == null) {
                        c = new zzd(context);
                    }
                } finally {
                }
            }
        }
        return c;
    }

    public static void zzb(zzd zzdVar, long j, Exception exc) {
        ConnectionResult connectionResult;
        "getting error as ".concat(String.valueOf(exc.getMessage()));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).a.d) != null && connectionResult.b == 24) {
            zzdVar.b.set(j);
        }
    }

    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.b;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        atomicLong.get();
        if (this.b.get() != -1 && elapsedRealtime - this.b.get() <= e.toMillis()) {
            return;
        }
        this.a.i(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i2, 0, j, j2, null, null, 0, i3)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.ads.identifier.zzc
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                zzd.zzb(zzd.this, elapsedRealtime, exc);
            }
        });
    }
}
