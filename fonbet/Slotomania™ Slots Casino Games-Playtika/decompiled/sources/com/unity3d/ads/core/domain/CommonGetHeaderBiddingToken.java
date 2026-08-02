package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonGetHeaderBiddingToken.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ#\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "buildHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "fetchSignalsAndSendUseCase", "Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;", "scarEligibleEffectiveUseCase", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "(Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;Lcom/unity3d/ads/core/domain/scar/FetchSignalsAndSendUseCase;Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;)V", "invoke", "", "tokenNumber", "", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "(ILcom/unity3d/ads/TokenConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    private final ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase;

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken, FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, ScarEligibleEffectiveUseCase scarEligibleEffectiveUseCase) {
        Intrinsics.checkNotNullParameter(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        Intrinsics.checkNotNullParameter(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        Intrinsics.checkNotNullParameter(scarEligibleEffectiveUseCase, "scarEligibleEffectiveUseCase");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.scarEligibleEffectiveUseCase = scarEligibleEffectiveUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, TokenConfiguration tokenConfiguration, Continuation<? super String> continuation) {
        CommonGetHeaderBiddingToken$invoke$1 commonGetHeaderBiddingToken$invoke$1;
        int i2;
        TokenConfiguration tokenConfiguration2;
        List<AdFormatOuterClass.AdFormat> list;
        CommonGetHeaderBiddingToken commonGetHeaderBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken2;
        if (continuation instanceof CommonGetHeaderBiddingToken$invoke$1) {
            commonGetHeaderBiddingToken$invoke$1 = (CommonGetHeaderBiddingToken$invoke$1) continuation;
            if ((commonGetHeaderBiddingToken$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonGetHeaderBiddingToken$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = commonGetHeaderBiddingToken$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = commonGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<AdFormatOuterClass.AdFormat> invoke = this.scarEligibleEffectiveUseCase.invoke(tokenConfiguration);
                    BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
                    boolean z = !invoke.isEmpty();
                    commonGetHeaderBiddingToken$invoke$1.L$0 = this;
                    commonGetHeaderBiddingToken$invoke$1.L$1 = tokenConfiguration;
                    commonGetHeaderBiddingToken$invoke$1.L$2 = invoke;
                    commonGetHeaderBiddingToken$invoke$1.I$0 = i;
                    commonGetHeaderBiddingToken$invoke$1.label = 1;
                    Object invoke2 = buildHeaderBiddingToken.invoke(i, tokenConfiguration, z, commonGetHeaderBiddingToken$invoke$1);
                    if (invoke2 != coroutine_suspended) {
                        tokenConfiguration2 = tokenConfiguration;
                        list = invoke;
                        obj = invoke2;
                        commonGetHeaderBiddingToken = this;
                    }
                    return coroutine_suspended;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    headerBiddingToken2 = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) commonGetHeaderBiddingToken$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    headerBiddingToken = headerBiddingToken2;
                    ByteString byteString = headerBiddingToken.toByteString();
                    Intrinsics.checkNotNullExpressionValue(byteString, "rawToken.toByteString()");
                    return "2:" + ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null);
                }
                i = commonGetHeaderBiddingToken$invoke$1.I$0;
                list = (List) commonGetHeaderBiddingToken$invoke$1.L$2;
                tokenConfiguration2 = (TokenConfiguration) commonGetHeaderBiddingToken$invoke$1.L$1;
                commonGetHeaderBiddingToken = (CommonGetHeaderBiddingToken) commonGetHeaderBiddingToken$invoke$1.L$0;
                ResultKt.throwOnFailure(obj);
                headerBiddingToken = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj;
                if (!list.isEmpty()) {
                    FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase = commonGetHeaderBiddingToken.fetchSignalsAndSendUseCase;
                    ByteString tokenId = headerBiddingToken.getTokenId();
                    Intrinsics.checkNotNullExpressionValue(tokenId, "rawToken.tokenId");
                    commonGetHeaderBiddingToken$invoke$1.L$0 = headerBiddingToken;
                    commonGetHeaderBiddingToken$invoke$1.L$1 = null;
                    commonGetHeaderBiddingToken$invoke$1.L$2 = null;
                    commonGetHeaderBiddingToken$invoke$1.label = 2;
                    if (fetchSignalsAndSendUseCase.invoke(i, tokenId, tokenConfiguration2, commonGetHeaderBiddingToken$invoke$1) != coroutine_suspended) {
                        headerBiddingToken2 = headerBiddingToken;
                        headerBiddingToken = headerBiddingToken2;
                    }
                    return coroutine_suspended;
                }
                ByteString byteString2 = headerBiddingToken.toByteString();
                Intrinsics.checkNotNullExpressionValue(byteString2, "rawToken.toByteString()");
                return "2:" + ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null);
            }
        }
        commonGetHeaderBiddingToken$invoke$1 = new CommonGetHeaderBiddingToken$invoke$1(this, continuation);
        Object obj2 = commonGetHeaderBiddingToken$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = commonGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        headerBiddingToken = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj2;
        if (!list.isEmpty()) {
        }
        ByteString byteString22 = headerBiddingToken.toByteString();
        Intrinsics.checkNotNullExpressionValue(byteString22, "rawToken.toByteString()");
        return "2:" + ProtobufExtensionsKt.toBase64$default(byteString22, false, 1, null);
    }
}
