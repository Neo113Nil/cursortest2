package lg;

import eg.w;
import eg.x0;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d extends x0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f20063c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final w f20064d;

    static {
        l lVar = l.f20077c;
        int i5 = jg.w.f18529a;
        if (64 >= i5) {
            i5 = 64;
        }
        f20064d = lVar.h0(jg.h.j(i5, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        f20064d.c0(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // eg.w
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        f20064d.d0(coroutineContext, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c0(kotlin.coroutines.g.f19227a, runnable);
    }

    @Override // eg.w
    public final w h0(int i5) {
        return l.f20077c.h0(i5);
    }

    @Override // eg.w
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // eg.x0
    public final Executor i0() {
        return this;
    }
}
