package q1;

import android.os.Looper;
import n1.G1;
import q1.InterfaceC6104m;
import q1.t;
import q1.u;

/* loaded from: classes.dex */
public interface u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f63350a = new a();

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f63351a = new b() { // from class: q1.v
            @Override // q1.u.b
            public final void release() {
                u.b.a();
            }
        };

        static /* synthetic */ void a() {
        }

        void release();
    }

    void a(Looper looper, G1 g12);

    int b(androidx.media3.common.a aVar);

    InterfaceC6104m c(t.a aVar, androidx.media3.common.a aVar2);

    default b d(t.a aVar, androidx.media3.common.a aVar2) {
        return b.f63351a;
    }

    default void g() {
    }

    default void release() {
    }

    public class a implements u {
        @Override // q1.u
        public int b(androidx.media3.common.a aVar) {
            return aVar.f20547s != null ? 1 : 0;
        }

        @Override // q1.u
        public InterfaceC6104m c(t.a aVar, androidx.media3.common.a aVar2) {
            if (aVar2.f20547s == null) {
                return null;
            }
            return new z(new InterfaceC6104m.a(new O(1), 6001));
        }

        @Override // q1.u
        public void a(Looper looper, G1 g12) {
        }
    }
}
