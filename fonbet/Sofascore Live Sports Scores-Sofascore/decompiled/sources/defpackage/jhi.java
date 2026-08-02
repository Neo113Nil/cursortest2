package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jhi extends bw4 implements ga5 {
    public final n00 q;
    public final mg5 r;
    public RenderNode s;

    public jhi(ooi ooiVar, n00 n00Var, mg5 mg5Var) {
        this.q = n00Var;
        this.r = mg5Var;
        k1(ooiVar);
    }

    public static boolean n1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02cb  */
    @Override // defpackage.ga5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(yma ymaVar) {
        float f;
        boolean z;
        char c;
        float f2;
        wx wxVar;
        kx4 u;
        ema z2;
        uj2 t;
        long D;
        n29 n29Var;
        float f3;
        float f4;
        wj2 wj2Var = ymaVar.a;
        long n = wj2Var.n();
        n00 n00Var = this.q;
        n00Var.l(n);
        Canvas b = xx.b(wj2Var.b.t());
        ((eoh) n00Var.d).getValue();
        if (njh.g(wj2Var.n())) {
            ymaVar.a();
            return;
        }
        boolean isHardwareAccelerated = b.isHardwareAccelerated();
        mg5 mg5Var = this.r;
        if (!isHardwareAccelerated) {
            EdgeEffect edgeEffect = mg5Var.d;
            if (edgeEffect != null) {
                edgeEffect.finish();
            }
            EdgeEffect edgeEffect2 = mg5Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.finish();
            }
            EdgeEffect edgeEffect3 = mg5Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.finish();
            }
            EdgeEffect edgeEffect4 = mg5Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.finish();
            }
            EdgeEffect edgeEffect5 = mg5Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.finish();
            }
            EdgeEffect edgeEffect6 = mg5Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.finish();
            }
            EdgeEffect edgeEffect7 = mg5Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.finish();
            }
            EdgeEffect edgeEffect8 = mg5Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.finish();
            }
            ymaVar.a();
            return;
        }
        float H0 = ymaVar.H0(30.0f);
        boolean z3 = mg5.f(mg5Var.d) || mg5.g(mg5Var.h) || mg5.f(mg5Var.e) || mg5.g(mg5Var.i);
        boolean z4 = mg5.f(mg5Var.f) || mg5.g(mg5Var.j) || mg5.f(mg5Var.g) || mg5.g(mg5Var.k);
        if (z3 && z4) {
            o1().setPosition(0, 0, b.getWidth(), b.getHeight());
        } else if (z3) {
            o1().setPosition(0, 0, (wzb.b(H0) * 2) + b.getWidth(), b.getHeight());
        } else {
            if (!z4) {
                ymaVar.a();
                return;
            }
            o1().setPosition(0, 0, b.getWidth(), (wzb.b(H0) * 2) + b.getHeight());
        }
        RecordingCanvas beginRecording = o1().beginRecording();
        if (mg5.g(mg5Var.j)) {
            EdgeEffect edgeEffect9 = mg5Var.j;
            if (edgeEffect9 == null) {
                edgeEffect9 = mg5Var.a(ewd.b);
                mg5Var.j = edgeEffect9;
            }
            n1(90.0f, edgeEffect9, beginRecording);
            edgeEffect9.finish();
        }
        if (mg5.f(mg5Var.f)) {
            EdgeEffect c2 = mg5Var.c();
            z = n1(270.0f, c2, beginRecording);
            f = 1.0f;
            if (mg5.g(mg5Var.f)) {
                float intBitsToFloat = Float.intBitsToFloat((int) (n00Var.f() & 4294967295L));
                EdgeEffect edgeEffect10 = mg5Var.j;
                if (edgeEffect10 == null) {
                    edgeEffect10 = mg5Var.a(ewd.b);
                    mg5Var.j = edgeEffect10;
                }
                int i = Build.VERSION.SDK_INT;
                float l = i >= 31 ? qz.l(c2) : 0.0f;
                float f5 = 1.0f - intBitsToFloat;
                if (i >= 31) {
                    qz.t(edgeEffect10, l, f5);
                } else {
                    edgeEffect10.onPull(l, f5);
                }
            }
        } else {
            f = 1.0f;
            z = false;
        }
        if (mg5.g(mg5Var.h)) {
            EdgeEffect edgeEffect11 = mg5Var.h;
            if (edgeEffect11 == null) {
                edgeEffect11 = mg5Var.a(ewd.a);
                mg5Var.h = edgeEffect11;
            }
            n1(180.0f, edgeEffect11, beginRecording);
            edgeEffect11.finish();
        }
        try {
            try {
                if (mg5.f(mg5Var.d)) {
                    EdgeEffect e = mg5Var.e();
                    z = n1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e, beginRecording) || z;
                    if (mg5.g(mg5Var.d)) {
                        c = ' ';
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (n00Var.f() >> 32));
                        EdgeEffect edgeEffect12 = mg5Var.h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = mg5Var.a(ewd.a);
                            mg5Var.h = edgeEffect12;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float l2 = i2 >= 31 ? qz.l(e) : 0.0f;
                        if (i2 >= 31) {
                            qz.t(edgeEffect12, l2, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(l2, intBitsToFloat2);
                        }
                        if (mg5.g(mg5Var.k)) {
                            EdgeEffect edgeEffect13 = mg5Var.k;
                            if (edgeEffect13 == null) {
                                edgeEffect13 = mg5Var.a(ewd.b);
                                mg5Var.k = edgeEffect13;
                            }
                            n1(270.0f, edgeEffect13, beginRecording);
                            edgeEffect13.finish();
                        }
                        if (mg5.f(mg5Var.g)) {
                            EdgeEffect d = mg5Var.d();
                            z = n1(90.0f, d, beginRecording) || z;
                            if (mg5.g(mg5Var.g)) {
                                float intBitsToFloat3 = Float.intBitsToFloat((int) (n00Var.f() & 4294967295L));
                                EdgeEffect edgeEffect14 = mg5Var.k;
                                if (edgeEffect14 == null) {
                                    edgeEffect14 = mg5Var.a(ewd.b);
                                    mg5Var.k = edgeEffect14;
                                }
                                int i3 = Build.VERSION.SDK_INT;
                                float l3 = i3 >= 31 ? qz.l(d) : 0.0f;
                                if (i3 >= 31) {
                                    qz.t(edgeEffect14, l3, intBitsToFloat3);
                                } else {
                                    edgeEffect14.onPull(l3, intBitsToFloat3);
                                }
                            }
                        }
                        if (mg5.g(mg5Var.i)) {
                            EdgeEffect edgeEffect15 = mg5Var.i;
                            if (edgeEffect15 == null) {
                                edgeEffect15 = mg5Var.a(ewd.a);
                                mg5Var.i = edgeEffect15;
                            }
                            n1(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, edgeEffect15, beginRecording);
                            edgeEffect15.finish();
                        }
                        if (mg5.f(mg5Var.e)) {
                            EdgeEffect b2 = mg5Var.b();
                            boolean z5 = n1(180.0f, b2, beginRecording) || z;
                            if (mg5.g(mg5Var.e)) {
                                float intBitsToFloat4 = Float.intBitsToFloat((int) (n00Var.f() >> c));
                                EdgeEffect edgeEffect16 = mg5Var.i;
                                if (edgeEffect16 == null) {
                                    edgeEffect16 = mg5Var.a(ewd.a);
                                    mg5Var.i = edgeEffect16;
                                }
                                int i4 = Build.VERSION.SDK_INT;
                                float l4 = i4 >= 31 ? qz.l(b2) : 0.0f;
                                float f6 = f - intBitsToFloat4;
                                if (i4 >= 31) {
                                    qz.t(edgeEffect16, l4, f6);
                                } else {
                                    edgeEffect16.onPull(l4, f6);
                                }
                            }
                            z = z5;
                        }
                        if (z) {
                            n00Var.g();
                        }
                        f2 = !z4 ? 0.0f : H0;
                        if (z3) {
                            H0 = 0.0f;
                        }
                        ema layoutDirection = ymaVar.getLayoutDirection();
                        wxVar = new wx();
                        wxVar.a = beginRecording;
                        long n2 = wj2Var.n();
                        u = wj2Var.b.u();
                        z2 = wj2Var.b.z();
                        t = wj2Var.b.t();
                        D = wj2Var.b.D();
                        sx2 sx2Var = wj2Var.b;
                        n29Var = (n29) sx2Var.b;
                        sx2Var.L(ymaVar);
                        sx2Var.M(layoutDirection);
                        sx2Var.K(wxVar);
                        sx2Var.N(n2);
                        sx2Var.b = null;
                        wxVar.o();
                        ((hpo) wj2Var.b.a).I(f2, H0);
                        ymaVar.a();
                        wxVar.h();
                        sx2 sx2Var2 = wj2Var.b;
                        sx2Var2.L(u);
                        sx2Var2.M(z2);
                        sx2Var2.K(t);
                        sx2Var2.N(D);
                        sx2Var2.b = n29Var;
                        o1().endRecording();
                        int save = b.save();
                        b.translate(f3, f4);
                        b.drawRenderNode(o1());
                        b.restoreToCount(save);
                        return;
                    }
                }
                ymaVar.a();
                wxVar.h();
                sx2 sx2Var22 = wj2Var.b;
                sx2Var22.L(u);
                sx2Var22.M(z2);
                sx2Var22.K(t);
                sx2Var22.N(D);
                sx2Var22.b = n29Var;
                o1().endRecording();
                int save2 = b.save();
                b.translate(f3, f4);
                b.drawRenderNode(o1());
                b.restoreToCount(save2);
                return;
            } finally {
                ((hpo) wj2Var.b.a).I(-f2, -H0);
            }
            ((hpo) wj2Var.b.a).I(f2, H0);
        } catch (Throwable th) {
            wxVar.h();
            sx2 sx2Var3 = wj2Var.b;
            sx2Var3.L(u);
            sx2Var3.M(z2);
            sx2Var3.K(t);
            sx2Var3.N(D);
            sx2Var3.b = n29Var;
            throw th;
        }
        c = ' ';
        if (mg5.g(mg5Var.k)) {
        }
        if (mg5.f(mg5Var.g)) {
        }
        if (mg5.g(mg5Var.i)) {
        }
        if (mg5.f(mg5Var.e)) {
        }
        if (z) {
        }
        if (!z4) {
        }
        if (z3) {
        }
        ema layoutDirection2 = ymaVar.getLayoutDirection();
        wxVar = new wx();
        wxVar.a = beginRecording;
        long n22 = wj2Var.n();
        u = wj2Var.b.u();
        z2 = wj2Var.b.z();
        t = wj2Var.b.t();
        D = wj2Var.b.D();
        sx2 sx2Var4 = wj2Var.b;
        n29Var = (n29) sx2Var4.b;
        sx2Var4.L(ymaVar);
        sx2Var4.M(layoutDirection2);
        sx2Var4.K(wxVar);
        sx2Var4.N(n22);
        sx2Var4.b = null;
        wxVar.o();
    }

    public final RenderNode o1() {
        RenderNode renderNode = this.s;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode c = by1.c();
        this.s = c;
        return c;
    }
}
