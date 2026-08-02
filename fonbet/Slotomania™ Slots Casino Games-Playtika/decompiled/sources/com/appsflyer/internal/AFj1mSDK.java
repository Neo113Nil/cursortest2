package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AFj1mSDK implements AFj1oSDK {
    @Override // com.appsflyer.internal.AFj1oSDK
    public final String getMonetizationNetwork() {
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            AFj1mSDK aFj1mSDK = this;
            Field declaredField = BuildConfig.class.getDeclaredField(t.e);
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.checkNotNull(obj2, "");
            obj = Result.m11180constructorimpl((String) obj2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m11186isFailureimpl(obj) ? "" : obj);
    }
}
