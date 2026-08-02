package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class zda extends CancellationException implements ct3 {
    public final transient kea a;

    public zda(String str, Throwable th, kea keaVar) {
        super(str);
        this.a = keaVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.ct3
    public final Throwable d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zda)) {
            return false;
        }
        zda zdaVar = (zda) obj;
        if (!Intrinsics.c(zdaVar.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = zdaVar.a;
        if (obj2 == null) {
            obj2 = eed.b;
        }
        Object obj3 = this.a;
        if (obj3 == null) {
            obj3 = eed.b;
        }
        return Intrinsics.c(obj2, obj3) && Intrinsics.c(zdaVar.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = message.hashCode() * 31;
        Object obj = this.a;
        if (obj == null) {
            obj = eed.b;
        }
        int hashCode2 = (obj.hashCode() + hashCode) * 31;
        Throwable cause = getCause();
        return hashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.a;
        if (obj == null) {
            obj = eed.b;
        }
        sb.append(obj);
        return sb.toString();
    }
}
