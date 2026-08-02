package lg;

import eg.x0;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class h extends x0 {

    /* renamed from: c, reason: collision with root package name */
    public c f20067c;

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        c.n(this.f20067c, runnable, 6);
    }

    @Override // eg.w
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        c.n(this.f20067c, runnable, 2);
    }

    @Override // eg.x0
    public final Executor i0() {
        return this.f20067c;
    }
}
