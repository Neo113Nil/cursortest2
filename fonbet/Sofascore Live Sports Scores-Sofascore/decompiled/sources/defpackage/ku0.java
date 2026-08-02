package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ku0 {
    public final String a;
    public final mu0 b;

    public ku0(String str, mu0 mu0Var) {
        if (str == null) {
            yhk.s("Null installationId");
            throw null;
        }
        this.a = str;
        if (mu0Var != null) {
            this.b = mu0Var;
        } else {
            yhk.s("Null installationTokenResult");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ku0) {
            ku0 ku0Var = (ku0) obj;
            if (this.a.equals(ku0Var.a) && this.b.equals(ku0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InstallationIdResult{installationId=" + this.a + ", installationTokenResult=" + this.b + "}";
    }
}
