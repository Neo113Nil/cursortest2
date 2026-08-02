package com.usercentrics.sdk.ui.components;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UCImageView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.ui.components.UCImageView", f = "UCImageView.kt", i = {0, 0, 0, 1, 1, 2, 2, 2}, l = {Sdk.SDKMetric.SDKMetricType.INIT_TO_SUCCESS_CALLBACK_DURATION_MS_VALUE, Sdk.SDKMetric.SDKMetricType.AD_START_TO_BACKGROUND_DURATION_MS_VALUE, 62}, m = "tryToDownloadImage", n = {"this", "imageUrl", "$this$tryToDownloadImage_u24lambda_u240", "this", "imageUrl", "this", "imageUrl", "it"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$3"})
/* loaded from: classes2.dex */
final class UCImageView$tryToDownloadImage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UCImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCImageView$tryToDownloadImage$1(UCImageView uCImageView, Continuation<? super UCImageView$tryToDownloadImage$1> continuation) {
        super(continuation);
        this.this$0 = uCImageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryToDownloadImage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryToDownloadImage = this.this$0.tryToDownloadImage(null, this);
        return tryToDownloadImage;
    }
}
