package e6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8748a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f8749b;

    public /* synthetic */ r(int i5, Handler handler) {
        this.f8748a = i5;
        this.f8749b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f8748a) {
            case 0:
                this.f8749b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f8749b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                runnable.getClass();
                Handler handler2 = this.f8749b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                this.f8749b.post(runnable);
                return;
        }
    }

    public r() {
        this.f8748a = 3;
        this.f8749b = new Handler(Looper.getMainLooper());
    }

    public r(Handler handler) {
        this.f8748a = 2;
        handler.getClass();
        this.f8749b = handler;
    }
}
