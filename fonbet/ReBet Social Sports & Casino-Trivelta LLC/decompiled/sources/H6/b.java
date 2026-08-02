package H6;

import D6.k;
import H6.a;

/* loaded from: classes2.dex */
public class b extends a {
    public b(i iVar, a.c cVar, Throwable th2) {
        super(iVar, cVar, th2);
    }

    public void finalize() {
        try {
            synchronized (this) {
                if (this.f4825a) {
                    super.finalize();
                    return;
                }
                Object f10 = this.f4826b.f();
                E6.a.M("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f4826b)), f10 == null ? null : f10.getClass().getName());
                a.c cVar = this.f4827c;
                if (cVar != null) {
                    cVar.a(this.f4826b, this.f4828d);
                }
                close();
                super.finalize();
            }
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    @Override // H6.a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a clone() {
        k.i(isValid());
        return new b(this.f4826b, this.f4827c, this.f4828d != null ? new Throwable() : null);
    }

    public b(Object obj, h hVar, a.c cVar, Throwable th2) {
        super(obj, hVar, cVar, th2, true);
    }
}
