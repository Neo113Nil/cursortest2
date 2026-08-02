package n2;

import java.util.Iterator;
import n2.f;

/* loaded from: classes8.dex */
class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f76328m;

    g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f76320e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f76320e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // n2.f
    public final void d(int i11) {
        if (this.f76325j) {
            return;
        }
        this.f76325j = true;
        this.f76322g = i11;
        Iterator it = this.f76326k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
