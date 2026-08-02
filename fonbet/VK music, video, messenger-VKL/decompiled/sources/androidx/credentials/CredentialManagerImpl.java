package androidx.credentials;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.credentials.PrepareGetCredentialResponse;
import androidx.credentials.exceptions.ClearCredentialException;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import java.util.concurrent.Executor;
import xsna.zcl;

/* compiled from: CredentialManagerImpl.kt */
@SuppressLint({"ObsoleteSdkInt"})
/* loaded from: classes.dex */
public final class CredentialManagerImpl implements CredentialManager {
    public static final Companion Companion = new Companion(null);
    private static final String INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS = "android.settings.CREDENTIAL_PROVIDER";
    private final Context context;

    /* compiled from: CredentialManagerImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CredentialManagerImpl(Context context) {
        this.context = context;
    }

    @Override // androidx.credentials.CredentialManager
    public void clearCredentialStateAsync(ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<Void, ClearCredentialException> credentialManagerCallback) {
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(this.context), clearCredentialStateRequest.getRequestType(), false, 2, null);
        if (bestAvailableProvider$default == null) {
            credentialManagerCallback.onError(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider$default.onClearCredential(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void createCredentialAsync(Context context, CreateCredentialRequest createCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<CreateCredentialResponse, CreateCredentialException> credentialManagerCallback) {
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(this.context), createCredentialRequest, false, 2, null);
        if (bestAvailableProvider$default == null) {
            credentialManagerCallback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider$default.onCreateCredential(context, createCredentialRequest, cancellationSignal, executor, credentialManagerCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public PendingIntent createSettingsPendingIntent() {
        Intent intent = new Intent(INTENT_ACTION_FOR_CREDENTIAL_PROVIDER_SETTINGS);
        intent.setData(Uri.parse("package:" + this.context.getPackageName()));
        return PendingIntent.getActivity(this.context, 0, intent, 67108864);
    }

    @Override // androidx.credentials.CredentialManager
    public void getCredentialAsync(Context context, GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(context), getCredentialRequest, false, 2, null);
        if (bestAvailableProvider$default == null) {
            credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider$default.onGetCredential(context, getCredentialRequest, cancellationSignal, executor, credentialManagerCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void prepareGetCredentialAsync(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<PrepareGetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(this.context).getBestAvailableProvider(false);
        if (bestAvailableProvider == null) {
            credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider.onPrepareCredential(getCredentialRequest, cancellationSignal, executor, credentialManagerCallback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void getCredentialAsync(Context context, PrepareGetCredentialResponse.PendingGetCredentialHandle pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback<GetCredentialResponse, GetCredentialException> credentialManagerCallback) {
        CredentialProvider bestAvailableProvider = new CredentialProviderFactory(context).getBestAvailableProvider(false);
        if (bestAvailableProvider == null) {
            credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("No Credential Manager provider found"));
        } else {
            bestAvailableProvider.onGetCredential(context, pendingGetCredentialHandle, cancellationSignal, executor, credentialManagerCallback);
        }
    }
}
