package T7;

import g6.C4331C;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public Object f10991a;

    /* renamed from: b, reason: collision with root package name */
    public CountDownLatch f10992b;

    public I(final Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.f10992b = new CountDownLatch(1);
        C4331C.t().execute(new FutureTask(new Callable() { // from class: T7.H
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void b10;
                b10 = I.b(I.this, callable);
                return b10;
            }
        }));
    }

    public static final Void b(I this$0, Callable callable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            this$0.f10991a = callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.f10992b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
