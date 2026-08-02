package I0;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: I0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1337b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f5083a;

    public C1337b(int i10) {
        this.f5083a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f5083a.decrementAndGet();
    }

    public final int b() {
        return this.f5083a.get();
    }

    public final int c() {
        return this.f5083a.getAndIncrement();
    }

    public final int d() {
        return this.f5083a.incrementAndGet();
    }
}
