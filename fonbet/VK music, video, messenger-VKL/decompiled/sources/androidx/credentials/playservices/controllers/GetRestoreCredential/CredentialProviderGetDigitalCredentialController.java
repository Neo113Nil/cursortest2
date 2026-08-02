package androidx.credentials.playservices.controllers.GetRestoreCredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.DigitalCredential;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetDigitalCredentialOption;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.internal.ConversionUtilsKt;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.IdentityCredentialApiHiddenActivity;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.provider.PendingIntentHandler;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.identitycredentials.GetCredentialResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.internal.identity_credentials.zze;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import xsna.ahx;
import xsna.chx;
import xsna.dhx;
import xsna.f5o0;
import xsna.gzs;
import xsna.izs;
import xsna.ms9;
import xsna.s3q0;
import xsna.wzs;
import xsna.zcl;

/* compiled from: CredentialProviderGetDigitalCredentialController.kt */
/* loaded from: classes12.dex */
public final class CredentialProviderGetDigitalCredentialController extends CredentialProviderController<GetCredentialRequest, com.google.android.gms.identitycredentials.GetCredentialRequest, GetCredentialResponse, androidx.credentials.GetCredentialResponse, GetCredentialException> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DigitalCredentialClient";
    public CredentialManagerCallback<androidx.credentials.GetCredentialResponse, GetCredentialException> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetDigitalCredentialController$resultReceiver$1 resultReceiver;

    /* compiled from: CredentialProviderGetDigitalCredentialController.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1] */
    public CredentialProviderGetDigitalCredentialController(Context context) {
        super(context);
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = CredentialProviderGetDigitalCredentialController.this;
                CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = CredentialProviderGetDigitalCredentialController.this.getExecutor();
                CredentialManagerCallback<androidx.credentials.GetCredentialResponse, GetCredentialException> callback = CredentialProviderGetDigitalCredentialController.this.getCallback();
                cancellationSignal = CredentialProviderGetDigitalCredentialController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderGetDigitalCredentialController.maybeReportErrorFromResultReceiver(bundle, credentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderGetDigitalCredentialController.this.handleResponse$credentials_play_services_auth_release(bundle.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i, (Intent) bundle.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final GetCredentialException fromGmsException(Throwable th) {
        if (th instanceof com.google.android.gms.identitycredentials.GetCredentialException) {
            return ConversionUtilsKt.toJetpackGetException(((com.google.android.gms.identitycredentials.GetCredentialException) th).d(), th.getMessage());
        }
        if (!(th instanceof ApiException)) {
            return new GetCredentialUnknownException(ms9.b("Get digital credential failed, failure: ", th));
        }
        int g = ((ApiException) th).g();
        return g == 16 ? new GetCredentialCancellationException(th.getMessage()) : CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(g)) ? new GetCredentialInterruptedException(th.getMessage()) : new GetCredentialUnknownException(ms9.b("Get digital credential failed, failure: ", th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception exc) {
        CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderGetDigitalCredentialController$invokePlayServices$2$1(executor, credentialManagerCallback, credentialProviderGetDigitalCredentialController.fromGmsException(exc)));
    }

    public final CredentialManagerCallback<androidx.credentials.GetCredentialResponse, GetCredentialException> getCallback() {
        CredentialManagerCallback<androidx.credentials.GetCredentialResponse, GetCredentialException> credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        return null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        return null;
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release();
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeGet(i2, new wzs<CancellationSignal, gzs<? extends s3q0>, s3q0>() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$handleResponse$1
            @Override // xsna.wzs
            public /* bridge */ /* synthetic */ s3q0 invoke(CancellationSignal cancellationSignal, gzs<? extends s3q0> gzsVar) {
                invoke2(cancellationSignal, (gzs<s3q0>) gzsVar);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CancellationSignal cancellationSignal, gzs<s3q0> gzsVar) {
                CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
                CredentialProviderController.cancelOrCallbackExceptionOrResult(cancellationSignal, gzsVar);
            }
        }, new CredentialProviderGetDigitalCredentialController$handleResponse$2(this), this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$3(this));
            return;
        }
        PendingIntentHandler.Companion companion2 = PendingIntentHandler.Companion;
        androidx.credentials.GetCredentialResponse retrieveGetCredentialResponse = companion2.retrieveGetCredentialResponse(intent);
        if (retrieveGetCredentialResponse != null) {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$4(this, retrieveGetCredentialResponse));
        } else {
            CredentialProviderController.cancelOrCallbackExceptionOrResult(this.cancellationSignal, new CredentialProviderGetDigitalCredentialController$handleResponse$5(this, companion2.retrieveGetCredentialException(intent)));
        }
    }

    public final void setCallback(CredentialManagerCallback<androidx.credentials.GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        this.callback = credentialManagerCallback;
    }

    public final void setExecutor(Executor executor) {
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public com.google.android.gms.identitycredentials.GetCredentialRequest convertRequestToPlayServices(GetCredentialRequest getCredentialRequest) {
        ArrayList arrayList = new ArrayList();
        for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
            if (credentialOption instanceof GetDigitalCredentialOption) {
                arrayList.add(new com.google.android.gms.identitycredentials.CredentialOption(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData(), ((GetDigitalCredentialOption) credentialOption).getRequestJson(), "", ""));
            }
        }
        return new com.google.android.gms.identitycredentials.GetCredentialRequest(arrayList, GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest), getCredentialRequest.getOrigin(), new ResultReceiver(null));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public androidx.credentials.GetCredentialResponse convertResponseToCredentialManager(GetCredentialResponse getCredentialResponse) {
        return new androidx.credentials.GetCredentialResponse(Credential.Companion.createFrom(DigitalCredential.TYPE_DIGITAL_CREDENTIAL, getCredentialResponse.b.c));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(GetCredentialRequest getCredentialRequest, final CredentialManagerCallback<androidx.credentials.GetCredentialResponse, GetCredentialException> credentialManagerCallback, final Executor executor, final CancellationSignal cancellationSignal) {
        this.cancellationSignal = cancellationSignal;
        setCallback(credentialManagerCallback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        com.google.android.gms.identitycredentials.GetCredentialRequest convertRequestToPlayServices = convertRequestToPlayServices(getCredentialRequest);
        chx chxVar = new chx(this.context, dhx.a, a.d.U6, b.a.c);
        f5o0.a a = f5o0.a();
        a.d = new Feature[]{zze.zza};
        ahx ahxVar = new ahx();
        ahxVar.b = convertRequestToPlayServices;
        a.a = ahxVar;
        a.e = 32701;
        Task<TResult> doRead = chxVar.doRead(a.a());
        final izs<PendingGetCredentialHandle, s3q0> izsVar = new izs<PendingGetCredentialHandle, s3q0>() { // from class: androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController$invokePlayServices$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(PendingGetCredentialHandle pendingGetCredentialHandle) {
                invoke2(pendingGetCredentialHandle);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PendingGetCredentialHandle pendingGetCredentialHandle) {
                Context context;
                CredentialProviderGetDigitalCredentialController$resultReceiver$1 credentialProviderGetDigitalCredentialController$resultReceiver$1;
                Context context2;
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                    return;
                }
                context = this.context;
                Intent intent = new Intent(context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
                intent.setFlags(65536);
                CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController = this;
                credentialProviderGetDigitalCredentialController$resultReceiver$1 = credentialProviderGetDigitalCredentialController.resultReceiver;
                intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, credentialProviderGetDigitalCredentialController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController$resultReceiver$1));
                intent.putExtra(CredentialProviderBaseController.EXTRA_GET_CREDENTIAL_INTENT, pendingGetCredentialHandle.b);
                context2 = this.context;
                context2.startActivity(intent);
            }
        };
        doRead.addOnSuccessListener(new OnSuccessListener() { // from class: xsna.hdk
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                izs.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: xsna.idk
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$1(CredentialProviderGetDigitalCredentialController.this, cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getResultReceiver$annotations() {
    }
}
