package com.usercentrics.sdk.v2.tcf.facade;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TCFFacadeImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.tcf.facade.TCFFacadeImpl", f = "TCFFacadeImpl.kt", i = {0}, l = {15}, m = "getVendorList-IoAF18A", n = {"this"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class TCFFacadeImpl$getVendorList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TCFFacadeImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFFacadeImpl$getVendorList$1(TCFFacadeImpl tCFFacadeImpl, Continuation<? super TCFFacadeImpl$getVendorList$1> continuation) {
        super(continuation);
        this.this$0 = tCFFacadeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo10627getVendorListIoAF18A = this.this$0.mo10627getVendorListIoAF18A(this);
        return mo10627getVendorListIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo10627getVendorListIoAF18A : Result.m11179boximpl(mo10627getVendorListIoAF18A);
    }
}
