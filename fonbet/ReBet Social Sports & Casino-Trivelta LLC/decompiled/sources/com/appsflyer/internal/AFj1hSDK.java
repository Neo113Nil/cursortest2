package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFj1hSDK implements AFj1iSDK {
    @Override // com.appsflyer.internal.AFj1iSDK
    @NotNull
    public final String getMediationNetwork() {
        Object obj;
        try {
            Result.Companion companion = Result.INSTANCE;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(null);
            Intrinsics.checkNotNull(obj2, "");
            obj = Result.m147constructorimpl((String) obj2);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            obj = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m153isFailureimpl(obj) ? "" : obj);
    }
}
