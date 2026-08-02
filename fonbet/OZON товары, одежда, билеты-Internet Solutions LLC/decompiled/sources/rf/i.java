package rf;

import Fm.C3051a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f83400a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f83401b;

    public i(boolean z11, Long l11) {
        this.f83400a = z11;
        this.f83401b = l11;
    }

    public final boolean a() {
        return this.f83400a;
    }

    public final Long b() {
        return this.f83401b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f83400a == iVar.f83400a && Intrinsics.d(this.f83401b, iVar.f83401b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z11 = this.f83400a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Long l11 = this.f83401b;
        return i11 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BasicConstraints(ca=");
        sb2.append(this.f83400a);
        sb2.append(", maxIntermediateCas=");
        return C3051a.d(sb2, this.f83401b, ")");
    }
}
