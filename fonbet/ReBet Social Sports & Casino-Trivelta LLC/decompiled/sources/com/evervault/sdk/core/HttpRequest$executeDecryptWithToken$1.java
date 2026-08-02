package com.evervault.sdk.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.evervault.sdk.core.HttpRequest", f = "HttpRequest.kt", i = {}, l = {98, 70}, m = "executeDecryptWithToken", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HttpRequest$executeDecryptWithToken$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequest$executeDecryptWithToken$1(HttpRequest httpRequest, Continuation<? super HttpRequest$executeDecryptWithToken$1> continuation) {
        super(continuation);
        this.this$0 = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object executeDecryptWithToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        executeDecryptWithToken = this.this$0.executeDecryptWithToken(null, null, this);
        return executeDecryptWithToken;
    }
}
