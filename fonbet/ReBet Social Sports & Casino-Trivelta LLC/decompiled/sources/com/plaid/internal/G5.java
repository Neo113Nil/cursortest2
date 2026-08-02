package com.plaid.internal;

import com.google.gson.Gson;
import javax.net.SocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class G5 {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final Gson f39261a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final SocketFactory f39262b;

    public G5() {
        this(null, 3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G5)) {
            return false;
        }
        G5 g52 = (G5) obj;
        return Intrinsics.areEqual(this.f39261a, g52.f39261a) && Intrinsics.areEqual(this.f39262b, g52.f39262b);
    }

    public final int hashCode() {
        Gson gson = this.f39261a;
        int hashCode = (gson == null ? 0 : gson.hashCode()) * 31;
        SocketFactory socketFactory = this.f39262b;
        return hashCode + (socketFactory != null ? socketFactory.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlaidRetrofitOptions(gson=" + this.f39261a + ", socketFactory=" + this.f39262b + ")";
    }

    public G5(Gson gson, int i10) {
        this.f39261a = (i10 & 1) != 0 ? null : gson;
        this.f39262b = null;
    }
}
