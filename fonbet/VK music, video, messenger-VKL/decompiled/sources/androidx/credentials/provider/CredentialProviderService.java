package androidx.credentials.provider;

import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.provider.utils.BeginCreateCredentialUtil;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.credentials.provider.utils.ClearCredentialUtil;
import xsna.k81;
import xsna.l81;
import xsna.n81;
import xsna.p81;
import xsna.q81;
import xsna.vd2;

/* compiled from: CredentialProviderService.kt */
/* loaded from: classes12.dex */
public abstract class CredentialProviderService extends android.service.credentials.CredentialProviderService {
    private boolean isTestMode;
    private ProviderClearCredentialStateRequest lastClearRequest;
    private BeginCreateCredentialRequest lastCreateRequest;
    private BeginGetCredentialRequest lastGetRequest;

    public final ProviderClearCredentialStateRequest getLastClearRequest() {
        return this.lastClearRequest;
    }

    public final BeginCreateCredentialRequest getLastCreateRequest() {
        return this.lastCreateRequest;
    }

    public final BeginGetCredentialRequest getLastGetRequest() {
        return this.lastGetRequest;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    public final void onBeginCreateCredential(android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest, CancellationSignal cancellationSignal, final OutcomeReceiver outcomeReceiver) {
        OutcomeReceiver outcomeReceiver2 = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginCreateCredential$outcome$1
            public void onError(CreateCredentialException createCredentialException) {
                OutcomeReceiver outcomeReceiver3 = OutcomeReceiver.this;
                l81.j();
                outcomeReceiver3.onError(k81.a(createCredentialException.getType(), createCredentialException.getMessage()));
            }

            public void onResult(BeginCreateCredentialResponse beginCreateCredentialResponse) {
                OutcomeReceiver.this.onResult(BeginCreateCredentialUtil.Companion.convertToFrameworkResponse(beginCreateCredentialResponse));
            }
        };
        BeginCreateCredentialRequest convertToJetpackRequest$credentials_release = BeginCreateCredentialUtil.Companion.convertToJetpackRequest$credentials_release(beginCreateCredentialRequest);
        if (this.isTestMode) {
            this.lastCreateRequest = convertToJetpackRequest$credentials_release;
        }
        onBeginCreateCredentialRequest(convertToJetpackRequest$credentials_release, cancellationSignal, outcomeReceiver2);
    }

    public abstract void onBeginCreateCredentialRequest(BeginCreateCredentialRequest beginCreateCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver);

    public final void onBeginGetCredential(android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest, CancellationSignal cancellationSignal, final OutcomeReceiver outcomeReceiver) {
        BeginGetCredentialRequest convertToJetpackRequest$credentials_release = BeginGetCredentialUtil.Companion.convertToJetpackRequest$credentials_release(beginGetCredentialRequest);
        OutcomeReceiver outcomeReceiver2 = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onBeginGetCredential$outcome$1
            public void onError(GetCredentialException getCredentialException) {
                OutcomeReceiver outcomeReceiver3 = OutcomeReceiver.this;
                n81.m();
                outcomeReceiver3.onError(vd2.c(getCredentialException.getType(), getCredentialException.getMessage()));
            }

            public void onResult(BeginGetCredentialResponse beginGetCredentialResponse) {
                OutcomeReceiver.this.onResult(BeginGetCredentialUtil.Companion.convertToFrameworkResponse(beginGetCredentialResponse));
            }
        };
        if (this.isTestMode) {
            this.lastGetRequest = convertToJetpackRequest$credentials_release;
        }
        onBeginGetCredentialRequest(convertToJetpackRequest$credentials_release, cancellationSignal, outcomeReceiver2);
    }

    public abstract void onBeginGetCredentialRequest(BeginGetCredentialRequest beginGetCredentialRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver);

    public final void onClearCredentialState(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, final OutcomeReceiver outcomeReceiver) {
        OutcomeReceiver outcomeReceiver2 = new OutcomeReceiver() { // from class: androidx.credentials.provider.CredentialProviderService$onClearCredentialState$outcome$1
            public void onError(ClearCredentialException clearCredentialException) {
                OutcomeReceiver outcomeReceiver3 = OutcomeReceiver.this;
                q81.m();
                outcomeReceiver3.onError(p81.b(clearCredentialException.getType(), clearCredentialException.getMessage()));
            }

            public void onResult(Void r2) {
                OutcomeReceiver.this.onResult(r2);
            }
        };
        ProviderClearCredentialStateRequest convertToJetpackRequest$credentials_release = ClearCredentialUtil.Companion.convertToJetpackRequest$credentials_release(clearCredentialStateRequest);
        if (this.isTestMode) {
            this.lastClearRequest = convertToJetpackRequest$credentials_release;
        }
        onClearCredentialStateRequest(convertToJetpackRequest$credentials_release, cancellationSignal, outcomeReceiver2);
    }

    public abstract void onClearCredentialStateRequest(ProviderClearCredentialStateRequest providerClearCredentialStateRequest, CancellationSignal cancellationSignal, OutcomeReceiver outcomeReceiver);

    public final void setLastClearRequest(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        this.lastClearRequest = providerClearCredentialStateRequest;
    }

    public final void setLastCreateRequest(BeginCreateCredentialRequest beginCreateCredentialRequest) {
        this.lastCreateRequest = beginCreateCredentialRequest;
    }

    public final void setLastGetRequest(BeginGetCredentialRequest beginGetCredentialRequest) {
        this.lastGetRequest = beginGetCredentialRequest;
    }

    public final void setTestMode(boolean z) {
        this.isTestMode = z;
    }
}
