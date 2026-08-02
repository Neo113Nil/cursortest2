package bo.app;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f25400a;

    public e(List acknowledgedDismissals) {
        Intrinsics.checkNotNullParameter(acknowledgedDismissals, "acknowledgedDismissals");
        this.f25400a = acknowledgedDismissals;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f25400a, ((e) obj).f25400a);
    }

    public final int hashCode() {
        return this.f25400a.hashCode();
    }

    public final String toString() {
        return "AcknowledgedDismissalsReceivedEvent(acknowledgedDismissals=" + this.f25400a + ")";
    }
}
