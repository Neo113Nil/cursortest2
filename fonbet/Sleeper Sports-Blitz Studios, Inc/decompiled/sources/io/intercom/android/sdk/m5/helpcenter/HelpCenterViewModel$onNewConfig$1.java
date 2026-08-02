package io.intercom.android.sdk.m5.helpcenter;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HelpCenterViewModel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel", f = "HelpCenterViewModel.kt", i = {0}, l = {371, 379}, m = "onNewConfig", n = {"this"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class HelpCenterViewModel$onNewConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$onNewConfig$1(HelpCenterViewModel helpCenterViewModel, Continuation<? super HelpCenterViewModel$onNewConfig$1> continuation) {
        super(continuation);
        this.this$0 = helpCenterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onNewConfig(this);
    }
}
