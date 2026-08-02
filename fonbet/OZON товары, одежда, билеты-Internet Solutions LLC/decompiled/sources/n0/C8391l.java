package n0;

import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.K0;
import org.jetbrains.annotations.NotNull;

/* renamed from: n0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8391l {

    /* renamed from: a, reason: collision with root package name */
    private final float f76205a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC7799Q f76206b;

    public C8391l(AbstractC7799Q abstractC7799Q, float f7) {
        this.f76205a = f7;
        this.f76206b = abstractC7799Q;
    }

    public static C8391l a(C8391l c8391l, K0 k02) {
        return new C8391l(k02, c8391l.f76205a);
    }

    @NotNull
    public final AbstractC7799Q b() {
        return this.f76206b;
    }

    public final float c() {
        return this.f76205a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8391l)) {
            return false;
        }
        C8391l c8391l = (C8391l) obj;
        return Z1.h.b(this.f76205a, c8391l.f76205a) && Intrinsics.d(this.f76206b, c8391l.f76206b);
    }

    public final int hashCode() {
        return this.f76206b.hashCode() + (Float.hashCode(this.f76205a) * 31);
    }

    @NotNull
    public final String toString() {
        return "BorderStroke(width=" + ((Object) Z1.h.c(this.f76205a)) + ", brush=" + this.f76206b + ')';
    }
}
