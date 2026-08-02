package U4;

import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final b5.d f12059a;

    /* renamed from: b, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f12060b;

    public d(b5.d monitorListener) {
        Intrinsics.checkNotNullParameter(monitorListener, "monitorListener");
        this.f12059a = monitorListener;
    }

    public final void a() {
        E5.b.f3006a.a("uncaught exception handler started");
        this.f12060b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public final void b() {
        E5.b.f3006a.a("uncaught exception handler stopped");
        Thread.setDefaultUncaughtExceptionHandler(this.f12060b);
        this.f12060b = null;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable throwable) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        E5.b.f3006a.b("uncaught exception caught by handler: " + throwable.getMessage());
        this.f12059a.a(new a(throwable, true));
        Thread.sleep(2500L);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f12060b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, throwable);
        }
    }
}
