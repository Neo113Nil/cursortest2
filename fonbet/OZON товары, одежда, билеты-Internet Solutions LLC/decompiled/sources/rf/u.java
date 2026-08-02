package rf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f83472a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f83473b;

    public u(@NotNull f algorithm, @NotNull k subjectPublicKey) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(subjectPublicKey, "subjectPublicKey");
        this.f83472a = algorithm;
        this.f83473b = subjectPublicKey;
    }

    @NotNull
    public final f a() {
        return this.f83472a;
    }

    @NotNull
    public final k b() {
        return this.f83473b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f83472a, uVar.f83472a) && Intrinsics.d(this.f83473b, uVar.f83473b);
    }

    public final int hashCode() {
        f fVar = this.f83472a;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        k kVar = this.f83473b;
        return hashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SubjectPublicKeyInfo(algorithm=" + this.f83472a + ", subjectPublicKey=" + this.f83473b + ")";
    }
}
