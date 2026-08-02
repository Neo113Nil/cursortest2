package com.plaid.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class A1 extends X {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f39145b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f39146c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39147d;

    public A1(@NotNull String message, @NotNull Map<String, String> data, int i10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f39145b = message;
        this.f39146c = data;
        this.f39147d = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1)) {
            return false;
        }
        A1 a12 = (A1) obj;
        return Intrinsics.areEqual(this.f39145b, a12.f39145b) && Intrinsics.areEqual(this.f39146c, a12.f39146c) && this.f39147d == a12.f39147d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f39147d) + ((this.f39146c.hashCode() + (this.f39145b.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "InformationBreadCrumb(message=" + this.f39145b + ", data=" + this.f39146c + ", logLevel=" + this.f39147d + ")";
    }
}
