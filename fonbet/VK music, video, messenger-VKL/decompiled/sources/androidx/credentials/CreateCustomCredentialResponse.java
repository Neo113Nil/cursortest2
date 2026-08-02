package androidx.credentials;

import android.os.Bundle;

/* compiled from: CreateCustomCredentialResponse.kt */
/* loaded from: classes12.dex */
public class CreateCustomCredentialResponse extends CreateCredentialResponse {
    public CreateCustomCredentialResponse(String str, Bundle bundle) {
        super(str, bundle);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
