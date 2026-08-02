package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f90360a;

    /* renamed from: b, reason: collision with root package name */
    private final int f90361b;

    /* renamed from: c, reason: collision with root package name */
    private final int f90362c;

    public static final class a {
        public static u0 a() {
            return new u0(ru.ozon.android.messenger.utils.n.a(), 1, 1);
        }
    }

    public u0(@NotNull String guid, int i11, int i12) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        this.f90360a = guid;
        this.f90361b = i11;
        this.f90362c = i12;
    }

    @NotNull
    public final String a() {
        return this.f90360a;
    }

    public final int b() {
        return this.f90361b;
    }

    public final int c() {
        return this.f90362c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f90360a, u0Var.f90360a) && this.f90361b == u0Var.f90361b && this.f90362c == u0Var.f90362c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90362c) + C2454a.a(this.f90361b, this.f90360a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComposedMessageUI(guid=");
        sb2.append(this.f90360a);
        sb2.append(", num=");
        sb2.append(this.f90361b);
        sb2.append(", total=");
        return K00.b.e(this.f90362c, ")", sb2);
    }
}
