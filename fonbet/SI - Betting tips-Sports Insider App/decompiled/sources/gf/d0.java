package gf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c0 f10017b = new c0(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f10018a;

    public /* synthetic */ d0(long j) {
        this.f10018a = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.f10018a ^ Long.MIN_VALUE, ((d0) obj).f10018a ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            return this.f10018a == ((d0) obj).f10018a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f10018a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return io.sentry.config.a.D(10, this.f10018a);
    }
}
