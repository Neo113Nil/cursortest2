package com.evervault.sdk.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.evervault.sdk.core.HttpRequest", f = "HttpRequest.kt", i = {1}, l = {35, 39, 54}, m = "decryptWithToken", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
public final class HttpRequest$decryptWithToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRequest$decryptWithToken$1(HttpRequest httpRequest, Continuation<? super HttpRequest$decryptWithToken$1> continuation) {
        super(continuation);
        this.this$0 = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.decryptWithToken(null, null, this);
    }
}
