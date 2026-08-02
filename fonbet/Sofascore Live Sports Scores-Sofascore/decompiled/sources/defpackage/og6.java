package defpackage;

import android.media.MediaFormat;
import androidx.media3.common.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class og6 implements npk, di2, jte {
    public npk a;
    public di2 b;
    public npk c;
    public di2 d;

    @Override // defpackage.di2
    public final void a(long j, float[] fArr) {
        di2 di2Var = this.d;
        if (di2Var != null) {
            di2Var.a(j, fArr);
        }
        di2 di2Var2 = this.b;
        if (di2Var2 != null) {
            di2Var2.a(j, fArr);
        }
    }

    @Override // defpackage.di2
    public final void b() {
        di2 di2Var = this.d;
        if (di2Var != null) {
            di2Var.b();
        }
        di2 di2Var2 = this.b;
        if (di2Var2 != null) {
            di2Var2.b();
        }
    }

    @Override // defpackage.npk
    public final void c(long j, long j2, b bVar, MediaFormat mediaFormat) {
        npk npkVar = this.c;
        if (npkVar != null) {
            npkVar.c(j, j2, bVar, mediaFormat);
        }
        npk npkVar2 = this.a;
        if (npkVar2 != null) {
            npkVar2.c(j, j2, bVar, mediaFormat);
        }
    }

    @Override // defpackage.jte
    public final void handleMessage(int i, Object obj) {
        if (i == 7) {
            this.a = (npk) obj;
            return;
        }
        if (i == 8) {
            this.b = (di2) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        nxh nxhVar = (nxh) obj;
        if (nxhVar == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = nxhVar.getVideoFrameMetadataListener();
            this.d = nxhVar.getCameraMotionListener();
        }
    }
}
