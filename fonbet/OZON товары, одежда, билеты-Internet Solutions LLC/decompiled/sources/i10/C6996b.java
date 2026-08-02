package i10;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

/* renamed from: i10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6996b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicInteger f65691a = new AtomicInteger(0);

    public final void a(int i11) {
        this.f65691a.set(i11);
    }

    public final int b() {
        return this.f65691a.incrementAndGet();
    }

    public final void c() {
        this.f65691a.set(0);
    }
}
