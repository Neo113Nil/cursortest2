package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.service.credentials.CreateCredentialRequest;
import android.service.credentials.GetCredentialRequest;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.internal.ConversionUtilsKt;
import androidx.credentials.provider.BeginGetCredentialRequest;
import androidx.credentials.provider.BeginGetCredentialResponse;
import androidx.credentials.provider.ProviderCreateCredentialRequest;
import androidx.credentials.provider.ProviderGetCredentialRequest;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.List;
import java.util.stream.Collectors;
import xsna.izs;
import xsna.pi7;
import xsna.zcl;

/* compiled from: PendingIntentHandler.kt */
/* loaded from: classes12.dex */
public final class PendingIntentHandler {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PendingIntentHandler";

    /* compiled from: PendingIntentHandler.kt */
    @SuppressLint({"ObsoleteSdkInt"})
    public static final class Api23Impl {
        public static final Companion Companion = new Companion(null);
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST";
        private static final String EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE";
        private static final String EXTRA_CREATE_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION";
        private static final String EXTRA_CREATE_CREDENTIAL_REQUEST = "android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST";
        private static final String EXTRA_CREATE_CREDENTIAL_RESPONSE = "android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE";
        private static final String EXTRA_GET_CREDENTIAL_EXCEPTION = "android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION";
        private static final String EXTRA_GET_CREDENTIAL_REQUEST = "android.service.credentials.extra.GET_CREDENTIAL_REQUEST";
        private static final String EXTRA_GET_CREDENTIAL_RESPONSE = "android.service.credentials.extra.GET_CREDENTIAL_RESPONSE";

