package io.intercom.android.sdk.m5.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CommonRepository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.data.CommonRepository", f = "CommonRepository.kt", i = {}, l = {34}, m = "fetchUnreadCounts", n = {}, s = {})
/* loaded from: classes9.dex */
final class CommonRepository$fetchUnreadCounts$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonRepository$fetchUnreadCounts$1(CommonRepository commonRepository, Continuation<? super CommonRepository$fetchUnreadCounts$1> continuation) {
        super(continuation);
        this.this$0 = commonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchUnreadCounts(this);
    }
}
