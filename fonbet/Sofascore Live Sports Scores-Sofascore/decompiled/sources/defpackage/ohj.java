package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ohj implements w6c, u6c {
    public final w6c a;
    public final long b;
    public u6c c;

    public ohj(w6c w6cVar, long j) {
        this.a = w6cVar;
        this.b = j;
    }

    @Override // defpackage.w6c
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        jpg[] jpgVarArr2 = new jpg[jpgVarArr.length];
        int i = 0;
        while (true) {
            jpg jpgVar = null;
            if (i >= jpgVarArr.length) {
                break;
            }
            nhj nhjVar = (nhj) jpgVarArr[i];
            if (nhjVar != null) {
                jpgVar = nhjVar.a;
            }
            jpgVarArr2[i] = jpgVar;
            i++;
        }
        w6c w6cVar = this.a;
        long j2 = this.b;
        long a = w6cVar.a(nh6VarArr, zArr, jpgVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < jpgVarArr.length; i2++) {
            jpg jpgVar2 = jpgVarArr2[i2];
            if (jpgVar2 == null) {
                jpgVarArr[i2] = null;
            } else {
                jpg jpgVar3 = jpgVarArr[i2];
                if (jpgVar3 == null || ((nhj) jpgVar3).a != jpgVar2) {
                    jpgVarArr[i2] = new nhj(jpgVar2, j2);
                }
            }
        }
        return a + j2;
    }

    @Override // defpackage.y4h
    public final void b(a5h a5hVar) {
        u6c u6cVar = this.c;
        u6cVar.getClass();
        u6cVar.b(this);
    }

    @Override // defpackage.w6c
    public final long c(long j, d0h d0hVar) {
        long j2 = this.b;
        return this.a.c(j - j2, d0hVar) + j2;
    }

    @Override // defpackage.u6c
    public final void d(w6c w6cVar) {
        u6c u6cVar = this.c;
        u6cVar.getClass();
        u6cVar.d(this);
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
        this.a.discardBuffer(j - this.b, z);
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        this.c = u6cVar;
        this.a.f(this, j - this.b);
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        lgb lgbVar = new lgb();
        long j = mgbVar.a;
        lgbVar.b = mgbVar.b;
        lgbVar.c = mgbVar.c;
        lgbVar.a = j - this.b;
        return this.a.g(new mgb(lgbVar));
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.b;
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.b;
    }

    @Override // defpackage.w6c
    public final qsj getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // defpackage.a5h
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.w6c
    public final void maybeThrowPrepareError() {
        this.a.maybeThrowPrepareError();
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        long readDiscontinuity = this.a.readDiscontinuity();
        return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : readDiscontinuity + this.b;
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j - this.b);
    }

    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        long j2 = this.b;
        return this.a.seekToUs(j - j2) + j2;
    }
}
