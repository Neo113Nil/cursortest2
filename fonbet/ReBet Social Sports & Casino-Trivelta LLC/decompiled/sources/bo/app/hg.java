package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hg {

    /* renamed from: a, reason: collision with root package name */
    public final fa f25538a;

    public hg(fa triggerEvent) {
        Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
        this.f25538a = triggerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hg) && Intrinsics.areEqual(this.f25538a, ((hg) obj).f25538a);
    }

    public final int hashCode() {
        return this.f25538a.hashCode();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f25538a + ")";
    }
}
