package com.usercentrics.sdk.v2.tcf.service;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TCFService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.tcf.service.TCFService", f = "TCFService.kt", i = {}, l = {22}, m = "loadDeclarations", n = {}, s = {})
/* loaded from: classes4.dex */
final class TCFService$loadDeclarations$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TCFService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFService$loadDeclarations$1(TCFService tCFService, Continuation<? super TCFService$loadDeclarations$1> continuation) {
        super(continuation);
        this.this$0 = tCFService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadDeclarations(null, this);
    }
}
