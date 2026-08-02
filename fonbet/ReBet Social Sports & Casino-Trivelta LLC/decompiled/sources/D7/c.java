package D7;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;

/* loaded from: classes2.dex */
public class c extends a {
    public c(d0 d0Var, l0 l0Var, J7.d dVar) {
        super(d0Var, l0Var, dVar);
    }

    public static M6.c G(d0 d0Var, l0 l0Var, J7.d dVar) {
        if (N7.b.d()) {
            N7.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        c cVar = new c(d0Var, l0Var, dVar);
        if (N7.b.d()) {
            N7.b.b();
        }
        return cVar;
    }

    @Override // M6.a
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void a(H6.a aVar) {
        H6.a.U(aVar);
    }

    @Override // M6.a, M6.c
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public H6.a getResult() {
        return H6.a.B((H6.a) super.getResult());
    }

    @Override // D7.a
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void E(H6.a aVar, int i10, e0 e0Var) {
        super.E(H6.a.B(aVar), i10, e0Var);
    }
}
