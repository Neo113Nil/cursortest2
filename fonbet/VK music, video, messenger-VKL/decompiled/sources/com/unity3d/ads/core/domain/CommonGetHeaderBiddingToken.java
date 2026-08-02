package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.go9;
import xsna.spj;
import xsna.zcl;

/* compiled from: CommonGetHeaderBiddingToken.kt */
/* loaded from: classes14.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final Companion Companion = new Companion(null);
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;

    /* compiled from: CommonGetHeaderBiddingToken.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken) {
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, TokenConfiguration tokenConfiguration, spj<? super String> spjVar) {
        CommonGetHeaderBiddingToken$invoke$1 commonGetHeaderBiddingToken$invoke$1;
        int i2;
        if (spjVar instanceof CommonGetHeaderBiddingToken$invoke$1) {
            commonGetHeaderBiddingToken$invoke$1 = (CommonGetHeaderBiddingToken$invoke$1) spjVar;
            int i3 = commonGetHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonGetHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonGetHeaderBiddingToken$invoke$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = commonGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
                    commonGetHeaderBiddingToken$invoke$1.label = 1;
                    obj = buildHeaderBiddingToken.invoke(i, tokenConfiguration, commonGetHeaderBiddingToken$invoke$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return go9.b("2:", ProtobufExtensionsKt.toBase64$default(((HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj).toByteString(), false, 1, null));
            }
        }
        commonGetHeaderBiddingToken$invoke$1 = new CommonGetHeaderBiddingToken$invoke$1(this, spjVar);
        Object obj2 = commonGetHeaderBiddingToken$invoke$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = commonGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        return go9.b("2:", ProtobufExtensionsKt.toBase64$default(((HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj2).toByteString(), false, 1, null));
    }
}
