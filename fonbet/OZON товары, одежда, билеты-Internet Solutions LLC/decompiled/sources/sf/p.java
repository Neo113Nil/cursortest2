package sf;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class p implements K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final K f98746a;

    public p(@NotNull K delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f98746a = delegate;
    }

    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f98746a.close();
    }

    @Override // sf.K, java.io.Flushable
    public void flush() throws IOException {
        this.f98746a.flush();
    }

    @Override // sf.K
    @NotNull
    public final N timeout() {
        return this.f98746a.timeout();
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f98746a + ')';
    }

    @Override // sf.K
    public void z0(@NotNull C9681g source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f98746a.z0(source, j11);
    }
}
