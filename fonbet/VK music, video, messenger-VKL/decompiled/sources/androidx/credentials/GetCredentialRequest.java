package androidx.credentials;

import android.content.ComponentName;
import android.os.Bundle;
import androidx.credentials.internal.FrameworkClassParsingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.e43;
import xsna.j5g;
import xsna.vd2;
import xsna.zcl;

/* compiled from: GetCredentialRequest.kt */
/* loaded from: classes.dex */
public final class GetCredentialRequest {
    private static final String BUNDLE_KEY_PREFER_IDENTITY_DOC_UI = "androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI";
    public static final String BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";
    private static final String BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME = "androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME";
    public static final Companion Companion = new Companion(null);
    private final List<CredentialOption> credentialOptions;
    private final String origin;
    private final boolean preferIdentityDocUi;
    private final boolean preferImmediatelyAvailableCredentials;
    private final ComponentName preferUiBrandingComponentName;

    /* compiled from: GetCredentialRequest.kt */
    public static final class Builder {
        private List<CredentialOption> credentialOptions = new ArrayList();
        private String origin;
        private boolean preferIdentityDocUi;
        private boolean preferImmediatelyAvailableCredentials;
        private ComponentName preferUiBrandingComponentName;

        public final Builder addCredentialOption(CredentialOption credentialOption) {
            this.credentialOptions.add(credentialOption);
            return this;
        }

        public final GetCredentialRequest build() {
            return new GetCredentialRequest(j5g.O0(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        public final Builder setCredentialOptions(List<? extends CredentialOption> list) {
            this.credentialOptions = new ArrayList(list);
            return this;
        }

        public final Builder setOrigin(String str) {
            this.origin = str;
            return this;
        }

        public final Builder setPreferIdentityDocUi(boolean z) {
            this.preferIdentityDocUi = z;
            return this;
        }

        public final Builder setPreferImmediatelyAvailableCredentials(boolean z) {
            this.preferImmediatelyAvailableCredentials = z;
            return this;
        }

        public final Builder setPreferUiBrandingComponentName(ComponentName componentName) {
            this.preferUiBrandingComponentName = componentName;
            return this;
        }
    }

    /* compiled from: GetCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final GetCredentialRequest createFrom(android.credentials.GetCredentialRequest getCredentialRequest) {
            List credentialOptions;
            String origin;
            Bundle data;
            credentialOptions = getCredentialRequest.getCredentialOptions();
            List list = credentialOptions;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(CredentialOption.Companion.createFrom(vd2.b(it.next())));
            }
            origin = getCredentialRequest.getOrigin();
            data = getCredentialRequest.getData();
            return createFrom(arrayList, origin, data);
        }

        public final Bundle getRequestMetadataBundle(GetCredentialRequest getCredentialRequest) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI, getCredentialRequest.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", getCredentialRequest.preferImmediatelyAvailableCredentials());
            bundle.putParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME, getCredentialRequest.getPreferUiBrandingComponentName());
            return bundle;
        }

        private Companion() {
        }

        public final GetCredentialRequest createFrom(List<? extends CredentialOption> list, String str, Bundle bundle) {
            try {
                boolean z = bundle.getBoolean(GetCredentialRequest.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI);
                Builder preferImmediatelyAvailableCredentials = new Builder().setCredentialOptions(list).setPreferIdentityDocUi(z).setPreferUiBrandingComponentName((ComponentName) bundle.getParcelable(GetCredentialRequest.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME)).setPreferImmediatelyAvailableCredentials(bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS"));
                if (str != null) {
                    preferImmediatelyAvailableCredentials.setOrigin(str);
                }
                return preferImmediatelyAvailableCredentials.build();
            } catch (Exception unused) {
                throw new FrameworkClassParsingException();
            }
        }
    }

    public GetCredentialRequest(List<? extends CredentialOption> list) {
        this(list, null, false, null, false, 30, null);
    }

    public static final GetCredentialRequest createFrom(android.credentials.GetCredentialRequest getCredentialRequest) {
        return Companion.createFrom(getCredentialRequest);
    }

    public static final Bundle getRequestMetadataBundle(GetCredentialRequest getCredentialRequest) {
        return Companion.getRequestMetadataBundle(getCredentialRequest);
    }

    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    public final boolean preferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }

    public GetCredentialRequest(List<? extends CredentialOption> list, String str) {
        this(list, str, false, null, false, 28, null);
    }

    public static final GetCredentialRequest createFrom(List<? extends CredentialOption> list, String str, Bundle bundle) {
        return Companion.createFrom(list, str, bundle);
    }

    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z) {
        this(list, str, z, null, false, 24, null);
    }

    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z, ComponentName componentName) {
        this(list, str, z, componentName, false, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialRequest(List<? extends CredentialOption> list, String str, boolean z, ComponentName componentName, boolean z2) {
        this.credentialOptions = list;
        this.origin = str;
        this.preferIdentityDocUi = z;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z2;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                List<? extends CredentialOption> list2 = list;
                int i = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if ((((CredentialOption) it.next()) instanceof GetDigitalCredentialOption) && (i = i + 1) < 0) {
                            e43.s();
                            throw null;
                        }
                    }
                }
                if (i > 0 && i != this.credentialOptions.size()) {
                    throw new IllegalArgumentException("Digital Credential Option cannot be used with other credential option.");
                }
                Iterator<CredentialOption> it2 = this.credentialOptions.iterator();
                while (it2.hasNext()) {
                    if (it2.next() instanceof GetRestoreCredentialOption) {
                        throw new IllegalArgumentException("Only a single GetRestoreCredentialOption should be provided.");
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("credentialOptions should not be empty");
    }

    public /* synthetic */ GetCredentialRequest(List list, String str, boolean z, ComponentName componentName, boolean z2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : componentName, (i & 16) != 0 ? false : z2);
    }
}
