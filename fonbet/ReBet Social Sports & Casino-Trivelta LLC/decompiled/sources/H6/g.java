package H6;

import D6.k;
import H6.a;

/* loaded from: classes2.dex */
public class g extends a {
    public g(i iVar, a.c cVar, Throwable th2) {
        super(iVar, cVar, th2);
    }

    @Override // H6.a
    /* renamed from: k */
    public a clone() {
        k.i(isValid());
        return new g(this.f4826b, this.f4827c, this.f4828d);
    }

    public g(Object obj, h hVar, a.c cVar, Throwable th2) {
        super(obj, hVar, cVar, th2, false);
    }
}
