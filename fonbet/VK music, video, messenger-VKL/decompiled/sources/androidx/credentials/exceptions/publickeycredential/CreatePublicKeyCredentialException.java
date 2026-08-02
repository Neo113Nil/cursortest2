package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.drm0;
import xsna.zcl;

/* compiled from: CreatePublicKeyCredentialException.kt */
/* loaded from: classes12.dex */
public class CreatePublicKeyCredentialException extends CreateCredentialException {
    public static final Companion Companion = new Companion(null);
    private final String type;

    /* compiled from: CreatePublicKeyCredentialException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CreateCredentialException createFrom(String str, String str2) {
            try {
                if (drm0.D(str, CreatePublicKeyCredentialDomException.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false)) {
                    return CreatePublicKeyCredentialDomException.Companion.createFrom(str, str2);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CreateCredentialCustomException(str, str2);
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreatePublicKeyCredentialException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public static final CreateCredentialException createFrom(String str, String str2) {
        return Companion.createFrom(str, str2);
    }

    @Override // androidx.credentials.exceptions.CreateCredentialException
    public String getType() {
        return this.type;
    }

    public /* synthetic */ CreatePublicKeyCredentialException(String str, CharSequence charSequence, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public CreatePublicKeyCredentialException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
