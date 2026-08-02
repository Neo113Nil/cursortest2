package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3754t6 extends AbstractC3648h7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f41097a;

    public C3754t6(@NotNull String verificationId) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        this.f41097a = verificationId;
    }

    @NotNull
    public final String a() {
        return this.f41097a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3754t6) && Intrinsics.areEqual(this.f41097a, ((C3754t6) obj).f41097a);
    }

    public final int hashCode() {
        return this.f41097a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ProveSnaSessionInfo(verificationId=" + this.f41097a + ")";
    }
}
