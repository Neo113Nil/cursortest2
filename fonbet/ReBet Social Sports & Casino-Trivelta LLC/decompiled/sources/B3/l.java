package B3;

import java.util.List;

/* loaded from: classes.dex */
public class l extends g {

    /* renamed from: i, reason: collision with root package name */
    public final G3.d f650i;

    public l(List list) {
        super(list);
        this.f650i = new G3.d();
    }

    @Override // B3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public G3.d i(G3.a aVar, float f10) {
        Object obj;
        float f11;
        Object obj2 = aVar.f3855b;
        if (obj2 == null || (obj = aVar.f3856c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        G3.d dVar = (G3.d) obj2;
        G3.d dVar2 = (G3.d) obj;
        G3.c cVar = this.f620e;
        if (cVar != null) {
            f11 = f10;
            G3.d dVar3 = (G3.d) cVar.b(aVar.f3860g, aVar.f3861h.floatValue(), dVar, dVar2, f11, e(), f());
            if (dVar3 != null) {
                return dVar3;
            }
        } else {
            f11 = f10;
        }
        this.f650i.d(com.airbnb.lottie.utils.l.i(dVar.b(), dVar2.b(), f11), com.airbnb.lottie.utils.l.i(dVar.c(), dVar2.c(), f11));
        return this.f650i;
    }
}
