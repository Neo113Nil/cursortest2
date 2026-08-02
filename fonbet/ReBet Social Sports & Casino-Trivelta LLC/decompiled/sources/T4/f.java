package T4;

import G5.CoralogixStackTrace;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f10953a;

    /* renamed from: b, reason: collision with root package name */
    public final Thread f10954b;

    /* renamed from: c, reason: collision with root package name */
    public final CoralogixStackTrace f10955c;

    public f(String message, Thread thread) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(thread, "thread");
        this.f10953a = message;
        this.f10954b = thread;
        G5.f fVar = G5.f.f3897a;
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        this.f10955c = fVar.a(stackTrace);
    }

    public final String a() {
        return this.f10953a;
    }

    public final CoralogixStackTrace b() {
        return this.f10955c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f10953a, fVar.f10953a) && Intrinsics.areEqual(this.f10954b, fVar.f10954b);
    }

    public int hashCode() {
        return (this.f10953a.hashCode() * 31) + this.f10954b.hashCode();
    }

    public String toString() {
        return "ApplicationNotResponding(message=" + this.f10953a + ", thread=" + this.f10954b + ")";
    }
}
