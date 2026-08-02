package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3179c;
import com.google.android.gms.common.internal.C3192p;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
public final class C0 implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final C3130g f32335a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32336b;

    /* renamed from: c, reason: collision with root package name */
    public final C3120b f32337c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32338d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32339e;

    public C0(C3130g c3130g, int i10, C3120b c3120b, long j10, long j11, String str, String str2) {
        this.f32335a = c3130g;
        this.f32336b = i10;
        this.f32337c = c3120b;
        this.f32338d = j10;
        this.f32339e = j11;
    }

    public static C0 a(C3130g c3130g, int i10, C3120b c3120b) {
        boolean z10;
        if (!c3130g.e()) {
            return null;
        }
        RootTelemetryConfiguration a10 = C3192p.b().a();
        if (a10 == null) {
            z10 = true;
        } else {
            if (!a10.i()) {
                return null;
            }
            z10 = a10.j();
            C3147o0 t10 = c3130g.t(c3120b);
            if (t10 != null) {
                if (!(t10.v() instanceof AbstractC3179c)) {
                    return null;
                }
                AbstractC3179c abstractC3179c = (AbstractC3179c) t10.v();
                if (abstractC3179c.hasConnectionInfo() && !abstractC3179c.isConnecting()) {
                    ConnectionTelemetryConfiguration b10 = b(t10, abstractC3179c, i10);
                    if (b10 == null) {
                        return null;
                    }
                    t10.G();
                    z10 = b10.k();
                }
            }
        }
        return new C0(c3130g, i10, c3120b, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    public static ConnectionTelemetryConfiguration b(C3147o0 c3147o0, AbstractC3179c abstractC3179c, int i10) {
        int[] h10;
        int[] i11;
        ConnectionTelemetryConfiguration telemetryConfiguration = abstractC3179c.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.j() || ((h10 = telemetryConfiguration.h()) != null ? !K9.b.a(h10, i10) : !((i11 = telemetryConfiguration.i()) == null || !K9.b.a(i11, i10))) || c3147o0.t() >= telemetryConfiguration.g()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        C3147o0 t10;
        int i10;
        int i11;
        int i12;
        int h10;
        long j10;
        long j11;
        if (this.f32335a.e()) {
            RootTelemetryConfiguration a10 = C3192p.b().a();
            if ((a10 == null || a10.i()) && (t10 = this.f32335a.t(this.f32337c)) != null && (t10.v() instanceof AbstractC3179c)) {
                AbstractC3179c abstractC3179c = (AbstractC3179c) t10.v();
                int i13 = 0;
                boolean z10 = this.f32338d > 0;
                int gCoreServiceId = abstractC3179c.getGCoreServiceId();
                int i14 = 100;
                if (a10 != null) {
                    z10 &= a10.j();
                    int g10 = a10.g();
                    int h11 = a10.h();
                    i10 = a10.k();
                    if (abstractC3179c.hasConnectionInfo() && !abstractC3179c.isConnecting()) {
                        ConnectionTelemetryConfiguration b10 = b(t10, abstractC3179c, this.f32336b);
                        if (b10 == null) {
                            return;
                        }
                        boolean z11 = b10.k() && this.f32338d > 0;
                        h11 = b10.g();
                        z10 = z11;
                    }
                    i12 = g10;
                    i11 = h11;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                C3130g c3130g = this.f32335a;
                int i15 = -1;
                if (task.isSuccessful()) {
                    h10 = 0;
                } else {
                    if (!task.isCanceled()) {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.b) {
                            Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                            i14 = status.i();
                            ConnectionResult g11 = status.g();
                            if (g11 != null) {
                                h10 = g11.h();
                                i13 = i14;
                            }
                        } else {
                            i13 = 101;
                            h10 = -1;
                        }
                    }
                    i13 = i14;
                    h10 = -1;
                }
                if (z10) {
                    long j12 = this.f32338d;
                    long j13 = this.f32339e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i15 = (int) (SystemClock.elapsedRealtime() - j13);
                    j11 = currentTimeMillis;
                    j10 = j12;
                } else {
                    j10 = 0;
                    j11 = 0;
                }
                c3130g.F(new MethodInvocation(this.f32336b, i13, h10, j10, j11, null, null, gCoreServiceId, i15), i10, i12, i11);
            }
        }
    }
}
