package com.usercentrics.sdk.ui.components;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UCImageView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.ui.components.UCImageView", f = "UCImageView.kt", i = {0, 0}, l = {95}, m = "tryToSetImageBitmap", n = {"this", "imageUrl"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class UCImageView$tryToSetImageBitmap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UCImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCImageView$tryToSetImageBitmap$1(UCImageView uCImageView, Continuation<? super UCImageView$tryToSetImageBitmap$1> continuation) {
        super(continuation);
        this.this$0 = uCImageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object tryToSetImageBitmap;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        tryToSetImageBitmap = this.this$0.tryToSetImageBitmap(null, null, this);
        return tryToSetImageBitmap;
    }
}
