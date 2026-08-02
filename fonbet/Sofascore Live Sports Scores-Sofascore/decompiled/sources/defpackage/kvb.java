package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kvb implements v6c, t6c {
    public final rcc a;
    public final long b;
    public final zz0 c;
    public a51 d;
    public v6c e;
    public t6c f;
    public long g = C.TIME_UNSET;

    public kvb(rcc rccVar, zz0 zz0Var, long j) {
        this.a = rccVar;
        this.c = zz0Var;
        this.b = j;
    }

    @Override // defpackage.v6c
    public final long a(long j, c0h c0hVar) {
        v6c v6cVar = this.e;
        int i = lik.a;
        return v6cVar.a(j, c0hVar);
    }

    @Override // defpackage.t6c
    public final void b(z4h z4hVar) {
        t6c t6cVar = this.f;
        int i = lik.a;
        t6cVar.b(this);
    }

    @Override // defpackage.v6c
    public final long c(mh6[] mh6VarArr, boolean[] zArr, ipg[] ipgVarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != C.TIME_UNSET && j == this.b) {
            this.g = C.TIME_UNSET;
            j = j2;
        }
        v6c v6cVar = this.e;
        int i = lik.a;
        return v6cVar.c(mh6VarArr, zArr, ipgVarArr, zArr2, j);
    }

    @Override // defpackage.z4h
    public final boolean continueLoading(long j) {
        v6c v6cVar = this.e;
        return v6cVar != null && v6cVar.continueLoading(j);
    }

    @Override // defpackage.t6c
    public final void d(v6c v6cVar) {
        t6c t6cVar = this.f;
        int i = lik.a;
        t6cVar.d(this);
    }

    @Override // defpackage.v6c
    public final void e(long j) {
        v6c v6cVar = this.e;
        int i = lik.a;
        v6cVar.e(j);
    }

    public final void f(rcc rccVar) {
        long j = this.g;
        if (j == C.TIME_UNSET) {
            j = this.b;
        }
        a51 a51Var = this.d;
        a51Var.getClass();
        v6c a = a51Var.a(rccVar, this.c, j);
        this.e = a;
        if (this.f != null) {
            a.g(this, j);
        }
    }

    @Override // defpackage.v6c
    public final void g(t6c t6cVar, long j) {
        this.f = t6cVar;
        v6c v6cVar = this.e;
        if (v6cVar != null) {
            long j2 = this.g;
            if (j2 == C.TIME_UNSET) {
                j2 = this.b;
            }
            v6cVar.g(this, j2);
        }
    }

    @Override // defpackage.z4h
    public final long getBufferedPositionUs() {
        v6c v6cVar = this.e;
        int i = lik.a;
        return v6cVar.getBufferedPositionUs();
    }

    @Override // defpackage.z4h
    public final long getNextLoadPositionUs() {
        v6c v6cVar = this.e;
        int i = lik.a;
        return v6cVar.getNextLoadPositionUs();
    }

    @Override // defpackage.v6c
    public final psj getTrackGroups() {
        v6c v6cVar = this.e;
        int i = lik.a;
        return v6cVar.getTrackGroups();
    }

    @Override // defpackage.z4h
    public final boolean isLoading() {
        v6c v6cVar = this.e;
        return v6cVar != null && v6cVar.isLoading();
    }

    @Override // defpackage.v6c
    public final void maybeThrowPrepareError() {
        v6c v6cVar = this.e;
        if (v6cVar != null) {
            v6cVar.maybeThrowPrepareError();
            return;
        }
        a51 a51Var = this.d;
        if (a51Var != null) {
            a51Var.i();
        }
    }

    @Override // defpackage.v6c
    public final long readDiscontinuity() {
        v6c v6cVar = this.e;
        int i = lik.a;
        return v6cVar.readDiscontinuity();
    }

    @Override // defpackage.z4h
    public final void reevaluateBuffer(long j) {
        v6c v6cVar = this.e;
        int i = lik.a;
        v6cVar.reevaluateBuffer(j);
    }

    @Override // defpackage.v6c
    public final long seekToUs(long j) {
        v6c v6cVar = this.e;
        int i = lik.a;
        return v6cVar.seekToUs(j);
    }
}
