package defpackage;

import android.media.MediaFormat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ng6 implements mpk, ci2, ite {
    public mpk a;
    public ci2 b;
    public mpk c;
    public ci2 d;

    @Override // defpackage.ci2
    public final void a(long j, float[] fArr) {
        ci2 ci2Var = this.d;
        if (ci2Var != null) {
            ci2Var.a(j, fArr);
        }
        ci2 ci2Var2 = this.b;
        if (ci2Var2 != null) {
            ci2Var2.a(j, fArr);
        }
    }

    @Override // defpackage.ci2
    public final void b() {
        ci2 ci2Var = this.d;
        if (ci2Var != null) {
            ci2Var.b();
        }
        ci2 ci2Var2 = this.b;
        if (ci2Var2 != null) {
            ci2Var2.b();
        }
    }

    @Override // defpackage.mpk
    public final void c(long j, long j2, sm8 sm8Var, MediaFormat mediaFormat) {
        mpk mpkVar = this.c;
        if (mpkVar != null) {
            mpkVar.c(j, j2, sm8Var, mediaFormat);
        }
        mpk mpkVar2 = this.a;
        if (mpkVar2 != null) {
            mpkVar2.c(j, j2, sm8Var, mediaFormat);
        }
    }

    @Override // defpackage.ite
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.a = (mpk) obj;
            return;
        }
        if (i == 8) {
            this.b = (ci2) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        mxh mxhVar = (mxh) obj;
        if (mxhVar == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = mxhVar.getVideoFrameMetadataListener();
            this.d = mxhVar.getCameraMotionListener();
        }
    }
}
