package lg;

import eg.w;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l extends w {

    /* renamed from: c, reason: collision with root package name */
    public static final l f20077c = new l();

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        e.f20065d.f20067c.k(runnable, true, false);
    }

    @Override // eg.w
    public final void d0(CoroutineContext coroutineContext, Runnable runnable) {
        e.f20065d.f20067c.k(runnable, true, true);
    }

    @Override // eg.w
    public final w h0(int i5) {
        jg.h.a(i5);
        return i5 >= k.f20074d ? this : super.h0(i5);
    }

    @Override // eg.w
    public final String toString() {
        return "Dispatchers.IO";
    }
}
