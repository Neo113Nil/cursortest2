package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ny2 implements w6c, u6c {
    public final w6c a;
    public u6c b;
    public ly2[] c = new ly2[0];
    public long d;
    public long e;
    public long f;
    public long g;
    public sy2 h;

    public ny2(w6c w6cVar, boolean z, long j, long j2, int i) {
        this.a = w6cVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = C.TIME_UNSET;
        this.f = j;
        this.g = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // defpackage.w6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(nh6[] nh6VarArr, boolean[] zArr, jpg[] jpgVarArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.c = new ly2[jpgVarArr.length];
        jpg[] jpgVarArr2 = new jpg[jpgVarArr.length];
        for (int i2 = 0; i2 < jpgVarArr.length; i2++) {
            ly2[] ly2VarArr = this.c;
            ly2 ly2Var = (ly2) jpgVarArr[i2];
            ly2VarArr[i2] = ly2Var;
            jpgVarArr2[i2] = ly2Var != null ? ly2Var.a : null;
        }
        long a = this.a.a(nh6VarArr, zArr, jpgVarArr2, zArr2, j);
        long j3 = this.g;
        long max = Math.max(a, j);
        if (j3 != Long.MIN_VALUE) {
            max = Math.min(max, j3);
        }
        if (e()) {
            if (a >= j) {
                if (a != 0) {
                    for (nh6 nh6Var : nh6VarArr) {
                        if (nh6Var != null) {
                            b selectedFormat = nh6Var.getSelectedFormat();
                            if (!sjc.a(selectedFormat.o, selectedFormat.k)) {
                            }
                        }
                    }
                }
            }
            j2 = max;
            this.d = j2;
            for (i = 0; i < jpgVarArr.length; i++) {
                jpg jpgVar = jpgVarArr2[i];
                ly2[] ly2VarArr2 = this.c;
                if (jpgVar == null) {
                    ly2VarArr2[i] = null;
                } else {
                    ly2 ly2Var2 = ly2VarArr2[i];
                    if (ly2Var2 == null || ly2Var2.a != jpgVar) {
                        ly2VarArr2[i] = new ly2(this, jpgVar);
                    }
                }
                jpgVarArr[i] = ly2VarArr2[i];
            }
            return max;
        }
        j2 = C.TIME_UNSET;
        this.d = j2;
        while (i < jpgVarArr.length) {
        }
        return max;
    }

    @Override // defpackage.y4h
    public final void b(a5h a5hVar) {
        u6c u6cVar = this.b;
        u6cVar.getClass();
        u6cVar.b(this);
    }

    @Override // defpackage.w6c
    public final long c(long j, d0h d0hVar) {
        long j2 = this.f;
        if (j == j2) {
            return j2;
        }
        long k = nik.k(d0hVar.a, 0L, j - j2);
        long j3 = d0hVar.b;
        long j4 = this.g;
        long k2 = nik.k(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (k != d0hVar.a || k2 != d0hVar.b) {
            d0hVar = new d0h(k, k2);
        }
        return this.a.c(j, d0hVar);
    }

    @Override // defpackage.u6c
    public final void d(w6c w6cVar) {
        if (this.h != null) {
            return;
        }
        u6c u6cVar = this.b;
        u6cVar.getClass();
        u6cVar.d(this);
    }

    @Override // defpackage.w6c
    public final void discardBuffer(long j, boolean z) {
        this.a.discardBuffer(j, z);
    }

    public final boolean e() {
        return this.d != C.TIME_UNSET;
    }

    @Override // defpackage.w6c
    public final void f(u6c u6cVar, long j) {
        this.b = u6cVar;
        this.a.f(this, j);
    }

    @Override // defpackage.a5h
    public final boolean g(mgb mgbVar) {
        return this.a.g(mgbVar);
    }

    @Override // defpackage.a5h
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.a5h
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
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
        sy2 sy2Var = this.h;
        if (sy2Var != null) {
            throw sy2Var;
        }
        this.a.maybeThrowPrepareError();
    }

    @Override // defpackage.w6c
    public final long readDiscontinuity() {
        if (e()) {
            long j = this.d;
            this.d = C.TIME_UNSET;
            this.e = j;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != C.TIME_UNSET ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.a.readDiscontinuity();
        if (readDiscontinuity2 != C.TIME_UNSET) {
            long j2 = this.f;
            long j3 = this.g;
            long max = Math.max(readDiscontinuity2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.e) {
                this.e = max;
                return max;
            }
        }
        return C.TIME_UNSET;
    }

    @Override // defpackage.a5h
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j);
    }

    @Override // defpackage.w6c
    public final long seekToUs(long j) {
        this.d = C.TIME_UNSET;
        for (ly2 ly2Var : this.c) {
            if (ly2Var != null) {
                ly2Var.b = false;
            }
        }
        long seekToUs = this.a.seekToUs(j);
        long j2 = this.f;
        long j3 = this.g;
        long max = Math.max(seekToUs, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }
}
