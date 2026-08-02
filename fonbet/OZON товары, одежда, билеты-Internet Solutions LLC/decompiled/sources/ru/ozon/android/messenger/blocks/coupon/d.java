package ru.ozon.android.messenger.blocks.coupon;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f84916a;

    /* renamed from: b, reason: collision with root package name */
    private final int f84917b;

    /* renamed from: c, reason: collision with root package name */
    private final int f84918c;

    public d(@NotNull String url, int i11, int i12) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f84916a = url;
        this.f84917b = i11;
        this.f84918c = i12;
    }

    @NotNull
    public final String a() {
        return this.f84916a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f84916a, dVar.f84916a) && this.f84917b == dVar.f84917b && this.f84918c == dVar.f84918c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84918c) + C2454a.a(this.f84917b, this.f84916a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVO(url=");
        sb2.append(this.f84916a);
        sb2.append(", width=");
        sb2.append(this.f84917b);
        sb2.append(", height=");
        return K00.b.e(this.f84918c, ")", sb2);
    }
}
