package yh;

import java.util.concurrent.TimeUnit;
import zh.C7007o;

/* loaded from: classes3.dex */
public final class h implements InterfaceC6893b {

    /* renamed from: a, reason: collision with root package name */
    public static final h f68427a = new h();

    public static InterfaceC6893b a() {
        return f68427a;
    }

    public long b(boolean z10) {
        return z10 ? C7007o.b().a() : TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    @Override // yh.InterfaceC6893b
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // yh.InterfaceC6893b
    public long now() {
        return b(true);
    }

    public String toString() {
        return "SystemClock{}";
    }
}
