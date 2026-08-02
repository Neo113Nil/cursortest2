package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ly2 implements jpg {
    public final jpg a;
    public boolean b;
    public final /* synthetic */ ny2 c;

    public ly2(ny2 ny2Var, jpg jpgVar) {
        this.c = ny2Var;
        this.a = jpgVar;
    }

    @Override // defpackage.jpg
    public final int e(fp4 fp4Var, im4 im4Var, int i) {
        ny2 ny2Var = this.c;
        if (ny2Var.e()) {
            return -3;
        }
        if (this.b) {
            im4Var.b = 4;
            return -4;
        }
        long bufferedPositionUs = ny2Var.getBufferedPositionUs();
        int e = this.a.e(fp4Var, im4Var, i);
        if (ny2Var.e != C.TIME_UNSET && e != -3) {
            ny2Var.e = C.TIME_UNSET;
        }
        if (e != -5) {
            long j = ny2Var.g;
            if (j == Long.MIN_VALUE || ((e != -4 || im4Var.k < j) && !(e == -3 && bufferedPositionUs == Long.MIN_VALUE && !im4Var.j))) {
                return e;
            }
            im4Var.A();
            im4Var.b = 4;
            this.b = true;
            return -4;
        }
        long j2 = ny2Var.f;
        long j3 = ny2Var.g;
        b bVar = (b) fp4Var.c;
        bVar.getClass();
        int i2 = bVar.K;
        int i3 = bVar.J;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            qm8 a = bVar.a();
            a.I = i3;
            a.J = i2;
            fp4Var.c = new b(a);
        }
        return -5;
    }

    @Override // defpackage.jpg
    public final boolean isReady() {
        return !this.c.e() && this.a.isReady();
    }

    @Override // defpackage.jpg
    public final void maybeThrowError() {
        this.a.maybeThrowError();
    }

    @Override // defpackage.jpg
    public final int skipData(long j) {
        if (this.c.e()) {
            return -3;
        }
        return this.a.skipData(j);
    }
}
