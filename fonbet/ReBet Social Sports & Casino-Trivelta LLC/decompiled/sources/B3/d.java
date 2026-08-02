package B3;

import java.util.List;

/* loaded from: classes.dex */
public class d extends g {
    public d(List list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
    }

    public float s(G3.a aVar, float f10) {
        float f11;
        if (aVar.f3855b == null || aVar.f3856c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        G3.c cVar = this.f620e;
        if (cVar != null) {
            f11 = f10;
            Float f12 = (Float) cVar.b(aVar.f3860g, aVar.f3861h.floatValue(), (Float) aVar.f3855b, (Float) aVar.f3856c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return com.airbnb.lottie.utils.l.i(aVar.g(), aVar.d(), f11);
    }

    @Override // B3.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(G3.a aVar, float f10) {
        return Float.valueOf(s(aVar, f10));
    }
}
