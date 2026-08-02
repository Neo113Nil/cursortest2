package gf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final z f10010b = new z(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f10011a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.f10011a ^ Integer.MIN_VALUE, ((a0) obj).f10011a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a0) {
            return this.f10011a == ((a0) obj).f10011a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10011a;
    }

    public final String toString() {
        return String.valueOf(this.f10011a & 4294967295L);
    }
}
