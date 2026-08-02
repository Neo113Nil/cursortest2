package bo.app;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ug {

    /* renamed from: a, reason: collision with root package name */
    public final List f26130a;

    public ug(List triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        this.f26130a = triggeredActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug) && Intrinsics.areEqual(this.f26130a, ((ug) obj).f26130a);
    }

    public final int hashCode() {
        return this.f26130a.hashCode();
    }

    public final String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.f26130a + ")";
    }
}
