package B3;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class k extends g {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f649i;

    public k(List list) {
        super(list);
        this.f649i = new PointF();
    }

    @Override // B3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(G3.a aVar, float f10) {
        return j(aVar, f10, f10, f10);
    }

    @Override // B3.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF j(G3.a aVar, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.f3855b;
        if (obj2 == null || (obj = aVar.f3856c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        G3.c cVar = this.f620e;
        if (cVar != null && (pointF = (PointF) cVar.b(aVar.f3860g, aVar.f3861h.floatValue(), pointF2, pointF3, f10, e(), f())) != null) {
            return pointF;
        }
        PointF pointF4 = this.f649i;
        float f13 = pointF2.x;
        float f14 = f13 + (f11 * (pointF3.x - f13));
        float f15 = pointF2.y;
        pointF4.set(f14, f15 + (f12 * (pointF3.y - f15)));
        return this.f649i;
    }
}
