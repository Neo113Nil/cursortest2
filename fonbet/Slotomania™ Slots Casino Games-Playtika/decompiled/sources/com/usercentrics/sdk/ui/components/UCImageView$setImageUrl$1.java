package com.usercentrics.sdk.ui.components;

import com.usercentrics.sdk.ui.image.UCRemoteImage;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.usercentrics.sdk.ui.components.UCImageView$setImageUrl$1", f = "UCImageView.kt", i = {1}, l = {42, 44, 47, 49}, m = "invokeSuspend", n = {"remoteImage"}, s = {"L$0"})
/* loaded from: classes2.dex */
final class UCImageView$setImageUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $imageUrl;
    Object L$0;
    int label;
    final /* synthetic */ UCImageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UCImageView$setImageUrl$1(UCImageView uCImageView, String str, Continuation<? super UCImageView$setImageUrl$1> continuation) {
        super(2, continuation);
        this.this$0 = uCImageView;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UCImageView$setImageUrl$1(this.this$0, this.$imageUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UCImageView$setImageUrl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r8 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r8 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (kotlinx.coroutines.YieldKt.yield(r7) == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003d, code lost:
    
        if (r8 == r0) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UCRemoteImage uCRemoteImage;
        Object tryToSetImageBitmap;
        Object tryToSetImageSVG;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.tryToDownloadImage(this.$imageUrl, this);
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            uCRemoteImage = (UCRemoteImage) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (uCRemoteImage.isSVG()) {
                this.L$0 = null;
                this.label = 3;
                tryToSetImageSVG = this.this$0.tryToSetImageSVG(this.$imageUrl, uCRemoteImage.getPayload(), this);
            } else {
                this.L$0 = null;
                this.label = 4;
                tryToSetImageBitmap = this.this$0.tryToSetImageBitmap(this.$imageUrl, uCRemoteImage.getPayload(), this);
            }
        }
        uCRemoteImage = (UCRemoteImage) obj;
        if (uCRemoteImage == null) {
            return Unit.INSTANCE;
        }
        this.L$0 = uCRemoteImage;
        this.label = 2;
    }
}
