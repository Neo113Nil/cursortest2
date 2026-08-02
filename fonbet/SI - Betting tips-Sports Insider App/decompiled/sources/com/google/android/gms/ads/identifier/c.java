package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.recyclerview.widget.j;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import d6.f;
import g6.i;
import i6.d;
import j$.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f4236c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f4237d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Duration f4238e = Duration.ofMinutes(30);

    /* renamed from: a, reason: collision with root package name */
    public final d f4239a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f4240b = new AtomicLong(-1);

    public c(Context context) {
        this.f4239a = new d(context, null, d.f10999m, new i("ads_identifier:api"), f.f8246c);
    }

    public static c a(Context context) {
        if (f4236c == null) {
            synchronized (f4237d) {
                try {
                    if (f4236c == null) {
                        f4236c = new c(context);
                    }
                } finally {
                }
            }
        }
        return f4236c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r3 - r17.f4240b.get()) > com.google.android.gms.ads.identifier.c.f4238e.toMillis()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b(int i5, int i10, long j, long j6) {
        AtomicLong atomicLong = this.f4240b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.f4240b.get() != -1) {
        }
        d dVar = this.f4239a;
        if (dVar == null) {
            return;
        }
        dVar.d(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i5, 0, j, j6, null, null, 0, i10)))).d(new j(2, elapsedRealtime, this));
    }
}
