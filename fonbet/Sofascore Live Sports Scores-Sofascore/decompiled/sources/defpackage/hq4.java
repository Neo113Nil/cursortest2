package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hq4 extends se6 implements Executor {
    public static final hq4 c = new hq4();
    public static final au3 d;

    static {
        ack ackVar = ack.c;
        int i = hri.a;
        if (64 >= i) {
            i = 64;
        }
        d = ackVar.f0(r4a.L(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // defpackage.au3
    public final void a0(CoroutineContext coroutineContext, Runnable runnable) {
        d.a0(coroutineContext, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(g.a, runnable);
    }

    @Override // defpackage.au3
    public final au3 f0(int i) {
        return ack.c.f0(i);
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        d.i(coroutineContext, runnable);
    }

    @Override // defpackage.au3
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.se6
    public final Executor g0() {
        return this;
    }
}
