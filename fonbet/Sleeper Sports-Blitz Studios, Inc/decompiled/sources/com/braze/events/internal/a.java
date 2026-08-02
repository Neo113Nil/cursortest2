package com.braze.events.internal;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f510a;

    public a(JSONObject bannersData) {
        Intrinsics.checkNotNullParameter(bannersData, "bannersData");
        this.f510a = bannersData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.areEqual(this.f510a, ((a) obj).f510a);
    }

    public final int hashCode() {
        return this.f510a.hashCode();
    }

    public final String toString() {
        return "BannersReceivedEvent(bannersData=" + this.f510a + ")";
    }
}
