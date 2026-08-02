package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;
import xsna.zcl;

/* compiled from: CredentialOption.kt */
/* loaded from: classes.dex */
public abstract class CredentialOption {
    public static final String BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";
    public static final String BUNDLE_KEY_TYPE_PRIORITY_VALUE = "androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE";
    public static final Companion Companion = new Companion(null);
    public static final int PRIORITY_DEFAULT = 2000;
    public static final int PRIORITY_OIDC_OR_SIMILAR = 500;
    public static final int PRIORITY_PASSKEY_OR_SIMILAR = 100;
    public static final int PRIORITY_PASSWORD_OR_SIMILAR = 1000;
    private final Set<ComponentName> allowedProviders;
    private final Bundle candidateQueryData;
    private final boolean isAutoSelectAllowed;
    private final boolean isSystemProviderRequired;
    private final Bundle requestData;
    private final String type;
    private final int typePriorityHint;

    /* compiled from: CredentialOption.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CredentialOption createFrom(android.credentials.CredentialOption credentialOption) {
            String type;
            Bundle credentialRetrievalData;
            Bundle candidateQueryData;
            boolean isSystemProviderRequired;
            Set<ComponentName> allowedProviders;
            type = credentialOption.getType();
            credentialRetrievalData = credentialOption.getCredentialRetrievalData();
            candidateQueryData = credentialOption.getCandidateQueryData();
            isSystemProviderRequired = credentialOption.isSystemProviderRequired();
            allowedProviders = credentialOption.getAllowedProviders();
            return createFrom(type, credentialRetrievalData, candidateQueryData, isSystemProviderRequired, allowedProviders);
        }

        public final boolean extractAutoSelectValue$credentials_release(Bundle bundle) {
            return bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED");
        }

        private Companion() {
        }

        public final CredentialOption createFrom(String str, Bundle bundle, Bundle bundle2, boolean z, Set<ComponentName> set) {
            try {
                int hashCode = str.hashCode();
                if (hashCode != -1678407252) {
                    if (hashCode != -543568185) {
                        if (hashCode == -95037569 && str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                            String string = bundle.getString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE);
                            if (string != null && string.hashCode() == -613058807 && string.equals(GetPublicKeyCredentialOption.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION)) {
                                return GetPublicKeyCredentialOption.Companion.createFrom$credentials_release(bundle, set, bundle2);
                            }
                            throw new FrameworkClassParsingException();
                        }
                    } else if (str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                        return GetPasswordOption.Companion.createFrom$credentials_release(bundle, set, bundle2);
                    }
                } else if (str.equals(DigitalCredential.TYPE_DIGITAL_CREDENTIAL)) {
                    return GetDigitalCredentialOption.Companion.createFrom$credentials_release(bundle, bundle2, z, set);
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new GetCustomCredentialOption(bundle, str, bundle2, z, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), set, bundle.getInt(CredentialOption.BUNDLE_KEY_TYPE_PRIORITY_VALUE, 2000));
            }
        }
    }

    /* compiled from: CredentialOption.kt */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes12.dex */
    public @interface PriorityHints {
    }

    public CredentialOption(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, Set<ComponentName> set, int i) {
        this.type = str;
        this.requestData = bundle;
        this.candidateQueryData = bundle2;
        this.isSystemProviderRequired = z;
        this.isAutoSelectAllowed = z2;
        this.allowedProviders = set;
        this.typePriorityHint = i;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putInt(BUNDLE_KEY_TYPE_PRIORITY_VALUE, i);
        bundle2.putInt(BUNDLE_KEY_TYPE_PRIORITY_VALUE, i);
    }

    public static final CredentialOption createFrom(android.credentials.CredentialOption credentialOption) {
        return Companion.createFrom(credentialOption);
    }

    public final Set<ComponentName> getAllowedProviders() {
        return this.allowedProviders;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final Bundle getRequestData() {
        return this.requestData;
    }

    public final String getType() {
        return this.type;
    }

    public final int getTypePriorityHint() {
        return this.typePriorityHint;
    }

    public final boolean isAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public final boolean isSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    public static final CredentialOption createFrom(String str, Bundle bundle, Bundle bundle2, boolean z, Set<ComponentName> set) {
        return Companion.createFrom(str, bundle, bundle2, z, set);
    }
}
