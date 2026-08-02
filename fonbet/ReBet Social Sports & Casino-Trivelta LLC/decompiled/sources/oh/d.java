package oh;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final List f61234a;

    public d() {
        this.f61234a = new ArrayList();
    }

    @Override // oh.h
    public h a(e eVar, Object obj) {
        if (eVar != null && !eVar.getKey().isEmpty() && obj != null) {
            this.f61234a.add(eVar);
            this.f61234a.add(obj);
        }
        return this;
    }

    @Override // oh.h
    public h b(g gVar) {
        if (gVar == null) {
            return this;
        }
        gVar.forEach(new BiConsumer() { // from class: oh.c
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                d.this.a((e) obj, obj2);
            }
        });
        return this;
    }

    @Override // oh.h
    public g build() {
        return (this.f61234a.size() != 2 || this.f61234a.get(0) == null) ? C5898b.l(this.f61234a.toArray()) : new C5898b(this.f61234a.toArray());
    }

    public d(List list) {
        this.f61234a = list;
    }
}
