package com.usercentrics.sdk.v2.tcf.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TCFVendorListRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.v2.tcf.repository.TCFVendorListRepository", f = "TCFVendorListRepository.kt", i = {0}, l = {21}, m = "fetchVendorList", n = {"this"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class TCFVendorListRepository$fetchVendorList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TCFVendorListRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TCFVendorListRepository$fetchVendorList$1(TCFVendorListRepository tCFVendorListRepository, Continuation<? super TCFVendorListRepository$fetchVendorList$1> continuation) {
        super(continuation);
        this.this$0 = tCFVendorListRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchVendorList(this);
    }
}
