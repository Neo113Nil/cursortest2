package d3;

import com.twilio.voice.Constants;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3997b {

    /* renamed from: d, reason: collision with root package name */
    public static final C3997b f44922d = new C3997b();

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f44923a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f44924b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f44925c;

    /* renamed from: d3.b$b, reason: collision with other inner class name */
    public static class ExecutorC0651b implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public ThreadLocal f44926a;

        public ExecutorC0651b() {
            this.f44926a = new ThreadLocal();
        }

        public final int a() {
            Integer num = (Integer) this.f44926a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f44926a.remove();
                return intValue;
            }
            this.f44926a.set(Integer.valueOf(intValue));
            return intValue;
        }

        public final int b() {
            Integer num = (Integer) this.f44926a.get();
            if (num == null) {
                num = 0;
            }
            int intValue = num.intValue() + 1;
            this.f44926a.set(Integer.valueOf(intValue));
            return intValue;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            try {
                if (b() <= 15) {
                    runnable.run();
                } else {
                    C3997b.a().execute(runnable);
                }
                a();
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    public C3997b() {
        this.f44923a = !c() ? Executors.newCachedThreadPool() : C3996a.b();
        this.f44924b = Executors.newSingleThreadScheduledExecutor();
        this.f44925c = new ExecutorC0651b();
    }

    public static ExecutorService a() {
        return f44922d.f44923a;
    }

    public static Executor b() {
        return f44922d.f44925c;
    }

    public static boolean c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains(Constants.PLATFORM_ANDROID);
    }
}
