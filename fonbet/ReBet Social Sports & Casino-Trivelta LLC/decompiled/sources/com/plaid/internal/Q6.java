package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Q6 {
    @Nullable
    public static final AbstractC3648h7 a(@NotNull Common$SDKInternalEvent.RequestSilentNetworkAuth requestSilentNetworkAuth) {
        Intrinsics.checkNotNullParameter(requestSilentNetworkAuth, "<this>");
        String verificationId = requestSilentNetworkAuth.getVerificationId();
        if (verificationId != null && verificationId.length() != 0) {
            if (requestSilentNetworkAuth.hasTwilio()) {
                String redirectUri = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                if (redirectUri == null || redirectUri.length() == 0) {
                    return null;
                }
                String verificationId2 = requestSilentNetworkAuth.getVerificationId();
                Intrinsics.checkNotNullExpressionValue(verificationId2, "getVerificationId(...)");
                String redirectUri2 = requestSilentNetworkAuth.getTwilio().getRedirectUri();
                Intrinsics.checkNotNullExpressionValue(redirectUri2, "getRedirectUri(...)");
                return new C3764u7(verificationId2, redirectUri2);
            }
            if (requestSilentNetworkAuth.hasProve()) {
                String verificationId3 = requestSilentNetworkAuth.getVerificationId();
                Intrinsics.checkNotNullExpressionValue(verificationId3, "getVerificationId(...)");
                return new C3754t6(verificationId3);
            }
        }
        return null;
    }
}
