package androidx.credentials;

import android.os.Build;
import android.view.View;

/* compiled from: CredentialManagerViewHandler.kt */
/* loaded from: classes12.dex */
public final class CredentialManagerViewHandler {
    private static final String TAG = "ViewHandler";

    public static final PendingGetCredentialRequest getPendingGetCredentialRequest(View view) {
        Object tag = view.getTag(R.id.androidx_credential_pendingCredentialRequest);
        if (tag instanceof PendingGetCredentialRequest) {
            return (PendingGetCredentialRequest) tag;
        }
        return null;
    }

    public static final void setPendingGetCredentialRequest(View view, PendingGetCredentialRequest pendingGetCredentialRequest) {
        view.setTag(R.id.androidx_credential_pendingCredentialRequest, pendingGetCredentialRequest);
        if (pendingGetCredentialRequest != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35 || (i == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
                Api35Impl.INSTANCE.setPendingGetCredentialRequest(view, pendingGetCredentialRequest.getRequest(), pendingGetCredentialRequest.getCallback());
                return;
            }
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35 || (i2 == 34 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            Api35Impl.INSTANCE.clearPendingGetCredentialRequest(view);
        }
    }

    public static /* synthetic */ void getPendingGetCredentialRequest$annotations(View view) {
    }
}
