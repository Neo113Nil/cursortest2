package defpackage;

import android.content.Context;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wy3 implements qy3 {
    public final CredentialManager a;

    public wy3(Context context) {
        context.getClass();
        this.a = (CredentialManager) context.getSystemService("credential");
    }

    @Override // defpackage.qy3
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.a != null;
    }

    @Override // defpackage.qy3
    public final void onClearCredential(gw2 gw2Var, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var) {
        ny3 ny3Var = (ny3) oy3Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            ny3Var.c(new fw2("Your device doesn't support credential manager", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION"));
            Unit unit = Unit.a;
        } else {
            vy3 vy3Var = new vy3(ny3Var);
            credentialManager.getClass();
            credentialManager.clearCredentialState(new ClearCredentialStateRequest(new Bundle()), cancellationSignal, executor, vy3Var);
        }
    }

    @Override // defpackage.qy3
    public final void onGetCredential(Context context, fx8 fx8Var, CancellationSignal cancellationSignal, Executor executor, oy3 oy3Var) {
        sz8 sz8Var = (sz8) oy3Var;
        CredentialManager credentialManager = this.a;
        if (credentialManager == null) {
            sz8Var.c(new hx8("Your device doesn't support credential manager"));
            Unit unit = Unit.a;
            return;
        }
        vy3 vy3Var = new vy3(sz8Var, this);
        credentialManager.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle);
        for (ix8 ix8Var : fx8Var.a) {
            ix8Var.getClass();
            builder.addCredentialOption(new CredentialOption.Builder("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", ix8Var.a, ix8Var.b).setIsSystemProviderRequired(true).setAllowedProviders(ix8Var.c).build());
        }
        GetCredentialRequest build = builder.build();
        build.getClass();
        credentialManager.getCredential(context, build, cancellationSignal, executor, vy3Var);
    }
}
