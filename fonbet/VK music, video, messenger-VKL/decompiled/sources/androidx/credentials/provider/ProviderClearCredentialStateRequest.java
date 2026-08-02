package androidx.credentials.provider;

import android.os.Bundle;
import xsna.zcl;

/* compiled from: ProviderClearCredentialStateRequest.kt */
/* loaded from: classes12.dex */
public final class ProviderClearCredentialStateRequest {
    public static final Companion Companion = new Companion(null);
    private final CallingAppInfo callingAppInfo;

    /* compiled from: ProviderClearCredentialStateRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
            Bundle bundle = new Bundle();
            CallingAppInfo.Companion.setCallingAppInfo$credentials_release(bundle, providerClearCredentialStateRequest.getCallingAppInfo());
            return bundle;
        }

        public final ProviderClearCredentialStateRequest fromBundle(Bundle bundle) {
            CallingAppInfo extractCallingAppInfo$credentials_release = CallingAppInfo.Companion.extractCallingAppInfo$credentials_release(bundle);
            if (extractCallingAppInfo$credentials_release != null) {
                return new ProviderClearCredentialStateRequest(extractCallingAppInfo$credentials_release);
            }
            throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
        }

        private Companion() {
        }
    }

    public ProviderClearCredentialStateRequest(CallingAppInfo callingAppInfo) {
        this.callingAppInfo = callingAppInfo;
    }

    public static final Bundle asBundle(ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        return Companion.asBundle(providerClearCredentialStateRequest);
    }

    public static final ProviderClearCredentialStateRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }
}
