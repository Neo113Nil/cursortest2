package com.braze.requests.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.dispatch.h;
import com.braze.managers.j1;
import com.braze.support.StringUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class e {
    public static SharedPreferences a(h dispatchDataProvider, String filePrefix, String specificName) {
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        Intrinsics.checkNotNullParameter(filePrefix, "filePrefix");
        Intrinsics.checkNotNullParameter(specificName, "specificName");
        j1 j1Var = (j1) dispatchDataProvider.f();
        Context b = j1Var.b();
        SharedPreferences sharedPreferences = b.getSharedPreferences(filePrefix + "." + specificName + StringUtils.getCacheFileSuffix(b, j1Var.c(), j1Var.a()), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
