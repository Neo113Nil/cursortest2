package androidx.credentials.webauthn;

import xsna.epx;
import xsna.ho8;

/* compiled from: FidoDataTypes.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialRpEntity {
    private final String id;
    private final String name;

    public PublicKeyCredentialRpEntity(String str, String str2) {
        this.name = str;
        this.id = str2;
    }

    public static /* synthetic */ PublicKeyCredentialRpEntity copy$default(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publicKeyCredentialRpEntity.name;
        }
        if ((i & 2) != 0) {
            str2 = publicKeyCredentialRpEntity.id;
        }
        return publicKeyCredentialRpEntity.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.id;
    }

    public final PublicKeyCredentialRpEntity copy(String str, String str2) {
        return new PublicKeyCredentialRpEntity(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return epx.f(this.name, publicKeyCredentialRpEntity.name) && epx.f(this.id, publicKeyCredentialRpEntity.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.id.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity(name=");
        sb.append(this.name);
        sb.append(", id=");
        return ho8.a(sb, this.id, ')');
    }
}
