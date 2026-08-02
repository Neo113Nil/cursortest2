package sf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9680f implements K {
    @Override // sf.K, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // sf.K, java.io.Flushable
    public final void flush() {
    }

    @Override // sf.K
    @NotNull
    public final N timeout() {
        return N.f98683d;
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j11);
    }
}
