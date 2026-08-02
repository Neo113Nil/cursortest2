package gf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final g0 f10022b = new g0(null);

    /* renamed from: a, reason: collision with root package name */
    public final short f10023a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.f10023a & 65535, ((h0) obj).f10023a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return this.f10023a == ((h0) obj).f10023a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10023a;
    }

    public final String toString() {
        return String.valueOf(this.f10023a & 65535);
    }
}
