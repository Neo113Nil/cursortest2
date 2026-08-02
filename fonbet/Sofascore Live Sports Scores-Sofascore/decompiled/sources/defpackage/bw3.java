package defpackage;

import com.ironsource.U3;
import java.lang.Thread;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class bw3 implements Thread.UncaughtExceptionHandler {
    public static final k03 c = new k03();
    public static bw3 d;
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ bw3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.a) {
            case 0:
                thread.getClass();
                th.getClass();
                Throwable th2 = null;
                Throwable th3 = th;
                while (true) {
                    if (th3 != null && th3 != th2) {
                        StackTraceElement[] stackTrace = th3.getStackTrace();
                        stackTrace.getClass();
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            stackTraceElement.getClass();
                            if (f6a.u(stackTraceElement)) {
                                ok3.o(th);
                                b6a.k(th, c6a.d).b();
                            }
                        }
                        Throwable th4 = th3;
                        th3 = th3.getCause();
                        th2 = th4;
                    }
                }
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) this.b;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    break;
                }
                break;
            default:
                Logger logger = qrb.c0;
                Level level = Level.SEVERE;
                StringBuilder sb = new StringBuilder(U3.j.d);
                qrb qrbVar = (qrb) this.b;
                sb.append(qrbVar.a);
                sb.append("] Uncaught exception in the SynchronizationContext. Panic!");
                logger.log(level, sb.toString(), th);
                if (!qrbVar.z) {
                    qrbVar.z = true;
                    v0g v0gVar = qrbVar.a0;
                    v0gVar.f = false;
                    ScheduledFuture scheduledFuture = v0gVar.g;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        v0gVar.g = null;
                    }
                    qrbVar.k(false);
                    frb frbVar = new frb(th);
                    qrbVar.y = frbVar;
                    qrbVar.E.g(frbVar);
                    qrbVar.P.h(null);
                    qrbVar.N.D(4, "PANIC! Entering TRANSIENT_FAILURE");
                    qrbVar.r.f(rk3.c);
                    break;
                }
                break;
        }
    }
}
