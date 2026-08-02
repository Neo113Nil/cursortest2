package androidx.credentials.exceptions;

import android.os.Bundle;
import androidx.credentials.internal.ConversionUtilsKt;
import xsna.zcl;

/* compiled from: GetCredentialException.kt */
/* loaded from: classes.dex */
public abstract class GetCredentialException extends Exception {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE";
    private static final String EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE";
    private final CharSequence errorMessage;
    private final String type;

    /* compiled from: GetCredentialException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(GetCredentialException getCredentialException) {
            Bundle bundle = new Bundle();
            bundle.putString(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE, getCredentialException.getType());
            CharSequence errorMessage = getCredentialException.getErrorMessage();
            if (errorMessage != null) {
                bundle.putCharSequence(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE, errorMessage);
            }
            return bundle;
        }

        public final GetCredentialException fromBundle(Bundle bundle) {
            String string = bundle.getString(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_TYPE);
            if (string != null) {
                return ConversionUtilsKt.toJetpackGetException(string, bundle.getCharSequence(GetCredentialException.EXTRA_GET_CREDENTIAL_EXCEPTION_MESSAGE));
            }
            throw new IllegalArgumentException("Bundle was missing exception type.");
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public static final Bundle asBundle(GetCredentialException getCredentialException) {
        return Companion.asBundle(getCredentialException);
    }

    public static final GetCredentialException fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    public String getType() {
        return this.type;
    }

    public /* synthetic */ GetCredentialException(String str, CharSequence charSequence, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public GetCredentialException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        this.type = str;
        this.errorMessage = charSequence;
    }
}
