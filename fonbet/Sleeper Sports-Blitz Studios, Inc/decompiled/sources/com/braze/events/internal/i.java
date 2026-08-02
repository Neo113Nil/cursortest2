package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final JSONArray f526a;

    public i(JSONArray featureFlagsData) {
        Intrinsics.checkNotNullParameter(featureFlagsData, "featureFlagsData");
        this.f526a = featureFlagsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.areEqual(this.f526a, ((i) obj).f526a);
    }

    public final int hashCode() {
        return this.f526a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.f526a + ")";
    }
}
