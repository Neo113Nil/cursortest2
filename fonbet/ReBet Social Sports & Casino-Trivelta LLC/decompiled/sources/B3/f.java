package B3;

import java.util.List;

/* loaded from: classes.dex */
public class f extends g {
    public f(List list) {
        super(list);
    }

    public int r(G3.a aVar, float f10) {
        float f11;
        if (aVar.f3855b == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int h10 = aVar.f3856c == null ? aVar.h() : aVar.e();
        G3.c cVar = this.f620e;
        if (cVar != null) {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f3860g, aVar.f3861h.floatValue(), (Integer) aVar.f3855b, Integer.valueOf(h10), f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        } else {
            f11 = f10;
        }
        return com.airbnb.lottie.utils.l.j(aVar.h(), h10, f11);
    }

    @Override // B3.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Integer i(G3.a aVar, float f10) {
        return Integer.valueOf(r(aVar, f10));
    }
}
