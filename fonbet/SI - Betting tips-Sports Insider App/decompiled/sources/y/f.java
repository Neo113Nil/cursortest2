package y;

import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: m, reason: collision with root package name */
    public int f25500m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f25493e = 2;
        } else {
            this.f25493e = 3;
        }
    }

    @Override // y.e
    public final void d(int i5) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f25495g = i5;
        Iterator it = this.f25498k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
