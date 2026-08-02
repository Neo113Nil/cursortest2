package sf;

import I0.C3173b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class N {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f98683d = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f98684a;

    /* renamed from: b, reason: collision with root package name */
    private long f98685b;

    /* renamed from: c, reason: collision with root package name */
    private long f98686c;

    public static final class a extends N {
        @Override // sf.N
        @NotNull
        public final N d(long j11) {
            return this;
        }

        @Override // sf.N
        public final void f() {
        }

        @Override // sf.N
        @NotNull
        public final N g(long j11, @NotNull TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    @NotNull
    public N a() {
        this.f98684a = false;
        return this;
    }

    @NotNull
    public N b() {
        this.f98686c = 0L;
        return this;
    }

    public long c() {
        if (this.f98684a) {
            return this.f98685b;
        }
        throw new IllegalStateException("No deadline");
    }

    @NotNull
    public N d(long j11) {
        this.f98684a = true;
        this.f98685b = j11;
        return this;
    }

    public boolean e() {
        return this.f98684a;
    }

    public void f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f98684a && this.f98685b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public N g(long j11, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "timeout < 0: ").toString());
        }
        this.f98686c = unit.toNanos(j11);
        return this;
    }

    public long h() {
        return this.f98686c;
    }
}
