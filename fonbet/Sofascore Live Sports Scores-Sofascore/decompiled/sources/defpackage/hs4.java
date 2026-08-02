package defpackage;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hs4 extends se6 {
    public static final hs4 d;
    public ju3 c;

    static {
        int i = dui.c;
        int i2 = dui.d;
        long j = dui.e;
        String str = dui.a;
        hs4 hs4Var = new hs4();
        hs4Var.c = new ju3(i, i2, str, j);
        d = hs4Var;
    }

    @Override // defpackage.au3
    public final void a0(CoroutineContext coroutineContext, Runnable runnable) {
        ju3.j(this.c, runnable, 2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.au3
    public final au3 f0(int i) {
        oea.j(i);
        return i >= dui.c ? this : super.f0(i);
    }

    @Override // defpackage.se6
    public final Executor g0() {
        return this.c;
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        ju3.j(this.c, runnable, 6);
    }

    @Override // defpackage.au3
    public final String toString() {
        return "Dispatchers.Default";
    }
}
