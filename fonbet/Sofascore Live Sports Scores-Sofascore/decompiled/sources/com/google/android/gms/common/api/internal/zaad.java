package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zaad extends GoogleApiClient {
    public final String b = "Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.";

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void a() {
        throw new UnsupportedOperationException(this.b);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void b() {
        throw new UnsupportedOperationException(this.b);
    }
}
