package k2;

import j2.C7241a;
import j2.f;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class b extends j2.d {

    /* renamed from: n0, reason: collision with root package name */
    private float f70295n0;

    public b(j2.f fVar) {
        super(fVar, f.d.ALIGN_VERTICALLY);
        this.f70295n0 = 0.5f;
    }

    @Override // j2.d, j2.C7241a, j2.e
    public final void apply() {
        Iterator<Object> it = this.f68890m0.iterator();
        while (it.hasNext()) {
            C7241a c11 = this.f68888k0.c(it.next());
            c11.l();
            Object obj = this.f68819R;
            if (obj != null) {
                c11.F(obj);
            } else {
                Object obj2 = this.f68820S;
                if (obj2 != null) {
                    c11.E(obj2);
                } else {
                    c11.F(0);
                }
            }
            Object obj3 = this.f68822U;
            if (obj3 != null) {
                c11.h(obj3);
            } else {
                Object obj4 = this.f68823V;
                if (obj4 != null) {
                    c11.g(obj4);
                } else {
                    c11.g(0);
                }
            }
            float f7 = this.f70295n0;
            if (f7 != 0.5f) {
                c11.G(f7);
            }
        }
    }
}
