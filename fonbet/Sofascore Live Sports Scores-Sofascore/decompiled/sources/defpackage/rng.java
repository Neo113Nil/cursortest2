package defpackage;

import android.graphics.Canvas;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class rng extends d2a {
    public float f;
    public float g;
    public final /* synthetic */ vng h;

    public rng(vng vngVar, float f, float f2) {
        this.h = vngVar;
        this.f = f;
        this.g = f2;
    }

    @Override // defpackage.d2a
    public void B(String str) {
        vng vngVar = this.h;
        Canvas canvas = (Canvas) vngVar.a;
        if (vngVar.u0()) {
            tng tngVar = (tng) vngVar.c;
            if (tngVar.b) {
                canvas.drawText(str, this.f, this.g, tngVar.d);
            }
            tng tngVar2 = (tng) vngVar.c;
            if (tngVar2.c) {
                canvas.drawText(str, this.f, this.g, tngVar2.e);
            }
        }
        this.f = ((tng) vngVar.c).d.measureText(str) + this.f;
    }
}
