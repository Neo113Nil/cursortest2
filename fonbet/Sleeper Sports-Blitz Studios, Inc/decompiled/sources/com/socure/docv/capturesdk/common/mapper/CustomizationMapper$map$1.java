package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.Customization;
import com.socure.docv.capturesdk.models.CustomizationModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomizationMapper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.mapper.CustomizationMapper", f = "CustomizationMapper.kt", i = {0, 0}, l = {17, 20}, m = "map", n = {"this", MetricTracker.Object.INPUT}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class CustomizationMapper$map$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomizationMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomizationMapper$map$1(CustomizationMapper customizationMapper, Continuation<? super CustomizationMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = customizationMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((Customization) null, (Continuation<? super CustomizationModel>) this);
    }
}
