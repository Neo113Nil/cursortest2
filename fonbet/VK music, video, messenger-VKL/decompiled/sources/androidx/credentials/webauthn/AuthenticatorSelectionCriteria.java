package androidx.credentials.webauthn;

import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: FidoDataTypes.kt */
/* loaded from: classes12.dex */
public final class AuthenticatorSelectionCriteria {
    private final String authenticatorAttachment;
    private final boolean requireResidentKey;
    private final String residentKey;
    private final String userVerification;

    public AuthenticatorSelectionCriteria(String str, String str2, boolean z, String str3) {
        this.authenticatorAttachment = str;
        this.residentKey = str2;
        this.requireResidentKey = z;
        this.userVerification = str3;
    }

    public static /* synthetic */ AuthenticatorSelectionCriteria copy$default(AuthenticatorSelectionCriteria authenticatorSelectionCriteria, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authenticatorSelectionCriteria.authenticatorAttachment;
        }
        if ((i & 2) != 0) {
            str2 = authenticatorSelectionCriteria.residentKey;
        }
        if ((i & 4) != 0) {
            z = authenticatorSelectionCriteria.requireResidentKey;
        }
        if ((i & 8) != 0) {
            str3 = authenticatorSelectionCriteria.userVerification;
        }
        return authenticatorSelectionCriteria.copy(str, str2, z, str3);
    }

    public final String component1() {
        return this.authenticatorAttachment;
    }

    public final String component2() {
        return this.residentKey;
    }

    public final boolean component3() {
        return this.requireResidentKey;
    }

    public final String component4() {
        return this.userVerification;
    }

    public final AuthenticatorSelectionCriteria copy(String str, String str2, boolean z, String str3) {
        return new AuthenticatorSelectionCriteria(str, str2, z, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return epx.f(this.authenticatorAttachment, authenticatorSelectionCriteria.authenticatorAttachment) && epx.f(this.residentKey, authenticatorSelectionCriteria.residentKey) && this.requireResidentKey == authenticatorSelectionCriteria.requireResidentKey && epx.f(this.userVerification, authenticatorSelectionCriteria.userVerification);
    }

    public final String getAuthenticatorAttachment() {
        return this.authenticatorAttachment;
    }

    public final boolean getRequireResidentKey() {
        return this.requireResidentKey;
    }

    public final String getResidentKey() {
        return this.residentKey;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public int hashCode() {
        return this.userVerification.hashCode() + qoy.b(urd0.a(this.authenticatorAttachment.hashCode() * 31, 31, this.residentKey), 31, this.requireResidentKey);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AuthenticatorSelectionCriteria(authenticatorAttachment=");
        sb.append(this.authenticatorAttachment);
        sb.append(", residentKey=");
        sb.append(this.residentKey);
        sb.append(", requireResidentKey=");
        sb.append(this.requireResidentKey);
        sb.append(", userVerification=");
        return ho8.a(sb, this.userVerification, ')');
    }

    public /* synthetic */ AuthenticatorSelectionCriteria(String str, String str2, boolean z, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "preferred" : str3);
    }
}
