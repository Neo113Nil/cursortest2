package bo.app;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fe {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f25463a;

    public fe(ArrayList logs) {
        Intrinsics.checkNotNullParameter(logs, "logs");
        this.f25463a = logs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe) && Intrinsics.areEqual(this.f25463a, ((fe) obj).f25463a);
    }

    public final int hashCode() {
        return this.f25463a.hashCode();
    }

    public final String toString() {
        return "SdkDebuggerSendLogEvent(logs=" + this.f25463a + ")";
    }
}
