package androidx.credentials;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.credentials.internal.FrameworkClassParsingException;
import xsna.zcl;

/* compiled from: CreateCredentialRequest.kt */
/* loaded from: classes.dex */
public abstract class CreateCredentialRequest {
    public static final String BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";
    public static final String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";
    public static final Companion Companion = new Companion(null);
    private final Bundle candidateQueryData;
    private final Bundle credentialData;
    private final DisplayInfo displayInfo;
    private final boolean isAutoSelectAllowed;
    private final boolean isSystemProviderRequired;
    private final String origin;
    private final boolean preferImmediatelyAvailableCredentials;
    private final String type;

    /* compiled from: CreateCredentialRequest.kt */
    /* loaded from: classes12.dex */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ CreateCredentialRequest createFrom$default(Companion companion, String str, Bundle bundle, Bundle bundle2, boolean z, String str2, int i, Object obj) {
            if ((i & 16) != 0) {
                str2 = null;
            }
            return companion.createFrom(str, bundle, bundle2, z, str2);
        }

        public final CreateCredentialRequest createFrom(String str, Bundle bundle, Bundle bundle2, boolean z) {
            return createFrom$default(this, str, bundle, bundle2, z, null, 16, null);
        }

        private Companion() {
        }

        public final CreateCredentialRequest createFrom(android.credentials.CreateCredentialRequest createCredentialRequest) {
            String type;
            Bundle credentialData;
            Bundle candidateQueryData;
            boolean isSystemProviderRequired;
            String origin;
            type = createCredentialRequest.getType();
            credentialData = createCredentialRequest.getCredentialData();
            candidateQueryData = createCredentialRequest.getCandidateQueryData();
            isSystemProviderRequired = createCredentialRequest.isSystemProviderRequired();
            origin = createCredentialRequest.getOrigin();
            return createFrom(type, credentialData, candidateQueryData, isSystemProviderRequired, origin);
        }

        public final CreateCredentialRequest createFrom(String str, Bundle bundle, Bundle bundle2, boolean z, String str2) {
            try {
                if (str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    return CreatePasswordRequest.Companion.createFrom$credentials_release(bundle, str2, bundle2);
                }
                if (str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    String string = bundle.getString(PublicKeyCredential.BUNDLE_KEY_SUBTYPE);
                    if (string != null && string.hashCode() == 589054771 && string.equals(CreatePublicKeyCredentialRequest.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST)) {
                        return CreatePublicKeyCredentialRequest.Companion.createFrom$credentials_release(bundle, str2, bundle2);
                    }
                    throw new FrameworkClassParsingException();
                }
                throw new FrameworkClassParsingException();
            } catch (FrameworkClassParsingException unused) {
                return new CreateCustomCredentialRequest(str, bundle, bundle2, z, DisplayInfo.Companion.createFrom(bundle), bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), str2, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false));
            }
        }
    }

    /* compiled from: CreateCredentialRequest.kt */
    /* loaded from: classes12.dex */
    public static final class DisplayInfo {
        public static final String BUNDLE_KEY_CREDENTIAL_TYPE_ICON = "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON";
        public static final String BUNDLE_KEY_DEFAULT_PROVIDER = "androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER";
        public static final String BUNDLE_KEY_REQUEST_DISPLAY_INFO = "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO";
        public static final String BUNDLE_KEY_USER_DISPLAY_NAME = "androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME";
        public static final String BUNDLE_KEY_USER_ID = "androidx.credentials.BUNDLE_KEY_USER_ID";
        public static final Companion Companion = new Companion(null);
        private final Icon credentialTypeIcon;
        private final String preferDefaultProvider;
        private final CharSequence userDisplayName;
        private final CharSequence userId;

        /* compiled from: CreateCredentialRequest.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final DisplayInfo createFrom(Bundle bundle) {
                try {
                    Bundle bundle2 = bundle.getBundle(DisplayInfo.BUNDLE_KEY_REQUEST_DISPLAY_INFO);
                    return new DisplayInfo(bundle2.getCharSequence(DisplayInfo.BUNDLE_KEY_USER_ID), bundle2.getCharSequence(DisplayInfo.BUNDLE_KEY_USER_DISPLAY_NAME), (Icon) bundle2.getParcelable(DisplayInfo.BUNDLE_KEY_CREDENTIAL_TYPE_ICON), bundle2.getString(DisplayInfo.BUNDLE_KEY_DEFAULT_PROVIDER));
                } catch (Exception e) {
                    throw new IllegalArgumentException(e);
                }
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DisplayInfo(CharSequence charSequence) {
            this(charSequence, (CharSequence) null, 2, (zcl) (0 == true ? 1 : 0));
        }

        public static final DisplayInfo createFrom(Bundle bundle) {
            return Companion.createFrom(bundle);
        }

        public final Icon getCredentialTypeIcon() {
            return this.credentialTypeIcon;
        }

        public final String getPreferDefaultProvider() {
            return this.preferDefaultProvider;
        }

        public final CharSequence getUserDisplayName() {
            return this.userDisplayName;
        }

        public final CharSequence getUserId() {
            return this.userId;
        }

        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence(BUNDLE_KEY_USER_ID, this.userId);
            if (!TextUtils.isEmpty(this.userDisplayName)) {
                bundle.putCharSequence(BUNDLE_KEY_USER_DISPLAY_NAME, this.userDisplayName);
            }
            if (!TextUtils.isEmpty(this.preferDefaultProvider)) {
                bundle.putString(BUNDLE_KEY_DEFAULT_PROVIDER, this.preferDefaultProvider);
            }
            return bundle;
        }

        public DisplayInfo(CharSequence charSequence, CharSequence charSequence2, Icon icon, String str) {
            this.userId = charSequence;
            this.userDisplayName = charSequence2;
            this.credentialTypeIcon = icon;
            this.preferDefaultProvider = str;
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        public /* synthetic */ DisplayInfo(CharSequence charSequence, CharSequence charSequence2, int i, zcl zclVar) {
            this(charSequence, (i & 2) != 0 ? null : charSequence2);
        }

        public DisplayInfo(CharSequence charSequence, CharSequence charSequence2) {
            this(charSequence, charSequence2, (Icon) null, (String) null);
        }

        public DisplayInfo(CharSequence charSequence, CharSequence charSequence2, String str) {
            this(charSequence, charSequence2, (Icon) null, str);
        }
    }

    public CreateCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, DisplayInfo displayInfo, String str2, boolean z3) {
        this.type = str;
        this.credentialData = bundle;
        this.candidateQueryData = bundle2;
        this.isSystemProviderRequired = z;
        this.isAutoSelectAllowed = z2;
        this.displayInfo = displayInfo;
        this.origin = str2;
        this.preferImmediatelyAvailableCredentials = z3;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z3);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
    }

    public static final CreateCredentialRequest createFrom(android.credentials.CreateCredentialRequest createCredentialRequest) {
        return Companion.createFrom(createCredentialRequest);
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final Bundle getCredentialData() {
        return this.credentialData;
    }

    public final DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public final boolean isSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    public final boolean preferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    public static final CreateCredentialRequest createFrom(String str, Bundle bundle, Bundle bundle2, boolean z) {
        return Companion.createFrom(str, bundle, bundle2, z);
    }

    public static final CreateCredentialRequest createFrom(String str, Bundle bundle, Bundle bundle2, boolean z, String str2) {
        return Companion.createFrom(str, bundle, bundle2, z, str2);
    }
}
