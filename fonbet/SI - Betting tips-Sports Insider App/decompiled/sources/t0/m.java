package t0;

import android.content.Context;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import oi.w;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final CredentialManager f23733a;

    public m(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f23733a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // t0.k
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f23733a != null;
    }

    @Override // t0.k
    public final void onClearCredential(a request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        w wVar = (w) callback;
        io.sentry.android.replay.n nVar = new io.sentry.android.replay.n(6, wVar);
        CredentialManager credentialManager = this.f23733a;
        if (credentialManager == null) {
            nVar.invoke();
            return;
        }
        l lVar = new l(wVar);
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.clearCredentialState(new ClearCredentialStateRequest(new Bundle()), cancellationSignal, executor, lVar);
    }

    @Override // t0.k
    public final void onGetCredential(Context context, p request, CancellationSignal cancellationSignal, Executor executor, i callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        w wVar = (w) callback;
        io.sentry.android.replay.n nVar = new io.sentry.android.replay.n(7, wVar);
        CredentialManager credentialManager = this.f23733a;
        if (credentialManager == null) {
            nVar.invoke();
            return;
        }
        l lVar = new l(wVar, this);
        Intrinsics.checkNotNull(credentialManager);
        Intrinsics.checkNotNullParameter(request, "request");
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (j jVar : request.f23734a) {
            jVar.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", jVar.f23728a, jVar.f23729b).setIsSystemProviderRequired(true).setAllowedProviders(jVar.f23730c).build());
        }
        GetCredentialRequest build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
        credentialManager.getCredential(context, build, cancellationSignal, executor, lVar);
    }
}
