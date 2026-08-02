package lb;

/* loaded from: classes3.dex */
public final class o0 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f55778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f55779b;

    /* renamed from: c, reason: collision with root package name */
    public final String f55780c;

    @Override // lb.k0
    public final String b() {
        return this.f55779b;
    }

    @Override // lb.k0
    public final String c() {
        return this.f55780c;
    }

    @Override // lb.k0
    public final String d() {
        return this.f55778a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            String str = this.f55778a;
            if (str != null ? str.equals(k0Var.d()) : k0Var.d() == null) {
                String str2 = this.f55779b;
                if (str2 != null ? str2.equals(k0Var.b()) : k0Var.b() == null) {
                    String str3 = this.f55780c;
                    if (str3 != null ? str3.equals(k0Var.c()) : k0Var.c() == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55778a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f55779b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f55780c;
        return hashCode2 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "AttestationResult{recaptchaV2Token=" + this.f55778a + ", playIntegrityToken=" + this.f55779b + ", recaptchaEnterpriseToken=" + this.f55780c + "}";
    }

    public o0(String str, String str2, String str3) {
        this.f55778a = str;
        this.f55779b = str2;
        this.f55780c = str3;
    }
}
