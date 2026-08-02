package s5;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f64788a;

    /* renamed from: b, reason: collision with root package name */
    public final Thread f64789b;

    public b(Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        Handler handler = new Handler(looper);
        this.f64788a = handler;
        Thread thread = handler.getLooper().getThread();
        Intrinsics.checkNotNullExpressionValue(thread, "getThread(...)");
        this.f64789b = thread;
    }

    public final Thread a() {
        return this.f64789b;
    }

    public final void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            this.f64788a.post(runnable);
        }
    }

    public /* synthetic */ b(Looper looper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Looper.getMainLooper() : looper);
    }
}
