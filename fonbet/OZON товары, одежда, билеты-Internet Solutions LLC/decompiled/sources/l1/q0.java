package l1;

import k1.C7455a;
import k1.C7456b;
import k1.C7460f;
import k1.C7462h;
import k1.C7465k;
import l1.AbstractC7839p0;
import n1.C8415h;
import n1.InterfaceC8412e;

/* loaded from: classes.dex */
public final class q0 {
    public static void a(InterfaceC8412e interfaceC8412e, AbstractC7839p0 abstractC7839p0, long j11) {
        C8415h c8415h = C8415h.f76287a;
        if (abstractC7839p0 instanceof AbstractC7839p0.b) {
            C7460f b11 = ((AbstractC7839p0.b) abstractC7839p0).b();
            interfaceC8412e.C0(j11, P9.a.a(b11.n(), b11.q()), C7465k.a(b11.u(), b11.m()), 1.0f, c8415h, null, 3);
            return;
        }
        if (!(abstractC7839p0 instanceof AbstractC7839p0.c)) {
            if (!(abstractC7839p0 instanceof AbstractC7839p0.a)) {
                throw new Sc.o();
            }
            interfaceC8412e.T0(((AbstractC7839p0.a) abstractC7839p0).b(), j11, c8415h, 3);
            return;
        }
        AbstractC7839p0.c cVar = (AbstractC7839p0.c) abstractC7839p0;
        C7786D c11 = cVar.c();
        if (c11 != null) {
            interfaceC8412e.T0(c11, j11, c8415h, 3);
            return;
        }
        C7462h b12 = cVar.b();
        float d11 = C7455a.d(b12.b());
        interfaceC8412e.H0(j11, P9.a.a(b12.e(), b12.g()), C7465k.a(b12.j(), b12.d()), C7456b.a(d11, d11), c8415h);
    }
}
