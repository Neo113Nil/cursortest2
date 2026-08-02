package rf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private int f83393a;

    /* renamed from: b, reason: collision with root package name */
    private long f83394b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f83395c;

    /* renamed from: d, reason: collision with root package name */
    private long f83396d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C9684j f83397e;

    public g(int i11, long j11, boolean z11, long j12, @NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f83393a = i11;
        this.f83394b = j11;
        this.f83395c = z11;
        this.f83396d = j12;
        this.f83397e = bytes;
    }

    @NotNull
    public final C9684j a() {
        return this.f83397e;
    }

    public final boolean b() {
        return this.f83395c;
    }

    public final long c() {
        return this.f83394b;
    }

    public final int d() {
        return this.f83393a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f83393a == gVar.f83393a && this.f83394b == gVar.f83394b && this.f83395c == gVar.f83395c && this.f83396d == gVar.f83396d && Intrinsics.d(this.f83397e, gVar.f83397e);
    }

    public final int hashCode() {
        return this.f83397e.hashCode() + (((((((this.f83393a * 31) + ((int) this.f83394b)) * 31) + (!this.f83395c ? 1 : 0)) * 31) + ((int) this.f83396d)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AnyValue(tagClass=" + this.f83393a + ", tag=" + this.f83394b + ", constructed=" + this.f83395c + ", length=" + this.f83396d + ", bytes=" + this.f83397e + ")";
    }
}
