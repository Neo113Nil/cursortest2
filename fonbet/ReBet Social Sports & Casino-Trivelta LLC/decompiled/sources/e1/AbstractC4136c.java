package e1;

import java.util.concurrent.Executor;

/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4136c {

    /* renamed from: a, reason: collision with root package name */
    public static Executor f45517a;

    public static synchronized Executor a() {
        Executor executor;
        synchronized (AbstractC4136c.class) {
            try {
                if (f45517a == null) {
                    f45517a = Z.b1("ExoPlayer:BackgroundExecutor");
                }
                executor = f45517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executor;
    }
}
