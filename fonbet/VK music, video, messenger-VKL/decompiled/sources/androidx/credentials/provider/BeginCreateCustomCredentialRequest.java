package androidx.credentials.provider;

import android.os.Bundle;

/* compiled from: BeginCreateCustomCredentialRequest.kt */
/* loaded from: classes12.dex */
public class BeginCreateCustomCredentialRequest extends BeginCreateCredentialRequest {
    public BeginCreateCustomCredentialRequest(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        super(str, bundle, callingAppInfo);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
