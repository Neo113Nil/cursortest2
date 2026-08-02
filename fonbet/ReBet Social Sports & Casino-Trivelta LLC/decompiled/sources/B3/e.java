package B3;

import java.util.List;

/* loaded from: classes.dex */
public class e extends g {

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.d f640i;

    public e(List list) {
        super(list);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.airbnb.lottie.model.content.d dVar = (com.airbnb.lottie.model.content.d) ((G3.a) list.get(i11)).f3855b;
            if (dVar != null) {
                i10 = Math.max(i10, dVar.f());
            }
        }
        this.f640i = new com.airbnb.lottie.model.content.d(new float[i10], new int[i10]);
    }

    @Override // B3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public com.airbnb.lottie.model.content.d i(G3.a aVar, float f10) {
        this.f640i.g((com.airbnb.lottie.model.content.d) aVar.f3855b, (com.airbnb.lottie.model.content.d) aVar.f3856c, f10);
        return this.f640i;
    }
}
