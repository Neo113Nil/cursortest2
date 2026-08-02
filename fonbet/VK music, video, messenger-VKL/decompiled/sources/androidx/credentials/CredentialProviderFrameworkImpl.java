package androidx.credentials;

import android.annotation.SuppressLint;
import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.credentials.PrepareGetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.ClearCredentialUnsupportedException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.internal.ConversionUtilsKt;
import java.util.concurrent.Executor;
import xsna.c52;
import xsna.gzs;
import xsna.j92;
import xsna.k92;
import xsna.l92;
import xsna.m92;
import xsna.n92;
import xsna.na1;
import xsna.o92;
import xsna.s3q0;
import xsna.s92;
import xsna.t92;
import xsna.v92;
import xsna.w92;
import xsna.x92;
import xsna.y92;
import xsna.ya1;
import xsna.zcl;

/* compiled from: CredentialProviderFrameworkImpl.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderFrameworkImpl implements CredentialProvider {
    private static final String CREATE_DOM_EXCEPTION_PREFIX = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";
    private static final Companion Companion = new Companion(null);
    private static final String GET_DOM_EXCEPTION_PREFIX = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";
    private static final String TAG = "CredManProvService";
    private final android.credentials.CredentialManager credentialManager;

    /* compiled from: CredentialProviderFrameworkImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CredentialProviderFrameworkImpl(Context context) {
        this.credentialManager = na1.a(context.getSystemService("credential"));
    }

    private final android.credentials.CreateCredentialRequest convertCreateRequestToFrameworkClass(CreateCredentialRequest createCredentialRequest, Context context) {
        CreateCredentialRequest.Builder isSystemProviderRequired;
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider;
        android.credentials.CreateCredentialRequest build;
        o92.h();
        isSystemProviderRequired = n92.b(createCredentialRequest.getType(), ConversionUtilsKt.getFinalCreateCredentialData(createCredentialRequest, context), createCredentialRequest.getCandidateQueryData()).setIsSystemProviderRequired(createCredentialRequest.isSystemProviderRequired());
        alwaysSendAppInfoToProvider = isSystemProviderRequired.setAlwaysSendAppInfoToProvider(true);
        setOriginForCreateRequest(createCredentialRequest, alwaysSendAppInfoToProvider);
        build = alwaysSendAppInfoToProvider.build();
        return build;
    }

    private final android.credentials.GetCredentialRequest convertGetRequestToFrameworkClass(GetCredentialRequest getCredentialRequest) {
        android.credentials.GetCredentialRequest build;
        CredentialOption.Builder isSystemProviderRequired;
        CredentialOption.Builder allowedProviders;
        android.credentials.CredentialOption build2;
        ya1.h();
        GetCredentialRequest.Builder b = k92.b(GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest));
        for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
            m92.g();
            isSystemProviderRequired = l92.c(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.isSystemProviderRequired());
            allowedProviders = isSystemProviderRequired.setAllowedProviders(credentialOption.getAllowedProviders());
            build2 = allowedProviders.build();
            b.addCredentialOption(build2);
        }
        setOriginForGetRequest(getCredentialRequest, b);
        build = b.build();
        return build;
    }

    private final android.credentials.ClearCredentialStateRequest createFrameworkClearCredentialRequest() {
        j92.g();
        return c52.b(new Bundle());
    }

    private final boolean isCredmanDisabled(gzs<s3q0> gzsVar) {
        if (this.credentialManager != null) {
            return false;
        }
        gzsVar.invoke();
        return true;
    }

    @SuppressLint({"MissingPermission"})
    private final void setOriginForCreateRequest(CreateCredentialRequest createCredentialRequest, CreateCredentialRequest.Builder builder) {
        if (createCredentialRequest.getOrigin() != null) {
            builder.setOrigin(createCredentialRequest.getOrigin());
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void setOriginForGetRequest(GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
        if (getCredentialRequest.getOrigin() != null) {
            builder.setOrigin(getCredentialRequest.getOrigin());
        }
    }

    public final GetCredentialResponse convertGetResponseToJetpackClass$credentials_release(android.credentials.GetCredentialResponse getCredentialResponse) {
        android.credentials.Credential credential;
        String type;
        Bundle data;
        credential = getCredentialResponse.getCredential();
        Credential.Companion companion = Credential.Companion;
        type = credential.getType();
        data = credential.getData();
        return new GetCredentialResponse(companion.createFrom(type, data));
    }

    public final PrepareGetCredentialResponse convertPrepareGetResponseToJetpackClass$credentials_release(android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse) {
        PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle;
        pendingGetCredentialHandle = prepareGetCredentialResponse.getPendingGetCredentialHandle();
        return new PrepareGetCredentialResponse.Builder().setFrameworkResponse(prepareGetCredentialResponse).setPendingGetCredentialHandle(new PrepareGetCredentialResponse.PendingGetCredentialHandle(pendingGetCredentialHandle)).build();
    }

    public final CreateCredentialException convertToJetpackCreateException$credentials_release(android.credentials.CreateCredentialException createCredentialException) {
        String type;
        String message;
        type = createCredentialException.getType();
        message = createCredentialException.getMessage();
        return ConversionUtilsKt.toJetpackCreateException(type, message);
    }

    public final GetCredentialException convertToJetpackGetException$credentials_release(android.credentials.GetCredentialException getCredentialException) {
        String type;
        String message;
        type = getCredentialException.getType();
        message = getCredentialException.getMessage();
        return ConversionUtilsKt.toJetpackGetException(type, message);
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    @Override // androidx.credentials.CredentialProvider
    public void onClearCredential(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
        if (isCredmanDisabled(new gzs<s3q0>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onClearCredential$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                credentialManagerCallback.onError(new ClearCredentialUnsupportedException("Your device doesn't support credential manager"));
            }
        })) {
            return;
        }
        this.credentialManager.clearCredentialState(createFrameworkClearCredentialRequest(), cancellationSignal, executor, new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onClearCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(s92.a(th));
            }

            public void onError(ClearCredentialStateException clearCredentialStateException) {
                credentialManagerCallback.onError(new ClearCredentialUnknownException(null, 1, null));
            }

            public void onResult(Void r2) {
                credentialManagerCallback.onResult(r2);
            }
        });
    }

    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(Context context, final CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        if (isCredmanDisabled(new gzs<s3q0>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                credentialManagerCallback.onError(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
            }
        })) {
            return;
        }
        this.credentialManager.createCredential(context, convertCreateRequestToFrameworkClass(createCredentialRequest, context), cancellationSignal, executor, new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(t92.b(th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(v92.b(obj));
            }

            public void onError(android.credentials.CreateCredentialException createCredentialException) {
                credentialManagerCallback.onError(this.convertToJetpackCreateException$credentials_release(createCredentialException));
            }

            public void onResult(android.credentials.CreateCredentialResponse createCredentialResponse) {
                Bundle data;
                CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback2 = credentialManagerCallback;
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.Companion;
                String type = createCredentialRequest.getType();
                data = createCredentialResponse.getData();
                credentialManagerCallback2.onResult(companion.createFrom(type, data));
            }
        });
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        if (isCredmanDisabled(new gzs<s3q0>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            }
        })) {
            return;
        }
        this.credentialManager.getCredential(context, pendingGetCredentialHandle.getFrameworkHandle(), cancellationSignal, executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>) new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(x92.a(th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(w92.a(obj));
            }

            public void onError(android.credentials.GetCredentialException getCredentialException) {
                credentialManagerCallback.onError(this.convertToJetpackGetException$credentials_release(getCredentialException));
            }

            public void onResult(android.credentials.GetCredentialResponse getCredentialResponse) {
                credentialManagerCallback.onResult(this.convertGetResponseToJetpackClass$credentials_release(getCredentialResponse));
            }
        });
    }

    @Override // androidx.credentials.CredentialProvider
    public void onPrepareCredential(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        if (isCredmanDisabled(new gzs<s3q0>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onPrepareCredential$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            }
        })) {
            return;
        }
        this.credentialManager.prepareGetCredential(convertGetRequestToFrameworkClass(getCredentialRequest), cancellationSignal, executor, new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1
            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(x92.a(th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(y92.a(obj));
            }

            public void onError(android.credentials.GetCredentialException getCredentialException) {
                credentialManagerCallback.onError(this.convertToJetpackGetException$credentials_release(getCredentialException));
            }

            public void onResult(android.credentials.PrepareGetCredentialResponse prepareGetCredentialResponse) {
                credentialManagerCallback.onResult(this.convertPrepareGetResponseToJetpackClass$credentials_release(prepareGetCredentialResponse));
            }
        });
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        if (isCredmanDisabled(new gzs<s3q0>() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
            }
        })) {
            return;
        }
        this.credentialManager.getCredential(context, convertGetRequestToFrameworkClass(getCredentialRequest), cancellationSignal, executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, android.credentials.GetCredentialException>) new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$2
            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(x92.a(th));
            }

            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(w92.a(obj));
            }

            public void onError(android.credentials.GetCredentialException getCredentialException) {
                credentialManagerCallback.onError(this.convertToJetpackGetException$credentials_release(getCredentialException));
            }

            public void onResult(android.credentials.GetCredentialResponse getCredentialResponse) {
                credentialManagerCallback.onResult(this.convertGetResponseToJetpackClass$credentials_release(getCredentialResponse));
            }
        });
    }
}
