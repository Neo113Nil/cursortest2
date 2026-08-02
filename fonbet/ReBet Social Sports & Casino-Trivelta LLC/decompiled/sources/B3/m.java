package B3;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public class m extends a {

    /* renamed from: i, reason: collision with root package name */
    public final com.airbnb.lottie.model.content.o f651i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f652j;

    /* renamed from: k, reason: collision with root package name */
    public Path f653k;

    /* renamed from: l, reason: collision with root package name */
    public Path f654l;

    /* renamed from: m, reason: collision with root package name */
    public List f655m;

    public m(List list) {
        super(list);
        this.f651i = new com.airbnb.lottie.model.content.o();
        this.f652j = new Path();
    }

    @Override // B3.a
    public boolean p() {
        List list = this.f655m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // B3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Path i(G3.a aVar, float f10) {
        com.airbnb.lottie.model.content.o oVar = (com.airbnb.lottie.model.content.o) aVar.f3855b;
        com.airbnb.lottie.model.content.o oVar2 = (com.airbnb.lottie.model.content.o) aVar.f3856c;
        this.f651i.c(oVar, oVar2 == null ? oVar : oVar2, f10);
        com.airbnb.lottie.model.content.o oVar3 = this.f651i;
        List list = this.f655m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVar3 = ((com.airbnb.lottie.animation.content.s) this.f655m.get(size)).c(oVar3);
            }
        }
        com.airbnb.lottie.utils.l.h(oVar3, this.f652j);
        if (this.f620e == null) {
            return this.f652j;
        }
        if (this.f653k == null) {
            this.f653k = new Path();
            this.f654l = new Path();
        }
        com.airbnb.lottie.utils.l.h(oVar, this.f653k);
        if (oVar2 != null) {
            com.airbnb.lottie.utils.l.h(oVar2, this.f654l);
        }
        G3.c cVar = this.f620e;
        float f11 = aVar.f3860g;
        float floatValue = aVar.f3861h.floatValue();
        Path path = this.f653k;
        return (Path) cVar.b(f11, floatValue, path, oVar2 == null ? path : this.f654l, f10, e(), f());
    }

    public void s(List list) {
        this.f655m = list;
    }
}
