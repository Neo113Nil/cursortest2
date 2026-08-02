package defpackage;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y19 extends oja {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y19(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new prg();
                break;
            default:
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    x19 x19Var = (x19) ((nja) list.get(i3)).b;
                    if (x19Var != null) {
                        i2 = Math.max(i2, x19Var.b.length);
                    }
                }
                this.j = new x19(new float[i2], new int[i2]);
                break;
        }
    }

    @Override // defpackage.o41
    public final Object f(nja njaVar, float f) {
        Object obj;
        float f2;
        int i = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                x19 x19Var = (x19) obj2;
                x19 x19Var2 = (x19) njaVar.b;
                x19 x19Var3 = (x19) njaVar.c;
                int[] iArr = x19Var.b;
                float[] fArr = x19Var.a;
                boolean equals = x19Var2.equals(x19Var3);
                int[] iArr2 = x19Var2.b;
                if (equals) {
                    x19Var.a(x19Var2);
                } else if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    x19Var.a(x19Var2);
                } else if (f >= 1.0f) {
                    x19Var.a(x19Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = x19Var3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        a70.p(fc6.h(iArr3.length, ")", sb));
                        return null;
                    }
                    for (int i2 = 0; i2 < iArr2.length; i2++) {
                        fArr[i2] = pkc.f(x19Var2.a[i2], x19Var3.a[i2], f);
                        iArr[i2] = dy0.s(f, iArr2[i2], iArr3[i2]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return x19Var;
            case 1:
                return l(njaVar, f, f, f);
            default:
                prg prgVar = (prg) obj2;
                Object obj3 = njaVar.b;
                if (obj3 == null || (obj = njaVar.c) == null) {
                    a70.r("Missing values for keyframe.");
                    return null;
                }
                prg prgVar2 = (prg) obj3;
                prg prgVar3 = (prg) obj;
                wj9 wj9Var = this.e;
                if (wj9Var != null) {
                    f2 = f;
                    prg prgVar4 = (prg) wj9Var.C(njaVar.g, njaVar.h.floatValue(), prgVar2, prgVar3, f2, d(), this.d);
                    if (prgVar4 != null) {
                        return prgVar4;
                    }
                } else {
                    f2 = f;
                }
                float f3 = pkc.f(prgVar2.a, prgVar3.a, f2);
                float f4 = pkc.f(prgVar2.b, prgVar3.b, f2);
                prgVar.a = f3;
                prgVar.b = f4;
                return prgVar;
        }
    }

    @Override // defpackage.o41
    public /* bridge */ /* synthetic */ Object g(nja njaVar, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return l(njaVar, f, f2, f3);
            default:
                return super.g(njaVar, f, f2, f3);
        }
    }

    public PointF l(nja njaVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = njaVar.b;
        if (obj2 == null || (obj = njaVar.c) == null) {
            a70.r("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        wj9 wj9Var = this.e;
        if (wj9Var != null && (pointF = (PointF) wj9Var.C(njaVar.g, njaVar.h.floatValue(), pointF3, pointF4, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float b = me4.b(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(b, me4.b(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}
