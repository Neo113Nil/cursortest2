package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nz8 implements ThreadFactory {
    public final String a;
    public final boolean b;
    public final AtomicInteger c = new AtomicInteger();

    public nz8(qc qcVar, String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        vk0 vk0Var = new vk0(new vlo(this, runnable, false, 13));
        vk0Var.setName("glide-" + this.a + "-thread-" + this.c.getAndIncrement());
        return vk0Var;
    }
}
