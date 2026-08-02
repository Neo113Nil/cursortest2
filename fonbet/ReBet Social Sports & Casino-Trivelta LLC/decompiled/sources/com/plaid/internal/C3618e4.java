package com.plaid.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3618e4 extends X {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f40578b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f40579c;

    /* renamed from: d, reason: collision with root package name */
    public final int f40580d;

    public C3618e4(@NotNull Map data, @NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f40578b = message;
        this.f40579c = data;
        this.f40580d = 4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3618e4)) {
            return false;
        }
        C3618e4 c3618e4 = (C3618e4) obj;
        return Intrinsics.areEqual(this.f40578b, c3618e4.f40578b) && Intrinsics.areEqual(this.f40579c, c3618e4.f40579c);
    }

    public final int hashCode() {
        return this.f40579c.hashCode() + (this.f40578b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "NavigationBreadCrumb(message=" + this.f40578b + ", data=" + this.f40579c + ")";
    }
}
