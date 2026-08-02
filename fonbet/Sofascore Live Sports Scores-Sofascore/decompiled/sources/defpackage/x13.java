package defpackage;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x13 extends oja {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x13(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // defpackage.o41
    public final Object f(nja njaVar, float f) {
        int i;
        int i2;
        Integer num;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(njaVar, f));
            case 1:
                Object obj2 = njaVar.b;
                if (obj2 == null) {
                    a70.r("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = njaVar.c;
                if (obj3 == null) {
                    i = njaVar.k;
                    if (i == 784923401) {
                        i = ((Integer) obj2).intValue();
                        njaVar.k = i;
                    }
                } else {
                    int i3 = njaVar.l;
                    if (i3 == 784923401) {
                        i = ((Integer) obj3).intValue();
                        njaVar.l = i;
                    } else {
                        i = i3;
                    }
                }
                int i4 = i;
                wj9 wj9Var = this.e;
                if (wj9Var == null || (num = (Integer) wj9Var.C(njaVar.g, njaVar.h.floatValue(), (Integer) obj2, Integer.valueOf(i4), f, d(), this.d)) == null) {
                    int i5 = njaVar.k;
                    if (i5 == 784923401) {
                        i5 = ((Integer) obj2).intValue();
                        njaVar.k = i5;
                    }
                    PointF pointF = pkc.a;
                    i2 = (int) ((f * (i4 - i5)) + i5);
                } else {
                    i2 = num.intValue();
                }
                return Integer.valueOf(i2);
            default:
                Object obj4 = njaVar.b;
                wj9 wj9Var2 = this.e;
                if (wj9Var2 == null) {
                    return (f != 1.0f || (obj = njaVar.c) == null) ? (q65) obj4 : (q65) obj;
                }
                float f2 = njaVar.g;
                Float f3 = njaVar.h;
                float floatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                q65 q65Var = (q65) obj4;
                Object obj5 = njaVar.c;
                return (q65) wj9Var2.C(f2, floatValue, q65Var, obj5 == null ? q65Var : (q65) obj5, f, c(), this.d);
        }
    }

    public int l(nja njaVar, float f) {
        float f2;
        Float f3;
        Object obj = njaVar.b;
        Object obj2 = njaVar.b;
        if (obj == null || njaVar.c == null) {
            a70.r("Missing values for keyframe.");
            return 0;
        }
        wj9 wj9Var = this.e;
        if (wj9Var == null || (f3 = njaVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) wj9Var.C(njaVar.g, f3.floatValue(), (Integer) obj2, (Integer) njaVar.c, f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return dy0.s(pkc.b(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), ((Integer) obj2).intValue(), ((Integer) njaVar.c).intValue());
    }
}
