package androidx.credentials;

import android.credentials.GetCredentialException;
import android.os.OutcomeReceiver;
import android.view.View;
import androidx.credentials.internal.FrameworkImplHelper;
import xsna.izs;
import xsna.s3q0;

/* compiled from: CredentialManagerViewHandler.kt */
/* loaded from: classes12.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public final void clearPendingGetCredentialRequest(View view) {
        view.clearPendingCredentialRequest();
    }

    public final void setPendingGetCredentialRequest(View view, GetCredentialRequest getCredentialRequest, final izs<? super GetCredentialResponse, s3q0> izsVar) {
        view.setPendingCredentialRequest(FrameworkImplHelper.Companion.convertGetRequestToFrameworkClass(getCredentialRequest), new OutcomeReceiver() { // from class: androidx.credentials.Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1
            public void onError(GetCredentialException getCredentialException) {
                getCredentialException.getType();
                getCredentialException.getMessage();
            }

            public void onResult(android.credentials.GetCredentialResponse getCredentialResponse) {
                izsVar.invoke(FrameworkImplHelper.Companion.convertGetResponseToJetpackClass(getCredentialResponse));
            }
        });
    }
}