        /* compiled from: PendingIntentHandler.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            public final BeginGetCredentialResponse extractBeginGetCredentialResponse(Intent intent) {
                BeginGetCredentialResponse.Companion companion = BeginGetCredentialResponse.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final CreateCredentialException extractCreateCredentialException(Intent intent) {
                CreateCredentialException.Companion companion = CreateCredentialException.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_EXCEPTION);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final CreateCredentialResponse extractCreateCredentialResponse(Intent intent) {
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final GetCredentialException extractGetCredentialException(Intent intent) {
                GetCredentialException.Companion companion = GetCredentialException.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_EXCEPTION);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
                GetCredentialResponse.Companion companion = GetCredentialResponse.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_RESPONSE);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
                BeginGetCredentialRequest.Companion companion = BeginGetCredentialRequest.Companion;
                Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_REQUEST);
                if (bundleExtra == null) {
                    return null;
                }
                return companion.fromBundle(bundleExtra);
            }

            public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
                try {
                    ProviderCreateCredentialRequest.Companion companion = ProviderCreateCredentialRequest.Companion;
                    Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_REQUEST);
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
                try {
                    ProviderGetCredentialRequest.Companion companion = ProviderGetCredentialRequest.Companion;
                    Bundle bundleExtra = intent.getBundleExtra(Api23Impl.EXTRA_GET_CREDENTIAL_REQUEST);
                    if (bundleExtra == null) {
                        return null;
                    }
                    return companion.fromBundle(bundleExtra);
                } catch (Exception unused) {
                    return null;
                }
            }

            public final void setBeginGetCredentialRequest(Intent intent, BeginGetCredentialRequest beginGetCredentialRequest) {
                intent.putExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_REQUEST, BeginGetCredentialRequest.Companion.asBundle(beginGetCredentialRequest));
            }

            public final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
                intent.putExtra(Api23Impl.EXTRA_BEGIN_GET_CREDENTIAL_RESPONSE, BeginGetCredentialResponse.Companion.asBundle(beginGetCredentialResponse));
            }

            public final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_EXCEPTION, CreateCredentialException.Companion.asBundle(createCredentialException));
            }

            public final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_RESPONSE, CreateCredentialResponse.Companion.asBundle(createCredentialResponse));
            }

            public final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_EXCEPTION, GetCredentialException.Companion.asBundle(getCredentialException));
            }

            public final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) {
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_RESPONSE, GetCredentialResponse.Companion.asBundle(getCredentialResponse));
            }

            public final void setProviderCreateCredentialRequest(Intent intent, ProviderCreateCredentialRequest providerCreateCredentialRequest) {
                intent.putExtra(Api23Impl.EXTRA_CREATE_CREDENTIAL_REQUEST, ProviderCreateCredentialRequest.Companion.asBundle(providerCreateCredentialRequest));
            }

            public final void setProviderGetCredentialRequest(Intent intent, ProviderGetCredentialRequest providerGetCredentialRequest) {
                intent.putExtra(Api23Impl.EXTRA_GET_CREDENTIAL_REQUEST, ProviderGetCredentialRequest.Companion.asBundle(providerGetCredentialRequest));
            }

            private Companion() {
            }
        }

        public static final BeginGetCredentialResponse extractBeginGetCredentialResponse(Intent intent) {
            return Companion.extractBeginGetCredentialResponse(intent);
        }

        public static final CreateCredentialException extractCreateCredentialException(Intent intent) {
            return Companion.extractCreateCredentialException(intent);
        }

        public static final CreateCredentialResponse extractCreateCredentialResponse(Intent intent) {
            return Companion.extractCreateCredentialResponse(intent);
        }

        public static final GetCredentialException extractGetCredentialException(Intent intent) {
            return Companion.extractGetCredentialException(intent);
        }

        public static final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
            return Companion.extractGetCredentialResponse(intent);
        }

        public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
            return Companion.retrieveBeginGetCredentialRequest(intent);
        }

        public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
            return Companion.retrieveProviderCreateCredentialRequest(intent);
        }

        public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
            return Companion.retrieveProviderGetCredentialRequest(intent);
        }

        public static final void setBeginGetCredentialRequest(Intent intent, BeginGetCredentialRequest beginGetCredentialRequest) {
            Companion.setBeginGetCredentialRequest(intent, beginGetCredentialRequest);
        }

        public static final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
            Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        public static final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
            Companion.setCreateCredentialException(intent, createCredentialException);
        }

        public static final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
            Companion.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        public static final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
            Companion.setGetCredentialException(intent, getCredentialException);
        }

        public static final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) {
            Companion.setGetCredentialResponse(intent, getCredentialResponse);
        }

        public static final void setProviderCreateCredentialRequest(Intent intent, ProviderCreateCredentialRequest providerCreateCredentialRequest) {
            Companion.setProviderCreateCredentialRequest(intent, providerCreateCredentialRequest);
        }

        public static final void setProviderGetCredentialRequest(Intent intent, ProviderGetCredentialRequest providerGetCredentialRequest) {
            Companion.setProviderGetCredentialRequest(intent, providerGetCredentialRequest);
        }
    }

    /* compiled from: PendingIntentHandler.kt */
    public static final class Api34Impl {
        public static final Companion Companion = new Companion(null);

        /* compiled from: PendingIntentHandler.kt */
        public static final class Companion {
            public /* synthetic */ Companion(zcl zclVar) {
                this();
            }

            private final BiometricPromptResult retrieveBiometricPromptResult(Intent intent, String str, String str2, String str3) {
                if (intent.getExtras() == null) {
                    return null;
                }
                if (intent.getExtras().containsKey(str)) {
                    return new BiometricPromptResult(new AuthenticationResult(intent.getExtras().getInt(str)));
                }
                if (!intent.getExtras().containsKey(str2)) {
                    return null;
                }
                int i = intent.getExtras().getInt(str2);
                Bundle extras = intent.getExtras();
                return new BiometricPromptResult(new AuthenticationError(i, extras != null ? extras.getCharSequence(str3) : null));
            }

