package u0;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class g {

    public static class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f65917a;

        public a(Handler handler) {
            this.f65917a = (Handler) x0.f.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f65917a.post((Runnable) x0.f.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f65917a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
