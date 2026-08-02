package b1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface X {

    public interface a {
        X a(Context context, C2357k c2357k, InterfaceC2360n interfaceC2360n, b bVar, Executor executor, long j10, boolean z10);
    }

    void a(long j10);

    boolean b(int i10);

    void c(C2345N c2345n);

    void d(int i10, int i11, androidx.media3.common.a aVar, List list, long j10);

    void e();

    void f(List list);

    void flush();

    Surface g(int i10);

    boolean h();

    int i(int i10);

    void initialize();

    void j(U u10);

    void k(int i10);

    void l(int i10);

    boolean m(int i10, Bitmap bitmap, e1.S s10);

    void release();

    public interface b {
        void a(V v10);

        void b(long j10, boolean z10);

        void c(long j10);

        void d(int i10, int i11);

        default void e(float f10) {
        }
    }
}
