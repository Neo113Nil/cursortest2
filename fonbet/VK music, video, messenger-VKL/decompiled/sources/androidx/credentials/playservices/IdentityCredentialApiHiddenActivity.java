package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.unity3d.services.UnityAdsConstants;
import xsna.zcl;

/* compiled from: IdentityCredentialApiHiddenActivity.kt */
/* loaded from: classes12.dex */
public class IdentityCredentialApiHiddenActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";
    private boolean mWaitingForActivityResult;
    private ResultReceiver resultReceiver;

    /* compiled from: IdentityCredentialApiHiddenActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    private final void restoreState(Bundle bundle) {
        if (bundle != null) {
            this.mWaitingForActivityResult = bundle.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            CredentialProviderBaseController.Companion.reportResult$credentials_play_services_auth_release(resultReceiver, i, i2, intent);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(bundle);
        if (this.mWaitingForActivityResult) {
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra(CredentialProviderBaseController.EXTRA_GET_CREDENTIAL_INTENT);
        if (pendingIntent != null) {
            startIntentSenderForResult(pendingIntent.getIntentSender(), CredentialProviderBaseController.Companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release(), null, 0, 0, 0, null);
            return;
        }
        ResultReceiver resultReceiver2 = this.resultReceiver;
        if (resultReceiver2 != null) {
            CredentialProviderBaseController.Companion.reportError$credentials_play_services_auth_release(resultReceiver2, CredentialProviderBaseController.GET_UNKNOWN, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(bundle);
    }
}
