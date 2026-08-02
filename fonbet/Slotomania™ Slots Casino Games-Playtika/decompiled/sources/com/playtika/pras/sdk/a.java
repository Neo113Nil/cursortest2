package com.playtika.pras.sdk;

import com.playtika.pras.sdk.PrasSDK;
import com.playtika.pras.sdk.network.InitCompleteListener;

/* loaded from: classes8.dex */
public final class a implements InitCompleteListener {
    public final /* synthetic */ PrasSDK.CreateHandlerV2 a;
    public final /* synthetic */ PrasSDK b;

    public a(PrasSDK.CreateHandlerV2 createHandlerV2, PrasSDK prasSDK) {
        this.a = createHandlerV2;
        this.b = prasSDK;
    }

    @Override // com.playtika.pras.sdk.network.InitCompleteListener
    public final void onInitError(Error error) {
        this.a.onCreate(this.b);
    }

    @Override // com.playtika.pras.sdk.network.InitCompleteListener
    public final void onInitSuccess() {
        this.a.onCreate(this.b);
    }
}
