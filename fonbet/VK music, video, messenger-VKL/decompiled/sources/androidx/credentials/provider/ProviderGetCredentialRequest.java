package androidx.credentials.provider;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.credentials.CredentialOption;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.j5g;
import xsna.lhg;
import xsna.uqi;
import xsna.zcl;

/* compiled from: ProviderGetCredentialRequest.kt */
/* loaded from: classes12.dex */
public final class ProviderGetCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ALLOWED_PROVIDERS_";
    private static final String EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_";
    private static final String EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_";
    private static final String EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_";
    private static final String EXTRA_CREDENTIAL_OPTION_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_SIZE";
    private static final String EXTRA_CREDENTIAL_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";
    private final BiometricPromptResult biometricPromptResult;
    private final CallingAppInfo callingAppInfo;
    private final List<CredentialOption> credentialOptions;
    private final Bundle sourceBundle;

    /* compiled from: ProviderGetCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ ProviderGetCredentialRequest createFrom$credentials_release$default(Companion companion, List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                biometricPromptResult = null;
            }
            return companion.createFrom$credentials_release(list, callingAppInfo, biometricPromptResult, bundle);
        }

        public final Bundle asBundle(ProviderGetCredentialRequest providerGetCredentialRequest) {
            Bundle bundle = new Bundle();
            int size = providerGetCredentialRequest.getCredentialOptions().size();
            bundle.putInt(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_SIZE, size);
            for (int i = 0; i < size; i++) {
                CredentialOption credentialOption = providerGetCredentialRequest.getCredentialOptions().get(i);
                bundle.putString(lhg.a(i, "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_"), credentialOption.getType());
                bundle.putBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i, credentialOption.getCandidateQueryData());
                bundle.putBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX + i, credentialOption.getRequestData());
                bundle.putBoolean(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX + i, credentialOption.isSystemProviderRequired());
                bundle.putParcelableArray(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX + i, (Parcelable[]) credentialOption.getAllowedProviders().toArray(new ComponentName[0]));
            }
            CallingAppInfo.Companion.setCallingAppInfo$credentials_release(bundle, providerGetCredentialRequest.getCallingAppInfo());
            return bundle;
        }

        public final ProviderGetCredentialRequest createFrom$credentials_release(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle) {
            return new ProviderGetCredentialRequest(list, callingAppInfo, biometricPromptResult, bundle);
        }

        public final ProviderGetCredentialRequest fromBundle(Bundle bundle) {
            Set<ComponentName> set;
            Parcelable[] parcelableArray;
            CallingAppInfo extractCallingAppInfo$credentials_release = CallingAppInfo.Companion.extractCallingAppInfo$credentials_release(bundle);
            if (extractCallingAppInfo$credentials_release == null) {
                throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            int i = bundle.getInt(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_SIZE, -1);
            if (i < 0) {
                throw new IllegalArgumentException(uqi.a("Bundle had invalid option size as ", i, JwtParser.SEPARATOR_CHAR));
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                String string = bundle.getString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_" + i2);
                if (string == null) {
                    throw new IllegalArgumentException(uqi.a("Bundle was missing option type at index ", i, JwtParser.SEPARATOR_CHAR));
                }
                Bundle bundle2 = bundle.getBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_PREFIX + i2);
                if (bundle2 == null) {
                    throw new IllegalArgumentException(uqi.a("Bundle was missing candidate query data at index ", i, JwtParser.SEPARATOR_CHAR));
                }
                Bundle bundle3 = bundle.getBundle(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_CREDENTIAL_RETRIEVAL_DATA_PREFIX + i2);
                if (bundle3 == null) {
                    throw new IllegalArgumentException(uqi.a("Bundle was missing request data at index ", i, JwtParser.SEPARATOR_CHAR));
                }
                boolean z = bundle.getBoolean(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_IS_SYSTEM_PROVIDER_REQUIRED_PREFIX + i2, false);
                try {
                    parcelableArray = bundle.getParcelableArray(ProviderGetCredentialRequest.EXTRA_CREDENTIAL_OPTION_ALLOWED_PROVIDERS_PREFIX + i2);
                } catch (Exception unused) {
                    set = EmptySet.b;
                }
                if (parcelableArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        ComponentName componentName = (ComponentName) parcelable;
                        if (componentName != null) {
                            arrayList2.add(componentName);
                        }
                    }
                    set = j5g.S0(arrayList2);
                    if (set != null) {
                        arrayList.add(CredentialOption.Companion.createFrom(string, bundle3, bundle2, z, set));
                    }
                }
                set = EmptySet.b;
                arrayList.add(CredentialOption.Companion.createFrom(string, bundle3, bundle2, z, set));
            }
            return createFrom$credentials_release(arrayList, extractCallingAppInfo$credentials_release, null, bundle);
        }

        private Companion() {
        }
    }

    public ProviderGetCredentialRequest(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo) {
        this(list, callingAppInfo, null, 4, null);
    }

    public static final Bundle asBundle(ProviderGetCredentialRequest providerGetCredentialRequest) {
        return Companion.asBundle(providerGetCredentialRequest);
    }

    public static final ProviderGetCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final List<CredentialOption> getCredentialOptions() {
        return this.credentialOptions;
    }

    public final Bundle getSourceBundle() {
        return this.sourceBundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProviderGetCredentialRequest(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, Bundle bundle) {
        this.credentialOptions = list;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
        this.sourceBundle = bundle;
    }

    public /* synthetic */ ProviderGetCredentialRequest(List list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, int i, zcl zclVar) {
        this(list, callingAppInfo, (i & 4) != 0 ? null : biometricPromptResult);
    }

    public ProviderGetCredentialRequest(List<? extends CredentialOption> list, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult) {
        this(list, callingAppInfo, biometricPromptResult, null);
    }
}
