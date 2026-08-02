package l1;

import Sc.C;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final H0 f72222d = new H0();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f72223e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final long f72224a;

    /* renamed from: b, reason: collision with root package name */
    private final long f72225b;

    /* renamed from: c, reason: collision with root package name */
    private final float f72226c;

    public static final class a {
    }

    public H0(long j11, long j12, float f7) {
        this.f72224a = j11;
        this.f72225b = j12;
        this.f72226c = f7;
    }

    public final float b() {
        return this.f72226c;
    }

    public final long c() {
        return this.f72224a;
    }

    public final long d() {
        return this.f72225b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return C7807Z.p(this.f72224a, h02.f72224a) && C7459e.d(this.f72225b, h02.f72225b) && this.f72226c == h02.f72226c;
    }

    public final int hashCode() {
        int i11 = C7807Z.f72260n;
        C.Companion companion = Sc.C.INSTANCE;
        return Float.hashCode(this.f72226c) + Pk0.c.a(Long.hashCode(this.f72224a) * 31, 31, this.f72225b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        Bi.a.e(this.f72224a, ", offset=", sb2);
        sb2.append((Object) C7459e.m(this.f72225b));
        sb2.append(", blurRadius=");
        return F3.G.a(sb2, this.f72226c, ')');
    }

    public /* synthetic */ H0() {
        this(C7811b0.c(4278190080L), 0L, 0.0f);
    }
}
