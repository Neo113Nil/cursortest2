package com.plaid.internal;

import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class M7 implements B6, B8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final T3 f39381a;

    public M7(@NotNull T3 localPaneStateStore) {
        Intrinsics.checkNotNullParameter(localPaneStateStore, "localPaneStateStore");
        this.f39381a = localPaneStateStore;
    }

    @Override // com.plaid.internal.B6
    @Nullable
    public final Object a(@NotNull SuspendLambda suspendLambda) {
        Object a10 = this.f39381a.a("webview_fallback_id_state", suspendLambda);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    @Override // com.plaid.internal.B6
    @Nullable
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        return this.f39381a.a("webview_fallback_id_state", "webview_fallback_id", continuationImpl);
    }

    @Override // com.plaid.internal.B8
    @Nullable
    public final Object a(@NotNull String str, @NotNull C3741s2 c3741s2) {
        Object a10 = this.f39381a.a("webview_fallback_id_state", "webview_fallback_id", str, c3741s2);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }
}
