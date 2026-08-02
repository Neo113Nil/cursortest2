package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.BlockFactory;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SendQuickReplyUseCase.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0086B¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendQuickReplyUseCase;", "", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "soundEffectsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;Lio/intercom/android/sdk/identity/UserIdentity;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "replyOption", "Lio/intercom/android/sdk/models/ReplyOption;", "part", "Lio/intercom/android/sdk/models/Part;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lio/intercom/android/sdk/models/ReplyOption;Lio/intercom/android/sdk/models/Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SendQuickReplyUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final UserIdentity userIdentity;

    public SendQuickReplyUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        this.conversationRepository = conversationRepository;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.userIdentity = userIdentity;
    }

    public /* synthetic */ SendQuickReplyUseCase(ConversationRepository conversationRepository, RefreshConversationUseCase refreshConversationUseCase, SoundEffectsUseCase soundEffectsUseCase, UserIdentity userIdentity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(conversationRepository, refreshConversationUseCase, soundEffectsUseCase, (i & 8) != 0 ? Injector.get().getUserIdentity() : userIdentity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        if (r10.invoke(r9, r11, r6) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, ReplyOption replyOption, Part part, Continuation<? super Unit> continuation) {
        SendQuickReplyUseCase$invoke$1 sendQuickReplyUseCase$invoke$1;
        int i;
        String uuid;
        SendQuickReplyUseCase sendQuickReplyUseCase;
        NetworkResponse networkResponse;
        if (continuation instanceof SendQuickReplyUseCase$invoke$1) {
            sendQuickReplyUseCase$invoke$1 = (SendQuickReplyUseCase$invoke$1) continuation;
            if ((sendQuickReplyUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                sendQuickReplyUseCase$invoke$1.label -= Integer.MIN_VALUE;
                SendQuickReplyUseCase$invoke$1 sendQuickReplyUseCase$invoke$12 = sendQuickReplyUseCase$invoke$1;
                Object obj = sendQuickReplyUseCase$invoke$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendQuickReplyUseCase$invoke$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    uuid = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    List<Block.Builder> blocksForText = new BlockFactory(new TextSplittingStrategy()).getBlocksForText(StringsKt.trim((CharSequence) replyOption.getText()).toString());
                    SendMessageUseCase.Companion companion = SendMessageUseCase.INSTANCE;
                    Intrinsics.checkNotNull(blocksForText);
                    companion.addBlocksToPendingMessages(mutableStateFlow, blocksForText, uuid, this.userIdentity);
                    Conversation conversation = mutableStateFlow.getValue().getConversation();
                    String id = !part.isInitialMessage() ? part.getId() : "";
                    if (conversation != null) {
                        ConversationRepository conversationRepository = this.conversationRepository;
                        String uuid2 = replyOption.getUuid();
                        String id2 = conversation.getId();
                        Intrinsics.checkNotNull(id);
                        sendQuickReplyUseCase$invoke$12.L$0 = this;
                        sendQuickReplyUseCase$invoke$12.L$1 = mutableStateFlow;
                        sendQuickReplyUseCase$invoke$12.L$2 = uuid;
                        sendQuickReplyUseCase$invoke$12.label = 1;
                        obj = conversationRepository.addQuickReplyToConversation(uuid2, id2, id, uuid, sendQuickReplyUseCase$invoke$12);
                        if (obj != coroutine_suspended) {
                            sendQuickReplyUseCase = this;
                        }
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                String str = (String) sendQuickReplyUseCase$invoke$12.L$2;
                MutableStateFlow<ConversationClientState> mutableStateFlow2 = (MutableStateFlow) sendQuickReplyUseCase$invoke$12.L$1;
                sendQuickReplyUseCase = (SendQuickReplyUseCase) sendQuickReplyUseCase$invoke$12.L$0;
                ResultKt.throwOnFailure(obj);
                uuid = str;
                mutableStateFlow = mutableStateFlow2;
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                    sendQuickReplyUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
                    SendMessageUseCase.INSTANCE.updateFailedPendingMessages(mutableStateFlow, uuid);
                    return Unit.INSTANCE;
                }
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                sendQuickReplyUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_SENT);
                RefreshConversationUseCase refreshConversationUseCase = sendQuickReplyUseCase.refreshConversationUseCase;
                GetConversationReason getConversationReason = GetConversationReason.NEW_COMMENT;
                sendQuickReplyUseCase$invoke$12.L$0 = null;
                sendQuickReplyUseCase$invoke$12.L$1 = null;
                sendQuickReplyUseCase$invoke$12.L$2 = null;
                sendQuickReplyUseCase$invoke$12.label = 2;
            }
        }
        sendQuickReplyUseCase$invoke$1 = new SendQuickReplyUseCase$invoke$1(this, continuation);
        SendQuickReplyUseCase$invoke$1 sendQuickReplyUseCase$invoke$122 = sendQuickReplyUseCase$invoke$1;
        Object obj2 = sendQuickReplyUseCase$invoke$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendQuickReplyUseCase$invoke$122.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (!(networkResponse instanceof NetworkResponse.ClientError)) {
        }
        sendQuickReplyUseCase.soundEffectsUseCase.invoke$intercom_sdk_base_release(Action.MESSAGE_FAILED);
        SendMessageUseCase.INSTANCE.updateFailedPendingMessages(mutableStateFlow, uuid);
        return Unit.INSTANCE;
    }
}
