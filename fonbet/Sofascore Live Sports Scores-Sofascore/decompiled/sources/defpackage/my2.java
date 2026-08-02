package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class my2 implements v6c, t6c {
    public final v6c a;
    public t6c b;
    public ky2[] c = new ky2[0];
    public long d;
    public long e;
    public long f;
    public ry2 g;

    public my2(v6c v6cVar, boolean z, long j, long j2) {
        this.a = v6cVar;
        this.d = z ? j : C.TIME_UNSET;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.v6c
    public final long a(long j, c0h c0hVar) {
        long j2 = this.e;
        if (j == j2) {
            return j2;
        }
        long i = lik.i(c0hVar.a, 0L, j - j2);
        long j3 = c0hVar.b;
        long j4 = this.f;
        long i2 = lik.i(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (i != c0hVar.a || i2 != c0hVar.b) {
            c0hVar = new c0h(i, i2);
        }
        return this.a.a(j, c0hVar);
    }

    @Override // defpackage.t6c
    public final void b(z4h z4hVar) {
        t6c t6cVar = this.b;
        t6cVar.getClass();
        t6cVar.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x011c, code lost:
    
        if (r10 > r2) goto L93;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e2. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0126  */
    @Override // defpackage.v6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(mh6[] mh6VarArr, boolean[] zArr, ipg[] ipgVarArr, boolean[] zArr2, long j) {
        long j2;
        uif d;
        int b;
        this.c = new ky2[ipgVarArr.length];
        ipg[] ipgVarArr2 = new ipg[ipgVarArr.length];
        int i = 0;
        while (true) {
            ipg ipgVar = null;
            if (i >= ipgVarArr.length) {
                break;
            }
            ky2[] ky2VarArr = this.c;
            ky2 ky2Var = (ky2) ipgVarArr[i];
            ky2VarArr[i] = ky2Var;
            if (ky2Var != null) {
                ipgVar = ky2Var.a;
            }
            ipgVarArr2[i] = ipgVar;
            i++;
        }
        long c = this.a.c(mh6VarArr, zArr, ipgVarArr2, zArr2, j);
        boolean z = true;
        if (f()) {
            long j3 = this.e;
            if (j == j3 && j3 != 0) {
                for (mh6 mh6Var : mh6VarArr) {
                    if (mh6Var != null) {
                        sm8 selectedFormat = mh6Var.getSelectedFormat();
                        String str = selectedFormat.l;
                        String str2 = selectedFormat.i;
                        ArrayList arrayList = rjc.a;
                        if (str != null) {
                            switch (str) {
                                case "audio/mp4a-latm":
                                    if (str2 != null && (d = rjc.d(str2)) != null && (b = d.b()) != 0 && b != 16) {
                                        break;
                                    }
                                    break;
                            }
                            this.d = j2;
                            if (c != j) {
                                if (c >= this.e) {
                                    long j4 = this.f;
                                    if (j4 != Long.MIN_VALUE) {
                                    }
                                }
                                z = false;
                            }
                            qx9.t(z);
                            for (int i2 = 0; i2 < ipgVarArr.length; i2++) {
                                ipg ipgVar2 = ipgVarArr2[i2];
                                ky2[] ky2VarArr2 = this.c;
                                if (ipgVar2 == null) {
                                    ky2VarArr2[i2] = null;
                                } else {
                                    ky2 ky2Var2 = ky2VarArr2[i2];
                                    if (ky2Var2 == null || ky2Var2.a != ipgVar2) {
                                        ky2VarArr2[i2] = new ky2(this, ipgVar2);
                                    }
                                }
                                ipgVarArr[i2] = ky2VarArr2[i2];
                            }
                            return c;
                        }
                        j2 = c;
                        this.d = j2;
                        if (c != j) {
                        }
                        qx9.t(z);
                        while (i2 < ipgVarArr.length) {
                        }
                        return c;
                    }
                }
            }
        }
        j2 = C.TIME_UNSET;
        this.d = j2;
        if (c != j) {
        }
        qx9.t(z);
        while (i2 < ipgVarArr.length) {
        }
        return c;
    }

    @Override // defpackage.z4h
    public final boolean continueLoading(long j) {
        return this.a.continueLoading(j);
    }

    @Override // defpackage.t6c
    public final void d(v6c v6cVar) {
        if (this.g != null) {
            return;
        }
        t6c t6cVar = this.b;
        t6cVar.getClass();
        t6cVar.d(this);
    }

    @Override // defpackage.v6c
    public final void e(long j) {
        this.a.e(j);
    }

    public final boolean f() {
        return this.d != C.TIME_UNSET;
    }

    @Override // defpackage.v6c
    public final void g(t6c t6cVar, long j) {
        this.b = t6cVar;
        this.a.g(this, j);
    }

    @Override // defpackage.z4h
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.a.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.z4h
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.a.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.f;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
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
        ry2 ry2Var = this.g;
        if (ry2Var != null) {
            throw ry2Var;
        }
        this.a.maybeThrowPrepareError();
    }

    @Override // defpackage.v6c
    public final long readDiscontinuity() {
        if (f()) {
            long j = this.d;
            this.d = C.TIME_UNSET;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != C.TIME_UNSET ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.a.readDiscontinuity();
        if (readDiscontinuity2 == C.TIME_UNSET) {
            return C.TIME_UNSET;
        }
        qx9.t(readDiscontinuity2 >= this.e);
        long j2 = this.f;
        qx9.t(j2 == Long.MIN_VALUE || readDiscontinuity2 <= j2);
        return readDiscontinuity2;
    }

    @Override // defpackage.z4h
    public final void reevaluateBuffer(long j) {
        this.a.reevaluateBuffer(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r5) goto L17;
     */
    @Override // defpackage.v6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j) {
        this.d = C.TIME_UNSET;
        boolean z = false;
        for (ky2 ky2Var : this.c) {
            if (ky2Var != null) {
                ky2Var.b = false;
            }
        }
        long seekToUs = this.a.seekToUs(j);
        if (seekToUs != j) {
            if (seekToUs >= this.e) {
                long j2 = this.f;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            qx9.t(z);
            return seekToUs;
        }
        z = true;
        qx9.t(z);
        return seekToUs;
    }
}