            public static /* synthetic */ BiometricPromptResult retrieveBiometricPromptResult$default(Companion companion, Intent intent, String str, String str2, String str3, int i, Object obj) {
                if ((i & 2) != 0) {
                    str = AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE;
                }
                if ((i & 4) != 0) {
                    str2 = AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR;
                }
                if ((i & 8) != 0) {
                    str3 = AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE;
                }
                return companion.retrieveBiometricPromptResult(intent, str, str2, str3);
            }

            private final BiometricPromptResult retrieveBiometricPromptResultFallback(Intent intent) {
                if (intent.getExtras() == null) {
                    return null;
                }
                if (intent.getExtras().containsKey(AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK) || intent.getExtras().containsKey(AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK)) {
                    return retrieveBiometricPromptResult(intent, AuthenticationResult.EXTRA_BIOMETRIC_AUTH_RESULT_TYPE_FALLBACK, AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_FALLBACK, AuthenticationError.EXTRA_BIOMETRIC_AUTH_ERROR_MESSAGE_FALLBACK);
                }
                return null;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CredentialOption retrieveProviderGetCredentialRequest$lambda$1(izs izsVar, Object obj) {
                return (CredentialOption) izsVar.invoke(obj);
            }

            public final CreateCredentialException extractCreateCredentialException(Intent intent) {
                android.credentials.CreateCredentialException createCredentialException = (android.credentials.CreateCredentialException) intent.getSerializableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
                if (createCredentialException == null) {
                    return null;
                }
                return ConversionUtilsKt.toJetpackCreateException(createCredentialException.getType(), createCredentialException.getMessage());
            }

            public final CreateCredentialResponse extractCreateCredentialResponse(String str, Intent intent) {
                android.credentials.CreateCredentialResponse createCredentialResponse = (android.credentials.CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", android.credentials.CreateCredentialResponse.class);
                if (createCredentialResponse == null) {
                    return null;
                }
                return CreateCredentialResponse.Companion.createFrom(str, createCredentialResponse.getData());
            }

            public final GetCredentialException extractGetCredentialException(Intent intent) {
                android.credentials.GetCredentialException getCredentialException = (android.credentials.GetCredentialException) intent.getSerializableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
                if (getCredentialException == null) {
                    return null;
                }
                return ConversionUtilsKt.toJetpackGetException(getCredentialException.getType(), getCredentialException.getMessage());
            }

            public final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
                android.credentials.GetCredentialResponse getCredentialResponse = (android.credentials.GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", android.credentials.GetCredentialResponse.class);
                if (getCredentialResponse == null) {
                    return null;
                }
                return new GetCredentialResponse(Credential.Companion.createFrom(getCredentialResponse.getCredential()));
            }

            public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
                android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_REQUEST", android.service.credentials.BeginGetCredentialRequest.class);
                if (beginGetCredentialRequest != null) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackRequest$credentials_release(beginGetCredentialRequest);
                }
                return null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
                CreateCredentialRequest createCredentialRequest = (CreateCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_REQUEST", CreateCredentialRequest.class);
                if (createCredentialRequest == 0) {
                    return (ProviderCreateCredentialRequest) createCredentialRequest;
                }
                BiometricPromptResult retrieveBiometricPromptResult$default = retrieveBiometricPromptResult$default(this, intent, null, null, null, 14, null);
                if (retrieveBiometricPromptResult$default == null) {
                    retrieveBiometricPromptResult$default = retrieveBiometricPromptResultFallback(intent);
                }
                try {
                    return new ProviderCreateCredentialRequest(androidx.credentials.CreateCredentialRequest.Companion.createFrom(createCredentialRequest.getType(), createCredentialRequest.getData(), createCredentialRequest.getData(), false, createCredentialRequest.getCallingAppInfo().getOrigin()), CallingAppInfo.Companion.create(createCredentialRequest.getCallingAppInfo().getPackageName(), createCredentialRequest.getCallingAppInfo().getSigningInfo(), createCredentialRequest.getCallingAppInfo().getOrigin()), retrieveBiometricPromptResult$default);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
            }

            public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_REQUEST", GetCredentialRequest.class);
                if (getCredentialRequest == null) {
                    return null;
                }
                BiometricPromptResult retrieveBiometricPromptResult$default = retrieveBiometricPromptResult$default(this, intent, null, null, null, 14, null);
                if (retrieveBiometricPromptResult$default == null) {
                    retrieveBiometricPromptResult$default = retrieveBiometricPromptResultFallback(intent);
                }
                return ProviderGetCredentialRequest.Companion.createFrom$credentials_release((List) getCredentialRequest.getCredentialOptions().stream().map(new pi7(new izs<android.credentials.CredentialOption, CredentialOption>() { // from class: androidx.credentials.provider.PendingIntentHandler$Api34Impl$Companion$retrieveProviderGetCredentialRequest$1
                    @Override // xsna.izs
                    public final CredentialOption invoke(android.credentials.CredentialOption credentialOption) {
                        return CredentialOption.Companion.createFrom(credentialOption.getType(), credentialOption.getCredentialRetrievalData(), credentialOption.getCandidateQueryData(), credentialOption.isSystemProviderRequired(), credentialOption.getAllowedProviders());
                    }
                }, 1)).collect(Collectors.toList()), CallingAppInfo.Companion.create(getCredentialRequest.getCallingAppInfo().getPackageName(), getCredentialRequest.getCallingAppInfo().getSigningInfo(), getCredentialRequest.getCallingAppInfo().getOrigin()), retrieveBiometricPromptResult$default, intent.getExtras());
            }

            public final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
                intent.putExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", BeginGetCredentialUtil.Companion.convertToFrameworkResponse(beginGetCredentialResponse));
            }

