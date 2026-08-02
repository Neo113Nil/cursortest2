package xe;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C0 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final transient H0 f105376a;

    public C0(@NotNull String str, Throwable th2, @NotNull H0 h02) {
        super(str);
        this.f105376a = h02;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return Intrinsics.d(c02.getMessage(), getMessage()) && Intrinsics.d(c02.f105376a, this.f105376a) && Intrinsics.d(c02.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    @NotNull
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.f(message);
        int hashCode = (this.f105376a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public final String toString() {
        return super.toString() + "; job=" + this.f105376a;
    }
}
