package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import xsna.spj;

/* compiled from: BuildHeaderBiddingToken.kt */
/* loaded from: classes14.dex */
public interface BuildHeaderBiddingToken {

    /* compiled from: BuildHeaderBiddingToken.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, spj spjVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 2) != 0) {
                tokenConfiguration = null;
            }
            return buildHeaderBiddingToken.invoke(i, tokenConfiguration, spjVar);
        }
    }

    Object invoke(int i, TokenConfiguration tokenConfiguration, spj<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> spjVar);
}
