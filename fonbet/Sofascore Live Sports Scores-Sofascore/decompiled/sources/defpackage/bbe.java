package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bbe extends nja {
    public Path q;
    public final nja r;

    public bbe(plb plbVar, nja njaVar) {
        super(plbVar, (PointF) njaVar.b, (PointF) njaVar.c, njaVar.d, njaVar.e, njaVar.f, njaVar.g, njaVar.h);
        this.r = njaVar;
        d();
    }

    public final void d() {
        boolean z;
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        if (obj2 != null && obj3 != null) {
            PointF pointF = (PointF) obj2;
            if (((PointF) obj3).equals(pointF.x, pointF.y)) {
                z = true;
                if (obj3 != null || (obj = this.c) == null || z) {
                    return;
                }
                PointF pointF2 = (PointF) obj3;
                PointF pointF3 = (PointF) obj;
                nja njaVar = this.r;
                PointF pointF4 = njaVar.o;
                PointF pointF5 = njaVar.p;
                Matrix matrix = vik.a;
                Path path = new Path();
                path.moveTo(pointF2.x, pointF2.y);
                if (pointF4 == null || pointF5 == null || (pointF4.length() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && pointF5.length() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                    path.lineTo(pointF3.x, pointF3.y);
                } else {
                    float f = pointF4.x + pointF2.x;
                    float f2 = pointF2.y + pointF4.y;
                    float f3 = pointF3.x;
                    float f4 = f3 + pointF5.x;
                    float f5 = pointF3.y;
                    path.cubicTo(f, f2, f4, f5 + pointF5.y, f3, f5);
                }
                this.q = path;
                return;
            }
        }
        z = false;
        if (obj3 != null) {
        }
    }
}
