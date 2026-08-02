package com.socure.docv.capturesdk.common.mapper;

import com.socure.docv.capturesdk.common.network.model.stepup.modules.Theme;
import com.socure.docv.capturesdk.models.ThemeModel;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ThemeMapper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.socure.docv.capturesdk.common.mapper.ThemeMapper", f = "ThemeMapper.kt", i = {0}, l = {20}, m = "map", n = {MetricTracker.Object.INPUT}, s = {"L$0"})
/* loaded from: classes8.dex */
final class ThemeMapper$map$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ThemeMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThemeMapper$map$1(ThemeMapper themeMapper, Continuation<? super ThemeMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = themeMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((Theme) null, (Continuation<? super ThemeModel>) this);
    }
}
