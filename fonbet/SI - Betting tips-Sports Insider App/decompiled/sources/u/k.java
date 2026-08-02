package u;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements g8.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f24003a;

    /* renamed from: b, reason: collision with root package name */
    public final j f24004b = new j(this);

    public k(h hVar) {
        this.f24003a = new WeakReference(hVar);
    }

    @Override // g8.b
    public final void a(Runnable runnable, Executor executor) {
        this.f24004b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        h hVar = (h) this.f24003a.get();
        boolean cancel = this.f24004b.cancel(z5);
        if (cancel && hVar != null) {
            hVar.f23998a = null;
            hVar.f23999b = null;
            hVar.f24000c.k(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24004b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24004b.f23995a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24004b.isDone();
    }

    public final String toString() {
        return this.f24004b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f24004b.get(j, timeUnit);
    }
}
