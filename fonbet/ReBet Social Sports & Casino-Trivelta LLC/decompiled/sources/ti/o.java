package ti;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class o extends H {

    /* renamed from: a, reason: collision with root package name */
    public H f65874a;

    public o(H delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f65874a = delegate;
    }

    public final H a() {
        return this.f65874a;
    }

    public final o b(H delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f65874a = delegate;
        return this;
    }

    @Override // ti.H
    public H clearDeadline() {
        return this.f65874a.clearDeadline();
    }

    @Override // ti.H
    public H clearTimeout() {
        return this.f65874a.clearTimeout();
    }

    @Override // ti.H
    public long deadlineNanoTime() {
        return this.f65874a.deadlineNanoTime();
    }

    @Override // ti.H
    public boolean hasDeadline() {
        return this.f65874a.hasDeadline();
    }

    @Override // ti.H
    public void throwIfReached() {
        this.f65874a.throwIfReached();
    }

    @Override // ti.H
    public H timeout(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f65874a.timeout(j10, unit);
    }

    @Override // ti.H
    public long timeoutNanos() {
        return this.f65874a.timeoutNanos();
    }

    @Override // ti.H
    public H deadlineNanoTime(long j10) {
        return this.f65874a.deadlineNanoTime(j10);
    }
}
