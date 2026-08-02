package androidx.credentials.provider.utils;

import android.content.pm.SigningInfo;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.ClearCredentialStateRequest;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.ProviderClearCredentialStateRequest;
import xsna.zcl;

/* compiled from: ClearCredentialUtil.kt */
/* loaded from: classes12.dex */
public final class ClearCredentialUtil {
    public static final Companion Companion = new Companion(null);

    /* compiled from: ClearCredentialUtil.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final ProviderClearCredentialStateRequest convertToJetpackRequest$credentials_release(ClearCredentialStateRequest clearCredentialStateRequest) {
            CallingAppInfo callingAppInfo;
            String packageName;
            CallingAppInfo callingAppInfo2;
            SigningInfo signingInfo;
            CallingAppInfo callingAppInfo3;
            String origin;
            CallingAppInfo.Companion companion = androidx.credentials.provider.CallingAppInfo.Companion;
            callingAppInfo = clearCredentialStateRequest.getCallingAppInfo();
            packageName = callingAppInfo.getPackageName();
            callingAppInfo2 = clearCredentialStateRequest.getCallingAppInfo();
            signingInfo = callingAppInfo2.getSigningInfo();
            callingAppInfo3 = clearCredentialStateRequest.getCallingAppInfo();
            origin = callingAppInfo3.getOrigin();
            return new ProviderClearCredentialStateRequest(companion.create(packageName, signingInfo, origin));
        }

        private Companion() {
        }
    }
}
