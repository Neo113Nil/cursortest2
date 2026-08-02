package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.mapper.GlobalConfigMapper;
import com.socure.docv.capturesdk.models.GlobalConfigModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GlobalConfigMapper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.mapper.GlobalConfigMapper", f = "GlobalConfigMapper.kt", i = {0, 0, 0, 1, 1}, l = {23, 24}, m = "map", n = {"this", MetricTracker.Object.INPUT, "eventId", MetricTracker.Object.INPUT, "eventId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes8.dex */
final class GlobalConfigMapper$map$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GlobalConfigMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalConfigMapper$map$1(GlobalConfigMapper globalConfigMapper, Continuation<? super GlobalConfigMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = globalConfigMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((GlobalConfigMapper.GlobalConfigMapperInput) null, (Continuation<? super GlobalConfigModel>) this);
    }
}
