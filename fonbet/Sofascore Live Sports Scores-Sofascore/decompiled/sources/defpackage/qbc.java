package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qbc implements l2c {
    public boolean a;
    public long b;
    public long c;
    public final Object d;
    public Object e;

    public qbc(yp8 yp8Var) {
        this.d = new Handler(Looper.getMainLooper());
        this.e = yp8Var;
    }

    @Override // defpackage.l2c
    public void a(gke gkeVar) {
        if (this.a) {
            b(getPositionUs());
        }
        this.e = gkeVar;
    }

    public void b(long j) {
        this.b = j;
        if (this.a) {
            ((sqi) this.d).getClass();
            this.c = SystemClock.elapsedRealtime();
        }
    }

    public void c() {
        if (this.a) {
            return;
        }
        ((sqi) this.d).getClass();
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    @Override // defpackage.l2c
    public gke getPlaybackParameters() {
        return (gke) this.e;
    }

    @Override // defpackage.l2c, defpackage.m2c
    public long getPositionUs() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        ((sqi) this.d).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (((gke) this.e).a == 1.0f ? lik.y(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }

    public qbc(sqi sqiVar) {
        this.d = sqiVar;
        this.e = gke.d;
    }
}
