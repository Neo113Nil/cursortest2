package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import defpackage.am0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgq {
    public static zzgq d;
    public final zzic a;
    public final zat b;
    public final AtomicLong c = new AtomicLong(-1);

    public zzgq(Context context, zzic zzicVar) {
        TelemetryLoggingOptions telemetryLoggingOptions = TelemetryLoggingOptions.b;
        TelemetryLoggingOptions.Builder builder = new TelemetryLoggingOptions.Builder();
        builder.a = "measurement:api";
        this.b = new zat(context, zat.l, new TelemetryLoggingOptions(builder.a), GoogleApi.Settings.c);
        this.a = zzicVar;
    }

    public final synchronized void a(int i, int i2, long j, long j2) {
        this.a.k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && elapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.b.i(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new am0(this, elapsedRealtime, 16));
    }
}
