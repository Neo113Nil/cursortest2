package ti;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class m implements E {

    @NotNull
    private final E delegate;

    public m(E delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final E m1757deprecated_delegate() {
        return this.delegate;
    }

    @Override // ti.E, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    @NotNull
    public final E delegate() {
        return this.delegate;
    }

    @Override // ti.E, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // ti.E
    @NotNull
    public H timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // ti.E
    public void write(@NotNull C6478h source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.delegate.write(source, j10);
    }
}
