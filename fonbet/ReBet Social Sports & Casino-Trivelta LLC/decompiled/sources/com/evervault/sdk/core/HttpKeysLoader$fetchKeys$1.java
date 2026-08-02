package com.evervault.sdk.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.evervault.sdk.core.HttpKeysLoader", f = "HttpKeysLoader.kt", i = {0, 1, 1}, l = {89, 65}, m = "fetchKeys", n = {"this", "this", "response"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes2.dex */
public final class HttpKeysLoader$fetchKeys$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpKeysLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpKeysLoader$fetchKeys$1(HttpKeysLoader httpKeysLoader, Continuation<? super HttpKeysLoader$fetchKeys$1> continuation) {
        super(continuation);
        this.this$0 = httpKeysLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchKeys;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchKeys = this.this$0.fetchKeys(this);
        return fetchKeys;
    }
}
