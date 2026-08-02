package androidx.credentials.webauthn;

import java.util.Arrays;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: FidoDataTypes.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialDescriptor {
    private final byte[] id;
    private final List<String> transports;
    private final String type;

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List<String> list) {
        this.type = str;
        this.id = bArr;
        this.transports = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublicKeyCredentialDescriptor copy$default(PublicKeyCredentialDescriptor publicKeyCredentialDescriptor, String str, byte[] bArr, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publicKeyCredentialDescriptor.type;
        }
        if ((i & 2) != 0) {
            bArr = publicKeyCredentialDescriptor.id;
        }
        if ((i & 4) != 0) {
            list = publicKeyCredentialDescriptor.transports;
        }
        return publicKeyCredentialDescriptor.copy(str, bArr, list);
    }

    public final String component1() {
        return this.type;
    }

    public final byte[] component2() {
        return this.id;
    }

    public final List<String> component3() {
        return this.transports;
    }

    public final PublicKeyCredentialDescriptor copy(String str, byte[] bArr, List<String> list) {
        return new PublicKeyCredentialDescriptor(str, bArr, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        return epx.f(this.type, publicKeyCredentialDescriptor.type) && epx.f(this.id, publicKeyCredentialDescriptor.id) && epx.f(this.transports, publicKeyCredentialDescriptor.transports);
    }

    public final byte[] getId() {
        return this.id;
    }

    public final List<String> getTransports() {
        return this.transports;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.transports.hashCode() + ((Arrays.hashCode(this.id) + (this.type.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialDescriptor(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(Arrays.toString(this.id));
        sb.append(", transports=");
        return ms9.a(')', sb, this.transports);
    }
}
