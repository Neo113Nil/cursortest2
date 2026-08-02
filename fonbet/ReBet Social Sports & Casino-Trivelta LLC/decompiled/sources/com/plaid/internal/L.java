package com.plaid.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import com.plaid.internal.AbstractC3782w7;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f39328a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final J f39329b;

    public L(@NotNull Context context, @NotNull J networkRequestProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkRequestProvider, "networkRequestProvider");
        this.f39328a = context;
        this.f39329b = networkRequestProvider;
    }

    @Nullable
    public final Object a(@NotNull String str, @NotNull M m10) {
        boolean z10;
        Object invoke;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(m10));
        Object systemService = this.f39328a.getSystemService("connectivity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        try {
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "c.getDeclaredMethod(\"getMobileDataEnabled\")");
            declaredMethod.setAccessible(true);
            invoke = declaredMethod.invoke(connectivityManager, null);
        } catch (Exception e10) {
            e10.printStackTrace();
            z10 = false;
        }
        if (invoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        z10 = ((Boolean) invoke).booleanValue();
        if (z10) {
            connectivityManager.requestNetwork(new NetworkRequest.Builder().addTransportType(0).addCapability(12).build(), new K(this, str, safeContinuation, connectivityManager));
        } else {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(AbstractC3782w7.a.f41171a)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(m10);
        }
        return orThrow;
    }
}
