package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fi2 extends n51 {
    public final im4 s;
    public final j9e t;
    public di2 u;
    public long v;

    public fi2() {
        super(6);
        this.s = new im4(1);
        this.t = new j9e();
    }

    @Override // defpackage.n51
    public final int A(b bVar) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(bVar.o) ? n51.a(4, 0, 0, 0) : n51.a(0, 0, 0, 0);
    }

    @Override // defpackage.n51
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.n51, defpackage.jte
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.u = (di2) obj;
        }
    }

    @Override // defpackage.n51
    public final boolean j() {
        return i();
    }

    @Override // defpackage.n51
    public final boolean l() {
        return true;
    }

    @Override // defpackage.n51
    public final void m() {
        di2 di2Var = this.u;
        if (di2Var != null) {
            di2Var.b();
        }
    }

    @Override // defpackage.n51
    public final void o(long j, boolean z, boolean z2) {
        this.v = Long.MIN_VALUE;
        di2 di2Var = this.u;
        if (di2Var != null) {
            di2Var.b();
        }
    }

    @Override // defpackage.n51
    public final void w(long j, long j2) {
        float[] fArr;
        while (!i() && this.v < 100000 + j) {
            im4 im4Var = this.s;
            im4Var.A();
            fp4 fp4Var = this.c;
            fp4Var.j();
            if (v(fp4Var, im4Var, 0) != -4 || im4Var.i(4)) {
                return;
            }
            long j3 = im4Var.k;
            this.v = j3;
            boolean z = j3 < this.l;
            if (this.u != null && !z) {
                im4Var.D();
                ByteBuffer byteBuffer = im4Var.i;
                String str = nik.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    j9e j9eVar = this.t;
                    j9eVar.L(array, limit);
                    j9eVar.N(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(j9eVar.o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.u.a(this.v - this.k, fArr);
                }
            }
        }
    }
}
