package com.orkestapay.orkestapay.client.apirequest;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.orkestapay.orkestapay.client.apirequest.OrkestapayAPI", f = "OrkestapayAPI.kt", i = {0}, l = {84}, m = "getPaymentMethodInfo", n = {"listener"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class OrkestapayAPI$getPaymentMethodInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OrkestapayAPI this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrkestapayAPI$getPaymentMethodInfo$1(OrkestapayAPI orkestapayAPI, Continuation<? super OrkestapayAPI$getPaymentMethodInfo$1> continuation) {
        super(continuation);
        this.this$0 = orkestapayAPI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPaymentMethodInfo(null, null, this);
    }
}
