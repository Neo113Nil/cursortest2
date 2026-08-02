package H6;

import H6.a;

/* loaded from: classes2.dex */
public class c extends a {
    public c(Object obj, h hVar, a.c cVar, Throwable th2) {
        super(obj, hVar, cVar, th2, true);
    }

    public void finalize() {
        try {
            synchronized (this) {
                if (this.f4825a) {
                    return;
                }
                Object f10 = this.f4826b.f();
                E6.a.M("FinalizerCloseableReference", "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f4826b)), f10 == null ? null : f10.getClass().getName());
                this.f4826b.d();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // H6.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // H6.a
    /* renamed from: k */
    public a clone() {
        return this;
    }
}
