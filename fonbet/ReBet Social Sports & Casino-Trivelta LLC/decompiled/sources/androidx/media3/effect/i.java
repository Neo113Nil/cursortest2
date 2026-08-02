package androidx.media3.effect;

import b1.C2368w;
import b1.InterfaceC2367v;
import b1.V;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface i {

    public interface a {
        void a(V v10);
    }

    void c(InterfaceC2367v interfaceC2367v, C2368w c2368w, long j10);

    void f(Executor executor, a aVar);

    void flush();

    void g();

    void l(c cVar);

    void m(C2368w c2368w);

    void n(b bVar);

    void release();

    public interface b {
        default void a() {
        }

        default void e() {
        }

        default void b(C2368w c2368w) {
        }
    }

    public interface c {
        default void c() {
        }

        default void d(C2368w c2368w, long j10) {
        }
    }
}
