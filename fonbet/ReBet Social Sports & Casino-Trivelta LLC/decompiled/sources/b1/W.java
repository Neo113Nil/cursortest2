package b1;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.google.common.collect.AbstractC3445z;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface W {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3445z f24524a = AbstractC3445z.u(new a());

    public class a implements InterfaceC2362p {
    }

    public interface b {
        W a(Context context, InterfaceC2360n interfaceC2360n, C2357k c2357k, boolean z10, Executor executor, c cVar);
    }

    void a(long j10);

    boolean b(Bitmap bitmap, e1.S s10);

    void c(C2345N c2345n);

    Surface d();

    void e();

    void f();

    void flush();

    boolean g(int i10, long j10);

    void h(InterfaceC2336E interfaceC2336E);

    void i(int i10, androidx.media3.common.a aVar, List list, long j10);

    boolean j();

    int k();

    void release();

    public interface c {
        void a(V v10);

        void c();

        default void e(float f10) {
        }

        default void b(long j10, boolean z10) {
        }

        default void d(int i10, int i11) {
        }

        default void f(int i10, androidx.media3.common.a aVar, List list) {
        }
    }
}
