package nb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public enum B implements Executor {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    public static final Handler f57171b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f57171b.post(runnable);
    }
}
