package w3;

import android.os.Looper;
import j3.C7272n;
import u3.P;
import w3.g;
import w3.i;

/* loaded from: classes.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f103481a = new a();

    final class a implements j {
        @Override // w3.j
        public final g a(i.a aVar, C7272n c7272n) {
            if (c7272n.f69131s == null) {
                return null;
            }
            return new n(new g.a(6001, new w()));
        }

        @Override // w3.j
        public final int b(C7272n c7272n) {
            return c7272n.f69131s != null ? 1 : 0;
        }

        @Override // w3.j
        public final void c(Looper looper, P p11) {
        }
    }

    public interface b {

        /* renamed from: m0, reason: collision with root package name */
        public static final G.g f103482m0 = new G.g();

        void release();
    }

    g a(i.a aVar, C7272n c7272n);

    int b(C7272n c7272n);

    void c(Looper looper, P p11);

    default b d(i.a aVar, C7272n c7272n) {
        return b.f103482m0;
    }

    default void prepare() {
    }

    default void release() {
    }
}
