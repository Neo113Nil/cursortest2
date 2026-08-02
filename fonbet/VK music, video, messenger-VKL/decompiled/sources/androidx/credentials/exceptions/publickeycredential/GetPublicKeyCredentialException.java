package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.brm0;
import xsna.zcl;

/* compiled from: GetPublicKeyCredentialException.kt */
/* loaded from: classes12.dex */
public class GetPublicKeyCredentialException extends GetCredentialException {
    public static final Companion Companion = new Companion(null);
    private final String type;

    /* compiled from: GetPublicKeyCredentialException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final GetCredentialException createFrom(String str, String str2) {
            try {
                if (brm0.B(str, GetPublicKeyCredentialDomException.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false)) {
                    return GetPublicKeyCredentialDomException.Companion.createFrom(str, str2);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new GetCredentialCustomException(str, str2);
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetPublicKeyCredentialException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public static final GetCredentialException createFrom(String str, String str2) {
        return Companion.createFrom(str, str2);
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    public String getType() {
        return this.type;
    }

    public /* synthetic */ GetPublicKeyCredentialException(String str, CharSequence charSequence, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public GetPublicKeyCredentialException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
