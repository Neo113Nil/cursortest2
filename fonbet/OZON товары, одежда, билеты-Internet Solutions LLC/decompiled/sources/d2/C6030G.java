package d2;

import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* renamed from: d2.G, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6030G {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f60987a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f60988b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC6042T f60989c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f60990d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f60991e;

    public C6030G(@NotNull EnumC6042T enumC6042T, boolean z11) {
        this.f60987a = true;
        this.f60988b = true;
        this.f60989c = enumC6042T;
        this.f60990d = z11;
        this.f60991e = true;
    }

    public final boolean a() {
        return this.f60991e;
    }

    public final boolean b() {
        return this.f60987a;
    }

    public final boolean c() {
        return this.f60988b;
    }

    @NotNull
    public final EnumC6042T d() {
        return this.f60989c;
    }

    public final boolean e() {
        return this.f60990d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6030G)) {
            return false;
        }
        C6030G c6030g = (C6030G) obj;
        return this.f60987a == c6030g.f60987a && this.f60988b == c6030g.f60988b && this.f60989c == c6030g.f60989c && this.f60990d == c6030g.f60990d && this.f60991e == c6030g.f60991e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60991e) + C3532b.a((this.f60989c.hashCode() + C3532b.a(Boolean.hashCode(this.f60987a) * 31, 31, this.f60988b)) * 31, 31, this.f60990d);
    }

    public C6030G() {
        this(EnumC6042T.Inherit, true);
    }

    public C6030G(boolean z11) {
        this(EnumC6042T.Inherit, z11);
    }
}
