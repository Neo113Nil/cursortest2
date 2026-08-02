package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.u7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3764u7 extends AbstractC3648h7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f41123a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f41124b;

    public C3764u7(@NotNull String verificationId, @NotNull String redirectUri) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.f41123a = verificationId;
        this.f41124b = redirectUri;
    }

    @NotNull
    public final String a() {
        return this.f41124b;
    }

    @NotNull
    public final String b() {
        return this.f41123a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3764u7)) {
            return false;
        }
        C3764u7 c3764u7 = (C3764u7) obj;
        return Intrinsics.areEqual(this.f41123a, c3764u7.f41123a) && Intrinsics.areEqual(this.f41124b, c3764u7.f41124b);
    }

    public final int hashCode() {
        return this.f41124b.hashCode() + (this.f41123a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "TwilioSnaSessionInfo(verificationId=" + this.f41123a + ", redirectUri=" + this.f41124b + ")";
    }
}
