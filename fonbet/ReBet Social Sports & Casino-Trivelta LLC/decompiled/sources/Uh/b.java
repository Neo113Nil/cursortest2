package Uh;

import Ph.AbstractC1477t0;
import Ph.L;
import Sh.H;
import Sh.J;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.ranges.RangesKt;

/* loaded from: classes5.dex */
public final class b extends AbstractC1477t0 implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final b f12278c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final L f12279d;

    static {
        int e10;
        k kVar = k.f12296b;
        e10 = J.e("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(64, H.a()), 0, 0, 12, null);
        f12279d = L.d2(kVar, e10, null, 2, null);
    }

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        f12279d.Y1(coroutineContext, runnable);
    }

    @Override // Ph.L
    public void Z1(CoroutineContext coroutineContext, Runnable runnable) {
        f12279d.Z1(coroutineContext, runnable);
    }

    @Override // Ph.L
    public L c2(int i10, String str) {
        return k.f12296b.c2(i10, str);
    }

    @Override // Ph.AbstractC1477t0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Y1(EmptyCoroutineContext.INSTANCE, runnable);
    }

    @Override // Ph.L
    public String toString() {
        return "Dispatchers.IO";
    }

    @Override // Ph.AbstractC1477t0
    public Executor e2() {
        return this;
    }
}
