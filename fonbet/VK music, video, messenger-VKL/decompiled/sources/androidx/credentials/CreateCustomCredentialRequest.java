package androidx.credentials;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import xsna.zcl;

/* compiled from: CreateCustomCredentialRequest.kt */
/* loaded from: classes12.dex */
public class CreateCustomCredentialRequest extends CreateCredentialRequest {
    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo) {
        this(str, bundle, bundle2, z, displayInfo, false, null, false, 224, null);
    }

    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2) {
        this(str, bundle, bundle2, z, displayInfo, z2, null, false, PsExtractor.AUDIO_STREAM, null);
    }

    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, String str2) {
        this(str, bundle, bundle2, z, displayInfo, z2, str2, false, 128, null);
    }

    public /* synthetic */ CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, String str2, boolean z3, int i, zcl zclVar) {
        this(str, bundle, bundle2, z, displayInfo, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? false : z3);
    }

    public CreateCustomCredentialRequest(String str, Bundle bundle, Bundle bundle2, boolean z, CreateCredentialRequest.DisplayInfo displayInfo, boolean z2, String str2, boolean z3) {
        super(str, bundle, bundle2, z, z2, displayInfo, str2, z3);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty");
        }
    }
}
