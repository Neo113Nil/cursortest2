package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a8 {
    public a8() {
        j2 requestInitiatedBy = j2.f25586c;
        Intrinsics.checkNotNullParameter(requestInitiatedBy, "requestInitiatedBy");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        j2 j2Var = j2.f25585b;
        return true;
    }

    public final int hashCode() {
        return j2.f25586c.hashCode();
    }

    public final String toString() {
        return "FeatureFlagRefreshRequestedEvent(requestInitiatedBy=" + j2.f25586c + ")";
    }
}
