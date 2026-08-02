package com.braze.models.outgoing;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class b implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final String f639a;

    public b(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f639a = apiKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.areEqual(this.f639a, ((b) obj).f639a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f639a;
    }

    public final int hashCode() {
        return this.f639a.hashCode();
    }

    public final String toString() {
        return this.f639a;
    }
}
