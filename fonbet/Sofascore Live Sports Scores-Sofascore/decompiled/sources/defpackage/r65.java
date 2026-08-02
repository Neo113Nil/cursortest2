package defpackage;

import android.graphics.PointF;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.same.report.j;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class r65 implements lkk {
    public static final r65 a = new r65();
    public static final wj9 b = wj9.J("t", InneractiveMediationDefs.GENDER_FEMALE, "s", j.b, "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.lkk
    public final Object i(wga wgaVar, float f) {
        wgaVar.k();
        String str = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        int i4 = 3;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (wgaVar.t()) {
            switch (wgaVar.e0(b)) {
                case 0:
                    str = wgaVar.T();
                    break;
                case 1:
                    str2 = wgaVar.T();
                    break;
                case 2:
                    f2 = (float) wgaVar.H();
                    break;
                case 3:
                    int M = wgaVar.M();
                    if (M <= 2 && M >= 0) {
                        i4 = wt3.D(3)[M];
                        break;
                    } else {
                        i4 = 3;
                        break;
                    }
                    break;
                case 4:
                    i = wgaVar.M();
                    break;
                case 5:
                    f3 = (float) wgaVar.H();
                    break;
                case 6:
                    f4 = (float) wgaVar.H();
                    break;
                case 7:
                    i2 = nha.a(wgaVar);
                    break;
                case 8:
                    i3 = nha.a(wgaVar);
                    break;
                case 9:
                    f5 = (float) wgaVar.H();
                    break;
                case 10:
                    z = wgaVar.C();
                    break;
                case 11:
                    wgaVar.h();
                    pointF = new PointF(((float) wgaVar.H()) * f, ((float) wgaVar.H()) * f);
                    wgaVar.m();
                    break;
                case 12:
                    wgaVar.h();
                    pointF = pointF;
                    pointF2 = new PointF(((float) wgaVar.H()) * f, ((float) wgaVar.H()) * f);
                    wgaVar.m();
                    break;
                default:
                    wgaVar.f0();
                    wgaVar.g0();
                    break;
            }
        }
        wgaVar.n();
        q65 q65Var = new q65();
        q65Var.a = str;
        q65Var.b = str2;
        q65Var.c = f2;
        q65Var.d = i4;
        q65Var.e = i;
        q65Var.f = f3;
        q65Var.g = f4;
        q65Var.h = i2;
        q65Var.i = i3;
        q65Var.j = f5;
        q65Var.k = z;
        q65Var.l = pointF;
        q65Var.m = pointF2;
        return q65Var;
    }
}
