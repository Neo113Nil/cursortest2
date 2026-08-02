package com.usercentrics.sdk.core.hash;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UUID.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/usercentrics/sdk/core/hash/UUID;", "", "()V", "random", "", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UUID {
    public static final UUID INSTANCE = new UUID();

    private UUID() {
    }

    public final String random() {
        String uuid = java.util.UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return uuid;
    }
}
