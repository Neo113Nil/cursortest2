package androidx.credentials.webauthn;

import java.util.Arrays;
import xsna.epx;
import xsna.ho8;

/* compiled from: FidoDataTypes.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialUserEntity {
    private final String displayName;
    private final byte[] id;
    private final String name;

    public PublicKeyCredentialUserEntity(String str, byte[] bArr, String str2) {
        this.name = str;
        this.id = bArr;
        this.displayName = str2;
    }

    public static /* synthetic */ PublicKeyCredentialUserEntity copy$default(PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, String str, byte[] bArr, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publicKeyCredentialUserEntity.name;
        }
        if ((i & 2) != 0) {
            bArr = publicKeyCredentialUserEntity.id;
        }
        if ((i & 4) != 0) {
            str2 = publicKeyCredentialUserEntity.displayName;
        }
        return publicKeyCredentialUserEntity.copy(str, bArr, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final byte[] component2() {
        return this.id;
    }

    public final String component3() {
        return this.displayName;
    }

    public final PublicKeyCredentialUserEntity copy(String str, byte[] bArr, String str2) {
        return new PublicKeyCredentialUserEntity(str, bArr, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return epx.f(this.name, publicKeyCredentialUserEntity.name) && epx.f(this.id, publicKeyCredentialUserEntity.id) && epx.f(this.displayName, publicKeyCredentialUserEntity.displayName);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final byte[] getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.displayName.hashCode() + ((Arrays.hashCode(this.id) + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialUserEntity(name=");
        sb.append(this.name);
        sb.append(", id=");
        sb.append(Arrays.toString(this.id));
        sb.append(", displayName=");
        return ho8.a(sb, this.displayName, ')');
    }
}
