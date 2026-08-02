package com.usercentrics.sdk.ui.components;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UCImageView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.ui.components.UCImageView", f = "UCImageView.kt", i = {0, 0}, l = {74}, m = "tryToSetImageSVG", n = {"this", "imageUrl"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class UCImageView$tryToSetImageSVG$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UCImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCImageView$tryToSetImageSVG$1(UCImageView uCImageView, Continuation<? super UCImageView$tryToSetImageSVG$1> continuation) {
        super(continuation);
        this.this$0 = uCImageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryToSetImageSVG;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryToSetImageSVG = this.this$0.tryToSetImageSVG(null, null, this);
        return tryToSetImageSVG;
    }
}
