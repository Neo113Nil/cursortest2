package rf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final v f83414a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f83415b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final k f83416c;

    public l(@NotNull v tbsCertificate, @NotNull f signatureAlgorithm, @NotNull k signatureValue) {
        Intrinsics.checkNotNullParameter(tbsCertificate, "tbsCertificate");
        Intrinsics.checkNotNullParameter(signatureAlgorithm, "signatureAlgorithm");
        Intrinsics.checkNotNullParameter(signatureValue, "signatureValue");
        this.f83414a = tbsCertificate;
        this.f83415b = signatureAlgorithm;
        this.f83416c = signatureValue;
    }

    @NotNull
    public final f a() {
        return this.f83415b;
    }

    @NotNull
    public final k b() {
        return this.f83416c;
    }

    @NotNull
    public final v c() {
        return this.f83414a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f83414a, lVar.f83414a) && Intrinsics.d(this.f83415b, lVar.f83415b) && Intrinsics.d(this.f83416c, lVar.f83416c);
    }

    public final int hashCode() {
        v vVar = this.f83414a;
        int hashCode = (vVar != null ? vVar.hashCode() : 0) * 31;
        f fVar = this.f83415b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        k kVar = this.f83416c;
        return hashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "Certificate(tbsCertificate=" + this.f83414a + ", signatureAlgorithm=" + this.f83415b + ", signatureValue=" + this.f83416c + ")";
    }
}
