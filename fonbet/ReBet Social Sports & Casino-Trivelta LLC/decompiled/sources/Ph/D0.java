package Ph;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class D0 extends CancellationException implements F {

    /* renamed from: a, reason: collision with root package name */
    public final transient C0 f9003a;

    public D0(String str, Throwable th2, C0 c02) {
        super(str);
        this.f9003a = c02;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // Ph.F
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public D0 a() {
        return null;
    }

    public final C0 c() {
        C0 c02 = this.f9003a;
        return c02 == null ? O0.f9045a : c02;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return Intrinsics.areEqual(d02.getMessage(), getMessage()) && Intrinsics.areEqual(d02.c(), c()) && Intrinsics.areEqual(d02.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = message.hashCode() * 31;
        C0 c10 = c();
        int hashCode2 = (hashCode + (c10 != null ? c10.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + c();
    }
}
