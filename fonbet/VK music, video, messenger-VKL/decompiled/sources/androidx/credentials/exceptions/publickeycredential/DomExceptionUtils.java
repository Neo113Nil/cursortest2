package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.domerrors.AbortError;
import androidx.credentials.exceptions.domerrors.ConstraintError;
import androidx.credentials.exceptions.domerrors.DataCloneError;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.HierarchyRequestError;
import androidx.credentials.exceptions.domerrors.InUseAttributeError;
import androidx.credentials.exceptions.domerrors.InvalidCharacterError;
import androidx.credentials.exceptions.domerrors.InvalidModificationError;
import androidx.credentials.exceptions.domerrors.InvalidNodeTypeError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NamespaceError;
import androidx.credentials.exceptions.domerrors.NetworkError;
import androidx.credentials.exceptions.domerrors.NoModificationAllowedError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.NotFoundError;
import androidx.credentials.exceptions.domerrors.NotReadableError;
import androidx.credentials.exceptions.domerrors.NotSupportedError;
import androidx.credentials.exceptions.domerrors.OperationError;
import androidx.credentials.exceptions.domerrors.OptOutError;
import androidx.credentials.exceptions.domerrors.QuotaExceededError;
import androidx.credentials.exceptions.domerrors.ReadOnlyError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.domerrors.SyntaxError;
import androidx.credentials.exceptions.domerrors.TimeoutError;
import androidx.credentials.exceptions.domerrors.TransactionInactiveError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.domerrors.VersionError;
import androidx.credentials.exceptions.domerrors.WrongDocumentError;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.zcl;

/* compiled from: DomExceptionUtils.kt */
/* loaded from: classes12.dex */
public final class DomExceptionUtils {
    public static final Companion Companion = new Companion(null);
    public static final String SEPARATOR = "/";

    /* compiled from: DomExceptionUtils.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> T generateException(DomError domError, String str, T t) {
            if (t instanceof CreatePublicKeyCredentialDomException) {
                return (T) new CreatePublicKeyCredentialDomException(domError, str);
            }
            if (t instanceof GetPublicKeyCredentialDomException) {
                return (T) new GetPublicKeyCredentialDomException(domError, str);
            }
            throw new FrameworkClassParsingException();
        }

        public final <T> T generateDomException$credentials_release(String str, String str2, String str3, T t) {
            if (str.equals(str2.concat(AbortError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ABORT_ERROR))) {
                return (T) generateException(new AbortError(), str3, t);
            }
            if (str.equals(str2.concat(ConstraintError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_CONSTRAINT_ERROR))) {
                return (T) generateException(new ConstraintError(), str3, t);
            }
            if (str.equals(str2.concat(DataCloneError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_CLONE_ERROR))) {
                return (T) generateException(new DataCloneError(), str3, t);
            }
            if (str.equals(str2.concat(DataError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_ERROR))) {
                return (T) generateException(new DataError(), str3, t);
            }
            if (str.equals(str2.concat(EncodingError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ENCODING_ERROR))) {
                return (T) generateException(new EncodingError(), str3, t);
            }
            if (str.equals(str2.concat(HierarchyRequestError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_HIERARCHY_REQUEST_ERROR))) {
                return (T) generateException(new HierarchyRequestError(), str3, t);
            }
            if (str.equals(str2.concat(InUseAttributeError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_IN_USE_ATTRIBUTE_ERROR))) {
                return (T) generateException(new InUseAttributeError(), str3, t);
            }
            if (str.equals(str2.concat(InvalidCharacterError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_CHARACTER_ERROR))) {
                return (T) generateException(new InvalidCharacterError(), str3, t);
            }
            if (str.equals(str2.concat(InvalidModificationError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_MODIFICATION_ERROR))) {
                return (T) generateException(new InvalidModificationError(), str3, t);
            }
            if (str.equals(str2.concat(InvalidNodeTypeError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_NODE_TYPE_ERROR))) {
                return (T) generateException(new InvalidNodeTypeError(), str3, t);
            }
            if (str.equals(str2.concat(InvalidStateError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_STATE_ERROR))) {
                return (T) generateException(new InvalidStateError(), str3, t);
            }
            if (str.equals(str2.concat(NamespaceError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NAMESPACE_ERROR))) {
                return (T) generateException(new NamespaceError(), str3, t);
            }
            if (str.equals(str2.concat(NetworkError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NETWORK_ERROR))) {
                return (T) generateException(new NetworkError(), str3, t);
            }
            if (str.equals(str2.concat(NoModificationAllowedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NO_MODIFICATION_ALLOWED_ERROR))) {
                return (T) generateException(new NoModificationAllowedError(), str3, t);
            }
            if (str.equals(str2.concat(NotAllowedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_ALLOWED_ERROR))) {
                return (T) generateException(new NotAllowedError(), str3, t);
            }
            if (str.equals(str2.concat(NotFoundError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_FOUND_ERROR))) {
                return (T) generateException(new NotFoundError(), str3, t);
            }
            if (str.equals(str2.concat(NotReadableError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_READABLE_ERROR))) {
                return (T) generateException(new NotReadableError(), str3, t);
            }
            if (str.equals(str2.concat(NotSupportedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_SUPPORTED_ERROR))) {
                return (T) generateException(new NotSupportedError(), str3, t);
            }
            if (str.equals(str2.concat(OperationError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPERATION_ERROR))) {
                return (T) generateException(new OperationError(), str3, t);
            }
            if (str.equals(str2.concat(OptOutError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPT_OUT_ERROR))) {
                return (T) generateException(new OptOutError(), str3, t);
            }
            if (str.equals(str2.concat(QuotaExceededError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_QUOTA_EXCEEDED_ERROR))) {
                return (T) generateException(new QuotaExceededError(), str3, t);
            }
            if (str.equals(str2.concat(ReadOnlyError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_READ_ONLY_ERROR))) {
                return (T) generateException(new ReadOnlyError(), str3, t);
            }
            if (str.equals(str2.concat(SecurityError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SECURITY_ERROR))) {
                return (T) generateException(new SecurityError(), str3, t);
            }
            if (str.equals(str2.concat(SyntaxError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SYNTAX_ERROR))) {
                return (T) generateException(new SyntaxError(), str3, t);
            }
            if (str.equals(str2.concat(TimeoutError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TIMEOUT_ERROR))) {
                return (T) generateException(new TimeoutError(), str3, t);
            }
            if (str.equals(str2.concat(TransactionInactiveError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TRANSACTION_INACTIVE_ERROR))) {
                return (T) generateException(new TransactionInactiveError(), str3, t);
            }
            if (str.equals(str2.concat(UnknownError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_UNKNOWN_ERROR))) {
                return (T) generateException(new UnknownError(), str3, t);
            }
            if (str.equals(str2.concat(VersionError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_VERSION_ERROR))) {
                return (T) generateException(new VersionError(), str3, t);
            }
            if (str.equals(str2.concat(WrongDocumentError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_WRONG_DOCUMENT_ERROR))) {
                return (T) generateException(new WrongDocumentError(), str3, t);
            }
            throw new FrameworkClassParsingException();
        }

        private Companion() {
        }
    }
}
