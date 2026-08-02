package i5;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import h5.o;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: i5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7009b implements InterfaceC7008a {

    /* renamed from: a, reason: collision with root package name */
    private final o f65857a;

    /* renamed from: b, reason: collision with root package name */
    final Handler f65858b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private final Executor f65859c = new a();

    /* renamed from: i5.b$a */
    final class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            C7009b.this.f65858b.post(runnable);
        }
    }

    public C7009b(@NonNull ExecutorService executorService) {
        this.f65857a = new o(executorService);
    }

    @NonNull
    public final Executor b() {
        return this.f65859c;
    }

    @NonNull
    public final o c() {
        return this.f65857a;
    }
}
