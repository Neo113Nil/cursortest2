package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import defpackage.a70;
import defpackage.dmi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.y6a;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "buildHeaderBiddingToken", "<init>", "(Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;)V", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {

    @NotNull
    public static final String HB_TOKEN_VERSION = "2";

    @NotNull
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;

    public CommonGetHeaderBiddingToken(@NotNull BuildHeaderBiddingToken buildHeaderBiddingToken) {
        buildHeaderBiddingToken.getClass();
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(int i, @Nullable TokenConfiguration tokenConfiguration, @NotNull rq3<? super String> rq3Var) {
        CommonGetHeaderBiddingToken$invoke$1 commonGetHeaderBiddingToken$invoke$1;
        int i2;
        if (rq3Var instanceof CommonGetHeaderBiddingToken$invoke$1) {
            commonGetHeaderBiddingToken$invoke$1 = (CommonGetHeaderBiddingToken$invoke$1) rq3Var;
            int i3 = commonGetHeaderBiddingToken$invoke$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                commonGetHeaderBiddingToken$invoke$1.label = i3 - Integer.MIN_VALUE;
                Object obj = commonGetHeaderBiddingToken$invoke$1.result;
                lu3 lu3Var = lu3.a;
                i2 = commonGetHeaderBiddingToken$invoke$1.label;
                if (i2 != 0) {
                    y6a.M(obj);
                    BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
                    commonGetHeaderBiddingToken$invoke$1.label = 1;
                    obj = buildHeaderBiddingToken.invoke(i, tokenConfiguration, commonGetHeaderBiddingToken$invoke$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                ByteString byteString = ((HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj).toByteString();
                byteString.getClass();
                return dmi.q("2:", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
            }
        }
        commonGetHeaderBiddingToken$invoke$1 = new CommonGetHeaderBiddingToken$invoke$1(this, rq3Var);
        Object obj2 = commonGetHeaderBiddingToken$invoke$1.result;
        lu3 lu3Var2 = lu3.a;
        i2 = commonGetHeaderBiddingToken$invoke$1.label;
        if (i2 != 0) {
        }
        ByteString byteString2 = ((HeaderBiddingTokenOuterClass.HeaderBiddingToken) obj2).toByteString();
        byteString2.getClass();
        return dmi.q("2:", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
    }
}
