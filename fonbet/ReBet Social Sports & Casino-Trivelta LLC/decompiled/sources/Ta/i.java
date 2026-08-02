package Ta;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public abstract class i extends k {

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Future f11380a;

        /* renamed from: b, reason: collision with root package name */
        public final h f11381b;

        public a(Future future, h hVar) {
            this.f11380a = future;
            this.f11381b = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable a10;
            Object obj = this.f11380a;
            if ((obj instanceof Ua.a) && (a10 = Ua.b.a((Ua.a) obj)) != null) {
                this.f11381b.onFailure(a10);
                return;
            }
            try {
                this.f11381b.onSuccess(i.b(this.f11380a));
            } catch (ExecutionException e10) {
                this.f11381b.onFailure(e10.getCause());
            } catch (Throwable th2) {
                this.f11381b.onFailure(th2);
            }
        }

        public String toString() {
            return Ra.h.b(this).c(this.f11381b).toString();
        }
    }

    public static void a(o oVar, h hVar, Executor executor) {
        Ra.n.k(hVar);
        oVar.l(new a(oVar, hVar), executor);
    }

    public static Object b(Future future) {
        Ra.n.r(future.isDone(), "Future was expected to be done: %s", future);
        return x.a(future);
    }

    public static o c(Throwable th2) {
        Ra.n.k(th2);
        return new l(th2);
    }
}
