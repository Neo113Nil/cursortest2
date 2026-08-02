package androidx.credentials.webauthn;

import xsna.epx;
import xsna.vu5;

/* compiled from: FidoDataTypes.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialParameters {
    private final long alg;
    private final String type;

    public PublicKeyCredentialParameters(String str, long j) {
        this.type = str;
        this.alg = j;
    }

    public static /* synthetic */ PublicKeyCredentialParameters copy$default(PublicKeyCredentialParameters publicKeyCredentialParameters, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publicKeyCredentialParameters.type;
        }
        if ((i & 2) != 0) {
            j = publicKeyCredentialParameters.alg;
        }
        return publicKeyCredentialParameters.copy(str, j);
    }

    public final String component1() {
        return this.type;
    }

    public final long component2() {
        return this.alg;
    }

    public final PublicKeyCredentialParameters copy(String str, long j) {
        return new PublicKeyCredentialParameters(str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return epx.f(this.type, publicKeyCredentialParameters.type) && this.alg == publicKeyCredentialParameters.alg;
    }

    public final long getAlg() {
        return this.alg;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Long.hashCode(this.alg) + (this.type.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialParameters(type=");
        sb.append(this.type);
        sb.append(", alg=");
        return vu5.a(')', this.alg, sb);
    }
}
