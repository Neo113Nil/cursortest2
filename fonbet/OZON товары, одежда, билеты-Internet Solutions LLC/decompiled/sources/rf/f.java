package rf;

import T7.E;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f83391a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f83392b;

    public f(@NotNull String algorithm, Object obj) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        this.f83391a = algorithm;
        this.f83392b = obj;
    }

    @NotNull
    public final String a() {
        return this.f83391a;
    }

    public final Object b() {
        return this.f83392b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f83391a, fVar.f83391a) && Intrinsics.d(this.f83392b, fVar.f83392b);
    }

    public final int hashCode() {
        String str = this.f83391a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Object obj = this.f83392b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AlgorithmIdentifier(algorithm=");
        sb2.append(this.f83391a);
        sb2.append(", parameters=");
        return E.c(this.f83392b, ")", sb2);
    }
}
