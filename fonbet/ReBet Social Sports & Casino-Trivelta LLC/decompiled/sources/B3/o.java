package B3;

import java.util.List;

/* loaded from: classes.dex */
public class o extends g {

    public class a extends G3.c {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ G3.b f662d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ G3.c f663e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ E3.b f664f;

        public a(G3.b bVar, G3.c cVar, E3.b bVar2) {
            this.f662d = bVar;
            this.f663e = cVar;
            this.f664f = bVar2;
        }

        @Override // G3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public E3.b a(G3.b bVar) {
            this.f662d.h(bVar.f(), bVar.a(), ((E3.b) bVar.g()).f2963a, ((E3.b) bVar.b()).f2963a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f663e.a(this.f662d);
            E3.b bVar2 = (E3.b) (bVar.c() == 1.0f ? bVar.b() : bVar.g());
            this.f664f.a(str, bVar2.f2964b, bVar2.f2965c, bVar2.f2966d, bVar2.f2967e, bVar2.f2968f, bVar2.f2969g, bVar2.f2970h, bVar2.f2971i, bVar2.f2972j, bVar2.f2973k, bVar2.f2974l, bVar2.f2975m);
            return this.f664f;
        }
    }

    public o(List list) {
        super(list);
    }

    @Override // B3.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public E3.b i(G3.a aVar, float f10) {
        Object obj;
        G3.c cVar = this.f620e;
        if (cVar == null) {
            return (f10 != 1.0f || (obj = aVar.f3856c) == null) ? (E3.b) aVar.f3855b : (E3.b) obj;
        }
        float f11 = aVar.f3860g;
        Float f12 = aVar.f3861h;
        float floatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        Object obj2 = aVar.f3855b;
        E3.b bVar = (E3.b) obj2;
        Object obj3 = aVar.f3856c;
        return (E3.b) cVar.b(f11, floatValue, bVar, obj3 == null ? (E3.b) obj2 : (E3.b) obj3, f10, d(), f());
    }

    public void s(G3.c cVar) {
        super.o(new a(new G3.b(), cVar, new E3.b()));
    }
}
