package m3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8060b {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorService f74306a;

    public static final Pattern a(Pattern pattern) {
        Pattern compile = Pattern.compile("^" + pattern.pattern() + "(/.*|$)");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
        return compile;
    }

    public static synchronized Executor b() {
        ExecutorService executorService;
        synchronized (C8060b.class) {
            try {
                if (f74306a == null) {
                    int i11 = N.f74289a;
                    f74306a = Executors.newSingleThreadExecutor(new L("ExoPlayer:BackgroundExecutor"));
                }
                executorService = f74306a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }
}
