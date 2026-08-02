package com.fyber.inneractive.sdk.serverapi.extradata;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.bidder.d0;
import com.fyber.inneractive.sdk.bidder.k;

/* loaded from: classes12.dex */
public final class a implements c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final boolean a(Object obj) {
        return ((TokenParametersOuterClass$TokenParameters) ((k) obj).b).getPubExtraDataCount() == 0;
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final void a(String str, String str2, Object obj) {
        k kVar = (k) obj;
        d0 newBuilder = TokenParametersOuterClass$TokenParameters.PubExtraData.newBuilder();
        newBuilder.c();
        ((TokenParametersOuterClass$TokenParameters.PubExtraData) newBuilder.b).setKey(str);
        newBuilder.c();
        ((TokenParametersOuterClass$TokenParameters.PubExtraData) newBuilder.b).setValue(str2);
        TokenParametersOuterClass$TokenParameters.PubExtraData pubExtraData = (TokenParametersOuterClass$TokenParameters.PubExtraData) newBuilder.a();
        kVar.c();
        ((TokenParametersOuterClass$TokenParameters) kVar.b).addPubExtraData(pubExtraData);
    }
}
