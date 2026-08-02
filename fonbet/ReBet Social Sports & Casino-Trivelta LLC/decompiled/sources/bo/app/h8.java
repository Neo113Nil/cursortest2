package bo.app;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public final JSONArray f25516a;

    public h8(JSONArray featureFlagsData) {
        Intrinsics.checkNotNullParameter(featureFlagsData, "featureFlagsData");
        this.f25516a = featureFlagsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8) && Intrinsics.areEqual(this.f25516a, ((h8) obj).f25516a);
    }

    public final int hashCode() {
        return this.f25516a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.f25516a + ")";
    }
}
