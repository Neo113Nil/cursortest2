package gf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final v f10042b = new v(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte f10043a;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.compare(this.f10043a & 255, ((w) obj).f10043a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f10043a == ((w) obj).f10043a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10043a;
    }

    public final String toString() {
        return String.valueOf(this.f10043a & 255);
    }
}
