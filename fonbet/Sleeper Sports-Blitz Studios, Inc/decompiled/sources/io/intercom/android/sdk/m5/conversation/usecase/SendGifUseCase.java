package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SendGifUseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0086B¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendGifUseCase;", "", "sendMessageUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "changeInputUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;)V", "invoke", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "gifData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SendGifUseCase {
    public static final int $stable = 8;
    private final ChangeInputUseCase changeInputUseCase;
    private final SendMessageUseCase sendMessageUseCase;

    public SendGifUseCase(SendMessageUseCase sendMessageUseCase, ChangeInputUseCase changeInputUseCase) {
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(changeInputUseCase, "changeInputUseCase");
        this.sendMessageUseCase = sendMessageUseCase;
        this.changeInputUseCase = changeInputUseCase;
    }

    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, MediaData.Gif gif, Continuation<? super Unit> continuation) {
        this.changeInputUseCase.invoke(mutableStateFlow, ComposerInputType.Text.INSTANCE);
        Object invoke$default = SendMessageUseCase.invoke$default(this.sendMessageUseCase, mutableStateFlow, CollectionsKt.listOf(new Block.Builder().withType("image").withUrl(gif.getUrl()).withAttribution(gif.getAttribution()).withHeight(gif.getHeight()).withWidth(gif.getWidth())), null, continuation, 4, null);
        return invoke$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke$default : Unit.INSTANCE;
    }
}