            public final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", new android.credentials.CreateCredentialException(createCredentialException.getType(), createCredentialException.getMessage()));
            }

            public final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
                intent.putExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", new android.credentials.CreateCredentialResponse(createCredentialResponse.getData()));
            }

            public final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", new android.credentials.GetCredentialException(getCredentialException.getType(), getCredentialException.getMessage()));
            }

            public final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) {
                intent.putExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", new android.credentials.GetCredentialResponse(new android.credentials.Credential(getCredentialResponse.getCredential().getType(), getCredentialResponse.getCredential().getData())));
            }

            private Companion() {
            }
        }

        public static final CreateCredentialException extractCreateCredentialException(Intent intent) {
            return Companion.extractCreateCredentialException(intent);
        }

        public static final CreateCredentialResponse extractCreateCredentialResponse(String str, Intent intent) {
            return Companion.extractCreateCredentialResponse(str, intent);
        }

        public static final GetCredentialException extractGetCredentialException(Intent intent) {
            return Companion.extractGetCredentialException(intent);
        }

        public static final GetCredentialResponse extractGetCredentialResponse(Intent intent) {
            return Companion.extractGetCredentialResponse(intent);
        }

        public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
            return Companion.retrieveBeginGetCredentialRequest(intent);
        }

        public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
            return Companion.retrieveProviderCreateCredentialRequest(intent);
        }

        public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
            return Companion.retrieveProviderGetCredentialRequest(intent);
        }

        public static final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
            Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
        }

        public static final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
            Companion.setCreateCredentialException(intent, createCredentialException);
        }

        public static final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
            Companion.setCreateCredentialResponse(intent, createCredentialResponse);
        }

        public static final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
            Companion.setGetCredentialException(intent, getCredentialException);
        }

        public static final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) {
            Companion.setGetCredentialResponse(intent, getCredentialResponse);
        }
    }

    /* compiled from: PendingIntentHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.retrieveBeginGetCredentialRequest(intent) : Api23Impl.Companion.retrieveBeginGetCredentialRequest(intent);
        }

        public final CreateCredentialException retrieveCreateCredentialException(Intent intent) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractCreateCredentialException(intent) : Api23Impl.Companion.extractCreateCredentialException(intent);
        }

        public final CreateCredentialResponse retrieveCreateCredentialResponse(String str, Intent intent) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractCreateCredentialResponse(str, intent) : Api23Impl.Companion.extractCreateCredentialResponse(intent);
        }

        public final GetCredentialException retrieveGetCredentialException(Intent intent) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractGetCredentialException(intent) : Api23Impl.Companion.extractGetCredentialException(intent);
        }

        public final GetCredentialResponse retrieveGetCredentialResponse(Intent intent) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.extractGetCredentialResponse(intent) : Api23Impl.Companion.extractGetCredentialResponse(intent);
        }

        public final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.retrieveProviderCreateCredentialRequest(intent) : Api23Impl.Companion.retrieveProviderCreateCredentialRequest(intent);
        }

        public final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
            return Build.VERSION.SDK_INT >= 34 ? Api34Impl.Companion.retrieveProviderGetCredentialRequest(intent) : Api23Impl.Companion.retrieveProviderGetCredentialRequest(intent);
        }

        public final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
            } else {
                Api23Impl.Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
            }
        }

        public final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setCreateCredentialException(intent, createCredentialException);
            } else {
                Api23Impl.Companion.setCreateCredentialException(intent, createCredentialException);
            }
        }

        public final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setCreateCredentialResponse(intent, createCredentialResponse);
            } else {
                Api23Impl.Companion.setCreateCredentialResponse(intent, createCredentialResponse);
            }
        }

        public final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setGetCredentialException(intent, getCredentialException);
            } else {
                Api23Impl.Companion.setGetCredentialException(intent, getCredentialException);
            }
        }

        public final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) {
            if (Build.VERSION.SDK_INT >= 34) {
                Api34Impl.Companion.setGetCredentialResponse(intent, getCredentialResponse);
            } else {
                Api23Impl.Companion.setGetCredentialResponse(intent, getCredentialResponse);
            }
        }

        private Companion() {
        }
    }

    public static final BeginGetCredentialRequest retrieveBeginGetCredentialRequest(Intent intent) {
        return Companion.retrieveBeginGetCredentialRequest(intent);
    }

    public static final CreateCredentialException retrieveCreateCredentialException(Intent intent) {
        return Companion.retrieveCreateCredentialException(intent);
    }

    public static final CreateCredentialResponse retrieveCreateCredentialResponse(String str, Intent intent) {
        return Companion.retrieveCreateCredentialResponse(str, intent);
    }

    public static final GetCredentialException retrieveGetCredentialException(Intent intent) {
        return Companion.retrieveGetCredentialException(intent);
    }

    public static final GetCredentialResponse retrieveGetCredentialResponse(Intent intent) {
        return Companion.retrieveGetCredentialResponse(intent);
    }

    public static final ProviderCreateCredentialRequest retrieveProviderCreateCredentialRequest(Intent intent) {
        return Companion.retrieveProviderCreateCredentialRequest(intent);
    }

    public static final ProviderGetCredentialRequest retrieveProviderGetCredentialRequest(Intent intent) {
        return Companion.retrieveProviderGetCredentialRequest(intent);
    }

    public static final void setBeginGetCredentialResponse(Intent intent, BeginGetCredentialResponse beginGetCredentialResponse) {
        Companion.setBeginGetCredentialResponse(intent, beginGetCredentialResponse);
    }

    public static final void setCreateCredentialException(Intent intent, CreateCredentialException createCredentialException) {
        Companion.setCreateCredentialException(intent, createCredentialException);
    }

    public static final void setCreateCredentialResponse(Intent intent, CreateCredentialResponse createCredentialResponse) {
        Companion.setCreateCredentialResponse(intent, createCredentialResponse);
    }

    public static final void setGetCredentialException(Intent intent, GetCredentialException getCredentialException) {
        Companion.setGetCredentialException(intent, getCredentialException);
    }

    public static final void setGetCredentialResponse(Intent intent, GetCredentialResponse getCredentialResponse) {
        Companion.setGetCredentialResponse(intent, getCredentialResponse);
    }
}
