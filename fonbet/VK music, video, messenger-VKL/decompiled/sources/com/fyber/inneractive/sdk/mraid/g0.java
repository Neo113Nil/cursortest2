package com.fyber.inneractive.sdk.mraid;

import androidx.credentials.provider.CredentialEntry;

/* loaded from: classes12.dex */
public final class g0 extends y {
    public final boolean a;

    public g0(boolean z) {
        this.a = z;
    }

    @Override // com.fyber.inneractive.sdk.mraid.y
    public final String a() {
        return "viewable: ".concat(this.a ? "true" : CredentialEntry.FALSE_STRING);
    }
}
