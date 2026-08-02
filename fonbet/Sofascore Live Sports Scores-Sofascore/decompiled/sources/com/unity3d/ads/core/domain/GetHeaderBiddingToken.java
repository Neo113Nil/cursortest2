package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import defpackage.a70;
import defpackage.rq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H¦B¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "", "", "tokenNumber", "Lcom/unity3d/ads/TokenConfiguration;", "tokenConfiguration", "", "invoke", "(ILcom/unity3d/ads/TokenConfiguration;Lrq3;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GetHeaderBiddingToken {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetHeaderBiddingToken getHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, rq3 rq3Var, int i2, Object obj) {
            if (obj != null) {
                a70.m("Super calls with default arguments not supported in this target, function: invoke");
                return null;
            }
            if ((i2 & 2) != 0) {
                tokenConfiguration = null;
            }
            return getHeaderBiddingToken.invoke(i, tokenConfiguration, rq3Var);
        }
    }

    @Nullable
    Object invoke(int i, @Nullable TokenConfiguration tokenConfiguration, @NotNull rq3<? super String> rq3Var);
}
