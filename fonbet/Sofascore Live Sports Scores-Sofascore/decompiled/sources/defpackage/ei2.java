package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ei2 extends m51 {
    public final hm4 m;
    public final nkk n;
    public long o;
    public ci2 p;
    public long q;

    public ei2() {
        super(6);
        this.m = new hm4(1);
        this.n = new nkk(4, false);
    }

    @Override // defpackage.m51
    public final String e() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.m51
    public final boolean g() {
        return f();
    }

    @Override // defpackage.m51
    public final boolean h() {
        return true;
    }

    @Override // defpackage.m51, defpackage.ite
    public final void handleMessage(int i, Object obj) {
        if (i == 8) {
            this.p = (ci2) obj;
        }
    }

    @Override // defpackage.m51
    public final void i() {
        ci2 ci2Var = this.p;
        if (ci2Var != null) {
            ci2Var.b();
        }
    }

    @Override // defpackage.m51
    public final void k(long j, boolean z) {
        this.q = Long.MIN_VALUE;
        ci2 ci2Var = this.p;
        if (ci2Var != null) {
            ci2Var.b();
        }
    }

    @Override // defpackage.m51
    public final void o(sm8[] sm8VarArr, long j, long j2) {
        this.o = j2;
    }

    @Override // defpackage.m51
    public final void q(long j, long j2) {
        float[] fArr;
        while (!f() && this.q < 100000 + j) {
            hm4 hm4Var = this.m;
            hm4Var.A();
            fp4 fp4Var = this.b;
            fp4Var.j();
            if (p(fp4Var, hm4Var, 0) != -4 || hm4Var.i(4)) {
                return;
            }
            this.q = hm4Var.j;
            if (this.p != null && !hm4Var.i(Integer.MIN_VALUE)) {
                hm4Var.D();
                ByteBuffer byteBuffer = hm4Var.h;
                int i = lik.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    nkk nkkVar = this.n;
                    nkkVar.C(array, limit);
                    nkkVar.E(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(nkkVar.h());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.p.a(this.q - this.o, fArr);
                }
            }
        }
    }

    @Override // defpackage.m51
    public final int u(sm8 sm8Var) {
        return MimeTypes.APPLICATION_CAMERA_MOTION.equals(sm8Var.l) ? m51.b(4, 0, 0) : m51.b(0, 0, 0);
    }
}
