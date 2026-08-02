package com.usercentrics.sdk.ui.components;

import com.usercentrics.sdk.ui.image.UCRemoteImage;
import com.usercentrics.sdk.ui.image.UCRemoteImageService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UCImageView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/usercentrics/sdk/ui/image/UCRemoteImage;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.ui.components.UCImageView$downloadImage$2", f = "UCImageView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class UCImageView$downloadImage$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UCRemoteImage>, Object> {
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ UCImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCImageView$downloadImage$2(UCImageView uCImageView, String str, Continuation<? super UCImageView$downloadImage$2> continuation) {
        super(2, continuation);
        this.this$0 = uCImageView;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UCImageView$downloadImage$2(this.this$0, this.$imageUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UCRemoteImage> continuation) {
        return ((UCImageView$downloadImage$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UCRemoteImageService remoteImageService;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            remoteImageService = this.this$0.getRemoteImageService();
            return remoteImageService.getImage(this.$imageUrl);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
