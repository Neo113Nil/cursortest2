package eg;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient e1 f9172a;

    public f1(String str, Throwable th2, m1 m1Var) {
        super(str);
        this.f9172a = m1Var;
        if (th2 != null) {
            initCause(th2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        if (!Intrinsics.areEqual(f1Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = f1Var.f9172a;
        if (obj2 == null) {
            obj2 = p1.f9211b;
        }
        Object obj3 = this.f9172a;
        if (obj3 == null) {
            obj3 = p1.f9211b;
        }
        return Intrinsics.areEqual(obj2, obj3) && Intrinsics.areEqual(f1Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        Intrinsics.checkNotNull(message);
        int hashCode = message.hashCode() * 31;
        Object obj = this.f9172a;
        if (obj == null) {
            obj = p1.f9211b;
        }
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("; job=");
        Object obj = this.f9172a;
        if (obj == null) {
            obj = p1.f9211b;
        }
        sb2.append(obj);
        return sb2.toString();
    }
}
