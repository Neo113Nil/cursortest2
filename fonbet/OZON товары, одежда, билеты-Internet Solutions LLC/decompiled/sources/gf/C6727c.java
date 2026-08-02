package gf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import sf.C9684j;

/* renamed from: gf.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6727c {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C9684j f64296d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final C9684j f64297e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final C9684j f64298f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C9684j f64299g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final C9684j f64300h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final C9684j f64301i;

    /* renamed from: a, reason: collision with root package name */
    public final int f64302a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final C9684j f64303b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final C9684j f64304c;

    static {
        C9684j c9684j = C9684j.f98719d;
        f64296d = C9684j.a.c(ProductContainerDTO.RATIO_DELIMITER);
        f64297e = C9684j.a.c(":status");
        f64298f = C9684j.a.c(":method");
        f64299g = C9684j.a.c(":path");
        f64300h = C9684j.a.c(":scheme");
        f64301i = C9684j.a.c(":authority");
    }

    public C6727c(@NotNull C9684j name, @NotNull C9684j value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f64303b = name;
        this.f64304c = value;
        this.f64302a = value.g() + name.g() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6727c)) {
            return false;
        }
        C6727c c6727c = (C6727c) obj;
        return Intrinsics.d(this.f64303b, c6727c.f64303b) && Intrinsics.d(this.f64304c, c6727c.f64304c);
    }

    public final int hashCode() {
        C9684j c9684j = this.f64303b;
        int hashCode = (c9684j != null ? c9684j.hashCode() : 0) * 31;
        C9684j c9684j2 = this.f64304c;
        return hashCode + (c9684j2 != null ? c9684j2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return this.f64303b.H() + ": " + this.f64304c.H();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6727c(@NotNull String name, @NotNull String value) {
        this(C9684j.a.c(name), C9684j.a.c(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C9684j c9684j = C9684j.f98719d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6727c(@NotNull C9684j name, @NotNull String value) {
        this(name, C9684j.a.c(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        C9684j c9684j = C9684j.f98719d;
    }
}
