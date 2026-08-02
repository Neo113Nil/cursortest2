package com.socure.docv.capturesdk.common.network.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ModulesRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.network.repository.ModulesRepositoryImpl", f = "ModulesRepositoryImpl.kt", i = {}, l = {25}, m = "startSession-IoAF18A", n = {}, s = {})
/* loaded from: classes8.dex */
final class ModulesRepositoryImpl$startSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ModulesRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModulesRepositoryImpl$startSession$1(ModulesRepositoryImpl modulesRepositoryImpl, Continuation<? super ModulesRepositoryImpl$startSession$1> continuation) {
        super(continuation);
        this.this$0 = modulesRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo11524startSessionIoAF18A = this.this$0.mo11524startSessionIoAF18A(this);
        return mo11524startSessionIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo11524startSessionIoAF18A : Result.m13469boximpl(mo11524startSessionIoAF18A);
    }
}
