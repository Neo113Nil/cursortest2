package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Upload;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SendMediaUseCase.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Upload$Builder;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1", f = "SendMediaUseCase.kt", i = {}, l = {285}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super NetworkResponse<? extends Upload.Builder>>, Object> {
    final /* synthetic */ MediaData.Media $compressedMediaData;
    int label;
    final /* synthetic */ SendMediaUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(SendMediaUseCase sendMediaUseCase, MediaData.Media media, Continuation<? super SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1> continuation) {
        super(2, continuation);
        this.this$0 = sendMediaUseCase;
        this.$compressedMediaData = media;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1(this.this$0, this.$compressedMediaData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super NetworkResponse<? extends Upload.Builder>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super NetworkResponse<Upload.Builder>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super NetworkResponse<Upload.Builder>> continuation) {
        return ((SendMediaUseCase$sendMediaNewWay$2$mediaUpload$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConversationRepository conversationRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        conversationRepository = this.this$0.conversationRepository;
        this.label = 1;
        Object uploadMedia = conversationRepository.uploadMedia(this.$compressedMediaData, this);
        return uploadMedia == coroutine_suspended ? coroutine_suspended : uploadMedia;
    }
}
