package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3645h4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f40649a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f40650b;

    public C3645h4(int i10, @Nullable String str) {
        this.f40649a = i10;
        this.f40650b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3645h4)) {
            return false;
        }
        C3645h4 c3645h4 = (C3645h4) obj;
        return this.f40649a == c3645h4.f40649a && Intrinsics.areEqual(this.f40650b, c3645h4.f40650b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f40649a) * 31;
        String str = this.f40650b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "NetworkRequestResult(status=" + this.f40649a + ", message=" + this.f40650b + ')';
    }
}
