package com.braze.dispatch;

import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.requests.o;
import com.braze.storage.s2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class g {
    public final void a(BrazeConfigurationProvider configurationProvider, final s2 sdkAuthenticationCache, o brazeRequest, String deviceId) {
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(sdkAuthenticationCache, "sdkAuthenticationCache");
        Intrinsics.checkNotNullParameter(brazeRequest, "brazeRequest");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        com.braze.requests.b bVar = (com.braze.requests.b) brazeRequest;
        bVar.f = deviceId;
        bVar.g = configurationProvider.getBrazeApiKey().f639a;
        bVar.h = Constants.BRAZE_SDK_VERSION;
        bVar.e = Long.valueOf(DateTimeUtils.nowInSeconds());
        if (!configurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.g$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.a();
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.g$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.a(s2.this);
                }
            }, 6, (Object) null);
            bVar.j = sdkAuthenticationCache.a();
        }
    }

    public static final String a(s2 s2Var) {
        return "Adding SDK Auth token to request '" + s2Var.a() + "'";
    }

    public static final String a() {
        return "SDK Auth is disabled, not adding signature to request";
    }
}
