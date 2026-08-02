package com.evervault.sdk.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.evervault.sdk.core.HttpKeysLoader", f = "HttpKeysLoader.kt", i = {1}, l = {31, 34, 54}, m = "loadKeys", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class HttpKeysLoader$loadKeys$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpKeysLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpKeysLoader$loadKeys$1(HttpKeysLoader httpKeysLoader, Continuation<? super HttpKeysLoader$loadKeys$1> continuation) {
        super(continuation);
        this.this$0 = httpKeysLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadKeys(this);
    }
}
