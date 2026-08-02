package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class h09 extends bw4 implements ga5 {
    public final n00 q;
    public final mg5 r;
    public final t3e s;

    public h09(ooi ooiVar, n00 n00Var, mg5 mg5Var, t3e t3eVar) {
        this.q = n00Var;
        this.r = mg5Var;
        this.s = t3eVar;
        k1(ooiVar);
    }

    public static boolean n1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // defpackage.ga5
    public final void o(yma ymaVar) {
        boolean z;
        char c;
        long j;
        wj2 wj2Var = ymaVar.a;
        long n = wj2Var.n();
        n00 n00Var = this.q;
        n00Var.l(n);
        if (njh.g(wj2Var.n())) {
            ymaVar.a();
            return;
        }
        ymaVar.a();
        ((eoh) n00Var.d).getValue();
        Canvas b = xx.b(wj2Var.b.t());
        mg5 mg5Var = this.r;
        boolean f = mg5.f(mg5Var.f);
        t3e t3eVar = this.s;
        if (f) {
            EdgeEffect c2 = mg5Var.c();
            float f2 = -Float.intBitsToFloat((int) (wj2Var.n() & 4294967295L));
            z = n1(270.0f, (Float.floatToRawIntBits(ymaVar.H0(t3eVar.b(ymaVar.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), c2, b);
        } else {
            z = false;
        }
        if (mg5.f(mg5Var.d)) {
            c = ' ';
            j = 4294967295L;
            z = n1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (((long) Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) << 32) | (((long) Float.floatToRawIntBits(ymaVar.H0(t3eVar.b))) & 4294967295L), mg5Var.e(), b) || z;
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if (mg5.f(mg5Var.g)) {
            z = n1(90.0f, (((long) Float.floatToRawIntBits(ymaVar.H0(t3eVar.c(ymaVar.getLayoutDirection())) + (-((float) wzb.b(Float.intBitsToFloat((int) (wj2Var.n() >> c))))))) & j) | (((long) Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) << c), mg5Var.d(), b) || z;
        }
        if (mg5.f(mg5Var.e)) {
            EdgeEffect b2 = mg5Var.b();
            z = n1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (wj2Var.n() >> c)))) << c) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (wj2Var.n() & j))) + ymaVar.H0(t3eVar.d))) & j), b2, b) || z;
        }
        if (z) {
            n00Var.g();
        }
    }
}
