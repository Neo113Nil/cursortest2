package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.internal.FrameworkClassParsingException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import xsna.zcl;

/* compiled from: BeginCreateCredentialRequest.kt */
/* loaded from: classes12.dex */
public abstract class BeginCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private final CallingAppInfo callingAppInfo;
    private final Bundle candidateQueryData;
    private final String type;

    /* compiled from: BeginCreateCredentialRequest.kt */
    public static final class Api21Impl {
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA";
        private static final String EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE = "androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE";
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialRequest beginCreateCredentialRequest) {
            bundle.putString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE, beginCreateCredentialRequest.getType());
            bundle.putBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA, beginCreateCredentialRequest.getCandidateQueryData());
            CallingAppInfo callingAppInfo = beginCreateCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion.setCallingAppInfo$credentials_release(bundle, callingAppInfo);
            }
        }

        public static final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
            String string = bundle.getString(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE);
            if (string == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(EXTRA_BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            return BeginCreateCredentialRequest.Companion.createFrom$credentials_release(string, bundle2, CallingAppInfo.Companion.extractCallingAppInfo$credentials_release(bundle));
        }
    }

    /* compiled from: BeginCreateCredentialRequest.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();
        private static final String REQUEST_KEY = "androidx.credentials.provider.BeginCreateCredentialRequest";

        private Api34Impl() {
        }

        public static final void asBundle(Bundle bundle, BeginCreateCredentialRequest beginCreateCredentialRequest) {
            bundle.putParcelable(REQUEST_KEY, BeginCreateCredentialUtil.Companion.convertToFrameworkRequest(beginCreateCredentialRequest));
        }

        public static final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
            android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest = (android.service.credentials.BeginCreateCredentialRequest) bundle.getParcelable(REQUEST_KEY, android.service.credentials.BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return BeginCreateCredentialUtil.Companion.convertToJetpackRequest$credentials_release(beginCreateCredentialRequest);
            }
            return null;
        }
    }

    /* compiled from: BeginCreateCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(BeginCreateCredentialRequest beginCreateCredentialRequest) {
            Bundle bundle = new Bundle();
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.asBundle(bundle, beginCreateCredentialRequest);
                return bundle;
            }
            Api21Impl.asBundle(bundle, beginCreateCredentialRequest);
            return bundle;
        }

        public final BeginCreateCredentialRequest createFrom$credentials_release(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
            try {
                return str.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? BeginCreatePasswordCredentialRequest.Companion.createFrom$credentials_release(bundle, callingAppInfo) : str.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? BeginCreatePublicKeyCredentialRequest.Companion.createFrom$credentials_release(bundle, callingAppInfo) : new BeginCreateCustomCredentialRequest(str, bundle, callingAppInfo);
            } catch (FrameworkClassParsingException unused) {
                return new BeginCreateCustomCredentialRequest(str, bundle, callingAppInfo);
            }
        }

        public final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.fromBundle(bundle) : Api21Impl.fromBundle(bundle);
        }

        private Companion() {
        }
    }

    public BeginCreateCredentialRequest(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        this.type = str;
        this.candidateQueryData = bundle;
        this.callingAppInfo = callingAppInfo;
    }

    public static final Bundle asBundle(BeginCreateCredentialRequest beginCreateCredentialRequest) {
        return Companion.asBundle(beginCreateCredentialRequest);
    }

    public static final BeginCreateCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final String getType() {
        return this.type;
    }
}
