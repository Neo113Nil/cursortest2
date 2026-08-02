package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kgc implements v6c, t6c {
    public final v6c a;
    public final long b;
    public t6c c;

    public kgc(v6c v6cVar, long j) {
        this.a = v6cVar;
        this.b = j;
    }

    @Override // defpackage.v6c
    public final long a(long j, c0h c0hVar) {
        long j2 = this.b;
        return this.a.a(j - j2, c0hVar) + j2;
    }

    @Override // defpackage.t6c
    public final void b(z4h z4hVar) {
        t6c t6cVar = this.c;
        t6cVar.getClass();
        t6cVar.b(this);
    }

    @Override // defpackage.v6c
    public final long c(mh6[] mh6VarArr, boolean[] zArr, ipg[] ipgVarArr, boolean[] zArr2, long j) {
        ipg[] ipgVarArr2 = new ipg[ipgVarArr.length];
        int i = 0;
        while (true) {
            ipg ipgVar = null;
            if (i >= ipgVarArr.length) {
                break;
            }
            lgc lgcVar = (lgc) ipgVarArr[i];
            if (lgcVar != null) {
                ipgVar = lgcVar.a;
            }
            ipgVarArr2[i] = ipgVar;
            i++;
        }
        v6c v6cVar = this.a;
        long j2 = this.b;
        long c = v6cVar.c(mh6VarArr, zArr, ipgVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ipgVarArr.length; i2++) {
            ipg ipgVar2 = ipgVarArr2[i2];
            if (ipgVar2 == null) {
                ipgVarArr[i2] = null;
            } else {
                ipg ipgVar3 = ipgVarArr[i2];
                if (ipgVar3 == null || ((lgc) ipgVar3).a != ipgVar2) {
                    ipgVarArr[i2] = new lgc(ipgVar2, j2);
                }
            }
        }
        return c + j2;
    }

    @Override // defpackage.z4h
    public final boolean continueLoading(long j) {
        return this.a.continueLoading(j - this.b);
    }

    @Override // defpackage.t6c
    public final void d(v6c v6cVar) {
        t6c t6cVar = this.c;
        t6cVar.getClass();
        t6cVar.d(this);
    }

    @Override // defpackage.v6c
    public final void e(long j) {
        this.a.e(j - this.b);
    }

    @Override // defpackage.v6c
    public final void g(t6c t6cVar, long j) {
        this.c = t6cVar;
        this.a.g(this, j - this.b);
    }

    @Override // defpackage.z4h
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.a.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.b;
    }

    @Override // defpackage.z4h
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.a.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.b;
    }

    @Override // defpackage.v6c
    public final psj getTrackGroups() {
        return this.a.getTrackGroups();
    }

    @Override // defpackage.z4h
    public final boolean isLoading() {
        return this.a.isLoading();
    }

    @Override // defpackage.v6c
    public final void maybeThrowPrepareError() {
        this.a.maybeThrowPrepareError();
    }

    @Override // defpackage.v6c
    public final long readDiscontinuity() {
        long readDiscontinuity = this.a.readDiscontinuity();
        return readDiscontinuity == C.TIME_UNSET ? C.TIME_UNSET : readDiscontinuity + this.b;
    }

    @Override // defpackage.z4h
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j - this.b);
    }

    @Override // defpackage.v6c
    public final long seekToUs(long j) {
        long j2 = this.b;
        return this.a.seekToUs(j - j2) + j2;
    }
}
