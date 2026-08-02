package B3;

import java.util.List;

/* loaded from: classes.dex */
public class b extends g {
    public b(List list) {
        super(list);
    }

    public int r() {
        return s(b(), d());
    }

    public int s(G3.a aVar, float f10) {
        float f11;
        Float f12;
        if (aVar.f3855b == null || aVar.f3856c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        G3.c cVar = this.f620e;
        if (cVar == null || (f12 = aVar.f3861h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) cVar.b(aVar.f3860g, f12.floatValue(), (Integer) aVar.f3855b, (Integer) aVar.f3856c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return com.airbnb.lottie.utils.e.c(com.airbnb.lottie.utils.l.b(f11, 0.0f, 1.0f), ((Integer) aVar.f3855b).intValue(), ((Integer) aVar.f3856c).intValue());
    }

    @Override // B3.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(G3.a aVar, float f10) {
        return Integer.valueOf(s(aVar, f10));
    }
}
