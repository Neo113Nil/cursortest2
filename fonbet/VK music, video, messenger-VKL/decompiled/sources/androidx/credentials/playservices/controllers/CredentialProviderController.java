package androidx.credentials.playservices.controllers;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;
import xsna.tgw;
import xsna.wzs;
import xsna.zcl;

/* compiled from: CredentialProviderController.kt */
/* loaded from: classes12.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    /* compiled from: CredentialProviderController.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, gzs<s3q0> gzsVar) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            gzsVar.invoke();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth_release() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth_release(int i) {
            return tgw.b(i, "activity with result code: ", " indicating not RESULT_OK");
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.CreateCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.CreateCredentialCancellationException] */
        public final boolean maybeReportErrorResultCodeCreate(int i, wzs<? super CancellationSignal, ? super gzs<s3q0>, s3q0> wzsVar, final izs<? super CreateCredentialException, s3q0> izsVar, CancellationSignal cancellationSignal) {
            if (i == -1) {
                return false;
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = new CreateCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                ref$ObjectRef.element = new CreateCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            wzsVar.invoke(cancellationSignal, new gzs<s3q0>() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeCreate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    izsVar.invoke(ref$ObjectRef.element);
                }
            });
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.credentials.exceptions.GetCredentialUnknownException] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, androidx.credentials.exceptions.GetCredentialCancellationException] */
        public final boolean maybeReportErrorResultCodeGet(int i, wzs<? super CancellationSignal, ? super gzs<s3q0>, s3q0> wzsVar, final izs<? super GetCredentialException, s3q0> izsVar, CancellationSignal cancellationSignal) {
            if (i == -1) {
                return false;
            }
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = new GetCredentialUnknownException(generateErrorStringUnknown$credentials_play_services_auth_release(i));
            if (i == 0) {
                ref$ObjectRef.element = new GetCredentialCancellationException(generateErrorStringCanceled$credentials_play_services_auth_release());
            }
            wzsVar.invoke(cancellationSignal, new gzs<s3q0>() { // from class: androidx.credentials.playservices.controllers.CredentialProviderController$Companion$maybeReportErrorResultCodeGet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
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
                    izsVar.invoke(ref$ObjectRef.element);
                }
            });
            return true;
        }

        private Companion() {
        }
    }

    public CredentialProviderController(Context context) {
        super(context);
        this.context = context;
    }

    public static final void cancelOrCallbackExceptionOrResult(CancellationSignal cancellationSignal, gzs<s3q0> gzsVar) {
        Companion.cancelOrCallbackExceptionOrResult(cancellationSignal, gzsVar);
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i, wzs<? super CancellationSignal, ? super gzs<s3q0>, s3q0> wzsVar, izs<? super CreateCredentialException, s3q0> izsVar, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i, wzsVar, izsVar, cancellationSignal);
    }

    public static final boolean maybeReportErrorResultCodeGet(int i, wzs<? super CancellationSignal, ? super gzs<s3q0>, s3q0> wzsVar, izs<? super GetCredentialException, s3q0> izsVar, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeGet(i, wzsVar, izsVar, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 t1);

    public abstract R1 convertResponseToCredentialManager(R2 r2);

    public abstract void invokePlayServices(T1 t1, CredentialManagerCallback<R1, E1> credentialManagerCallback, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle bundle, wzs<? super String, ? super String, ? extends E1> wzsVar, Executor executor, CredentialManagerCallback<R1, E1> credentialManagerCallback, CancellationSignal cancellationSignal) {
        if (!bundle.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        cancelOrCallbackExceptionOrResult(cancellationSignal, new CredentialProviderController$maybeReportErrorFromResultReceiver$1(executor, credentialManagerCallback, wzsVar.invoke(bundle.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), bundle.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG))));
        return true;
    }
}
