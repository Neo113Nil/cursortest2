package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class e {
    public static final f a;
    public static final k b;

    static {
        f fVar = new f(false);
        a = fVar;
        b = new k("", "", fVar);
    }

    public static final f a() {
        return a;
    }

    public static final k b() {
        return b;
    }

    public static final f a(BidToken.BidTokenResponseV3 bidTokenResponseV3) {
        Intrinsics.checkNotNullParameter(bidTokenResponseV3, "<this>");
        return bidTokenResponseV3.hasClientTokenConfigs() ? new f(bidTokenResponseV3.getClientTokenConfigs().getEnableDbt()) : a;
    }
}
