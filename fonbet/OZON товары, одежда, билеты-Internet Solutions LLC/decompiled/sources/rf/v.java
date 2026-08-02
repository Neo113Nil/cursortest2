package rf;

import B90.C2618u;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final long f83474a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final BigInteger f83475b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f83476c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<List<h>> f83477d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final w f83478e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<List<h>> f83479f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final u f83480g;

    /* renamed from: h, reason: collision with root package name */
    private final k f83481h;

    /* renamed from: i, reason: collision with root package name */
    private final k f83482i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final List<s> f83483j;

    /* JADX WARN: Multi-variable type inference failed */
    public v(long j11, @NotNull BigInteger serialNumber, @NotNull f signature, @NotNull List<? extends List<h>> issuer, @NotNull w validity, @NotNull List<? extends List<h>> subject, @NotNull u subjectPublicKeyInfo, k kVar, k kVar2, @NotNull List<s> extensions) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(validity, "validity");
        Intrinsics.checkNotNullParameter(subject, "subject");
        Intrinsics.checkNotNullParameter(subjectPublicKeyInfo, "subjectPublicKeyInfo");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f83474a = j11;
        this.f83475b = serialNumber;
        this.f83476c = signature;
        this.f83477d = issuer;
        this.f83478e = validity;
        this.f83479f = subject;
        this.f83480g = subjectPublicKeyInfo;
        this.f83481h = kVar;
        this.f83482i = kVar2;
        this.f83483j = extensions;
    }

    @NotNull
    public final List<s> a() {
        return this.f83483j;
    }

    @NotNull
    public final List<List<h>> b() {
        return this.f83477d;
    }

    public final k c() {
        return this.f83481h;
    }

    @NotNull
    public final BigInteger d() {
        return this.f83475b;
    }

    @NotNull
    public final f e() {
        return this.f83476c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f83474a == vVar.f83474a && Intrinsics.d(this.f83475b, vVar.f83475b) && Intrinsics.d(this.f83476c, vVar.f83476c) && Intrinsics.d(this.f83477d, vVar.f83477d) && Intrinsics.d(this.f83478e, vVar.f83478e) && Intrinsics.d(this.f83479f, vVar.f83479f) && Intrinsics.d(this.f83480g, vVar.f83480g) && Intrinsics.d(this.f83481h, vVar.f83481h) && Intrinsics.d(this.f83482i, vVar.f83482i) && Intrinsics.d(this.f83483j, vVar.f83483j);
    }

    @NotNull
    public final String f() {
        f fVar = this.f83476c;
        String a11 = fVar.a();
        int hashCode = a11.hashCode();
        if (hashCode != -551630290) {
            if (hashCode == 368620366 && a11.equals("1.2.840.10045.4.3.2")) {
                return "SHA256withECDSA";
            }
        } else if (a11.equals("1.2.840.113549.1.1.11")) {
            return "SHA256WithRSA";
        }
        throw new IllegalStateException(("unexpected signature algorithm: " + fVar.a()).toString());
    }

    @NotNull
    public final List<List<h>> g() {
        return this.f83479f;
    }

    @NotNull
    public final u h() {
        return this.f83480g;
    }

    public final int hashCode() {
        int hashCode = (this.f83480g.hashCode() + G.g.b((this.f83478e.hashCode() + G.g.b((this.f83476c.hashCode() + ((this.f83475b.hashCode() + (((int) this.f83474a) * 31)) * 31)) * 31, 31, this.f83477d)) * 31, 31, this.f83479f)) * 31;
        k kVar = this.f83481h;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        k kVar2 = this.f83482i;
        return this.f83483j.hashCode() + ((hashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31);
    }

    public final k i() {
        return this.f83482i;
    }

    @NotNull
    public final w j() {
        return this.f83478e;
    }

    public final long k() {
        return this.f83474a;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TbsCertificate(version=");
        sb2.append(this.f83474a);
        sb2.append(", serialNumber=");
        sb2.append(this.f83475b);
        sb2.append(", signature=");
        sb2.append(this.f83476c);
        sb2.append(", issuer=");
        sb2.append(this.f83477d);
        sb2.append(", validity=");
        sb2.append(this.f83478e);
        sb2.append(", subject=");
        sb2.append(this.f83479f);
        sb2.append(", subjectPublicKeyInfo=");
        sb2.append(this.f83480g);
        sb2.append(", issuerUniqueID=");
        sb2.append(this.f83481h);
        sb2.append(", subjectUniqueID=");
        sb2.append(this.f83482i);
        sb2.append(", extensions=");
        return C2618u.h(sb2, this.f83483j, ")");
    }
}
