package p6;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Executor f80264a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f80265b = new b();

    final class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            l.j(runnable);
        }
    }

    final class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return f80265b;
    }

    public static Executor b() {
        return f80264a;
    }
}
