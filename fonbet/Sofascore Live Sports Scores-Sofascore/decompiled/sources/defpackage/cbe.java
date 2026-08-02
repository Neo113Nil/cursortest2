package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cbe extends oja {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public bbe m;

    public cbe(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.o41
    public final Object f(nja njaVar, float f) {
        float f2;
        bbe bbeVar = (bbe) njaVar;
        Path path = bbeVar.q;
        wj9 wj9Var = this.e;
        if (wj9Var == null || njaVar.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) wj9Var.C(bbeVar.g, bbeVar.h.floatValue(), (PointF) bbeVar.b, (PointF) bbeVar.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) njaVar.b;
        }
        bbe bbeVar2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (bbeVar2 != bbeVar) {
            pathMeasure.setPath(path, false);
            this.m = bbeVar;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
