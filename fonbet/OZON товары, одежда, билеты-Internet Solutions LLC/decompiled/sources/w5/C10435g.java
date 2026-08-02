package w5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;

/* renamed from: w5.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10435g {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final C10435g f103580c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC10429a f103581a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC10429a f103582b;

    static {
        AbstractC10429a.b bVar = AbstractC10429a.b.f103576a;
        f103580c = new C10435g(bVar, bVar);
    }

    public C10435g(@NotNull AbstractC10429a abstractC10429a, @NotNull AbstractC10429a abstractC10429a2) {
        this.f103581a = abstractC10429a;
        this.f103582b = abstractC10429a2;
    }

    @NotNull
    public final AbstractC10429a a() {
        return this.f103581a;
    }

    @NotNull
    public final AbstractC10429a b() {
        return this.f103582b;
    }

    @NotNull
    public final AbstractC10429a c() {
        return this.f103582b;
    }

    @NotNull
    public final AbstractC10429a d() {
        return this.f103581a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10435g)) {
            return false;
        }
        C10435g c10435g = (C10435g) obj;
        return Intrinsics.d(this.f103581a, c10435g.f103581a) && Intrinsics.d(this.f103582b, c10435g.f103582b);
    }

    public final int hashCode() {
        return this.f103582b.hashCode() + (this.f103581a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "Size(width=" + this.f103581a + ", height=" + this.f103582b + ')';
    }
}
