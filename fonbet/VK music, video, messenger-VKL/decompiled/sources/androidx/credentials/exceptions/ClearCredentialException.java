package androidx.credentials.exceptions;

import android.os.Bundle;
import xsna.zcl;

/* compiled from: ClearCredentialException.kt */
/* loaded from: classes12.dex */
public abstract class ClearCredentialException extends Exception {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CLEAR_CREDENTIAL_EXCEPTION_MESSAGE = "androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_MESSAGE";
    private static final String EXTRA_CLEAR_CREDENTIAL_EXCEPTION_TYPE = "androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_TYPE";
    private final CharSequence errorMessage;
    private final String type;

    /* compiled from: ClearCredentialException.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(ClearCredentialException clearCredentialException) {
            Bundle bundle = new Bundle();
            bundle.putString(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_TYPE, clearCredentialException.getType());
            CharSequence errorMessage = clearCredentialException.getErrorMessage();
            if (errorMessage != null) {
                bundle.putCharSequence(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_MESSAGE, errorMessage);
            }
            return bundle;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final ClearCredentialException fromBundle(Bundle bundle) {
            String string = bundle.getString(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_TYPE);
            if (string == null) {
                throw new IllegalArgumentException("Bundle was missing exception type.");
            }
            CharSequence charSequence = bundle.getCharSequence(ClearCredentialException.EXTRA_CLEAR_CREDENTIAL_EXCEPTION_MESSAGE);
            switch (string.hashCode()) {
                case -404396566:
                    if (string.equals(ClearCredentialInterruptedException.TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION)) {
                        return new ClearCredentialInterruptedException(charSequence);
                    }
                    break;
                case 1050953245:
                    if (string.equals(ClearCredentialUnsupportedException.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION)) {
                        return new ClearCredentialUnsupportedException(charSequence);
                    }
                    break;
                case 1202393376:
                    if (string.equals(ClearCredentialProviderConfigurationException.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION)) {
                        return new ClearCredentialProviderConfigurationException(charSequence);
                    }
                    break;
                case 1859614946:
                    if (string.equals(ClearCredentialUnknownException.TYPE_CLEAR_CREDENTIAL_UNKNOWN_EXCEPTION)) {
                        return new ClearCredentialUnknownException(charSequence);
                    }
                    break;
            }
            return new ClearCredentialCustomException(string, charSequence);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public static final Bundle asBundle(ClearCredentialException clearCredentialException) {
        return Companion.asBundle(clearCredentialException);
    }

    public static final ClearCredentialException fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    public String getType() {
        return this.type;
    }

    public /* synthetic */ ClearCredentialException(String str, CharSequence charSequence, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public ClearCredentialException(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        this.type = str;
        this.errorMessage = charSequence;
    }
}
