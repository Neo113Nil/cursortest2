package de;

import je.N;
import je.Y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9839e;

/* renamed from: de.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6186e implements InterfaceC6188g, InterfaceC6190i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9839e f61609a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC9839e f61610b;

    public C6186e(@NotNull InterfaceC9839e classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        this.f61609a = classDescriptor;
        this.f61610b = classDescriptor;
    }

    public final boolean equals(Object obj) {
        C6186e c6186e = obj instanceof C6186e ? (C6186e) obj : null;
        return Intrinsics.d(this.f61609a, c6186e != null ? c6186e.f61609a : null);
    }

    @Override // de.InterfaceC6188g
    public final N getType() {
        Y q11 = this.f61609a.q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        return q11;
    }

    public final int hashCode() {
        return this.f61609a.hashCode();
    }

    @Override // de.InterfaceC6190i
    @NotNull
    public final InterfaceC9839e i() {
        return this.f61609a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Class{");
        Y q11 = this.f61609a.q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        sb2.append(q11);
        sb2.append('}');
        return sb2.toString();
    }
}
