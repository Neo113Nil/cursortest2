package defpackage;

import com.ironsource.U3;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class bag extends AtomicLong implements ThreadFactory {
    public final String a;
    public final int b;
    public final boolean c;

    public bag(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread vk0Var = this.c ? new vk0(3, str, runnable) : new Thread(runnable, str);
        vk0Var.setPriority(this.b);
        vk0Var.setDaemon(true);
        return vk0Var;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return mz1.o(new StringBuilder("RxThreadFactory["), this.a, U3.j.e);
    }

    public bag(String str) {
        this(str, 5, false);
    }
}
