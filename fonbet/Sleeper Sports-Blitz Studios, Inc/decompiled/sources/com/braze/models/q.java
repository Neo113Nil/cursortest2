package com.braze.models;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class q implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f648a;
    public final String b;

    public q(UUID sessionIdUuid) {
        Intrinsics.checkNotNullParameter(sessionIdUuid, "sessionIdUuid");
        this.f648a = sessionIdUuid;
        String uuid = sessionIdUuid.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f648a, ((q) obj).f648a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.b;
    }

    public final int hashCode() {
        return this.f648a.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
