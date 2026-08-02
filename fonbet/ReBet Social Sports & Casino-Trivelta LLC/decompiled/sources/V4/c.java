package V4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f12507a;

    public c(b eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f12507a = eventType;
    }

    public final b a() {
        return this.f12507a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f12507a == ((c) obj).f12507a;
    }

    public int hashCode() {
        return this.f12507a.hashCode();
    }

    public String toString() {
        return "InternalLogDetails(eventType=" + this.f12507a + ")";
    }
}
