package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.Button;
import com.socure.docv.capturesdk.models.ButtonModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ButtonMapper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.mapper.ButtonMapper", f = "ButtonMapper.kt", i = {0, 0}, l = {13, 16}, m = "map", n = {"this", MetricTracker.Object.INPUT}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class ButtonMapper$map$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ButtonMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonMapper$map$1(ButtonMapper buttonMapper, Continuation<? super ButtonMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = buttonMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((Button) null, (Continuation<? super ButtonModel>) this);
    }
}
