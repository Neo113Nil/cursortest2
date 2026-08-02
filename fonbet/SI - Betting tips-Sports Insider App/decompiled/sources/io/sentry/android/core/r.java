package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class r implements io.sentry.android.core.internal.util.o {

    /* renamed from: a, reason: collision with root package name */
    public float f15826a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f15827b;

    public r(u uVar) {
        this.f15827b = uVar;
    }

    @Override // io.sentry.android.core.internal.util.o
    public final void b(long j, long j6, long j10, long j11, boolean z5, boolean z7, float f6) {
        Date n9 = com.google.android.play.core.appupdate.b.n();
        System.nanoTime();
        long time = n9.getTime() * 1000000;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j6 - System.nanoTime());
        u uVar = this.f15827b;
        long j12 = elapsedRealtimeNanos - uVar.f15845a;
        if (j12 < 0) {
            return;
        }
        if (z7) {
            uVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j12), Long.valueOf(j10), time));
        } else if (z5) {
            uVar.f15853i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j12), Long.valueOf(j10), time));
        }
        if (f6 != this.f15826a) {
            this.f15826a = f6;
            uVar.f15852h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j12), Float.valueOf(f6), time));
        }
    }
}
