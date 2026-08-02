package B3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class j extends g {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f646i;

    /* renamed from: j, reason: collision with root package name */
    public final PathMeasure f647j;

    /* renamed from: k, reason: collision with root package name */
    public i f648k;
    private final float[] pos;
    private final float[] tangent;

    public j(List list) {
        super(list);
        this.f646i = new PointF();
        this.pos = new float[2];
        this.tangent = new float[2];
        this.f647j = new PathMeasure();
    }

    @Override // B3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(G3.a aVar, float f10) {
        float f11;
        i iVar = (i) aVar;
        Path k10 = iVar.k();
        G3.c cVar = this.f620e;
        if (cVar == null || aVar.f3861h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.b(iVar.f3860g, iVar.f3861h.floatValue(), (PointF) iVar.f3855b, (PointF) iVar.f3856c, e(), f11, f());
            if (pointF != null) {
                return pointF;
            }
        }
        if (k10 == null) {
            return (PointF) aVar.f3855b;
        }
        if (this.f648k != iVar) {
            this.f647j.setPath(k10, false);
            this.f648k = iVar;
        }
        float length = this.f647j.getLength();
        float f12 = f11 * length;
        this.f647j.getPosTan(f12, this.pos, this.tangent);
        PointF pointF2 = this.f646i;
        float[] fArr = this.pos;
        pointF2.set(fArr[0], fArr[1]);
        if (f12 < 0.0f) {
            PointF pointF3 = this.f646i;
            float[] fArr2 = this.tangent;
            pointF3.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            PointF pointF4 = this.f646i;
            float[] fArr3 = this.tangent;
            float f13 = f12 - length;
            pointF4.offset(fArr3[0] * f13, fArr3[1] * f13);
        }
        return this.f646i;
    }
}
