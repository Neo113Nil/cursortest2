package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFj1hSDK implements AFj1nSDK {
    @Override // com.appsflyer.internal.AFj1nSDK
    public final String getCurrencyIso4217Code() {
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            AFj1hSDK aFj1hSDK = this;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.checkNotNull(obj2, "");
            obj = Result.m13470constructorimpl((String) obj2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        return (String) (Result.m13476isFailureimpl(obj) ? "" : obj);
    }
}
