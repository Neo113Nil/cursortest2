package com.usercentrics.sdk.v2.tcf.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TCFDeclarationsRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.tcf.repository.TCFDeclarationsRepository", f = "TCFDeclarationsRepository.kt", i = {0}, l = {26}, m = "fetchDeclarations", n = {"this"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class TCFDeclarationsRepository$fetchDeclarations$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TCFDeclarationsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFDeclarationsRepository$fetchDeclarations$1(TCFDeclarationsRepository tCFDeclarationsRepository, Continuation<? super TCFDeclarationsRepository$fetchDeclarations$1> continuation) {
        super(continuation);
        this.this$0 = tCFDeclarationsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchDeclarations(null, this);
    }
}
