package F1;

import android.view.Surface;
import b1.Y;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface P {

    public interface b {
        void a(long j10);

        void b();
    }

    public static final class c extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f3301a;

        public c(Throwable th2, androidx.media3.common.a aVar) {
            super(th2);
            this.f3301a = aVar;
        }
    }

    boolean b();

    Surface d();

    void e();

    void g();

    void h(long j10, long j11);

    boolean isInitialized();

    void j(a aVar, Executor executor);

    void k(int i10, androidx.media3.common.a aVar, long j10, int i11, List list);

    void l(long j10);

    void m(List list);

    boolean n(boolean z10);

    boolean o(androidx.media3.common.a aVar);

    void p();

    void q();

    void r();

    void release();

    boolean s(long j10, b bVar);

    void t(y yVar);

    void u(int i10);

    void v(float f10);

    void w();

    void x(Surface surface, e1.L l10);

    void y(boolean z10);

    void z(boolean z10);

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3300a = new C0075a();

        /* renamed from: F1.P$a$a, reason: collision with other inner class name */
        public class C0075a implements a {
        }

        default void f() {
        }

        default void i() {
        }

        default void onFrameDropped() {
        }

        default void a(c cVar) {
        }

        default void c(Y y10) {
        }
    }
}
