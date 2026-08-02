package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470s3 implements Q7 {

    /* renamed from: a, reason: collision with root package name */
    public final C0445r3 f14613a;

    /* renamed from: b, reason: collision with root package name */
    public final List f14614b;

    public C0470s3(@NotNull C0445r3 c0445r3, @NotNull List<C0445r3> list) {
        this.f14613a = c0445r3;
        this.f14614b = list;
    }

    @NotNull
    public final C0470s3 a(@NotNull C0445r3 c0445r3, @NotNull List<C0445r3> list) {
        return new C0470s3(c0445r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    public final Object b() {
        return this.f14613a;
    }

    @NotNull
    public final C0445r3 c() {
        return this.f14613a;
    }

    @NotNull
    public final List<C0445r3> d() {
        return this.f14614b;
    }

    @NotNull
    public final C0445r3 e() {
        return this.f14613a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0470s3)) {
            return false;
        }
        C0470s3 c0470s3 = (C0470s3) obj;
        return Intrinsics.areEqual(this.f14613a, c0470s3.f14613a) && Intrinsics.areEqual(this.f14614b, c0470s3.f14614b);
    }

    public final int hashCode() {
        return this.f14614b.hashCode() + (this.f14613a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClidsInfo(chosen=");
        sb2.append(this.f14613a);
        sb2.append(", candidates=");
        return androidx.appcompat.widget.c1.p(sb2, this.f14614b, ')');
    }

    public static C0470s3 a(C0470s3 c0470s3, C0445r3 c0445r3, List list, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            c0445r3 = c0470s3.f14613a;
        }
        if ((i5 & 2) != 0) {
            list = c0470s3.f14614b;
        }
        c0470s3.getClass();
        return new C0470s3(c0445r3, list);
    }

    @Override // io.appmetrica.analytics.impl.Q7
    @NotNull
    public final List<C0445r3> a() {
        return this.f14614b;
    }
}
