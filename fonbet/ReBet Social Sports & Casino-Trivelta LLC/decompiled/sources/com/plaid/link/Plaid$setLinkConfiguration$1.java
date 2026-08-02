package com.plaid.link;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.plaid.link.Plaid", f = "Plaid.kt", i = {0}, l = {370, 371}, m = "setLinkConfiguration", n = {"configuration"}, s = {"L$0"})
/* loaded from: classes4.dex */
public final class Plaid$setLinkConfiguration$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Plaid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$setLinkConfiguration$1(Plaid plaid, Continuation<? super Plaid$setLinkConfiguration$1> continuation) {
        super(continuation);
        this.this$0 = plaid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object linkConfiguration;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        linkConfiguration = this.this$0.setLinkConfiguration(null, this);
        return linkConfiguration;
    }
}
