package g9;

import java.util.concurrent.Executor;
import k9.AbstractC5213a;

/* loaded from: classes2.dex */
public class m implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f47206a;

    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f47207a;

        public a(Runnable runnable) {
            this.f47207a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f47207a.run();
            } catch (Exception e10) {
                AbstractC5213a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    public m(Executor executor) {
        this.f47206a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f47206a.execute(new a(runnable));
    }
}
