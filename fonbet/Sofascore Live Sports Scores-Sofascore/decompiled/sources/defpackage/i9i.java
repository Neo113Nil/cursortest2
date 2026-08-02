package defpackage;

import android.os.SystemClock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i9i implements m2c {
    public boolean a;
    public long b;
    public long c;
    public hke d;

    public final void a(long j) {
        this.b = j;
        if (this.a) {
            this.c = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.m2c
    public final void b(hke hkeVar) {
        if (this.a) {
            a(getPositionUs());
        }
        this.d = hkeVar;
    }

    public final void d() {
        if (this.a) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
        this.a = true;
    }

    @Override // defpackage.m2c
    /* renamed from: getPlaybackParameters */
    public final hke mo9getPlaybackParameters() {
        return this.d;
    }

    @Override // defpackage.m2c
    public final long getPositionUs() {
        long j = this.b;
        if (!this.a) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.c;
        return (this.d.a == 1.0f ? nik.T(elapsedRealtime) : elapsedRealtime * r6.c) + j;
    }
}
